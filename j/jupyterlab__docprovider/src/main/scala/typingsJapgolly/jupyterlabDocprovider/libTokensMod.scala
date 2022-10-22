package typingsJapgolly.jupyterlabDocprovider

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.jupyterlabDocprovider.libTokensMod.IDocumentProviderFactory.IOptions
import typingsJapgolly.jupyterlabSharedModels.libApiMod.DocumentChange
import typingsJapgolly.jupyterlabSharedModels.mod.YDocument
import typingsJapgolly.luminoCoreutils.mod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTokensMod {
  
  object IDocumentProviderFactory extends Shortcut {
    
    @JSImport("@jupyterlab/docprovider/lib/tokens", "IDocumentProviderFactory")
    @js.native
    val ^ : Token[IDocumentProviderFactory] = js.native
    
    /**
      * The instantiation options for a IDocumentProviderFactory.
      */
    trait IOptions extends StObject {
      
      var contentType: String
      
      /**
        * The name (id) of the room
        */
      var path: String
      
      /**
        * The YNotebook.
        */
      var ymodel: YDocument[DocumentChange]
    }
    object IOptions {
      
      inline def apply(contentType: String, path: String, ymodel: YDocument[DocumentChange]): IOptions = {
        val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], ymodel = ymodel.asInstanceOf[js.Any])
        __obj.asInstanceOf[IOptions]
      }
      
      extension [Self <: IOptions](x: Self) {
        
        inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setYmodel(value: YDocument[DocumentChange]): Self = StObject.set(x, "ymodel", value.asInstanceOf[js.Any])
      }
    }
    
    type _To = Token[IDocumentProviderFactory]
    
    /* This means you don't have to write `^`, but can instead just say `IDocumentProviderFactory.foo` */
    override def _to: Token[IDocumentProviderFactory] = ^
  }
  type IDocumentProviderFactory = js.Function1[/* options */ IOptions, IDocumentProvider]
  
  trait IDocumentProvider extends StObject {
    
    /**
      * Acquire a lock.
      * Returns a Promise that resolves to the lock number.
      */
    def acquireLock(): js.Promise[Double]
    
    /**
      * Destroy the provider.
      */
    def destroy(): Unit
    
    /**
      * Put the initialized state.
      */
    def putInitializedState(): Unit
    
    /**
      * Release a lock.
      *
      * @param lock The lock to release.
      */
    def releaseLock(lock: Double): Unit
    
    /**
      * Resolves to true if the initial content has been initialized on the server. false otherwise.
      */
    def requestInitialContent(): js.Promise[Boolean]
    
    /**
      * This should be called by the docregistry when the file has been renamed to update the websocket connection url
      */
    def setPath(newPath: String): Unit
  }
  object IDocumentProvider {
    
    inline def apply(
      acquireLock: CallbackTo[js.Promise[Double]],
      destroy: Callback,
      putInitializedState: Callback,
      releaseLock: Double => Callback,
      requestInitialContent: CallbackTo[js.Promise[Boolean]],
      setPath: String => Callback
    ): IDocumentProvider = {
      val __obj = js.Dynamic.literal(acquireLock = acquireLock.toJsFn, destroy = destroy.toJsFn, putInitializedState = putInitializedState.toJsFn, releaseLock = js.Any.fromFunction1((t0: Double) => releaseLock(t0).runNow()), requestInitialContent = requestInitialContent.toJsFn, setPath = js.Any.fromFunction1((t0: String) => setPath(t0).runNow()))
      __obj.asInstanceOf[IDocumentProvider]
    }
    
    extension [Self <: IDocumentProvider](x: Self) {
      
      inline def setAcquireLock(value: CallbackTo[js.Promise[Double]]): Self = StObject.set(x, "acquireLock", value.toJsFn)
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setPutInitializedState(value: Callback): Self = StObject.set(x, "putInitializedState", value.toJsFn)
      
      inline def setReleaseLock(value: Double => Callback): Self = StObject.set(x, "releaseLock", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setRequestInitialContent(value: CallbackTo[js.Promise[Boolean]]): Self = StObject.set(x, "requestInitialContent", value.toJsFn)
      
      inline def setSetPath(value: String => Callback): Self = StObject.set(x, "setPath", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
}
