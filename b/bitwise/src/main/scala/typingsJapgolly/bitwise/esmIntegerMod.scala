package typingsJapgolly.bitwise

import typingsJapgolly.bitwise.typesMod.Bit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmIntegerMod {
  
  @JSImport("bitwise/esm/integer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("bitwise/esm/integer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def getBit(int32: Double, position: Double): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def setBit(int32: Double, position: Double, value: Bit): Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Bit]
    
    inline def toggleBit(int32: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  inline def getBit(int32: Double, position: Double): typingsJapgolly.bitwise.esmTypesMod.Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("getBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def setBit(int32: Double, position: Double, value: typingsJapgolly.bitwise.esmTypesMod.Bit): typingsJapgolly.bitwise.esmTypesMod.Bit = (^.asInstanceOf[js.Dynamic].applyDynamic("setBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.bitwise.esmTypesMod.Bit]
  
  inline def toggleBit(int32: Double, position: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleBit")(int32.asInstanceOf[js.Any], position.asInstanceOf[js.Any])).asInstanceOf[Double]
}
