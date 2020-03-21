package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikNumbers.`0`
import typingsJapgolly.qlik.qlikNumbers.`10`
import typingsJapgolly.qlik.qlikNumbers.`11`
import typingsJapgolly.qlik.qlikNumbers.`12`
import typingsJapgolly.qlik.qlikNumbers.`13`
import typingsJapgolly.qlik.qlikNumbers.`14`
import typingsJapgolly.qlik.qlikNumbers.`15`
import typingsJapgolly.qlik.qlikNumbers.`1`
import typingsJapgolly.qlik.qlikNumbers.`2`
import typingsJapgolly.qlik.qlikNumbers.`3`
import typingsJapgolly.qlik.qlikNumbers.`4`
import typingsJapgolly.qlik.qlikNumbers.`5`
import typingsJapgolly.qlik.qlikNumbers.`6`
import typingsJapgolly.qlik.qlikNumbers.`7`
import typingsJapgolly.qlik.qlikNumbers.`8`
import typingsJapgolly.qlik.qlikNumbers.`9`
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldAttributes extends js.Object {
  var qDec: String
  var qFmt: String
  var qSAFEARRAY: js.Array[_]
  var qThou: String
  var qType: U | A | I | R | F | M | D | T | TS | IV
  var qUseThou: `0` | `1`
  var qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
}

object FieldAttributes {
  @scala.inline
  def apply(
    qDec: String,
    qFmt: String,
    qSAFEARRAY: js.Array[_],
    qThou: String,
    qType: U | A | I | R | F | M | D | T | TS | IV,
    qUseThou: `0` | `1`,
    qnDec: `0` | `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9` | `10` | `11` | `12` | `13` | `14` | `15`
  ): FieldAttributes = {
    val __obj = js.Dynamic.literal(qDec = qDec.asInstanceOf[js.Any], qFmt = qFmt.asInstanceOf[js.Any], qSAFEARRAY = qSAFEARRAY.asInstanceOf[js.Any], qThou = qThou.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any], qUseThou = qUseThou.asInstanceOf[js.Any], qnDec = qnDec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FieldAttributes]
  }
}

