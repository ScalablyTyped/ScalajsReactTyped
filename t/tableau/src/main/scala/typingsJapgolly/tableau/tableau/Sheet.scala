package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Sheet extends StObject {
  
  /**
    * Sets the size information on a sheet. Note that if the sheet is a Worksheet,
    * only SheetSizeBehavior.AUTOMATIC is allowed since you can’t actually set a Worksheet to a fixed size.
    */
  def changeSizeAsync(options: SheetSizeOptions): js.Promise[SheetSizeOptions]
  
  /** Gets the index of the sheet within the published tabs. Note that hidden tabs are still counted in the ordering, as long as they are published. */
  def getIndex(): Double
  
  /** Gets a value indicating whether the sheet is the currently active sheet. */
  def getIsActive(): Boolean
  
  /**
    * Gets a value indicating whether the sheet is hidden in the UI.
    * Note that if the entire tab control is hidden, it does not affect the state of this flag.
    * This sheet may still report that it is visible even when the tabs control is hidden.
    */
  def getIsHidden(): Boolean
  
  /** Gets the name of the sheet. */
  def getName(): String
  
  /** Gets the type of the sheet. SheetType is an enum with the following values: WORKSHEET , DASHBOARD and STORY. */
  def getSheetType(): SheetType
  
  /** Gets the size information that the author specified when publishing the workbook. */
  def getSize(): SheetSizeOptions
  
  /** Gets the URL for this sheet. */
  def getUrl(): String
  
  /** Gets the Workbook to which this Sheet belongs. */
  def getWorkbook(): Workbook
}
object Sheet {
  
  inline def apply(
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getIndex: CallbackTo[Double],
    getIsActive: CallbackTo[Boolean],
    getIsHidden: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getSheetType: CallbackTo[SheetType],
    getSize: CallbackTo[SheetSizeOptions],
    getUrl: CallbackTo[String],
    getWorkbook: CallbackTo[Workbook]
  ): Sheet = {
    val __obj = js.Dynamic.literal(changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getIndex = getIndex.toJsFn, getIsActive = getIsActive.toJsFn, getIsHidden = getIsHidden.toJsFn, getName = getName.toJsFn, getSheetType = getSheetType.toJsFn, getSize = getSize.toJsFn, getUrl = getUrl.toJsFn, getWorkbook = getWorkbook.toJsFn)
    __obj.asInstanceOf[Sheet]
  }
  
  extension [Self <: Sheet](x: Self) {
    
    inline def setChangeSizeAsync(value: SheetSizeOptions => js.Promise[SheetSizeOptions]): Self = StObject.set(x, "changeSizeAsync", js.Any.fromFunction1(value))
    
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
