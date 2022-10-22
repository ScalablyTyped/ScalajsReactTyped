package typingsJapgolly.reactMasonryLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutProps
import typingsJapgolly.reactMasonryLayout.mod.ReactMasonryLayoutExport.MasonryLayoutSizes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactMasonryLayout {
  
  inline def apply(children: js.Array[Element], id: String): Builder = {
    val __props = js.Dynamic.literal(children = children.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[MasonryLayoutProps]))
  }
  
  @JSImport("react-masonry-layout", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def infiniteScroll(value: Callback): this.type = set("infiniteScroll", value.toJsFn)
    
    inline def infiniteScrollContainer(value: String): this.type = set("infiniteScrollContainer", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollDisabled(value: Boolean): this.type = set("infiniteScrollDisabled", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollDistance(value: Double): this.type = set("infiniteScrollDistance", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollEnd(value: Boolean): this.type = set("infiniteScrollEnd", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollEndIndicator(value: VdomNode): this.type = set("infiniteScrollEndIndicator", value.rawNode.asInstanceOf[js.Any])
    
    inline def infiniteScrollEndIndicatorNull: this.type = set("infiniteScrollEndIndicator", null)
    
    inline def infiniteScrollEndIndicatorVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("infiniteScrollEndIndicator", js.Array(value*))
    
    inline def infiniteScrollEndIndicatorVdomElement(value: VdomElement): this.type = set("infiniteScrollEndIndicator", value.rawElement.asInstanceOf[js.Any])
    
    inline def infiniteScrollLoading(value: Boolean): this.type = set("infiniteScrollLoading", value.asInstanceOf[js.Any])
    
    inline def infiniteScrollSpinner(value: VdomNode): this.type = set("infiniteScrollSpinner", value.rawNode.asInstanceOf[js.Any])
    
    inline def infiniteScrollSpinnerNull: this.type = set("infiniteScrollSpinner", null)
    
    inline def infiniteScrollSpinnerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("infiniteScrollSpinner", js.Array(value*))
    
    inline def infiniteScrollSpinnerVdomElement(value: VdomElement): this.type = set("infiniteScrollSpinner", value.rawElement.asInstanceOf[js.Any])
    
    inline def packed(value: String): this.type = set("packed", value.asInstanceOf[js.Any])
    
    inline def position(value: Boolean): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def sizes(value: js.Array[MasonryLayoutSizes]): this.type = set("sizes", value.asInstanceOf[js.Any])
    
    inline def sizesVarargs(value: MasonryLayoutSizes*): this.type = set("sizes", js.Array(value*))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: MasonryLayoutProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
