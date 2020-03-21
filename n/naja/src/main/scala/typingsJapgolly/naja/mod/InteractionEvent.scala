package typingsJapgolly.naja.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InteractionEvent extends Event_ {
  val element: HTMLElement = js.native
  val options: RequestOptions = js.native
  val originalEvent: js.UndefOr[SnippetUpdateEvent] = js.native
}

