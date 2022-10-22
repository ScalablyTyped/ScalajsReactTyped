package typingsJapgolly.devtoolsProtocol.mod.Protocol.IndexedDB

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataEntry extends StObject {
  
  /**
    * Key object.
    */
  var key: RemoteObject
  
  /**
    * Primary key object.
    */
  var primaryKey: RemoteObject
  
  /**
    * Value object.
    */
  var value: RemoteObject
}
object DataEntry {
  
  inline def apply(key: RemoteObject, primaryKey: RemoteObject, value: RemoteObject): DataEntry = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataEntry]
  }
  
  extension [Self <: DataEntry](x: Self) {
    
    inline def setKey(value: RemoteObject): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: RemoteObject): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
