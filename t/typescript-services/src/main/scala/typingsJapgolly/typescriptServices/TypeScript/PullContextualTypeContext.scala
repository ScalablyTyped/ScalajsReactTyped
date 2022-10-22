package typingsJapgolly.typescriptServices.TypeScript

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PullContextualTypeContext extends StObject {
  
  /* private */ var astSymbolMap: Any
  
  var contextualType: PullTypeSymbol
  
  def getSymbolForAST(ast: AST): PullSymbol
  
  var hasProvisionalErrors: Boolean
  
  def invalidateProvisionallyTypedSymbols(): Unit
  
  var isInferentiallyTyping: Boolean
  
  var provisional: Boolean
  
  var provisionallyTypedSymbols: js.Array[PullSymbol]
  
  def recordProvisionallyTypedSymbol(symbol: PullSymbol): Unit
  
  def setSymbolForAST(ast: AST, symbol: PullSymbol): Unit
  
  var typeArgumentInferenceContext: TypeArgumentInferenceContext
}
object PullContextualTypeContext {
  
  inline def apply(
    astSymbolMap: Any,
    contextualType: PullTypeSymbol,
    getSymbolForAST: AST => PullSymbol,
    hasProvisionalErrors: Boolean,
    invalidateProvisionallyTypedSymbols: Callback,
    isInferentiallyTyping: Boolean,
    provisional: Boolean,
    provisionallyTypedSymbols: js.Array[PullSymbol],
    recordProvisionallyTypedSymbol: PullSymbol => Callback,
    setSymbolForAST: (AST, PullSymbol) => Callback,
    typeArgumentInferenceContext: TypeArgumentInferenceContext
  ): PullContextualTypeContext = {
    val __obj = js.Dynamic.literal(astSymbolMap = astSymbolMap.asInstanceOf[js.Any], contextualType = contextualType.asInstanceOf[js.Any], getSymbolForAST = js.Any.fromFunction1(getSymbolForAST), hasProvisionalErrors = hasProvisionalErrors.asInstanceOf[js.Any], invalidateProvisionallyTypedSymbols = invalidateProvisionallyTypedSymbols.toJsFn, isInferentiallyTyping = isInferentiallyTyping.asInstanceOf[js.Any], provisional = provisional.asInstanceOf[js.Any], provisionallyTypedSymbols = provisionallyTypedSymbols.asInstanceOf[js.Any], recordProvisionallyTypedSymbol = js.Any.fromFunction1((t0: PullSymbol) => recordProvisionallyTypedSymbol(t0).runNow()), setSymbolForAST = js.Any.fromFunction2((t0: AST, t1: PullSymbol) => (setSymbolForAST(t0, t1)).runNow()), typeArgumentInferenceContext = typeArgumentInferenceContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PullContextualTypeContext]
  }
  
  extension [Self <: PullContextualTypeContext](x: Self) {
    
    inline def setAstSymbolMap(value: Any): Self = StObject.set(x, "astSymbolMap", value.asInstanceOf[js.Any])
    
    inline def setContextualType(value: PullTypeSymbol): Self = StObject.set(x, "contextualType", value.asInstanceOf[js.Any])
    
    inline def setGetSymbolForAST(value: AST => PullSymbol): Self = StObject.set(x, "getSymbolForAST", js.Any.fromFunction1(value))
    
    inline def setHasProvisionalErrors(value: Boolean): Self = StObject.set(x, "hasProvisionalErrors", value.asInstanceOf[js.Any])
    
    inline def setInvalidateProvisionallyTypedSymbols(value: Callback): Self = StObject.set(x, "invalidateProvisionallyTypedSymbols", value.toJsFn)
    
    inline def setIsInferentiallyTyping(value: Boolean): Self = StObject.set(x, "isInferentiallyTyping", value.asInstanceOf[js.Any])
    
    inline def setProvisional(value: Boolean): Self = StObject.set(x, "provisional", value.asInstanceOf[js.Any])
    
    inline def setProvisionallyTypedSymbols(value: js.Array[PullSymbol]): Self = StObject.set(x, "provisionallyTypedSymbols", value.asInstanceOf[js.Any])
    
    inline def setProvisionallyTypedSymbolsVarargs(value: PullSymbol*): Self = StObject.set(x, "provisionallyTypedSymbols", js.Array(value*))
    
    inline def setRecordProvisionallyTypedSymbol(value: PullSymbol => Callback): Self = StObject.set(x, "recordProvisionallyTypedSymbol", js.Any.fromFunction1((t0: PullSymbol) => value(t0).runNow()))
    
    inline def setSetSymbolForAST(value: (AST, PullSymbol) => Callback): Self = StObject.set(x, "setSymbolForAST", js.Any.fromFunction2((t0: AST, t1: PullSymbol) => (value(t0, t1)).runNow()))
    
    inline def setTypeArgumentInferenceContext(value: TypeArgumentInferenceContext): Self = StObject.set(x, "typeArgumentInferenceContext", value.asInstanceOf[js.Any])
  }
}
