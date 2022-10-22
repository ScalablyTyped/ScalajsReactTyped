package typingsJapgolly.babylonjs.anon

import typingsJapgolly.babylonjs.BABYLON.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Rebuild extends StObject {
  
  /** the onPreviewCommandActivated observer of the preview manager should be triggered */
  var activatePreviewCommand: js.UndefOr[Boolean] = js.undefined
  
  /** a callback to trigger */
  var callback: js.UndefOr[js.Function1[/* scene */ Scene, Unit]] = js.undefined
  
  /** the material should be rebuilt */
  var rebuild: js.UndefOr[Boolean] = js.undefined
  
  /** the preview should be updated */
  var update: js.UndefOr[Boolean] = js.undefined
}
object Rebuild {
  
  inline def apply(): Rebuild = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Rebuild]
  }
  
  extension [Self <: Rebuild](x: Self) {
    
    inline def setActivatePreviewCommand(value: Boolean): Self = StObject.set(x, "activatePreviewCommand", value.asInstanceOf[js.Any])
    
    inline def setActivatePreviewCommandUndefined: Self = StObject.set(x, "activatePreviewCommand", js.undefined)
    
    inline def setCallback(value: /* scene */ Scene => japgolly.scalajs.react.Callback): Self = StObject.set(x, "callback", js.Any.fromFunction1((t0: /* scene */ Scene) => value(t0).runNow()))
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setRebuild(value: Boolean): Self = StObject.set(x, "rebuild", value.asInstanceOf[js.Any])
    
    inline def setRebuildUndefined: Self = StObject.set(x, "rebuild", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
