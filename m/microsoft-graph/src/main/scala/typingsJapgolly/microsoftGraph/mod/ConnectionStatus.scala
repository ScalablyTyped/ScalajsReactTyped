package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknown_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempted
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.failed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.unknownFutureValue_
*/
trait ConnectionStatus extends StObject
object ConnectionStatus {
  
  inline def attempted: typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempted = "attempted".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.attempted]
  
  inline def blocked: typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked = "blocked".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.blocked]
  
  inline def failed: failed_ = "failed".asInstanceOf[failed_]
  
  inline def succeeded: typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded = "succeeded".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.succeeded]
  
  inline def unknown: unknown_ = "unknown".asInstanceOf[unknown_]
  
  inline def unknownFutureValue: unknownFutureValue_ = "unknownFutureValue".asInstanceOf[unknownFutureValue_]
}
