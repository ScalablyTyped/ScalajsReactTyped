package typingsJapgolly.romans

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("romans", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("romans", "allChars")
  @js.native
  val allChars: js.Array[RomanCharacter] = js.native
  
  @JSImport("romans", "allNumerals")
  @js.native
  val allNumerals: js.Array[RomanNumeral] = js.native
  
  inline def deromanize(romanStr: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("deromanize")(romanStr.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def romanize(decimal: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("romanize")(decimal.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* keyof romans.anon.C */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.romans.romansStrings.M
    - typingsJapgolly.romans.romansStrings.CM
    - typingsJapgolly.romans.romansStrings.D
    - typingsJapgolly.romans.romansStrings.CD
    - typingsJapgolly.romans.romansStrings.C
    - typingsJapgolly.romans.romansStrings.XC
    - typingsJapgolly.romans.romansStrings.L
    - typingsJapgolly.romans.romansStrings.XL
    - typingsJapgolly.romans.romansStrings.X
    - typingsJapgolly.romans.romansStrings.IX
    - typingsJapgolly.romans.romansStrings.V
    - typingsJapgolly.romans.romansStrings.IV
    - typingsJapgolly.romans.romansStrings.I
  */
  trait RomanCharacter extends StObject
  
  /* Inlined {  M :1000,   CM :900,   D :500,   CD :400,   C :100,   XC :90,   L :50,   XL :40,   X :10,   IX :9,   V :5,   IV :4,   I :1}[romans.romans.RomanCharacter] */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.romans.romansInts.`400`
    - typingsJapgolly.romans.romansInts.`500`
    - typingsJapgolly.romans.romansInts.`1000`
    - typingsJapgolly.romans.romansInts.`4`
    - typingsJapgolly.romans.romansInts.`900`
    - typingsJapgolly.romans.romansInts.`5`
    - typingsJapgolly.romans.romansInts.`100`
    - typingsJapgolly.romans.romansInts.`50`
    - typingsJapgolly.romans.romansInts.`10`
    - typingsJapgolly.romans.romansInts.`9`
    - typingsJapgolly.romans.romansInts.`40`
    - typingsJapgolly.romans.romansInts.`90`
    - typingsJapgolly.romans.romansInts.`1`
  */
  trait RomanNumeral extends StObject
  object RomanNumeral {
    
    inline def `1`: typingsJapgolly.romans.romansInts.`1` = 1.asInstanceOf[typingsJapgolly.romans.romansInts.`1`]
    
    inline def `10`: typingsJapgolly.romans.romansInts.`10` = 10.asInstanceOf[typingsJapgolly.romans.romansInts.`10`]
    
    inline def `100`: typingsJapgolly.romans.romansInts.`100` = 100.asInstanceOf[typingsJapgolly.romans.romansInts.`100`]
    
    inline def `1000`: typingsJapgolly.romans.romansInts.`1000` = 1000.asInstanceOf[typingsJapgolly.romans.romansInts.`1000`]
    
    inline def `4`: typingsJapgolly.romans.romansInts.`4` = 4.asInstanceOf[typingsJapgolly.romans.romansInts.`4`]
    
    inline def `40`: typingsJapgolly.romans.romansInts.`40` = 40.asInstanceOf[typingsJapgolly.romans.romansInts.`40`]
    
    inline def `400`: typingsJapgolly.romans.romansInts.`400` = 400.asInstanceOf[typingsJapgolly.romans.romansInts.`400`]
    
    inline def `5`: typingsJapgolly.romans.romansInts.`5` = 5.asInstanceOf[typingsJapgolly.romans.romansInts.`5`]
    
    inline def `50`: typingsJapgolly.romans.romansInts.`50` = 50.asInstanceOf[typingsJapgolly.romans.romansInts.`50`]
    
    inline def `500`: typingsJapgolly.romans.romansInts.`500` = 500.asInstanceOf[typingsJapgolly.romans.romansInts.`500`]
    
    inline def `9`: typingsJapgolly.romans.romansInts.`9` = 9.asInstanceOf[typingsJapgolly.romans.romansInts.`9`]
    
    inline def `90`: typingsJapgolly.romans.romansInts.`90` = 90.asInstanceOf[typingsJapgolly.romans.romansInts.`90`]
    
    inline def `900`: typingsJapgolly.romans.romansInts.`900` = 900.asInstanceOf[typingsJapgolly.romans.romansInts.`900`]
  }
}
