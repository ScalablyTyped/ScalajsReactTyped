package typingsJapgolly.maximMazurokGapiClientGames.gapi.client.games

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GamesAchievementSetStepsAtLeast extends StObject {
  
  /** Uniquely identifies the type of this resource. Value is always the fixed string `games#GamesAchievementSetStepsAtLeast`. */
  var kind: js.UndefOr[String] = js.undefined
  
  /** The minimum number of steps for the achievement to be set to. */
  var steps: js.UndefOr[Double] = js.undefined
}
object GamesAchievementSetStepsAtLeast {
  
  inline def apply(): GamesAchievementSetStepsAtLeast = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GamesAchievementSetStepsAtLeast]
  }
  
  extension [Self <: GamesAchievementSetStepsAtLeast](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setSteps(value: Double): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
  }
}
