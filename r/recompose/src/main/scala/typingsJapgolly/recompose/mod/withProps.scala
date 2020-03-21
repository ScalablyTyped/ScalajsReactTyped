package typingsJapgolly.recompose.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("recompose", "withProps")
@js.native
object withProps extends js.Object {
  def apply[TInner, TOutter](createProps: TInner): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
  def apply[TInner, TOutter](createProps: mapper[TOutter, TInner]): InferableComponentEnhancerWithProps[TInner with TOutter, TOutter] = js.native
}

