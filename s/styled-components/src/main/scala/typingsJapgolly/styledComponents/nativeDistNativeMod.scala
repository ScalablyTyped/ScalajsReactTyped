package typingsJapgolly.styledComponents

import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.ActivityIndicator
import typingsJapgolly.styledComponents.anon.IsCss
import typingsJapgolly.styledComponents.anon.`174`
import typingsJapgolly.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import typingsJapgolly.styledComponents.nativeDistModelsThemeProviderMod.Props
import typingsJapgolly.styledComponents.nativeDistTypesMod.AnyComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Keyframes
import typingsJapgolly.styledComponents.nativeDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyleFunction
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import typingsJapgolly.styledComponents.styledComponentsBooleans.`false`
import typingsJapgolly.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistNativeMod {
  
  @JSImport("styled-components/native/dist/native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native/dist/native", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ NativeTarget, `174`[NativeTarget]]) & ActivityIndicator = js.native
  
  @JSImport("styled-components/native/dist/native", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native/dist/native", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any)]
}
