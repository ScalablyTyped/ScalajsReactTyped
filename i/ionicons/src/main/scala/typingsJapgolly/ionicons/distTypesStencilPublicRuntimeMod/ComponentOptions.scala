package typingsJapgolly.ionicons.distTypesStencilPublicRuntimeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentOptions extends StObject {
  
  /**
    * Array of relative links to folders of assets required by the component.
    */
  var assetsDirs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If `true`, the component will use scoped stylesheets. Similar to shadow-dom,
    * but without native isolation. Defaults to `false`.
    */
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If `true`, the component will use native shadow-dom encapsulation, it will fallback to
    * `scoped` if the browser does not support shadow-dom natively. Defaults to `false`.
    * Additionally, `shadow` can also be given options when attaching the shadow root.
    */
  var shadow: js.UndefOr[Boolean | ShadowRootOptions] = js.undefined
  
  /**
    * Relative URL to some external stylesheet file. It should be a `.css` file unless some
    * external plugin is installed like `@stencil/sass`.
    */
  var styleUrl: js.UndefOr[String] = js.undefined
  
  /**
    * Similar as `styleUrl` but allows to specify different stylesheets for different modes.
    */
  var styleUrls: js.UndefOr[js.Array[String] | ModeStyles] = js.undefined
  
  /**
    * String that contains inlined CSS instead of using an external stylesheet.
    * The performance characteristics of this feature are the same as using an external stylesheet.
    *
    * Notice, you can't use sass, or less, only `css` is allowed using `styles`, use `styleUrl` is you need more advanced features.
    */
  var styles: js.UndefOr[String | StringDictionary[Any]] = js.undefined
  
  /**
    * Tag name of the web component. Ideally, the tag name must be globally unique,
    * so it's recommended to choose an unique prefix for all your components within the same collection.
    *
    * In addition, tag name must contain a '-'
    */
  var tag: String
}
object ComponentOptions {
  
  inline def apply(tag: String): ComponentOptions = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptions]
  }
  
  extension [Self <: ComponentOptions](x: Self) {
    
    inline def setAssetsDirs(value: js.Array[String]): Self = StObject.set(x, "assetsDirs", value.asInstanceOf[js.Any])
    
    inline def setAssetsDirsUndefined: Self = StObject.set(x, "assetsDirs", js.undefined)
    
    inline def setAssetsDirsVarargs(value: String*): Self = StObject.set(x, "assetsDirs", js.Array(value*))
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setShadow(value: Boolean | ShadowRootOptions): Self = StObject.set(x, "shadow", value.asInstanceOf[js.Any])
    
    inline def setShadowUndefined: Self = StObject.set(x, "shadow", js.undefined)
    
    inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlUndefined: Self = StObject.set(x, "styleUrl", js.undefined)
    
    inline def setStyleUrls(value: js.Array[String] | ModeStyles): Self = StObject.set(x, "styleUrls", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlsUndefined: Self = StObject.set(x, "styleUrls", js.undefined)
    
    inline def setStyleUrlsVarargs(value: String*): Self = StObject.set(x, "styleUrls", js.Array(value*))
    
    inline def setStyles(value: String | StringDictionary[Any]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
