package typingsJapgolly.domutils

import typingsJapgolly.domhandler.libNodeMod.AnyNode
import typingsJapgolly.domutils.domutilsInts.`16`
import typingsJapgolly.domutils.domutilsInts.`1`
import typingsJapgolly.domutils.domutilsInts.`2`
import typingsJapgolly.domutils.domutilsInts.`4`
import typingsJapgolly.domutils.domutilsInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHelpersMod {
  
  @JSImport("domutils/lib/esm/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareDocumentPosition(nodeA: AnyNode, nodeB: AnyNode): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentPosition")(nodeA.asInstanceOf[js.Any], nodeB.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def removeSubsets(nodes: js.Array[AnyNode]): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeSubsets")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  
  inline def uniqueSort[T /* <: AnyNode */](nodes: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("uniqueSort")(nodes.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.domutils.domutilsInts.`1`
    - typingsJapgolly.domutils.domutilsInts.`2`
    - typingsJapgolly.domutils.domutilsInts.`4`
    - typingsJapgolly.domutils.domutilsInts.`8`
    - typingsJapgolly.domutils.domutilsInts.`16`
  */
  trait DocumentPosition extends StObject
  object DocumentPosition {
    
    inline def CONTAINED_BY: `16` = 16.asInstanceOf[`16`]
    
    inline def CONTAINS: `8` = 8.asInstanceOf[`8`]
    
    inline def DISCONNECTED: `1` = 1.asInstanceOf[`1`]
    
    inline def FOLLOWING: `4` = 4.asInstanceOf[`4`]
    
    inline def PRECEDING: `2` = 2.asInstanceOf[`2`]
  }
}
