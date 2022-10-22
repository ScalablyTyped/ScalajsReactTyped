package typingsJapgolly.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementMoveToMod {
  
  @JSImport("webdriverio/build/commands/element/moveTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[Unit]]
  inline def default(hasXOffsetYOffset: MoveToOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasXOffsetYOffset.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait MoveToOptions extends StObject {
    
    var xOffset: js.UndefOr[Double] = js.undefined
    
    var yOffset: js.UndefOr[Double] = js.undefined
  }
  object MoveToOptions {
    
    inline def apply(): MoveToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoveToOptions]
    }
    
    extension [Self <: MoveToOptions](x: Self) {
      
      inline def setXOffset(value: Double): Self = StObject.set(x, "xOffset", value.asInstanceOf[js.Any])
      
      inline def setXOffsetUndefined: Self = StObject.set(x, "xOffset", js.undefined)
      
      inline def setYOffset(value: Double): Self = StObject.set(x, "yOffset", value.asInstanceOf[js.Any])
      
      inline def setYOffsetUndefined: Self = StObject.set(x, "yOffset", js.undefined)
    }
  }
}
