package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bits
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmStringMod {
  
  @JSImport("bitwise/esm/string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/string", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def toBits(string: String): Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[Bits]
  }
  
  inline def toBits(string: String): typingsJapgolly.bitwise.esmTypesMod.Bits = ^.asInstanceOf[js.Dynamic].applyDynamic("toBits")(string.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bits]
}
