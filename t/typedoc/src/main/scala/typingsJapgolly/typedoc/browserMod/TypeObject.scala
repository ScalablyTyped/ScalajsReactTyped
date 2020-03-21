package typingsJapgolly.typedoc.browserMod

import typingsJapgolly.typedoc.typedocStrings.Object
import typingsJapgolly.typedoc.typedocStrings.`this`
import typingsJapgolly.typedoc.typedocStrings.array
import typingsJapgolly.typedoc.typedocStrings.boolean
import typingsJapgolly.typedoc.typedocStrings.intersection
import typingsJapgolly.typedoc.typedocStrings.intrinsic
import typingsJapgolly.typedoc.typedocStrings.number
import typingsJapgolly.typedoc.typedocStrings.reference
import typingsJapgolly.typedoc.typedocStrings.reflection
import typingsJapgolly.typedoc.typedocStrings.string
import typingsJapgolly.typedoc.typedocStrings.stringLiteral
import typingsJapgolly.typedoc.typedocStrings.tuple
import typingsJapgolly.typedoc.typedocStrings.typeParameter
import typingsJapgolly.typedoc.typedocStrings.union
import typingsJapgolly.typedoc.typedocStrings.unknown
import typingsJapgolly.typedoc.typedocStrings.void
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeObject extends js.Object {
  var constraint: js.UndefOr[TypeObject] = js.undefined
  var declaration: js.UndefOr[ReflectionObject] = js.undefined
  var elementType: js.UndefOr[TypeObject] = js.undefined
  var elements: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var id: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[Object | string | number | boolean | `this` | String] = js.undefined
  var `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String
  var typeArguments: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var types: js.UndefOr[js.Array[TypeObject]] = js.undefined
  var value: js.UndefOr[String] = js.undefined
}

object TypeObject {
  @scala.inline
  def apply(
    `type`: void | array | intersection | intrinsic | reference | reflection | stringLiteral | tuple | typeParameter | union | unknown | String,
    constraint: TypeObject = null,
    declaration: ReflectionObject = null,
    elementType: TypeObject = null,
    elements: js.Array[TypeObject] = null,
    id: Int | Double = null,
    name: Object | string | number | boolean | `this` | String = null,
    typeArguments: js.Array[TypeObject] = null,
    types: js.Array[TypeObject] = null,
    value: String = null
  ): TypeObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (constraint != null) __obj.updateDynamic("constraint")(constraint.asInstanceOf[js.Any])
    if (declaration != null) __obj.updateDynamic("declaration")(declaration.asInstanceOf[js.Any])
    if (elementType != null) __obj.updateDynamic("elementType")(elementType.asInstanceOf[js.Any])
    if (elements != null) __obj.updateDynamic("elements")(elements.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (typeArguments != null) __obj.updateDynamic("typeArguments")(typeArguments.asInstanceOf[js.Any])
    if (types != null) __obj.updateDynamic("types")(types.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeObject]
  }
}

