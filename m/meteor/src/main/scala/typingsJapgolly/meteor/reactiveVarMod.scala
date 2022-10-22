package typingsJapgolly.meteor

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactiveVarMod {
  
  trait ReactiveVar[T] extends StObject {
    
    /**
      * Returns the current value of the ReactiveVar, establishing a reactive dependency.
      */
    def get(): T
    
    /**
      * Sets the current value of the ReactiveVar, invalidating the Computations that called `get` if `newValue` is different from the old value.
      */
    def set(newValue: T): Unit
  }
  object ReactiveVar {
    
    @JSImport("meteor/reactive-var", "ReactiveVar")
    @js.native
    val ^ : typingsJapgolly.meteor.reactiveVarMod.ReactiveVarStatic = js.native
    
    extension [Self <: typingsJapgolly.meteor.reactiveVarMod.ReactiveVar[?], T](x: Self & typingsJapgolly.meteor.reactiveVarMod.ReactiveVar[T]) {
      
      inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setSet(value: T => japgolly.scalajs.react.Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/reactive-var", "ReactiveVar")
  @js.native
  open class ReactiveVarCls[T] protected ()
    extends StObject
       with typingsJapgolly.meteor.reactiveVarMod.ReactiveVar[T] {
    /**
      * Constructor for a ReactiveVar, which represents a single reactive variable.
      * @param initialValue The initial value to set. `equalsFunc` is ignored when setting the initial value.
      * @param equalsFunc A function of two arguments, called on the old value and the new value whenever the ReactiveVar is set. If it returns true, no set is performed. If omitted, the default
      * `equalsFunc` returns true if its arguments are `===` and are of type number, boolean, string, undefined, or null.
      */
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function2[/* oldValue */ T, /* newValue */ T, Boolean]) = this()
    
    /**
      * Returns the current value of the ReactiveVar, establishing a reactive dependency.
      */
    /* CompleteClass */
    override def get(): T = js.native
    
    /**
      * Sets the current value of the ReactiveVar, invalidating the Computations that called `get` if `newValue` is different from the old value.
      */
    /* CompleteClass */
    override def set(newValue: T): Unit = js.native
  }
  
  @js.native
  trait ReactiveVarStatic
    extends StObject
       with /**
    * Constructor for a ReactiveVar, which represents a single reactive variable.
    * @param initialValue The initial value to set. `equalsFunc` is ignored when setting the initial value.
    * @param equalsFunc A function of two arguments, called on the old value and the new value whenever the ReactiveVar is set. If it returns true, no set is performed. If omitted, the default
    * `equalsFunc` returns true if its arguments are `===` and are of type number, boolean, string, undefined, or null.
    */
  Instantiable1[
          /* initialValue */ js.Object, 
          typingsJapgolly.meteor.reactiveVarMod.ReactiveVar[js.Object]
        ]
       with Instantiable2[
          /* initialValue */ js.Object, 
          /* equalsFunc */ js.Function2[/* oldValue */ js.Object, /* newValue */ js.Object, Boolean], 
          typingsJapgolly.meteor.reactiveVarMod.ReactiveVar[js.Object]
        ]
}
