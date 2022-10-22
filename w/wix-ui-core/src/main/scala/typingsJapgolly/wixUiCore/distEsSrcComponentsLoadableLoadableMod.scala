package typingsJapgolly.wixUiCore

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsLoadableLoadableMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/loadable/Loadable", "Loadable")
  @js.native
  open class Loadable[LoadableExports] protected () extends Component[LoadableProps[LoadableExports], LoadableState[LoadableExports], Any] {
    def this(props: Any) = this()
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MLoadable(prevProps: Any): Unit = js.native
    
    /* private */ val loadSyncOrAsync: Any = js.native
    
    /* private */ val resolveModule: Any = js.native
  }
  
  trait LoadableProps[LoadableExports] extends StObject {
    
    def children(loaded: LoadedMap[LoadableExports]): Element
    
    /** component to show while not loading and `shouldLoadComponent` is false */
    var defaultComponent: Element
    
    /** loader for a component. `import('./Component')` */
    var loader: LoaderMap[LoadableExports]
    
    /** component to show while loading */
    var loadingComponent: js.UndefOr[Element] = js.undefined
    
    /** key to access the field inside module. `default` by default */
    var namedExports: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof LoadableExports ]:? string} */ js.Any
      ] = js.undefined
    
    /** callback thats beein called when dynamic chunk is loaded */
    var onLoad: js.UndefOr[js.Function0[js.Function]] = js.undefined
    
    /** key to trigger lazy-loading */
    var shouldLoadComponent: js.UndefOr[Boolean] = js.undefined
  }
  object LoadableProps {
    
    inline def apply[LoadableExports](
      children: LoadedMap[LoadableExports] => Element,
      defaultComponent: VdomElement,
      loader: LoaderMap[LoadableExports]
    ): LoadableProps[LoadableExports] = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), defaultComponent = defaultComponent.rawElement.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadableProps[LoadableExports]]
    }
    
    extension [Self <: LoadableProps[?], LoadableExports](x: Self & LoadableProps[LoadableExports]) {
      
      inline def setChildren(value: LoadedMap[LoadableExports] => Element): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setDefaultComponent(value: VdomElement): Self = StObject.set(x, "defaultComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoader(value: LoaderMap[LoadableExports]): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoadingComponent(value: VdomElement): Self = StObject.set(x, "loadingComponent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoadingComponentUndefined: Self = StObject.set(x, "loadingComponent", js.undefined)
      
      inline def setNamedExports(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ Key in keyof LoadableExports ]:? string} */ js.Any
      ): Self = StObject.set(x, "namedExports", value.asInstanceOf[js.Any])
      
      inline def setNamedExportsUndefined: Self = StObject.set(x, "namedExports", js.undefined)
      
      inline def setOnLoad(value: CallbackTo[js.Function]): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      inline def setShouldLoadComponent(value: Boolean): Self = StObject.set(x, "shouldLoadComponent", value.asInstanceOf[js.Any])
      
      inline def setShouldLoadComponentUndefined: Self = StObject.set(x, "shouldLoadComponent", js.undefined)
    }
  }
  
  trait LoadableState[LoadableExports] extends StObject {
    
    var isLoading: Boolean
    
    var loaded: LoadedMap[LoadableExports]
  }
  object LoadableState {
    
    inline def apply[LoadableExports](isLoading: Boolean, loaded: LoadedMap[LoadableExports]): LoadableState[LoadableExports] = {
      val __obj = js.Dynamic.literal(isLoading = isLoading.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[LoadableState[LoadableExports]]
    }
    
    extension [Self <: LoadableState[?], LoadableExports](x: Self & LoadableState[LoadableExports]) {
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: LoadedMap[LoadableExports]): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ Key in keyof LoadableExports ]:? LoadableExports[Key]}
    }}}
    */
  type LoadedMap[LoadableExports] = LoadableExports
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Key in keyof LoadableExports ]:? (): LoadableExports[Key] | wix-ui-core.wix-ui-core/dist/es/src/components/loadable/Loadable.Module<LoadableExports> | std.Promise<wix-ui-core.wix-ui-core/dist/es/src/components/loadable/Loadable.Module<LoadableExports>>}
    }}}
    */
  @js.native
  trait LoaderMap[LoadableExports] extends StObject
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ ModuleKey in keyof LoadableExports ]: LoadableExports[ModuleKey]}
    }}}
    */
  type Module[LoadableExports] = LoadableExports
}
