package typingsJapgolly.styledComponents

import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.NamedExoticComponent
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.TemplateStringsArray
import typingsJapgolly.styledComponents.anon.A
import typingsJapgolly.styledComponents.anon.Attrs
import typingsJapgolly.styledComponents.anon.IsCss
import typingsJapgolly.styledComponents.anon.TypeofStyleSheet
import typingsJapgolly.styledComponents.nativeDistModelsStyleSheetManagerMod.Props
import typingsJapgolly.styledComponents.nativeDistModelsThemeProviderMod.DefaultTheme
import typingsJapgolly.styledComponents.nativeDistSheetSheetMod.GlobalStylesAllocationMap
import typingsJapgolly.styledComponents.nativeDistSheetSheetMod.NamesAllocationMap
import typingsJapgolly.styledComponents.nativeDistSheetSheetMod.SheetConstructorArgs
import typingsJapgolly.styledComponents.nativeDistTypesMod.AnyComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExecutionContext
import typingsJapgolly.styledComponents.nativeDistTypesMod.ExtensibleObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.IStyledComponent
import typingsJapgolly.styledComponents.nativeDistTypesMod.Interpolation
import typingsJapgolly.styledComponents.nativeDistTypesMod.Keyframes
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyleFunction
import typingsJapgolly.styledComponents.nativeDistTypesMod.StyledObject
import typingsJapgolly.styledComponents.nativeDistTypesMod.Styles
import typingsJapgolly.styledComponents.nativeDistTypesMod.WebTarget
import typingsJapgolly.styledComponents.styledComponentsBooleans.`false`
import typingsJapgolly.styledComponents.styledComponentsStrings.web
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistMod {
  
  @JSImport("styled-components/native/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("styled-components/native/dist", JSImport.Default)
  @js.native
  val default: (js.Function1[/* tag */ WebTarget, Attrs[WebTarget]]) & A = js.native
  
  @JSImport("styled-components/native/dist", "ServerStyleSheet")
  @js.native
  open class ServerStyleSheet ()
    extends typingsJapgolly.styledComponents.nativeDistBaseMod.ServerStyleSheet
  
  @JSImport("styled-components/native/dist", "StyleSheetConsumer")
  @js.native
  val StyleSheetConsumer: Consumer[Unit | typingsJapgolly.styledComponents.nativeDistSheetMod.default] = js.native
  
  @JSImport("styled-components/native/dist", "StyleSheetContext")
  @js.native
  val StyleSheetContext: Context[Unit | typingsJapgolly.styledComponents.nativeDistSheetMod.default] = js.native
  
  inline def StyleSheetManager(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("StyleSheetManager")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("styled-components/native/dist", "ThemeConsumer")
  @js.native
  val ThemeConsumer: Consumer[js.UndefOr[DefaultTheme]] = js.native
  
  @JSImport("styled-components/native/dist", "ThemeContext")
  @js.native
  val ThemeContext: Context[js.UndefOr[DefaultTheme]] = js.native
  
  inline def ThemeProvider(props: typingsJapgolly.styledComponents.nativeDistModelsThemeProviderMod.Props): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  object __PRIVATE__ {
    
    @JSImport("styled-components/native/dist", "__PRIVATE__")
    @js.native
    val ^ : js.Any = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSImport("styled-components/native/dist", "__PRIVATE__.StyleSheet")
    @js.native
    open class StyleSheet ()
      extends typingsJapgolly.styledComponents.nativeDistSheetMod.default {
      def this(options: SheetConstructorArgs) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap) = this()
      def this(options: Unit, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: Unit, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: Unit, names: NamesAllocationMap) = this()
      def this(options: SheetConstructorArgs, globalStyles: GlobalStylesAllocationMap, names: NamesAllocationMap) = this()
    }
    @JSImport("styled-components/native/dist", "__PRIVATE__.StyleSheet")
    @js.native
    def StyleSheet: TypeofStyleSheet = js.native
    inline def StyleSheet_=(x: TypeofStyleSheet): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StyleSheet")(x.asInstanceOf[js.Any])
    
    @JSImport("styled-components/native/dist", "__PRIVATE__.mainSheet")
    @js.native
    def mainSheet: typingsJapgolly.styledComponents.nativeDistSheetMod.default = js.native
    inline def mainSheet_=(x: typingsJapgolly.styledComponents.nativeDistSheetMod.default): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mainSheet")(x.asInstanceOf[js.Any])
  }
  
  inline def createGlobalStyle[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): NamedExoticComponent[ExtensibleObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createGlobalStyle")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[NamedExoticComponent[ExtensibleObject]]
  
  inline def css[Props](styles: Styles[Props], interpolations: Interpolation[Props]*): js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(scala.List(styles.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.UndefOr[
    String | Double | `false` | Keyframes | (IStyledComponent[web, Any, Any]) | TemplateStringsArray | StyledObject[Props] | StyleFunction[Props] | (js.Array[Interpolation[Props]] & IsCss) | Null
  ]]
  
  inline def isStyledComponent(target: Any): /* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStyledComponent")(target.asInstanceOf[js.Any]).asInstanceOf[/* is styled-components.styled-components/native/dist/types.IStyledComponent<'web', any, any> */ Boolean]
  
  inline def keyframes[Props](strings: Styles[Props], interpolations: Interpolation[Props]*): typingsJapgolly.styledComponents.nativeDistModelsKeyframesMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("keyframes")(scala.List(strings.asInstanceOf[js.Any]).`++`(interpolations.asInstanceOf[Seq[js.Any]])*).asInstanceOf[typingsJapgolly.styledComponents.nativeDistModelsKeyframesMod.default]
  
  inline def useTheme(): js.UndefOr[DefaultTheme] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[js.UndefOr[DefaultTheme]]
  
  @JSImport("styled-components/native/dist", "version")
  @js.native
  val version: String = js.native
  
  inline def withTheme[T /* <: AnyComponent[Any] */](Component: T): (ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any) = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(Component.asInstanceOf[js.Any]).asInstanceOf[(ForwardRefExoticComponent[
    (PropsWithoutRef[LibraryManagedAttributes[T, ExecutionContext]]) & RefAttributes[T]
  ]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ key in std.Exclude<keyof T, T extends react.react.MemoExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'type' | 'compare' : T extends react.react.ForwardRefExoticComponent<any>? 'propTypes' | 'defaultProps' | 'displayName' | '$$typeof' | 'render' : 'length' | 'propTypes' | 'contextType' | 'contextTypes' | 'childContextTypes' | 'defaultProps' | 'displayName' | 'getDerivedStateFromProps' | 'getDerivedStateFromError' | 'type' | 'getDefaultProps' | 'mixins' | 'name' | 'prototype' | 'caller' | 'callee' | 'arguments' | 'arity'> ]: T[key]} */ js.Any)]
}
