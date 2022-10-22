package typingsJapgolly.reactNativeRestart

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-restart", JSImport.Default)
  @js.native
  val default: RestartType = js.native
  
  trait RestartType extends StObject {
    
    def Restart(): Unit
  }
  object RestartType {
    
    inline def apply(Restart: Callback): RestartType = {
      val __obj = js.Dynamic.literal(Restart = Restart.toJsFn)
      __obj.asInstanceOf[RestartType]
    }
    
    extension [Self <: RestartType](x: Self) {
      
      inline def setRestart(value: Callback): Self = StObject.set(x, "Restart", value.toJsFn)
    }
  }
  
  type _To = RestartType
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: RestartType = default
}
