package typingsJapgolly.libraCore.eventsPbMod.EventsList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsObject extends js.Object {
  var eventsList: js.Array[typingsJapgolly.libraCore.eventsPbMod.Event.AsObject]
}

object AsObject {
  @scala.inline
  def apply(eventsList: js.Array[typingsJapgolly.libraCore.eventsPbMod.Event.AsObject]): AsObject = {
    val __obj = js.Dynamic.literal(eventsList = eventsList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AsObject]
  }
}

