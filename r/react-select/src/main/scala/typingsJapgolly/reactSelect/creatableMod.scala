package typingsJapgolly.reactSelect

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactSelect.srcCreatableMod.Props
import typingsJapgolly.reactSelect.typesMod.OptionTypeBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-select/creatable", JSImport.Namespace)
@js.native
object creatableMod extends js.Object {
  @js.native
  class Creatable[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcCreatableMod.Creatable[OptionType]
  
  @js.native
  class default[OptionType /* <: OptionTypeBase */] ()
    extends typingsJapgolly.reactSelect.srcCreatableMod.default[OptionType]
  
  val defaultProps: Props[js.Any] = js.native
  def makeCreatableSelect(SelectComponent: ComponentType[_]): typingsJapgolly.reactSelect.srcCreatableMod.Creatable[_] = js.native
  /* static members */
  @js.native
  object Creatable extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: Props[_] = js.native
  }
  
}

