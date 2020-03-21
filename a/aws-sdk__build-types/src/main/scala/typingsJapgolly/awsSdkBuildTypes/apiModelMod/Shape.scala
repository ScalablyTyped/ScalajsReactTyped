package typingsJapgolly.awsSdkBuildTypes.apiModelMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.blob
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.boolean
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.byte
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.character
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.double
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.float
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.input
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.integer
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.list
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.long
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.map
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.output
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.short
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.string
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.structure
import typingsJapgolly.awsSdkBuildTypes.awsSdkBuildTypesStrings.timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Blob
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Boolean
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Byte
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Character
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Double
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Float
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Integer
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.List
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Long
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Map
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Short
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.String
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Structure
  - typingsJapgolly.awsSdkBuildTypes.apiModelMod.Timestamp
*/
trait Shape extends js.Object

object Shape {
  @scala.inline
  def Blob(
    `type`: blob,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    streaming: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (!js.isUndefined(streaming)) __obj.updateDynamic("streaming")(streaming.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Byte(
    `type`: byte,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Float(
    `type`: float,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Structure(
    members: StringDictionary[StructureMember],
    `type`: structure,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    error: Error = null,
    exception: js.UndefOr[scala.Boolean] = js.undefined,
    fault: js.UndefOr[scala.Boolean] = js.undefined,
    payload: java.lang.String = null,
    required: js.Array[java.lang.String] = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    topLevel: input | output = null
  ): Shape = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (!js.isUndefined(exception)) __obj.updateDynamic("exception")(exception.asInstanceOf[js.Any])
    if (!js.isUndefined(fault)) __obj.updateDynamic("fault")(fault.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (topLevel != null) __obj.updateDynamic("topLevel")(topLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def String(
    `type`: string,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    enum: js.Array[java.lang.String] = null,
    idempotencyToken: js.UndefOr[scala.Boolean] = js.undefined,
    jsonValue: js.UndefOr[scala.Boolean] = js.undefined,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    pattern: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (!js.isUndefined(idempotencyToken)) __obj.updateDynamic("idempotencyToken")(idempotencyToken.asInstanceOf[js.Any])
    if (!js.isUndefined(jsonValue)) __obj.updateDynamic("jsonValue")(jsonValue.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def List(
    member: Member,
    `type`: list,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal(member = member.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Integer(
    `type`: integer,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Boolean(
    `type`: boolean,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Timestamp(
    `type`: timestamp,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined,
    timestampFormat: java.lang.String = null
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    if (timestampFormat != null) __obj.updateDynamic("timestampFormat")(timestampFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Double(
    `type`: double,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Long(
    `type`: long,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Map(
    key: Member,
    `type`: map,
    value: Member,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    flattened: js.UndefOr[scala.Boolean] = js.undefined,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(flattened)) __obj.updateDynamic("flattened")(flattened.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Short(
    `type`: short,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    max: Int | scala.Double = null,
    min: Int | scala.Double = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
  @scala.inline
  def Character(
    `type`: character,
    deprecated: js.UndefOr[scala.Boolean] = js.undefined,
    documentation: java.lang.String = null,
    sensitive: js.UndefOr[scala.Boolean] = js.undefined
  ): Shape = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(deprecated)) __obj.updateDynamic("deprecated")(deprecated.asInstanceOf[js.Any])
    if (documentation != null) __obj.updateDynamic("documentation")(documentation.asInstanceOf[js.Any])
    if (!js.isUndefined(sensitive)) __obj.updateDynamic("sensitive")(sensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Shape]
  }
}

