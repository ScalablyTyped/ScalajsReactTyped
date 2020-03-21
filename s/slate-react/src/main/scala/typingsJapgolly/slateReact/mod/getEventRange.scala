package typingsJapgolly.slateReact.mod

import typingsJapgolly.react.mod.SyntheticEvent
import typingsJapgolly.slate.mod.Range
import typingsJapgolly.std.Element
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "getEventRange")
@js.native
object getEventRange extends js.Object {
  def apply(event: SyntheticEvent[Element, Event_], editor: typingsJapgolly.slate.mod.Editor): Range | Null = js.native
  def apply(event: Event_, editor: typingsJapgolly.slate.mod.Editor): Range | Null = js.native
}

