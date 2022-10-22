package typingsJapgolly.crocks.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sum {
  
  @JSImport("crocks", "Sum.default")
  @js.native
  open class default ()
    extends typingsJapgolly.crocks.sumMod.default
  object default {
    
    inline def apply(`val`: scala.Any): typingsJapgolly.crocks.sumSumMod.Sum = ^.asInstanceOf[js.Dynamic].apply(`val`.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.crocks.sumSumMod.Sum]
    
    @JSImport("crocks", "Sum.default")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def empty(): typingsJapgolly.crocks.sumSumMod.Sum = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[typingsJapgolly.crocks.sumSumMod.Sum]
  }
}
