package typingsJapgolly.babelTypes.mod

import typingsJapgolly.babelTypes.babelTypesStrings.AnyTypeAnnotation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.babelTypes.mod._Node because Already inherited */ trait AnyTypeAnnotation_
  extends Flow
     with BaseNode
     with FlowBaseAnnotation
     with FlowType {
  @JSName("type")
  var type_AnyTypeAnnotation_ : AnyTypeAnnotation
}

object AnyTypeAnnotation_ {
  @scala.inline
  def apply(
    `type`: AnyTypeAnnotation,
    end: Int | Double = null,
    innerComments: js.Array[Comment] = null,
    leadingComments: js.Array[Comment] = null,
    loc: SourceLocation = null,
    start: Int | Double = null,
    trailingComments: js.Array[Comment] = null
  ): AnyTypeAnnotation_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (innerComments != null) __obj.updateDynamic("innerComments")(innerComments.asInstanceOf[js.Any])
    if (leadingComments != null) __obj.updateDynamic("leadingComments")(leadingComments.asInstanceOf[js.Any])
    if (loc != null) __obj.updateDynamic("loc")(loc.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (trailingComments != null) __obj.updateDynamic("trailingComments")(trailingComments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyTypeAnnotation_]
  }
}

