package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwaderArgs
import typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwaderState
import typingsJapgolly.pulumiAws.directoryMod.DirectoryArgs
import typingsJapgolly.pulumiAws.directoryMod.DirectoryState
import typingsJapgolly.pulumiAws.getDirectoryMod.GetDirectoryArgs
import typingsJapgolly.pulumiAws.getDirectoryMod.GetDirectoryResult
import typingsJapgolly.pulumiAws.logServiceMod.LogServiceArgs
import typingsJapgolly.pulumiAws.logServiceMod.LogServiceState
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/directoryservice", JSImport.Namespace)
@js.native
object directoryserviceMod extends js.Object {
  @js.native
  class ConditionalForwader protected ()
    extends typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwader {
    /**
      * Create a ConditionalForwader resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConditionalForwaderArgs) = this()
    def this(name: String, args: ConditionalForwaderArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Directory protected ()
    extends typingsJapgolly.pulumiAws.directoryMod.Directory {
    /**
      * Create a Directory resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DirectoryArgs) = this()
    def this(name: String, args: DirectoryArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LogService protected ()
    extends typingsJapgolly.pulumiAws.logServiceMod.LogService {
    /**
      * Create a LogService resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LogServiceArgs) = this()
    def this(name: String, args: LogServiceArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDirectory(args: GetDirectoryArgs): js.Promise[GetDirectoryResult] with GetDirectoryResult = js.native
  def getDirectory(args: GetDirectoryArgs, opts: InvokeOptions): js.Promise[GetDirectoryResult] with GetDirectoryResult = js.native
  /* static members */
  @js.native
  object ConditionalForwader extends js.Object {
    /**
      * Get an existing ConditionalForwader resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState): typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    def get(name: String, id: Input[ID], state: ConditionalForwaderState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.conditionalForwaderMod.ConditionalForwader = js.native
    /**
      * Returns true if the given object is an instance of ConditionalForwader.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/conditionalForwader.ConditionalForwader */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Directory extends js.Object {
    /**
      * Get an existing Directory resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.directoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState): typingsJapgolly.pulumiAws.directoryMod.Directory = js.native
    def get(name: String, id: Input[ID], state: DirectoryState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.directoryMod.Directory = js.native
    /**
      * Returns true if the given object is an instance of Directory.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/directory.Directory */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LogService extends js.Object {
    /**
      * Get an existing LogService resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.logServiceMod.LogService = js.native
    def get(name: String, id: Input[ID], state: LogServiceState): typingsJapgolly.pulumiAws.logServiceMod.LogService = js.native
    def get(name: String, id: Input[ID], state: LogServiceState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.logServiceMod.LogService = js.native
    /**
      * Returns true if the given object is an instance of LogService.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directoryservice/logService.LogService */ Boolean = js.native
  }
  
}

