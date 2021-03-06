package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialNumericMenuProvide
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.NumericMenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectNumericMenu")
@js.native
object connectNumericMenu extends js.Object {
  def apply(stateless: StatelessComponent[NumericMenuProvided]): ComponentClassP[NumericMenuExposed with js.Object] = js.native
  def apply[TProps /* <: PartialNumericMenuProvide */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, NumericMenuProvided]) with NumericMenuExposed with js.Object] = js.native
}

