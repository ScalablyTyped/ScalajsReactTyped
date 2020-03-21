package typingsJapgolly.reactLifecyclesCompat

import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-lifecycles-compat", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def polyfill[T /* <: ComponentType[_] */](Comp: T): T with typingsJapgolly.reactLifecyclesCompat.reactLifecyclesCompatStrings.polyfill = js.native
}

