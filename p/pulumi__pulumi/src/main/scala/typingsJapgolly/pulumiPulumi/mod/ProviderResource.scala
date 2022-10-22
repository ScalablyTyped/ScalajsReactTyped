package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("@pulumi/pulumi", "ProviderResource")
@js.native
open class ProviderResource protected ()
  extends typingsJapgolly.pulumiPulumi.resourceMod.ProviderResource {
  /**
    * Creates and registers a new provider resource for a particular package.
    *
    * @param pkg The package associated with this provider.
    * @param name The _unique_ name of the provider.
    * @param props The configuration to use for this provider.
    * @param opts A bag of options that control this provider's behavior.
    * @param dependency True if this is a synthetic resource used internally for dependency tracking.
    */
  def this(pkg: String, name: String) = this()
  def this(pkg: String, name: String, props: Inputs) = this()
  def this(pkg: String, name: String, props: Unit, opts: ResourceOptions) = this()
  def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions) = this()
  def this(pkg: String, name: String, props: Unit, opts: Unit, dependency: Boolean) = this()
  def this(pkg: String, name: String, props: Unit, opts: ResourceOptions, dependency: Boolean) = this()
  def this(pkg: String, name: String, props: Inputs, opts: Unit, dependency: Boolean) = this()
  def this(pkg: String, name: String, props: Inputs, opts: ResourceOptions, dependency: Boolean) = this()
}
/* static members */
object ProviderResource {
  
  @JSImport("@pulumi/pulumi", "ProviderResource")
  @js.native
  val ^ : js.Any = js.native
  
  inline def register(): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")().asInstanceOf[js.Promise[js.UndefOr[String]]]
  inline def register(provider: typingsJapgolly.pulumiPulumi.resourceMod.ProviderResource): js.Promise[js.UndefOr[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(provider.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[String]]]
}
