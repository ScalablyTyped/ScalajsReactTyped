package typingsJapgolly.reactSketchapp.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod._Global_.JSX.Element
import typingsJapgolly.reactSketchapp.AnonOverrides
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-sketchapp", "makeSymbol")
@js.native
object makeSymbol extends js.Object {
  def apply[P](node: js.Function1[/* props */ P, Element]): ComponentClassP[P with AnonOverrides with js.Object] = js.native
  def apply[P](node: js.Function1[/* props */ P, Element], name: String): ComponentClassP[P with AnonOverrides with js.Object] = js.native
  def apply[P](node: ComponentClass[P, ComponentState]): ComponentClassP[P with AnonOverrides with js.Object] = js.native
  def apply[P](node: ComponentClass[P, ComponentState], name: String): ComponentClassP[P with AnonOverrides with js.Object] = js.native
}

