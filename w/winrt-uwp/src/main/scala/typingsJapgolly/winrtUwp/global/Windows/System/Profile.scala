package typingsJapgolly.winrtUwp.global.Windows.System

import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IMapView
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Enables apps to get information about the system. */
object Profile {
  
  /** Provides information about the device for profiling purposes. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.AnalyticsInfo")
  @js.native
  open class AnalyticsInfo ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.AnalyticsInfo
  object AnalyticsInfo {
    
    @JSGlobal("Windows.System.Profile.AnalyticsInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the device form. */
    /* static member */
    @JSGlobal("Windows.System.Profile.AnalyticsInfo.deviceForm")
    @js.native
    def deviceForm: String = js.native
    inline def deviceForm_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deviceForm")(x.asInstanceOf[js.Any])
    
    /** Gets version info about the device family. */
    /* static member */
    @JSGlobal("Windows.System.Profile.AnalyticsInfo.versionInfo")
    @js.native
    def versionInfo: typingsJapgolly.winrtUwp.Windows.System.Profile.AnalyticsVersionInfo = js.native
    inline def versionInfo_=(x: typingsJapgolly.winrtUwp.Windows.System.Profile.AnalyticsVersionInfo): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("versionInfo")(x.asInstanceOf[js.Any])
  }
  
  /** Provides version information about the device family. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.AnalyticsVersionInfo")
  @js.native
  open class AnalyticsVersionInfo ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.AnalyticsVersionInfo {
    
    /** Gets the device family. */
    /* CompleteClass */
    var deviceFamily: String = js.native
    
    /** Gets the version within the device family. */
    /* CompleteClass */
    var deviceFamilyVersion: String = js.native
  }
  
  /** Provides the ability to obtain a hardware identifier that represents the current hardware. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.HardwareIdentification")
  @js.native
  open class HardwareIdentification ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.HardwareIdentification
  object HardwareIdentification {
    
    @JSGlobal("Windows.System.Profile.HardwareIdentification")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets a hardware identifier ( ASHWID) that represents the current hardware. The returned ASHWID will be different for each application package. In other words, this API will return different identifiers when called by two apps from different packages. It will return the same identifier when called by two apps that are part of the same package.
      * @param nonce The cryptographic nonce is optional. The nonce is recommended when ASHWID needs to be verified on the cloud against replay attacks. In the scenarios where nonce is desired, the remote server should generate a random nonce and pass it to the client app, and then verify that the signature has the expected nonce once the ASHWID is received from the client system.
      * @return The hardware Id information.
      */
    /* static member */
    inline def getPackageSpecificToken(nonce: IBuffer): typingsJapgolly.winrtUwp.Windows.System.Profile.HardwareToken = ^.asInstanceOf[js.Dynamic].applyDynamic("getPackageSpecificToken")(nonce.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.winrtUwp.Windows.System.Profile.HardwareToken]
  }
  
  /** Represents a token that contains a hardware based identification that is sufficiently unique. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.HardwareToken")
  @js.native
  open class HardwareToken ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.HardwareToken {
    
    /** Gets the certificate that is used to sign the Id and is used to help verify the authenticity of the Id. */
    /* CompleteClass */
    var certificate: IBuffer = js.native
    
    /** Gets the hardware identifier that identifies the device. */
    /* CompleteClass */
    var id: IBuffer = js.native
    
    /** Gets the digital signature of hardware Id that helps verify the authenticity of returned Id. */
    /* CompleteClass */
    var signature: IBuffer = js.native
  }
  
  /** Identifies the string keys that might exist within the RetailInfo.Properties map of retail-demo relevant property values. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties")
  @js.native
  open class KnownRetailInfoProperties ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.KnownRetailInfoProperties
  object KnownRetailInfoProperties {
    
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the string that identifies the KnownRetailInfoProperties retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.batteryLifeDescription")
    @js.native
    def batteryLifeDescription: String = js.native
    inline def batteryLifeDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("batteryLifeDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the DisplayDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.displayDescription")
    @js.native
    def displayDescription: String = js.native
    inline def displayDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the DisplayModelName retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.displayModelName")
    @js.native
    def displayModelName: String = js.native
    inline def displayModelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayModelName")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the FormFactor retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.formFactor")
    @js.native
    def formFactor: String = js.native
    inline def formFactor_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formFactor")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the FrontCameraDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.frontCameraDescription")
    @js.native
    def frontCameraDescription: String = js.native
    inline def frontCameraDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("frontCameraDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the GraphicsDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.graphicsDescription")
    @js.native
    def graphicsDescription: String = js.native
    inline def graphicsDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("graphicsDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the HasNfc retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.hasNfc")
    @js.native
    def hasNfc: String = js.native
    inline def hasNfc_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasNfc")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the HasOpticalDrive retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.hasOpticalDrive")
    @js.native
    def hasOpticalDrive: String = js.native
    inline def hasOpticalDrive_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasOpticalDrive")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the HasSdSlot retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.hasSdSlot")
    @js.native
    def hasSdSlot: String = js.native
    inline def hasSdSlot_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hasSdSlot")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the IsFeatured retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.isFeatured")
    @js.native
    def isFeatured: String = js.native
    inline def isFeatured_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isFeatured")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the IsOfficeInstalled retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.isOfficeInstalled")
    @js.native
    def isOfficeInstalled: String = js.native
    inline def isOfficeInstalled_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isOfficeInstalled")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the ManufacturerName retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.manufacturerName")
    @js.native
    def manufacturerName: String = js.native
    inline def manufacturerName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("manufacturerName")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the Memory retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.memory")
    @js.native
    def memory: String = js.native
    inline def memory_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("memory")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the ModelName retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.modelName")
    @js.native
    def modelName: String = js.native
    inline def modelName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modelName")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the Price retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.price")
    @js.native
    def price: String = js.native
    inline def price_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("price")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the ProcessorDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.processorDescription")
    @js.native
    def processorDescription: String = js.native
    inline def processorDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("processorDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the RearCameraDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.rearCameraDescription")
    @js.native
    def rearCameraDescription: String = js.native
    inline def rearCameraDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rearCameraDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the RetailAccessCode retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.retailAccessCode")
    @js.native
    def retailAccessCode: String = js.native
    inline def retailAccessCode_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("retailAccessCode")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the ScreenSize retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.screenSize")
    @js.native
    def screenSize: String = js.native
    inline def screenSize_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenSize")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the StorageDescription retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.storageDescription")
    @js.native
    def storageDescription: String = js.native
    inline def storageDescription_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("storageDescription")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the Weight retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.weight")
    @js.native
    def weight: String = js.native
    inline def weight_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
    
    /** Gets the string that identifies the WindowsEdition retail demo property. */
    /* static member */
    @JSGlobal("Windows.System.Profile.KnownRetailInfoProperties.windowsEdition")
    @js.native
    def windowsEdition: String = js.native
    inline def windowsEdition_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("windowsEdition")(x.asInstanceOf[js.Any])
  }
  
  object PlatformDataCollectionLevel {
    
    @JSGlobal("Windows.System.Profile.PlatformDataCollectionLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* unmapped type */
    @JSGlobal("Windows.System.Profile.PlatformDataCollectionLevel.basic")
    @js.native
    def basic: Any = js.native
    inline def basic_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("basic")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    @JSGlobal("Windows.System.Profile.PlatformDataCollectionLevel.enhanced")
    @js.native
    def enhanced: Any = js.native
    inline def enhanced_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enhanced")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    @JSGlobal("Windows.System.Profile.PlatformDataCollectionLevel.full")
    @js.native
    def full: Any = js.native
    inline def full_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("full")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Windows.System.Profile.PlatformDataCollectionLevel.security")
    @js.native
    def security: Any = js.native
    inline def security_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("security")(x.asInstanceOf[js.Any])
  }
  
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings")
  @js.native
  open class PlatformDiagnosticsAndUsageDataSettings ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings
  object PlatformDiagnosticsAndUsageDataSettings {
    
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings.addEventListener")
    @js.native
    def addEventListener: Any = js.native
    inline def addEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addEventListener")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings.canCollectDiagnostics")
    @js.native
    def canCollectDiagnostics: Any = js.native
    inline def canCollectDiagnostics_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("canCollectDiagnostics")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings.collectionLevel")
    @js.native
    def collectionLevel: Any = js.native
    inline def collectionLevel_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("collectionLevel")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings.oncollectionlevelchanged")
    @js.native
    def oncollectionlevelchanged: Any = js.native
    inline def oncollectionlevelchanged_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("oncollectionlevelchanged")(x.asInstanceOf[js.Any])
    
    /* unmapped type */
    /* static member */
    @JSGlobal("Windows.System.Profile.PlatformDiagnosticsAndUsageDataSettings.removeEventListener")
    @js.native
    def removeEventListener: Any = js.native
    inline def removeEventListener_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeEventListener")(x.asInstanceOf[js.Any])
  }
  
  /** A utility class that supports one method, IsDemoModeEnabled , and one property, Properties . Call IsDemoModeEnabled to determine whether the device where the app is running has specifically enabled its retail demo mode. */
  /* note: abstract class */ @JSGlobal("Windows.System.Profile.RetailInfo")
  @js.native
  open class RetailInfo ()
    extends StObject
       with typingsJapgolly.winrtUwp.Windows.System.Profile.RetailInfo
  object RetailInfo {
    
    @JSGlobal("Windows.System.Profile.RetailInfo")
    @js.native
    val ^ : js.Any = js.native
    
    /** Determines whether the device where the app is running has specifically enabled its retail demo mode. */
    /* static member */
    @JSGlobal("Windows.System.Profile.RetailInfo.isDemoModeEnabled")
    @js.native
    def isDemoModeEnabled: Boolean = js.native
    inline def isDemoModeEnabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDemoModeEnabled")(x.asInstanceOf[js.Any])
    
    /** Gets an object that represents the set of available retail demo properties and their values. */
    /* static member */
    @JSGlobal("Windows.System.Profile.RetailInfo.properties")
    @js.native
    def properties: IMapView[String, Any] = js.native
    inline def properties_=(x: IMapView[String, Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("properties")(x.asInstanceOf[js.Any])
  }
  
  /** Provides info for hardware developers and OEMs. */
  object SystemManufacturers {
    
    /** Enables access to properties from the SMBIOS for the system. */
    /* note: abstract class */ @JSGlobal("Windows.System.Profile.SystemManufacturers.SmbiosInformation")
    @js.native
    open class SmbiosInformation ()
      extends StObject
         with typingsJapgolly.winrtUwp.Windows.System.Profile.SystemManufacturers.SmbiosInformation
    object SmbiosInformation {
      
      @JSGlobal("Windows.System.Profile.SystemManufacturers.SmbiosInformation")
      @js.native
      val ^ : js.Any = js.native
      
      /** Gets the serial number from the SMBIOS for the system. */
      /* static member */
      @JSGlobal("Windows.System.Profile.SystemManufacturers.SmbiosInformation.serialNumber")
      @js.native
      def serialNumber: String = js.native
      inline def serialNumber_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialNumber")(x.asInstanceOf[js.Any])
    }
  }
}
