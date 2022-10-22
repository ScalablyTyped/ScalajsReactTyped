package typingsJapgolly.pulumiKubernetes.mod

import typingsJapgolly.pulumiKubernetes.providerMod.ProviderArgs
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("@pulumi/kubernetes", "Provider")
@js.native
open class ProviderCls protected ()
  extends typingsJapgolly.pulumiKubernetes.providerMod.Provider {
  /**
    * Create a Provider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ProviderArgs) = this()
  def this(name: String, args: Unit, opts: ResourceOptions) = this()
  def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
}
