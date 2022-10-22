package typingsJapgolly.devtoolsProtocol.mod.Protocol.IndexedDB

import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.array
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.date
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.number
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  /**
    * Array value.
    */
  var array: js.UndefOr[js.Array[Key]] = js.undefined
  
  /**
    * Date value.
    */
  var date: js.UndefOr[Double] = js.undefined
  
  /**
    * Number value.
    */
  var number: js.UndefOr[Double] = js.undefined
  
  /**
    * String value.
    */
  var string: js.UndefOr[String] = js.undefined
  
  /**
    * Key type. (KeyType enum)
    */
  var `type`: number | string | date | array
}
object Key {
  
  inline def apply(`type`: number | string | date | array): Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setArray(value: js.Array[Key]): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
    
    inline def setArrayUndefined: Self = StObject.set(x, "array", js.undefined)
    
    inline def setArrayVarargs(value: Key*): Self = StObject.set(x, "array", js.Array(value*))
    
    inline def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setStringUndefined: Self = StObject.set(x, "string", js.undefined)
    
    inline def setType(value: number | string | date | array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
