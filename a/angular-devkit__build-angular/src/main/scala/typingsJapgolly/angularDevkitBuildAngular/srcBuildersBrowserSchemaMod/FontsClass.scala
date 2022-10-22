package typingsJapgolly.angularDevkitBuildAngular.srcBuildersBrowserSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontsClass extends StObject {
  
  /**
    * Reduce render blocking requests by inlining external Google Fonts and Adobe Fonts CSS
    * definitions in the application's HTML index file. This option requires internet access.
    * `HTTPS_PROXY` environment variable can be used to specify a proxy server.
    */
  var `inline`: js.UndefOr[Boolean] = js.undefined
}
object FontsClass {
  
  inline def apply(): FontsClass = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontsClass]
  }
  
  extension [Self <: FontsClass](x: Self) {
    
    inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
    
    inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
  }
}
