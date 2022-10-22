package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmInts.`0`
import typingsJapgolly.xrm.xrmInts.`11`
import typingsJapgolly.xrm.xrmInts.`1`
import typingsJapgolly.xrm.xrmInts.`2`
import typingsJapgolly.xrm.xrmInts.`3`
import typingsJapgolly.xrm.xrmInts.`4`
import typingsJapgolly.xrm.xrmInts.`5`
import typingsJapgolly.xrm.xrmInts.`6`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enumeration of entity form states/types.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmInts.`0`
  - typingsJapgolly.xrm.xrmInts.`1`
  - typingsJapgolly.xrm.xrmInts.`2`
  - typingsJapgolly.xrm.xrmInts.`3`
  - typingsJapgolly.xrm.xrmInts.`4`
  - typingsJapgolly.xrm.xrmInts.`6`
  - typingsJapgolly.xrm.xrmInts.`5`
  - typingsJapgolly.xrm.xrmInts.`11`
*/
trait FormType extends StObject
object FormType {
  
  inline def BulkEdit: `6` = 6.asInstanceOf[`6`]
  
  inline def Create: `1` = 1.asInstanceOf[`1`]
  
  inline def Disabled: `4` = 4.asInstanceOf[`4`]
  
  /**
    * @deprecated QuickCreate has been deprecated
    */
  inline def QuickCreate: `5` = 5.asInstanceOf[`5`]
  
  inline def ReadOnly: `3` = 3.asInstanceOf[`3`]
  
  /**
    * @deprecated ReadOptimized has been deprecated.
    */
  inline def ReadOptimized: `11` = 11.asInstanceOf[`11`]
  
  inline def Undefined: `0` = 0.asInstanceOf[`0`]
  
  inline def Update: `2` = 2.asInstanceOf[`2`]
}
