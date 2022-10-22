package typingsJapgolly.metamaskUtils.anon

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LevelFive extends StObject {
  
  def levelFive(): String
}
object LevelFive {
  
  inline def apply(levelFive: CallbackTo[String]): LevelFive = {
    val __obj = js.Dynamic.literal(levelFive = levelFive.toJsFn)
    __obj.asInstanceOf[LevelFive]
  }
  
  extension [Self <: LevelFive](x: Self) {
    
    inline def setLevelFive(value: CallbackTo[String]): Self = StObject.set(x, "levelFive", value.toJsFn)
  }
}
