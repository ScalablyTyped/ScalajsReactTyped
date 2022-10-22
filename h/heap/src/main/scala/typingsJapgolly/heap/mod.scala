package typingsJapgolly.heap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("heap", JSImport.Namespace)
  @js.native
  // Constructor
  open class ^[T] ()
    extends StObject
       with Heap[T] {
    def this(cmp: js.Function2[/* a */ T, /* b */ T, Double]) = this()
    
    // Clear the heap.
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    // Determine whether the given item is in the heap.
    /* CompleteClass */
    override def contains(item: T): Boolean = js.native
    
    /* CompleteClass */
    override def copy(): Heap[T] = js.native
    
    // Determine whether the heap is empty.
    /* CompleteClass */
    override def empty(): Boolean = js.native
    
    /* CompleteClass */
    override def front(): js.UndefOr[T] = js.native
    
    /* CompleteClass */
    override def has(item: T): Boolean = js.native
    
    // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
    /* CompleteClass */
    override def heapify(): Unit = js.native
    
    /* CompleteClass */
    override def insert(item: T): Unit = js.native
    
    // Return the smallest item of the heap.
    /* CompleteClass */
    override def peek(): js.UndefOr[T] = js.native
    
    // Pop the smallest item off the heap and return it.
    /* CompleteClass */
    override def pop(): js.UndefOr[T] = js.native
    
    // Instance Methods
    // Push item onto heap.
    /* CompleteClass */
    override def push(item: T): Unit = js.native
    
    // Fast version of a push followed by a pop.
    /* CompleteClass */
    override def pushpop(item: T): T = js.native
    
    // Pop and return the current smallest value, and add the new item.
    // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
    // Note that the value returned may be larger than item!
    /* CompleteClass */
    override def replace(item: T): T = js.native
    
    // Get the number of elements stored in the heap.
    /* CompleteClass */
    override def size(): Double = js.native
    
    // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
    /* CompleteClass */
    override def toArray(): js.Array[T] = js.native
    
    /* CompleteClass */
    override def top(): js.UndefOr[T] = js.native
    
    // Update the position of the given item in the heap. This function should be called every time the item is being modified.
    /* CompleteClass */
    override def updateItem(item: T): Unit = js.native
  }
  @JSImport("heap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Build the heap.
  /* static member */
  inline def heapify[T](array: js.Array[T]): Heap[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(array.asInstanceOf[js.Any]).asInstanceOf[Heap[T]]
  inline def heapify[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): Heap[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("heapify")(array.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Heap[T]]
  
  // Find the n largest elements in a dataset.
  /* static member */
  inline def nlargest[T](array: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def nlargest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nlargest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  // Find the n smallest elements in a dataset.
  /* static member */
  inline def nsmallest[T](array: js.Array[T], n: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def nsmallest[T](array: js.Array[T], n: Double, cmp: js.Function2[/* a */ T, /* b */ T, Double]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("nsmallest")(array.asInstanceOf[js.Any], n.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  // Pop the smallest item off the array, maintaining the heap invariant.
  /* static member */
  inline def pop[T](array: js.Array[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def pop[T](array: js.Array[T], cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pop")(array.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // Static Methods
  // Push item onto array, maintaining the heap invariant.
  /* static member */
  inline def push[T](array: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def push[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  // Fast version of a heappush followed by a heappop.
  /* static member */
  inline def pushpop[T](array: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushpop")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def pushpop[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("pushpop")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than heappop() followed by heappush(), and can be more appropriate when using a fixed size heap. Note that the value returned may be larger than item!
  /* static member */
  inline def replace[T](array: js.Array[T], item: T): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def replace[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[T]
  
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  /* static member */
  inline def updateItem[T](array: js.Array[T], item: T): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def updateItem[T](array: js.Array[T], item: T, cmp: js.Function2[/* a */ T, /* b */ T, Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("updateItem")(array.asInstanceOf[js.Any], item.asInstanceOf[js.Any], cmp.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait Heap[T] extends StObject {
    
    // Clear the heap.
    def clear(): Unit
    
    // Determine whether the given item is in the heap.
    def contains(item: T): Boolean
    
    def copy(): Heap[T]
    
    // Determine whether the heap is empty.
    def empty(): Boolean
    
    def front(): js.UndefOr[T]
    
    def has(item: T): Boolean
    
    // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
    def heapify(): Unit
    
    def insert(item: T): Unit
    
    // Return the smallest item of the heap.
    def peek(): js.UndefOr[T]
    
    // Pop the smallest item off the heap and return it.
    def pop(): js.UndefOr[T]
    
    // Instance Methods
    // Push item onto heap.
    def push(item: T): Unit
    
    // Fast version of a push followed by a pop.
    def pushpop(item: T): T
    
    // Pop and return the current smallest value, and add the new item.
    // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
    // Note that the value returned may be larger than item!
    def replace(item: T): T
    
    // Get the number of elements stored in the heap.
    def size(): Double
    
    // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
    def toArray(): js.Array[T]
    
    def top(): js.UndefOr[T]
    
    // Update the position of the given item in the heap. This function should be called every time the item is being modified.
    def updateItem(item: T): Unit
  }
  object Heap {
    
    inline def apply[T](
      clear: Callback,
      contains: T => Boolean,
      copy: CallbackTo[Heap[T]],
      empty: CallbackTo[Boolean],
      front: CallbackTo[js.UndefOr[T]],
      has: T => Boolean,
      heapify: Callback,
      insert: T => Callback,
      peek: CallbackTo[js.UndefOr[T]],
      pop: CallbackTo[js.UndefOr[T]],
      push: T => Callback,
      pushpop: T => T,
      replace: T => T,
      size: CallbackTo[Double],
      toArray: CallbackTo[js.Array[T]],
      top: CallbackTo[js.UndefOr[T]],
      updateItem: T => Callback
    ): Heap[T] = {
      val __obj = js.Dynamic.literal(clear = clear.toJsFn, contains = js.Any.fromFunction1(contains), copy = copy.toJsFn, empty = empty.toJsFn, front = front.toJsFn, has = js.Any.fromFunction1(has), heapify = heapify.toJsFn, insert = js.Any.fromFunction1((t0: T) => insert(t0).runNow()), peek = peek.toJsFn, pop = pop.toJsFn, push = js.Any.fromFunction1((t0: T) => push(t0).runNow()), pushpop = js.Any.fromFunction1(pushpop), replace = js.Any.fromFunction1(replace), size = size.toJsFn, toArray = toArray.toJsFn, top = top.toJsFn, updateItem = js.Any.fromFunction1((t0: T) => updateItem(t0).runNow()))
      __obj.asInstanceOf[Heap[T]]
    }
    
    extension [Self <: Heap[?], T](x: Self & Heap[T]) {
      
      inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
      
      inline def setContains(value: T => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setCopy(value: CallbackTo[Heap[T]]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setFront(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "front", value.toJsFn)
      
      inline def setHas(value: T => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setHeapify(value: Callback): Self = StObject.set(x, "heapify", value.toJsFn)
      
      inline def setInsert(value: T => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setPeek(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "peek", value.toJsFn)
      
      inline def setPop(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: T => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
      
      inline def setPushpop(value: T => T): Self = StObject.set(x, "pushpop", js.Any.fromFunction1(value))
      
      inline def setReplace(value: T => T): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setSize(value: CallbackTo[Double]): Self = StObject.set(x, "size", value.toJsFn)
      
      inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setTop(value: CallbackTo[js.UndefOr[T]]): Self = StObject.set(x, "top", value.toJsFn)
      
      inline def setUpdateItem(value: T => Callback): Self = StObject.set(x, "updateItem", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
}
