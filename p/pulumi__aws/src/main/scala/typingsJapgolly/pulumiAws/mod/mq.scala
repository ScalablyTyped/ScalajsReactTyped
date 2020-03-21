package typingsJapgolly.pulumiAws.mod

import typingsJapgolly.pulumiAws.brokerMod.BrokerArgs
import typingsJapgolly.pulumiAws.brokerMod.BrokerState
import typingsJapgolly.pulumiAws.configurationMod.ConfigurationArgs
import typingsJapgolly.pulumiAws.configurationMod.ConfigurationState
import typingsJapgolly.pulumiAws.getBrokerMod.GetBrokerArgs
import typingsJapgolly.pulumiAws.getBrokerMod.GetBrokerResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "mq")
@js.native
object mq extends js.Object {
  @js.native
  class Broker protected ()
    extends typingsJapgolly.pulumiAws.mqMod.Broker {
    /**
      * Create a Broker resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: BrokerArgs) = this()
    def this(name: String, args: BrokerArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class Configuration protected ()
    extends typingsJapgolly.pulumiAws.mqMod.Configuration {
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
  
  def getBroker(): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
  def getBroker(args: GetBrokerArgs): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
  def getBroker(args: GetBrokerArgs, opts: InvokeOptions): js.Promise[GetBrokerResult] with GetBrokerResult = js.native
  /* static members */
  @js.native
  object Broker extends js.Object {
    /**
      * Get an existing Broker resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.brokerMod.Broker = js.native
    def get(name: String, id: Input[ID], state: BrokerState): typingsJapgolly.pulumiAws.brokerMod.Broker = js.native
    def get(name: String, id: Input[ID], state: BrokerState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.brokerMod.Broker = js.native
    /**
      * Returns true if the given object is an instance of Broker.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/broker.Broker */ Boolean = js.native
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
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.configurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState): typingsJapgolly.pulumiAws.configurationMod.Configuration = js.native
    def get(name: String, id: Input[ID], state: ConfigurationState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.configurationMod.Configuration = js.native
    /**
      * Returns true if the given object is an instance of Configuration.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/mq/configuration.Configuration */ Boolean = js.native
  }
  
}

