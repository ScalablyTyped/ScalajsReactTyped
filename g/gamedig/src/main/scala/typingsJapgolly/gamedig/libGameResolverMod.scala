package typingsJapgolly.gamedig

import japgolly.scalajs.react.Callback
import typingsJapgolly.gamedig.anon.Extra
import typingsJapgolly.gamedig.anon.Port
import typingsJapgolly.gamedig.mod.Type
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGameResolverMod {
  
  @JSImport("gamedig/lib/GameResolver", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with GameResolver {
    
    /* CompleteClass */
    var games: js.Array[Extra] = js.native
    
    /* CompleteClass */
    var gamesByKey: Map[Type, Extra] = js.native
    
    /* CompleteClass */
    override def lookup(`type`: Type): Port = js.native
    
    /* CompleteClass */
    override def printReadme(): Unit = js.native
  }
  
  trait GameResolver extends StObject {
    
    var games: js.Array[Extra]
    
    var gamesByKey: Map[Type, Extra]
    
    def lookup(`type`: Type): Port
    
    def printReadme(): Unit
  }
  object GameResolver {
    
    inline def apply(games: js.Array[Extra], gamesByKey: Map[Type, Extra], lookup: Type => Port, printReadme: Callback): GameResolver = {
      val __obj = js.Dynamic.literal(games = games.asInstanceOf[js.Any], gamesByKey = gamesByKey.asInstanceOf[js.Any], lookup = js.Any.fromFunction1(lookup), printReadme = printReadme.toJsFn)
      __obj.asInstanceOf[GameResolver]
    }
    
    extension [Self <: GameResolver](x: Self) {
      
      inline def setGames(value: js.Array[Extra]): Self = StObject.set(x, "games", value.asInstanceOf[js.Any])
      
      inline def setGamesByKey(value: Map[Type, Extra]): Self = StObject.set(x, "gamesByKey", value.asInstanceOf[js.Any])
      
      inline def setGamesVarargs(value: Extra*): Self = StObject.set(x, "games", js.Array(value*))
      
      inline def setLookup(value: Type => Port): Self = StObject.set(x, "lookup", js.Any.fromFunction1(value))
      
      inline def setPrintReadme(value: Callback): Self = StObject.set(x, "printReadme", value.toJsFn)
    }
  }
}
