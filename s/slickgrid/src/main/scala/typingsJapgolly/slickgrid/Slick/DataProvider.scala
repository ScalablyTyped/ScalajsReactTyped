package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataProvider[T /* <: SlickData */] extends StObject {
  
  /**
    * Returns the item at a given index.
    * @param index
    */
  def getItem(index: Double): T
  
  /**
    * Returns the metadata for the item at a given index (optional).
    * @param index
    */
  var getItemMetadata: js.UndefOr[js.Function1[/* index */ Double, RowMetadata[T]]] = js.undefined
  
  /**
    * Returns the number of data items in the set.
    */
  def getLength(): Double
}
object DataProvider {
  
  inline def apply[T /* <: SlickData */](getItem: Double => T, getLength: CallbackTo[Double]): DataProvider[T] = {
    val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), getLength = getLength.toJsFn)
    __obj.asInstanceOf[DataProvider[T]]
  }
  
  extension [Self <: DataProvider[?], T /* <: SlickData */](x: Self & DataProvider[T]) {
    
    inline def setGetItem(value: Double => T): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
    
    inline def setGetItemMetadata(value: /* index */ Double => RowMetadata[T]): Self = StObject.set(x, "getItemMetadata", js.Any.fromFunction1(value))
    
    inline def setGetItemMetadataUndefined: Self = StObject.set(x, "getItemMetadata", js.undefined)
    
    inline def setGetLength(value: CallbackTo[Double]): Self = StObject.set(x, "getLength", value.toJsFn)
  }
}
