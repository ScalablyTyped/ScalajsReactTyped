package typingsJapgolly.reachTooltip.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.DOMRect
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reachPolymorphic.anon.As
import typingsJapgolly.reachPolymorphic.mod.Merge
import typingsJapgolly.reachTooltip.mod.PRect
import typingsJapgolly.reachTooltip.mod.TooltipPopupProps
import typingsJapgolly.reachTooltip.reachTooltipStrings.div
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TooltipPopup {
  
  @JSImport("@reach/tooltip", "TooltipPopup")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def as(value: div): this.type = set("as", value.asInstanceOf[js.Any])
    
    inline def isVisible(value: Boolean): this.type = set("isVisible", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def position(
      value: (/* targetRect */ js.UndefOr[PRect | Null], /* popoverRect */ js.UndefOr[PRect | Null]) => CSSProperties
    ): this.type = set("position", js.Any.fromFunction2(value))
    
    inline def triggerRect(value: DOMRect): this.type = set("triggerRect", value.asInstanceOf[js.Any])
    
    inline def triggerRectNull: this.type = set("triggerRect", null)
  }
  
  implicit def make(companion: TooltipPopup.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(
    p: Merge[
      /* import warning: importer.ImportType#apply Failed type conversion: IntrinsicElementString extends react.react.ElementType<any> ? react.react.ComponentPropsWithRef<IntrinsicElementString> : never */ js.Any, 
      TooltipPopupProps & As[div]
    ]
  ): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
