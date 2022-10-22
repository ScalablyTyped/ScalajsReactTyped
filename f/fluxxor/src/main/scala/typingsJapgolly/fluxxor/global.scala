package typingsJapgolly.fluxxor

import typingsJapgolly.fluxxor.anon.TypeofReact
import typingsJapgolly.fluxxor.mod.StoreClass
import typingsJapgolly.fluxxor.mod.StoreSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Fluxxor {
    
    @JSGlobal("Fluxxor")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("Fluxxor.Dispatcher")
    @js.native
    open class Dispatcher protected ()
      extends typingsJapgolly.fluxxor.mod.Dispatcher {
      def this(stores: Any) = this()
    }
    
    @JSGlobal("Fluxxor.Flux")
    @js.native
    open class Flux protected ()
      extends typingsJapgolly.fluxxor.mod.Flux {
      def this(stores: Any, actions: Any) = this()
    }
    
    inline def FluxChildMixin(react: TypeofReact): typingsJapgolly.fluxxor.mod.FluxChildMixin = ^.asInstanceOf[js.Dynamic].applyDynamic("FluxChildMixin")(react.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fluxxor.mod.FluxChildMixin]
    
    inline def FluxMixin(react: TypeofReact): typingsJapgolly.fluxxor.mod.FluxMixin = ^.asInstanceOf[js.Dynamic].applyDynamic("FluxMixin")(react.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.fluxxor.mod.FluxMixin]
    
    inline def StoreWatchMixin[StoreState](storeNames: String*): typingsJapgolly.fluxxor.mod.StoreWatchMixin[StoreState] = ^.asInstanceOf[js.Dynamic].applyDynamic("StoreWatchMixin")(storeNames.asInstanceOf[Seq[js.Any]]*).asInstanceOf[typingsJapgolly.fluxxor.mod.StoreWatchMixin[StoreState]]
    
    inline def createStore(spec: StoreSpec): StoreClass = ^.asInstanceOf[js.Dynamic].applyDynamic("createStore")(spec.asInstanceOf[js.Any]).asInstanceOf[StoreClass]
    
    @JSGlobal("Fluxxor.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
