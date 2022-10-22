package typingsJapgolly.reactNativeZeroconf

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.error
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.found
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.remove
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.resolved
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.start
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.stop
import typingsJapgolly.reactNativeZeroconf.reactNativeZeroconfStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-zeroconf", JSImport.Default)
  @js.native
  open class default () extends Zeroconf
  
  trait Service extends StObject {
    
    var addresses: js.Array[String]
    
    var fullName: String
    
    var host: String
    
    var name: String
    
    var port: Double
    
    var txt: StringDictionary[Any]
  }
  object Service {
    
    inline def apply(
      addresses: js.Array[String],
      fullName: String,
      host: String,
      name: String,
      port: Double,
      txt: StringDictionary[Any]
    ): Service = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], txt = txt.asInstanceOf[js.Any])
      __obj.asInstanceOf[Service]
    }
    
    extension [Self <: Service](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value*))
      
      inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTxt(value: StringDictionary[Any]): Self = StObject.set(x, "txt", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Zeroconf extends EventEmitter {
    
    /**
      * Add listeners
      *
      * @description If you cleaned the listeners and need to get them back
      * on.
      */
    def addDeviceListeners(): Unit = js.native
    
    /**
      * Returns resolved services.
      *
      * @description Will return all names of services that have been
      * resolved.
      */
    def getServices(): StringDictionary[Service] = js.native
    
    def on(e: start | stop | update, listener: js.Function0[Any]): this.type = js.native
    /**
      * @param name Name of the the service.
      */
    def on(e: found | remove, listener: js.Function1[/* name */ String, Any]): this.type = js.native
    /**
      * Triggered when an error occurs.
      */
    @JSName("on")
    def on_error(e: error, listener: js.Function1[/* err */ js.Error, Any]): this.type = js.native
    /**
      * Triggered when a service is resolved.
      * @description Broadcast a service object once it is fully resolved.
      */
    @JSName("on")
    def on_resolved(e: resolved, listener: js.Function1[/* service */ Service, Any]): this.type = js.native
    
    /**
      * Publish a service.
      *
      * @description This adds a service for the current device to the
      * discoverable services on the network.
      *
      * @param type Should be both type of the service, for example 'http'.
      * @param protocol Should be protocol of the service, for example 'tcp'.
      * @param domain Should be the domain the service is sitting on, dot
      * suffixed, for example `'local.'`. Defaults to `'local'`.
      * @param name should be unique to the device, often the device name.
      * @param port should be an integer between 0 and 65535.
      * @param txt contains key-value pairs of additional TXT record data.
      */
    def publishService(`type`: String, protocol: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: String, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: String,
      port: Double,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: String,
      port: Unit,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: String, name: Unit, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: Unit,
      port: Double,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: String,
      name: Unit,
      port: Unit,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: String): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: String, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: String,
      port: Double,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: String,
      port: Unit,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: Unit, port: Double): Unit = js.native
    def publishService(
      `type`: String,
      protocol: String,
      domain: Unit,
      name: Unit,
      port: Double,
      txt: StringDictionary[Any]
    ): Unit = js.native
    def publishService(`type`: String, protocol: String, domain: Unit, name: Unit, port: Unit, txt: StringDictionary[Any]): Unit = js.native
    
    /**
      * Remove listeners.
      *
      * @description Allow you to clean the listeners, avoiding potential
      * memory leaks.
      *
      * @see https://github.com/balthazar/react-native-zeroconf/issues/33
      */
    def removeDeviceListeners(): Unit = js.native
    
    /**
      * Start the zeroconf scan.
      *
      * @description This will initialize the scan from the `Zeroconf`
      * instance. Will stop another scan if any is running.
      *
      * @param type Default `http`
      * @param protocol Default `tcp`
      * @param domain Default `local`
      */
    def scan(): Unit = js.native
    def scan(`type`: String): Unit = js.native
    def scan(`type`: String, protocol: String): Unit = js.native
    def scan(`type`: String, protocol: String, domain: String): Unit = js.native
    def scan(`type`: String, protocol: Unit, domain: String): Unit = js.native
    def scan(`type`: Unit, protocol: String): Unit = js.native
    def scan(`type`: Unit, protocol: String, domain: String): Unit = js.native
    def scan(`type`: Unit, protocol: Unit, domain: String): Unit = js.native
    
    /**
      * Stop the scan.
      *
      * @description If any scan is running, stop it. Otherwise do nothing.
      */
    def stop(): Unit = js.native
    
    /**
      * Unpublish a service.
      *
      * @description This removes a service from those discoverable on the
      * network.
      *
      * @param name should be the name used when publishing the service.
      */
    def unpublishService(name: String): Unit = js.native
  }
}
