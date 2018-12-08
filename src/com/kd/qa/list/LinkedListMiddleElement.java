package com.kd.qa.list;

import com.kd.qa.list.LinkedList.Node;

//  Java program to find middle element of linked list in one pass.

public class LinkedListMiddleElement {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.add(new Node("aa"));
		list.add(new Node("bb"));
		list.add(new Node("zz"));
		list.add(new Node("yy"));
		list.add(new Node("cc"));
		list.add(new Node("zz1"));
		list.add(new Node("yy2"));
		list.add(new Node("cc3"));

		Node head = list.head();
		Node temp = head;
		while (head.next() != null) {
			if (head.next() != null) {
				head = head.next();
			} else
				break;
			if (temp.next() != null)
				temp = temp.next().next();
			else
				break;
		}

		System.out.println("Middle element : " + head.data());

	}

}
