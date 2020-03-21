package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.serverlessFunctionMod.FunctionOptions
import typingsJapgolly.pulumiAws.serverlessFunctionMod.Handler
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless", JSImport.Namespace)
@js.native
object serverlessMod extends js.Object {
  @js.native
  class Function protected ()
    extends typingsJapgolly.pulumiAws.serverlessFunctionMod.Function {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
  }
  
}

