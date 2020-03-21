package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyArgs
import typingsJapgolly.pulumiAws.defaultKmsKeyMod.DefaultKmsKeyState
import typingsJapgolly.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultArgs
import typingsJapgolly.pulumiAws.encryptionByDefaultMod.EncryptionByDefaultState
import typingsJapgolly.pulumiAws.getDefaultKmsKeyMod.GetDefaultKmsKeyResult
import typingsJapgolly.pulumiAws.getEncryptionByDefaultMod.GetEncryptionByDefaultResult
import typingsJapgolly.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsArgs
import typingsJapgolly.pulumiAws.getSnapshotIdsMod.GetSnapshotIdsResult
import typingsJapgolly.pulumiAws.getSnapshotMod.GetSnapshotArgs
import typingsJapgolly.pulumiAws.getSnapshotMod.GetSnapshotResult
import typingsJapgolly.pulumiAws.getVolumeMod.GetVolumeArgs
import typingsJapgolly.pulumiAws.getVolumeMod.GetVolumeResult
import typingsJapgolly.pulumiAws.snapshotCopyMod.SnapshotCopyArgs
import typingsJapgolly.pulumiAws.snapshotCopyMod.SnapshotCopyState
import typingsJapgolly.pulumiAws.snapshotMod.SnapshotArgs
import typingsJapgolly.pulumiAws.snapshotMod.SnapshotState
import typingsJapgolly.pulumiAws.volumeMod.VolumeArgs
import typingsJapgolly.pulumiAws.volumeMod.VolumeState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "ebs")
@js.native
object ebs extends js.Object {
  @js.native
  class DefaultKmsKey protected ()
    extends typingsJapgolly.pulumiAws.ebsMod.DefaultKmsKey {
    /**
      * Create a DefaultKmsKey resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DefaultKmsKeyArgs) = this()
    def this(name: String, args: DefaultKmsKeyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EncryptionByDefault protected ()
    extends typingsJapgolly.pulumiAws.ebsMod.EncryptionByDefault {
    /**
      * Create a EncryptionByDefault resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: EncryptionByDefaultArgs) = this()
    def this(name: String, args: EncryptionByDefaultArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Snapshot protected ()
    extends typingsJapgolly.pulumiAws.ebsMod.Snapshot {
    /**
      * Create a Snapshot resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotArgs) = this()
    def this(name: String, args: SnapshotArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class SnapshotCopy protected ()
    extends typingsJapgolly.pulumiAws.ebsMod.SnapshotCopy {
    /**
      * Create a SnapshotCopy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SnapshotCopyArgs) = this()
    def this(name: String, args: SnapshotCopyArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Volume protected ()
    extends typingsJapgolly.pulumiAws.ebsMod.Volume {
    /**
      * Create a Volume resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: VolumeArgs) = this()
    def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDefaultKmsKey(): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getDefaultKmsKey(opts: InvokeOptions): js.Promise[GetDefaultKmsKeyResult] with GetDefaultKmsKeyResult = js.native
  def getEncryptionByDefault(): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getEncryptionByDefault(opts: InvokeOptions): js.Promise[GetEncryptionByDefaultResult] with GetEncryptionByDefaultResult = js.native
  def getSnapshot(): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshot(args: GetSnapshotArgs, opts: InvokeOptions): js.Promise[GetSnapshotResult] with GetSnapshotResult = js.native
  def getSnapshotIds(): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getSnapshotIds(args: GetSnapshotIdsArgs, opts: InvokeOptions): js.Promise[GetSnapshotIdsResult] with GetSnapshotIdsResult = js.native
  def getVolume(): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  def getVolume(args: GetVolumeArgs, opts: InvokeOptions): js.Promise[GetVolumeResult] with GetVolumeResult = js.native
  /* static members */
  @js.native
  object DefaultKmsKey extends js.Object {
    /**
      * Get an existing DefaultKmsKey resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState): typingsJapgolly.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    def get(name: String, id: Input[ID], state: DefaultKmsKeyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.defaultKmsKeyMod.DefaultKmsKey = js.native
    /**
      * Returns true if the given object is an instance of DefaultKmsKey.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/defaultKmsKey.DefaultKmsKey */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EncryptionByDefault extends js.Object {
    /**
      * Get an existing EncryptionByDefault resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState): typingsJapgolly.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    def get(name: String, id: Input[ID], state: EncryptionByDefaultState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.encryptionByDefaultMod.EncryptionByDefault = js.native
    /**
      * Returns true if the given object is an instance of EncryptionByDefault.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/encryptionByDefault.EncryptionByDefault */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Snapshot extends js.Object {
    /**
      * Get an existing Snapshot resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.snapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState): typingsJapgolly.pulumiAws.snapshotMod.Snapshot = js.native
    def get(name: String, id: Input[ID], state: SnapshotState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.snapshotMod.Snapshot = js.native
    /**
      * Returns true if the given object is an instance of Snapshot.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshot.Snapshot */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object SnapshotCopy extends js.Object {
    /**
      * Get an existing SnapshotCopy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState): typingsJapgolly.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    def get(name: String, id: Input[ID], state: SnapshotCopyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.snapshotCopyMod.SnapshotCopy = js.native
    /**
      * Returns true if the given object is an instance of SnapshotCopy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/snapshotCopy.SnapshotCopy */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Volume extends js.Object {
    /**
      * Get an existing Volume resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.volumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState): typingsJapgolly.pulumiAws.volumeMod.Volume = js.native
    def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.volumeMod.Volume = js.native
    /**
      * Returns true if the given object is an instance of Volume.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
  }
  
}

