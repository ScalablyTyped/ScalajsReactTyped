package typingsJapgolly.nextServer

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nextServer.anon.Default
import typingsJapgolly.nextServer.anon.Error
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibDynamicMod {
  
  @JSImport("next-server/dist/lib/dynamic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](dynamicOptions: DynamicOptions[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: DynamicOptions[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: Loader[P]): ComponentType[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any]).asInstanceOf[ComponentType[P]]
  inline def default[P](dynamicOptions: Loader[P], options: DynamicOptions[P]): ComponentType[P] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dynamicOptions.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ComponentType[P]]
  
  inline def noSSR[P](LoadableInitializer: LoadableFn[P], loadableOptions: LoadableOptions[P]): (ComponentClassP[P & js.Object]) | FunctionComponent[P] | js.Function0[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("noSSR")(LoadableInitializer.asInstanceOf[js.Any], loadableOptions.asInstanceOf[js.Any])).asInstanceOf[(ComponentClassP[P & js.Object]) | FunctionComponent[P] | js.Function0[Element]]
  
  trait DynamicOptions[P]
    extends StObject
       with LoadableBaseOptions[P] {
    
    /**
      * @deprecated the modules option has been planned for removal
      */
    var render: js.UndefOr[js.Function2[/* props */ P, /* loaded */ Any, Element]] = js.undefined
  }
  object DynamicOptions {
    
    inline def apply[P](): DynamicOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DynamicOptions[P]]
    }
    
    extension [Self <: DynamicOptions[?], P](x: Self & DynamicOptions[P]) {
      
      inline def setRender(value: (/* props */ P, /* loaded */ Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  trait LoadableBaseOptions[P]
    extends StObject
       with LoadableGeneratedOptions {
    
    var loadableGenerated: js.UndefOr[LoadableGeneratedOptions] = js.undefined
    
    var loader: js.UndefOr[Loader[P] | LoaderMap] = js.undefined
    
    var loading: js.UndefOr[js.Function1[/* hasErrorIsLoadingPastDelay */ Error, Element | Null]] = js.undefined
    
    var ssr: js.UndefOr[Boolean] = js.undefined
  }
  object LoadableBaseOptions {
    
    inline def apply[P](): LoadableBaseOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableBaseOptions[P]]
    }
    
    extension [Self <: LoadableBaseOptions[?], P](x: Self & LoadableBaseOptions[P]) {
      
      inline def setLoadableGenerated(value: LoadableGeneratedOptions): Self = StObject.set(x, "loadableGenerated", value.asInstanceOf[js.Any])
      
      inline def setLoadableGeneratedUndefined: Self = StObject.set(x, "loadableGenerated", js.undefined)
      
      inline def setLoader(value: Loader[P] | LoaderMap): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderCallbackTo(value: CallbackTo[js.Promise[ComponentType[P] | Default[P]]]): Self = StObject.set(x, "loader", value.toJsFn)
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLoading(value: /* hasErrorIsLoadingPastDelay */ Error => Element | Null): Self = StObject.set(x, "loading", js.Any.fromFunction1(value))
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
      
      inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    }
  }
  
  type LoadableComponent[P] = ComponentType[P]
  
  type LoadableFn[P] = js.Function1[/* opts */ LoadableOptions[P], ComponentType[P]]
  
  trait LoadableGeneratedOptions extends StObject {
    
    var modules: js.UndefOr[js.Function0[LoaderMap]] = js.undefined
    
    var webpack: js.UndefOr[js.Function0[Any]] = js.undefined
  }
  object LoadableGeneratedOptions {
    
    inline def apply(): LoadableGeneratedOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableGeneratedOptions]
    }
    
    extension [Self <: LoadableGeneratedOptions](x: Self) {
      
      inline def setModules(value: CallbackTo[LoaderMap]): Self = StObject.set(x, "modules", value.toJsFn)
      
      inline def setModulesUndefined: Self = StObject.set(x, "modules", js.undefined)
      
      inline def setWebpack(value: CallbackTo[Any]): Self = StObject.set(x, "webpack", value.toJsFn)
      
      inline def setWebpackUndefined: Self = StObject.set(x, "webpack", js.undefined)
    }
  }
  
  trait LoadableOptions[P]
    extends StObject
       with LoadableBaseOptions[P] {
    
    var render: js.UndefOr[js.Function2[/* loader */ Any, /* props */ Any, Element]] = js.undefined
  }
  object LoadableOptions {
    
    inline def apply[P](): LoadableOptions[P] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadableOptions[P]]
    }
    
    extension [Self <: LoadableOptions[?], P](x: Self & LoadableOptions[P]) {
      
      inline def setRender(value: (/* loader */ Any, /* props */ Any) => Element): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
    }
  }
  
  type Loader[P] = (js.Function0[js.Promise[ComponentType[P] | Default[P]]]) | (js.Promise[ComponentType[P] | Default[P]])
  
  type LoaderComponent[P] = js.Promise[ComponentType[P] | Default[P]]
  
  type LoaderMap = StringDictionary[js.Function0[Loader[Any]]]
}
