package typingsJapgolly.azureMobileApps.Azure.MobileApps

import typingsJapgolly.azureMobileApps.Express.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// query
trait Query extends StObject {
  
  def create(tableName: String): QueryJs
  
  def fromRequest(req: Request): QueryJs
  
  def toOData(query: QueryJs): OData
}
object Query {
  
  inline def apply(create: String => QueryJs, fromRequest: Request => QueryJs, toOData: QueryJs => OData): Query = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), fromRequest = js.Any.fromFunction1(fromRequest), toOData = js.Any.fromFunction1(toOData))
    __obj.asInstanceOf[Query]
  }
  
  extension [Self <: Query](x: Self) {
    
    inline def setCreate(value: String => QueryJs): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
    
    inline def setFromRequest(value: Request => QueryJs): Self = StObject.set(x, "fromRequest", js.Any.fromFunction1(value))
    
    inline def setToOData(value: QueryJs => OData): Self = StObject.set(x, "toOData", js.Any.fromFunction1(value))
  }
}
