package typingsJapgolly.angularDevkitBuildAngular

import typingsJapgolly.angularDevkitBuildAngular.srcUtilsNormalizeCacheMod.NormalizedCachedOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilsIndexFileInlineFontsMod {
  
  @JSImport("@angular-devkit/build-angular/src/utils/index-file/inline-fonts", "InlineFontsProcessor")
  @js.native
  open class InlineFontsProcessor protected () extends StObject {
    def this(options: InlineFontsOptions) = this()
    
    /* private */ val cachePath: Any = js.native
    
    /* private */ var createNormalizedUrl: Any = js.native
    
    /* private */ var getFontProviderDetails: Any = js.native
    
    /* private */ var getResponse: Any = js.native
    
    /* private */ var options: Any = js.native
    
    def process(content: String): js.Promise[String] = js.native
    
    /* private */ var processHref: Any = js.native
  }
  
  trait InlineFontsOptions extends StObject {
    
    var cache: js.UndefOr[NormalizedCachedOptions] = js.undefined
    
    var minify: js.UndefOr[Boolean] = js.undefined
  }
  object InlineFontsOptions {
    
    inline def apply(): InlineFontsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InlineFontsOptions]
    }
    
    extension [Self <: InlineFontsOptions](x: Self) {
      
      inline def setCache(value: NormalizedCachedOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setMinify(value: Boolean): Self = StObject.set(x, "minify", value.asInstanceOf[js.Any])
      
      inline def setMinifyUndefined: Self = StObject.set(x, "minify", js.undefined)
    }
  }
}
