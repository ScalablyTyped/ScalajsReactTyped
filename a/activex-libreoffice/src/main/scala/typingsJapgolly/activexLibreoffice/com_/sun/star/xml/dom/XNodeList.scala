package typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XNodeList
  extends StObject
     with XInterface {
  
  /** The number of nodes in the list. */
  val Length: Double
  
  /** The number of nodes in the list. */
  def getLength(): Double
  
  /** Returns a node specified by index in the collection. */
  def item(index: Double): XNode
}
object XNodeList {
  
  inline def apply(
    Length: Double,
    acquire: Callback,
    getLength: CallbackTo[Double],
    item: Double => XNode,
    queryInterface: `type` => Any,
    release: Callback
  ): XNodeList = {
    val __obj = js.Dynamic.literal(Length = Length.asInstanceOf[js.Any], acquire = acquire.toJsFn, getLength = getLength.toJsFn, item = js.Any.fromFunction1(item), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XNodeList]
  }
  
  extension [Self <: XNodeList](x: Self) {
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
    
    inline def setItem(value: Double => XNode): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    inline def setLength(value: Double): Self = StObject.set(x, "Length", value.asInstanceOf[js.Any])
  }
}
