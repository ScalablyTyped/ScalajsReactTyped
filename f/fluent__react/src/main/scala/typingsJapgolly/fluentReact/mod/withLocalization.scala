package typingsJapgolly.fluentReact.mod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.hoistNonReactStatics.mod.NonReactStatics
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@fluent/react", "withLocalization")
@js.native
object withLocalization extends js.Object {
  def apply(component: ComponentClass[Matching[LocalizationProps, GetProps[_]], ComponentState]): (ComponentType[
    Omit[
      GetProps[ComponentClassP[(Matching[LocalizationProps, GetProps[_]]) with js.Object]], 
      String
    ]
  ]) with (NonReactStatics[
    ComponentClassP[(Matching[LocalizationProps, GetProps[_]]) with js.Object], 
    js.Object
  ]) = js.native
  def apply(component: FunctionComponent[Matching[LocalizationProps, GetProps[_]]]): (ComponentType[
    Omit[GetProps[FunctionComponent[Matching[LocalizationProps, GetProps[_]]]], String]
  ]) with (NonReactStatics[FunctionComponent[Matching[LocalizationProps, GetProps[_]]], js.Object]) = js.native
}

