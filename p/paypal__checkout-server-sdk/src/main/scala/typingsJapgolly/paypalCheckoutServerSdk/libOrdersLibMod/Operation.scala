package typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Operation extends StObject
@JSImport("@paypal/checkout-server-sdk/lib/orders/lib", "Operation")
@js.native
object Operation extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Operation & String] = js.native
  
  @js.native
  sealed trait ADD
    extends StObject
       with Operation
  /* "add" */ val ADD: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.ADD & String = js.native
  
  @js.native
  sealed trait COPY
    extends StObject
       with Operation
  /* "copy" */ val COPY: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.COPY & String = js.native
  
  @js.native
  sealed trait MOVE
    extends StObject
       with Operation
  /* "move" */ val MOVE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.MOVE & String = js.native
  
  @js.native
  sealed trait REMOVE
    extends StObject
       with Operation
  /* "remove" */ val REMOVE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REMOVE & String = js.native
  
  @js.native
  sealed trait REPLACE
    extends StObject
       with Operation
  /* "replace" */ val REPLACE: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.REPLACE & String = js.native
  
  @js.native
  sealed trait TEST
    extends StObject
       with Operation
  /* "test" */ val TEST: typingsJapgolly.paypalCheckoutServerSdk.libOrdersLibMod.Operation.TEST & String = js.native
}
