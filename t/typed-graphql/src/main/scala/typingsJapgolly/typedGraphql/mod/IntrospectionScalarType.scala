package typingsJapgolly.typedGraphql.mod

import typingsJapgolly.typedGraphql.typedGraphqlStrings.SCALAR
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntrospectionScalarType extends IntrospectionType {
  var description: js.UndefOr[String] = js.undefined
  var kind: SCALAR
  var name: String
}

object IntrospectionScalarType {
  @scala.inline
  def apply(kind: SCALAR, name: String, description: String = null): IntrospectionScalarType = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntrospectionScalarType]
  }
}

