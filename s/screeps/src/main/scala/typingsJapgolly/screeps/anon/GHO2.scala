package typingsJapgolly.screeps.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GHO2 extends StObject {
  
  var GHO2: `33`
  
  var GO: Damage
  
  var XGHO2: `34`
}
object GHO2 {
  
  inline def apply(GHO2: `33`, GO: Damage, XGHO2: `34`): GHO2 = {
    val __obj = js.Dynamic.literal(GHO2 = GHO2.asInstanceOf[js.Any], GO = GO.asInstanceOf[js.Any], XGHO2 = XGHO2.asInstanceOf[js.Any])
    __obj.asInstanceOf[GHO2]
  }
  
  extension [Self <: GHO2](x: Self) {
    
    inline def setGHO2(value: `33`): Self = StObject.set(x, "GHO2", value.asInstanceOf[js.Any])
    
    inline def setGO(value: Damage): Self = StObject.set(x, "GO", value.asInstanceOf[js.Any])
    
    inline def setXGHO2(value: `34`): Self = StObject.set(x, "XGHO2", value.asInstanceOf[js.Any])
  }
}
