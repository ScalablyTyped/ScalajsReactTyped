package typingsJapgolly.hlsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelControllerConfig extends StObject {
  
  var startLevel: js.UndefOr[Double] = js.undefined
}
object LevelControllerConfig {
  
  inline def apply(): LevelControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LevelControllerConfig]
  }
  
  extension [Self <: LevelControllerConfig](x: Self) {
    
    inline def setStartLevel(value: Double): Self = StObject.set(x, "startLevel", value.asInstanceOf[js.Any])
    
    inline def setStartLevelUndefined: Self = StObject.set(x, "startLevel", js.undefined)
  }
}
