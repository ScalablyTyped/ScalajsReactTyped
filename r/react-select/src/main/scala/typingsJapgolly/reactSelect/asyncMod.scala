package typingsJapgolly.reactSelect

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.srcAsyncMod.AsyncComponentProps
import typingsJapgolly.reactSelect.srcAsyncMod.Props
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  @js.native
  class Async[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcAsyncMod.Async[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcAsyncMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeAsyncSelect[T /* <: ComponentType[_] */](SelectComponent: T): ComponentClassP[AsyncComponentProps[T] with js.Object] = js.native
  /* static members */
  @js.native
  object Async extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

