package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleGroupPosition
  extends StObject
     with XInterface {
  
  def getGroupPosition(accoject: Any): SafeArray[Double]
  
  def getObjectLink(accoject: Any): String
}
object XAccessibleGroupPosition {
  
  inline def apply(
    acquire: Callback,
    getGroupPosition: Any => SafeArray[Double],
    getObjectLink: Any => String,
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleGroupPosition = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getGroupPosition = js.Any.fromFunction1(getGroupPosition), getObjectLink = js.Any.fromFunction1(getObjectLink), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleGroupPosition]
  }
  
  extension [Self <: XAccessibleGroupPosition](x: Self) {
    
    inline def setGetGroupPosition(value: Any => SafeArray[Double]): Self = StObject.set(x, "getGroupPosition", js.Any.fromFunction1(value))
    
    inline def setGetObjectLink(value: Any => String): Self = StObject.set(x, "getObjectLink", js.Any.fromFunction1(value))
  }
}
