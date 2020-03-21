package typingsJapgolly.reactInstantsearchDom.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.PartialMenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.MenuExposed
import typingsJapgolly.reactInstantsearchCore.mod.MenuProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-dom", "connectMenu")
@js.native
object connectMenu extends js.Object {
  def apply(stateless: StatelessComponent[MenuProvided]): ComponentClassP[MenuExposed with js.Object] = js.native
  def apply[TProps /* <: PartialMenuProvided */](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, MenuProvided]) with MenuExposed with js.Object] = js.native
}

