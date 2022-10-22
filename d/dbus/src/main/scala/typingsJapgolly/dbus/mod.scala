package typingsJapgolly.dbus

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dbus.anon.Bus
import typingsJapgolly.dbus.anon.Getter
import typingsJapgolly.dbus.anon.In
import typingsJapgolly.dbus.anon.Types
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * @deprecated
    */
  @JSImport("dbus", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with DBus
  @JSImport("dbus", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Error * / any */ @JSImport("dbus", "Error")
  @js.native
  open class Error protected () extends StObject {
    def this(name: String, message: String) = this()
    
    val dbusName: String = js.native
  }
  
  inline def Signature(`type`: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("Signature")(`type`.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBus(`type`: busType): DBusConnection = ^.asInstanceOf[js.Dynamic].applyDynamic("getBus")(`type`.asInstanceOf[js.Any]).asInstanceOf[DBusConnection]
  
  inline def registerService(busName: busType): DBusService = ^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(busName.asInstanceOf[js.Any]).asInstanceOf[DBusService]
  inline def registerService(busName: busType, serviceName: String): DBusService = (^.asInstanceOf[js.Dynamic].applyDynamic("registerService")(busName.asInstanceOf[js.Any], serviceName.asInstanceOf[js.Any])).asInstanceOf[DBusService]
  
  type AnyInterfaceMethod = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
  
  /**
    * @deprecated
    */
  trait DBus extends StObject
  
  trait DBusConnection extends StObject {
    
    def disconnect(): Unit
    
    /* tslint:disable-next-line:no-unnecessary-generics */
    def getInterface[T](
      serviceName: String,
      objectPath: String,
      interfaceName: String,
      callback: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[T], Unit]
    ): Unit
    
    def getUniqueServiceName(serviceName: String, callback: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]): Unit
    
    def reconnect(callback: js.Function0[Unit]): Unit
  }
  object DBusConnection {
    
    inline def apply(
      disconnect: Callback,
      getInterface: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => Callback,
      getUniqueServiceName: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Callback,
      reconnect: js.Function0[Unit] => Callback
    ): DBusConnection = {
      val __obj = js.Dynamic.literal(disconnect = disconnect.toJsFn, getInterface = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => (getInterface(t0, t1, t2, t3)).runNow()), getUniqueServiceName = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => (getUniqueServiceName(t0, t1)).runNow()), reconnect = js.Any.fromFunction1((t0: js.Function0[Unit]) => reconnect(t0).runNow()))
      __obj.asInstanceOf[DBusConnection]
    }
    
    extension [Self <: DBusConnection](x: Self) {
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setGetInterface(
        value: (String, String, String, js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => Callback
      ): Self = StObject.set(x, "getInterface", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: js.Function2[/* err */ Error | Null, /* iface */ DBusInterface[Any], Unit]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setGetUniqueServiceName(value: (String, js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => Callback): Self = StObject.set(x, "getUniqueServiceName", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Error | Null, /* uniqueName */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setReconnect(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "reconnect", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    }
  }
  
  type DBusInterface[T] = Bus & (PickMatching[T, js.Function1[/* repeated */ Any, Unit]])
  
  trait DBusService extends StObject {
    
    var bus: DBusConnection
    
    def createObject(path: String): DBusServiceObject
    
    def disconnect(): Unit
    
    def removeObject(service: DBusServiceObject): Unit
    
    var serviceName: String
  }
  object DBusService {
    
    inline def apply(
      bus: DBusConnection,
      createObject: String => DBusServiceObject,
      disconnect: Callback,
      removeObject: DBusServiceObject => Callback,
      serviceName: String
    ): DBusService = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], createObject = js.Any.fromFunction1(createObject), disconnect = disconnect.toJsFn, removeObject = js.Any.fromFunction1((t0: DBusServiceObject) => removeObject(t0).runNow()), serviceName = serviceName.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusService]
    }
    
    extension [Self <: DBusService](x: Self) {
      
      inline def setBus(value: DBusConnection): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      inline def setCreateObject(value: String => DBusServiceObject): Self = StObject.set(x, "createObject", js.Any.fromFunction1(value))
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setRemoveObject(value: DBusServiceObject => Callback): Self = StObject.set(x, "removeObject", js.Any.fromFunction1((t0: DBusServiceObject) => value(t0).runNow()))
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
    }
  }
  
  trait DBusServiceInterface extends StObject {
    
    def addMethod(
      method: String,
      opts: In,
      handler: js.Function3[
          /* name */ String, 
          /* quality */ Any, 
          /* callback */ js.Function1[/* res */ Any, Unit], 
          Unit
        ]
    ): Unit
    
    def addProperty(name: String, opts: Getter): Unit
    
    def addSignal(name: String, opts: Types): Unit
    
    def emitSignal(name: String, values: Any*): Unit
    
    var name: String
    
    var `object`: DBusServiceObject
    
    def update(): Unit
  }
  object DBusServiceInterface {
    
    inline def apply(
      addMethod: (String, In, js.Function3[
          /* name */ String, 
          /* quality */ Any, 
          /* callback */ js.Function1[/* res */ Any, Unit], 
          Unit
        ]) => Callback,
      addProperty: (String, Getter) => Callback,
      addSignal: (String, Types) => Callback,
      emitSignal: (String, /* repeated */ Any) => Callback,
      name: String,
      `object`: DBusServiceObject,
      update: Callback
    ): DBusServiceInterface = {
      val __obj = js.Dynamic.literal(addMethod = js.Any.fromFunction3((t0: String, t1: In, t2: js.Function3[
          /* name */ String, 
          /* quality */ Any, 
          /* callback */ js.Function1[/* res */ Any, Unit], 
          Unit
        ]) => (addMethod(t0, t1, t2)).runNow()), addProperty = js.Any.fromFunction2((t0: String, t1: Getter) => (addProperty(t0, t1)).runNow()), addSignal = js.Any.fromFunction2((t0: String, t1: Types) => (addSignal(t0, t1)).runNow()), emitSignal = js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (emitSignal(t0, t1)).runNow()), name = name.asInstanceOf[js.Any], update = update.toJsFn)
      __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceInterface]
    }
    
    extension [Self <: DBusServiceInterface](x: Self) {
      
      inline def setAddMethod(
        value: (String, In, js.Function3[
              /* name */ String, 
              /* quality */ Any, 
              /* callback */ js.Function1[/* res */ Any, Unit], 
              Unit
            ]) => Callback
      ): Self = StObject.set(x, "addMethod", js.Any.fromFunction3((t0: String, t1: In, t2: js.Function3[
              /* name */ String, 
              /* quality */ Any, 
              /* callback */ js.Function1[/* res */ Any, Unit], 
              Unit
            ]) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddProperty(value: (String, Getter) => Callback): Self = StObject.set(x, "addProperty", js.Any.fromFunction2((t0: String, t1: Getter) => (value(t0, t1)).runNow()))
      
      inline def setAddSignal(value: (String, Types) => Callback): Self = StObject.set(x, "addSignal", js.Any.fromFunction2((t0: String, t1: Types) => (value(t0, t1)).runNow()))
      
      inline def setEmitSignal(value: (String, /* repeated */ Any) => Callback): Self = StObject.set(x, "emitSignal", js.Any.fromFunction2((t0: String, t1: /* repeated */ Any) => (value(t0, t1)).runNow()))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setObject(value: DBusServiceObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
    }
  }
  
  trait DBusServiceObject extends StObject {
    
    def createInterface(name: String): DBusServiceInterface
    
    var path: String
    
    var service: DBusService
  }
  object DBusServiceObject {
    
    inline def apply(createInterface: String => DBusServiceInterface, path: String, service: DBusService): DBusServiceObject = {
      val __obj = js.Dynamic.literal(createInterface = js.Any.fromFunction1(createInterface), path = path.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[DBusServiceObject]
    }
    
    extension [Self <: DBusServiceObject](x: Self) {
      
      inline def setCreateInterface(value: String => DBusServiceInterface): Self = StObject.set(x, "createInterface", js.Any.fromFunction1(value))
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setService(value: DBusService): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]: T[P] extends U? T[P] : never}
    }}}
    */
  @js.native
  trait PickMatching[T, U] extends StObject
  
  type PropsCB = js.Function2[/* err */ js.UndefOr[Error], /* value */ Any, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.dbus.dbusStrings.session
    - typingsJapgolly.dbus.dbusStrings.system
  */
  trait busType extends StObject
  object busType {
    
    inline def session: typingsJapgolly.dbus.dbusStrings.session = "session".asInstanceOf[typingsJapgolly.dbus.dbusStrings.session]
    
    inline def system: typingsJapgolly.dbus.dbusStrings.system = "system".asInstanceOf[typingsJapgolly.dbus.dbusStrings.system]
  }
}
