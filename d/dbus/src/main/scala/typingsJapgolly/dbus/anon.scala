package typingsJapgolly.dbus

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dbus.mod.DBusConnection
import typingsJapgolly.dbus.mod.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bus extends StObject {
    
    var bus: DBusConnection
    
    def getProperties(callback: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[Any], Unit]): Unit
    
    def getProperty(name: String, callback: js.Function2[/* err */ Error | Null, /* name */ String, Unit]): Unit
    
    var interfaceName: String
    
    var objectPath: String
    
    var serviceName: String
    
    def setProperty(name: String, value: Any, callback: js.Function1[/* err */ Error | Null, Unit]): Unit
  }
  object Bus {
    
    inline def apply(
      bus: DBusConnection,
      getProperties: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[Any], Unit] => Callback,
      getProperty: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Callback,
      interfaceName: String,
      objectPath: String,
      serviceName: String,
      setProperty: (String, Any, js.Function1[/* err */ Error | Null, Unit]) => Callback
    ): Bus = {
      val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], getProperties = js.Any.fromFunction1((t0: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[Any], Unit]) => getProperties(t0).runNow()), getProperty = js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => (getProperty(t0, t1)).runNow()), interfaceName = interfaceName.asInstanceOf[js.Any], objectPath = objectPath.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], setProperty = js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ Error | Null, Unit]) => (setProperty(t0, t1, t2)).runNow()))
      __obj.asInstanceOf[Bus]
    }
    
    extension [Self <: Bus](x: Self) {
      
      inline def setBus(value: DBusConnection): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
      
      inline def setGetProperties(
        value: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[Any], Unit] => Callback
      ): Self = StObject.set(x, "getProperties", js.Any.fromFunction1((t0: js.Function2[/* err */ Error | Null, /* properties */ StringDictionary[Any], Unit]) => value(t0).runNow()))
      
      inline def setGetProperty(value: (String, js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => Callback): Self = StObject.set(x, "getProperty", js.Any.fromFunction2((t0: String, t1: js.Function2[/* err */ Error | Null, /* name */ String, Unit]) => (value(t0, t1)).runNow()))
      
      inline def setInterfaceName(value: String): Self = StObject.set(x, "interfaceName", value.asInstanceOf[js.Any])
      
      inline def setObjectPath(value: String): Self = StObject.set(x, "objectPath", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setSetProperty(value: (String, Any, js.Function1[/* err */ Error | Null, Unit]) => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction3((t0: String, t1: Any, t2: js.Function1[/* err */ Error | Null, Unit]) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  trait Getter extends StObject {
    
    def getter(cb: js.Function1[/* val */ String, Unit]): Unit
    
    var setter: js.UndefOr[js.Function2[/* value */ Any, /* done */ js.Function0[Unit], Unit]] = js.undefined
    
    var `type`: String
  }
  object Getter {
    
    inline def apply(getter: js.Function1[/* val */ String, Unit] => Callback, `type`: String): Getter = {
      val __obj = js.Dynamic.literal(getter = js.Any.fromFunction1((t0: js.Function1[/* val */ String, Unit]) => getter(t0).runNow()))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Getter]
    }
    
    extension [Self <: Getter](x: Self) {
      
      inline def setGetter(value: js.Function1[/* val */ String, Unit] => Callback): Self = StObject.set(x, "getter", js.Any.fromFunction1((t0: js.Function1[/* val */ String, Unit]) => value(t0).runNow()))
      
      inline def setSetter(value: (/* value */ Any, /* done */ js.Function0[Unit]) => Callback): Self = StObject.set(x, "setter", js.Any.fromFunction2((t0: /* value */ Any, t1: /* done */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
      
      inline def setSetterUndefined: Self = StObject.set(x, "setter", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait In extends StObject {
    
    var in: String
    
    var out: String
  }
  object In {
    
    inline def apply(in: String, out: String): In = {
      val __obj = js.Dynamic.literal(in = in.asInstanceOf[js.Any], out = out.asInstanceOf[js.Any])
      __obj.asInstanceOf[In]
    }
    
    extension [Self <: In](x: Self) {
      
      inline def setIn(value: String): Self = StObject.set(x, "in", value.asInstanceOf[js.Any])
      
      inline def setOut(value: String): Self = StObject.set(x, "out", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types extends StObject {
    
    var types: js.Array[String]
  }
  object Types {
    
    inline def apply(types: js.Array[String]): Types = {
      val __obj = js.Dynamic.literal(types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    extension [Self <: Types](x: Self) {
      
      inline def setTypes(value: js.Array[String]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: String*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
