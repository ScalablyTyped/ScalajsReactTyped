package typingsJapgolly.nbind

import typingsJapgolly.nbind.nbindInts.`0`
import typingsJapgolly.nbind.nbindInts.`1`
import typingsJapgolly.nbind.nbindInts.`2`
import typingsJapgolly.nbind.nbindInts.`3`
import typingsJapgolly.nbind.nbindInts.`4`
import typingsJapgolly.nbind.nbindInts.`5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonMod {
  
  @JSImport("nbind/dist/common", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def removeAccessorPrefix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeAccessorPrefix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nbind.nbindInts.`0`
    - typingsJapgolly.nbind.nbindInts.`1`
    - typingsJapgolly.nbind.nbindInts.`2`
    - typingsJapgolly.nbind.nbindInts.`3`
    - typingsJapgolly.nbind.nbindInts.`4`
    - typingsJapgolly.nbind.nbindInts.`5`
  */
  trait SignatureType extends StObject
  object SignatureType {
    
    inline def construct: `5` = 5.asInstanceOf[`5`]
    
    inline def func: `1` = 1.asInstanceOf[`1`]
    
    inline def getter: `3` = 3.asInstanceOf[`3`]
    
    inline def method: `2` = 2.asInstanceOf[`2`]
    
    inline def none: `0` = 0.asInstanceOf[`0`]
    
    inline def setter: `4` = 4.asInstanceOf[`4`]
  }
}
