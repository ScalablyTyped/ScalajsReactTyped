package typingsJapgolly.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveAliasOutput extends StObject {
  
  /**
    *  The Amazon Resource Name (ARN) associated with the GameLift fleet resource that this alias points to. 
    */
  var FleetArn: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.FleetArn] = js.undefined
  
  /**
    * The fleet identifier that the alias is pointing to.
    */
  var FleetId: js.UndefOr[typingsJapgolly.awsSdk.clientsGameliftMod.FleetId] = js.undefined
}
object ResolveAliasOutput {
  
  inline def apply(): ResolveAliasOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveAliasOutput]
  }
  
  extension [Self <: ResolveAliasOutput](x: Self) {
    
    inline def setFleetArn(value: FleetArn): Self = StObject.set(x, "FleetArn", value.asInstanceOf[js.Any])
    
    inline def setFleetArnUndefined: Self = StObject.set(x, "FleetArn", js.undefined)
    
    inline def setFleetId(value: FleetId): Self = StObject.set(x, "FleetId", value.asInstanceOf[js.Any])
    
    inline def setFleetIdUndefined: Self = StObject.set(x, "FleetId", js.undefined)
  }
}
