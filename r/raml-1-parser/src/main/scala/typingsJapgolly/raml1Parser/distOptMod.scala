package typingsJapgolly.raml1Parser

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOptMod {
  
  @JSImport("raml-1-parser/dist/Opt", JSImport.Namespace)
  @js.native
  open class ^[T] ()
    extends StObject
       with Opt[T] {
    def this(_value: T) = this()
    
    /* private */ /* CompleteClass */
    var _arr: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isDefined: Any = js.native
    
    /* private */ /* CompleteClass */
    var _isEmpty: Any = js.native
    
    /* private */ /* CompleteClass */
    var _value: Any = js.native
    
    /* CompleteClass */
    override def equals(other: Opt[T]): Boolean = js.native
    
    /* CompleteClass */
    override def flatMap[U](f: js.Function1[T, Opt[U]]): Opt[U] = js.native
    
    /* CompleteClass */
    override def forEach(fn: js.Function1[T, Any]): Unit = js.native
    
    /* CompleteClass */
    override def getOrElse(v: T): T = js.native
    
    /* CompleteClass */
    override def getOrElseF(v: js.Function0[T]): T = js.native
    
    /* CompleteClass */
    override def getOrThrow(): T = js.native
    
    /* CompleteClass */
    override def isDefined(): Boolean = js.native
    
    /* CompleteClass */
    override def isEmpty(): Boolean = js.native
    
    /* CompleteClass */
    override def map[U](f: js.Function1[T, U]): Opt[U] = js.native
    
    /* CompleteClass */
    override def toArray(): js.Array[T] = js.native
    
    /* CompleteClass */
    override def value(): T = js.native
  }
  @JSImport("raml-1-parser/dist/Opt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * You can always create an empty option by hand just by calling new Opt<T>()
    * but calling this method will return a global instance instead of allocating a new one each time
    */
  /* static member */
  @JSImport("raml-1-parser/dist/Opt", "empty")
  @js.native
  def empty: js.Function0[Opt[Any]] = js.native
  inline def empty_=(x: js.Function0[Opt[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("empty")(x.asInstanceOf[js.Any])
  
  trait Opt[T] extends StObject {
    
    /* private */ var _arr: Any
    
    /* private */ var _isDefined: Any
    
    /* private */ var _isEmpty: Any
    
    /* private */ var _value: Any
    
    def equals(other: Opt[T]): Boolean
    
    def flatMap[U](f: js.Function1[/* value */ T, Opt[U]]): Opt[U]
    
    def forEach(fn: js.Function1[/* value */ T, Any]): Unit
    
    def getOrElse(v: T): T
    
    def getOrElseF(v: js.Function0[T]): T
    
    def getOrThrow(): T
    
    def isDefined(): Boolean
    
    def isEmpty(): Boolean
    
    def map[U](f: js.Function1[/* value */ T, U]): Opt[U]
    
    def toArray(): js.Array[T]
    
    def value(): T
  }
  object Opt {
    
    inline def apply[T](
      _arr: Any,
      _isDefined: Any,
      _isEmpty: Any,
      _value: Any,
      equals_ : Opt[T] => Boolean,
      flatMap: js.Function1[/* value */ T, Opt[Any]] => Opt[Any],
      forEach: js.Function1[/* value */ T, Any] => Callback,
      getOrElse: T => T,
      getOrElseF: js.Function0[T] => T,
      getOrThrow: CallbackTo[T],
      isDefined: CallbackTo[Boolean],
      isEmpty: CallbackTo[Boolean],
      map: js.Function1[/* value */ T, Any] => Opt[Any],
      toArray: CallbackTo[js.Array[T]],
      value: CallbackTo[T]
    ): Opt[T] = {
      val __obj = js.Dynamic.literal(_arr = _arr.asInstanceOf[js.Any], _isDefined = _isDefined.asInstanceOf[js.Any], _isEmpty = _isEmpty.asInstanceOf[js.Any], _value = _value.asInstanceOf[js.Any], flatMap = js.Any.fromFunction1(flatMap), forEach = js.Any.fromFunction1((t0: js.Function1[/* value */ T, Any]) => forEach(t0).runNow()), getOrElse = js.Any.fromFunction1(getOrElse), getOrElseF = js.Any.fromFunction1(getOrElseF), getOrThrow = getOrThrow.toJsFn, isDefined = isDefined.toJsFn, isEmpty = isEmpty.toJsFn, map = js.Any.fromFunction1(map), toArray = toArray.toJsFn, value = value.toJsFn)
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[Opt[T]]
    }
    
    extension [Self <: Opt[?], T](x: Self & Opt[T]) {
      
      inline def setEquals_(value: Opt[T] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setFlatMap(value: js.Function1[/* value */ T, Opt[Any]] => Opt[Any]): Self = StObject.set(x, "flatMap", js.Any.fromFunction1(value))
      
      inline def setForEach(value: js.Function1[/* value */ T, Any] => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: js.Function1[/* value */ T, Any]) => value(t0).runNow()))
      
      inline def setGetOrElse(value: T => T): Self = StObject.set(x, "getOrElse", js.Any.fromFunction1(value))
      
      inline def setGetOrElseF(value: js.Function0[T] => T): Self = StObject.set(x, "getOrElseF", js.Any.fromFunction1(value))
      
      inline def setGetOrThrow(value: CallbackTo[T]): Self = StObject.set(x, "getOrThrow", value.toJsFn)
      
      inline def setIsDefined(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefined", value.toJsFn)
      
      inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEmpty", value.toJsFn)
      
      inline def setMap(value: js.Function1[/* value */ T, Any] => Opt[Any]): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
      
      inline def setToArray(value: CallbackTo[js.Array[T]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setValue(value: CallbackTo[T]): Self = StObject.set(x, "value", value.toJsFn)
      
      inline def set_arr(value: Any): Self = StObject.set(x, "_arr", value.asInstanceOf[js.Any])
      
      inline def set_isDefined(value: Any): Self = StObject.set(x, "_isDefined", value.asInstanceOf[js.Any])
      
      inline def set_isEmpty(value: Any): Self = StObject.set(x, "_isEmpty", value.asInstanceOf[js.Any])
      
      inline def set_value(value: Any): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
    }
  }
}
