package typingsJapgolly.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCachediSCSIVolumeInput extends StObject {
  
  /**
    * A unique identifier that you use to retry a request. If you retry a request, use the same ClientToken you specified in the initial request.
    */
  var ClientToken: typingsJapgolly.awsSdk.clientsStoragegatewayMod.ClientToken
  
  var GatewayARN: typingsJapgolly.awsSdk.clientsStoragegatewayMod.GatewayARN
  
  /**
    * Set to true to use Amazon S3 server-side encryption with your own KMS key, or false to use a key managed by Amazon S3. Optional. Valid Values: true | false 
    */
  var KMSEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of a symmetric customer master key (CMK) used for Amazon S3 server-side encryption. Storage Gateway does not support asymmetric CMKs. This value can only be set when KMSEncrypted is true. Optional.
    */
  var KMSKey: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.KMSKey] = js.undefined
  
  /**
    * The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted. Use DescribeGatewayInformation to get a list of the network interfaces available on a gateway. Valid Values: A valid IP address.
    */
  var NetworkInterfaceId: typingsJapgolly.awsSdk.clientsStoragegatewayMod.NetworkInterfaceId
  
  /**
    * The snapshot ID (e.g. "snap-1122aabb") of the snapshot to restore as the new cached volume. Specify this field if you want to create the iSCSI storage volume from a snapshot; otherwise, do not include this field. To list snapshots for your account use DescribeSnapshots in the Amazon Elastic Compute Cloud API Reference.
    */
  var SnapshotId: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.SnapshotId] = js.undefined
  
  /**
    * The ARN for an existing volume. Specifying this ARN makes the new volume into an exact copy of the specified existing volume's latest recovery point. The VolumeSizeInBytes value for this new volume must be equal to or larger than the size of the existing volume, in bytes.
    */
  var SourceVolumeARN: js.UndefOr[VolumeARN] = js.undefined
  
  /**
    * A list of up to 50 tags that you can assign to a cached volume. Each tag is a key-value pair.  Valid characters for key and value are letters, spaces, and numbers that you can represent in UTF-8 format, and the following special characters: + - = . _ : / @. The maximum length of a tag's key is 128 characters, and the maximum length for a tag's value is 256 characters. 
    */
  var Tags: js.UndefOr[typingsJapgolly.awsSdk.clientsStoragegatewayMod.Tags] = js.undefined
  
  /**
    * The name of the iSCSI target used by an initiator to connect to a volume and used as a suffix for the target ARN. For example, specifying TargetName as myvolume results in the target ARN of arn:aws:storagegateway:us-east-2:111122223333:gateway/sgw-12A3456B/target/iqn.1997-05.com.amazon:myvolume. The target name must be unique across all volumes on a gateway. If you don't specify a value, Storage Gateway uses the value that was previously used for this volume as the new target name.
    */
  var TargetName: typingsJapgolly.awsSdk.clientsStoragegatewayMod.TargetName
  
  /**
    * The size of the volume in bytes.
    */
  var VolumeSizeInBytes: long
}
object CreateCachediSCSIVolumeInput {
  
  inline def apply(
    ClientToken: ClientToken,
    GatewayARN: GatewayARN,
    NetworkInterfaceId: NetworkInterfaceId,
    TargetName: TargetName,
    VolumeSizeInBytes: long
  ): CreateCachediSCSIVolumeInput = {
    val __obj = js.Dynamic.literal(ClientToken = ClientToken.asInstanceOf[js.Any], GatewayARN = GatewayARN.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any], TargetName = TargetName.asInstanceOf[js.Any], VolumeSizeInBytes = VolumeSizeInBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachediSCSIVolumeInput]
  }
  
  extension [Self <: CreateCachediSCSIVolumeInput](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setKMSEncrypted(value: Boolean): Self = StObject.set(x, "KMSEncrypted", value.asInstanceOf[js.Any])
    
    inline def setKMSEncryptedUndefined: Self = StObject.set(x, "KMSEncrypted", js.undefined)
    
    inline def setKMSKey(value: KMSKey): Self = StObject.set(x, "KMSKey", value.asInstanceOf[js.Any])
    
    inline def setKMSKeyUndefined: Self = StObject.set(x, "KMSKey", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotId(value: SnapshotId): Self = StObject.set(x, "SnapshotId", value.asInstanceOf[js.Any])
    
    inline def setSnapshotIdUndefined: Self = StObject.set(x, "SnapshotId", js.undefined)
    
    inline def setSourceVolumeARN(value: VolumeARN): Self = StObject.set(x, "SourceVolumeARN", value.asInstanceOf[js.Any])
    
    inline def setSourceVolumeARNUndefined: Self = StObject.set(x, "SourceVolumeARN", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTargetName(value: TargetName): Self = StObject.set(x, "TargetName", value.asInstanceOf[js.Any])
    
    inline def setVolumeSizeInBytes(value: long): Self = StObject.set(x, "VolumeSizeInBytes", value.asInstanceOf[js.Any])
  }
}
