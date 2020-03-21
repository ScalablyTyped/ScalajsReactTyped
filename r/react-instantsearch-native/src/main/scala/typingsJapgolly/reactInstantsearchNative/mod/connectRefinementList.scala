package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialRefinementListProv
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListExposed
import typingsJapgolly.reactInstantsearchCore.mod.RefinementListProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectRefinementList")
@js.native
object connectRefinementList extends js.Object {
  def apply(stateless: StatelessComponent[RefinementListProvided]): ComponentClassP[RefinementListExposed with js.Object] = js.native
  def apply[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, RefinementListProvided]) with RefinementListExposed with js.Object] = js.native
}

