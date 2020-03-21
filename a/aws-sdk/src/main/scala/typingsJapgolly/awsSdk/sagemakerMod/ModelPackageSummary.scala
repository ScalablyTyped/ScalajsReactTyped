package typingsJapgolly.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModelPackageSummary extends js.Object {
  /**
    * A timestamp that shows when the model package was created.
    */
  var CreationTime: js.Date = js.native
  /**
    * The Amazon Resource Name (ARN) of the model package.
    */
  var ModelPackageArn: typingsJapgolly.awsSdk.sagemakerMod.ModelPackageArn = js.native
  /**
    * A brief description of the model package.
    */
  var ModelPackageDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the model package.
    */
  var ModelPackageName: EntityName = js.native
  /**
    * The overall status of the model package.
    */
  var ModelPackageStatus: typingsJapgolly.awsSdk.sagemakerMod.ModelPackageStatus = js.native
}

object ModelPackageSummary {
  @scala.inline
  def apply(
    CreationTime: js.Date,
    ModelPackageArn: ModelPackageArn,
    ModelPackageName: EntityName,
    ModelPackageStatus: ModelPackageStatus,
    ModelPackageDescription: EntityDescription = null
  ): ModelPackageSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelPackageArn = ModelPackageArn.asInstanceOf[js.Any], ModelPackageName = ModelPackageName.asInstanceOf[js.Any], ModelPackageStatus = ModelPackageStatus.asInstanceOf[js.Any])
    if (ModelPackageDescription != null) __obj.updateDynamic("ModelPackageDescription")(ModelPackageDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelPackageSummary]
  }
}

