package typingsJapgolly.formik

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object withFormikMod {
  type ComponentDecorator[TOwnProps, TMergedProps] = js.Function1[
    /* component */ typingsJapgolly.formik.withFormikMod.CompositeComponent[TMergedProps], 
    typingsJapgolly.react.mod.ComponentType[TOwnProps]
  ]
  type CompositeComponent[P] = (japgolly.scalajs.react.raw.React.ComponentClassP[P with js.Object]) | typingsJapgolly.react.mod.StatelessComponent[P]
  type InferableComponentDecorator[TOwnProps] = js.Function1[
    /* component */ typingsJapgolly.formik.withFormikMod.CompositeComponent[TOwnProps], 
    typingsJapgolly.formik.withFormikMod.CompositeComponent[TOwnProps]
  ]
  type InjectedFormikProps[Props, Values] = Props with typingsJapgolly.formik.typesMod.FormikProps[Values]
}
