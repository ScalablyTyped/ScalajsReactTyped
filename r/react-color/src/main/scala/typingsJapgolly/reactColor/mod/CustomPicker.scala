package typingsJapgolly.reactColor.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import typingsJapgolly.reactColor.colorWrapMod.ExportedColorProps
import typingsJapgolly.reactColor.colorWrapMod.InjectedColorProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color", "CustomPicker")
@js.native
object CustomPicker extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClassP[A with ExportedColorProps with js.Object] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClassP[A with ExportedColorProps with js.Object] = js.native
}

