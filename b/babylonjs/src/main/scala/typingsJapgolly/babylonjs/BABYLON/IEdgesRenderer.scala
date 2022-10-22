package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEdgesRenderer
  extends StObject
     with IDisposable {
  
  /**
    * List of instances to render in case the source mesh has instances
    */
  var customInstances: SmartArray[Matrix]
  
  /**
    * Gets or sets a boolean indicating if the edgesRenderer is active
    */
  var isEnabled: Boolean
  
  /**
    * Checks whether or not the edges renderer is ready to render.
    * @returns true if ready, otherwise false.
    */
  def isReady(): Boolean
  
  /**
    * Renders the edges of the attached mesh,
    */
  def render(): Unit
}
object IEdgesRenderer {
  
  inline def apply(
    customInstances: SmartArray[Matrix],
    dispose: Callback,
    isEnabled: Boolean,
    isReady: CallbackTo[Boolean],
    render: Callback
  ): IEdgesRenderer = {
    val __obj = js.Dynamic.literal(customInstances = customInstances.asInstanceOf[js.Any], dispose = dispose.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], isReady = isReady.toJsFn, render = render.toJsFn)
    __obj.asInstanceOf[IEdgesRenderer]
  }
  
  extension [Self <: IEdgesRenderer](x: Self) {
    
    inline def setCustomInstances(value: SmartArray[Matrix]): Self = StObject.set(x, "customInstances", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "isReady", value.toJsFn)
    
    inline def setRender(value: Callback): Self = StObject.set(x, "render", value.toJsFn)
  }
}
