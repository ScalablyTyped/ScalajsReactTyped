package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardObject extends StObject {
  
  /** Gets the Dashboard object that contains this object. */
  def getDashboard(): Dashboard
  
  /**
    * Gets what the object represents, which is an enum with the following values:
    * BLANK, WORKSHEET, QUICK_FILTER, PARAMETER_CONTROL, PAGE_FILTER, LEGEND, TITLE, TEXT, IMAGE, WEB_PAGE.
    */
  def getObjectType(): DashboardObjectType
  
  /** Gets the coordinates relative to the top-left corner of the dashboard of the object. */
  def getPosition(): Point
  
  /** Gets the size of the object. */
  def getSize(): Size
  
  /** If getType() returns WORKSHEET, this contains a pointer to the Worksheet object. */
  def getWorksheet(): Worksheet
}
object DashboardObject {
  
  inline def apply(
    getDashboard: CallbackTo[Dashboard],
    getObjectType: CallbackTo[DashboardObjectType],
    getPosition: CallbackTo[Point],
    getSize: CallbackTo[Size],
    getWorksheet: CallbackTo[Worksheet]
  ): DashboardObject = {
    val __obj = js.Dynamic.literal(getDashboard = getDashboard.toJsFn, getObjectType = getObjectType.toJsFn, getPosition = getPosition.toJsFn, getSize = getSize.toJsFn, getWorksheet = getWorksheet.toJsFn)
    __obj.asInstanceOf[DashboardObject]
  }
  
  extension [Self <: DashboardObject](x: Self) {
    
    inline def setGetDashboard(value: CallbackTo[Dashboard]): Self = StObject.set(x, "getDashboard", value.toJsFn)
    
    inline def setGetObjectType(value: CallbackTo[DashboardObjectType]): Self = StObject.set(x, "getObjectType", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[Point]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
    
    inline def setGetWorksheet(value: CallbackTo[Worksheet]): Self = StObject.set(x, "getWorksheet", value.toJsFn)
  }
}
