package typingsJapgolly.ol.rasterMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.afteroperations
import typingsJapgolly.ol.olStrings.beforeoperations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterSource
  extends typingsJapgolly.ol.sourceImageMod.default {
  @JSName("on")
  def on_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): EventsKey = js.native
  def setOperation(operation: Operation): Unit = js.native
  def setOperation(operation: Operation, opt_lib: js.Any): Unit = js.native
  @JSName("un")
  def un_afteroperations(`type`: afteroperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_beforeoperations(`type`: beforeoperations, listener: js.Function1[/* evt */ RasterSourceEvent, Unit]): Unit = js.native
}

