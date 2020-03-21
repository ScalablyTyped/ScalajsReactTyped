package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.agentMod.AgentArgs
import typingsJapgolly.pulumiAws.agentMod.AgentState
import typingsJapgolly.pulumiAws.efsLocationMod.EfsLocationArgs
import typingsJapgolly.pulumiAws.efsLocationMod.EfsLocationState
import typingsJapgolly.pulumiAws.locationSmbMod.LocationSmbArgs
import typingsJapgolly.pulumiAws.locationSmbMod.LocationSmbState
import typingsJapgolly.pulumiAws.nfsLocationMod.NfsLocationArgs
import typingsJapgolly.pulumiAws.nfsLocationMod.NfsLocationState
import typingsJapgolly.pulumiAws.s3LocationMod.S3LocationArgs
import typingsJapgolly.pulumiAws.s3LocationMod.S3LocationState
import typingsJapgolly.pulumiAws.taskMod.TaskArgs
import typingsJapgolly.pulumiAws.taskMod.TaskState
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "datasync")
@js.native
object datasync extends js.Object {
  @js.native
  class Agent protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.Agent {
    /**
      * Create a Agent resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: AgentArgs) = this()
    def this(name: String, args: AgentArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class EfsLocation protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.EfsLocation {
    /**
      * Create a EfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: EfsLocationArgs) = this()
    def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class LocationSmb protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.LocationSmb {
    /**
      * Create a LocationSmb resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: LocationSmbArgs) = this()
    def this(name: String, args: LocationSmbArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class NfsLocation protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.NfsLocation {
    /**
      * Create a NfsLocation resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: NfsLocationArgs) = this()
    def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class S3Location protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.S3Location {
    /**
      * Create a S3Location resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: S3LocationArgs) = this()
    def this(name: String, args: S3LocationArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Task protected ()
    extends typingsJapgolly.pulumiAws.datasyncMod.Task {
    /**
      * Create a Task resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: TaskArgs) = this()
    def this(name: String, args: TaskArgs, opts: CustomResourceOptions) = this()
  }
  
  /* static members */
  @js.native
  object Agent extends js.Object {
    /**
      * Get an existing Agent resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.agentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState): typingsJapgolly.pulumiAws.agentMod.Agent = js.native
    def get(name: String, id: Input[ID], state: AgentState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.agentMod.Agent = js.native
    /**
      * Returns true if the given object is an instance of Agent.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/agent.Agent */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EfsLocation extends js.Object {
    /**
      * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.efsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState): typingsJapgolly.pulumiAws.efsLocationMod.EfsLocation = js.native
    def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.efsLocationMod.EfsLocation = js.native
    /**
      * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object LocationSmb extends js.Object {
    /**
      * Get an existing LocationSmb resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.locationSmbMod.LocationSmb = js.native
    def get(name: String, id: Input[ID], state: LocationSmbState): typingsJapgolly.pulumiAws.locationSmbMod.LocationSmb = js.native
    def get(name: String, id: Input[ID], state: LocationSmbState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.locationSmbMod.LocationSmb = js.native
    /**
      * Returns true if the given object is an instance of LocationSmb.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/locationSmb.LocationSmb */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object NfsLocation extends js.Object {
    /**
      * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.nfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState): typingsJapgolly.pulumiAws.nfsLocationMod.NfsLocation = js.native
    def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.nfsLocationMod.NfsLocation = js.native
    /**
      * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object S3Location extends js.Object {
    /**
      * Get an existing S3Location resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.s3LocationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState): typingsJapgolly.pulumiAws.s3LocationMod.S3Location = js.native
    def get(name: String, id: Input[ID], state: S3LocationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.s3LocationMod.S3Location = js.native
    /**
      * Returns true if the given object is an instance of S3Location.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/s3Location.S3Location */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Task extends js.Object {
    /**
      * Get an existing Task resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.taskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState): typingsJapgolly.pulumiAws.taskMod.Task = js.native
    def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.taskMod.Task = js.native
    /**
      * Returns true if the given object is an instance of Task.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = js.native
  }
  
}

