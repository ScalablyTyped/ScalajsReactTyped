package typingsJapgolly.phaser.Phaser.Types.Core

import japgolly.scalajs.react.Callback
import typingsJapgolly.phaser.Phaser.Game
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallbacksConfig extends StObject {
  
  /**
    * A function to run at the end of the boot sequence. At this point, all the game systems have started and plugins have been loaded.
    */
  var postBoot: js.UndefOr[BootCallback] = js.undefined
  
  /**
    * A function to run at the start of the boot sequence.
    */
  var preBoot: js.UndefOr[BootCallback] = js.undefined
}
object CallbacksConfig {
  
  inline def apply(): CallbacksConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbacksConfig]
  }
  
  extension [Self <: CallbacksConfig](x: Self) {
    
    inline def setPostBoot(value: /* game */ Game => Callback): Self = StObject.set(x, "postBoot", js.Any.fromFunction1((t0: /* game */ Game) => value(t0).runNow()))
    
    inline def setPostBootUndefined: Self = StObject.set(x, "postBoot", js.undefined)
    
    inline def setPreBoot(value: /* game */ Game => Callback): Self = StObject.set(x, "preBoot", js.Any.fromFunction1((t0: /* game */ Game) => value(t0).runNow()))
    
    inline def setPreBootUndefined: Self = StObject.set(x, "preBoot", js.undefined)
  }
}
