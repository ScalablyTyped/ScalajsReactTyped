package typingsJapgolly.antDesignCssinjs

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.client
import typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.server
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esStyleContextMod {
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", JSImport.Default)
  @js.native
  val default: Context[StyleContextProps] = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_DEV_CACHE_PATH")
  @js.native
  val ATTR_DEV_CACHE_PATH: /* "data-dev-cache-path" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_MARK")
  @js.native
  val ATTR_MARK: /* "data-css-hash" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "ATTR_TOKEN")
  @js.native
  val ATTR_TOKEN: /* "data-token-hash" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "CSS_IN_JS_INSTANCE")
  @js.native
  val CSS_IN_JS_INSTANCE: /* "__cssinjs_instance__" */ String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "CSS_IN_JS_INSTANCE_ID")
  @js.native
  val CSS_IN_JS_INSTANCE_ID: String = js.native
  
  @JSImport("@ant-design/cssinjs/es/StyleContext", "StyleProvider")
  @js.native
  val StyleProvider: FC[StyleProviderProps] = js.native
  
  inline def createCache(): typingsJapgolly.antDesignCssinjs.esCacheMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("createCache")().asInstanceOf[typingsJapgolly.antDesignCssinjs.esCacheMod.default]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.low
    - typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.high
  */
  trait HashPriority extends StObject
  object HashPriority {
    
    inline def high: typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.high = "high".asInstanceOf[typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.high]
    
    inline def low: typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.low = "low".asInstanceOf[typingsJapgolly.antDesignCssinjs.antDesignCssinjsStrings.low]
  }
  
  trait StyleContextProps extends StObject {
    
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Only set when you need ssr to extract style on you own.
      * If not provided, it will auto create <style /> on the end of Provider in server side.
      */
    var cache: typingsJapgolly.antDesignCssinjs.esCacheMod.default
    
    /** Tell children that this context is default generated context */
    var defaultCache: Boolean
    
    /** Use `:where` selector to reduce hashId css selector priority */
    var hashPriority: js.UndefOr[HashPriority] = js.undefined
    
    /** @private Test only. Not work in production. */
    var mock: js.UndefOr[server | client] = js.undefined
  }
  object StyleContextProps {
    
    inline def apply(cache: typingsJapgolly.antDesignCssinjs.esCacheMod.default, defaultCache: Boolean): StyleContextProps = {
      val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defaultCache = defaultCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleContextProps]
    }
    
    extension [Self <: StyleContextProps](x: Self) {
      
      inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
      
      inline def setCache(value: typingsJapgolly.antDesignCssinjs.esCacheMod.default): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setDefaultCache(value: Boolean): Self = StObject.set(x, "defaultCache", value.asInstanceOf[js.Any])
      
      inline def setHashPriority(value: HashPriority): Self = StObject.set(x, "hashPriority", value.asInstanceOf[js.Any])
      
      inline def setHashPriorityUndefined: Self = StObject.set(x, "hashPriority", js.undefined)
      
      inline def setMock(value: server | client): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
    }
  }
  
  /* Inlined std.Partial<@ant-design/cssinjs.@ant-design/cssinjs/es/StyleContext.StyleContextProps> & {  children :react.react.ReactNode | undefined} */
  trait StyleProviderProps extends StObject {
    
    var autoClear: js.UndefOr[Boolean] = js.undefined
    
    var cache: js.UndefOr[typingsJapgolly.antDesignCssinjs.esCacheMod.default] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var defaultCache: js.UndefOr[Boolean] = js.undefined
    
    var hashPriority: js.UndefOr[HashPriority] = js.undefined
    
    var mock: js.UndefOr[server | client] = js.undefined
  }
  object StyleProviderProps {
    
    inline def apply(): StyleProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyleProviderProps]
    }
    
    extension [Self <: StyleProviderProps](x: Self) {
      
      inline def setAutoClear(value: Boolean): Self = StObject.set(x, "autoClear", value.asInstanceOf[js.Any])
      
      inline def setAutoClearUndefined: Self = StObject.set(x, "autoClear", js.undefined)
      
      inline def setCache(value: typingsJapgolly.antDesignCssinjs.esCacheMod.default): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDefaultCache(value: Boolean): Self = StObject.set(x, "defaultCache", value.asInstanceOf[js.Any])
      
      inline def setDefaultCacheUndefined: Self = StObject.set(x, "defaultCache", js.undefined)
      
      inline def setHashPriority(value: HashPriority): Self = StObject.set(x, "hashPriority", value.asInstanceOf[js.Any])
      
      inline def setHashPriorityUndefined: Self = StObject.set(x, "hashPriority", js.undefined)
      
      inline def setMock(value: server | client): Self = StObject.set(x, "mock", value.asInstanceOf[js.Any])
      
      inline def setMockUndefined: Self = StObject.set(x, "mock", js.undefined)
    }
  }
}
