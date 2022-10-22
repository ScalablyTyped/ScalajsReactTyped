package typingsJapgolly.rotJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDisplayTermMod {
  
  @JSImport("rot-js/lib/display/term", JSImport.Default)
  @js.native
  open class default () extends Term
  
  @js.native
  trait Term
    extends typingsJapgolly.rotJs.libDisplayBackendMod.default {
    
    var _cursor: js.Tuple2[Double, Double] = js.native
    
    var _lastColor: String = js.native
    
    var _offset: js.Tuple2[Double, Double] = js.native
    
    def computeFontSize(): Double = js.native
    
    def computeSize(): js.Tuple2[Double, Double] = js.native
  }
}
