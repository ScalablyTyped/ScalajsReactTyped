package typingsJapgolly.reactcss.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("reactcss", "hover")
@js.native
object hover extends js.Object {
  def apply[A](component: ComponentClass[A, ComponentState]): ComponentClassP[A with js.Object] = js.native
  def apply[A](component: StatelessComponent[A]): ComponentClassP[A with js.Object] = js.native
}

