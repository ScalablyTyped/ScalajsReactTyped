package typingsJapgolly.reactSelect

import typingsJapgolly.reactSelect.srcAsyncCreatableMod.Props
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/async-creatable", JSImport.Namespace)
@js.native
object asyncCreatableMod extends js.Object {
  @js.native
  class AsyncCreatable[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcAsyncCreatableMod.AsyncCreatable[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcAsyncCreatableMod.default[OptionType]
  
  /* static members */
  @js.native
  object AsyncCreatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

