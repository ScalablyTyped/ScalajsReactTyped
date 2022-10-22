package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.table.CellAddress
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to query data of the annotation and to show and hide it.
  * @see com.sun.star.sheet.CellAnnotation
  */
trait XSheetAnnotation
  extends StObject
     with XInterface {
  
  /** returns the name of the user who last changed the annotation. */
  val Author: String
  
  /** returns a formatted string representing the date when the annotation was last changed. */
  val Date: String
  
  /** returns, whether the annotation is permanently visible. */
  var IsVisible: Boolean
  
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  val Position: CellAddress
  
  /** returns the name of the user who last changed the annotation. */
  def getAuthor(): String
  
  /** returns a formatted string representing the date when the annotation was last changed. */
  def getDate(): String
  
  /** returns, whether the annotation is permanently visible. */
  def getIsVisible(): Boolean
  
  /** returns the position of cell in the spreadsheet document that contains this annotation. */
  def getPosition(): CellAddress
  
  /** specifies whether the annotation is permanently visible. */
  def setIsVisible(bIsVisible: Boolean): Unit
}
object XSheetAnnotation {
  
  inline def apply(
    Author: String,
    Date: String,
    IsVisible: Boolean,
    Position: CellAddress,
    acquire: Callback,
    getAuthor: CallbackTo[String],
    getDate: CallbackTo[String],
    getIsVisible: CallbackTo[Boolean],
    getPosition: CallbackTo[CellAddress],
    queryInterface: `type` => Any,
    release: Callback,
    setIsVisible: Boolean => Callback
  ): XSheetAnnotation = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], Date = Date.asInstanceOf[js.Any], IsVisible = IsVisible.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAuthor = getAuthor.toJsFn, getDate = getDate.toJsFn, getIsVisible = getIsVisible.toJsFn, getPosition = getPosition.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setIsVisible = js.Any.fromFunction1((t0: Boolean) => setIsVisible(t0).runNow()))
    __obj.asInstanceOf[XSheetAnnotation]
  }
  
  extension [Self <: XSheetAnnotation](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setDate(value: String): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setGetAuthor(value: CallbackTo[String]): Self = StObject.set(x, "getAuthor", value.toJsFn)
    
    inline def setGetDate(value: CallbackTo[String]): Self = StObject.set(x, "getDate", value.toJsFn)
    
    inline def setGetIsVisible(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsVisible", value.toJsFn)
    
    inline def setGetPosition(value: CallbackTo[CellAddress]): Self = StObject.set(x, "getPosition", value.toJsFn)
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "IsVisible", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: CellAddress): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    
    inline def setSetIsVisible(value: Boolean => Callback): Self = StObject.set(x, "setIsVisible", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
  }
}
