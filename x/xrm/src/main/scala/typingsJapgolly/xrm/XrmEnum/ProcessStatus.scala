package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.aborted
import typingsJapgolly.xrm.xrmStrings.active
import typingsJapgolly.xrm.xrmStrings.finished
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.active
  - typingsJapgolly.xrm.xrmStrings.aborted
  - typingsJapgolly.xrm.xrmStrings.finished
*/
trait ProcessStatus extends StObject
object ProcessStatus {
  
  inline def Aborted: aborted = "aborted".asInstanceOf[aborted]
  
  inline def Active: active = "active".asInstanceOf[active]
  
  inline def Finished: finished = "finished".asInstanceOf[finished]
}
