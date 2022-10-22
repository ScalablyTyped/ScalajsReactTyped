package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
import typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.XBitmap
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scanner {
  
  /** enum ScanError describes error codes of scanner component */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`5`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`4`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`0`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`2`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`3`
    - typingsJapgolly.activexLibreoffice.activexLibreofficeInts.`1`
  */
  trait ScanError extends StObject
  object ScanError {
    
    /** InvalidContext: a device was requested that does not exist */
    inline def InvalidContext: `5` = 5.asInstanceOf[`5`]
    
    /** ScanCanceled: the scan was canceled by the user */
    inline def ScanCanceled: `4` = 4.asInstanceOf[`4`]
    
    /** ScanErrorNone: no error occurred */
    inline def ScanErrorNone: `0` = 0.asInstanceOf[`0`]
    
    /** ScanFailed: an error occurred during scanning */
    inline def ScanFailed: `2` = 2.asInstanceOf[`2`]
    
    /** ScanInProgress: a scan is already in progress on this device that has to end before a new one can be started */
    inline def ScanInProgress: `3` = 3.asInstanceOf[`3`]
    
    /** ScannerNotAvailable: the requested device could not be opened */
    inline def ScannerNotAvailable: `1` = 1.asInstanceOf[`1`]
  }
  
  /** a scanner context is an identifier for a specific scanner device */
  trait ScannerContext extends StObject {
    
    /** InternalData contains service private data and must not be changed */
    var InternalData: Double
    
    /** ScannerName contains a user readable identification */
    var ScannerName: String
  }
  object ScannerContext {
    
    inline def apply(InternalData: Double, ScannerName: String): ScannerContext = {
      val __obj = js.Dynamic.literal(InternalData = InternalData.asInstanceOf[js.Any], ScannerName = ScannerName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannerContext]
    }
    
    extension [Self <: ScannerContext](x: Self) {
      
      inline def setInternalData(value: Double): Self = StObject.set(x, "InternalData", value.asInstanceOf[js.Any])
      
      inline def setScannerName(value: String): Self = StObject.set(x, "ScannerName", value.asInstanceOf[js.Any])
    }
  }
  
  /** A {@link ScannerException} gets thrown if an object of type {@link XScannerManager} could not complete a specific action. */
  trait ScannerException
    extends StObject
       with Exception {
    
    /** Error: contains the specific reason for failure */
    var Error: ScanError
  }
  object ScannerException {
    
    inline def apply(Context: XInterface, Error: ScanError, Message: String): ScannerException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Error = Error.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScannerException]
    }
    
    extension [Self <: ScannerException](x: Self) {
      
      inline def setError(value: ScanError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    }
  }
  
  /** {@link ScannerManager} provides a simple method to access scanner devices (or other image producing devices) */
  type ScannerManager = XScannerManager2
  
  trait XScannerManager
    extends StObject
       with XInterface {
    
    /** returns all available scanner devices */
    val AvailableScanners: SafeArray[ScannerContext]
    
    /** produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it returns FALSE if user cancelled this process */
    def configureScanner(scannerContext: js.Array[ScannerContext]): Boolean
    
    /** returns all available scanner devices */
    def getAvailableScanners(): SafeArray[ScannerContext]
    
    /** get the image after completion of scan */
    def getBitmap(scannerContext: ScannerContext): XBitmap
    
    /** get the state of scanning after completion of scan */
    def getError(scannerContext: ScannerContext): ScanError
    
    /**
      * start the scanning process listener will be called when scan is complete the EventObject of the disposing call will contain the {@link ScannerManager}
      * if the scan was successful, an empty interface otherwise
      */
    def startScan(scannerContext: ScannerContext, listener: XEventListener): Unit
  }
  object XScannerManager {
    
    inline def apply(
      AvailableScanners: SafeArray[ScannerContext],
      acquire: Callback,
      configureScanner: js.Array[ScannerContext] => Boolean,
      getAvailableScanners: CallbackTo[SafeArray[ScannerContext]],
      getBitmap: ScannerContext => XBitmap,
      getError: ScannerContext => ScanError,
      queryInterface: `type` => Any,
      release: Callback,
      startScan: (ScannerContext, XEventListener) => Callback
    ): XScannerManager = {
      val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = acquire.toJsFn, configureScanner = js.Any.fromFunction1(configureScanner), getAvailableScanners = getAvailableScanners.toJsFn, getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startScan = js.Any.fromFunction2((t0: ScannerContext, t1: XEventListener) => (startScan(t0, t1)).runNow()))
      __obj.asInstanceOf[XScannerManager]
    }
    
    extension [Self <: XScannerManager](x: Self) {
      
      inline def setAvailableScanners(value: SafeArray[ScannerContext]): Self = StObject.set(x, "AvailableScanners", value.asInstanceOf[js.Any])
      
      inline def setConfigureScanner(value: js.Array[ScannerContext] => Boolean): Self = StObject.set(x, "configureScanner", js.Any.fromFunction1(value))
      
      inline def setGetAvailableScanners(value: CallbackTo[SafeArray[ScannerContext]]): Self = StObject.set(x, "getAvailableScanners", value.toJsFn)
      
      inline def setGetBitmap(value: ScannerContext => XBitmap): Self = StObject.set(x, "getBitmap", js.Any.fromFunction1(value))
      
      inline def setGetError(value: ScannerContext => ScanError): Self = StObject.set(x, "getError", js.Any.fromFunction1(value))
      
      inline def setStartScan(value: (ScannerContext, XEventListener) => Callback): Self = StObject.set(x, "startScan", js.Any.fromFunction2((t0: ScannerContext, t1: XEventListener) => (value(t0, t1)).runNow()))
    }
  }
  
  /**
    * Extension of {@link XScannerManager} .
    * @since LibreOffice 3.5
    */
  trait XScannerManager2
    extends StObject
       with XScannerManager {
    
    /**
      * produce some kind of User Interface to let the user have a preview, configure the scan area, etc., it, and scan it returns FALSE if user cancelled
      * this process
      */
    def configureScannerAndScan(scannerContext: js.Array[ScannerContext], listener: XEventListener): Boolean
  }
  object XScannerManager2 {
    
    inline def apply(
      AvailableScanners: SafeArray[ScannerContext],
      acquire: Callback,
      configureScanner: js.Array[ScannerContext] => Boolean,
      configureScannerAndScan: (js.Array[ScannerContext], XEventListener) => Boolean,
      getAvailableScanners: CallbackTo[SafeArray[ScannerContext]],
      getBitmap: ScannerContext => XBitmap,
      getError: ScannerContext => ScanError,
      queryInterface: `type` => Any,
      release: Callback,
      startScan: (ScannerContext, XEventListener) => Callback
    ): XScannerManager2 = {
      val __obj = js.Dynamic.literal(AvailableScanners = AvailableScanners.asInstanceOf[js.Any], acquire = acquire.toJsFn, configureScanner = js.Any.fromFunction1(configureScanner), configureScannerAndScan = js.Any.fromFunction2(configureScannerAndScan), getAvailableScanners = getAvailableScanners.toJsFn, getBitmap = js.Any.fromFunction1(getBitmap), getError = js.Any.fromFunction1(getError), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, startScan = js.Any.fromFunction2((t0: ScannerContext, t1: XEventListener) => (startScan(t0, t1)).runNow()))
      __obj.asInstanceOf[XScannerManager2]
    }
    
    extension [Self <: XScannerManager2](x: Self) {
      
      inline def setConfigureScannerAndScan(value: (js.Array[ScannerContext], XEventListener) => Boolean): Self = StObject.set(x, "configureScannerAndScan", js.Any.fromFunction2(value))
    }
  }
}
