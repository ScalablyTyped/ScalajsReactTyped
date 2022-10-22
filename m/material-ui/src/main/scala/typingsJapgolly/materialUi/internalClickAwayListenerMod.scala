package typingsJapgolly.materialUi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.LegacyRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalClickAwayListenerMod {
  
  @JSImport("material-ui/internal/ClickAwayListener", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ClickAwayListenerProps, js.Object, Any]
  
  type ClickAwayListener = japgolly.scalajs.react.facade.React.Component[ClickAwayListenerProps & js.Object, js.Object]
  
  trait ClickAwayListenerProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var onClickAway: js.UndefOr[Any] = js.undefined
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[ClickAwayListenerProps & js.Object, js.Object]
        ]
      ] = js.undefined
  }
  object ClickAwayListenerProps {
    
    inline def apply(): ClickAwayListenerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickAwayListenerProps]
    }
    
    extension [Self <: ClickAwayListenerProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOnClickAway(value: Any): Self = StObject.set(x, "onClickAway", value.asInstanceOf[js.Any])
      
      inline def setOnClickAwayUndefined: Self = StObject.set(x, "onClickAway", js.undefined)
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[ClickAwayListenerProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[ClickAwayListenerProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[ClickAwayListenerProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
