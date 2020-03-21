package typingsJapgolly.uifabricFoundation.libIslotsMod

import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISlot[TProps] extends js.Object {
  var isSlot: js.UndefOr[Boolean] = js.native
  def apply(): ReturnType[FunctionComponent[js.Object]] = js.native
  def apply(componentProps: PropsWithChildren[TProps]): ReturnType[FunctionComponent[js.Object]] = js.native
}

