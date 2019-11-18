package typingsJapgolly.atMaterialDashUiCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMaterialDashUiCoreMod {
  import typingsJapgolly.atMaterialDashUiCore.Anon_ClassName
  import typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.classes
  import typingsJapgolly.atMaterialDashUiCore.stylesWithStylesMod.StyledComponentProps
  import typingsJapgolly.react.reactMod.ComponentType
  import typingsJapgolly.react.reactMod._Global_.JSX.LibraryManagedAttributes
  import typingsJapgolly.std.Exclude
  import typingsJapgolly.std.Pick

  type ConsistentWith[DecorationTargetProps, InjectedProps] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof DecorationTargetProps ]: P extends keyof InjectedProps? InjectedProps[P] extends DecorationTargetProps[P]? DecorationTargetProps[P] : InjectedProps[P] : DecorationTargetProps[P]}
    */ typingsJapgolly.atMaterialDashUiCore.atMaterialDashUiCoreStrings.ConsistentWith with js.Any
  type Omit[T, K /* <: String */] = Pick[T, Exclude[String, K]]
  type Overwrite[T, U] = (Omit[T, String]) with U
  type PropInjector[InjectedProps, AdditionalProps] = js.Function1[
    /* component */ js.Any, 
    ComponentType[(Omit[LibraryManagedAttributes[_, PropsOf[_]], String]) with AdditionalProps]
  ]
  type PropsOf[C] = /* import warning: importer.ImportType#apply Failed type conversion: react.react._Global_.JSX.IntrinsicElements[C] */ js.Any
  type StandardProps[C, ClassKey /* <: String */, Removals /* <: String */] = (Omit[C, classes | Removals]) with StyledComponentProps[ClassKey] with Anon_ClassName
}
