package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.domainMod.DomainArgs
import typingsJapgolly.pulumiAws.domainMod.DomainState
import typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicyArgs
import typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicyState
import typingsJapgolly.pulumiAws.getDomainMod.GetDomainArgs
import typingsJapgolly.pulumiAws.getDomainMod.GetDomainResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch", JSImport.Namespace)
@js.native
object elasticsearchMod extends js.Object {
  @js.native
  class Domain protected ()
    extends typingsJapgolly.pulumiAws.domainMod.Domain {
    /**
      * Create a Domain resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: DomainArgs) = this()
    def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  }
  
  @js.native
  class DomainPolicy protected ()
    extends typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicy {
    /**
      * Create a DomainPolicy resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: DomainPolicyArgs) = this()
    def this(name: String, args: DomainPolicyArgs, opts: CustomResourceOptions) = this()
  }
  
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] with GetDomainResult = js.native
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] with GetDomainResult = js.native
  /* static members */
  @js.native
  object Domain extends js.Object {
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.domainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState): typingsJapgolly.pulumiAws.domainMod.Domain = js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.domainMod.Domain = js.native
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object DomainPolicy extends js.Object {
    /**
      * Get an existing DomainPolicy resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState): typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    def get(name: String, id: Input[ID], state: DomainPolicyState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.domainPolicyMod.DomainPolicy = js.native
    /**
      * Returns true if the given object is an instance of DomainPolicy.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domainPolicy.DomainPolicy */ Boolean = js.native
  }
  
}

