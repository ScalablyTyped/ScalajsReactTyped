package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteExposed
import typingsJapgolly.reactInstantsearchCore.mod.AutocompleteProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectAutoComplete")
@js.native
object connectAutoComplete extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[AutocompleteProvided[TDoc]]): ComponentClassP[AutocompleteExposed with js.Object] = js.native
  def apply[Props /* <: AutocompleteProvided[TDoc] */, TDoc](Composed: ComponentType[Props]): ComponentClassP[
    (Omit[Props, AutocompleteProvided[TDoc]]) with AutocompleteExposed with js.Object
  ] = js.native
}

