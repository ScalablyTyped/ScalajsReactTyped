package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fluent-react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[InjectedProps, GetProps[_]], ComponentState]): ComponentType[
    Omit[
      GetProps[ComponentClassP[(Matching[InjectedProps, GetProps[_]]) with js.Object]], 
      String
    ]
  ] = js.native
  def apply(component: FunctionComponent[Matching[InjectedProps, GetProps[_]]]): ComponentType[Omit[GetProps[FunctionComponent[Matching[InjectedProps, GetProps[_]]]], String]] = js.native
}

