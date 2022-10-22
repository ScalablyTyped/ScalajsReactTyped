package typingsJapgolly.winrtUwp.Windows.Devices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SPI is a high speed interface used to communicate among integrated components on the same board. */
object Spi {
  
  @js.native
  sealed trait SpiMode extends StObject
  /** Defines the SPI communication mode. The communication mode defines the clock edge on which the master out line toggles, the master in line samples, and the signal clock's signal steady level (named SCLK). Each mode is defined with a pair of parameters called clock polarity (CPOL) and clock phase (CPHA). */
  @JSGlobal("Windows.Devices.Spi.SpiMode")
  @js.native
  object SpiMode extends StObject {
    
    /** CPOL = 0, CPHA = 0. */
    @js.native
    sealed trait mode0
      extends StObject
         with SpiMode
    
    /** CPOL = 0, CPHA = 1. */
    @js.native
    sealed trait mode1
      extends StObject
         with SpiMode
    
    /** CPOL = 1, CPHA = 0. */
    @js.native
    sealed trait mode2
      extends StObject
         with SpiMode
    
    /** CPOL = 1, CPHA = 1. */
    @js.native
    sealed trait mode3
      extends StObject
         with SpiMode
  }
  
  @js.native
  sealed trait SpiSharingMode extends StObject
  /** Defines the sharing mode for the SPI bus. */
  @JSGlobal("Windows.Devices.Spi.SpiSharingMode")
  @js.native
  object SpiSharingMode extends StObject {
    
    /** SPI bus segment is not shared. */
    @js.native
    sealed trait exclusive
      extends StObject
         with SpiSharingMode
    
    /** SPI bus is shared. */
    @js.native
    sealed trait shared
      extends StObject
         with SpiSharingMode
  }
  
  /** This API exposes a Provider interface and associated classes for the user to implement for a specific controller. The SPI API needs a SPI Provider implementation to talk to the SPI controller. */
  object Provider {
    
    /** Represents actions common to SPI controller providers. */
    trait ISpiProvider extends StObject {
      
      var getControllersAsync: Any
    }
    object ISpiProvider {
      
      inline def apply(getControllersAsync: Any): ISpiProvider = {
        val __obj = js.Dynamic.literal(getControllersAsync = getControllersAsync.asInstanceOf[js.Any])
        __obj.asInstanceOf[ISpiProvider]
      }
      
      extension [Self <: ISpiProvider](x: Self) {
        
        inline def setGetControllersAsync(value: Any): Self = StObject.set(x, "getControllersAsync", value.asInstanceOf[js.Any])
      }
    }
    
    trait ProviderSpiConnectionSettings extends StObject {
      
      var chipSelectLine: Any
      
      /* unmapped type */
      var clockFrequency: Any
      
      /* unmapped type */
      var dataBitLength: Any
      
      /* unmapped type */
      var mode: Any
      
      /* unmapped type */
      var sharingMode: Any
    }
    object ProviderSpiConnectionSettings {
      
      inline def apply(chipSelectLine: Any, clockFrequency: Any, dataBitLength: Any, mode: Any, sharingMode: Any): ProviderSpiConnectionSettings = {
        val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
        __obj.asInstanceOf[ProviderSpiConnectionSettings]
      }
      
      extension [Self <: ProviderSpiConnectionSettings](x: Self) {
        
        inline def setChipSelectLine(value: Any): Self = StObject.set(x, "chipSelectLine", value.asInstanceOf[js.Any])
        
        inline def setClockFrequency(value: Any): Self = StObject.set(x, "clockFrequency", value.asInstanceOf[js.Any])
        
        inline def setDataBitLength(value: Any): Self = StObject.set(x, "dataBitLength", value.asInstanceOf[js.Any])
        
        inline def setMode(value: Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
        
        inline def setSharingMode(value: Any): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
      }
    }
  }
  
  /** Represents the info about a SPI bus. */
  trait SpiBusInfo extends StObject {
    
    /** Gets the number of chip select lines available on the bus. */
    var chipSelectLineCount: Double
    
    /** Maximum clock cycle frequency of the bus. */
    var maxClockFrequency: Double
    
    /** Minimum clock cycle frequency of the bus. */
    var minClockFrequency: Double
    
    /** Gets the bit lengths that can be used on the bus for transmitting data. */
    var supportedDataBitLengths: IVectorView[Double]
  }
  object SpiBusInfo {
    
    inline def apply(
      chipSelectLineCount: Double,
      maxClockFrequency: Double,
      minClockFrequency: Double,
      supportedDataBitLengths: IVectorView[Double]
    ): SpiBusInfo = {
      val __obj = js.Dynamic.literal(chipSelectLineCount = chipSelectLineCount.asInstanceOf[js.Any], maxClockFrequency = maxClockFrequency.asInstanceOf[js.Any], minClockFrequency = minClockFrequency.asInstanceOf[js.Any], supportedDataBitLengths = supportedDataBitLengths.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpiBusInfo]
    }
    
    extension [Self <: SpiBusInfo](x: Self) {
      
      inline def setChipSelectLineCount(value: Double): Self = StObject.set(x, "chipSelectLineCount", value.asInstanceOf[js.Any])
      
      inline def setMaxClockFrequency(value: Double): Self = StObject.set(x, "maxClockFrequency", value.asInstanceOf[js.Any])
      
      inline def setMinClockFrequency(value: Double): Self = StObject.set(x, "minClockFrequency", value.asInstanceOf[js.Any])
      
      inline def setSupportedDataBitLengths(value: IVectorView[Double]): Self = StObject.set(x, "supportedDataBitLengths", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the settings for the connection with a device. */
  trait SpiConnectionSettings extends StObject {
    
    /** Gets or sets the chip select line for the connection to the SPI device. */
    var chipSelectLine: Double
    
    /** Gets or sets the clock frequency for the connection. */
    var clockFrequency: Double
    
    /** Gets or sets the bit length for data on this connection. */
    var dataBitLength: Double
    
    /** Gets or sets the SpiMode for this connection. */
    var mode: SpiMode
    
    /** Gets or sets the sharing mode for the SPI connection. */
    var sharingMode: SpiSharingMode
  }
  object SpiConnectionSettings {
    
    inline def apply(
      chipSelectLine: Double,
      clockFrequency: Double,
      dataBitLength: Double,
      mode: SpiMode,
      sharingMode: SpiSharingMode
    ): SpiConnectionSettings = {
      val __obj = js.Dynamic.literal(chipSelectLine = chipSelectLine.asInstanceOf[js.Any], clockFrequency = clockFrequency.asInstanceOf[js.Any], dataBitLength = dataBitLength.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], sharingMode = sharingMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpiConnectionSettings]
    }
    
    extension [Self <: SpiConnectionSettings](x: Self) {
      
      inline def setChipSelectLine(value: Double): Self = StObject.set(x, "chipSelectLine", value.asInstanceOf[js.Any])
      
      inline def setClockFrequency(value: Double): Self = StObject.set(x, "clockFrequency", value.asInstanceOf[js.Any])
      
      inline def setDataBitLength(value: Double): Self = StObject.set(x, "dataBitLength", value.asInstanceOf[js.Any])
      
      inline def setMode(value: SpiMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSharingMode(value: SpiSharingMode): Self = StObject.set(x, "sharingMode", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the SPI controller on the system. */
  trait SpiController extends StObject {
    
    /**
      * Gets the SPI device with the specified settings.
      * @param settings The desired connection settings.
      * @return The SPI device.
      */
    def getDevice(settings: SpiConnectionSettings): SpiDevice
  }
  object SpiController {
    
    inline def apply(getDevice: SpiConnectionSettings => SpiDevice): SpiController = {
      val __obj = js.Dynamic.literal(getDevice = js.Any.fromFunction1(getDevice))
      __obj.asInstanceOf[SpiController]
    }
    
    extension [Self <: SpiController](x: Self) {
      
      inline def setGetDevice(value: SpiConnectionSettings => SpiDevice): Self = StObject.set(x, "getDevice", js.Any.fromFunction1(value))
    }
  }
  
  /** Represents a device connected through the SPI bus. */
  trait SpiDevice extends StObject {
    
    /** Closes the connection to the device. */
    def close(): Unit
    
    /** Gets the connection settings for the device. */
    var connectionSettings: SpiConnectionSettings
    
    /** Gets the unique ID associated with the device. */
    var deviceId: String
    
    /**
      * Reads from the connected device.
      * @return Array containing data read from the device.
      */
    def read(): js.Array[Double]
    
    /**
      * Transfer data using a full duplex communication system. Full duplex allows both the master and the slave to communicate simultaneously.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    def transferFullDuplex(writeBuffer: js.Array[Double]): js.Array[Double]
    
    /**
      * Transfer data sequentially to the device.
      * @param writeBuffer Array containing data to write to the device.
      * @return Array containing data read from the device.
      */
    def transferSequential(writeBuffer: js.Array[Double]): js.Array[Double]
    
    /**
      * Writes to the connected device.
      * @param buffer Array containing the data to write to the device.
      */
    def write(buffer: js.Array[Double]): Unit
  }
  object SpiDevice {
    
    inline def apply(
      close: Callback,
      connectionSettings: SpiConnectionSettings,
      deviceId: String,
      read: CallbackTo[js.Array[Double]],
      transferFullDuplex: js.Array[Double] => js.Array[Double],
      transferSequential: js.Array[Double] => js.Array[Double],
      write: js.Array[Double] => Callback
    ): SpiDevice = {
      val __obj = js.Dynamic.literal(close = close.toJsFn, connectionSettings = connectionSettings.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], read = read.toJsFn, transferFullDuplex = js.Any.fromFunction1(transferFullDuplex), transferSequential = js.Any.fromFunction1(transferSequential), write = js.Any.fromFunction1((t0: js.Array[Double]) => write(t0).runNow()))
      __obj.asInstanceOf[SpiDevice]
    }
    
    extension [Self <: SpiDevice](x: Self) {
      
      inline def setClose(value: Callback): Self = StObject.set(x, "close", value.toJsFn)
      
      inline def setConnectionSettings(value: SpiConnectionSettings): Self = StObject.set(x, "connectionSettings", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setRead(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "read", value.toJsFn)
      
      inline def setTransferFullDuplex(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "transferFullDuplex", js.Any.fromFunction1(value))
      
      inline def setTransferSequential(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "transferSequential", js.Any.fromFunction1(value))
      
      inline def setWrite(value: js.Array[Double] => Callback): Self = StObject.set(x, "write", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    }
  }
}
