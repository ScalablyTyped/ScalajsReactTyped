package typingsJapgolly.devtoolsProtocol.mod.Protocol.Page

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.canceled_
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.completed
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.inProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.inProgress
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.completed
  - typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.canceled_
*/
trait DownloadProgressEventState extends StObject
object DownloadProgressEventState {
  
  inline def Canceled: canceled_ = "canceled".asInstanceOf[canceled_]
  
  inline def Completed: completed = "completed".asInstanceOf[completed]
  
  inline def InProgress: inProgress = "inProgress".asInstanceOf[inProgress]
}
