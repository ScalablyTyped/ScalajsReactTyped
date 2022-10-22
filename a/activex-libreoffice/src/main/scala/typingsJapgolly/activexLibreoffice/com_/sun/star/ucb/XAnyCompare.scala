package typingsJapgolly.activexLibreoffice.com_.sun.star.ucb

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** compares two `any` s. */
trait XAnyCompare
  extends StObject
     with XInterface {
  
  /**
    * allows comparison of two `any` s.
    * @param Any1 is the first compare value
    * @param Any2 is the second compare value
    * @returns `-1` , if the first any is less than the second ( Any1 < Any2 )`0` , if the first any is equal to the second ( Any1 == Any2 )`+1` , if the first
    */
  def compare(Any1: Any, Any2: Any): Double
}
object XAnyCompare {
  
  inline def apply(acquire: Callback, compare: (Any, Any) => Double, queryInterface: `type` => Any, release: Callback): XAnyCompare = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, compare = js.Any.fromFunction2(compare), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAnyCompare]
  }
  
  extension [Self <: XAnyCompare](x: Self) {
    
    inline def setCompare(value: (Any, Any) => Double): Self = StObject.set(x, "compare", js.Any.fromFunction2(value))
  }
}
