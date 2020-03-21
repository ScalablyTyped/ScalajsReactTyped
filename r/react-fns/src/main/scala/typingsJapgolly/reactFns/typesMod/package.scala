package typingsJapgolly.reactFns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typingsJapgolly.reactFns.typesMod.CompositeComponent[TMergedProps], 
    japgolly.scalajs.react.raw.React.ComponentClassP[TOwnProps with js.Object]
  ]
  type CompositeComponent[P] = (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typingsJapgolly.reactFns.typesMod.CompositeComponent[TOwnProps], 
    typingsJapgolly.reactFns.typesMod.CompositeComponent[TOwnProps]
  ]
}
