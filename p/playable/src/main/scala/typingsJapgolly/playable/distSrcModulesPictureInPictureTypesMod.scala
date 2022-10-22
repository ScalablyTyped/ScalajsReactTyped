package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesPictureInPictureTypesMod {
  
  trait IPictureInPicture extends StObject {
    
    def destroy(): Unit
    
    def disablePictureInPicture(): Unit
    
    def enablePictureInPicture(): Unit
    
    def enterPictureInPicture(): Unit
    
    def exitPictureInPicture(): Unit
    
    var isEnabled: Boolean
    
    var isInPictureInPicture: Boolean
  }
  object IPictureInPicture {
    
    inline def apply(
      destroy: Callback,
      disablePictureInPicture: Callback,
      enablePictureInPicture: Callback,
      enterPictureInPicture: Callback,
      exitPictureInPicture: Callback,
      isEnabled: Boolean,
      isInPictureInPicture: Boolean
    ): IPictureInPicture = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, disablePictureInPicture = disablePictureInPicture.toJsFn, enablePictureInPicture = enablePictureInPicture.toJsFn, enterPictureInPicture = enterPictureInPicture.toJsFn, exitPictureInPicture = exitPictureInPicture.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPictureInPicture]
    }
    
    extension [Self <: IPictureInPicture](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisablePictureInPicture(value: Callback): Self = StObject.set(x, "disablePictureInPicture", value.toJsFn)
      
      inline def setEnablePictureInPicture(value: Callback): Self = StObject.set(x, "enablePictureInPicture", value.toJsFn)
      
      inline def setEnterPictureInPicture(value: Callback): Self = StObject.set(x, "enterPictureInPicture", value.toJsFn)
      
      inline def setExitPictureInPicture(value: Callback): Self = StObject.set(x, "exitPictureInPicture", value.toJsFn)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPictureInPictureAPI extends StObject {
    
    var disablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enablePictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var enterPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var exitPictureInPicture: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var isInPictureInPicture: js.UndefOr[Boolean] = js.undefined
  }
  object IPictureInPictureAPI {
    
    inline def apply(): IPictureInPictureAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPictureInPictureAPI]
    }
    
    extension [Self <: IPictureInPictureAPI](x: Self) {
      
      inline def setDisablePictureInPicture(value: Callback): Self = StObject.set(x, "disablePictureInPicture", value.toJsFn)
      
      inline def setDisablePictureInPictureUndefined: Self = StObject.set(x, "disablePictureInPicture", js.undefined)
      
      inline def setEnablePictureInPicture(value: Callback): Self = StObject.set(x, "enablePictureInPicture", value.toJsFn)
      
      inline def setEnablePictureInPictureUndefined: Self = StObject.set(x, "enablePictureInPicture", js.undefined)
      
      inline def setEnterPictureInPicture(value: Callback): Self = StObject.set(x, "enterPictureInPicture", value.toJsFn)
      
      inline def setEnterPictureInPictureUndefined: Self = StObject.set(x, "enterPictureInPicture", js.undefined)
      
      inline def setExitPictureInPicture(value: Callback): Self = StObject.set(x, "exitPictureInPicture", value.toJsFn)
      
      inline def setExitPictureInPictureUndefined: Self = StObject.set(x, "exitPictureInPicture", js.undefined)
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPictureUndefined: Self = StObject.set(x, "isInPictureInPicture", js.undefined)
    }
  }
  
  trait IPictureInPictureHelper extends StObject {
    
    def destroy(): Unit
    
    def exit(): Unit
    
    var isEnabled: Boolean
    
    var isInPictureInPicture: Boolean
    
    def request(): Unit
  }
  object IPictureInPictureHelper {
    
    inline def apply(
      destroy: Callback,
      exit: Callback,
      isEnabled: Boolean,
      isInPictureInPicture: Boolean,
      request: Callback
    ): IPictureInPictureHelper = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, exit = exit.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], isInPictureInPicture = isInPictureInPicture.asInstanceOf[js.Any], request = request.toJsFn)
      __obj.asInstanceOf[IPictureInPictureHelper]
    }
    
    extension [Self <: IPictureInPictureHelper](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setExit(value: Callback): Self = StObject.set(x, "exit", value.toJsFn)
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInPictureInPicture(value: Boolean): Self = StObject.set(x, "isInPictureInPicture", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: Callback): Self = StObject.set(x, "request", value.toJsFn)
    }
  }
}
