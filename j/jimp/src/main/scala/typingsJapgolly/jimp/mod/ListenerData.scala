package typingsJapgolly.jimp.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jimp.jimpStrings.`before-change`
import typingsJapgolly.jimp.jimpStrings.changed
import typingsJapgolly.jimp.jimpStrings.clone
import typingsJapgolly.jimp.jimpStrings.constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.jimp.AnonEventName[T]
  - typingsJapgolly.jimp.AnonDictkey[T]
*/
trait ListenerData[T /* <: ListenableName */] extends js.Object

object ListenerData {
  @scala.inline
  def AnonEventName[T /* <: ListenableName */](eventName: T, methodName: clone | ChangeName | constructor): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListenerData[T]]
  }
  @scala.inline
  def AnonDictkey[T /* <: ListenableName */](
    eventName: `before-change` | changed,
    methodName: T,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): ListenerData[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[ListenerData[T]]
  }
}

