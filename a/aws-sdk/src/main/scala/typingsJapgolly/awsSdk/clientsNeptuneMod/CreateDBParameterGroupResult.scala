package typingsJapgolly.awsSdk.clientsNeptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBParameterGroupResult extends StObject {
  
  var DBParameterGroup: js.UndefOr[typingsJapgolly.awsSdk.clientsNeptuneMod.DBParameterGroup] = js.undefined
}
object CreateDBParameterGroupResult {
  
  inline def apply(): CreateDBParameterGroupResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDBParameterGroupResult]
  }
  
  extension [Self <: CreateDBParameterGroupResult](x: Self) {
    
    inline def setDBParameterGroup(value: DBParameterGroup): Self = StObject.set(x, "DBParameterGroup", value.asInstanceOf[js.Any])
    
    inline def setDBParameterGroupUndefined: Self = StObject.set(x, "DBParameterGroup", js.undefined)
  }
}
