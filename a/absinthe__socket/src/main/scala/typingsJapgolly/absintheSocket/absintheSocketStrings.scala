package typingsJapgolly.absintheSocket

import typingsJapgolly.absintheSocket.mod.GqlOperationType
import typingsJapgolly.absintheSocket.mod.RequestStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object absintheSocketStrings {
  
  @js.native
  sealed trait canceled
    extends StObject
       with RequestStatus
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait canceling
    extends StObject
       with RequestStatus
  inline def canceling: canceling = "canceling".asInstanceOf[canceling]
  
  @js.native
  sealed trait mutation
    extends StObject
       with GqlOperationType
  inline def mutation: mutation = "mutation".asInstanceOf[mutation]
  
  @js.native
  sealed trait pending
    extends StObject
       with RequestStatus
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait query
    extends StObject
       with GqlOperationType
  inline def query: query = "query".asInstanceOf[query]
  
  @js.native
  sealed trait sending
    extends StObject
       with RequestStatus
  inline def sending: sending = "sending".asInstanceOf[sending]
  
  @js.native
  sealed trait sent
    extends StObject
       with RequestStatus
  inline def sent: sent = "sent".asInstanceOf[sent]
  
  @js.native
  sealed trait subscription
    extends StObject
       with GqlOperationType
  inline def subscription: subscription = "subscription".asInstanceOf[subscription]
}
