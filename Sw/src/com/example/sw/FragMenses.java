package com.example.sw;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class FragMenses extends Fragment {

	ListView list;
	AdapterQA mAdapter;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view = inflater.inflate(R.layout.frag_menses, container, false);

		list = (ListView)view.findViewById(R.id.listMenses);
		mAdapter = new AdapterQA(getActivity());
		
		initData();
		list.setAdapter(mAdapter);
		return view;
	}
	
	
	public void initData()
	{
		DataQA q1 = new DataQA();
		q1.Q = "������ �����Դϱ�?";
		q1.A = "���ӱ� ������ �ڱó����� �ֱ������� �к�� ȣ���� ���Ͽ� �����Ͽ� ����� ������ �غ��ϴµ� �ӽ��� ���� ������ �ڱó����� ������ Ż���Ǹ� �� ������ �����̶�� �Ѵ�.";
		mAdapter.add(q1);
		
		DataQA q2 = new DataQA();
		q2.Q = "���� �ֱ�� ��� �˴ϱ�?";
		q2.A = "�������� ������ ����� ������ ����. ����: ���� �ֱ�� �����ϴ� �� ���� ������ ������ ������ ��������, 21~35��(��� 28��)�� ��� �����̴�. "
				+ "�Ⱓ: ������ ���� 3~5�ϰ� ���ӵǸ� 2~7�ϱ��� �����̴�. ��: ��� 35���̸� 10~80������ �����̴�.";
		mAdapter.add(q2);
		
		DataQA q3 = new DataQA();
		q3.Q = "���ӱ�� �����Դϱ�?";
		q3.A = "�ʰ� �� �������� �Ⱓ ��ü�� ���ӱ��̴�. ���� �ֱⰡ 28���� ��� ���� ���� 14�� ���ķ� ����� �Ǹ� �� ���� �ӽ�Ȯ���� ���� ���� �ñ��̴�.";
		mAdapter.add(q3);
		
		DataQA q4 = new DataQA();
		q4.Q = "�����뿡 ���� �˷��ּ���";
		q4.A = "������ �������� �ڱñ����� �������� ���� �ڱó����� ������ �߻��ϸ� ������ ������ ��Ÿ���� ���ð� �� Ȥ�� ������ ���۵Ǿ� 2~3�ϰ� ���� �� �� �ִ�. "
				+ "�ڱ��� ���¥�� ���� ������ ������ ������ ������ ����, ����� ����, ������, �޽�����, ����, ���� ���� ���� ���� ��Ÿ���� ���� �����"
				+ " ������ ������ ��Ÿ����. �������� ���Ѱ�� �ǽſ� �̸��� ��쵵 �ִ�. �ҿ��������� ������ ��ȭ�� �� ������ ������ �ִ� �Ⱓ���� �Ͻ������� "
				+ "����ϸ� �񸶾༺ �������̹Ƿ� ���ۿ��� ���� ������ �ʿ䰡 ����.  //  ������ �������� ���� ���� 1~2�� ������ ���۵Ǿ� ���� ������ ���� �Ŀ���"
				+ " ���ϰ� ���� �� �� �ִ�. ����, ���� ���� �ſ� �پ������� �밳 ��ݰ� ���� �̻� ¡�Ŀ� ���� �ڱð�ΰ� �����ų�, �ڱó��� Ȥ�� ����ų�, "
				+ "�̹����� ���� �������� �ڱñ����� ���ϰ� �����ϸ鼭 ���ν�Ÿ�۶����� ������ ������ ���� ������ �ȴ�. "
				+ "������ ������� �޸� �������� ������������ ������ �������� �ʴ´�. "
				+ "�������� ������ �پ��ϰ� ������ ���� ���̵� ���ϱ� ������ ���� �������� ���ӵǴ� ��� ����ΰ� ������ �޾ƺ��� ���� ����.";
		mAdapter.add(q4);
		
		DataQA q5 = new DataQA();
		q5.Q = "������..?";
		q5.A = "�������� �������� Ž��&�е尡 �ִ�. �ֱٿ��� �Ż����� �� �پ��� ������ ��������� ���ǰ� �ִ�. "
				+ "�е�� �����翡 ���� �˸��� ũ���� �����븦 �ӿʿ� �����Ͽ� �������� �����ϴ� ���̰� Ž���� ��� �������� �����Ͽ� �������� �����Ѵ�. "
				+ "������� ���� �����־�� ���������� �����Ͽ� �պ����� ������ �� �ִ�. Ž���� ��� ����, ������, ���� ���� ������ �߻���Ű�� ���� ��ũ"
				+ " ���ı��� ����ų �� �ִ�. ���� ��� ����� �̸� ���� �ִ�.";
		mAdapter.add(q5);
		
		DataQA q6 = new DataQA();
		q6.Q = "������� �����Կ� ���� ũ�⸦ �����Ѵ�.?";
		q6.A = "������� �������� ��, Ȥ�� ������ �ʿ信 ���� �����˴ϴ�.";
		mAdapter.add(q6);
		
		DataQA q7 = new DataQA();
		q7.Q = "������ �Ϸ縸 �Ѵ�?";
		q7.A = "������ 2~7������ ���ӵǸ� �Ϸ� ���� ����ϰ� ������ ���� ���� ���ٰ� ���� �����մϴ�.";
		mAdapter.add(q7);
		
		DataQA q8 = new DataQA();
		q8.Q = "������ ���� �� �ִ�?";
		q8.A = "������ �ڱó����� ������ Ż���Ǹ� �ǰ� ������ ���̹Ƿ� ������ ������� ������ �� �����ϴ�.";
		mAdapter.add(q8);
	}
}