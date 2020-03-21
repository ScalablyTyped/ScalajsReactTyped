package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialCurrentRefinements
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsExposed
import typingsJapgolly.reactInstantsearchCore.mod.CurrentRefinementsProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectCurrentRefinements")
@js.native
object connectCurrentRefinements extends js.Object {
  def apply(stateless: StatelessComponent[CurrentRefinementsProvided]): ComponentClassP[CurrentRefinementsExposed with js.Object] = js.native
  def apply[TProps /* <: PartialCurrentRefinements */](Composed: ComponentType[TProps]): ComponentClassP[
    (Omit[TProps, CurrentRefinementsProvided]) with CurrentRefinementsExposed with js.Object
  ] = js.native
}

