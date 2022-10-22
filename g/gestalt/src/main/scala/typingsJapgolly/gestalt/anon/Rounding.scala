package typingsJapgolly.gestalt.anon

import typingsJapgolly.gestalt.gestaltInts.`3`
import typingsJapgolly.gestalt.gestaltInts.`4`
import typingsJapgolly.gestalt.gestaltInts.`5`
import typingsJapgolly.gestalt.gestaltInts.`6`
import typingsJapgolly.gestalt.gestaltInts.`7`
import typingsJapgolly.gestalt.gestaltInts.`8`
import typingsJapgolly.gestalt.gestaltStrings.circle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rounding extends StObject {
  
  var rounding: circle | typingsJapgolly.gestalt.gestaltInts.`0` | typingsJapgolly.gestalt.gestaltInts.`1` | typingsJapgolly.gestalt.gestaltInts.`2` | `3` | `4` | `5` | `6` | `7` | `8`
  
  var wash: Boolean
}
object Rounding {
  
  inline def apply(
    rounding: circle | typingsJapgolly.gestalt.gestaltInts.`0` | typingsJapgolly.gestalt.gestaltInts.`1` | typingsJapgolly.gestalt.gestaltInts.`2` | `3` | `4` | `5` | `6` | `7` | `8`,
    wash: Boolean
  ): Rounding = {
    val __obj = js.Dynamic.literal(rounding = rounding.asInstanceOf[js.Any], wash = wash.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rounding]
  }
  
  extension [Self <: Rounding](x: Self) {
    
    inline def setRounding(
      value: circle | typingsJapgolly.gestalt.gestaltInts.`0` | typingsJapgolly.gestalt.gestaltInts.`1` | typingsJapgolly.gestalt.gestaltInts.`2` | `3` | `4` | `5` | `6` | `7` | `8`
    ): Self = StObject.set(x, "rounding", value.asInstanceOf[js.Any])
    
    inline def setWash(value: Boolean): Self = StObject.set(x, "wash", value.asInstanceOf[js.Any])
  }
}
