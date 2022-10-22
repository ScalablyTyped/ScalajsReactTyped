package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelUpdatedData extends StObject {
  
  var details: LevelDetails
  
  var level: Double
}
object LevelUpdatedData {
  
  inline def apply(details: LevelDetails, level: Double): LevelUpdatedData = {
    val __obj = js.Dynamic.literal(details = details.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[LevelUpdatedData]
  }
  
  extension [Self <: LevelUpdatedData](x: Self) {
    
    inline def setDetails(value: LevelDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
  }
}
