package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.cacheMod.CacheArgs
import typingsJapgolly.pulumiAws.cacheMod.CacheState
import typingsJapgolly.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeArgs
import typingsJapgolly.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolumeState
import typingsJapgolly.pulumiAws.getLocalDiskMod.GetLocalDiskArgs
import typingsJapgolly.pulumiAws.getLocalDiskMod.GetLocalDiskResult
import typingsJapgolly.pulumiAws.nfsFileShareMod.NfsFileShareArgs
import typingsJapgolly.pulumiAws.nfsFileShareMod.NfsFileShareState
import typingsJapgolly.pulumiAws.smbFileShareMod.SmbFileShareArgs
import typingsJapgolly.pulumiAws.smbFileShareMod.SmbFileShareState
import typingsJapgolly.pulumiAws.storagegatewayGatewayMod.GatewayArgs
import typingsJapgolly.pulumiAws.storagegatewayGatewayMod.GatewayState
import typingsJapgolly.pulumiAws.uploadBufferMod.UploadBufferArgs
import typingsJapgolly.pulumiAws.uploadBufferMod.UploadBufferState
import typingsJapgolly.pulumiAws.workingStorageMod.WorkingStorageArgs
import typingsJapgolly.pulumiAws.workingStorageMod.WorkingStorageState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "storagegateway")
@js.native
object storagegateway extends js.Object {
  @js.native
  class Cache protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.Cache {
    /**
      * Create a Cache resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CacheArgs) = this()
    def this(name: String, args: CacheArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class CachesIscsiVolume protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.CachesIscsiVolume {
    /**
      * Create a CachesIscsiVolume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: CachesIscsiVolumeArgs) = this()
    def this(name: String, args: CachesIscsiVolumeArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Gateway protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.Gateway {
    /**
      * Create a Gateway resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: GatewayArgs) = this()
    def this(name: String, args: GatewayArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsFileShare protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.NfsFileShare {
    /**
      * Create a NfsFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsFileShareArgs) = this()
    def this(name: String, args: NfsFileShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SmbFileShare protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.SmbFileShare {
    /**
      * Create a SmbFileShare resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SmbFileShareArgs) = this()
    def this(name: String, args: SmbFileShareArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class UploadBuffer protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.UploadBuffer {
    /**
      * Create a UploadBuffer resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: UploadBufferArgs) = this()
    def this(name: String, args: UploadBufferArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class WorkingStorage protected ()
    extends typingsJapgolly.pulumiAws.storagegatewayMod.WorkingStorage {
    /**
      * Create a WorkingStorage resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: WorkingStorageArgs) = this()
    def this(name: String, args: WorkingStorageArgs, opts: CustomResourceOptions) = this()
  }
  
  def getLocalDisk(args: GetLocalDiskArgs): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
  def getLocalDisk(args: GetLocalDiskArgs, opts: InvokeOptions): js.Promise[GetLocalDiskResult] with GetLocalDiskResult = js.native
  /* static members */
  @js.native
  object Cache extends js.Object {
    /**
      * Get an existing Cache resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.cacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState): typingsJapgolly.pulumiAws.cacheMod.Cache = js.native
    def get(name: String, id: Input[ID], state: CacheState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.cacheMod.Cache = js.native
    /**
      * Returns true if the given object is an instance of Cache.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cache.Cache */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object CachesIscsiVolume extends js.Object {
    /**
      * Get an existing CachesIscsiVolume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState): typingsJapgolly.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    def get(name: String, id: Input[ID], state: CachesIscsiVolumeState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.cachesIscsiVolumeMod.CachesIscsiVolume = js.native
    /**
      * Returns true if the given object is an instance of CachesIscsiVolume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/cachesIscsiVolume.CachesIscsiVolume */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Gateway extends js.Object {
    /**
      * Get an existing Gateway resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState): typingsJapgolly.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    def get(name: String, id: Input[ID], state: GatewayState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.storagegatewayGatewayMod.Gateway = js.native
    /**
      * Returns true if the given object is an instance of Gateway.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/gateway.Gateway */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NfsFileShare extends js.Object {
    /**
      * Get an existing NfsFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState): typingsJapgolly.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    def get(name: String, id: Input[ID], state: NfsFileShareState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.nfsFileShareMod.NfsFileShare = js.native
    /**
      * Returns true if the given object is an instance of NfsFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/nfsFileShare.NfsFileShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SmbFileShare extends js.Object {
    /**
      * Get an existing SmbFileShare resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState): typingsJapgolly.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    def get(name: String, id: Input[ID], state: SmbFileShareState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.smbFileShareMod.SmbFileShare = js.native
    /**
      * Returns true if the given object is an instance of SmbFileShare.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/smbFileShare.SmbFileShare */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object UploadBuffer extends js.Object {
    /**
      * Get an existing UploadBuffer resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState): typingsJapgolly.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    def get(name: String, id: Input[ID], state: UploadBufferState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.uploadBufferMod.UploadBuffer = js.native
    /**
      * Returns true if the given object is an instance of UploadBuffer.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/uploadBuffer.UploadBuffer */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object WorkingStorage extends js.Object {
    /**
      * Get an existing WorkingStorage resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.workingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState): typingsJapgolly.pulumiAws.workingStorageMod.WorkingStorage = js.native
    def get(name: String, id: Input[ID], state: WorkingStorageState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.workingStorageMod.WorkingStorage = js.native
    /**
      * Returns true if the given object is an instance of WorkingStorage.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/storagegateway/workingStorage.WorkingStorage */ Boolean = js.native
  }
  
}

