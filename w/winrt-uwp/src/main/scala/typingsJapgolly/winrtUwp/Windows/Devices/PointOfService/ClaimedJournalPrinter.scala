package typingsJapgolly.winrtUwp.Windows.Devices.PointOfService

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a journal printer station that has been claimed for use. */
trait ClaimedJournalPrinter extends StObject {
  
  /** Gets or sets the number of characters per line for the journal printer station. */
  var charactersPerLine: Double
  
  /** Gets or sets the color cartridge that the journal printer station should use when it prints. This property must agree with what is available through ColorCartridgeCapabilities . */
  var colorCartridge: PosPrinterColorCartridge
  
  /**
    * Creates a new print job for the journal printer station.
    * @return The new print job for the journal printer station.
    */
  def createJob(): JournalPrintJob
  
  /** Gets whether the printer cartridge for the journal printer station is empty. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isCartridgeEmpty: Boolean
  
  /** Gets whether the cartridge for journal printer station has been removed. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isCartridgeRemoved: Boolean
  
  /** Gets whether the printer cover for the journal printer station is open. */
  var isCoverOpen: Boolean
  
  /** Gets whether the head for the journal printer station is currently cleaning. */
  var isHeadCleaning: Boolean
  
  /** Gets or sets whether the journal printer station prints with high quality or high speed. Note, this may throw an exception if the corresponding sensor is not available on the printer. */
  var isLetterQuality: Boolean
  
  /** Gets whether the paper is empty for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isPaperEmpty: Boolean
  
  /** Gets whether the printer paper is near the end for the journal printer station. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isPaperNearEnd: Boolean
  
  /** Gets whether the journal printer station is ready to print. Note, this may throw an exception if the corresponding sensor is not available on the printer. See JournalPrinterCapabilities to verify sensor availability. */
  var isReadyToPrint: Boolean
  
  /** Gets or sets the current height of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineHeight: Double
  
  /** Gets or sets the spacing of each single-high print line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. This spacing includes both the height of printed line and of the white space between each pair of lines. */
  var lineSpacing: Double
  
  /** Gets the current width of the printed line for the journal printer station, in the units that the ClaimedPosPrinter.MapMode property specifies. */
  var lineWidth: Double
  
  /**
    * Determines if a JournalPrintJob can successfully execute a print instruction with the specified data.
    * @param data The data sequence that you want to validate before you use it with the JournalPrintJob.Print method. This sequence may include printable data and escape sequences.
    * @return True if the data passes validation; otherwise false.
    */
  def validateData(data: String): Boolean
}
object ClaimedJournalPrinter {
  
  inline def apply(
    charactersPerLine: Double,
    colorCartridge: PosPrinterColorCartridge,
    createJob: CallbackTo[JournalPrintJob],
    isCartridgeEmpty: Boolean,
    isCartridgeRemoved: Boolean,
    isCoverOpen: Boolean,
    isHeadCleaning: Boolean,
    isLetterQuality: Boolean,
    isPaperEmpty: Boolean,
    isPaperNearEnd: Boolean,
    isReadyToPrint: Boolean,
    lineHeight: Double,
    lineSpacing: Double,
    lineWidth: Double,
    validateData: String => Boolean
  ): ClaimedJournalPrinter = {
    val __obj = js.Dynamic.literal(charactersPerLine = charactersPerLine.asInstanceOf[js.Any], colorCartridge = colorCartridge.asInstanceOf[js.Any], createJob = createJob.toJsFn, isCartridgeEmpty = isCartridgeEmpty.asInstanceOf[js.Any], isCartridgeRemoved = isCartridgeRemoved.asInstanceOf[js.Any], isCoverOpen = isCoverOpen.asInstanceOf[js.Any], isHeadCleaning = isHeadCleaning.asInstanceOf[js.Any], isLetterQuality = isLetterQuality.asInstanceOf[js.Any], isPaperEmpty = isPaperEmpty.asInstanceOf[js.Any], isPaperNearEnd = isPaperNearEnd.asInstanceOf[js.Any], isReadyToPrint = isReadyToPrint.asInstanceOf[js.Any], lineHeight = lineHeight.asInstanceOf[js.Any], lineSpacing = lineSpacing.asInstanceOf[js.Any], lineWidth = lineWidth.asInstanceOf[js.Any], validateData = js.Any.fromFunction1(validateData))
    __obj.asInstanceOf[ClaimedJournalPrinter]
  }
  
  extension [Self <: ClaimedJournalPrinter](x: Self) {
    
    inline def setCharactersPerLine(value: Double): Self = StObject.set(x, "charactersPerLine", value.asInstanceOf[js.Any])
    
    inline def setColorCartridge(value: PosPrinterColorCartridge): Self = StObject.set(x, "colorCartridge", value.asInstanceOf[js.Any])
    
    inline def setCreateJob(value: CallbackTo[JournalPrintJob]): Self = StObject.set(x, "createJob", value.toJsFn)
    
    inline def setIsCartridgeEmpty(value: Boolean): Self = StObject.set(x, "isCartridgeEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsCartridgeRemoved(value: Boolean): Self = StObject.set(x, "isCartridgeRemoved", value.asInstanceOf[js.Any])
    
    inline def setIsCoverOpen(value: Boolean): Self = StObject.set(x, "isCoverOpen", value.asInstanceOf[js.Any])
    
    inline def setIsHeadCleaning(value: Boolean): Self = StObject.set(x, "isHeadCleaning", value.asInstanceOf[js.Any])
    
    inline def setIsLetterQuality(value: Boolean): Self = StObject.set(x, "isLetterQuality", value.asInstanceOf[js.Any])
    
    inline def setIsPaperEmpty(value: Boolean): Self = StObject.set(x, "isPaperEmpty", value.asInstanceOf[js.Any])
    
    inline def setIsPaperNearEnd(value: Boolean): Self = StObject.set(x, "isPaperNearEnd", value.asInstanceOf[js.Any])
    
    inline def setIsReadyToPrint(value: Boolean): Self = StObject.set(x, "isReadyToPrint", value.asInstanceOf[js.Any])
    
    inline def setLineHeight(value: Double): Self = StObject.set(x, "lineHeight", value.asInstanceOf[js.Any])
    
    inline def setLineSpacing(value: Double): Self = StObject.set(x, "lineSpacing", value.asInstanceOf[js.Any])
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setValidateData(value: String => Boolean): Self = StObject.set(x, "validateData", js.Any.fromFunction1(value))
  }
}
