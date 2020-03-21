package typingsJapgolly.ol.interactionExtentMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.extentchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Extent
  extends typingsJapgolly.ol.pointerMod.default {
  def getExtent(): typingsJapgolly.ol.extentMod.Extent = js.native
  def getExtentInternal(): typingsJapgolly.ol.extentMod.Extent = js.native
  @JSName("on")
  def on_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): EventsKey = js.native
  def setExtent(extent: typingsJapgolly.ol.extentMod.Extent): Unit = js.native
  @JSName("un")
  def un_extentchanged(`type`: extentchanged, listener: js.Function1[/* evt */ ExtentEvent, Unit]): Unit = js.native
}

