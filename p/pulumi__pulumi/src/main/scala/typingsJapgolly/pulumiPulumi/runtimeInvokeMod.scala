package typingsJapgolly.pulumiPulumi

import typingsJapgolly.pulumiPulumi.invokeMod.InvokeOptions
import typingsJapgolly.pulumiPulumi.outputMod.Inputs
import typingsJapgolly.pulumiPulumi.outputMod.Output_
import typingsJapgolly.pulumiPulumi.resourceMod.Resource
import typingsJapgolly.pulumiQuery.interfacesMod.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtimeInvokeMod {
  
  @JSImport("@pulumi/pulumi/runtime/invoke", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@pulumi/pulumi/runtime/invoke", "StreamInvokeResponse")
  @js.native
  open class StreamInvokeResponse[T] protected ()
    extends StObject
       with AsyncIterable[T] {
    def this(source: AsyncIterable[T], cancelSource: js.Function0[Unit]) = this()
    
    def cancel(): Unit = js.native
    
    /* private */ var cancelSource: Any = js.native
    
    /* private */ var source: Any = js.native
  }
  
  inline def call[T](tok: String, props: Inputs): Output_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Output_[T]]
  inline def call[T](tok: String, props: Inputs, res: Resource): Output_[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("call")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], res.asInstanceOf[js.Any])).asInstanceOf[Output_[T]]
  
  inline def invoke(tok: String, props: Inputs): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  inline def invoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("invoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
  
  inline def streamInvoke(tok: String, props: Inputs): js.Promise[StreamInvokeResponse[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamInvokeResponse[Any]]]
  inline def streamInvoke(tok: String, props: Inputs, opts: InvokeOptions): js.Promise[StreamInvokeResponse[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("streamInvoke")(tok.asInstanceOf[js.Any], props.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[StreamInvokeResponse[Any]]]
}
