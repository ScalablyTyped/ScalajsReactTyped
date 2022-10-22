package typingsJapgolly.materialUiStyles

import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.jss.mod.GenerateId
import typingsJapgolly.jss.mod.JssOptions
import typingsJapgolly.materialUiStyles.anon.NameProps
import typingsJapgolly.materialUiStyles.createGenerateClassNameCreateGenerateClassNameMod.GenerateClassNameOptions
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemeWithProps
import typingsJapgolly.materialUiStyles.getThemePropsGetThemePropsMod.ThemedProps
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.innerRef
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.theme
import typingsJapgolly.materialUiStyles.materialUiStylesStrings.withTheme
import typingsJapgolly.materialUiStyles.mergeClassesMergeClassesMod.Classes
import typingsJapgolly.materialUiStyles.mergeClassesMergeClassesMod.MergeClassesOption
import typingsJapgolly.materialUiStyles.serverStyleSheetsMod.default
import typingsJapgolly.materialUiStyles.styledStyledMod.ComponentCreator
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesOptions
import typingsJapgolly.materialUiStyles.stylesProviderStylesProviderMod.StylesProviderProps
import typingsJapgolly.materialUiStyles.themeProviderThemeProviderMod.ThemeProviderProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ClassKeyOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.PropsOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyleRules
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.StyledComponentProps
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.Styles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.ThemeOfStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStyles
import typingsJapgolly.materialUiStyles.withStylesWithStylesMod.WithStylesOptions
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.ThemedComponentProps
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithTheme
import typingsJapgolly.materialUiStyles.withThemeWithThemeMod.WithThemeCreatorOption
import typingsJapgolly.materialUiTypes.mod.ConsistentWith
import typingsJapgolly.materialUiTypes.mod.Omit
import typingsJapgolly.materialUiTypes.mod.PropInjector
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@material-ui/styles", JSImport.Namespace)
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
  
  @JSImport("@material-ui/styles", "ServerStyleSheets")
  @js.native
  open class ServerStyleSheets () extends default {
    def this(options: js.Object) = this()
  }
  
  @JSImport("@material-ui/styles", "StylesContext")
  @js.native
  val StylesContext: Context[StylesOptions] = js.native
  
  @JSImport("@material-ui/styles", "StylesProvider")
  @js.native
  val StylesProvider: ComponentType[StylesProviderProps] = js.native
  
  inline def ThemeProvider[T](props: ThemeProviderProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ThemeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def createGenerateClassName(): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")().asInstanceOf[GenerateId]
  inline def createGenerateClassName(options: GenerateClassNameOptions): GenerateId = ^.asInstanceOf[js.Dynamic].applyDynamic("createGenerateClassName")(options.asInstanceOf[js.Any]).asInstanceOf[GenerateId]
  
  inline def createStyles[ClassKey /* <: String */, Props /* <: js.Object */](styles: StyleRules[Props, ClassKey]): StyleRules[Props, ClassKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("createStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[StyleRules[Props, ClassKey]]
  
  inline def getThemeProps[Theme /* <: ThemeWithProps[Any] */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name, Theme]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("getThemeProps")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  inline def jssPreset(): JssOptions = ^.asInstanceOf[js.Dynamic].applyDynamic("jssPreset")().asInstanceOf[JssOptions]
  
  inline def makeStyles[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def makeStyles_withTheme[Theme, Props /* <: js.Object */, ClassKey /* <: String */](styles: Styles[Theme, Props, ClassKey], options: Omit[WithStylesOptions[Theme], withTheme]): /* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("makeStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: keyof Props extends never ? (props : any | undefined): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> : (props : Props): @material-ui/styles.@material-ui/styles/withStyles/withStyles.ClassNameMap<ClassKey> */ js.Any]
  
  inline def mergeClasses(): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")().asInstanceOf[Classes]
  inline def mergeClasses(options: MergeClassesOption): Classes = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeClasses")(options.asInstanceOf[js.Any]).asInstanceOf[Classes]
  
  inline def styled[Component /* <: ElementType */](Component: Component): ComponentCreator[Component] = ^.asInstanceOf[js.Dynamic].applyDynamic("styled")(Component.asInstanceOf[js.Any]).asInstanceOf[ComponentCreator[Component]]
  
  inline def useTheme[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useTheme")().asInstanceOf[T]
  
  inline def withStyles[StylesType /* <: Styles[Any, Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any]).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
  inline def withStyles[StylesType /* <: Styles[Any, Any, String] */, Options /* <: WithStylesOptions[ThemeOfStyles[StylesType]] */](style: StylesType, options: Options): PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("withStyles")(style.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PropInjector[
    WithStyles[
      StylesType, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['withTheme'] */ js.Any
    ], 
    StyledComponentProps[ClassKeyOfStyles[StylesType]] & PropsOfStyles[StylesType]
  ]]
  
  inline def withTheme[Theme](component: ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object], 
        ComponentProps[
          ComponentClassP[(ConsistentWith[ComponentProps[Any], WithTheme[Theme]]) & js.Object]
        ]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
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
  inline def withTheme[Theme](component: FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]): ComponentType[
    (Omit[
      LibraryManagedAttributes[
        FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]], 
        ComponentProps[FunctionComponent[ConsistentWith[ComponentProps[Any], WithTheme[Theme]]]]
      ], 
      /* keyof @material-ui/styles.@material-ui/styles/withTheme/withTheme.WithTheme<Theme> */ theme | innerRef
    ]) & Partial[WithTheme[Theme]] & ThemedComponentProps
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTheme")(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
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
