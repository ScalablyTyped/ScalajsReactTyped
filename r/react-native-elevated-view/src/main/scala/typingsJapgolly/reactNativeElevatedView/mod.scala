package typingsJapgolly.reactNativeElevatedView

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactNative.mod.ViewProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-elevated-view", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ElevatedViewProperties, js.Object, Any]
  
  type ElevatedView = japgolly.scalajs.react.facade.React.Component[ElevatedViewProperties & js.Object, js.Object]
  
  trait ElevatedViewProperties
    extends StObject
       with ViewProps {
    
    var elevation: js.UndefOr[Double] = js.undefined
  }
  object ElevatedViewProperties {
    
    inline def apply(): ElevatedViewProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElevatedViewProperties]
    }
    
    extension [Self <: ElevatedViewProperties](x: Self) {
      
      inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
      
      inline def setElevationUndefined: Self = StObject.set(x, "elevation", js.undefined)
    }
  }
}
