package typingsJapgolly.atlaskitLayer.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.atlaskitLayer.mod.BoundariesElementType
import typingsJapgolly.atlaskitLayer.mod.CSSPositionType
import typingsJapgolly.atlaskitLayer.mod.FlipPositionType
import typingsJapgolly.atlaskitLayer.mod.PositionType
import typingsJapgolly.atlaskitLayer.mod.Props
import typingsJapgolly.atlaskitLayer.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layer {
  
  @JSImport("@atlaskit/layer", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def autoFlip(value: Boolean | FlipPositionType | js.Array[FlipPositionType]): this.type = set("autoFlip", value.asInstanceOf[js.Any])
    
    inline def autoFlipVarargs(value: FlipPositionType*): this.type = set("autoFlip", js.Array(value*))
    
    inline def boundariesElement(value: BoundariesElementType): this.type = set("boundariesElement", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def lockScroll(value: Boolean): this.type = set("lockScroll", value.asInstanceOf[js.Any])
    
    inline def offset(value: String): this.type = set("offset", value.asInstanceOf[js.Any])
    
    inline def onFlippedChange(
      value: (/* flipped */ Boolean, /* actualPosition */ CSSPositionType, /* originalPosition */ CSSPositionType) => Callback
    ): this.type = set("onFlippedChange", js.Any.fromFunction3((t0: /* flipped */ Boolean, t1: /* actualPosition */ CSSPositionType, t2: /* originalPosition */ CSSPositionType) => (value(t0, t1, t2)).runNow()))
    
    inline def position(value: PositionType): this.type = set("position", value.asInstanceOf[js.Any])
    
    inline def zIndex(value: Double): this.type = set("zIndex", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Layer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: Props): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
