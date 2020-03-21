package typingsJapgolly.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jimpCore.etcMod.ListenableName
import typingsJapgolly.jimpCore.etcMod.ListenerData
import typingsJapgolly.jimpCore.jimpCoreStrings.`before-change`
import typingsJapgolly.jimpCore.jimpCoreStrings.changed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey[T /* <: ListenableName */]
  extends /* key */ StringDictionary[js.Any]
     with ListenerData[T] {
  var eventName: `before-change` | changed
  var methodName: T
}

object AnonDictkey {
  @scala.inline
  def apply[T /* <: ListenableName */](
    eventName: `before-change` | changed,
    methodName: T,
    StringDictionary: /* key */ StringDictionary[js.Any] = null
  ): AnonDictkey[T] = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], methodName = methodName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey[T]]
  }
}

