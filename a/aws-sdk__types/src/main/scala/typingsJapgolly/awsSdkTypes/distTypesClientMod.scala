package typingsJapgolly.awsSdkTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.awsSdkTypes.distTypesCommandMod.Command
import typingsJapgolly.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typingsJapgolly.awsSdkTypes.distTypesResponseMod.MetadataBearer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesClientMod {
  
  trait Client[Input /* <: js.Object */, Output /* <: MetadataBearer */, ResolvedClientConfiguration] extends StObject {
    
    val config: ResolvedClientConfiguration
    
    def destroy(): Unit
    
    var middlewareStack: MiddlewareStack[Input, Output]
    
    def send[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType]
    def send[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration], options: Any): js.Promise[OutputType]
    def send[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: Any,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit
    def send[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: Unit,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit
    @JSName("send")
    def send_InputTypeOutputType_Union[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] | Unit
    @JSName("send")
    def send_InputTypeOutputType_Union[InputType /* <: Input */, OutputType /* <: Output */](command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration], options: Any): js.Promise[OutputType] | Unit
    @JSName("send")
    def send_InputTypeOutputType_Union[InputType /* <: Input */, OutputType /* <: Output */](
      command: Command[Input, InputType, Output, OutputType, ResolvedClientConfiguration],
      options: Any,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit
    @JSName("send")
    var send_Original: InvokeFunction[Input, Output, ResolvedClientConfiguration]
  }
  object Client {
    
    inline def apply[Input /* <: js.Object */, Output /* <: MetadataBearer */, ResolvedClientConfiguration](
      config: ResolvedClientConfiguration,
      destroy: Callback,
      middlewareStack: MiddlewareStack[Input, Output],
      send: InvokeFunction[Input, Output, ResolvedClientConfiguration]
    ): Client[Input, Output, ResolvedClientConfiguration] = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], destroy = destroy.toJsFn, middlewareStack = middlewareStack.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any])
      __obj.asInstanceOf[Client[Input, Output, ResolvedClientConfiguration]]
    }
    
    extension [Self <: Client[?, ?, ?], Input /* <: js.Object */, Output /* <: MetadataBearer */, ResolvedClientConfiguration](x: Self & (Client[Input, Output, ResolvedClientConfiguration])) {
      
      inline def setConfig(value: ResolvedClientConfiguration): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setMiddlewareStack(value: MiddlewareStack[Input, Output]): Self = StObject.set(x, "middlewareStack", value.asInstanceOf[js.Any])
      
      inline def setSend(value: InvokeFunction[Input, Output, ResolvedClientConfiguration]): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * function definition for different overrides of client's 'send' function.
    */
  @js.native
  trait InvokeFunction[InputTypes /* <: js.Object */, OutputTypes /* <: MetadataBearer */, ResolvedClientConfiguration] extends StObject {
    
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration]): js.Promise[OutputType] = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: Any
    ): js.Promise[OutputType] = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: Any,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): Unit = js.native
    def apply[InputType /* <: InputTypes */, OutputType /* <: OutputTypes */](
      command: Command[InputTypes, InputType, OutputTypes, OutputType, ResolvedClientConfiguration],
      options: Unit,
      cb: js.Function2[/* err */ Any, /* data */ js.UndefOr[OutputType], Unit]
    ): js.Promise[OutputType] | Unit = js.native
  }
}
