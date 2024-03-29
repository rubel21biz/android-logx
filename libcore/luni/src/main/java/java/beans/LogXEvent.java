/*  Copyright 2011 LogX Project.
*
*   Licensed under the Apache License, Version 2.0 (the "License");
*   you may not use this file except in compliance with the License.
*   You may obtain a copy of the License at
*
*       http://www.apache.org/licenses/LICENSE-2.0
*
*   Unless required by applicable law or agreed to in writing, software
*   distributed under the License is distributed on an "AS IS" BASIS,
*   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
*   See the License for the specific language governing permissions and
*   limitations under the License.
*/

package java.beans;

import java.lang.String;
import java.util.EventObject;

/**
* A generic LogX Event. Stores the source object that triggered the
* event and the name of the event (eventTag). The toString method is
* what is actually printed out to the android.util.Log stream.
*/
public class LogXEvent extends EventObject
{
	private String eventTag;
	
	public LogXEvent(String eventTag, Object source)
	{
		super(source);
		this.eventTag = eventTag;
	}

	@Override public String toString()
	{
		return "[" + eventTag + ", " +
				source.toString() +", "+
				"####" + "]"; //#### is a place holder to enter pid and package info. 	 
	}

}
