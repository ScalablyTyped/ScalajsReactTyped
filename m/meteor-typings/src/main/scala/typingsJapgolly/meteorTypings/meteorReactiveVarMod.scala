package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object meteorReactiveVarMod {
  
  trait ReactiveVar[T] extends StObject {
    
    def get(): T
    
    def set(newValue: T): Unit
  }
  object ReactiveVar {
    
    @JSImport("meteor/reactive-var", "ReactiveVar")
    @js.native
    val ^ : typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVarStatic = js.native
    
    extension [Self <: typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVar[?], T](x: Self & typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVar[T]) {
      
      inline def setGet(value: CallbackTo[T]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setSet(value: T => Callback): Self = StObject.set(x, "set", js.Any.fromFunction1((t0: T) => value(t0).runNow()))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("meteor/reactive-var", "ReactiveVar")
  @js.native
  open class ReactiveVarCls[T] protected ()
    extends StObject
       with typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVar[T] {
    def this(initialValue: T) = this()
    def this(initialValue: T, equalsFunc: js.Function) = this()
    
    /* CompleteClass */
    override def get(): T = js.native
    
    /* CompleteClass */
    override def set(newValue: T): Unit = js.native
  }
  
  @js.native
  trait ReactiveVarStatic
    extends StObject
       with Instantiable1[
          /* initialValue */ js.Object, 
          typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVar[js.Object]
        ]
       with Instantiable2[
          /* initialValue */ js.Object, 
          /* equalsFunc */ js.Function, 
          typingsJapgolly.meteorTypings.meteorReactiveVarMod.ReactiveVar[js.Object]
        ]
}
