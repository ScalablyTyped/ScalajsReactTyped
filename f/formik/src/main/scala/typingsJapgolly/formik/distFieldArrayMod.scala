package typingsJapgolly.formik

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.formik.distTypesMod.FormikProps
import typingsJapgolly.formik.distTypesMod.SharedRenderProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFieldArrayMod {
  
  @JSImport("formik/dist/FieldArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("formik/dist/FieldArray", "FieldArray")
  @js.native
  val FieldArray: ComponentType[FieldArrayConfig] = js.native
  
  inline def insert(arrayLike: ArrayLike[Any], index: Double, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def move(array: js.Array[Any], from: Double, to: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(array.asInstanceOf[js.Any], from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def replace(arrayLike: ArrayLike[Any], index: Double, value: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("replace")(arrayLike.asInstanceOf[js.Any], index.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def swap(arrayLike: ArrayLike[Any], indexA: Double, indexB: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("swap")(arrayLike.asInstanceOf[js.Any], indexA.asInstanceOf[js.Any], indexB.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  trait ArrayHelpers extends StObject {
    
    /** Curried fn to insert an element at a given index into the array */
    def handleInsert(index: Double, value: Any): js.Function0[Unit]
    
    /** Imperatively move an element in an array to another index */
    def handleMove(from: Double, to: Double): js.Function0[Unit]
    
    /** Curried fn to remove a value from the end of the array */
    def handlePop(): js.Function0[Unit]
    
    /** Curried fn to add a value to the end of an array */
    def handlePush(obj: Any): js.Function0[Unit]
    
    /** Curried fn to remove an element at an index of an array */
    def handleRemove(index: Double): js.Function0[Unit]
    
    /** Curried fn to replace an element at a given index into the array */
    def handleReplace(index: Double, value: Any): js.Function0[Unit]
    
    /** Curried fn to swap two values in an array */
    def handleSwap(indexA: Double, indexB: Double): js.Function0[Unit]
    
    /** Curried fn to add an element to the beginning of an array */
    def handleUnshift(value: Any): js.Function0[Unit]
    
    /** Imperatively insert an element at a given index into the array */
    def insert(index: Double, value: Any): Unit
    
    /** Imperatively move an element in an array to another index */
    def move(from: Double, to: Double): Unit
    
    /** Imperatively remove and return value from the end of the array */
    def pop[T](): js.UndefOr[T]
    
    /** Imperatively add a value to the end of an array */
    def push(obj: Any): Unit
    
    /** Imperatively remove and element at an index of an array */
    def remove[T](index: Double): js.UndefOr[T]
    
    /** Imperatively replace a value at an index of an array  */
    def replace(index: Double, value: Any): Unit
    
    /** Imperatively swap two values in an array */
    def swap(indexA: Double, indexB: Double): Unit
    
    /** Imperatively add an element to the beginning of an array and return its length */
    def unshift(value: Any): Double
  }
  object ArrayHelpers {
    
    inline def apply(
      handleInsert: (Double, Any) => js.Function0[Unit],
      handleMove: (Double, Double) => js.Function0[Unit],
      handlePop: CallbackTo[js.Function0[Unit]],
      handlePush: Any => js.Function0[Unit],
      handleRemove: Double => js.Function0[Unit],
      handleReplace: (Double, Any) => js.Function0[Unit],
      handleSwap: (Double, Double) => js.Function0[Unit],
      handleUnshift: Any => js.Function0[Unit],
      insert: (Double, Any) => Callback,
      move: (Double, Double) => Callback,
      pop: CallbackTo[js.UndefOr[Any]],
      push: Any => Callback,
      remove: Double => js.UndefOr[Any],
      replace: (Double, Any) => Callback,
      swap: (Double, Double) => Callback,
      unshift: Any => Double
    ): ArrayHelpers = {
      val __obj = js.Dynamic.literal(handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = handlePop.toJsFn, handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2((t0: Double, t1: Any) => (insert(t0, t1)).runNow()), move = js.Any.fromFunction2((t0: Double, t1: Double) => (move(t0, t1)).runNow()), pop = pop.toJsFn, push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2((t0: Double, t1: Any) => (replace(t0, t1)).runNow()), swap = js.Any.fromFunction2((t0: Double, t1: Double) => (swap(t0, t1)).runNow()), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[ArrayHelpers]
    }
    
    extension [Self <: ArrayHelpers](x: Self) {
      
      inline def setHandleInsert(value: (Double, Any) => js.Function0[Unit]): Self = StObject.set(x, "handleInsert", js.Any.fromFunction2(value))
      
      inline def setHandleMove(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleMove", js.Any.fromFunction2(value))
      
      inline def setHandlePop(value: CallbackTo[js.Function0[Unit]]): Self = StObject.set(x, "handlePop", value.toJsFn)
      
      inline def setHandlePush(value: Any => js.Function0[Unit]): Self = StObject.set(x, "handlePush", js.Any.fromFunction1(value))
      
      inline def setHandleRemove(value: Double => js.Function0[Unit]): Self = StObject.set(x, "handleRemove", js.Any.fromFunction1(value))
      
      inline def setHandleReplace(value: (Double, Any) => js.Function0[Unit]): Self = StObject.set(x, "handleReplace", js.Any.fromFunction2(value))
      
      inline def setHandleSwap(value: (Double, Double) => js.Function0[Unit]): Self = StObject.set(x, "handleSwap", js.Any.fromFunction2(value))
      
      inline def setHandleUnshift(value: Any => js.Function0[Unit]): Self = StObject.set(x, "handleUnshift", js.Any.fromFunction1(value))
      
      inline def setInsert(value: (Double, Any) => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setMove(value: (Double, Double) => Callback): Self = StObject.set(x, "move", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setPop(value: CallbackTo[js.UndefOr[Any]]): Self = StObject.set(x, "pop", value.toJsFn)
      
      inline def setPush(value: Any => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setRemove(value: Double => js.UndefOr[Any]): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setReplace(value: (Double, Any) => Callback): Self = StObject.set(x, "replace", js.Any.fromFunction2((t0: Double, t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setSwap(value: (Double, Double) => Callback): Self = StObject.set(x, "swap", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setUnshift(value: Any => Double): Self = StObject.set(x, "unshift", js.Any.fromFunction1(value))
    }
  }
  
  trait FieldArrayConfig
    extends StObject
       with SharedRenderProps[FieldArrayRenderProps] {
    
    /** Really the path to the array field to be updated */
    var name: String
    
    /** Should field array validate the form AFTER array updates/changes? */
    var validateOnChange: js.UndefOr[Boolean] = js.undefined
  }
  object FieldArrayConfig {
    
    inline def apply(name: String): FieldArrayConfig = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[FieldArrayConfig]
    }
    
    extension [Self <: FieldArrayConfig](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChange(value: Boolean): Self = StObject.set(x, "validateOnChange", value.asInstanceOf[js.Any])
      
      inline def setValidateOnChangeUndefined: Self = StObject.set(x, "validateOnChange", js.undefined)
    }
  }
  
  trait FieldArrayRenderProps
    extends StObject
       with ArrayHelpers {
    
    var form: FormikProps[Any]
    
    var name: String
  }
  object FieldArrayRenderProps {
    
    inline def apply(
      form: FormikProps[Any],
      handleInsert: (Double, Any) => js.Function0[Unit],
      handleMove: (Double, Double) => js.Function0[Unit],
      handlePop: CallbackTo[js.Function0[Unit]],
      handlePush: Any => js.Function0[Unit],
      handleRemove: Double => js.Function0[Unit],
      handleReplace: (Double, Any) => js.Function0[Unit],
      handleSwap: (Double, Double) => js.Function0[Unit],
      handleUnshift: Any => js.Function0[Unit],
      insert: (Double, Any) => Callback,
      move: (Double, Double) => Callback,
      name: String,
      pop: CallbackTo[js.UndefOr[Any]],
      push: Any => Callback,
      remove: Double => js.UndefOr[Any],
      replace: (Double, Any) => Callback,
      swap: (Double, Double) => Callback,
      unshift: Any => Double
    ): FieldArrayRenderProps = {
      val __obj = js.Dynamic.literal(form = form.asInstanceOf[js.Any], handleInsert = js.Any.fromFunction2(handleInsert), handleMove = js.Any.fromFunction2(handleMove), handlePop = handlePop.toJsFn, handlePush = js.Any.fromFunction1(handlePush), handleRemove = js.Any.fromFunction1(handleRemove), handleReplace = js.Any.fromFunction2(handleReplace), handleSwap = js.Any.fromFunction2(handleSwap), handleUnshift = js.Any.fromFunction1(handleUnshift), insert = js.Any.fromFunction2((t0: Double, t1: Any) => (insert(t0, t1)).runNow()), move = js.Any.fromFunction2((t0: Double, t1: Double) => (move(t0, t1)).runNow()), name = name.asInstanceOf[js.Any], pop = pop.toJsFn, push = js.Any.fromFunction1((t0: Any) => push(t0).runNow()), remove = js.Any.fromFunction1(remove), replace = js.Any.fromFunction2((t0: Double, t1: Any) => (replace(t0, t1)).runNow()), swap = js.Any.fromFunction2((t0: Double, t1: Double) => (swap(t0, t1)).runNow()), unshift = js.Any.fromFunction1(unshift))
      __obj.asInstanceOf[FieldArrayRenderProps]
    }
    
    extension [Self <: FieldArrayRenderProps](x: Self) {
      
      inline def setForm(value: FormikProps[Any]): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
