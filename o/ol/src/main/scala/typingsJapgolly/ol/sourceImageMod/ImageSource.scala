package typingsJapgolly.ol.sourceImageMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.extentMod.Extent
import typingsJapgolly.ol.olStrings.imageloadend
import typingsJapgolly.ol.olStrings.imageloaderror
import typingsJapgolly.ol.olStrings.imageloadstart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImageSource
  extends typingsJapgolly.ol.sourceSourceMod.default {
  /* protected */ def findNearestResolution(resolution: Double): Double = js.native
  def getImage(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsJapgolly.ol.projectionMod.default
  ): typingsJapgolly.ol.imageBaseMod.default = js.native
  /* protected */ def getImageInternal(
    extent: Extent,
    resolution: Double,
    pixelRatio: Double,
    projection: typingsJapgolly.ol.projectionMod.default
  ): typingsJapgolly.ol.imageBaseMod.default = js.native
  /* protected */ def handleImageChange(event: typingsJapgolly.ol.eventMod.default): Unit = js.native
  @JSName("on")
  def on_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): EventsKey = js.native
  @JSName("un")
  def un_imageloadend(`type`: imageloadend, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloaderror(`type`: imageloaderror, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_imageloadstart(`type`: imageloadstart, listener: js.Function1[/* evt */ ImageSourceEvent, Unit]): Unit = js.native
}

