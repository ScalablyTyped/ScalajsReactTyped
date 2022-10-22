package typingsJapgolly.reactJss

import org.scalablytyped.runtime.NumberDictionary
import org.scalajs.dom.StyleSheet
import typingsJapgolly.jss.mod.CreateGenerateId_
import typingsJapgolly.jss.mod.Jss
import typingsJapgolly.jss.mod.StyleSheetFactoryOptions
import typingsJapgolly.jss.mod.Styles
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.LibraryManagedAttributes
import typingsJapgolly.reactJss.anon.Children
import typingsJapgolly.reactJss.anon.Classes
import typingsJapgolly.reactJss.anon.DisableStylesGeneration
import typingsJapgolly.reactJss.anon.`0`
import typingsJapgolly.reactJss.mod.global.Jss.Theme
import typingsJapgolly.reactJss.reactJssStrings.classes
import typingsJapgolly.std.Omit
import typingsJapgolly.theming.mod.ThemeProviderFactory
import typingsJapgolly.theming.mod.Theming
import typingsJapgolly.theming.mod.UseThemeFactory
import typingsJapgolly.theming.mod.WithThemeFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-jss", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ClassNames /* <: String | Double | js.Symbol */, Props, Theme](styles: js.Function1[/* theme */ Theme, Styles[ClassNames, Props, Unit]]): js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ]]
  inline def default[ClassNames /* <: String | Double | js.Symbol */, Props, Theme](
    styles: js.Function1[/* theme */ Theme, Styles[ClassNames, Props, Unit]],
    options: WithStylesOptions
  ): js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ]]
  inline def default[ClassNames /* <: String | Double | js.Symbol */, Props, Theme](styles: Styles[ClassNames, Props, Theme]): js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ]]
  inline def default[ClassNames /* <: String | Double | js.Symbol */, Props, Theme](styles: Styles[ClassNames, Props, Theme], options: WithStylesOptions): js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
    /* comp */ Any, 
    ComponentType[LibraryManagedAttributes[Any, (Omit[GetProps[Any], classes]) & Classes]]
  ]]
  
  @JSImport("react-jss", "JssContext")
  @js.native
  val JssContext: Context[DisableStylesGeneration] = js.native
  
  @JSImport("react-jss", "JssProvider")
  @js.native
  val JssProvider: ComponentType[Children] = js.native
  
  @JSImport("react-jss", "SheetsRegistry")
  @js.native
  open class SheetsRegistry ()
    extends typingsJapgolly.jss.mod.SheetsRegistry
  
  @JSImport("react-jss", "ThemeProvider")
  @js.native
  val ThemeProvider: ThemeProviderFactory[typingsJapgolly.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "createGenerateId")
  @js.native
  val createGenerateId: CreateGenerateId_ = js.native
  
  inline def createTheming[Theme](context: Context[Theme]): Theming[Theme] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTheming")(context.asInstanceOf[js.Any]).asInstanceOf[Theming[Theme]]
  
  inline def createUseStyles[C /* <: String */, Props, Theme](styles: js.Function1[/* theme */ Theme, Styles[C, Props, Unit]]): js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]]]
  inline def createUseStyles[C /* <: String */, Props, Theme](
    styles: js.Function1[/* theme */ Theme, Styles[C, Props, Unit]],
    options: CreateUseStylesOptions[Theme]
  ): js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]]]
  inline def createUseStyles[C /* <: String */, Props, Theme](styles: Styles[C, Props, Theme]): js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]]]
  inline def createUseStyles[C /* <: String */, Props, Theme](styles: Styles[C, Props, Theme], options: CreateUseStylesOptions[Theme]): js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createUseStyles")(styles.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* data */ js.UndefOr[Props & `0`[Theme]], typingsJapgolly.jss.mod.Classes[C]]]
  
  @JSImport("react-jss", "jss")
  @js.native
  val jss: Jss = js.native
  
  @JSImport("react-jss", "useTheme")
  @js.native
  val useTheme: UseThemeFactory[typingsJapgolly.theming.mod.DefaultTheme] = js.native
  
  @JSImport("react-jss", "withTheme")
  @js.native
  val withTheme: WithThemeFactory[typingsJapgolly.theming.mod.DefaultTheme] = js.native
  
  trait BaseOptions[Theme]
    extends StObject
       with StyleSheetFactoryOptions {
    
    var theming: js.UndefOr[Theming[Theme]] = js.undefined
  }
  object BaseOptions {
    
    inline def apply[Theme](): BaseOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseOptions[Theme]]
    }
    
    extension [Self <: BaseOptions[?], Theme](x: Self & BaseOptions[Theme]) {
      
      inline def setTheming(value: Theming[Theme]): Self = StObject.set(x, "theming", value.asInstanceOf[js.Any])
      
      inline def setThemingUndefined: Self = StObject.set(x, "theming", js.undefined)
    }
  }
  
  type ClassesForStyles[S /* <: (Styles[Any, Any, Any]) | (js.Function1[/* theme */ Any, Styles[Any, Any, Unit]]) */] = typingsJapgolly.jss.mod.Classes[
    /* import warning: importer.ImportType#apply Failed type conversion: S extends (theme : any): jss.jss.Styles<any, any, undefined> ? keyof std.ReturnType<S> : keyof S */ js.Any
  ]
  
  trait CreateUseStylesOptions[Theme]
    extends StObject
       with BaseOptions[Theme] {
    
    var name: js.UndefOr[String] = js.undefined
  }
  object CreateUseStylesOptions {
    
    inline def apply[Theme](): CreateUseStylesOptions[Theme] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateUseStylesOptions[Theme]]
    }
    
    extension [Self <: CreateUseStylesOptions[?], Theme](x: Self & CreateUseStylesOptions[Theme]) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  type DefaultTheme = Theme
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    C extends react.react.ComponentType<infer P> ? P : never
    }}}
    */
  @js.native
  trait GetProps[C] extends StObject
  
  type Managers = NumberDictionary[StyleSheet]
  
  /**
    * @deprecated Please use `WithStylesProps` instead
    */
  type WithStyles[S /* <: (Styles[Any, Any, Any]) | (js.Function1[/* theme */ Any, Styles[Any, Any, Unit]]) */] = WithStylesProps[S]
  
  trait WithStylesOptions
    extends StObject
       with BaseOptions[DefaultTheme] {
    
    var injectTheme: js.UndefOr[Boolean] = js.undefined
    
    var jss: js.UndefOr[Jss] = js.undefined
  }
  object WithStylesOptions {
    
    inline def apply(): WithStylesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithStylesOptions]
    }
    
    extension [Self <: WithStylesOptions](x: Self) {
      
      inline def setInjectTheme(value: Boolean): Self = StObject.set(x, "injectTheme", value.asInstanceOf[js.Any])
      
      inline def setInjectThemeUndefined: Self = StObject.set(x, "injectTheme", js.undefined)
      
      inline def setJss(value: Jss): Self = StObject.set(x, "jss", value.asInstanceOf[js.Any])
      
      inline def setJssUndefined: Self = StObject.set(x, "jss", js.undefined)
    }
  }
  
  trait WithStylesProps[S /* <: (Styles[Any, Any, Any]) | (js.Function1[/* theme */ Any, Styles[Any, Any, Unit]]) */] extends StObject {
    
    var classes: ClassesForStyles[S]
  }
  object WithStylesProps {
    
    inline def apply[S /* <: (Styles[Any, Any, Any]) | (js.Function1[/* theme */ Any, Styles[Any, Any, Unit]]) */](classes: ClassesForStyles[S]): WithStylesProps[S] = {
      val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithStylesProps[S]]
    }
    
    extension [Self <: WithStylesProps[?], S /* <: (Styles[Any, Any, Any]) | (js.Function1[/* theme */ Any, Styles[Any, Any, Unit]]) */](x: Self & WithStylesProps[S]) {
      
      inline def setClasses(value: ClassesForStyles[S]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    }
  }
  
  object global {
    
    object Jss {
      
      trait Theme extends StObject
    }
  }
}
