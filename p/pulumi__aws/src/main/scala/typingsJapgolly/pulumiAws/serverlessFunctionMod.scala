package typingsJapgolly.pulumiAws

import typingsJapgolly.pulumiAws.iamMod.Role
import typingsJapgolly.pulumiAws.lambdaMixinsMod.Callback
import typingsJapgolly.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typingsJapgolly.pulumiAws.utilsMod.Overwrite
import typingsJapgolly.pulumiPulumi.mod.ComponentResource
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", JSImport.Namespace)
@js.native
object serverlessFunctionMod extends js.Object {
  @js.native
  class Function protected ()
    extends ComponentResource[js.Any] {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
    val lambda: typingsJapgolly.pulumiAws.lambdaMod.Function = js.native
    val options: FunctionOptions = js.native
    val role: js.UndefOr[Role] = js.native
  }
  
  type Context = typingsJapgolly.pulumiAws.lambdaMixinsMod.Context
  type FunctionOptions = Overwrite[CallbackFunctionArgs[js.Any, js.Any], AnonExcludePackages]
  type Handler = Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}

