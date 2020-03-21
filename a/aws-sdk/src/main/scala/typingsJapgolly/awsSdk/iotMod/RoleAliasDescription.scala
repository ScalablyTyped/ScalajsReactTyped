package typingsJapgolly.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RoleAliasDescription extends js.Object {
  /**
    * The UNIX timestamp of when the role alias was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.native
  /**
    * The number of seconds for which the credential is valid.
    */
  var credentialDurationSeconds: js.UndefOr[CredentialDurationSeconds] = js.native
  /**
    * The UNIX timestamp of when the role alias was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.native
  /**
    * The role alias owner.
    */
  var owner: js.UndefOr[AwsAccountId] = js.native
  /**
    * The role alias.
    */
  var roleAlias: js.UndefOr[RoleAlias] = js.native
  /**
    * The ARN of the role alias.
    */
  var roleAliasArn: js.UndefOr[RoleAliasArn] = js.native
  /**
    * The role ARN.
    */
  var roleArn: js.UndefOr[RoleArn] = js.native
}

object RoleAliasDescription {
  @scala.inline
  def apply(
    creationDate: js.Date = null,
    credentialDurationSeconds: Int | Double = null,
    lastModifiedDate: js.Date = null,
    owner: AwsAccountId = null,
    roleAlias: RoleAlias = null,
    roleAliasArn: RoleAliasArn = null,
    roleArn: RoleArn = null
  ): RoleAliasDescription = {
    val __obj = js.Dynamic.literal()
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (credentialDurationSeconds != null) __obj.updateDynamic("credentialDurationSeconds")(credentialDurationSeconds.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (owner != null) __obj.updateDynamic("owner")(owner.asInstanceOf[js.Any])
    if (roleAlias != null) __obj.updateDynamic("roleAlias")(roleAlias.asInstanceOf[js.Any])
    if (roleAliasArn != null) __obj.updateDynamic("roleAliasArn")(roleAliasArn.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleAliasDescription]
  }
}

