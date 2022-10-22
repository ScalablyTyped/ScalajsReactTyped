package typingsJapgolly.ddTrace.mod.plugins

import typingsJapgolly.ddTrace.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @hidden */
trait HttpClient
  extends StObject
     with Http_ {
  
  /**
    * Hooks to run before spans are finished.
    */
  var hooks: js.UndefOr[`0`] = js.undefined
  
  /**
    * List of urls to which propagation headers should not be injected
    */
  var propagationBlocklist: js.UndefOr[
    String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
  ] = js.undefined
  
  /**
    * Use the remote endpoint host as the service name instead of the default.
    *
    * @default false
    */
  var splitByDomain: js.UndefOr[Boolean] = js.undefined
}
object HttpClient {
  
  inline def apply(): HttpClient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpClient]
  }
  
  extension [Self <: HttpClient](x: Self) {
    
    inline def setHooks(value: `0`): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    inline def setPropagationBlocklist(
      value: String | js.RegExp | (js.Function1[/* url */ String, Boolean]) | (js.Array[String | js.RegExp | (js.Function1[/* url */ String, Boolean])])
    ): Self = StObject.set(x, "propagationBlocklist", value.asInstanceOf[js.Any])
    
    inline def setPropagationBlocklistFunction1(value: /* url */ String => Boolean): Self = StObject.set(x, "propagationBlocklist", js.Any.fromFunction1(value))
    
    inline def setPropagationBlocklistUndefined: Self = StObject.set(x, "propagationBlocklist", js.undefined)
    
    inline def setPropagationBlocklistVarargs(value: (String | js.RegExp | (js.Function1[/* url */ String, Boolean]))*): Self = StObject.set(x, "propagationBlocklist", js.Array(value*))
    
    inline def setSplitByDomain(value: Boolean): Self = StObject.set(x, "splitByDomain", value.asInstanceOf[js.Any])
    
    inline def setSplitByDomainUndefined: Self = StObject.set(x, "splitByDomain", js.undefined)
  }
}
