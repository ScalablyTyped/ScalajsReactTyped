package typingsJapgolly.pulumiPulumi.mod

import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResourceOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "ComponentResource")
@js.native
open class ComponentResource[TData] protected ()
  extends typingsJapgolly.pulumiPulumi.resourceMod.ComponentResource[TData] {
  /**
    * Creates and registers a new component resource.  [type] is the fully qualified type token and
    * [name] is the "name" part to use in creating a stable and globally unique URN for the object.
    * [opts.parent] is the optional parent for this component, and [opts.dependsOn] is an optional
    * list of other resources that this resource depends on, controlling the order in which we
    * perform resource operations.
    *
    * @param t The type of the resource.
    * @param name The _unique_ name of the resource.
    * @param args Information passed to [initialize] method.
    * @param opts A bag of options that control this resource's behavior.
    * @param remote True if this is a remote component resource.
    */
  def this(`type`: String, name: String) = this()
  def this(`type`: String, name: String, args: Inputs) = this()
  def this(`type`: String, name: String, args: Unit, opts: ComponentResourceOptions) = this()
  def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions) = this()
  def this(`type`: String, name: String, args: Unit, opts: Unit, remote: Boolean) = this()
  def this(`type`: String, name: String, args: Unit, opts: ComponentResourceOptions, remote: Boolean) = this()
  def this(`type`: String, name: String, args: Inputs, opts: Unit, remote: Boolean) = this()
  def this(`type`: String, name: String, args: Inputs, opts: ComponentResourceOptions, remote: Boolean) = this()
}
/* static members */
object ComponentResource {
  
  @JSImport("@pulumi/pulumi", "ComponentResource")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of CustomResource.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/resource.ComponentResource<any> */ Boolean]
}
