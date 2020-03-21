package typingsJapgolly.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Activation extends js.Object {
  /**
    * The ID created by Systems Manager when you submitted the activation.
    */
  var ActivationId: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.ActivationId] = js.native
  /**
    * The date the activation was created.
    */
  var CreatedDate: js.UndefOr[js.Date] = js.native
  /**
    * A name for the managed instance when it is created.
    */
  var DefaultInstanceName: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.DefaultInstanceName] = js.native
  /**
    * A user defined description of the activation.
    */
  var Description: js.UndefOr[ActivationDescription] = js.native
  /**
    * The date when this activation can no longer be used to register managed instances.
    */
  var ExpirationDate: js.UndefOr[js.Date] = js.native
  /**
    * Whether or not the activation is expired.
    */
  var Expired: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Identity and Access Management (IAM) role to assign to the managed instance.
    */
  var IamRole: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.IamRole] = js.native
  /**
    * The maximum number of managed instances that can be registered using this activation.
    */
  var RegistrationLimit: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.RegistrationLimit] = js.native
  /**
    * The number of managed instances already registered with this activation.
    */
  var RegistrationsCount: js.UndefOr[typingsJapgolly.awsSdk.ssmMod.RegistrationsCount] = js.native
  /**
    * Tags assigned to the activation.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object Activation {
  @scala.inline
  def apply(
    ActivationId: ActivationId = null,
    CreatedDate: js.Date = null,
    DefaultInstanceName: DefaultInstanceName = null,
    Description: ActivationDescription = null,
    ExpirationDate: js.Date = null,
    Expired: js.UndefOr[scala.Boolean] = js.undefined,
    IamRole: IamRole = null,
    RegistrationLimit: Int | Double = null,
    RegistrationsCount: Int | Double = null,
    Tags: TagList = null
  ): Activation = {
    val __obj = js.Dynamic.literal()
    if (ActivationId != null) __obj.updateDynamic("ActivationId")(ActivationId.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DefaultInstanceName != null) __obj.updateDynamic("DefaultInstanceName")(DefaultInstanceName.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ExpirationDate != null) __obj.updateDynamic("ExpirationDate")(ExpirationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(Expired)) __obj.updateDynamic("Expired")(Expired.asInstanceOf[js.Any])
    if (IamRole != null) __obj.updateDynamic("IamRole")(IamRole.asInstanceOf[js.Any])
    if (RegistrationLimit != null) __obj.updateDynamic("RegistrationLimit")(RegistrationLimit.asInstanceOf[js.Any])
    if (RegistrationsCount != null) __obj.updateDynamic("RegistrationsCount")(RegistrationsCount.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activation]
  }
}

