package typingsJapgolly.ol.geolocationMod

import org.scalajs.dom.raw.PositionOptions
import typingsJapgolly.ol.coordinateMod.Coordinate
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColonaccuracy
import typingsJapgolly.ol.olStrings.changeColonaccuracyGeometry
import typingsJapgolly.ol.olStrings.changeColonaltitude
import typingsJapgolly.ol.olStrings.changeColonaltitudeAccuracy
import typingsJapgolly.ol.olStrings.changeColonheading
import typingsJapgolly.ol.olStrings.changeColonposition
import typingsJapgolly.ol.olStrings.changeColonprojection
import typingsJapgolly.ol.olStrings.changeColonspeed
import typingsJapgolly.ol.olStrings.changeColontracking
import typingsJapgolly.ol.olStrings.changeColontrackingOptions
import typingsJapgolly.ol.projMod.ProjectionLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geolocation
  extends typingsJapgolly.ol.objectMod.default {
  def getAccuracy(): Double = js.native
  def getAccuracyGeometry(): typingsJapgolly.ol.polygonMod.default = js.native
  def getAltitude(): Double = js.native
  def getAltitudeAccuracy(): Double = js.native
  def getHeading(): Double = js.native
  def getPosition(): Coordinate = js.native
  def getProjection(): typingsJapgolly.ol.projectionMod.default = js.native
  def getSpeed(): Double = js.native
  def getTracking(): Boolean = js.native
  def getTrackingOptions(): PositionOptions = js.native
  @JSName("on")
  def on_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setProjection(projection: ProjectionLike): Unit = js.native
  def setTracking(tracking: Boolean): Unit = js.native
  def setTrackingOptions(options: PositionOptions): Unit = js.native
  @JSName("un")
  def un_changeaccuracy(`type`: changeColonaccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeaccuracyGeometry(`type`: changeColonaccuracyGeometry, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitude(`type`: changeColonaltitude, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changealtitudeAccuracy(`type`: changeColonaltitudeAccuracy, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeheading(`type`: changeColonheading, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeposition(`type`: changeColonposition, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changespeed(`type`: changeColonspeed, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetracking(`type`: changeColontracking, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changetrackingOptions(`type`: changeColontrackingOptions, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

