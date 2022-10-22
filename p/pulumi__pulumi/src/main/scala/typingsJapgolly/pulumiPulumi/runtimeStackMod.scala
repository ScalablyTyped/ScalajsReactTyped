package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.anon.Init
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.ComponentResource
import typingsJapgolly.pulumiPulumi.resourceMod.ResourceTransformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeStackMod {
  
  @JSImport("@pulumi/pulumi/runtime/stack", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/stack", "Stack")
  @js.native
  open class Stack protected () extends ComponentResource[Inputs] {
    def this(init: js.Function0[js.Promise[Inputs]]) = this()
    
    /**
      * runInit invokes the given init callback with this resource set as the root resource. The return value of init is
      * used as the stack's output properties.
      *
      * @param init The callback to run in the context of this Pulumi stack
      */
    def initialize(args: Init): js.Promise[Inputs] = js.native
    
    /**
      * The outputs of this stack, if the `init` callback exited normally.
      */
    val outputs: Output_[Inputs] = js.native
  }
  
  inline def getStackResource(): js.UndefOr[Stack] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStackResource")().asInstanceOf[js.UndefOr[Stack]]
  
  inline def registerStackTransformation(t: ResourceTransformation): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerStackTransformation")(t.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("@pulumi/pulumi/runtime/stack", "rootPulumiStackTypeName")
  @js.native
  val rootPulumiStackTypeName: /* "pulumi:pulumi:Stack" */ String = js.native
  
  inline def runInPulumiStack(init: js.Function0[js.Promise[Any]]): js.Promise[js.UndefOr[Inputs]] = ^.asInstanceOf[js.Dynamic].applyDynamic("runInPulumiStack")(init.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[Inputs]]]
}
