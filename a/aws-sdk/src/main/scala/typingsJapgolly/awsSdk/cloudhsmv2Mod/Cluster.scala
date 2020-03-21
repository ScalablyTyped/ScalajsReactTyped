package typingsJapgolly.awsSdk.cloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cluster extends js.Object {
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.BackupPolicy] = js.native
  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  var Certificates: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.Certificates] = js.native
  /**
    * The cluster's identifier (ID).
    */
  var ClusterId: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.ClusterId] = js.native
  /**
    * The date and time when the cluster was created.
    */
  var CreateTimestamp: js.UndefOr[js.Date] = js.native
  /**
    * The type of HSM that the cluster contains.
    */
  var HsmType: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.HsmType] = js.native
  /**
    * Contains information about the HSMs in the cluster.
    */
  var Hsms: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.Hsms] = js.native
  /**
    * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
    */
  var PreCoPassword: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.PreCoPassword] = js.native
  /**
    * The identifier (ID) of the cluster's security group.
    */
  var SecurityGroup: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.SecurityGroup] = js.native
  /**
    * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.native
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.native
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.StateMessage] = js.native
  /**
    * A map from availability zone to the cluster’s subnet in that availability zone.
    */
  var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.native
  var TagList: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.TagList] = js.native
  /**
    * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
    */
  var VpcId: js.UndefOr[typingsJapgolly.awsSdk.cloudhsmv2Mod.VpcId] = js.native
}

object Cluster {
  @scala.inline
  def apply(
    BackupPolicy: BackupPolicy = null,
    Certificates: Certificates = null,
    ClusterId: ClusterId = null,
    CreateTimestamp: js.Date = null,
    HsmType: HsmType = null,
    Hsms: Hsms = null,
    PreCoPassword: PreCoPassword = null,
    SecurityGroup: SecurityGroup = null,
    SourceBackupId: BackupId = null,
    State: ClusterState = null,
    StateMessage: StateMessage = null,
    SubnetMapping: ExternalSubnetMapping = null,
    TagList: TagList = null,
    VpcId: VpcId = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (BackupPolicy != null) __obj.updateDynamic("BackupPolicy")(BackupPolicy.asInstanceOf[js.Any])
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp.asInstanceOf[js.Any])
    if (HsmType != null) __obj.updateDynamic("HsmType")(HsmType.asInstanceOf[js.Any])
    if (Hsms != null) __obj.updateDynamic("Hsms")(Hsms.asInstanceOf[js.Any])
    if (PreCoPassword != null) __obj.updateDynamic("PreCoPassword")(PreCoPassword.asInstanceOf[js.Any])
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup.asInstanceOf[js.Any])
    if (SourceBackupId != null) __obj.updateDynamic("SourceBackupId")(SourceBackupId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage.asInstanceOf[js.Any])
    if (SubnetMapping != null) __obj.updateDynamic("SubnetMapping")(SubnetMapping.asInstanceOf[js.Any])
    if (TagList != null) __obj.updateDynamic("TagList")(TagList.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cluster]
  }
}

