package typingsJapgolly.lestate

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.lestate.anon.Force
import typingsJapgolly.lestate.anon.Id
import typingsJapgolly.lestate.anon.InitialState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lestate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createState(): LeState = ^.asInstanceOf[js.Dynamic].applyDynamic("createState")().asInstanceOf[LeState]
  inline def createState(props: InitialState): LeState = ^.asInstanceOf[js.Dynamic].applyDynamic("createState")(props.asInstanceOf[js.Any]).asInstanceOf[LeState]
  
  trait LeState extends StObject {
    
    def createListener(options: Force): Unit
    
    def get(): Any
    
    def getDescription(): js.Object
    
    def insert(newValue: js.Object): Unit
    
    def set(newValue: js.Object): js.Array[Id]
  }
  object LeState {
    
    inline def apply(
      createListener: Force => Callback,
      get: CallbackTo[Any],
      getDescription: CallbackTo[js.Object],
      insert: js.Object => Callback,
      set: js.Object => js.Array[Id]
    ): LeState = {
      val __obj = js.Dynamic.literal(createListener = js.Any.fromFunction1((t0: Force) => createListener(t0).runNow()), get = get.toJsFn, getDescription = getDescription.toJsFn, insert = js.Any.fromFunction1((t0: js.Object) => insert(t0).runNow()), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[LeState]
    }
    
    extension [Self <: LeState](x: Self) {
      
      inline def setCreateListener(value: Force => Callback): Self = StObject.set(x, "createListener", js.Any.fromFunction1((t0: Force) => value(t0).runNow()))
      
      inline def setGet(value: CallbackTo[Any]): Self = StObject.set(x, "get", value.toJsFn)
      
      inline def setGetDescription(value: CallbackTo[js.Object]): Self = StObject.set(x, "getDescription", value.toJsFn)
      
      inline def setInsert(value: js.Object => Callback): Self = StObject.set(x, "insert", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
      
      inline def setSet(value: js.Object => js.Array[Id]): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
}
