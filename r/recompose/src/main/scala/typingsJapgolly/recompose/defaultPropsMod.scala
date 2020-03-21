package typingsJapgolly.recompose

import typingsJapgolly.recompose.mod.DefaultingInferableComponentEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#defaultprops
@JSImport("recompose/defaultProps", JSImport.Namespace)
@js.native
object defaultPropsMod extends js.Object {
  def default[T](props: T): DefaultingInferableComponentEnhancer[T] = js.native
}

