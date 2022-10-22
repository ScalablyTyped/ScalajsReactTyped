package typingsJapgolly.activexLibreoffice.com_.sun.star.style

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XStyleSupplier
  extends StObject
     with XInterface {
  
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  var Style: XStyle
  
  /**
    * get the currently set style.
    * @returns the style. If no style was set, the returned object may be empty (null). Otherwise, the returned object must support the service PropertyTemplate.
    */
  def getStyle(): XStyle
  
  /** @param xStyle If you want to remove an existing style, you can set an empty (null) object. Otherwise, the object given must support the service Property */
  def setStyle(xStyle: XStyle): Unit
}
object XStyleSupplier {
  
  inline def apply(
    Style: XStyle,
    acquire: Callback,
    getStyle: CallbackTo[XStyle],
    queryInterface: `type` => Any,
    release: Callback,
    setStyle: XStyle => Callback
  ): XStyleSupplier = {
    val __obj = js.Dynamic.literal(Style = Style.asInstanceOf[js.Any], acquire = acquire.toJsFn, getStyle = getStyle.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setStyle = js.Any.fromFunction1((t0: XStyle) => setStyle(t0).runNow()))
    __obj.asInstanceOf[XStyleSupplier]
  }
  
  extension [Self <: XStyleSupplier](x: Self) {
    
    inline def setGetStyle(value: CallbackTo[XStyle]): Self = StObject.set(x, "getStyle", value.toJsFn)
    
    inline def setSetStyle(value: XStyle => Callback): Self = StObject.set(x, "setStyle", js.Any.fromFunction1((t0: XStyle) => value(t0).runNow()))
    
    inline def setStyle(value: XStyle): Self = StObject.set(x, "Style", value.asInstanceOf[js.Any])
  }
}
