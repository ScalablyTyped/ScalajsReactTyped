package typingsJapgolly.ol.dragAndDropMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.addfeatures
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DragAndDrop
  extends typingsJapgolly.ol.interactionInteractionMod.default {
  @JSName("on")
  def on_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_addfeatures(`type`: addfeatures, listener: js.Function1[/* evt */ DragAndDropEvent, Unit]): Unit = js.native
}

