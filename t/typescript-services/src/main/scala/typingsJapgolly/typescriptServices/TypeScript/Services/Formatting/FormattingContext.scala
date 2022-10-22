package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormattingContext extends StObject {
  
  def BlockIsOnOneLine(node: IndentationNodeContext): Boolean
  
  def ContextNodeAllOnSameLine(): Boolean
  
  def ContextNodeBlockIsOnOneLine(): Boolean
  
  def NextNodeAllOnSameLine(): Boolean
  
  def NextNodeBlockIsOnOneLine(): Boolean
  
  def NodeIsOnOneLine(node: IndentationNodeContext): Boolean
  
  def TokensAreOnSameLine(): Boolean
  
  var contextNode: IndentationNodeContext
  
  /* private */ var contextNodeAllOnSameLine: Any
  
  /* private */ var contextNodeBlockIsOnOneLine: Any
  
  var currentTokenParent: IndentationNodeContext
  
  var currentTokenSpan: TokenSpan
  
  var formattingRequestKind: FormattingRequestKind
  
  /* private */ var nextNodeAllOnSameLine: Any
  
  /* private */ var nextNodeBlockIsOnOneLine: Any
  
  var nextTokenParent: IndentationNodeContext
  
  var nextTokenSpan: TokenSpan
  
  /* private */ var snapshot: Any
  
  /* private */ var tokensAreOnSameLine: Any
  
  def updateContext(
    currentTokenSpan: TokenSpan,
    currentTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    nextTokenParent: IndentationNodeContext,
    commonParent: IndentationNodeContext
  ): Unit
}
object FormattingContext {
  
  inline def apply(
    BlockIsOnOneLine: IndentationNodeContext => Boolean,
    ContextNodeAllOnSameLine: CallbackTo[Boolean],
    ContextNodeBlockIsOnOneLine: CallbackTo[Boolean],
    NextNodeAllOnSameLine: CallbackTo[Boolean],
    NextNodeBlockIsOnOneLine: CallbackTo[Boolean],
    NodeIsOnOneLine: IndentationNodeContext => Boolean,
    TokensAreOnSameLine: CallbackTo[Boolean],
    contextNode: IndentationNodeContext,
    contextNodeAllOnSameLine: Any,
    contextNodeBlockIsOnOneLine: Any,
    currentTokenParent: IndentationNodeContext,
    currentTokenSpan: TokenSpan,
    formattingRequestKind: FormattingRequestKind,
    nextNodeAllOnSameLine: Any,
    nextNodeBlockIsOnOneLine: Any,
    nextTokenParent: IndentationNodeContext,
    nextTokenSpan: TokenSpan,
    snapshot: Any,
    tokensAreOnSameLine: Any,
    updateContext: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Callback
  ): FormattingContext = {
    val __obj = js.Dynamic.literal(BlockIsOnOneLine = js.Any.fromFunction1(BlockIsOnOneLine), ContextNodeAllOnSameLine = ContextNodeAllOnSameLine.toJsFn, ContextNodeBlockIsOnOneLine = ContextNodeBlockIsOnOneLine.toJsFn, NextNodeAllOnSameLine = NextNodeAllOnSameLine.toJsFn, NextNodeBlockIsOnOneLine = NextNodeBlockIsOnOneLine.toJsFn, NodeIsOnOneLine = js.Any.fromFunction1(NodeIsOnOneLine), TokensAreOnSameLine = TokensAreOnSameLine.toJsFn, contextNode = contextNode.asInstanceOf[js.Any], contextNodeAllOnSameLine = contextNodeAllOnSameLine.asInstanceOf[js.Any], contextNodeBlockIsOnOneLine = contextNodeBlockIsOnOneLine.asInstanceOf[js.Any], currentTokenParent = currentTokenParent.asInstanceOf[js.Any], currentTokenSpan = currentTokenSpan.asInstanceOf[js.Any], formattingRequestKind = formattingRequestKind.asInstanceOf[js.Any], nextNodeAllOnSameLine = nextNodeAllOnSameLine.asInstanceOf[js.Any], nextNodeBlockIsOnOneLine = nextNodeBlockIsOnOneLine.asInstanceOf[js.Any], nextTokenParent = nextTokenParent.asInstanceOf[js.Any], nextTokenSpan = nextTokenSpan.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any], tokensAreOnSameLine = tokensAreOnSameLine.asInstanceOf[js.Any], updateContext = js.Any.fromFunction5((t0: TokenSpan, t1: IndentationNodeContext, t2: TokenSpan, t3: IndentationNodeContext, t4: IndentationNodeContext) => (updateContext(t0, t1, t2, t3, t4)).runNow()))
    __obj.asInstanceOf[FormattingContext]
  }
  
  extension [Self <: FormattingContext](x: Self) {
    
    inline def setBlockIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "BlockIsOnOneLine", js.Any.fromFunction1(value))
    
    inline def setContextNode(value: IndentationNodeContext): Self = StObject.set(x, "contextNode", value.asInstanceOf[js.Any])
    
    inline def setContextNodeAllOnSameLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "ContextNodeAllOnSameLine", value.toJsFn)
    
    inline def setContextNodeBlockIsOnOneLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "ContextNodeBlockIsOnOneLine", value.toJsFn)
    
    inline def setCurrentTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "currentTokenParent", value.asInstanceOf[js.Any])
    
    inline def setCurrentTokenSpan(value: TokenSpan): Self = StObject.set(x, "currentTokenSpan", value.asInstanceOf[js.Any])
    
    inline def setFormattingRequestKind(value: FormattingRequestKind): Self = StObject.set(x, "formattingRequestKind", value.asInstanceOf[js.Any])
    
    inline def setNextNodeAllOnSameLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "NextNodeAllOnSameLine", value.toJsFn)
    
    inline def setNextNodeBlockIsOnOneLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "NextNodeBlockIsOnOneLine", value.toJsFn)
    
    inline def setNextTokenParent(value: IndentationNodeContext): Self = StObject.set(x, "nextTokenParent", value.asInstanceOf[js.Any])
    
    inline def setNextTokenSpan(value: TokenSpan): Self = StObject.set(x, "nextTokenSpan", value.asInstanceOf[js.Any])
    
    inline def setNodeIsOnOneLine(value: IndentationNodeContext => Boolean): Self = StObject.set(x, "NodeIsOnOneLine", js.Any.fromFunction1(value))
    
    inline def setSnapshot(value: Any): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    
    inline def setTokensAreOnSameLine(value: CallbackTo[Boolean]): Self = StObject.set(x, "TokensAreOnSameLine", value.toJsFn)
    
    inline def setUpdateContext(
      value: (TokenSpan, IndentationNodeContext, TokenSpan, IndentationNodeContext, IndentationNodeContext) => Callback
    ): Self = StObject.set(x, "updateContext", js.Any.fromFunction5((t0: TokenSpan, t1: IndentationNodeContext, t2: TokenSpan, t3: IndentationNodeContext, t4: IndentationNodeContext) => (value(t0, t1, t2, t3, t4)).runNow()))
  }
}
