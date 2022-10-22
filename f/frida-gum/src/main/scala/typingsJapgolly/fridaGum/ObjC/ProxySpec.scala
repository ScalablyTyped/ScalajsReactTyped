package typingsJapgolly.fridaGum.ObjC

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxySpec[D /* <: ProxyData */, T, S] extends StObject {
  
  /**
    * Callbacks for getting notified about events.
    */
  var events: js.UndefOr[ProxyEventCallbacks[D, T, S]] = js.undefined
  
  /**
    * Methods to implement.
    */
  var methods: js.UndefOr[
    StringDictionary[
      (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
    ]
  ] = js.undefined
  
  /**
    * Name of the proxy class.
    *
    * Omit this if you don’t care about the globally visible name and would like the runtime to auto-generate one
    * for you.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Protocols this proxy class conforms to.
    */
  var protocols: js.UndefOr[js.Array[Protocol]] = js.undefined
}
object ProxySpec {
  
  inline def apply[D /* <: ProxyData */, T, S](): ProxySpec[D, T, S] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxySpec[D, T, S]]
  }
  
  extension [Self <: ProxySpec[?, ?, ?], D /* <: ProxyData */, T, S](x: Self & (ProxySpec[D, T, S])) {
    
    inline def setEvents(value: ProxyEventCallbacks[D, T, S]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setMethods(
      value: StringDictionary[
          (UserMethodImplementation[D, T, S]) | (MethodSpec[UserMethodImplementation[D, T, S]])
        ]
    ): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
    
    inline def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProtocols(value: js.Array[Protocol]): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setProtocolsUndefined: Self = StObject.set(x, "protocols", js.undefined)
    
    inline def setProtocolsVarargs(value: Protocol*): Self = StObject.set(x, "protocols", js.Array(value*))
  }
}
