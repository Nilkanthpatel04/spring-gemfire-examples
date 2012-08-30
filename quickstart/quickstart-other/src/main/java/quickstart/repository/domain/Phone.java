/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package quickstart.repository.domain;

/**
 * @author David Turanski
 * 
 */
public class Phone {
	public static enum Type {
		MOBILE, HOME, WORK, OTHER
	};

	public Phone(String number, Type type) {
		this.number = number;
		this.type = type;
	}

	public Phone(String number) {
		this(number, Type.OTHER);
	}

	public Phone() {

	}

	private String number;

	private Type type;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

}
