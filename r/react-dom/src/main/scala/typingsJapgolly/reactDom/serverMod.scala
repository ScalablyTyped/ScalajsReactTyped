package typingsJapgolly.reactDom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.AbortSignal
import typingsJapgolly.reactDom.serverMod.global.NodeJS.ReadableStream
import typingsJapgolly.reactDom.serverMod.global.NodeJS.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("react-dom/server", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderToNodeStream(element: Element): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToPipeableStream(children: Node): PipeableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToPipeableStream")(children.asInstanceOf[js.Any]).asInstanceOf[PipeableStream]
  inline def renderToPipeableStream(children: Node, options: RenderToPipeableStreamOptions): PipeableStream = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToPipeableStream")(children.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PipeableStream]
  
  inline def renderToReadableStream(children: Node): js.Promise[ReactDOMServerReadableStream] = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToReadableStream")(children.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReactDOMServerReadableStream]]
  inline def renderToReadableStream(children: Node, options: RenderToReadableStreamOptions): js.Promise[ReactDOMServerReadableStream] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderToReadableStream")(children.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReactDOMServerReadableStream]]
  
  inline def renderToStaticMarkup(element: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticMarkup")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def renderToStaticNodeStream(element: Element): ReadableStream = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToStaticNodeStream")(element.asInstanceOf[js.Any]).asInstanceOf[ReadableStream]
  
  inline def renderToString(element: Element): String = ^.asInstanceOf[js.Dynamic].applyDynamic("renderToString")(element.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("react-dom/server", "version")
  @js.native
  val version: String = js.native
  
  trait PipeableStream extends StObject {
    
    def abort(): Unit
    
    def pipe[Writable /* <: WritableStream */](destination: Writable): Writable
  }
  object PipeableStream {
    
    inline def apply(abort: Callback, pipe: Any => Any): PipeableStream = {
      val __obj = js.Dynamic.literal(abort = abort.toJsFn, pipe = js.Any.fromFunction1(pipe))
      __obj.asInstanceOf[PipeableStream]
    }
    
    extension [Self <: PipeableStream](x: Self) {
      
      inline def setAbort(value: Callback): Self = StObject.set(x, "abort", value.toJsFn)
      
      inline def setPipe(value: Any => Any): Self = StObject.set(x, "pipe", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait ReactDOMServerReadableStream
    extends StObject
       with typingsJapgolly.std.ReadableStream[Any] {
    
    var allReady: js.Promise[Unit] = js.native
  }
  
  trait RenderToPipeableStreamOptions extends StObject {
    
    var bootstrapModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var bootstrapScriptContent: js.UndefOr[String] = js.undefined
    
    var bootstrapScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var namespaceURI: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onAllReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onShellError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var onShellReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var progressiveChunkSize: js.UndefOr[Double] = js.undefined
  }
  object RenderToPipeableStreamOptions {
    
    inline def apply(): RenderToPipeableStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderToPipeableStreamOptions]
    }
    
    extension [Self <: RenderToPipeableStreamOptions](x: Self) {
      
      inline def setBootstrapModules(value: js.Array[String]): Self = StObject.set(x, "bootstrapModules", value.asInstanceOf[js.Any])
      
      inline def setBootstrapModulesUndefined: Self = StObject.set(x, "bootstrapModules", js.undefined)
      
      inline def setBootstrapModulesVarargs(value: String*): Self = StObject.set(x, "bootstrapModules", js.Array(value*))
      
      inline def setBootstrapScriptContent(value: String): Self = StObject.set(x, "bootstrapScriptContent", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptContentUndefined: Self = StObject.set(x, "bootstrapScriptContent", js.undefined)
      
      inline def setBootstrapScripts(value: js.Array[String]): Self = StObject.set(x, "bootstrapScripts", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptsUndefined: Self = StObject.set(x, "bootstrapScripts", js.undefined)
      
      inline def setBootstrapScriptsVarargs(value: String*): Self = StObject.set(x, "bootstrapScripts", js.Array(value*))
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnAllReady(value: Callback): Self = StObject.set(x, "onAllReady", value.toJsFn)
      
      inline def setOnAllReadyUndefined: Self = StObject.set(x, "onAllReady", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnShellError(value: /* error */ Any => Callback): Self = StObject.set(x, "onShellError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnShellErrorUndefined: Self = StObject.set(x, "onShellError", js.undefined)
      
      inline def setOnShellReady(value: Callback): Self = StObject.set(x, "onShellReady", value.toJsFn)
      
      inline def setOnShellReadyUndefined: Self = StObject.set(x, "onShellReady", js.undefined)
      
      inline def setProgressiveChunkSize(value: Double): Self = StObject.set(x, "progressiveChunkSize", value.asInstanceOf[js.Any])
      
      inline def setProgressiveChunkSizeUndefined: Self = StObject.set(x, "progressiveChunkSize", js.undefined)
    }
  }
  
  trait RenderToReadableStreamOptions extends StObject {
    
    var bootstrapModules: js.UndefOr[js.Array[String]] = js.undefined
    
    var bootstrapScriptContent: js.UndefOr[String] = js.undefined
    
    var bootstrapScripts: js.UndefOr[js.Array[String]] = js.undefined
    
    var identifierPrefix: js.UndefOr[String] = js.undefined
    
    var namespaceURI: js.UndefOr[String] = js.undefined
    
    var nonce: js.UndefOr[String] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ Any, Unit]] = js.undefined
    
    var progressiveChunkSize: js.UndefOr[Double] = js.undefined
    
    var signal: js.UndefOr[AbortSignal] = js.undefined
  }
  object RenderToReadableStreamOptions {
    
    inline def apply(): RenderToReadableStreamOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RenderToReadableStreamOptions]
    }
    
    extension [Self <: RenderToReadableStreamOptions](x: Self) {
      
      inline def setBootstrapModules(value: js.Array[String]): Self = StObject.set(x, "bootstrapModules", value.asInstanceOf[js.Any])
      
      inline def setBootstrapModulesUndefined: Self = StObject.set(x, "bootstrapModules", js.undefined)
      
      inline def setBootstrapModulesVarargs(value: String*): Self = StObject.set(x, "bootstrapModules", js.Array(value*))
      
      inline def setBootstrapScriptContent(value: String): Self = StObject.set(x, "bootstrapScriptContent", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptContentUndefined: Self = StObject.set(x, "bootstrapScriptContent", js.undefined)
      
      inline def setBootstrapScripts(value: js.Array[String]): Self = StObject.set(x, "bootstrapScripts", value.asInstanceOf[js.Any])
      
      inline def setBootstrapScriptsUndefined: Self = StObject.set(x, "bootstrapScripts", js.undefined)
      
      inline def setBootstrapScriptsVarargs(value: String*): Self = StObject.set(x, "bootstrapScripts", js.Array(value*))
      
      inline def setIdentifierPrefix(value: String): Self = StObject.set(x, "identifierPrefix", value.asInstanceOf[js.Any])
      
      inline def setIdentifierPrefixUndefined: Self = StObject.set(x, "identifierPrefix", js.undefined)
      
      inline def setNamespaceURI(value: String): Self = StObject.set(x, "namespaceURI", value.asInstanceOf[js.Any])
      
      inline def setNamespaceURIUndefined: Self = StObject.set(x, "namespaceURI", js.undefined)
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      inline def setOnError(value: /* error */ Any => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ Any) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setProgressiveChunkSize(value: Double): Self = StObject.set(x, "progressiveChunkSize", value.asInstanceOf[js.Any])
      
      inline def setProgressiveChunkSizeUndefined: Self = StObject.set(x, "progressiveChunkSize", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  object global {
    
    object NodeJS {
      
      // tslint:disable-next-line:no-empty-interface
      trait ReadableStream extends StObject
      
      // tslint:disable-next-line:no-empty-interface
      trait WritableStream extends StObject
    }
  }
}
