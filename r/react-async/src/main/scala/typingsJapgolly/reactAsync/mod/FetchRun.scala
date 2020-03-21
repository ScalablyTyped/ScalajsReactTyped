package typingsJapgolly.reactAsync.mod

import typingsJapgolly.react.mod.SyntheticEvent
import typingsJapgolly.reactAsync.PartialRequestInit
import typingsJapgolly.std.Element
import typingsJapgolly.std.Event_
import typingsJapgolly.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchRun[T] extends js.Object {
  def run(): Unit = js.native
  def run(ignoredEvent: SyntheticEvent[Element, Event_]): Unit = js.native
  def run(ignoredEvent: Event_): Unit = js.native
  def run(overrideInit: js.Function1[/* init */ RequestInit, RequestInit]): Unit = js.native
  def run(overrideInit: PartialRequestInit): Unit = js.native
}

