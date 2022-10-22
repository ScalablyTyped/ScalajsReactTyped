package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmInts.`1`
import typingsJapgolly.xrm.xrmInts.`2`
import typingsJapgolly.xrm.xrmInts.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Possible state of form data load.
  * @see {@link https://learn.microsoft.com/en-us/power-apps/developer/model-driven-apps/clientapi/reference/executioncontext/geteventargs#return-value getEventArgs (Client API reference)}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmInts.`1`
  - typingsJapgolly.xrm.xrmInts.`2`
  - typingsJapgolly.xrm.xrmInts.`3`
*/
trait FormDataLoadState extends StObject
object FormDataLoadState {
  
  inline def InitialLoad: `1` = 1.asInstanceOf[`1`]
  
  inline def Refresh: `3` = 3.asInstanceOf[`3`]
  
  inline def Save: `2` = 2.asInstanceOf[`2`]
}
