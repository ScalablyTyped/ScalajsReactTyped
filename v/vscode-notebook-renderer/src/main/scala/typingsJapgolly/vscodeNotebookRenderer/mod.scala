package typingsJapgolly.vscodeNotebookRenderer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.AbortSignal
import org.scalajs.dom.Blob
import org.scalajs.dom.HTMLElement
import typingsJapgolly.vscodeNotebookRenderer.anon.IsTrusted
import typingsJapgolly.vscodeNotebookRenderer.eventsMod.Disposable
import typingsJapgolly.vscodeNotebookRenderer.eventsMod.VSCodeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ActivationFunction[TState] = js.Function1[
    /* context */ RendererContext[TState], 
    js.UndefOr[js.Promise[js.UndefOr[RendererApi]] | RendererApi]
  ]
  
  trait OutputItem extends StObject {
    
    /**
      * The data as blob. The blob-type will be initialized the `mime`
      * of this object.
      */
    def blob(): Blob
    
    /**
      * The data as bytes.
      */
    def data(): js.typedarray.Uint8Array
    
    /**
      * Unique id of the output item.
      */
    val id: String
    
    /**
      * The data as object - parsed from JSON. Note that this will
      * throw an error when the underlying data is not a valid JSON string.
      */
    def json(): Any
    
    /**
      * Output item metadata.
      */
    val metadata: Any
    
    /**
      * Mime type being rendered.
      */
    val mime: String
    
    /**
      * The data as text. Note that a UTF-8 decoder is used is create
      * the string from the underlying bytes.
      */
    def text(): String
  }
  object OutputItem {
    
    inline def apply(
      blob: CallbackTo[Blob],
      data: CallbackTo[js.typedarray.Uint8Array],
      id: String,
      json: CallbackTo[Any],
      metadata: Any,
      mime: String,
      text: CallbackTo[String]
    ): OutputItem = {
      val __obj = js.Dynamic.literal(blob = blob.toJsFn, data = data.toJsFn, id = id.asInstanceOf[js.Any], json = json.toJsFn, metadata = metadata.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], text = text.toJsFn)
      __obj.asInstanceOf[OutputItem]
    }
    
    extension [Self <: OutputItem](x: Self) {
      
      inline def setBlob(value: CallbackTo[Blob]): Self = StObject.set(x, "blob", value.toJsFn)
      
      inline def setData(value: CallbackTo[js.typedarray.Uint8Array]): Self = StObject.set(x, "data", value.toJsFn)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJson(value: CallbackTo[Any]): Self = StObject.set(x, "json", value.toJsFn)
      
      inline def setMetadata(value: Any): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setText(value: CallbackTo[String]): Self = StObject.set(x, "text", value.toJsFn)
    }
  }
  
  trait RendererApi
    extends StObject
       with /**
    * Optional additional methods and properties for other renderers to consume using
    * {@link RendererContext.getRenderer}.
    *
    * This lets your renderer expose hooks that other renderers can use to extend its behavior.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Called by the editor when a previously-rendered output item is being disposed of.
      *
      * Your renderer should implement this if you need to clean up anything that was registered
      * during `renderOutputItem`. This would include global event listeners or any HTML elements outside of the
      * output item's node.
      *
      * @param id The id of the item being removed. If `undefined`, all cells are being removed.
      */
    var disposeOutputItem: js.UndefOr[js.Function1[/* id */ js.UndefOr[String], Unit]] = js.undefined
    
    /**
      * Called by the editor to render an output item.
      *
      * This is invoked by the editor when an output item is first rendered or when
      * the output item is updated.
      *
      * @param outputItem Output item to render.
      * @param element Html element to render into.
      * @param signal Fired if rendering has been canceled.
      *
      * @return If rendering is asynchronous, a promise that resolves when rendering has finished.
      */
    def renderOutputItem(outputItem: OutputItem, element: HTMLElement, signal: AbortSignal): Unit | js.Promise[Unit]
  }
  object RendererApi {
    
    inline def apply(renderOutputItem: (OutputItem, HTMLElement, AbortSignal) => Unit | js.Promise[Unit]): RendererApi = {
      val __obj = js.Dynamic.literal(renderOutputItem = js.Any.fromFunction3(renderOutputItem))
      __obj.asInstanceOf[RendererApi]
    }
    
    extension [Self <: RendererApi](x: Self) {
      
      inline def setDisposeOutputItem(value: /* id */ js.UndefOr[String] => Callback): Self = StObject.set(x, "disposeOutputItem", js.Any.fromFunction1((t0: /* id */ js.UndefOr[String]) => value(t0).runNow()))
      
      inline def setDisposeOutputItemUndefined: Self = StObject.set(x, "disposeOutputItem", js.undefined)
      
      inline def setRenderOutputItem(value: (OutputItem, HTMLElement, AbortSignal) => Unit | js.Promise[Unit]): Self = StObject.set(x, "renderOutputItem", js.Any.fromFunction3(value))
    }
  }
  
  trait RendererContext[TState] extends StObject {
    
    /**
      * Retrieve the API of another renderer.
      *
      * This allows the current renderer to extend another renderer.
      *
      * @param id Id of the renderer to retrieve. This is the `id` of the `notebookRenderer` contribution in
      * the target renderer's `package.json`.
      *
      * @return The API of the requested renderer. This is the object returned from its `activate` method. Returns
      * `undefined` if the requested renderer cannot be found.
      */
    def getRenderer(id: String): js.Promise[js.UndefOr[RendererApi]]
    
    /**
      * Gets any previously set renderer-specific state.
      * @see RendererContext.setState
      */
    def getState(): js.UndefOr[TState]
    
    /**
      * Event that may be present if `requiresMessaging` is set to `true`
      * or `optional` in the renderer contribution point.
      *
      * Fires when a message is sent via the `vscode.notebook.createRendererMessaging`
      * object in the extension host.
      */
    var onDidReceiveMessage: js.UndefOr[VSCodeEvent[Any]] = js.undefined
    
    /**
      * Method that may be present if `requiresMessaging` is set to `true`
      * or `optional` in the renderer contribution point.
      *
      * Sends a message to a renderer listening via the `vscode.notebook.createRendererMessaging`
      * object in the extension host.
      */
    var postMessage: js.UndefOr[js.Function1[/* message */ Any, Unit]] = js.undefined
    
    /**
      * Sets renderer-specific state that is persisted in the webview.
      */
    def setState(value: TState): Unit
    
    /**
      * Information about the current workspace.
      */
    val workspace: IsTrusted
  }
  object RendererContext {
    
    inline def apply[TState](
      getRenderer: String => js.Promise[js.UndefOr[RendererApi]],
      getState: CallbackTo[js.UndefOr[TState]],
      setState: TState => Callback,
      workspace: IsTrusted
    ): RendererContext[TState] = {
      val __obj = js.Dynamic.literal(getRenderer = js.Any.fromFunction1(getRenderer), getState = getState.toJsFn, setState = js.Any.fromFunction1((t0: TState) => setState(t0).runNow()), workspace = workspace.asInstanceOf[js.Any])
      __obj.asInstanceOf[RendererContext[TState]]
    }
    
    extension [Self <: RendererContext[?], TState](x: Self & RendererContext[TState]) {
      
      inline def setGetRenderer(value: String => js.Promise[js.UndefOr[RendererApi]]): Self = StObject.set(x, "getRenderer", js.Any.fromFunction1(value))
      
      inline def setGetState(value: CallbackTo[js.UndefOr[TState]]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setOnDidReceiveMessage(
        value: (/* listener */ js.Function1[Any, Any], /* thisArgs */ js.UndefOr[Any], /* disposables */ js.UndefOr[js.Array[Disposable]]) => Disposable
      ): Self = StObject.set(x, "onDidReceiveMessage", js.Any.fromFunction3(value))
      
      inline def setOnDidReceiveMessageUndefined: Self = StObject.set(x, "onDidReceiveMessage", js.undefined)
      
      inline def setPostMessage(value: /* message */ Any => Callback): Self = StObject.set(x, "postMessage", js.Any.fromFunction1((t0: /* message */ Any) => value(t0).runNow()))
      
      inline def setPostMessageUndefined: Self = StObject.set(x, "postMessage", js.undefined)
      
      inline def setSetState(value: TState => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: TState) => value(t0).runNow()))
      
      inline def setWorkspace(value: IsTrusted): Self = StObject.set(x, "workspace", value.asInstanceOf[js.Any])
    }
  }
}
