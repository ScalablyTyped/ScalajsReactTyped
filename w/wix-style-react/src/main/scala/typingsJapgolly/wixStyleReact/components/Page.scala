package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesCommonMod.ScrollableContainerCommonProps
import typingsJapgolly.wixStyleReact.distTypesPageMod.PageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Page {
  
  @JSImport("wix-style-react", "Page")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Page] {
    
    inline def backgroundImageUrl(value: String): this.type = set("backgroundImageUrl", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def gradientClassName(value: String): this.type = set("gradientClassName", value.asInstanceOf[js.Any])
    
    inline def height(value: String): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def horizontalScroll(value: Boolean): this.type = set("horizontalScroll", value.asInstanceOf[js.Any])
    
    inline def maxWidth(value: Double): this.type = set("maxWidth", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def scrollProps(value: ScrollableContainerCommonProps): this.type = set("scrollProps", value.asInstanceOf[js.Any])
    
    inline def scrollableContentRef(value: /* ref */ HTMLElement => Callback): this.type = set("scrollableContentRef", js.Any.fromFunction1((t0: /* ref */ HTMLElement) => value(t0).runNow()))
    
    inline def sidePadding(value: Double): this.type = set("sidePadding", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Page.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
