package typingsJapgolly.reactInstantsearchNative.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactInstantsearchCore.mod.HighlightPassedThru
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProps
import typingsJapgolly.reactInstantsearchCore.mod.HighlightProvided
import typingsJapgolly.reactInstantsearchCore.mod.Omit
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-instantsearch-native", "connectHighlight")
@js.native
object connectHighlight extends js.Object {
  def apply[TDoc](stateless: StatelessComponent[HighlightProps[TDoc]]): ComponentClassP[HighlightPassedThru[TDoc] with js.Object] = js.native
  def apply[TProps /* <: Partial[HighlightProps[TDoc]] */, TDoc](ctor: ComponentType[TProps]): ComponentClassP[(Omit[TProps, HighlightProvided[TDoc]]) with js.Object] = js.native
}

