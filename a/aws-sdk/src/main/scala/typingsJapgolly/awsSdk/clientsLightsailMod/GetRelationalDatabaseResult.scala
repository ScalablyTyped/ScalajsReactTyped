package typingsJapgolly.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRelationalDatabaseResult extends StObject {
  
  /**
    * An object describing the specified database.
    */
  var relationalDatabase: js.UndefOr[RelationalDatabase] = js.undefined
}
object GetRelationalDatabaseResult {
  
  inline def apply(): GetRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRelationalDatabaseResult]
  }
  
  extension [Self <: GetRelationalDatabaseResult](x: Self) {
    
    inline def setRelationalDatabase(value: RelationalDatabase): Self = StObject.set(x, "relationalDatabase", value.asInstanceOf[js.Any])
    
    inline def setRelationalDatabaseUndefined: Self = StObject.set(x, "relationalDatabase", js.undefined)
  }
}
