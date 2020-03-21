package typingsJapgolly.ol.mousePositionMod

import typingsJapgolly.ol.coordinateMod.CoordinateFormat
import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.objectMod.ObjectEvent
import typingsJapgolly.ol.olStrings.changeColoncoordinateFormat
import typingsJapgolly.ol.olStrings.changeColonprojection
import typingsJapgolly.ol.projMod.ProjectionLike
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MousePosition
  extends typingsJapgolly.ol.controlControlMod.default {
  def getCoordinateFormat(): CoordinateFormat = js.native
  def getProjection(): typingsJapgolly.ol.projectionMod.default = js.native
  /* protected */ def handleMouseMove(event: Event_): Unit = js.native
  /* protected */ def handleMouseOut(event: Event_): Unit = js.native
  @JSName("on")
  def on_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): EventsKey = js.native
  def setCoordinateFormat(format: CoordinateFormat): Unit = js.native
  def setProjection(projection: ProjectionLike): Unit = js.native
  @JSName("un")
  def un_changecoordinateFormat(`type`: changeColoncoordinateFormat, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_changeprojection(`type`: changeColonprojection, listener: js.Function1[/* evt */ ObjectEvent, Unit]): Unit = js.native
}

