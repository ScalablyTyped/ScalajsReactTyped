package typingsJapgolly.polished

import typingsJapgolly.polished.polishedNumbers.`1`
import typingsJapgolly.polished.polishedNumbers.`2`
import typingsJapgolly.polished.polishedNumbers.`5`
import typingsJapgolly.polished.polishedStrings.^
import typingsJapgolly.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonF extends js.Object {
  var argCount: `2`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify power */ js.Any
  var notation: infix
  var precedence: `5`
  var rightToLeft: `1`
  var symbol: ^
}

object AnonF {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify power */ js.Any,
    notation: infix,
    precedence: `5`,
    rightToLeft: `1`,
    symbol: ^
  ): AnonF = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonF]
  }
}

