package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialRefinementListProv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectRefinementList")
@js.native
object connectRefinementList extends js.Object {
  def apply(stateless: StatelessComponent[RefinementListProvided]): ComponentClassP[RefinementListExposed with js.Object] = js.native
  def apply[TProps /* <: PartialRefinementListProv */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, RefinementListProvided]) with RefinementListExposed with js.Object] = js.native
}

