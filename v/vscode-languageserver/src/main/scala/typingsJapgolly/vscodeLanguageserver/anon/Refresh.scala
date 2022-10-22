package typingsJapgolly.vscodeLanguageserver.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.vscodeJsonrpc.libCommonConnectionMod.RequestHandler
import typingsJapgolly.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotinlayHintMod.InlayHintParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.InlayHint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Refresh extends StObject {
  
  /**
    * Installs a handler for the inlay hints request.
    *
    * @param handler The corresponding handler.
    */
  def on(
    handler: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit]
  ): Disposable
  
  /**
    * Ask the client to refresh all inlay hints.
    */
  def refresh(): js.Promise[Unit]
  
  /**
    * Installs a handler for the inlay hint resolve request.
    *
    * @param handler The corresponding handler.
    */
  def resolve(handler: RequestHandler[InlayHint, InlayHint, Unit]): Disposable
}
object Refresh {
  
  inline def apply(
    on: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit] => Disposable,
    refresh: CallbackTo[js.Promise[Unit]],
    resolve: RequestHandler[InlayHint, InlayHint, Unit] => Disposable
  ): Refresh = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), refresh = refresh.toJsFn, resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[Refresh]
  }
  
  extension [Self <: Refresh](x: Self) {
    
    inline def setOn(
      value: ServerRequestHandler[InlayHintParams, js.UndefOr[js.Array[InlayHint] | Null], js.Array[InlayHint], Unit] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "refresh", value.toJsFn)
    
    inline def setResolve(value: RequestHandler[InlayHint, InlayHint, Unit] => Disposable): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
  }
}
