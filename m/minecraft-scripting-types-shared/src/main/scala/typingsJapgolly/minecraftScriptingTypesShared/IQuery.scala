package typingsJapgolly.minecraftScriptingTypesShared

import typingsJapgolly.minecraftScriptingTypesShared.minecraftScriptingTypesSharedStrings.query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQuery
  extends StObject
     with _IMinecraftObject {
  
  /**
    * The type of the object
    */
  val __type__ : query
  
  /**
    * READ ONLY. This is the unique identifier of the query
    */
  val query_id: Double
}
object IQuery {
  
  inline def apply(query_id: Double): IQuery = {
    val __obj = js.Dynamic.literal(__type__ = "query", query_id = query_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQuery]
  }
  
  extension [Self <: IQuery](x: Self) {
    
    inline def setQuery_id(value: Double): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def set__type__(value: query): Self = StObject.set(x, "__type__", value.asInstanceOf[js.Any])
  }
}
