package typingsJapgolly.awsSdk.ecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterContainerInstanceRequest extends js.Object {
  /**
    * The container instance attributes that this container instance supports.
    */
  var attributes: js.UndefOr[Attributes] = js.native
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster with which to register your container instance. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.native
  /**
    * The ARN of the container instance (if it was previously registered).
    */
  var containerInstanceArn: js.UndefOr[String] = js.native
  /**
    * The instance identity document for the EC2 instance to register. This document can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/document/ 
    */
  var instanceIdentityDocument: js.UndefOr[String] = js.native
  /**
    * The instance identity document signature for the EC2 instance to register. This signature can be found by running the following command from the instance: curl http://169.254.169.254/latest/dynamic/instance-identity/signature/ 
    */
  var instanceIdentityDocumentSignature: js.UndefOr[String] = js.native
  /**
    * The devices that are available on the container instance. The only supported device type is a GPU.
    */
  var platformDevices: js.UndefOr[PlatformDevices] = js.native
  /**
    * The metadata that you apply to the container instance to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8   Maximum value length - 256 Unicode characters in UTF-8   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case-sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this prefix. Tags with this prefix do not count against your tags per resource limit.  
    */
  var tags: js.UndefOr[Tags] = js.native
  /**
    * The resources available on the instance.
    */
  var totalResources: js.UndefOr[Resources] = js.native
  /**
    * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
    */
  var versionInfo: js.UndefOr[VersionInfo] = js.native
}

object RegisterContainerInstanceRequest {
  @scala.inline
  def apply(
    attributes: Attributes = null,
    cluster: String = null,
    containerInstanceArn: String = null,
    instanceIdentityDocument: String = null,
    instanceIdentityDocumentSignature: String = null,
    platformDevices: PlatformDevices = null,
    tags: Tags = null,
    totalResources: Resources = null,
    versionInfo: VersionInfo = null
  ): RegisterContainerInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (containerInstanceArn != null) __obj.updateDynamic("containerInstanceArn")(containerInstanceArn.asInstanceOf[js.Any])
    if (instanceIdentityDocument != null) __obj.updateDynamic("instanceIdentityDocument")(instanceIdentityDocument.asInstanceOf[js.Any])
    if (instanceIdentityDocumentSignature != null) __obj.updateDynamic("instanceIdentityDocumentSignature")(instanceIdentityDocumentSignature.asInstanceOf[js.Any])
    if (platformDevices != null) __obj.updateDynamic("platformDevices")(platformDevices.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (totalResources != null) __obj.updateDynamic("totalResources")(totalResources.asInstanceOf[js.Any])
    if (versionInfo != null) __obj.updateDynamic("versionInfo")(versionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterContainerInstanceRequest]
  }
}

