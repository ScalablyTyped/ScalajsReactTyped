package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialNumericMenuProvide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ComponentClassP[NumericMenuExposed with js.Object] = js.native
  def apply[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed with js.Object] = js.native
}

