package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.event_data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEventData[T] extends js.Object {
  /**
    * The identifier of the event
    */
  val __identifier__ : String
  /**
    * The type of the object
    */
  val __type__ : event_data
  var data: T
}

object IEventData {
  @scala.inline
  def apply[T](__identifier__ : String, __type__ : event_data, data: T): IEventData[T] = {
    val __obj = js.Dynamic.literal(__identifier__ = __identifier__.asInstanceOf[js.Any], __type__ = __type__.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEventData[T]]
  }
}

