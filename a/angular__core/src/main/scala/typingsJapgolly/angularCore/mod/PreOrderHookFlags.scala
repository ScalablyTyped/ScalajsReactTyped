package typingsJapgolly.angularCore.mod

import typingsJapgolly.angularCore.angularCoreDoubles.`4294901760`
import typingsJapgolly.angularCore.angularCoreInts.`16`
import typingsJapgolly.angularCore.angularCoreInts.`65535`
import typingsJapgolly.angularCore.angularCoreInts.`65536`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** More flags associated with an LView (saved in LView[PREORDER_HOOK_FLAGS]) */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.angularCore.angularCoreInts.`65535`
  - typingsJapgolly.angularCore.angularCoreInts.`65536`
  - typingsJapgolly.angularCore.angularCoreInts.`16`
  - typingsJapgolly.angularCore.angularCoreDoubles.`4294901760`
*/
trait PreOrderHookFlags extends StObject
object PreOrderHookFlags {
  
  /**
    The index of the next pre-order hook to be called in the hooks array, on the first 16
    bits
    */
  inline def IndexOfTheNextPreOrderHookMaskMask: `65535` = 65535.asInstanceOf[`65535`]
  
  /**
    * The number of init hooks that have already been called, on the last 16 bits
    */
  inline def NumberOfInitHooksCalledIncrementer: `65536` = 65536.asInstanceOf[`65536`]
  
  inline def NumberOfInitHooksCalledMask: `4294901760` = 4294901760d.asInstanceOf[`4294901760`]
  
  inline def NumberOfInitHooksCalledShift: `16` = 16.asInstanceOf[`16`]
}
