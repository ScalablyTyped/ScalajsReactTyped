package typingsJapgolly.sane

import typingsJapgolly.sane.mod.AllEventType
import typingsJapgolly.sane.mod.EventType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object saneStrings {
  @js.native
  sealed trait add
    extends AllEventType
       with EventType
  
  @js.native
  sealed trait all extends EventType
  
  @js.native
  sealed trait change
    extends AllEventType
       with EventType
  
  @js.native
  sealed trait delete
    extends AllEventType
       with EventType
  
  @js.native
  sealed trait error extends EventType
  
  @js.native
  sealed trait ready extends EventType
  
  @scala.inline
  def add: add = "add".asInstanceOf[add]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
}

