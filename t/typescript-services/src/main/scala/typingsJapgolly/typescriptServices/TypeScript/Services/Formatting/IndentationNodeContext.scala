package typingsJapgolly.typescriptServices.TypeScript.Services.Formatting

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.typescriptServices.TypeScript.SyntaxKind
import typingsJapgolly.typescriptServices.TypeScript.SyntaxNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndentationNodeContext extends StObject {
  
  /* private */ var _childIndentationAmountDelta: Any
  
  /* private */ var _depth: Any
  
  /* private */ var _fullStart: Any
  
  /* private */ var _hasSkippedOrMissingTokenChild: Any
  
  /* private */ var _indentationAmount: Any
  
  /* private */ var _node: Any
  
  /* private */ var _parent: Any
  
  def childIndentationAmountDelta(): Double
  
  def clone(pool: IndentationNodeContextPool): IndentationNodeContext
  
  def depth(): Double
  
  def end(): Double
  
  def fullStart(): Double
  
  def fullWidth(): Double
  
  def hasSkippedOrMissingTokenChild(): Boolean
  
  def indentationAmount(): Double
  
  def kind(): SyntaxKind
  
  def node(): SyntaxNode
  
  def parent(): IndentationNodeContext
  
  def start(): Double
  
  def update(
    parent: IndentationNodeContext,
    node: SyntaxNode,
    fullStart: Double,
    indentationAmount: Double,
    childIndentationAmountDelta: Double
  ): Unit
}
object IndentationNodeContext {
  
  inline def apply(
    _childIndentationAmountDelta: Any,
    _depth: Any,
    _fullStart: Any,
    _hasSkippedOrMissingTokenChild: Any,
    _indentationAmount: Any,
    _node: Any,
    _parent: Any,
    childIndentationAmountDelta: CallbackTo[Double],
    clone_ : IndentationNodeContextPool => IndentationNodeContext,
    depth: CallbackTo[Double],
    end: CallbackTo[Double],
    fullStart: CallbackTo[Double],
    fullWidth: CallbackTo[Double],
    hasSkippedOrMissingTokenChild: CallbackTo[Boolean],
    indentationAmount: CallbackTo[Double],
    kind: CallbackTo[SyntaxKind],
    node: CallbackTo[SyntaxNode],
    parent: CallbackTo[IndentationNodeContext],
    start: CallbackTo[Double],
    update: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Callback
  ): IndentationNodeContext = {
    val __obj = js.Dynamic.literal(_childIndentationAmountDelta = _childIndentationAmountDelta.asInstanceOf[js.Any], _depth = _depth.asInstanceOf[js.Any], _fullStart = _fullStart.asInstanceOf[js.Any], _hasSkippedOrMissingTokenChild = _hasSkippedOrMissingTokenChild.asInstanceOf[js.Any], _indentationAmount = _indentationAmount.asInstanceOf[js.Any], _node = _node.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], childIndentationAmountDelta = childIndentationAmountDelta.toJsFn, depth = depth.toJsFn, end = end.toJsFn, fullStart = fullStart.toJsFn, fullWidth = fullWidth.toJsFn, hasSkippedOrMissingTokenChild = hasSkippedOrMissingTokenChild.toJsFn, indentationAmount = indentationAmount.toJsFn, kind = kind.toJsFn, node = node.toJsFn, parent = parent.toJsFn, start = start.toJsFn, update = js.Any.fromFunction5((t0: IndentationNodeContext, t1: SyntaxNode, t2: Double, t3: Double, t4: Double) => (update(t0, t1, t2, t3, t4)).runNow()))
    __obj.updateDynamic("clone")(js.Any.fromFunction1(clone_))
    __obj.asInstanceOf[IndentationNodeContext]
  }
  
  extension [Self <: IndentationNodeContext](x: Self) {
    
    inline def setChildIndentationAmountDelta(value: CallbackTo[Double]): Self = StObject.set(x, "childIndentationAmountDelta", value.toJsFn)
    
    inline def setClone_(value: IndentationNodeContextPool => IndentationNodeContext): Self = StObject.set(x, "clone", js.Any.fromFunction1(value))
    
    inline def setDepth(value: CallbackTo[Double]): Self = StObject.set(x, "depth", value.toJsFn)
    
    inline def setEnd(value: CallbackTo[Double]): Self = StObject.set(x, "end", value.toJsFn)
    
    inline def setFullStart(value: CallbackTo[Double]): Self = StObject.set(x, "fullStart", value.toJsFn)
    
    inline def setFullWidth(value: CallbackTo[Double]): Self = StObject.set(x, "fullWidth", value.toJsFn)
    
    inline def setHasSkippedOrMissingTokenChild(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasSkippedOrMissingTokenChild", value.toJsFn)
    
    inline def setIndentationAmount(value: CallbackTo[Double]): Self = StObject.set(x, "indentationAmount", value.toJsFn)
    
    inline def setKind(value: CallbackTo[SyntaxKind]): Self = StObject.set(x, "kind", value.toJsFn)
    
    inline def setNode(value: CallbackTo[SyntaxNode]): Self = StObject.set(x, "node", value.toJsFn)
    
    inline def setParent(value: CallbackTo[IndentationNodeContext]): Self = StObject.set(x, "parent", value.toJsFn)
    
    inline def setStart(value: CallbackTo[Double]): Self = StObject.set(x, "start", value.toJsFn)
    
    inline def setUpdate(value: (IndentationNodeContext, SyntaxNode, Double, Double, Double) => Callback): Self = StObject.set(x, "update", js.Any.fromFunction5((t0: IndentationNodeContext, t1: SyntaxNode, t2: Double, t3: Double, t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def set_childIndentationAmountDelta(value: Any): Self = StObject.set(x, "_childIndentationAmountDelta", value.asInstanceOf[js.Any])
    
    inline def set_depth(value: Any): Self = StObject.set(x, "_depth", value.asInstanceOf[js.Any])
    
    inline def set_fullStart(value: Any): Self = StObject.set(x, "_fullStart", value.asInstanceOf[js.Any])
    
    inline def set_hasSkippedOrMissingTokenChild(value: Any): Self = StObject.set(x, "_hasSkippedOrMissingTokenChild", value.asInstanceOf[js.Any])
    
    inline def set_indentationAmount(value: Any): Self = StObject.set(x, "_indentationAmount", value.asInstanceOf[js.Any])
    
    inline def set_node(value: Any): Self = StObject.set(x, "_node", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
  }
}
