package typingsJapgolly.overwatchApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeroWins
  extends StObject
     with Hero {
  
  var games_won: String
}
object HeroWins {
  
  inline def apply(games_won: String, hero: String, img: String): HeroWins = {
    val __obj = js.Dynamic.literal(games_won = games_won.asInstanceOf[js.Any], hero = hero.asInstanceOf[js.Any], img = img.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeroWins]
  }
  
  extension [Self <: HeroWins](x: Self) {
    
    inline def setGames_won(value: String): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
  }
}
