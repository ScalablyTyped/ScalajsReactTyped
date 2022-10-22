package typingsJapgolly.oakdexPokedex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Learnset extends StObject {
  
  var egg_move: js.UndefOr[Boolean] = js.undefined
  
  var level: js.UndefOr[Double] = js.undefined
  
  var move: String
  
  var tm: js.UndefOr[String] = js.undefined
  
  var variations: js.UndefOr[js.Array[String]] = js.undefined
}
object Learnset {
  
  inline def apply(move: String): Learnset = {
    val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any])
    __obj.asInstanceOf[Learnset]
  }
  
  extension [Self <: Learnset](x: Self) {
    
    inline def setEgg_move(value: Boolean): Self = StObject.set(x, "egg_move", value.asInstanceOf[js.Any])
    
    inline def setEgg_moveUndefined: Self = StObject.set(x, "egg_move", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMove(value: String): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setTm(value: String): Self = StObject.set(x, "tm", value.asInstanceOf[js.Any])
    
    inline def setTmUndefined: Self = StObject.set(x, "tm", js.undefined)
    
    inline def setVariations(value: js.Array[String]): Self = StObject.set(x, "variations", value.asInstanceOf[js.Any])
    
    inline def setVariationsUndefined: Self = StObject.set(x, "variations", js.undefined)
    
    inline def setVariationsVarargs(value: String*): Self = StObject.set(x, "variations", js.Array(value*))
  }
}
