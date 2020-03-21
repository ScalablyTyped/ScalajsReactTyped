package typingsJapgolly.cavy.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cavy", "wrap")
@js.native
object wrap extends js.Object {
  def apply[P /* <: js.Object */](WrappedComponent: js.Object): ComponentClassP[P with js.Object] = js.native
  def apply[P /* <: js.Object */](WrappedComponent: FunctionComponent[P]): ComponentClassP[P with js.Object] = js.native
}

