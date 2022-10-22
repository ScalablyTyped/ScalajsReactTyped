package typingsJapgolly.pulumiPulumi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi", "RunError")
@js.native
open class RunError protected ()
  extends typingsJapgolly.pulumiPulumi.errorsMod.RunError {
  def this(message: String) = this()
}
/* static members */
object RunError {
  
  @JSImport("@pulumi/pulumi", "RunError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Returns true if the given object is an instance of a RunError.  This is designed to work even when
    * multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean]
}
