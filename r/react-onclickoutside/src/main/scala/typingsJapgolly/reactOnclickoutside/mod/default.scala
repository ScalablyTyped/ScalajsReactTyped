package typingsJapgolly.reactOnclickoutside.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-onclickoutside", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[P](component: ComponentClass[P, ComponentState]): WrapperClass[P, ComponentClassP[P with js.Object]] = js.native
  def apply[P](component: ComponentClass[P, ComponentState], config: ConfigObject): WrapperClass[P, ComponentClassP[P with js.Object]] = js.native
  def apply[P](component: FunctionComponent[P]): WrapperClass[P, FunctionComponent[P]] = js.native
  def apply[P](component: FunctionComponent[P], config: ConfigObject): WrapperClass[P, FunctionComponent[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P]): WrapperClass[P, ClickOutComponentClass[P]] = js.native
  def apply[P](component: ClickOutComponentClass[P], config: ConfigObject): WrapperClass[P, ClickOutComponentClass[P]] = js.native
}

