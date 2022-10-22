package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Interface to be implemented by objects that support having a title of type {@link XTitle} . */
trait XTitled
  extends StObject
     with XInterface {
  
  /** get the object holding the title's content and formatting */
  var TitleObject: XTitle
  
  /** get the object holding the title's content and formatting */
  def getTitleObject(): XTitle
  
  /** set a new title object replacing the former one */
  def setTitleObject(Title: XTitle): Unit
}
object XTitled {
  
  inline def apply(
    TitleObject: XTitle,
    acquire: Callback,
    getTitleObject: CallbackTo[XTitle],
    queryInterface: `type` => Any,
    release: Callback,
    setTitleObject: XTitle => Callback
  ): XTitled = {
    val __obj = js.Dynamic.literal(TitleObject = TitleObject.asInstanceOf[js.Any], acquire = acquire.toJsFn, getTitleObject = getTitleObject.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setTitleObject = js.Any.fromFunction1((t0: XTitle) => setTitleObject(t0).runNow()))
    __obj.asInstanceOf[XTitled]
  }
  
  extension [Self <: XTitled](x: Self) {
    
    inline def setGetTitleObject(value: CallbackTo[XTitle]): Self = StObject.set(x, "getTitleObject", value.toJsFn)
    
    inline def setSetTitleObject(value: XTitle => Callback): Self = StObject.set(x, "setTitleObject", js.Any.fromFunction1((t0: XTitle) => value(t0).runNow()))
    
    inline def setTitleObject(value: XTitle): Self = StObject.set(x, "TitleObject", value.asInstanceOf[js.Any])
  }
}
