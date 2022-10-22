package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesThumbnailMod.ThumbnailContentAlignment
import typingsJapgolly.wixStyleReact.distTypesThumbnailMod.ThumbnailProps
import typingsJapgolly.wixStyleReact.distTypesThumbnailMod.ThumbnailSize
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thumbnail {
  
  @JSImport("wix-style-react", "Thumbnail")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Thumbnail] {
    
    inline def backgroundImage(value: VdomNode): this.type = set("backgroundImage", value.rawNode.asInstanceOf[js.Any])
    
    inline def backgroundImageNull: this.type = set("backgroundImage", null)
    
    inline def backgroundImageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("backgroundImage", js.Array(value*))
    
    inline def backgroundImageVdomElement(value: VdomElement): this.type = set("backgroundImage", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def contentAlignment(value: ThumbnailContentAlignment): this.type = set("contentAlignment", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def description(value: VdomNode): this.type = set("description", value.rawNode.asInstanceOf[js.Any])
    
    inline def descriptionNull: this.type = set("description", null)
    
    inline def descriptionVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("description", js.Array(value*))
    
    inline def descriptionVdomElement(value: VdomElement): this.type = set("description", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def height(value: String | Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def hideSelectedIcon(value: Boolean): this.type = set("hideSelectedIcon", value.asInstanceOf[js.Any])
    
    inline def image(value: VdomNode): this.type = set("image", value.rawNode.asInstanceOf[js.Any])
    
    inline def imageNull: this.type = set("image", null)
    
    inline def imageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("image", js.Array(value*))
    
    inline def imageVdomElement(value: VdomElement): this.type = set("image", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(
      value: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement] => Callback
    ): this.type = set("onClick", js.Any.fromFunction1((t0: /* event */ ReactMouseEventFrom[HTMLElement] | ReactKeyboardEventFrom[HTMLElement]) => value(t0).runNow()))
    
    inline def selected(value: Boolean): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def size(value: ThumbnailSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
    
    inline def width(value: String | Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Thumbnail.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ThumbnailProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
