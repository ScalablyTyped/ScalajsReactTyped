package typingsJapgolly.recompose

import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.recompose.mod.InferableComponentEnhancerWithProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#torenderprops
@JSImport("recompose/toRenderProps", JSImport.Namespace)
@js.native
object toRenderPropsMod extends js.Object {
  def default[TInner, TOutter](hoc: InferableComponentEnhancerWithProps[TInner with TOutter, TOutter]): StatelessComponent[TOutter with AnonChildren[TInner]] = js.native
}

