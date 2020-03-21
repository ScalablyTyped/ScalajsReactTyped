package typingsJapgolly.solidityParserAntlr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitStatement
  extends BaseASTNode
     with ASTNode
     with Statement {
  var eventCall: FunctionCall
  @JSName("type")
  var type_EmitStatement: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement
}

object EmitStatement {
  @scala.inline
  def apply(
    eventCall: FunctionCall,
    `type`: typingsJapgolly.solidityParserAntlr.solidityParserAntlrStrings.EmitStatement,
    loc: Location = null,
    range: js.Tuple2[Double, Double] = null
  ): EmitStatement = {
    val __obj = js.Dynamic.literal(eventCall = eventCall.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitStatement]
  }
}

