package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Dashboard
  extends StObject
     with Sheet {
  
  /** Gets the collection of objects. */
  def getObjects(): js.Array[DashboardObject]
  
  /**
    * Returns the StoryPoint object to which this Dashboard belongs (if it’s on a story sheet).
    * Otherwise, it returns null.
    * If the Dashboard instance does not come from a call to StoryPoint.getContainedSheet(), it also returns null.
    */
  def getParentStoryPoint(): StoryPoint
  
  /**
    * Gets the collection of worksheets contained in the dashboard.
    * Note that this is a helper method and is equivalent to looping through getObjects() and collecting all of
    * the DashboardObject.Worksheet pointers when DashboardObject.getType() === tableau.DashboardObjectType.WORKSHEET.
    */
  def getWorksheets(): js.Array[Worksheet]
}
object Dashboard {
  
  inline def apply(
    changeSizeAsync: SheetSizeOptions => js.Promise[SheetSizeOptions],
    getIndex: CallbackTo[Double],
    getIsActive: CallbackTo[Boolean],
    getIsHidden: CallbackTo[Boolean],
    getName: CallbackTo[String],
    getObjects: CallbackTo[js.Array[DashboardObject]],
    getParentStoryPoint: CallbackTo[StoryPoint],
    getSheetType: CallbackTo[SheetType],
    getSize: CallbackTo[SheetSizeOptions],
    getUrl: CallbackTo[String],
    getWorkbook: CallbackTo[Workbook],
    getWorksheets: CallbackTo[js.Array[Worksheet]]
  ): Dashboard = {
    val __obj = js.Dynamic.literal(changeSizeAsync = js.Any.fromFunction1(changeSizeAsync), getIndex = getIndex.toJsFn, getIsActive = getIsActive.toJsFn, getIsHidden = getIsHidden.toJsFn, getName = getName.toJsFn, getObjects = getObjects.toJsFn, getParentStoryPoint = getParentStoryPoint.toJsFn, getSheetType = getSheetType.toJsFn, getSize = getSize.toJsFn, getUrl = getUrl.toJsFn, getWorkbook = getWorkbook.toJsFn, getWorksheets = getWorksheets.toJsFn)
    __obj.asInstanceOf[Dashboard]
  }
  
  extension [Self <: Dashboard](x: Self) {
    
    inline def setGetObjects(value: CallbackTo[js.Array[DashboardObject]]): Self = StObject.set(x, "getObjects", value.toJsFn)
    
    inline def setGetParentStoryPoint(value: CallbackTo[StoryPoint]): Self = StObject.set(x, "getParentStoryPoint", value.toJsFn)
    
    inline def setGetWorksheets(value: CallbackTo[js.Array[Worksheet]]): Self = StObject.set(x, "getWorksheets", value.toJsFn)
  }
}
