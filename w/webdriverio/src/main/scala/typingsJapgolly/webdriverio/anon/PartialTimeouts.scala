package typingsJapgolly.webdriverio.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@wdio/protocols.@wdio/protocols.Timeouts> */
trait PartialTimeouts extends StObject {
  
  var `implicit`: js.UndefOr[Double] = js.undefined
  
  var pageLoad: js.UndefOr[Double] = js.undefined
  
  var script: js.UndefOr[Double] = js.undefined
}
object PartialTimeouts {
  
  inline def apply(): PartialTimeouts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialTimeouts]
  }
  
  extension [Self <: PartialTimeouts](x: Self) {
    
    inline def setImplicit(value: Double): Self = StObject.set(x, "implicit", value.asInstanceOf[js.Any])
    
    inline def setImplicitUndefined: Self = StObject.set(x, "implicit", js.undefined)
    
    inline def setPageLoad(value: Double): Self = StObject.set(x, "pageLoad", value.asInstanceOf[js.Any])
    
    inline def setPageLoadUndefined: Self = StObject.set(x, "pageLoad", js.undefined)
    
    inline def setScript(value: Double): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
  }
}
