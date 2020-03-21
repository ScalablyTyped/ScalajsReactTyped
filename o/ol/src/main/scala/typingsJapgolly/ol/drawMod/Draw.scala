package typingsJapgolly.ol.drawMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.drawend
import typingsJapgolly.ol.olStrings.drawstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Draw
  extends typingsJapgolly.ol.pointerMod.default {
  def extend(feature: typingsJapgolly.ol.olFeatureMod.default[typingsJapgolly.ol.lineStringMod.default]): Unit = js.native
  def finishDrawing(): Unit = js.native
  def getOverlay(): typingsJapgolly.ol.vectorMod.default = js.native
  @JSName("on")
  def on_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): EventsKey = js.native
  def removeLastPoint(): Unit = js.native
  @JSName("un")
  def un_drawend(`type`: drawend, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_drawstart(`type`: drawstart, listener: js.Function1[/* evt */ DrawEvent, Unit]): Unit = js.native
}

