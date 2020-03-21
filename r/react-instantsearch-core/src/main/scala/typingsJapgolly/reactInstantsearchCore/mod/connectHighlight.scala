package typingsJapgolly.reactInstantsearchCore.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-core", "connectHighlight")
@js.native
object connectHighlight extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ComponentClassP[HighlightPassedThru[TDoc] with js.Object] = js.native
  def apply[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
}

