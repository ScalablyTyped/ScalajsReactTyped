package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialStateResultsProvid
import typingsJapgolly.reactInstantsearchCore.mod.BasicDoc
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.reactInstantsearchCore.mod.StateResultsProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectStateResults")
@js.native
object connectStateResults extends js.Object {
  def apply(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ComponentClassP[js.Object] = js.native
  def apply[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
}

