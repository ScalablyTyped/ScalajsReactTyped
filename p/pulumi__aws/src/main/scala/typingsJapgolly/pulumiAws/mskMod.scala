package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.getConfigurationMod.GetConfigurationArgs
import typingsJapgolly.pulumiAws.getConfigurationMod.GetConfigurationResult
import typingsJapgolly.pulumiAws.mskClusterMod.ClusterArgs
import typingsJapgolly.pulumiAws.mskClusterMod.ClusterState
import typingsJapgolly.pulumiAws.mskConfigurationMod.ConfigurationArgs
import typingsJapgolly.pulumiAws.mskConfigurationMod.ConfigurationState
import typingsJapgolly.pulumiAws.mskGetClusterMod.GetClusterArgs
import typingsJapgolly.pulumiAws.mskGetClusterMod.GetClusterResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/msk", JSImport.Namespace)
@js.native
object mskMod extends js.Object {
  @js.native
  class Cluster protected ()
    extends typingsJapgolly.pulumiAws.mskClusterMod.Cluster {
    /**
      * Create a Cluster resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ClusterArgs) = this()
    def this(name: String, args: ClusterArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Configuration protected ()
    extends typingsJapgolly.pulumiAws.mskConfigurationMod.Configuration {
    /**
      * Create a Configuration resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ConfigurationArgs) = this()
    def this(name: String, args: ConfigurationArgs, opts: CustomResourceOptions) = this()
  }
  
  def getCluster(args: GetClusterArgs): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getCluster(args: GetClusterArgs, opts: InvokeOptions): js.Promise[GetClusterResult] with GetClusterResult = js.native
  def getConfiguration(args: GetConfigurationArgs): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
  def getConfiguration(args: GetConfigurationArgs, opts: InvokeOptions): js.Promise[GetConfigurationResult] with GetConfigurationResult = js.native
  /* static members */
  @js.native
  object Cluster extends js.Object {
    /**
      * Get an existing Cluster resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.mskClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState): typingsJapgolly.pulumiAws.mskClusterMod.Cluster = js.native
    def get(name: String, id: Input[ID], state: ClusterState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.mskClusterMod.Cluster = js.native
    /**
      * Returns true if the given object is an instance of Cluster.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/cluster.Cluster */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Configuration extends js.Object {
    /**
      * Get an existing Configuration resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.mskConfigurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typingsJapgolly.pulumiAws.mskConfigurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.mskConfigurationMod.Configuration = js.native
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/msk/configuration.Configuration */ Boolean = js.native
  }
  
}

