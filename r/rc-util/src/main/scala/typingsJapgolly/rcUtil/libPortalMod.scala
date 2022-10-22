package typingsJapgolly.rcUtil

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPortalMod extends Shortcut {
  
  @JSImport("rc-util/lib/Portal", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]] = js.native
  
  trait PortalProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var didUpdate: js.UndefOr[js.Function1[/* prevProps */ this.type, Unit]] = js.undefined
    
    def getContainer(): HTMLElement
  }
  object PortalProps {
    
    inline def apply(getContainer: CallbackTo[HTMLElement]): PortalProps = {
      val __obj = js.Dynamic.literal(getContainer = getContainer.toJsFn)
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDidUpdate(value: PortalProps => Callback): Self = StObject.set(x, "didUpdate", js.Any.fromFunction1((t0: PortalProps) => value(t0).runNow()))
      
      inline def setDidUpdateUndefined: Self = StObject.set(x, "didUpdate", js.undefined)
      
      inline def setGetContainer(value: CallbackTo[HTMLElement]): Self = StObject.set(x, "getContainer", value.toJsFn)
    }
  }
  
  type PortalRef = js.Object
  
  type _To = ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libPortalMod.foo` */
  override def _to: ForwardRefExoticComponent[PortalProps & RefAttributes[PortalRef]] = default
}
