package typingsJapgolly.reactSelect.srcAsyncMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/src/Async", "makeAsyncSelect")
@js.native
object makeAsyncSelect extends js.Object {
  def apply[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClassP[AsyncComponentProps[T] with js.Object] = js.native
}

