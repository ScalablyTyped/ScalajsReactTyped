package typingsJapgolly.winrtUwp.Windows.Devices.Scanners

import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typingsJapgolly.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typingsJapgolly.winrtUwp.Windows.Storage.StorageFolder
import typingsJapgolly.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties of images to scan. */
trait ImageScanner extends StObject {
  
  /** Gets and sets the scan settings of the auto-configured scan unit, like the file format, including compression to deliver the scanned data in. This property is ignored if the scanner is not capable of auto-configuration. */
  var autoConfiguration: ImageScannerAutoConfiguration
  
  /** Gets the default scan source chosen for this scanner device. */
  var defaultScanSource: ImageScannerScanSource
  
  /** Gets the PnP device identifier of this scanner device. */
  var deviceId: String
  
  /** Gets or sets the scan settings of the Feeder scan unit, like page size, orientation, and scan resolution. */
  var feederConfiguration: ImageScannerFeederConfiguration
  
  /** Gets and sets the scan settings of the Flatbed scan unit, like scan resolution and color mode. */
  var flatbedConfiguration: ImageScannerFlatbedConfiguration
  
  /**
    * Determines if the specified scan source supports scan preview.
    * @param scanSource The scan source.
    * @return Returns True if the specified scan source supports preview; otherwise False.
    */
  def isPreviewSupported(scanSource: ImageScannerScanSource): Boolean
  
  /**
    * Determines if the specified scan source is available on the scanner.
    * @param value The scan source.
    * @return True if the scan source, Flatbed or Feeder, is available; otherwise False.
    */
  def isScanSourceSupported(value: ImageScannerScanSource): Boolean
  
  /**
    * Starts a scan job with the specified scan source and writes one or multiple images to one multi-page file like TIFF, XPS, and PDF; or one or multiple single-page files like DIB, PNG, JPG, and TIFF to the specified folder location. Returns the progress of the scan.
    * @param scanSource The image scan source.
    * @param storageFolder The target folder location of the scanned file.
    * @return The list of scanned image files from ImageScannerScanResult and the progress of the WIA scan job from UInt32, which indicates how many files were transferred to the target folder.
    */
  def scanFilesToFolderAsync(scanSource: ImageScannerScanSource, storageFolder: StorageFolder): IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double]
  
  /**
    * Scans one image from the specified scan source and applies the lowest scan resolution with the selected image file format.
    * @param scanSource The image scan source.
    * @param targetStream The scanned image file.
    * @return The progress of the scan and the scanned file format.
    */
  def scanPreviewToStreamAsync(scanSource: ImageScannerScanSource, targetStream: IRandomAccessStream): IPromiseWithIAsyncOperation[ImageScannerPreviewResult]
}
object ImageScanner {
  
  inline def apply(
    autoConfiguration: ImageScannerAutoConfiguration,
    defaultScanSource: ImageScannerScanSource,
    deviceId: String,
    feederConfiguration: ImageScannerFeederConfiguration,
    flatbedConfiguration: ImageScannerFlatbedConfiguration,
    isPreviewSupported: ImageScannerScanSource => Boolean,
    isScanSourceSupported: ImageScannerScanSource => Boolean,
    scanFilesToFolderAsync: (ImageScannerScanSource, StorageFolder) => IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double],
    scanPreviewToStreamAsync: (ImageScannerScanSource, IRandomAccessStream) => IPromiseWithIAsyncOperation[ImageScannerPreviewResult]
  ): ImageScanner = {
    val __obj = js.Dynamic.literal(autoConfiguration = autoConfiguration.asInstanceOf[js.Any], defaultScanSource = defaultScanSource.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], feederConfiguration = feederConfiguration.asInstanceOf[js.Any], flatbedConfiguration = flatbedConfiguration.asInstanceOf[js.Any], isPreviewSupported = js.Any.fromFunction1(isPreviewSupported), isScanSourceSupported = js.Any.fromFunction1(isScanSourceSupported), scanFilesToFolderAsync = js.Any.fromFunction2(scanFilesToFolderAsync), scanPreviewToStreamAsync = js.Any.fromFunction2(scanPreviewToStreamAsync))
    __obj.asInstanceOf[ImageScanner]
  }
  
  extension [Self <: ImageScanner](x: Self) {
    
    inline def setAutoConfiguration(value: ImageScannerAutoConfiguration): Self = StObject.set(x, "autoConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDefaultScanSource(value: ImageScannerScanSource): Self = StObject.set(x, "defaultScanSource", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setFeederConfiguration(value: ImageScannerFeederConfiguration): Self = StObject.set(x, "feederConfiguration", value.asInstanceOf[js.Any])
    
    inline def setFlatbedConfiguration(value: ImageScannerFlatbedConfiguration): Self = StObject.set(x, "flatbedConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIsPreviewSupported(value: ImageScannerScanSource => Boolean): Self = StObject.set(x, "isPreviewSupported", js.Any.fromFunction1(value))
    
    inline def setIsScanSourceSupported(value: ImageScannerScanSource => Boolean): Self = StObject.set(x, "isScanSourceSupported", js.Any.fromFunction1(value))
    
    inline def setScanFilesToFolderAsync(
      value: (ImageScannerScanSource, StorageFolder) => IPromiseWithIAsyncOperationWithProgress[ImageScannerScanResult, Double]
    ): Self = StObject.set(x, "scanFilesToFolderAsync", js.Any.fromFunction2(value))
    
    inline def setScanPreviewToStreamAsync(
      value: (ImageScannerScanSource, IRandomAccessStream) => IPromiseWithIAsyncOperation[ImageScannerPreviewResult]
    ): Self = StObject.set(x, "scanPreviewToStreamAsync", js.Any.fromFunction2(value))
  }
}
