package typingsJapgolly.ackeeTracker

import japgolly.scalajs.react.Callback
import typingsJapgolly.ackeeTracker.ackeeTrackerBooleans.`false`
import typingsJapgolly.ackeeTracker.ackeeTrackerBooleans.`true`
import typingsJapgolly.ackeeTracker.anon.FnCall
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ackee-tracker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def attributes(): DefaultData = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")().asInstanceOf[DefaultData]
  inline def attributes(detailed: Boolean): DefaultData | (DefaultData & DetailedData) = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")(detailed.asInstanceOf[js.Any]).asInstanceOf[DefaultData | (DefaultData & DetailedData)]
  
  inline def attributes_Union(): DefaultData | (DefaultData & DetailedData) = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")().asInstanceOf[DefaultData | (DefaultData & DetailedData)]
  
  inline def attributes_false(detailed: `false`): DefaultData = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")(detailed.asInstanceOf[js.Any]).asInstanceOf[DefaultData]
  
  inline def attributes_true(detailed: `true`): DefaultData & DetailedData = ^.asInstanceOf[js.Dynamic].applyDynamic("attributes")(detailed.asInstanceOf[js.Any]).asInstanceOf[DefaultData & DetailedData]
  
  inline def create(server: String): AckeeInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(server.asInstanceOf[js.Any]).asInstanceOf[AckeeInstance]
  inline def create(server: String, options: TrackingOptions): AckeeInstance = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(server.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AckeeInstance]
  
  inline def detect(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("detect")().asInstanceOf[Unit]
  
  @js.native
  trait AckeeInstance extends StObject {
    
    def action(eventId: String, attributes: ActionAttributes): Unit = js.native
    def action(eventId: String, attributes: ActionAttributes, callback: js.Function1[/* actionId */ String, Unit]): Unit = js.native
    
    def record(domainId: String): AckeeTrackingReturn = js.native
    def record(domainId: String, attrs: ReturnType[FnCall]): AckeeTrackingReturn = js.native
    
    def updateAction(actionId: String, attributes: ActionAttributes): Unit = js.native
    
    def updateRecord(recordId: String): AckeeTrackingReturn = js.native
  }
  
  trait AckeeTrackingReturn extends StObject {
    
    def stop(): Unit
  }
  object AckeeTrackingReturn {
    
    inline def apply(stop: Callback): AckeeTrackingReturn = {
      val __obj = js.Dynamic.literal(stop = stop.toJsFn)
      __obj.asInstanceOf[AckeeTrackingReturn]
    }
    
    extension [Self <: AckeeTrackingReturn](x: Self) {
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait ActionAttributes extends StObject {
    
    /**
      * Key that will be used to group similar actions in the Ackee UI.
      */
    var key: String
    
    /**
      * Positive float value that is added to all other numerical values of the key.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object ActionAttributes {
    
    inline def apply(key: String): ActionAttributes = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionAttributes]
    }
    
    extension [Self <: ActionAttributes](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DefaultData extends StObject {
    
    var siteLocation: String
    
    var siteReferrer: String
  }
  object DefaultData {
    
    inline def apply(siteLocation: String, siteReferrer: String): DefaultData = {
      val __obj = js.Dynamic.literal(siteLocation = siteLocation.asInstanceOf[js.Any], siteReferrer = siteReferrer.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultData]
    }
    
    extension [Self <: DefaultData](x: Self) {
      
      inline def setSiteLocation(value: String): Self = StObject.set(x, "siteLocation", value.asInstanceOf[js.Any])
      
      inline def setSiteReferrer(value: String): Self = StObject.set(x, "siteReferrer", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetailedData extends StObject {
    
    var browserHeight: Double
    
    var browserName: String | Null
    
    var browserVersion: String | Null
    
    var browserWidth: Double
    
    var deviceManufacturer: String | Null
    
    var deviceName: String | Null
    
    var osName: String | Null
    
    var osVersion: String | Null
    
    var screenColorDepth: Double
    
    var screenHeight: Double
    
    var screenWidth: Double
    
    var siteLanguage: String
  }
  object DetailedData {
    
    inline def apply(
      browserHeight: Double,
      browserWidth: Double,
      screenColorDepth: Double,
      screenHeight: Double,
      screenWidth: Double,
      siteLanguage: String
    ): DetailedData = {
      val __obj = js.Dynamic.literal(browserHeight = browserHeight.asInstanceOf[js.Any], browserWidth = browserWidth.asInstanceOf[js.Any], screenColorDepth = screenColorDepth.asInstanceOf[js.Any], screenHeight = screenHeight.asInstanceOf[js.Any], screenWidth = screenWidth.asInstanceOf[js.Any], siteLanguage = siteLanguage.asInstanceOf[js.Any], browserName = null, browserVersion = null, deviceManufacturer = null, deviceName = null, osName = null, osVersion = null)
      __obj.asInstanceOf[DetailedData]
    }
    
    extension [Self <: DetailedData](x: Self) {
      
      inline def setBrowserHeight(value: Double): Self = StObject.set(x, "browserHeight", value.asInstanceOf[js.Any])
      
      inline def setBrowserName(value: String): Self = StObject.set(x, "browserName", value.asInstanceOf[js.Any])
      
      inline def setBrowserNameNull: Self = StObject.set(x, "browserName", null)
      
      inline def setBrowserVersion(value: String): Self = StObject.set(x, "browserVersion", value.asInstanceOf[js.Any])
      
      inline def setBrowserVersionNull: Self = StObject.set(x, "browserVersion", null)
      
      inline def setBrowserWidth(value: Double): Self = StObject.set(x, "browserWidth", value.asInstanceOf[js.Any])
      
      inline def setDeviceManufacturer(value: String): Self = StObject.set(x, "deviceManufacturer", value.asInstanceOf[js.Any])
      
      inline def setDeviceManufacturerNull: Self = StObject.set(x, "deviceManufacturer", null)
      
      inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
      
      inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
      
      inline def setOsName(value: String): Self = StObject.set(x, "osName", value.asInstanceOf[js.Any])
      
      inline def setOsNameNull: Self = StObject.set(x, "osName", null)
      
      inline def setOsVersion(value: String): Self = StObject.set(x, "osVersion", value.asInstanceOf[js.Any])
      
      inline def setOsVersionNull: Self = StObject.set(x, "osVersion", null)
      
      inline def setScreenColorDepth(value: Double): Self = StObject.set(x, "screenColorDepth", value.asInstanceOf[js.Any])
      
      inline def setScreenHeight(value: Double): Self = StObject.set(x, "screenHeight", value.asInstanceOf[js.Any])
      
      inline def setScreenWidth(value: Double): Self = StObject.set(x, "screenWidth", value.asInstanceOf[js.Any])
      
      inline def setSiteLanguage(value: String): Self = StObject.set(x, "siteLanguage", value.asInstanceOf[js.Any])
    }
  }
  
  trait TrackingOptions extends StObject {
    
    /**
      * Defaults to `false`
      */
    var detailed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to `true`
      */
    var ignoreLocalhost: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to `true`
      */
    var ignoreOwnVisits: js.UndefOr[Boolean] = js.undefined
  }
  object TrackingOptions {
    
    inline def apply(): TrackingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackingOptions]
    }
    
    extension [Self <: TrackingOptions](x: Self) {
      
      inline def setDetailed(value: Boolean): Self = StObject.set(x, "detailed", value.asInstanceOf[js.Any])
      
      inline def setDetailedUndefined: Self = StObject.set(x, "detailed", js.undefined)
      
      inline def setIgnoreLocalhost(value: Boolean): Self = StObject.set(x, "ignoreLocalhost", value.asInstanceOf[js.Any])
      
      inline def setIgnoreLocalhostUndefined: Self = StObject.set(x, "ignoreLocalhost", js.undefined)
      
      inline def setIgnoreOwnVisits(value: Boolean): Self = StObject.set(x, "ignoreOwnVisits", value.asInstanceOf[js.Any])
      
      inline def setIgnoreOwnVisitsUndefined: Self = StObject.set(x, "ignoreOwnVisits", js.undefined)
    }
  }
}
