package typingsJapgolly.signalfx.mod

import typingsJapgolly.signalfx.anon.Matcher
import typingsJapgolly.signalfx.anon.Rate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveTailOpts extends StObject {
  
  var query: Matcher
  
  var throttleOptions: Rate
}
object LiveTailOpts {
  
  inline def apply(query: Matcher, throttleOptions: Rate): LiveTailOpts = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], throttleOptions = throttleOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveTailOpts]
  }
  
  extension [Self <: LiveTailOpts](x: Self) {
    
    inline def setQuery(value: Matcher): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setThrottleOptions(value: Rate): Self = StObject.set(x, "throttleOptions", value.asInstanceOf[js.Any])
  }
}
