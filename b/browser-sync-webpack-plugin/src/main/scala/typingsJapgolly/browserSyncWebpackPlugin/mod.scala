package typingsJapgolly.browserSyncWebpackPlugin

import japgolly.scalajs.react.Callback
import typingsJapgolly.browserSync.mod.BrowserSyncInstance
import typingsJapgolly.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("browser-sync-webpack-plugin", JSImport.Namespace)
  @js.native
  open class ^ protected () extends StObject {
    def this(browserSyncOptions: typingsJapgolly.browserSync.mod.Options) = this()
    def this(browserSyncOptions: typingsJapgolly.browserSync.mod.Options, pluginOptions: Options) = this()
  }
  
  type BrowserSyncPlugin = Plugin
  
  trait Options extends StObject {
    
    /**
      * BrowserSync instance init callback.
      * @defaultValue undefined
      */
    var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* bs */ BrowserSyncInstance, Unit]] = js.undefined
    
    /**
      * allows BrowserSync to inject changes inplace instead of reloading the page when changed
      * chunks are all CSS files.
      * @defaultValue false
      */
    var injectCss: js.UndefOr[Boolean] = js.undefined
    
    /**
      * BrowserSync instance name.
      * @defaultValue 'bs-webpack-plugin'
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Should BrowserSync handle reloads?
      * @defaultValue true
      */
    var reload: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCallback(value: (/* error */ js.Error, /* bs */ BrowserSyncInstance) => Callback): Self = StObject.set(x, "callback", js.Any.fromFunction2((t0: /* error */ js.Error, t1: /* bs */ BrowserSyncInstance) => (value(t0, t1)).runNow()))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setInjectCss(value: Boolean): Self = StObject.set(x, "injectCss", value.asInstanceOf[js.Any])
      
      inline def setInjectCssUndefined: Self = StObject.set(x, "injectCss", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReload(value: Boolean): Self = StObject.set(x, "reload", value.asInstanceOf[js.Any])
      
      inline def setReloadUndefined: Self = StObject.set(x, "reload", js.undefined)
    }
  }
}
