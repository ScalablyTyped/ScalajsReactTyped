package typingsJapgolly.polished

import typingsJapgolly.polished.polishedNumbers.`0`
import typingsJapgolly.polished.polishedNumbers.`1`
import typingsJapgolly.polished.polishedNumbers.`2`
import typingsJapgolly.polished.polishedStrings.Comma
import typingsJapgolly.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrecedenceRightToLeft extends js.Object {
  var argCount: `2`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any
  var notation: infix
  var precedence: `1`
  var rightToLeft: `0`
  var symbol: Comma
}

object AnonPrecedenceRightToLeft {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify comma */ js.Any,
    notation: infix,
    precedence: `1`,
    rightToLeft: `0`,
    symbol: Comma
  ): AnonPrecedenceRightToLeft = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPrecedenceRightToLeft]
  }
}

