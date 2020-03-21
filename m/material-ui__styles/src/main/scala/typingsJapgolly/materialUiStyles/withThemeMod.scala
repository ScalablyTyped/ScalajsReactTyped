package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.raw.React.ComponentClassP
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsJapgolly.materialUiTypes.mod.ConsistentWith
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.PropInjector
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

@JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
@js.native
object withThemeMod extends js.Object {
  def default[Theme](component: ComponentClass[ConsistentWith[ComponentProps[_], WithTheme[Theme]], ComponentState]): ComponentType[
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
  def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[_], WithTheme[Theme]]]]
      ], 
      String
    ]) with Partial[WithTheme[Theme]] with ThemedComponentProps
  ] = js.native
  def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
  def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = js.native
}

