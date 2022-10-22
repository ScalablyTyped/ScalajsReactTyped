package typingsJapgolly.jupyterlabCompleter

import typingsJapgolly.jupyterlabCompleter.jupyterlabCompleterStrings.ICompletionItemsReply
import typingsJapgolly.jupyterlabCompleter.libWidgetMod.Completer.IOptions
import typingsJapgolly.luminoCoreutils.mod.Token
import typingsJapgolly.luminoMessaging.mod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jupyterlab/completer", "Completer")
  @js.native
  open class Completer protected ()
    extends typingsJapgolly.jupyterlabCompleter.libWidgetMod.Completer {
    /**
      * Construct a text completer menu widget.
      */
    def this(options: IOptions) = this()
  }
  object Completer {
    
    /**
      * The default implementation of an `IRenderer`.
      */
    @JSImport("@jupyterlab/completer", "Completer.Renderer")
    @js.native
    open class Renderer ()
      extends typingsJapgolly.jupyterlabCompleter.libWidgetMod.Completer.Renderer
    
    /**
      * The default `IRenderer` instance.
      */
    @JSImport("@jupyterlab/completer", "Completer.defaultRenderer")
    @js.native
    val defaultRenderer: typingsJapgolly.jupyterlabCompleter.libWidgetMod.Completer.Renderer = js.native
  }
  
  @JSImport("@jupyterlab/completer", "CompleterModel")
  @js.native
  open class CompleterModel ()
    extends typingsJapgolly.jupyterlabCompleter.libModelMod.CompleterModel
  
  @JSImport("@jupyterlab/completer", "CompletionConnector")
  @js.native
  open class CompletionConnector protected ()
    extends typingsJapgolly.jupyterlabCompleter.libConnectorMod.CompletionConnector {
    /**
      * Create a new connector for completion requests.
      *
      * @param options - The instantiation options for the connector.
      */
    def this(options: typingsJapgolly.jupyterlabCompleter.libConnectorMod.CompletionConnector.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/completer", "CompletionHandler")
  @js.native
  open class CompletionHandler protected ()
    extends typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler {
    /**
      * Construct a new completion handler for a widget.
      */
    def this(options: typingsJapgolly.jupyterlabCompleter.libHandlerMod.CompletionHandler.IOptions) = this()
  }
  object CompletionHandler {
    
    @JSImport("@jupyterlab/completer", "CompletionHandler.ICompletionItemsResponseType")
    @js.native
    val ICompletionItemsResponseType: ICompletionItemsReply = js.native
    
    /**
      * A namespace for completion handler messages.
      */
    object Msg {
      
      /**
        * A singleton `'invoke-request'` message.
        */
      @JSImport("@jupyterlab/completer", "CompletionHandler.Msg.InvokeRequest")
      @js.native
      val InvokeRequest: Message = js.native
    }
  }
  
  @JSImport("@jupyterlab/completer", "ContextConnector")
  @js.native
  open class ContextConnector protected ()
    extends typingsJapgolly.jupyterlabCompleter.libContextconnectorMod.ContextConnector {
    /**
      * Create a new context connector for completion requests.
      *
      * @param options - The instantiation options for the context connector.
      */
    def this(options: typingsJapgolly.jupyterlabCompleter.libContextconnectorMod.ContextConnector.IOptions) = this()
  }
  
  @JSImport("@jupyterlab/completer", "ICompletionManager")
  @js.native
  val ICompletionManager: Token[typingsJapgolly.jupyterlabCompleter.libTokensMod.ICompletionManager] = js.native
  
  @JSImport("@jupyterlab/completer", "KernelConnector")
  @js.native
  open class KernelConnector protected ()
    extends typingsJapgolly.jupyterlabCompleter.libKernelconnectorMod.KernelConnector {
    /**
      * Create a new kernel connector for completion requests.
      *
      * @param options - The instantiation options for the kernel connector.
      */
    def this(options: typingsJapgolly.jupyterlabCompleter.libKernelconnectorMod.KernelConnector.IOptions) = this()
  }
}
