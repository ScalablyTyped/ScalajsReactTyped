package typingsJapgolly.recompose

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://github.com/acdlite/recompose/blob/master/docs/API.md#setproptypes
@JSImport("recompose/setPropTypes", JSImport.Namespace)
@js.native
object setPropTypesMod extends js.Object {
  def default[P](propTypes: ValidationMap[P]): js.Function1[/* component */ ComponentType[P], ComponentType[P]] = js.native
}

