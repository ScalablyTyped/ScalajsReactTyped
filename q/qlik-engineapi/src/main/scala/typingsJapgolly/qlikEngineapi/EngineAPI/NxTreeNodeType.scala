package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * One of:
  * - V for NX_DIM_CELL_VALUE. Applies to values in the data matrix.
  * - E for NX_DIM_CELL_EMPTY. Applies to empty cells in the top and left dimensions.
  * - G for NX_DIM_CELL_GENERATED. Applies to generated nodes that are inserted into the returned tree when there is no actual value (qAllValues in NxPageTreeNode set to true).
  * - N for NX_DIM_CELL_NORMAL. Applies to left and top dimensions cells.
  * - T for NX_DIM_CELL_TOTAL. Applies to cells marked with Total.
  * - P for NX_DIM_CELL_PSEUDO. Applies to pseudo dimensions.
  * - R for NX_DIM_CELL_ROOT. Applies to root node.
  * - U for NX_DIM_CELL_NULL. Applies to Null values in the data matrix.
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.V
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.E
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.G
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.N
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.T
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.P
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.R
  - typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U
*/
trait NxTreeNodeType extends StObject
object NxTreeNodeType {
  
  inline def E: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.E = "E".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.E]
  
  inline def G: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.G = "G".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.G]
  
  inline def N: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.N = "N".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.N]
  
  inline def P: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.P = "P".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.P]
  
  inline def R: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.R = "R".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.R]
  
  inline def T: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.T = "T".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.T]
  
  inline def U: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U = "U".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.U]
  
  inline def V: typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.V = "V".asInstanceOf[typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.V]
}
