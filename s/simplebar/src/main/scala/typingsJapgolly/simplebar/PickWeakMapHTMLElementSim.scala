package typingsJapgolly.simplebar

import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.simplebar.mod.SimpleBar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Pick<std.WeakMap<std.HTMLElement, simplebar.simplebar.SimpleBar>, 'get' | 'has'> */
@js.native
trait PickWeakMapHTMLElementSim extends js.Object {
  @JSName("get")
  var get_Original: js.Function1[/* key */ HTMLElement, js.UndefOr[SimpleBar]] = js.native
  @JSName("has")
  var has_Original: js.Function1[/* key */ HTMLElement, Boolean] = js.native
  def get(key: HTMLElement): js.UndefOr[SimpleBar] = js.native
  def has(key: HTMLElement): Boolean = js.native
}

