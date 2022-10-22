package typingsJapgolly.activexLibreoffice.com_.sun.star.frame

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.awt.Rectangle
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** allows to retrieve information about controller's border. */
trait XControllerBorder
  extends StObject
     with XInterface {
  
  /**
    * allows to get current border sizes of the document.
    * @returns representing the sizes of border
    */
  val Border: BorderWidths
  
  /** adds the specified listener to receive events about controller's border resizing. */
  def addBorderResizeListener(xListener: XBorderResizeListener): Unit
  
  /**
    * allows to get current border sizes of the document.
    * @returns representing the sizes of border
    */
  def getBorder(): BorderWidths
  
  /**
    * allows to get suggestion for resizing of object area surrounded by the border.
    *
    * If the view is going to be resized/moved this method can be used to get suggested object area. Pixels are used as units.
    * @returns suggestion for the resizing
    */
  def queryBorderedArea(aPreliminaryRectangle: Rectangle): Rectangle
  
  /** removes the specified listener. */
  def removeBorderResizeListener(xListener: XBorderResizeListener): Unit
}
object XControllerBorder {
  
  inline def apply(
    Border: BorderWidths,
    acquire: Callback,
    addBorderResizeListener: XBorderResizeListener => Callback,
    getBorder: CallbackTo[BorderWidths],
    queryBorderedArea: Rectangle => Rectangle,
    queryInterface: `type` => Any,
    release: Callback,
    removeBorderResizeListener: XBorderResizeListener => Callback
  ): XControllerBorder = {
    val __obj = js.Dynamic.literal(Border = Border.asInstanceOf[js.Any], acquire = acquire.toJsFn, addBorderResizeListener = js.Any.fromFunction1((t0: XBorderResizeListener) => addBorderResizeListener(t0).runNow()), getBorder = getBorder.toJsFn, queryBorderedArea = js.Any.fromFunction1(queryBorderedArea), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeBorderResizeListener = js.Any.fromFunction1((t0: XBorderResizeListener) => removeBorderResizeListener(t0).runNow()))
    __obj.asInstanceOf[XControllerBorder]
  }
  
  extension [Self <: XControllerBorder](x: Self) {
    
    inline def setAddBorderResizeListener(value: XBorderResizeListener => Callback): Self = StObject.set(x, "addBorderResizeListener", js.Any.fromFunction1((t0: XBorderResizeListener) => value(t0).runNow()))
    
    inline def setBorder(value: BorderWidths): Self = StObject.set(x, "Border", value.asInstanceOf[js.Any])
    
    inline def setGetBorder(value: CallbackTo[BorderWidths]): Self = StObject.set(x, "getBorder", value.toJsFn)
    
    inline def setQueryBorderedArea(value: Rectangle => Rectangle): Self = StObject.set(x, "queryBorderedArea", js.Any.fromFunction1(value))
    
    inline def setRemoveBorderResizeListener(value: XBorderResizeListener => Callback): Self = StObject.set(x, "removeBorderResizeListener", js.Any.fromFunction1((t0: XBorderResizeListener) => value(t0).runNow()))
  }
}
