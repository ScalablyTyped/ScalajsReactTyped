package typingsJapgolly.reactOverlays

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.RefHandle
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactOverlays.anon.Container
import typingsJapgolly.reactOverlays.esmUseWaitForDOMRefMod.DOMContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmPortalMod {
  
  /**
    * @public
    */
  object default {
    
    inline def apply(hasContainerChildrenOnRendered: PortalProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(hasContainerChildrenOnRendered.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("react-overlays/esm/Portal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-overlays/esm/Portal", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("react-overlays/esm/Portal", "default.propTypes")
    @js.native
    def propTypes: Container = js.native
    inline def propTypes_=(x: Container): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  trait PortalProps extends StObject {
    
    var children: japgolly.scalajs.react.facade.React.Element
    
    var container: DOMContainer[HTMLElement]
    
    var onRendered: js.UndefOr[js.Function1[/* element */ Any, Unit]] = js.undefined
  }
  object PortalProps {
    
    inline def apply(children: VdomElement): PortalProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], container = null)
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setContainer(value: DOMContainer[HTMLElement]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerCallbackTo(value: CallbackTo[HTMLElement | RefHandle[HTMLElement] | Null]): Self = StObject.set(x, "container", value.toJsFn)
      
      inline def setContainerNull: Self = StObject.set(x, "container", null)
      
      inline def setOnRendered(value: /* element */ Any => Callback): Self = StObject.set(x, "onRendered", js.Any.fromFunction1((t0: /* element */ Any) => value(t0).runNow()))
      
      inline def setOnRenderedUndefined: Self = StObject.set(x, "onRendered", js.undefined)
    }
  }
}
