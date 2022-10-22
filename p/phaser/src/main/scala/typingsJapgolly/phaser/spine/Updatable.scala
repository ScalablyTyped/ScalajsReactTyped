package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Updatable extends StObject {
  
  def isActive(): Boolean
  
  def update(): Unit
}
object Updatable {
  
  inline def apply(isActive: CallbackTo[Boolean], update: Callback): Updatable = {
    val __obj = js.Dynamic.literal(isActive = isActive.toJsFn, update = update.toJsFn)
    __obj.asInstanceOf[Updatable]
  }
  
  extension [Self <: Updatable](x: Self) {
    
    inline def setIsActive(value: CallbackTo[Boolean]): Self = StObject.set(x, "isActive", value.toJsFn)
    
    inline def setUpdate(value: Callback): Self = StObject.set(x, "update", value.toJsFn)
  }
}
