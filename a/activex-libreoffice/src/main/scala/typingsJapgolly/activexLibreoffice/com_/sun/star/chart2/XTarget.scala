package typingsJapgolly.activexLibreoffice.com_.sun.star.chart2

import japgolly.scalajs.react.Callback
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XTarget
  extends StObject
     with XInterface {
  
  def addDrawElement(): Unit
}
object XTarget {
  
  inline def apply(acquire: Callback, addDrawElement: Callback, queryInterface: `type` => Any, release: Callback): XTarget = {
    val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addDrawElement = addDrawElement.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XTarget]
  }
  
  extension [Self <: XTarget](x: Self) {
    
    inline def setAddDrawElement(value: Callback): Self = StObject.set(x, "addDrawElement", value.toJsFn)
  }
}
