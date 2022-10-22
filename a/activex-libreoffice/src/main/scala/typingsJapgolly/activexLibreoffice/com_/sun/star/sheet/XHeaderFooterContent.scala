package typingsJapgolly.activexLibreoffice.com_.sun.star.sheet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.text.XText
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to the text contents of a header or footer on a page.
  * @see com.sun.star.sheet.HeaderFooterContent
  * @see com.sun.star.sheet.TablePageStyle
  */
trait XHeaderFooterContent
  extends StObject
     with XInterface {
  
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val CenterText: XText
  
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val LeftText: XText
  
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  val RightText: XText
  
  /**
    * returns the text which is printed in the center part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getCenterText(): XText
  
  /**
    * returns the text which is printed in the left part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getLeftText(): XText
  
  /**
    * returns the text which is printed in the right part of the header or footer.
    * @see com.sun.star.text.Text
    */
  def getRightText(): XText
}
object XHeaderFooterContent {
  
  inline def apply(
    CenterText: XText,
    LeftText: XText,
    RightText: XText,
    acquire: Callback,
    getCenterText: CallbackTo[XText],
    getLeftText: CallbackTo[XText],
    getRightText: CallbackTo[XText],
    queryInterface: `type` => Any,
    release: Callback
  ): XHeaderFooterContent = {
    val __obj = js.Dynamic.literal(CenterText = CenterText.asInstanceOf[js.Any], LeftText = LeftText.asInstanceOf[js.Any], RightText = RightText.asInstanceOf[js.Any], acquire = acquire.toJsFn, getCenterText = getCenterText.toJsFn, getLeftText = getLeftText.toJsFn, getRightText = getRightText.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XHeaderFooterContent]
  }
  
  extension [Self <: XHeaderFooterContent](x: Self) {
    
    inline def setCenterText(value: XText): Self = StObject.set(x, "CenterText", value.asInstanceOf[js.Any])
    
    inline def setGetCenterText(value: CallbackTo[XText]): Self = StObject.set(x, "getCenterText", value.toJsFn)
    
    inline def setGetLeftText(value: CallbackTo[XText]): Self = StObject.set(x, "getLeftText", value.toJsFn)
    
    inline def setGetRightText(value: CallbackTo[XText]): Self = StObject.set(x, "getRightText", value.toJsFn)
    
    inline def setLeftText(value: XText): Self = StObject.set(x, "LeftText", value.asInstanceOf[js.Any])
    
    inline def setRightText(value: XText): Self = StObject.set(x, "RightText", value.asInstanceOf[js.Any])
  }
}
