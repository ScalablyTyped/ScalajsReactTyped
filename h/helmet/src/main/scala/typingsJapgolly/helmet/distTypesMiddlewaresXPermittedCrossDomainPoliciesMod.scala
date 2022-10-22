package typingsJapgolly.helmet

import typingsJapgolly.helmet.anon.ReadonlyXPermittedCrossDo
import typingsJapgolly.helmet.helmetStrings.`by-content-type`
import typingsJapgolly.helmet.helmetStrings.`master-only`
import typingsJapgolly.helmet.helmetStrings.all
import typingsJapgolly.helmet.helmetStrings.none
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresXPermittedCrossDomainPoliciesMod {
  
  @JSImport("helmet/dist/types/middlewares/x-permitted-cross-domain-policies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  inline def default(options: ReadonlyXPermittedCrossDo): js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* _req */ IncomingMessage, 
    /* res */ ServerResponse[IncomingMessage], 
    /* next */ js.Function0[Unit], 
    Unit
  ]]
  
  trait XPermittedCrossDomainPoliciesOptions extends StObject {
    
    var permittedPolicies: js.UndefOr[none | `master-only` | `by-content-type` | all] = js.undefined
  }
  object XPermittedCrossDomainPoliciesOptions {
    
    inline def apply(): XPermittedCrossDomainPoliciesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XPermittedCrossDomainPoliciesOptions]
    }
    
    extension [Self <: XPermittedCrossDomainPoliciesOptions](x: Self) {
      
      inline def setPermittedPolicies(value: none | `master-only` | `by-content-type` | all): Self = StObject.set(x, "permittedPolicies", value.asInstanceOf[js.Any])
      
      inline def setPermittedPoliciesUndefined: Self = StObject.set(x, "permittedPolicies", js.undefined)
    }
  }
}
