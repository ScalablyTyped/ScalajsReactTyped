package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.innerRef
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.theme
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsJapgolly.materialUiTypes.mod.ConsistentWith
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.PropInjector
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withThemeMod {
  
  @JSImport("@material-ui/styles/withTheme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme](component: ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object], 
        ComponentProps[
          ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object], 
        ComponentProps[
          ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  inline def default[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ]]
  
  inline def withThemeCreator[Theme](): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")().asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
  inline def withThemeCreator[Theme](option: WithThemeCreatorOption[Theme]): PropInjector[WithTheme[Theme], ThemedComponentProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("withThemeCreator")(option.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithTheme[Theme], ThemedComponentProps]]
}
