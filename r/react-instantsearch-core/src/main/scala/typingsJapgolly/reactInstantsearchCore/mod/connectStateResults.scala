package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialStateResultsProvid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectStateResults")
@js.native
object connectStateResults extends js.Object {
  def apply(stateless: StatelessComponent[StateResultsProvided[BasicDoc]]): ComponentClassP[js.Object] = js.native
  def apply[TProps /* <: PartialStateResultsProvid */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, StateResultsProvided[BasicDoc]]) with js.Object] = js.native
}

