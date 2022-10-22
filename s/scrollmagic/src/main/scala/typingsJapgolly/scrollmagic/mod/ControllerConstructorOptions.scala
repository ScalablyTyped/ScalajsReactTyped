package typingsJapgolly.scrollmagic.mod

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControllerConstructorOptions extends StObject {
  
  var container: js.UndefOr[String | Element] = js.undefined
  
  var globalSceneOptions: js.UndefOr[SceneConstructorOptions] = js.undefined
  
  var loglevel: js.UndefOr[Double] = js.undefined
  
  var refreshInterval: js.UndefOr[Double] = js.undefined
  
  var vertical: js.UndefOr[Boolean] = js.undefined
}
object ControllerConstructorOptions {
  
  inline def apply(): ControllerConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControllerConstructorOptions]
  }
  
  extension [Self <: ControllerConstructorOptions](x: Self) {
    
    inline def setContainer(value: String | Element): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
    
    inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
    
    inline def setGlobalSceneOptions(value: SceneConstructorOptions): Self = StObject.set(x, "globalSceneOptions", value.asInstanceOf[js.Any])
    
    inline def setGlobalSceneOptionsUndefined: Self = StObject.set(x, "globalSceneOptions", js.undefined)
    
    inline def setLoglevel(value: Double): Self = StObject.set(x, "loglevel", value.asInstanceOf[js.Any])
    
    inline def setLoglevelUndefined: Self = StObject.set(x, "loglevel", js.undefined)
    
    inline def setRefreshInterval(value: Double): Self = StObject.set(x, "refreshInterval", value.asInstanceOf[js.Any])
    
    inline def setRefreshIntervalUndefined: Self = StObject.set(x, "refreshInterval", js.undefined)
    
    inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    
    inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
  }
}
