package typingsJapgolly.ol.controlControlMod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ol.eventsMod.EventsKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Control
  extends typingsJapgolly.ol.objectMod.default {
  var element: HTMLElement = js.native
  var listenerKeys: js.Array[EventsKey] = js.native
  def getMap(): typingsJapgolly.ol.pluggableMapMod.default = js.native
  def setMap(map: typingsJapgolly.ol.pluggableMapMod.default): Unit = js.native
  def setTarget(target: String): Unit = js.native
  def setTarget(target: typingsJapgolly.std.HTMLElement): Unit = js.native
}

