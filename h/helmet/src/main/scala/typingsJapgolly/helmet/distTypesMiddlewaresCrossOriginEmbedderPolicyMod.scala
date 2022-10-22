package typingsJapgolly.helmet

import typingsJapgolly.helmet.anon.ReadonlyCrossOriginEmbedd
import typingsJapgolly.helmet.helmetStrings.`require-corp`
import typingsJapgolly.helmet.helmetStrings.credentialless
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresCrossOriginEmbedderPolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/cross-origin-embedder-policy", JSImport.Namespace)
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
  inline def default(options: ReadonlyCrossOriginEmbedd): js.Function3[
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
  
  trait CrossOriginEmbedderPolicyOptions extends StObject {
    
    var policy: js.UndefOr[`require-corp` | credentialless] = js.undefined
  }
  object CrossOriginEmbedderPolicyOptions {
    
    inline def apply(): CrossOriginEmbedderPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CrossOriginEmbedderPolicyOptions]
    }
    
    extension [Self <: CrossOriginEmbedderPolicyOptions](x: Self) {
      
      inline def setPolicy(value: `require-corp` | credentialless): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
    }
  }
}
