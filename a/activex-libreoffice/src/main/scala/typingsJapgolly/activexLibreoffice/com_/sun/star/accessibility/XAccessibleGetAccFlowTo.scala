package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XAccessibleGetAccFlowTo
  extends StObject
     with XInterface {
  
  def getAccFlowTo(aXShape: Any, nType: Double): SafeArray[Any]
}
object XAccessibleGetAccFlowTo {
  
  inline def apply(
    acquire: Callback,
    getAccFlowTo: (Any, Double) => SafeArray[Any],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, getAccFlowTo = js.Any.fromFunction2(getAccFlowTo), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
  
  extension [Self <: XAccessibleGetAccFlowTo](x: Self) {
    
    inline def setGetAccFlowTo(value: (Any, Double) => SafeArray[Any]): Self = StObject.set(x, "getAccFlowTo", js.Any.fromFunction2(value))
  }
}
