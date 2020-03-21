package typingsJapgolly.awsSdk.cloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetTypeDefaultVersionInput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the type for which you want version summary information. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Arn: js.UndefOr[PrivateTypeArn] = js.native
  /**
    * The kind of type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var Type: js.UndefOr[RegistryType] = js.native
  /**
    * The name of the type. Conditional: You must specify either TypeName and Type, or Arn.
    */
  var TypeName: js.UndefOr[typingsJapgolly.awsSdk.cloudformationMod.TypeName] = js.native
  /**
    * The ID of a specific version of the type. The version ID is the value at the end of the Amazon Resource Name (ARN) assigned to the type version when it is registered.
    */
  var VersionId: js.UndefOr[TypeVersionId] = js.native
}

object SetTypeDefaultVersionInput {
  @scala.inline
  def apply(
    Arn: PrivateTypeArn = null,
    Type: RegistryType = null,
    TypeName: TypeName = null,
    VersionId: TypeVersionId = null
  ): SetTypeDefaultVersionInput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (TypeName != null) __obj.updateDynamic("TypeName")(TypeName.asInstanceOf[js.Any])
    if (VersionId != null) __obj.updateDynamic("VersionId")(VersionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetTypeDefaultVersionInput]
  }
}

