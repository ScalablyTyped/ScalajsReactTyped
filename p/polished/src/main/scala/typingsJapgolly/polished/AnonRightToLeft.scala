package typingsJapgolly.polished

import typingsJapgolly.polished.polishedNumbers.`0`
import typingsJapgolly.polished.polishedNumbers.`2`
import typingsJapgolly.polished.polishedStrings.Plussign
import typingsJapgolly.polished.polishedStrings.infix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRightToLeft extends js.Object {
  var argCount: `2`
  var f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify addition */ js.Any
  var notation: infix
  var precedence: `2`
  var rightToLeft: `0`
  var symbol: Plussign
}

object AnonRightToLeft {
  @scala.inline
  def apply(
    argCount: `2`,
    f: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify addition */ js.Any,
    notation: infix,
    precedence: `2`,
    rightToLeft: `0`,
    symbol: Plussign
  ): AnonRightToLeft = {
    val __obj = js.Dynamic.literal(argCount = argCount.asInstanceOf[js.Any], f = f.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], precedence = precedence.asInstanceOf[js.Any], rightToLeft = rightToLeft.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRightToLeft]
  }
}

