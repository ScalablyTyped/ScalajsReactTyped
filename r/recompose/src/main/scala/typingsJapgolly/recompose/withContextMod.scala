package typingsJapgolly.recompose

import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.recompose.mod.InferableComponentEnhancer
import typingsJapgolly.recompose.mod.mapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#withcontext
@JSImport("recompose/withContext", JSImport.Namespace)
@js.native
object withContextMod extends js.Object {
  def default[TContext, TProps](childContextTypes: ValidationMap[TContext], getChildContext: mapper[TProps, _]): InferableComponentEnhancer[js.Object] = js.native
}

