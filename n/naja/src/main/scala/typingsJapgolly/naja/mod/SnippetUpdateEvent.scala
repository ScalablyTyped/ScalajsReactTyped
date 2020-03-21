package typingsJapgolly.naja.mod

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SnippetUpdateEvent extends Event_ {
  val content: String = js.native
  val snippet: HTMLElement = js.native
}

