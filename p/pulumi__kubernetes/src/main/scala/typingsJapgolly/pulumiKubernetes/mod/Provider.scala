package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.providerMod.ProviderArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes", "Provider")
@js.native
class Provider protected ()
  extends typingsJapgolly.pulumiKubernetes.providerMod.Provider {
  /**
    * Create a Provider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ProviderArgs) = this()
  def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
}

