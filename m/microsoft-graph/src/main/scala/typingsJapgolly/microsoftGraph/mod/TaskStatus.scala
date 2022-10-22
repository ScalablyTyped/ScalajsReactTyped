package typingsJapgolly.microsoftGraph.mod

import typingsJapgolly.microsoftGraph.microsoftGraphStrings.completed_
import typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.notStarted_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.completed_
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.waitingOnOthers
  - typingsJapgolly.microsoftGraph.microsoftGraphStrings.deferred
*/
trait TaskStatus extends StObject
object TaskStatus {
  
  inline def completed: completed_ = "completed".asInstanceOf[completed_]
  
  inline def deferred: typingsJapgolly.microsoftGraph.microsoftGraphStrings.deferred = "deferred".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.deferred]
  
  inline def inProgress: typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress = "inProgress".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.inProgress]
  
  inline def notStarted: notStarted_ = "notStarted".asInstanceOf[notStarted_]
  
  inline def waitingOnOthers: typingsJapgolly.microsoftGraph.microsoftGraphStrings.waitingOnOthers = "waitingOnOthers".asInstanceOf[typingsJapgolly.microsoftGraph.microsoftGraphStrings.waitingOnOthers]
}
