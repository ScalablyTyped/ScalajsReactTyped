package typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Method extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/payments/lib", "Method")
@js.native
object Method extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Method & String] = js.native
  
  @js.native
  sealed trait CONNECT
    extends StObject
       with Method
  /* "CONNECT" */ val CONNECT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.CONNECT & String = js.native
  
  @js.native
  sealed trait DELETE
    extends StObject
       with Method
  /* "DELETE" */ val DELETE: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.DELETE & String = js.native
  
  @js.native
  sealed trait GET
    extends StObject
       with Method
  /* "GET" */ val GET: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.GET & String = js.native
  
  @js.native
  sealed trait HEAD
    extends StObject
       with Method
  /* "HEAD" */ val HEAD: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.HEAD & String = js.native
  
  @js.native
  sealed trait OPTIONS
    extends StObject
       with Method
  /* "OPTIONS" */ val OPTIONS: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.OPTIONS & String = js.native
  
  @js.native
  sealed trait PATCH
    extends StObject
       with Method
  /* "PATCH" */ val PATCH: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.PATCH & String = js.native
  
  @js.native
  sealed trait POST
    extends StObject
       with Method
  /* "POST" */ val POST: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.POST & String = js.native
  
  @js.native
  sealed trait PUT
    extends StObject
       with Method
  /* "PUT" */ val PUT: typingsJapgolly.paypalCheckoutServerSdk.libPaymentsLibMod.Method.PUT & String = js.native
}
