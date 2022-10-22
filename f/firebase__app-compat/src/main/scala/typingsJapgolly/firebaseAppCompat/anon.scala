package typingsJapgolly.firebaseAppCompat

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseApp
import typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseAppContructor
import typingsJapgolly.firebaseAppCompat.mod.FirebaseService
import typingsJapgolly.firebaseAppCompat.mod.FirebaseServiceNamespace
import typingsJapgolly.firebaseComponent.distSrcTypesMod.Name
import typingsJapgolly.firebaseComponent.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait App extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): FirebaseApp = js.native
    def apply(name: String): FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: FirebaseAppContructor = js.native
  }
  
  trait AppName extends StObject {
    
    var appName: String
  }
  object AppName {
    
    inline def apply(appName: String): AppName = {
      val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppName]
    }
    
    extension [Self <: AppName](x: Self) {
      
      inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typingsJapgolly.firebaseAppCompat.mod.FirebaseApp = js.native
    def apply(name: String): typingsJapgolly.firebaseAppCompat.mod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typingsJapgolly.firebaseAppCompat.mod.FirebaseAppContructor = js.native
  }
  
  @js.native
  trait CallApp extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp = js.native
    def apply(name: String): typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseAppContructor = js.native
  }
  
  @js.native
  trait CallName extends StObject {
    
    /**
      * Retrieve an instance of a FirebaseApp.
      *
      * Usage: firebase.app()
      *
      * @param name The optional name of the app to return ('[DEFAULT]' if omitted)
      */
    def apply(): typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp = js.native
    def apply(name: String): typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp = js.native
    
    /**
      * For testing FirebaseApp instances:
      *  app() instanceof firebase.app.App
      *
      * DO NOT call this constuctor directly (use firebase.app() instead).
      */
    var App: typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseAppContructor = js.native
  }
  
  trait Dictindex
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): FirebaseServiceNamespace[FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typingsJapgolly.firebaseAppCompat.mod.FirebaseApp, serviceName: String): String | Null
  }
  object Dictindex {
    
    inline def apply(
      registerComponent: Component[Any] => FirebaseServiceNamespace[FirebaseService] | Null,
      removeApp: String => Callback,
      useAsService: (typingsJapgolly.firebaseAppCompat.mod.FirebaseApp, String) => String | Null
    ): Dictindex = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1((t0: String) => removeApp(t0).runNow()), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[Dictindex]
    }
    
    extension [Self <: Dictindex](x: Self) {
      
      inline def setRegisterComponent(value: Component[Any] => FirebaseServiceNamespace[FirebaseService] | Null): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Callback): Self = StObject.set(x, "removeApp", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUseAsService(value: (typingsJapgolly.firebaseAppCompat.mod.FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait RegisterComponent
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: FirebaseApp, serviceName: String): String | Null
  }
  object RegisterComponent {
    
    inline def apply(
      registerComponent: Component[Any] => typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null,
      removeApp: String => Callback,
      useAsService: (FirebaseApp, String) => String | Null
    ): RegisterComponent = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1((t0: String) => removeApp(t0).runNow()), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[RegisterComponent]
    }
    
    extension [Self <: RegisterComponent](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distAppCompatMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Callback): Self = StObject.set(x, "removeApp", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUseAsService(value: (FirebaseApp, String) => String | Null): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait RemoveApp
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, serviceName: String): String | Null
  }
  object RemoveApp {
    
    inline def apply(
      registerComponent: Component[Any] => typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null,
      removeApp: String => Callback,
      useAsService: (typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, String) => String | Null
    ): RemoveApp = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1((t0: String) => removeApp(t0).runNow()), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[RemoveApp]
    }
    
    extension [Self <: RemoveApp](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distEsmSrcTypesMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Callback): Self = StObject.set(x, "removeApp", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUseAsService(
        value: (typingsJapgolly.firebaseAppCompat.distEsmSrcPublicTypesMod.FirebaseApp, String) => String | Null
      ): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
  
  trait UseAsService
    extends StObject
       with /* index */ StringDictionary[Any] {
    
    /**
      * Internal API to register a Firebase Service into the firebase namespace.
      *
      * Each service will create a child namespace (firebase.<name>) which acts as
      * both a namespace for service specific properties, and also as a service
      * accessor function (firebase.<name>() or firebase.<name>(app)).
      *
      * @param name The Firebase Service being registered.
      * @param createService Factory function to create a service instance.
      * @param serviceProperties Properties to copy to the service's namespace.
      * @param appHook All appHooks called before initializeApp returns to caller.
      * @param allowMultipleInstances Whether the registered service supports
      *   multiple instances per app. If not specified, the default is false.
      */
    def registerComponent[T /* <: Name */](component: Component[T]): typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null
    
    /**
      * Internal API to remove an app from the list of registered apps.
      */
    def removeApp(name: String): Unit
    
    def useAsService(app: typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, serviceName: String): String | Null
  }
  object UseAsService {
    
    inline def apply(
      registerComponent: Component[Any] => typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null,
      removeApp: String => Callback,
      useAsService: (typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, String) => String | Null
    ): UseAsService = {
      val __obj = js.Dynamic.literal(registerComponent = js.Any.fromFunction1(registerComponent), removeApp = js.Any.fromFunction1((t0: String) => removeApp(t0).runNow()), useAsService = js.Any.fromFunction2(useAsService))
      __obj.asInstanceOf[UseAsService]
    }
    
    extension [Self <: UseAsService](x: Self) {
      
      inline def setRegisterComponent(
        value: Component[Any] => typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseServiceNamespace[typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseService] | Null
      ): Self = StObject.set(x, "registerComponent", js.Any.fromFunction1(value))
      
      inline def setRemoveApp(value: String => Callback): Self = StObject.set(x, "removeApp", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setUseAsService(
        value: (typingsJapgolly.firebaseAppCompat.distSrcPublicTypesMod.FirebaseApp, String) => String | Null
      ): Self = StObject.set(x, "useAsService", js.Any.fromFunction2(value))
    }
  }
}
