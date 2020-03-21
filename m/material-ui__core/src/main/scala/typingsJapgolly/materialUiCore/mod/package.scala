package typingsJapgolly.materialUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsJapgolly.materialUiCore.materialUiCoreStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  type Overwrite[T, U] = (typingsJapgolly.materialUiCore.mod.Omit[T, java.lang.String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    typingsJapgolly.react.mod.ComponentType[
      (typingsJapgolly.materialUiCore.mod.Omit[
        typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes[_, typingsJapgolly.materialUiCore.mod.PropsOf[_]], 
        java.lang.String
      ]) with AdditionalProps
    ]
  ]
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: java.lang.String */, Removals /* <: java.lang.String */] = (typingsJapgolly.materialUiCore.mod.Omit[C, typingsJapgolly.materialUiCore.materialUiCoreStrings.classes | Removals]) with typingsJapgolly.materialUiCore.withStylesMod.StyledComponentProps[ClassKey] with typingsJapgolly.materialUiCore.AnonClassName
}
