package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalAppCanvasMod {
  
  @JSImport("material-ui/internal/AppCanvas", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AppCanvasProps, js.Object, Any]
  
  type AppCanvas = japgolly.scalajs.react.facade.React.Component[AppCanvasProps & js.Object, js.Object]
  
  trait AppCanvasProps extends StObject {
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[AppCanvasProps & js.Object, js.Object]
        ]
      ] = js.undefined
  }
  object AppCanvasProps {
    
    inline def apply(): AppCanvasProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppCanvasProps]
    }
    
    extension [Self <: AppCanvasProps](x: Self) {
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[AppCanvasProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[AppCanvasProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[AppCanvasProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
