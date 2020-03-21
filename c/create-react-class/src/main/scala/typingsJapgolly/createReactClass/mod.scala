package typingsJapgolly.createReactClass

import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentSpec
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("create-react-class", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply[P, S](spec: ComponentSpec[P, S]): ClassicComponentClass[P] = js.native
}

