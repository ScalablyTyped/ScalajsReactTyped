package typingsJapgolly.reactScrollSync

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-scroll-sync", "ScrollSync")
  @js.native
  val ScrollSync: FC[ScrollSyncProps] = js.native
  
  @JSImport("react-scroll-sync", "ScrollSyncPane")
  @js.native
  val ScrollSyncPane: FC[ScrollSyncPaneProps] = js.native
  
  trait ScrollSyncPaneProps extends StObject {
    
    var attachTo: js.UndefOr[HTMLElement] = js.undefined
    
    var children: js.UndefOr[Node] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var group: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object ScrollSyncPaneProps {
    
    inline def apply(): ScrollSyncPaneProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSyncPaneProps]
    }
    
    extension [Self <: ScrollSyncPaneProps](x: Self) {
      
      inline def setAttachTo(value: HTMLElement): Self = StObject.set(x, "attachTo", value.asInstanceOf[js.Any])
      
      inline def setAttachToUndefined: Self = StObject.set(x, "attachTo", js.undefined)
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setGroup(value: String | js.Array[String]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value*))
    }
  }
  
  trait ScrollSyncProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var onSync: js.UndefOr[js.Function1[/* el */ org.scalajs.dom.Element, Unit]] = js.undefined
    
    var proportional: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object ScrollSyncProps {
    
    inline def apply(): ScrollSyncProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSyncProps]
    }
    
    extension [Self <: ScrollSyncProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setOnSync(value: /* el */ org.scalajs.dom.Element => Callback): Self = StObject.set(x, "onSync", js.Any.fromFunction1((t0: /* el */ org.scalajs.dom.Element) => value(t0).runNow()))
      
      inline def setOnSyncUndefined: Self = StObject.set(x, "onSync", js.undefined)
      
      inline def setProportional(value: Boolean): Self = StObject.set(x, "proportional", value.asInstanceOf[js.Any])
      
      inline def setProportionalUndefined: Self = StObject.set(x, "proportional", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
