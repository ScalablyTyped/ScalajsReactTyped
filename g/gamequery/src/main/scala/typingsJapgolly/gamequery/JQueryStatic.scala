package typingsJapgolly.gamequery

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var gQ: GameQuery
  
  var gameQuery: GameQuery
  
  def playground(): JQuery
}
object JQueryStatic {
  
  inline def apply(gQ: GameQuery, gameQuery: GameQuery, playground: CallbackTo[JQuery]): JQueryStatic = {
    val __obj = js.Dynamic.literal(gQ = gQ.asInstanceOf[js.Any], gameQuery = gameQuery.asInstanceOf[js.Any], playground = playground.toJsFn)
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setGQ(value: GameQuery): Self = StObject.set(x, "gQ", value.asInstanceOf[js.Any])
    
    inline def setGameQuery(value: GameQuery): Self = StObject.set(x, "gameQuery", value.asInstanceOf[js.Any])
    
    inline def setPlayground(value: CallbackTo[JQuery]): Self = StObject.set(x, "playground", value.toJsFn)
  }
}
