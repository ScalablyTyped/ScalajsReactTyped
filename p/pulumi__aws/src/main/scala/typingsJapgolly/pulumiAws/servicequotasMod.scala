package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.getServiceQuotaMod.GetServiceQuotaArgs
import typingsJapgolly.pulumiAws.getServiceQuotaMod.GetServiceQuotaResult
import typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuotaArgs
import typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuotaState
import typingsJapgolly.pulumiAws.servicequotasGetServiceMod.GetServiceArgs
import typingsJapgolly.pulumiAws.servicequotasGetServiceMod.GetServiceResult
import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Input
import typingsJapgolly.pulumiPulumi.resourceMod.CustomResourceOptions
import typingsJapgolly.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicequotas", JSImport.Namespace)
@js.native
object servicequotasMod extends js.Object {
  @js.native
  class ServiceQuota protected ()
    extends typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuota {
    /**
      * Create a ServiceQuota resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceQuotaArgs) = this()
    def this(name: String, args: ServiceQuotaArgs, opts: CustomResourceOptions) = this()
  }
  
  def getService(args: GetServiceArgs): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getService(args: GetServiceArgs, opts: InvokeOptions): js.Promise[GetServiceResult] with GetServiceResult = js.native
  def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] with GetServiceQuotaResult = js.native
  def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] with GetServiceQuotaResult = js.native
  /* static members */
  @js.native
  object ServiceQuota extends js.Object {
    /**
      * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      */
    def get(name: String, id: Input[ID]): typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    def get(name: String, id: Input[ID], state: ServiceQuotaState): typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): typingsJapgolly.pulumiAws.serviceQuotaMod.ServiceQuota = js.native
    /**
      * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = js.native
  }
  
}

