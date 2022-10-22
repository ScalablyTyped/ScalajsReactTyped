package typingsJapgolly.baseui.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.CloseSource
import typingsJapgolly.baseui.drawerTypesMod.AnchorProp
import typingsJapgolly.baseui.drawerTypesMod.DrawerOverrides
import typingsJapgolly.baseui.drawerTypesMod.DrawerProps
import typingsJapgolly.baseui.drawerTypesMod.SizeProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  inline def apply(
    anchor: AnchorProp,
    animate: Boolean,
    autoFocus: Boolean,
    closeable: Boolean,
    isOpen: Boolean,
    overrides: DrawerOverrides,
    showBackdrop: Boolean,
    size: SizeProp
  ): Builder = {
    val __props = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], animate = animate.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], closeable = closeable.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], overrides = overrides.asInstanceOf[js.Any], showBackdrop = showBackdrop.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DrawerProps]))
  }
  
  @JSImport("baseui/drawer", "Drawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.baseui.drawerMod.Drawer] {
    
    inline def children(value: Node | js.Function0[Node]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenCallbackTo(value: CallbackTo[Node]): this.type = set("children", value.toJsFn)
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def mountNode(value: HTMLElement): this.type = set("mountNode", value.asInstanceOf[js.Any])
    
    inline def onBackdropClick(value: /* e */ Event => Any): this.type = set("onBackdropClick", js.Any.fromFunction1(value))
    
    inline def onClose(value: /* a */ CloseSource => Any): this.type = set("onClose", js.Any.fromFunction1(value))
    
    inline def onEscapeKeyDown(value: /* e */ Event => Any): this.type = set("onEscapeKeyDown", js.Any.fromFunction1(value))
    
    inline def renderAll(value: Boolean): this.type = set("renderAll", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
