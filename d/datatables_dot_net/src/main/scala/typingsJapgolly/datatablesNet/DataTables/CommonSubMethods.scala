package typingsJapgolly.datatablesNet.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion "util-methods"
trait CommonSubMethods extends StObject {
  
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: String): Api
}
object CommonSubMethods {
  
  inline def apply(cache: String => Api): CommonSubMethods = {
    val __obj = js.Dynamic.literal(cache = js.Any.fromFunction1(cache))
    __obj.asInstanceOf[CommonSubMethods]
  }
  
  extension [Self <: CommonSubMethods](x: Self) {
    
    inline def setCache(value: String => Api): Self = StObject.set(x, "cache", js.Any.fromFunction1(value))
  }
}
