package typingsJapgolly.cathoQuantum.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.ReactTouchEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.MouseEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.cathoQuantum.anon.BreakpointsColors
import typingsJapgolly.cathoQuantum.anon.SmallTheme
import typingsJapgolly.cathoQuantum.anon.`3`
import typingsJapgolly.cathoQuantum.modalMod.ModalProps
import typingsJapgolly.cathoQuantum.modalMod.StaticProps
import typingsJapgolly.cathoQuantum.modalMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Modal {
  
  object Content {
    
    @JSImport("@catho/quantum/Modal", "default.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_StaticProps_277492225 = new SharedBuilder_StaticProps_277492225(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StaticProps): SharedBuilder_StaticProps_277492225 = new SharedBuilder_StaticProps_277492225(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("@catho/quantum/Modal", "default.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: `3`): SharedBuilder_3301687753 = new SharedBuilder_3301687753(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("@catho/quantum/Modal", "default.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_StaticProps_277492225 = new SharedBuilder_StaticProps_277492225(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: StaticProps): SharedBuilder_StaticProps_277492225 = new SharedBuilder_StaticProps_277492225(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object HeaderText {
    
    @JSImport("@catho/quantum/Modal", "default.HeaderText")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: HeaderText.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Title {
    
    @JSImport("@catho/quantum/Modal", "default.Title")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Title.type): SharedBuilder_SmallTheme1067188870 = new SharedBuilder_SmallTheme1067188870(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SmallTheme): SharedBuilder_SmallTheme1067188870 = new SharedBuilder_SmallTheme1067188870(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("@catho/quantum/Modal", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def children(value: js.Array[Node] | Node): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenNull: this.type = set("children", null)
    
    inline def childrenVarargs(value: (Element | Empty | JsNumber | Node | String)*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeButtonAriaLabel(value: String): this.type = set("closeButtonAriaLabel", value.asInstanceOf[js.Any])
    
    inline def onClick(value: /* e */ js.UndefOr[MouseEvent | ReactTouchEventFrom[org.scalajs.dom.Element]] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: /* e */ js.UndefOr[MouseEvent | ReactTouchEventFrom[org.scalajs.dom.Element]]) => value(t0).runNow()))
    
    inline def onClose(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClose", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def theme(value: BreakpointsColors): this.type = set("theme", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Modal.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ModalProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
