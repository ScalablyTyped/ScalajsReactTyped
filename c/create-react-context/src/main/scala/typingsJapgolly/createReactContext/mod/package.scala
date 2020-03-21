package typingsJapgolly.createReactContext

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type RenderFn[T] = js.Function1[/* value */ T, japgolly.scalajs.react.raw.React.Node]
}
