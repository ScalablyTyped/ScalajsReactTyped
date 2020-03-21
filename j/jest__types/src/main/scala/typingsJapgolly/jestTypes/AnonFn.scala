package typingsJapgolly.jestTypes

import typingsJapgolly.jestTypes.circusMod.DoneFn
import typingsJapgolly.jestTypes.circusMod.Event
import typingsJapgolly.jestTypes.circusMod.HookFn
import typingsJapgolly.jestTypes.circusMod.HookType
import typingsJapgolly.jestTypes.jestTypesStrings.add_hook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonFn extends Event {
  var asyncError: js.Error = js.native
  @JSName("fn")
  var fn_Original: HookFn = js.native
  var hookType: HookType = js.native
  var name: add_hook = js.native
  var timeout: js.UndefOr[Double] = js.native
  def fn(): js.UndefOr[js.Promise[_] | Null] = js.native
  def fn(done: DoneFn): js.UndefOr[js.Promise[_] | Null] = js.native
}

