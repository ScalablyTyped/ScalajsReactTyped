package typingsJapgolly.ol.translateMod

import typingsJapgolly.ol.eventsMod.EventsKey
import typingsJapgolly.ol.olStrings.translateend
import typingsJapgolly.ol.olStrings.translatestart
import typingsJapgolly.ol.olStrings.translating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Translate
  extends typingsJapgolly.ol.pointerMod.default {
  def getHitTolerance(): Double = js.native
  @JSName("on")
  def on_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("on")
  def on_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  @JSName("once")
  def once_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): EventsKey = js.native
  def setHitTolerance(hitTolerance: Double): Unit = js.native
  @JSName("un")
  def un_translateend(`type`: translateend, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_translatestart(`type`: translatestart, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
  @JSName("un")
  def un_translating(`type`: translating, listener: js.Function1[/* evt */ TranslateEvent, Unit]): Unit = js.native
}

