package typingsJapgolly.styledComponents

import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.Image
import typingsJapgolly.styledComponents.anon.IsCss
import typingsJapgolly.styledComponents.anon.`171`
import typingsJapgolly.styledComponents.nativeDistDistModelsThemeProviderMod.DefaultTheme
import typingsJapgolly.styledComponents.nativeDistDistModelsThemeProviderMod.Props
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.AnyComponent
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.NativeTarget
import typingsJapgolly.styledComponents.nativeDistDistTypesMod.Styles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistDistPrimitivesMod {
  
  @JSImport("styled-components/native/dist/dist/primitives", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native/dist/dist/primitives", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ NativeTarget, `171`[NativeTarget]]) & Image = js.native
  
  @JSImport("styled-components/native/dist/dist/primitives", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native/dist/dist/primitives", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): TemplateStringsArray | (Interpolation[Props] & IsCss) = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[TemplateStringsArray | (Interpolation[Props] & IsCss)]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/native/dist/dist/types.IStyledComponent<any, unknown> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/native/dist/dist/types.IStyledComponent<any, unknown> */ Boolean]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'type' | 'defaultProps' | 'displayName' | '$$typeof' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'type' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'type' | 'defaultProps' | 'displayName' | '$$typeof' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'type' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any)]
}
