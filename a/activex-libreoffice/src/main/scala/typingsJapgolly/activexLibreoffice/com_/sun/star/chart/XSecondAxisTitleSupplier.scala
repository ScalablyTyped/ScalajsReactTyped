package typingsJapgolly.activexLibreoffice.com_.sun.star.chart

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.drawing.XShape
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XSecondAxisTitleSupplier
  extends StObject
     with XInterface {
  
  val SecondXAxisTitle: XShape
  
  val SecondYAxisTitle: XShape
  
  def getSecondXAxisTitle(): XShape
  
  def getSecondYAxisTitle(): XShape
}
object XSecondAxisTitleSupplier {
  
  inline def apply(
    SecondXAxisTitle: XShape,
    SecondYAxisTitle: XShape,
    acquire: Callback,
    getSecondXAxisTitle: CallbackTo[XShape],
    getSecondYAxisTitle: CallbackTo[XShape],
    queryInterface: `type` => Any,
    release: Callback
  ): XSecondAxisTitleSupplier = {
    val __obj = js.Dynamic.literal(SecondXAxisTitle = SecondXAxisTitle.asInstanceOf[js.Any], SecondYAxisTitle = SecondYAxisTitle.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSecondXAxisTitle = getSecondXAxisTitle.toJsFn, getSecondYAxisTitle = getSecondYAxisTitle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XSecondAxisTitleSupplier]
  }
  
  extension [Self <: XSecondAxisTitleSupplier](x: Self) {
    
    inline def setGetSecondXAxisTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getSecondXAxisTitle", value.toJsFn)
    
    inline def setGetSecondYAxisTitle(value: CallbackTo[XShape]): Self = StObject.set(x, "getSecondYAxisTitle", value.toJsFn)
    
    inline def setSecondXAxisTitle(value: XShape): Self = StObject.set(x, "SecondXAxisTitle", value.asInstanceOf[js.Any])
    
    inline def setSecondYAxisTitle(value: XShape): Self = StObject.set(x, "SecondYAxisTitle", value.asInstanceOf[js.Any])
  }
}
