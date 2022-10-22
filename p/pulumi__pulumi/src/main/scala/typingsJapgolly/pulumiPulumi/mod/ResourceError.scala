package typingsJapgolly.pulumiPulumi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "ResourceError")
@js.native
open class ResourceError protected ()
  extends typingsJapgolly.pulumiPulumi.errorsMod.ResourceError {
  def this(message: String) = this()
  def this(message: String, resource: typingsJapgolly.pulumiPulumi.resourceMod.Resource) = this()
  def this(message: String, resource: Unit, hideStack: Boolean) = this()
  def this(message: String, resource: typingsJapgolly.pulumiPulumi.resourceMod.Resource, hideStack: Boolean) = this()
}
/* static members */
object ResourceError {
  
  @JSImport("@pulumi/pulumi", "ResourceError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean]
}
