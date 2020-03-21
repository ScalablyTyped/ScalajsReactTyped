package typingsJapgolly.reactColor.colorWrapMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-color/lib/components/common/ColorWrap", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[A](component: ComponentClass[A with InjectedColorProps, ComponentState]): ComponentClassP[A with ExportedColorProps with js.Object] = js.native
  def apply[A](component: StatelessComponent[A with InjectedColorProps]): ComponentClassP[A with ExportedColorProps with js.Object] = js.native
}

