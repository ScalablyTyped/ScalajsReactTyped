package typingsJapgolly.flatTree

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flat-tree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def children(index: Double): (js.Tuple2[Double, Double]) | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("children")(index.asInstanceOf[js.Any]).asInstanceOf[(js.Tuple2[Double, Double]) | Null]
  inline def children(index: Double, depth: Double): (js.Tuple2[Double, Double]) | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("children")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[(js.Tuple2[Double, Double]) | Null]
  
  inline def count(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("count")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def count(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("count")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def countLeaves(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("countLeaves")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def depth(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("depth")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def fullRoots(index: Double): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("fullRoots")(index.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  inline def fullRoots(index: Double, result: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("fullRoots")(index.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def index(depth: Double, offset: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("index")(depth.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def iterator(index: Double): FlatTreeIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("iterator")(index.asInstanceOf[js.Any]).asInstanceOf[FlatTreeIterator]
  
  inline def leftChild(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("leftChild")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def leftChild(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("leftChild")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def leftSpan(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("leftSpan")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def leftSpan(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("leftSpan")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def offset(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("offset")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def offset(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("offset")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def parent(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("parent")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def parent(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parent")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rightChild(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rightChild")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rightChild(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rightChild")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def rightSpan(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("rightSpan")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def rightSpan(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("rightSpan")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sibling(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sibling")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def sibling(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("sibling")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def spans(index: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("spans")(index.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def spans(index: Double, depth: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("spans")(index.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  trait FlatTreeIterator extends StObject {
    
    /**
      * @returns true if the given index is within the tree.
      */
    def contains(index: Double): Boolean
    
    /**
      * @returns how many nodes (including parent nodes) the current tree contains.
      */
    def count(): Double
    
    /**
      * @returns how many nodes (excluding parent nodes) the current tree contains.
      */
    def countLeaves(): Double
    
    var factor: Double
    
    /**
      * @returns true if the node at the index is a full root
      */
    def fullRoot(index: Double): Boolean
    
    var index: Double
    
    /**
      * @returns true if the iterator at a left sibling
      */
    def isLeft(): Boolean
    
    /**
      * @returns true if the iterator at a right sibling
      */
    def isRight(): Boolean
    
    /**
      * Move the iterator to the current left child index.
      *
      * @returns the new .index
      */
    def leftChild(): Double
    
    /**
      * Move the iterator to the current left span index.
      *
      * @returns the new .index
      */
    def leftSpan(): Double
    
    /**
      * Move the iterator the next node.
      *
      * @returns the new .index
      */
    def next(): Double
    
    /**
      * Move the iterator to the next tree.
      *
      * @returns the new .index
      */
    def nextTree(): Double
    
    var offset: Double
    
    /**
      * Move the iterator to the current parent index.
      *
      * @returns the new .index
      */
    def parent(): Double
    
    /**
      * Move the iterator to the previous node.
      *
      * @returns the new .index
      */
    def prev(): Double
    
    /**
      * Move the iterator to the previous tree.
      *
      * @returns the new .index
      */
    def prevTree(): Double
    
    /**
      * Move the iterator to the current right child index.
      *
      * @returns the new .index
      */
    def rightChild(): Double
    
    /**
      * Move the iterator to the current right span index.
      *
      * @returns the new .index
      */
    def rightSpan(): Double
    
    /**
      * Move the iterator the this specific tree index.
      */
    def seek(index: Double): Unit
    
    /**
      * Move the iterator to the current sibling.
      *
      * @returns the new .index
      */
    def sibling(): Double
  }
  object FlatTreeIterator {
    
    inline def apply(
      contains: Double => Boolean,
      count: CallbackTo[Double],
      countLeaves: CallbackTo[Double],
      factor: Double,
      fullRoot: Double => Boolean,
      index: Double,
      isLeft: CallbackTo[Boolean],
      isRight: CallbackTo[Boolean],
      leftChild: CallbackTo[Double],
      leftSpan: CallbackTo[Double],
      next: CallbackTo[Double],
      nextTree: CallbackTo[Double],
      offset: Double,
      parent: CallbackTo[Double],
      prev: CallbackTo[Double],
      prevTree: CallbackTo[Double],
      rightChild: CallbackTo[Double],
      rightSpan: CallbackTo[Double],
      seek: Double => Callback,
      sibling: CallbackTo[Double]
    ): FlatTreeIterator = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), count = count.toJsFn, countLeaves = countLeaves.toJsFn, factor = factor.asInstanceOf[js.Any], fullRoot = js.Any.fromFunction1(fullRoot), index = index.asInstanceOf[js.Any], isLeft = isLeft.toJsFn, isRight = isRight.toJsFn, leftChild = leftChild.toJsFn, leftSpan = leftSpan.toJsFn, next = next.toJsFn, nextTree = nextTree.toJsFn, offset = offset.asInstanceOf[js.Any], parent = parent.toJsFn, prev = prev.toJsFn, prevTree = prevTree.toJsFn, rightChild = rightChild.toJsFn, rightSpan = rightSpan.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), sibling = sibling.toJsFn)
      __obj.asInstanceOf[FlatTreeIterator]
    }
    
    extension [Self <: FlatTreeIterator](x: Self) {
      
      inline def setContains(value: Double => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
      
      inline def setCountLeaves(value: CallbackTo[Double]): Self = StObject.set(x, "countLeaves", value.toJsFn)
      
      inline def setFactor(value: Double): Self = StObject.set(x, "factor", value.asInstanceOf[js.Any])
      
      inline def setFullRoot(value: Double => Boolean): Self = StObject.set(x, "fullRoot", js.Any.fromFunction1(value))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsLeft(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLeft", value.toJsFn)
      
      inline def setIsRight(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRight", value.toJsFn)
      
      inline def setLeftChild(value: CallbackTo[Double]): Self = StObject.set(x, "leftChild", value.toJsFn)
      
      inline def setLeftSpan(value: CallbackTo[Double]): Self = StObject.set(x, "leftSpan", value.toJsFn)
      
      inline def setNext(value: CallbackTo[Double]): Self = StObject.set(x, "next", value.toJsFn)
      
      inline def setNextTree(value: CallbackTo[Double]): Self = StObject.set(x, "nextTree", value.toJsFn)
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParent(value: CallbackTo[Double]): Self = StObject.set(x, "parent", value.toJsFn)
      
      inline def setPrev(value: CallbackTo[Double]): Self = StObject.set(x, "prev", value.toJsFn)
      
      inline def setPrevTree(value: CallbackTo[Double]): Self = StObject.set(x, "prevTree", value.toJsFn)
      
      inline def setRightChild(value: CallbackTo[Double]): Self = StObject.set(x, "rightChild", value.toJsFn)
      
      inline def setRightSpan(value: CallbackTo[Double]): Self = StObject.set(x, "rightSpan", value.toJsFn)
      
      inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
      
      inline def setSibling(value: CallbackTo[Double]): Self = StObject.set(x, "sibling", value.toJsFn)
    }
  }
}
