package typingsJapgolly.helmet

import typingsJapgolly.helmet.anon.ReadonlyReferrerPolicyOpt
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMiddlewaresReferrerPolicyMod {
  
  @JSImport("helmet/dist/types/middlewares/referrer-policy", JSImport.Namespace)
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
  inline def default(options: ReadonlyReferrerPolicyOpt): js.Function3[
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
  
  trait ReferrerPolicyOptions extends StObject {
    
    var policy: js.UndefOr[ReferrerPolicyToken | js.Array[ReferrerPolicyToken]] = js.undefined
  }
  object ReferrerPolicyOptions {
    
    inline def apply(): ReferrerPolicyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReferrerPolicyOptions]
    }
    
    extension [Self <: ReferrerPolicyOptions](x: Self) {
      
      inline def setPolicy(value: ReferrerPolicyToken | js.Array[ReferrerPolicyToken]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      inline def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      inline def setPolicyVarargs(value: ReferrerPolicyToken*): Self = StObject.set(x, "policy", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.helmet.helmetStrings.`no-referrer`
    - typingsJapgolly.helmet.helmetStrings.`no-referrer-when-downgrade`
    - typingsJapgolly.helmet.helmetStrings.`same-origin`
    - typingsJapgolly.helmet.helmetStrings.origin
    - typingsJapgolly.helmet.helmetStrings.`strict-origin`
    - typingsJapgolly.helmet.helmetStrings.`origin-when-cross-origin`
    - typingsJapgolly.helmet.helmetStrings.`strict-origin-when-cross-origin`
    - typingsJapgolly.helmet.helmetStrings.`unsafe-url`
    - typingsJapgolly.helmet.helmetStrings._empty
  */
  trait ReferrerPolicyToken extends StObject
  object ReferrerPolicyToken {
    
    inline def _empty: typingsJapgolly.helmet.helmetStrings._empty = "".asInstanceOf[typingsJapgolly.helmet.helmetStrings._empty]
    
    inline def `no-referrer`: typingsJapgolly.helmet.helmetStrings.`no-referrer` = "no-referrer".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`no-referrer`]
    
    inline def `no-referrer-when-downgrade`: typingsJapgolly.helmet.helmetStrings.`no-referrer-when-downgrade` = "no-referrer-when-downgrade".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`no-referrer-when-downgrade`]
    
    inline def origin: typingsJapgolly.helmet.helmetStrings.origin = "origin".asInstanceOf[typingsJapgolly.helmet.helmetStrings.origin]
    
    inline def `origin-when-cross-origin`: typingsJapgolly.helmet.helmetStrings.`origin-when-cross-origin` = "origin-when-cross-origin".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`origin-when-cross-origin`]
    
    inline def `same-origin`: typingsJapgolly.helmet.helmetStrings.`same-origin` = "same-origin".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`same-origin`]
    
    inline def `strict-origin`: typingsJapgolly.helmet.helmetStrings.`strict-origin` = "strict-origin".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`strict-origin`]
    
    inline def `strict-origin-when-cross-origin`: typingsJapgolly.helmet.helmetStrings.`strict-origin-when-cross-origin` = "strict-origin-when-cross-origin".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`strict-origin-when-cross-origin`]
    
    inline def `unsafe-url`: typingsJapgolly.helmet.helmetStrings.`unsafe-url` = "unsafe-url".asInstanceOf[typingsJapgolly.helmet.helmetStrings.`unsafe-url`]
  }
}
