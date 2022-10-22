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

object internalAutoLockScrollingMod {
  
  @JSImport("material-ui/internal/AutoLockScrolling", JSImport.Default)
  @js.native
  open class default ()
    extends Component[AutoLockScrollingProps, js.Object, Any]
  
  type AutoLockScrolling = japgolly.scalajs.react.facade.React.Component[AutoLockScrollingProps & js.Object, js.Object]
  
  trait AutoLockScrollingProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var lock: Boolean
    
    var ref: js.UndefOr[
        LegacyRef[
          japgolly.scalajs.react.facade.React.Component[AutoLockScrollingProps & js.Object, js.Object]
        ]
      ] = js.undefined
  }
  object AutoLockScrollingProps {
    
    inline def apply(lock: Boolean): AutoLockScrollingProps = {
      val __obj = js.Dynamic.literal(lock = lock.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoLockScrollingProps]
    }
    
    extension [Self <: AutoLockScrollingProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLock(value: Boolean): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
      
      inline def setRef(
        value: LegacyRef[
              japgolly.scalajs.react.facade.React.Component[AutoLockScrollingProps & js.Object, js.Object]
            ]
      ): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefFunction1(
        value: (japgolly.scalajs.react.facade.React.Component[AutoLockScrollingProps & js.Object, js.Object]) | Null => Callback
      ): Self = StObject.set(x, "ref", js.Any.fromFunction1((t0: (japgolly.scalajs.react.facade.React.Component[AutoLockScrollingProps & js.Object, js.Object]) | Null) => value(t0).runNow()))
      
      inline def setRefNull: Self = StObject.set(x, "ref", null)
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
