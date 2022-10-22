package typingsJapgolly.typescriptServices.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typescript-services", "PullContextualTypeContext")
@js.native
open class PullContextualTypeContext protected ()
  extends StObject
     with typingsJapgolly.typescriptServices.TypeScript.PullContextualTypeContext {
  def this(
    contextualType: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol,
    provisional: Boolean,
    isInferentiallyTyping: Boolean,
    typeArgumentInferenceContext: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentInferenceContext
  ) = this()
  
  /* private */ /* CompleteClass */
  var astSymbolMap: Any = js.native
  
  /* CompleteClass */
  var contextualType: typingsJapgolly.typescriptServices.TypeScript.PullTypeSymbol = js.native
  
  /* CompleteClass */
  override def getSymbolForAST(ast: typingsJapgolly.typescriptServices.TypeScript.AST): typingsJapgolly.typescriptServices.TypeScript.PullSymbol = js.native
  
  /* CompleteClass */
  var hasProvisionalErrors: Boolean = js.native
  
  /* CompleteClass */
  override def invalidateProvisionallyTypedSymbols(): Unit = js.native
  
  /* CompleteClass */
  var isInferentiallyTyping: Boolean = js.native
  
  /* CompleteClass */
  var provisional: Boolean = js.native
  
  /* CompleteClass */
  var provisionallyTypedSymbols: js.Array[typingsJapgolly.typescriptServices.TypeScript.PullSymbol] = js.native
  
  /* CompleteClass */
  override def recordProvisionallyTypedSymbol(symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol): Unit = js.native
  
  /* CompleteClass */
  override def setSymbolForAST(
    ast: typingsJapgolly.typescriptServices.TypeScript.AST,
    symbol: typingsJapgolly.typescriptServices.TypeScript.PullSymbol
  ): Unit = js.native
  
  /* CompleteClass */
  var typeArgumentInferenceContext: typingsJapgolly.typescriptServices.TypeScript.TypeArgumentInferenceContext = js.native
}
