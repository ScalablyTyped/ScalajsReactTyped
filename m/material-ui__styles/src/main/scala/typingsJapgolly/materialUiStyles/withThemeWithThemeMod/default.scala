package typingsJapgolly.materialUiStyles.withThemeWithThemeMod

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.materialUiTypes.mod.ConsistentWith
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.react.mod.ComponentClass
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentState
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod._Global_.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@material-ui/styles/withTheme/withTheme", JSImport.Default)
@js.native
object default extends js.Object {
  def apply[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClassP[(ConsistentWith[ComponentProps[_], WithTheme[Theme]]) with js.Object], 
        ComponentProps[
          ComponentClassP[(ConsistentWith[ComponentProps[_], WithTheme[Theme]]) with js.Object]
        ]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def apply[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
}

