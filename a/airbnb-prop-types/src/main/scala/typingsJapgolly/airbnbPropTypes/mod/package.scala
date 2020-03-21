package typingsJapgolly.airbnbPropTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ReactFunctionComponentLike = js.Function1[/* repeated */ js.Any, typingsJapgolly.propTypes.mod.ReactNodeLike]
  type ReactLegacyRefLike[T] = (js.Function1[/* instance */ T | scala.Null, scala.Unit]) | typingsJapgolly.airbnbPropTypes.mod.ReactRefLike[T]
  type ReactTypeLike = java.lang.String | typingsJapgolly.airbnbPropTypes.mod.ReactClassComponentLike | typingsJapgolly.airbnbPropTypes.mod.ReactFunctionComponentLike
}
