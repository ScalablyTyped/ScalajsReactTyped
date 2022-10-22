package typingsJapgolly.plottable

import japgolly.scalajs.react.Callback
import typingsJapgolly.plottable.buildSrcUtilsRTreeMod.RTreeNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcUtilsRTreeSplitStrategiesMod {
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyLinear")
  @js.native
  open class SplitStrategyLinear ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /**
      * Split the next entry. Choose the entry that expands its parent node's
      * area the least.
      */
    /* private */ var addNext: Any = js.native
    
    /**
      * Choose the two farthest-apart entries to begin the split.
      */
    /* private */ var chooseFirstSplit: Any = js.native
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  @JSImport("plottable/build/src/utils/rTreeSplitStrategies", "SplitStrategyTrivial")
  @js.native
  open class SplitStrategyTrivial ()
    extends StObject
       with IRTreeSplitStrategy {
    
    /* CompleteClass */
    override def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit = js.native
  }
  
  trait IRTreeSplitStrategy extends StObject {
    
    def split[T](entries: js.Array[RTreeNode[T]], nodes: NodePair[T]): Unit
  }
  object IRTreeSplitStrategy {
    
    inline def apply(split: (js.Array[RTreeNode[Any]], NodePair[Any]) => Callback): IRTreeSplitStrategy = {
      val __obj = js.Dynamic.literal(split = js.Any.fromFunction2((t0: js.Array[RTreeNode[Any]], t1: NodePair[Any]) => (split(t0, t1)).runNow()))
      __obj.asInstanceOf[IRTreeSplitStrategy]
    }
    
    extension [Self <: IRTreeSplitStrategy](x: Self) {
      
      inline def setSplit(value: (js.Array[RTreeNode[Any]], NodePair[Any]) => Callback): Self = StObject.set(x, "split", js.Any.fromFunction2((t0: js.Array[RTreeNode[Any]], t1: NodePair[Any]) => (value(t0, t1)).runNow()))
    }
  }
  
  type NodePair[T] = js.Tuple2[RTreeNode[T], RTreeNode[T]]
}
