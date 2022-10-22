package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.baseui.mapMarkerTypesMod.AnchorPositions
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerAnchorType
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerOverrides
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerProps
import typingsJapgolly.baseui.mapMarkerTypesMod.FloatingMarkerSize
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FloatingMarker {
  
  @JSImport("baseui/map-marker", "FloatingMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def anchor(value: AnchorPositions): this.type = set("anchor", value.asInstanceOf[js.Any])
    
    inline def anchorType(value: FloatingMarkerAnchorType): this.type = set("anchorType", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: ComponentType[SizeNumber]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def overrides(value: FloatingMarkerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: FloatingMarkerSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: ComponentType[SizeNumber]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FloatingMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FloatingMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
