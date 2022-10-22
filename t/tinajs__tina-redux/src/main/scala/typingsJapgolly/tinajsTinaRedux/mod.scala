package typingsJapgolly.tinajsTinaRedux

import japgolly.scalajs.react.Callback
import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Store
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@tinajs/tina-redux", JSImport.Namespace)
  @js.native
  open class ^[S, A /* <: Action[Any] */] protected ()
    extends StObject
       with TinaRedux[S, A] {
    def this(reduxStore: Store[S, A]) = this()
  }
  
  trait HOC extends StObject {
    
    var methods: js.Object
    
    def onLoad(): Unit
    
    def onUnload(): Unit
  }
  object HOC {
    
    inline def apply(methods: js.Object, onLoad: Callback, onUnload: Callback): HOC = {
      val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], onLoad = onLoad.toJsFn, onUnload = onUnload.toJsFn)
      __obj.asInstanceOf[HOC]
    }
    
    extension [Self <: HOC](x: Self) {
      
      inline def setMethods(value: js.Object): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setOnLoad(value: Callback): Self = StObject.set(x, "onLoad", value.toJsFn)
      
      inline def setOnUnload(value: Callback): Self = StObject.set(x, "onUnload", value.toJsFn)
    }
  }
  
  type MapStateToProps = js.Function1[/* state */ Any, Any]
  
  @js.native
  trait TinaRedux[S, A /* <: Action[Any] */] extends StObject {
    
    def connect(): HOC = js.native
    def connect(mapState: Unit, mapDispatch: mapDispatchToProps): HOC = js.native
    def connect(mapState: MapStateToProps): HOC = js.native
    def connect(mapState: MapStateToProps, mapDispatch: mapDispatchToProps): HOC = js.native
  }
  
  type mapDispatchToProps = js.Function1[/* dispatch */ Dispatch[AnyAction], Any]
}
