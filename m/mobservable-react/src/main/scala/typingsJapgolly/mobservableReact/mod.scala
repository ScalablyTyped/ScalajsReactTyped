package typingsJapgolly.mobservableReact

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ClassicComponentClass
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ReactElement
import typingsJapgolly.react.mod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobservable-react", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def observer[P](clazz: ClassicComponentClass[P]): ClassicComponentClass[P] = js.native
  def observer[P](clazz: ComponentClass[P, ComponentState]): ComponentClassP[P with js.Object] = js.native
  def observer[P](clazz: StatelessComponent[P]): ClassicComponentClass[P] = js.native
  def observer[P](renderFunction: js.Function1[/* props */ P, ReactElement]): ClassicComponentClass[P] = js.native
  def observer[TFunction /* <: ComponentClassP[js.Object] */](target: TFunction): TFunction = js.native
}

