package typingsJapgolly.wixUiCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixUiCore.distEsSrcComponentsThumbnailThumbnailMod.ThumbnailProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thumbnail {
  
  @JSImport("wix-ui-core/dist/es/src", "Thumbnail")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def `data-hook`(value: String): this.type = set("data-hook", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[HTMLElement] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def selectedIcon(value: VdomNode): this.type = set("selectedIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def selectedIconNull: this.type = set("selectedIcon", null)
    
    inline def selectedIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("selectedIcon", js.Array(value*))
    
    inline def selectedIconVdomElement(value: VdomElement): this.type = set("selectedIcon", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Thumbnail.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThumbnailProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
