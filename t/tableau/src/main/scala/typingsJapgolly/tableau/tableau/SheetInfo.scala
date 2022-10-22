package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Sheet Classes
trait SheetInfo extends StObject {
  
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  def getIndex(): Double
  
  /**
    * Gets a value indicating whether the sheet is the currently active sheet.Due to a technical limitation,
    * this will always return false if the object is a Worksheet instance that is part of a Dashboard.
    */
  def getIsActive(): Boolean
  
  /**
    * Gets a value indicating whether the sheet is hidden in the UI. Note that if the entire tab control is hidden,
    * it does not affect the state of this flag. This sheet may still report that it is visible even when the tabs control is hidden.
    */
  def getIsHidden(): Boolean
  
  /** Gets the name of the sheet. */
  def getName(): String
  
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET, DASHBOARD and STORY. */
  def getSheetType(): SheetType
  
  /** Gets the size information that the author specified when publishing the workbook. */
  def getSize(): SheetSizeOptions
  
  /** Gets the URL for this sheet. */
  def getUrl(): String
  
  /** Gets the Workbook to which this Sheet belongs. */
  def getWorkbook(): Workbook
}
object SheetInfo {
  
  inline def apply(
    getIndex: CallbackTo[Double],
    getIsActive: CallbackTo[Boolean],
    getIsHidden: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getSheetType: CallbackTo[SheetType],
    getSize: CallbackTo[SheetSizeOptions],
    getUrl: CallbackTo[String],
    getWorkbook: CallbackTo[Workbook]
  ): SheetInfo = {
    val __obj = js.Dynamic.literal(getIndex = getIndex.toJsFn, getIsActive = getIsActive.toJsFn, getIsHidden = getIsHidden.toJsFn, getName = getName.toJsFn, getSheetType = getSheetType.toJsFn, getSize = getSize.toJsFn, getUrl = getUrl.toJsFn, getWorkbook = getWorkbook.toJsFn)
    __obj.asInstanceOf[SheetInfo]
  }
  
  extension [Self <: SheetInfo](x: Self) {
    
    inline def setGetIndex(value: CallbackTo[Double]): Self = StObject.set(x, "getIndex", value.toJsFn)
    
    inline def setGetIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsActive", value.toJsFn)
    
    inline def setGetIsHidden(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsHidden", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetSheetType(value: CallbackTo[SheetType]): Self = StObject.set(x, "getSheetType", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[SheetSizeOptions]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGetUrl(value: CallbackTo[String]): Self = StObject.set(x, "getUrl", value.toJsFn)
    
    inline def setGetWorkbook(value: CallbackTo[Workbook]): Self = StObject.set(x, "getWorkbook", value.toJsFn)
  }
}
