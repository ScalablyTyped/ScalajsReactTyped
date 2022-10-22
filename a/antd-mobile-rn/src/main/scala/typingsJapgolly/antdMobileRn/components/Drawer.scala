package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.bottom
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.left
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.right
import typingsJapgolly.antdMobileRn.antdMobileRnStrings.top
import typingsJapgolly.antdMobileRn.libDrawerIndexDotnativeMod.DrawerNativeProps
import typingsJapgolly.reactNativeDrawerLayout.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Drawer {
  
  @JSImport("antd-mobile-rn", "Drawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antdMobileRn.mod.Drawer] {
    
    inline def drawerBackgroundColor(value: String): this.type = set("drawerBackgroundColor", value.asInstanceOf[js.Any])
    
    inline def drawerRef(value: /* el */ default | Null => Callback): this.type = set("drawerRef", js.Any.fromFunction1((t0: /* el */ default | Null) => value(t0).runNow()))
    
    inline def drawerWidth(value: Double): this.type = set("drawerWidth", value.asInstanceOf[js.Any])
    
    inline def onOpenChange(value: /* isOpen */ Boolean => Callback): this.type = set("onOpenChange", js.Any.fromFunction1((t0: /* isOpen */ Boolean) => value(t0).runNow()))
    
    inline def open(value: Boolean): this.type = set("open", value.asInstanceOf[js.Any])
    
    inline def position(value: left | right | top | bottom): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def sidebar(value: VdomNode): this.type = set("sidebar", value.rawNode.asInstanceOf[js.Any])
    
    inline def sidebarNull: this.type = set("sidebar", null)
    
    inline def sidebarVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("sidebar", js.Array(value*))
    
    inline def sidebarVdomElement(value: VdomElement): this.type = set("sidebar", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Drawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DrawerNativeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
