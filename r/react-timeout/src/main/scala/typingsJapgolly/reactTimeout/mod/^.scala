package typingsJapgolly.reactTimeout.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-timeout", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[T](SourceComponent: ComponentClass[T, ComponentState]): ComponentClassP[T with js.Object] = js.native
  def apply[T](SourceComponent: StatelessComponent[T]): ComponentClassP[T with js.Object] = js.native
}

