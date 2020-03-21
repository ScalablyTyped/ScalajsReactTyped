package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.fileSystemMod.FileSystemArgs
import typingsJapgolly.pulumiAws.fileSystemMod.FileSystemState
import typingsJapgolly.pulumiAws.getFileSystemMod.GetFileSystemArgs
import typingsJapgolly.pulumiAws.getFileSystemMod.GetFileSystemResult
import typingsJapgolly.pulumiAws.getMountTargetMod.GetMountTargetArgs
import typingsJapgolly.pulumiAws.getMountTargetMod.GetMountTargetResult
import typingsJapgolly.pulumiAws.mountTargetMod.MountTargetArgs
import typingsJapgolly.pulumiAws.mountTargetMod.MountTargetState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/efs", JSImport.Namespace)
@js.native
object efsMod extends js.Object {
  @js.native
  class FileSystem protected ()
    extends typingsJapgolly.pulumiAws.fileSystemMod.FileSystem {
    /**
      * Create a FileSystem resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: FileSystemArgs) = this()
    def this(name: String, args: FileSystemArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class MountTarget protected ()
    extends typingsJapgolly.pulumiAws.mountTargetMod.MountTarget {
    /**
      * Create a MountTarget resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: MountTargetArgs) = this()
    def this(name: String, args: MountTargetArgs, opts: CustomResourceOptions) = this()
  }
  
  def getFileSystem(): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getFileSystem(args: GetFileSystemArgs, opts: InvokeOptions): js.Promise[GetFileSystemResult] with GetFileSystemResult = js.native
  def getMountTarget(args: GetMountTargetArgs): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
  def getMountTarget(args: GetMountTargetArgs, opts: InvokeOptions): js.Promise[GetMountTargetResult] with GetMountTargetResult = js.native
  /* static members */
  @js.native
  object FileSystem extends js.Object {
    /**
      * Get an existing FileSystem resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.fileSystemMod.FileSystem = js.native
    def get(name: String, id: Input[ID], state: FileSystemState): typingsJapgolly.pulumiAws.fileSystemMod.FileSystem = js.native
    def get(name: String, id: Input[ID], state: FileSystemState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.fileSystemMod.FileSystem = js.native
    /**
      * Returns true if the given object is an instance of FileSystem.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/fileSystem.FileSystem */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object MountTarget extends js.Object {
    /**
      * Get an existing MountTarget resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.mountTargetMod.MountTarget = js.native
    def get(name: String, id: Input[ID], state: MountTargetState): typingsJapgolly.pulumiAws.mountTargetMod.MountTarget = js.native
    def get(name: String, id: Input[ID], state: MountTargetState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.mountTargetMod.MountTarget = js.native
    /**
      * Returns true if the given object is an instance of MountTarget.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/efs/mountTarget.MountTarget */ Boolean = js.native
  }
  
}

