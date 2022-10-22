package typingsJapgolly.invityApi.mod

import typingsJapgolly.invityApi.invityApiStrings.Blocked_
import typingsJapgolly.invityApi.invityApiStrings.Cancelled_
import typingsJapgolly.invityApi.invityApiStrings.Error_
import typingsJapgolly.invityApi.invityApiStrings.Pending_
import typingsJapgolly.invityApi.invityApiStrings.Refunded_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.invityApi.invityApiStrings.Cancelled_
  - typingsJapgolly.invityApi.invityApiStrings.Pending_
  - typingsJapgolly.invityApi.invityApiStrings.InProgress
  - typingsJapgolly.invityApi.invityApiStrings.Blocked_
  - typingsJapgolly.invityApi.invityApiStrings.Completed
  - typingsJapgolly.invityApi.invityApiStrings.Refunded_
  - typingsJapgolly.invityApi.invityApiStrings.Error_
*/
trait SavingsTradeItemStatus extends StObject
object SavingsTradeItemStatus {
  
  inline def Blocked: Blocked_ = "Blocked".asInstanceOf[Blocked_]
  
  inline def Cancelled: Cancelled_ = "Cancelled".asInstanceOf[Cancelled_]
  
  inline def Completed: typingsJapgolly.invityApi.invityApiStrings.Completed = "Completed".asInstanceOf[typingsJapgolly.invityApi.invityApiStrings.Completed]
  
  inline def Error: Error_ = "Error".asInstanceOf[Error_]
  
  inline def InProgress: typingsJapgolly.invityApi.invityApiStrings.InProgress = "InProgress".asInstanceOf[typingsJapgolly.invityApi.invityApiStrings.InProgress]
  
  inline def Pending: Pending_ = "Pending".asInstanceOf[Pending_]
  
  inline def Refunded: Refunded_ = "Refunded".asInstanceOf[Refunded_]
}
