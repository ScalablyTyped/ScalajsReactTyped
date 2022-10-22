package typingsJapgolly.convertUnits

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object convert {
    
    inline def apply(): typingsJapgolly.convertUnits.mod.Convert = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typingsJapgolly.convertUnits.mod.Convert]
    inline def apply(value: Double): typingsJapgolly.convertUnits.mod.Convert = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.convertUnits.mod.Convert]
    
    @JSGlobal("convert")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("convert.Convert")
    @js.native
    open class Convert protected ()
      extends typingsJapgolly.convertUnits.mod.Convert {
      def this(numerator: Double, denominator: Double) = this()
    }
  }
}
