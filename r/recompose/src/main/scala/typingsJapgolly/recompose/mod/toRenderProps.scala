package typingsJapgolly.recompose.mod

import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.recompose.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "toRenderProps")
@js.native
object toRenderProps extends js.Object {
  def apply[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with AnonChildren[TInner]] = js.native
}

