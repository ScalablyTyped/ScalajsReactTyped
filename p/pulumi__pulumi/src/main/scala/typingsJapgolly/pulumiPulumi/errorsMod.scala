package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorsMod {
  
  @JSImport("@pulumi/pulumi/errors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/errors", "ResourceError")
  @js.native
  open class ResourceError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    def this(message: String, resource: Resource) = this()
    def this(message: String, resource: Unit, hideStack: Boolean) = this()
    def this(message: String, resource: Resource, hideStack: Boolean) = this()
    
    var hideStack: js.UndefOr[Boolean] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var resource: js.UndefOr[Resource] = js.native
  }
  /* static members */
  object ResourceError {
    
    @JSImport("@pulumi/pulumi/errors", "ResourceError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of a ResourceError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.ResourceError */ Boolean]
  }
  
  @JSImport("@pulumi/pulumi/errors", "RunError")
  @js.native
  open class RunError protected ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  /* static members */
  object RunError {
    
    @JSImport("@pulumi/pulumi/errors", "RunError")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns true if the given object is an instance of a RunError.  This is designed to work even when
      * multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: Any): /* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/pulumi.@pulumi/pulumi/errors.RunError */ Boolean]
  }
  
  inline def isGrpcError(err: js.Error): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isGrpcError")(err.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
