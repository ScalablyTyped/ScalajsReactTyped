package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialSearchBoxProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxExposed
import typingsJapgolly.reactInstantsearchCore.mod.SearchBoxProvided
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectSearchBox")
@js.native
object connectSearchBox extends js.Object {
  def apply(stateless: StatelessComponent[SearchBoxProvided]): ComponentClassP[SearchBoxExposed with js.Object] = js.native
  def apply[TProps /* <: PartialSearchBoxProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, SearchBoxProvided]) with SearchBoxExposed with js.Object] = js.native
}

