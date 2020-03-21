package typingsJapgolly.ol.modifyMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.modifyend
import typingsJapgolly.ol.olStrings.modifystart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Modify
  extends typingsJapgolly.ol.pointerMod.default {
  def getOverlay(): typingsJapgolly.ol.vectorMod.default = js.native
  @JSName("on")
  def on_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): EventsKey = js.native
  def removePoint(): Boolean = js.native
  @JSName("un")
  def un_modifyend(`type`: modifyend, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_modifystart(`type`: modifystart, listener: js.Function1[/* evt */ ModifyEvent, Unit]): Unit = js.native
}

