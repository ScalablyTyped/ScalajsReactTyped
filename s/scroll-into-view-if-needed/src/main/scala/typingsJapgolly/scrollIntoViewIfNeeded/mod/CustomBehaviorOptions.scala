package typingsJapgolly.scrollIntoViewIfNeeded.mod

import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.CustomScrollAction
import typingsJapgolly.scrollIntoViewIfNeeded.typesMod.CustomScrollBehaviorCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomBehaviorOptions[T]
  extends typingsJapgolly.scrollIntoViewIfNeeded.typesMod.Options {
  @JSName("behavior")
  var behavior_Original: CustomScrollBehaviorCallback[T] = js.native
  def behavior(actions: js.Array[CustomScrollAction]): T = js.native
}

