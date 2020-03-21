package typingsJapgolly.ol.vectorTileMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonpreload
import typingsJapgolly.ol.olStrings.changeColonuseInterimTilesOnError
import typingsJapgolly.ol.vectorTileRenderTypeMod.VectorTileRenderType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorTileLayer
  extends typingsJapgolly.ol.baseVectorMod.default[typingsJapgolly.ol.sourceVectorTileMod.default] {
  def getPreload(): Double = js.native
  def getRenderMode(): VectorTileRenderType = js.native
  def getUseInterimTilesOnError(): Boolean = js.native
  @JSName("on")
  def on_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setPreload(preload: Double): Unit = js.native
  def setUseInterimTilesOnError(useInterimTilesOnError: Boolean): Unit = js.native
  @JSName("un")
  def un_changepreload(`type`: changeColonpreload, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeuseInterimTilesOnError(`type`: changeColonuseInterimTilesOnError, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

