package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.GridList.GridTileProps
import typingsJapgolly.materialUi.materialUiStrings.bottom
import typingsJapgolly.materialUi.materialUiStrings.left
import typingsJapgolly.materialUi.materialUiStrings.right
import typingsJapgolly.materialUi.materialUiStrings.top
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridTile {
  
  @JSImport("material-ui", "GridTile")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.GridTile] {
    
    inline def actionIcon(value: VdomElement): this.type = set("actionIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def actionPosition(value: left | right): this.type = set("actionPosition", value.asInstanceOf[js.Any])
    
    inline def cols(value: Double): this.type = set("cols", value.asInstanceOf[js.Any])
    
    inline def containerElement(value: String | Element | (ComponentClassP[Any & js.Object])): this.type = set("containerElement", value.asInstanceOf[js.Any])
    
    inline def containerElementVdomElement(value: VdomElement): this.type = set("containerElement", value.rawElement.asInstanceOf[js.Any])
    
    inline def onClick(value: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def subtitle(value: VdomNode): this.type = set("subtitle", value.rawNode.asInstanceOf[js.Any])
    
    inline def subtitleNull: this.type = set("subtitle", null)
    
    inline def subtitleStyle(value: CSSProperties): this.type = set("subtitleStyle", value.asInstanceOf[js.Any])
    
    inline def subtitleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("subtitle", js.Array(value*))
    
    inline def subtitleVdomElement(value: VdomElement): this.type = set("subtitle", value.rawElement.asInstanceOf[js.Any])
    
    inline def title(value: VdomNode): this.type = set("title", value.rawNode.asInstanceOf[js.Any])
    
    inline def titleBackground(value: String): this.type = set("titleBackground", value.asInstanceOf[js.Any])
    
    inline def titleNull: this.type = set("title", null)
    
    inline def titlePosition(value: top | bottom): this.type = set("titlePosition", value.asInstanceOf[js.Any])
    
    inline def titleStyle(value: CSSProperties): this.type = set("titleStyle", value.asInstanceOf[js.Any])
    
    inline def titleVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("title", js.Array(value*))
    
    inline def titleVdomElement(value: VdomElement): this.type = set("title", value.rawElement.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: GridTile.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridTileProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
