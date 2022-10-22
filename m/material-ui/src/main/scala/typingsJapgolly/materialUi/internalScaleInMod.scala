package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalScaleInMod {
  
  @JSImport("material-ui/internal/ScaleIn", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ScaleInProps, js.Object, Any]
  
  type ScaleIn = japgolly.scalajs.react.facade.React.Component[ScaleInProps & js.Object, js.Object]
  
  trait ScaleInProps extends StObject {
    
    var childStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var maxScale: js.UndefOr[Double] = js.undefined
    
    var minScale: js.UndefOr[Double] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[ScaleInProps & js.Object, js.Object]
        ]
      ] = js.undefined
  }
  object ScaleInProps {
    
    inline def apply(): ScaleInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScaleInProps]
    }
    
    extension [Self <: ScaleInProps](x: Self) {
      
      inline def setChildStyle(value: CSSProperties): Self = StObject.set(x, "childStyle", value.asInstanceOf[js.Any])
      
      inline def setChildStyleUndefined: Self = StObject.set(x, "childStyle", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
      
      inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
      
      inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
      
      inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[ScaleInProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[ScaleInProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[ScaleInProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
