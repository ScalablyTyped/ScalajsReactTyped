package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikInts.`0`
import typingsJapgolly.qlik.qlikInts.`10`
import typingsJapgolly.qlik.qlikInts.`11`
import typingsJapgolly.qlik.qlikInts.`12`
import typingsJapgolly.qlik.qlikInts.`13`
import typingsJapgolly.qlik.qlikInts.`14`
import typingsJapgolly.qlik.qlikInts.`15`
import typingsJapgolly.qlik.qlikInts.`1`
import typingsJapgolly.qlik.qlikInts.`2`
import typingsJapgolly.qlik.qlikInts.`3`
import typingsJapgolly.qlik.qlikInts.`4`
import typingsJapgolly.qlik.qlikInts.`5`
import typingsJapgolly.qlik.qlikInts.`6`
import typingsJapgolly.qlik.qlikInts.`7`
import typingsJapgolly.qlik.qlikInts.`8`
import typingsJapgolly.qlik.qlikInts.`9`
import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.D
import typingsJapgolly.qlik.qlikStrings.F
import typingsJapgolly.qlik.qlikStrings.I
import typingsJapgolly.qlik.qlikStrings.IV
import typingsJapgolly.qlik.qlikStrings.M
import typingsJapgolly.qlik.qlikStrings.R
import typingsJapgolly.qlik.qlikStrings.T
import typingsJapgolly.qlik.qlikStrings.TS
import typingsJapgolly.qlik.qlikStrings.U
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldAttributes extends StObject {
  
  var qDec: String
  
  var qFmt: String
  
  var qSAFEARRAY: js.Array[Any]
  
  var qThou: String
  
  var qType: U | A | I | R | F | M | D | T | TS | IV
  
  var qUseThou: `0` | `1`
  
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
}
object FieldAttributes {
  
  inline def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[Any],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldAttributes]
  }
  
  extension [Self <: FieldAttributes](x: Self) {
    
    inline def setQDec(value: String): Self = StObject.set(x, "qDec", value.asInstanceOf[js.Any])
    
    inline def setQFmt(value: String): Self = StObject.set(x, "qFmt", value.asInstanceOf[js.Any])
    
    inline def setQSAFEARRAY(value: js.Array[Any]): Self = StObject.set(x, "qSAFEARRAY", value.asInstanceOf[js.Any])
    
    inline def setQSAFEARRAYVarargs(value: Any*): Self = StObject.set(x, "qSAFEARRAY", js.Array(value*))
    
    inline def setQThou(value: String): Self = StObject.set(x, "qThou", value.asInstanceOf[js.Any])
    
    inline def setQType(value: U | A | I | R | F | M | D | T | TS | IV): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQUseThou(value: `0` | `1`): Self = StObject.set(x, "qUseThou", value.asInstanceOf[js.Any])
    
    inline def setQnDec(
      value: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
    ): Self = StObject.set(x, "qnDec", value.asInstanceOf[js.Any])
  }
}
