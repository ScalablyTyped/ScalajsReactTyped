package typingsJapgolly.vscodeLanguageserver.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.vscodeJsonrpc.libCommonDisposableMod.Disposable
import typingsJapgolly.vscodeLanguageserver.libCommonServerMod.ServerRequestHandler
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensDeltaPartialResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensParams
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensPartialResult
import typingsJapgolly.vscodeLanguageserverProtocol.libCommonProtocolDotsemanticTokensMod.SemanticTokensRangeParams
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokens
import typingsJapgolly.vscodeLanguageserverTypes.mod.SemanticTokensDelta
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnDelta extends StObject {
  
  def on(
    handler: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Disposable
  
  def onDelta(
    handler: ServerRequestHandler[
      SemanticTokensDeltaParams, 
      SemanticTokensDelta | SemanticTokens, 
      SemanticTokensDeltaPartialResult, 
      Unit
    ]
  ): Disposable
  
  def onRange(
    handler: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit]
  ): Disposable
  
  def refresh(): Unit
}
object OnDelta {
  
  inline def apply(
    on: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable,
    onDelta: ServerRequestHandler[
      SemanticTokensDeltaParams, 
      SemanticTokensDelta | SemanticTokens, 
      SemanticTokensDeltaPartialResult, 
      Unit
    ] => Disposable,
    onRange: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable,
    refresh: Callback
  ): OnDelta = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction1(on), onDelta = js.Any.fromFunction1(onDelta), onRange = js.Any.fromFunction1(onRange), refresh = refresh.toJsFn)
    __obj.asInstanceOf[OnDelta]
  }
  
  extension [Self <: OnDelta](x: Self) {
    
    inline def setOn(
      value: ServerRequestHandler[SemanticTokensParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable
    ): Self = StObject.set(x, "on", js.Any.fromFunction1(value))
    
    inline def setOnDelta(
      value: ServerRequestHandler[
          SemanticTokensDeltaParams, 
          SemanticTokensDelta | SemanticTokens, 
          SemanticTokensDeltaPartialResult, 
          Unit
        ] => Disposable
    ): Self = StObject.set(x, "onDelta", js.Any.fromFunction1(value))
    
    inline def setOnRange(
      value: ServerRequestHandler[SemanticTokensRangeParams, SemanticTokens, SemanticTokensPartialResult, Unit] => Disposable
    ): Self = StObject.set(x, "onRange", js.Any.fromFunction1(value))
    
    inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
  }
}
