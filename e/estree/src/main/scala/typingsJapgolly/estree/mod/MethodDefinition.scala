package typingsJapgolly.estree.mod

import typingsJapgolly.estree.estreeStrings.constructor
import typingsJapgolly.estree.estreeStrings.get
import typingsJapgolly.estree.estreeStrings.method
import typingsJapgolly.estree.estreeStrings.set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MethodDefinition
  extends BaseNode
     with Node {
  var computed: Boolean
  var key: Expression
  var kind: constructor | method | get | set
  var static: Boolean
  @JSName("type")
  var type_MethodDefinition: typingsJapgolly.estree.estreeStrings.MethodDefinition
  var value: FunctionExpression
}

object MethodDefinition {
  @scala.inline
  def apply(
    computed: Boolean,
    key: Expression,
    kind: constructor | method | get | set,
    static: Boolean,
    `type`: typingsJapgolly.estree.estreeStrings.MethodDefinition,
    value: FunctionExpression,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    range: js.Tuple2[Double, Double] = null,
    trailingComments: js.Array[Comment] = null
  ): MethodDefinition = {
    val __obj = js.Dynamic.literal(computed = computed.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], static = static.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[MethodDefinition]
  }
}

