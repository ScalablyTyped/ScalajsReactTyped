package typingsJapgolly.tableau.tableau

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  /** Gets an array of Fields associated with the DataSource. */
  def getFields(): js.Array[Field]
  
  /** Indicates whether this DataSource is a primary or a secondary data source. */
  def getIsPrimary(): Boolean
  
  /** The name of the DataSource as seen in the UI. */
  def getName(): String
}
object DataSource {
  
  inline def apply(
    getFields: CallbackTo[js.Array[Field]],
    getIsPrimary: CallbackTo[Boolean],
    getName: CallbackTo[String]
  ): DataSource = {
    val __obj = js.Dynamic.literal(getFields = getFields.toJsFn, getIsPrimary = getIsPrimary.toJsFn, getName = getName.toJsFn)
    __obj.asInstanceOf[DataSource]
  }
  
  extension [Self <: DataSource](x: Self) {
    
    inline def setGetFields(value: CallbackTo[js.Array[Field]]): Self = StObject.set(x, "getFields", value.toJsFn)
    
    inline def setGetIsPrimary(value: CallbackTo[Boolean]): Self = StObject.set(x, "getIsPrimary", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
  }
}
