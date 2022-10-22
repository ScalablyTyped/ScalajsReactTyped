package typingsJapgolly.jqueryDeferred

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("jquery-deferred/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Callbacks(flags: Any): JQueryCallback = ^.asInstanceOf[js.Dynamic].applyDynamic("Callbacks")(flags.asInstanceOf[js.Any]).asInstanceOf[JQueryCallback]
  
  inline def Deferred(): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")().asInstanceOf[JQueryDeferred]
  inline def Deferred(beforeStart: js.Function1[/* deferred */ JQueryDeferred, Any]): JQueryDeferred = ^.asInstanceOf[js.Dynamic].applyDynamic("Deferred")(beforeStart.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred]
  
  inline def each(collection: Any, callback: js.Function2[/* indexInArray */ Any, /* valueOfElement */ Any, Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("each")(collection.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def extend(deep: Boolean, target: Any, objs: Any*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("extend")((scala.List(deep.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).`++`(objs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Object]
  inline def extend(target: Any, objs: Any*): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("extend")(scala.List(target.asInstanceOf[js.Any]).`++`(objs.asInstanceOf[Seq[js.Any]])*).asInstanceOf[js.Object]
  
  inline def isArray(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isArray")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isFunction(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunction")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def noop(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("noop")().asInstanceOf[Any]
  
  inline def `type`(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("type")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def when(deferreds: Any*): JQueryPromise = ^.asInstanceOf[js.Dynamic].applyDynamic("when")(deferreds.asInstanceOf[Seq[js.Any]]*).asInstanceOf[JQueryPromise]
  
  trait JQueryCallback extends StObject {
    
    def add(callbacks: Any*): Any
    
    def disable(): Any
    
    def disabled(): Boolean
    
    def empty(): Any
    
    def fire(arguments: Any*): Any
    
    def fireWith(context: Any, args: Any*): Any
    
    def fired(): Boolean
    
    def has(callback: Any): Boolean
    
    def lock(): Any
    
    def locked(): Boolean
    
    def remove(callbacks: Any*): Any
  }
  object JQueryCallback {
    
    inline def apply(
      add: /* repeated */ Any => Any,
      disable: CallbackTo[Any],
      disabled: CallbackTo[Boolean],
      empty: CallbackTo[Any],
      fire: /* repeated */ Any => Any,
      fireWith: (Any, /* repeated */ Any) => Any,
      fired: CallbackTo[Boolean],
      has: Any => Boolean,
      lock: CallbackTo[Any],
      locked: CallbackTo[Boolean],
      remove: /* repeated */ Any => Any
    ): JQueryCallback = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), disable = disable.toJsFn, disabled = disabled.toJsFn, empty = empty.toJsFn, fire = js.Any.fromFunction1(fire), fireWith = js.Any.fromFunction2(fireWith), fired = fired.toJsFn, has = js.Any.fromFunction1(has), lock = lock.toJsFn, locked = locked.toJsFn, remove = js.Any.fromFunction1(remove))
      __obj.asInstanceOf[JQueryCallback]
    }
    
    extension [Self <: JQueryCallback](x: Self) {
      
      inline def setAdd(value: /* repeated */ Any => Any): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
      
      inline def setDisable(value: CallbackTo[Any]): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setDisabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "disabled", value.toJsFn)
      
      inline def setEmpty(value: CallbackTo[Any]): Self = StObject.set(x, "empty", value.toJsFn)
      
      inline def setFire(value: /* repeated */ Any => Any): Self = StObject.set(x, "fire", js.Any.fromFunction1(value))
      
      inline def setFireWith(value: (Any, /* repeated */ Any) => Any): Self = StObject.set(x, "fireWith", js.Any.fromFunction2(value))
      
      inline def setFired(value: CallbackTo[Boolean]): Self = StObject.set(x, "fired", value.toJsFn)
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setLock(value: CallbackTo[Any]): Self = StObject.set(x, "lock", value.toJsFn)
      
      inline def setLocked(value: CallbackTo[Boolean]): Self = StObject.set(x, "locked", value.toJsFn)
      
      inline def setRemove(value: /* repeated */ Any => Any): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait JQueryDeferred
    extends StObject
       with JQueryPromise {
    
    def notify(args: Any*): JQueryDeferred = js.native
    
    def notifyWith(context: Any, args: Any*): JQueryDeferred = js.native
    
    def progress(progressCallbacks: Any*): JQueryDeferred = js.native
    
    def reject(args: Any*): JQueryDeferred = js.native
    
    def rejectWith(context: Any, args: Any*): JQueryDeferred = js.native
    
    def resolve(args: Any*): JQueryDeferred = js.native
    
    def resolveWith(context: Any, args: Any*): JQueryDeferred = js.native
  }
  
  @js.native
  trait JQueryPromise extends StObject {
    
    def always(alwaysCallbacks: Any*): JQueryDeferred = js.native
    
    def done(doneCallbacks: Any*): JQueryDeferred = js.native
    
    def fail(failCallbacks: Any*): JQueryDeferred = js.native
    
    def pipe(): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ Any, Any]): JQueryPromise = js.native
    def pipe(doneFilter: js.Function1[/* x */ Any, Any], failFilter: js.Function1[/* x */ Any, Any]): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ Any, Any],
      failFilter: js.Function1[/* x */ Any, Any],
      progressFilter: js.Function1[/* x */ Any, Any]
    ): JQueryPromise = js.native
    def pipe(
      doneFilter: js.Function1[/* x */ Any, Any],
      failFilter: Unit,
      progressFilter: js.Function1[/* x */ Any, Any]
    ): JQueryPromise = js.native
    def pipe(doneFilter: Unit, failFilter: js.Function1[/* x */ Any, Any]): JQueryPromise = js.native
    def pipe(
      doneFilter: Unit,
      failFilter: js.Function1[/* x */ Any, Any],
      progressFilter: js.Function1[/* x */ Any, Any]
    ): JQueryPromise = js.native
    def pipe(doneFilter: Unit, failFilter: Unit, progressFilter: js.Function1[/* x */ Any, Any]): JQueryPromise = js.native
    
    def promise(): JQueryPromise = js.native
    
    def state(): String = js.native
    
    def `then`(doneCallbacks: Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: Any, failCallbacks: Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: Any, failCallbacks: Any, progressCallbacks: Any): JQueryDeferred = js.native
    def `then`(doneCallbacks: Any, failCallbacks: Unit, progressCallbacks: Any): JQueryDeferred = js.native
  }
}
