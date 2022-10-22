package typingsJapgolly.firebaseAppCompat

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.firebaseAppCompat.anon.RemoveApp
import typingsJapgolly.firebaseComponent.distSrcTypesMod.Name
import typingsJapgolly.firebaseComponent.mod.Component
import typingsJapgolly.firebaseComponent.mod.ComponentContainer
import typingsJapgolly.firebaseUtil.mod.Compat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcTypesMod {
  
  @js.native
  trait FirebaseApp
    extends StObject
       with typingsJapgolly.firebaseAppCompat.distEsmSrcFirebaseAppMod.FirebaseApp {
    
    def _addComponent[T /* <: Name */](component: Component[T]): Unit = js.native
    
    def _addOrOverwriteComponent[T /* <: Name */](component: Component[T]): Unit = js.native
    
    def _removeServiceInstance(name: String): Unit = js.native
    def _removeServiceInstance(name: String, instanceIdentifier: String): Unit = js.native
    
    var container: ComponentContainer = js.native
  }
  
  @js.native
  trait FirebaseNamespace
    extends StObject
       with typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseNamespace {
    
    var INTERNAL: RemoveApp = js.native
  }
  
  trait FirebaseService
    extends StObject
       with Compat[Any] {
    
    var INTERNAL: js.UndefOr[FirebaseServiceInternals] = js.undefined
    
    var app: typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp
  }
  object FirebaseService {
    
    inline def apply(_delegate: Any, app: typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp): FirebaseService = {
      val __obj = js.Dynamic.literal(_delegate = _delegate.asInstanceOf[js.Any], app = app.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirebaseService]
    }
    
    extension [Self <: FirebaseService](x: Self) {
      
      inline def setApp(value: typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setINTERNAL(value: FirebaseServiceInternals): Self = StObject.set(x, "INTERNAL", value.asInstanceOf[js.Any])
      
      inline def setINTERNALUndefined: Self = StObject.set(x, "INTERNAL", js.undefined)
    }
  }
  
  trait FirebaseServiceInternals extends StObject {
    
    /**
      * Delete the service and free it's resources - called from
      * app.delete().
      */
    def delete(): js.Promise[Unit]
  }
  object FirebaseServiceInternals {
    
    inline def apply(delete: CallbackTo[js.Promise[Unit]]): FirebaseServiceInternals = {
      val __obj = js.Dynamic.literal(delete = delete.toJsFn)
      __obj.asInstanceOf[FirebaseServiceInternals]
    }
    
    extension [Self <: FirebaseServiceInternals](x: Self) {
      
      inline def setDelete(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "delete", value.toJsFn)
    }
  }
  
  type FirebaseServiceNamespace[T /* <: FirebaseService */] = js.Function1[
    /* app */ js.UndefOr[typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp], 
    T
  ]
}
