package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.SizeNumber
import typingsJapgolly.baseui.mapMarkerTypesMod.BadgeEnhancerSize
import typingsJapgolly.baseui.mapMarkerTypesMod.FixedMarkerOverrides
import typingsJapgolly.baseui.mapMarkerTypesMod.FixedMarkerProps
import typingsJapgolly.baseui.mapMarkerTypesMod.Kind
import typingsJapgolly.baseui.mapMarkerTypesMod.LabelEnhancerPosition
import typingsJapgolly.baseui.mapMarkerTypesMod.NeedleSize
import typingsJapgolly.baseui.mapMarkerTypesMod.PinHeadSize
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FixedMarker {
  
  @JSImport("baseui/map-marker", "FixedMarker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def badgeEnhancerContent(value: ComponentType[SizeNumber]): this.type = set("badgeEnhancerContent", value.asInstanceOf[js.Any])
    
    inline def badgeEnhancerSize(value: BadgeEnhancerSize): this.type = set("badgeEnhancerSize", value.asInstanceOf[js.Any])
    
    inline def badgeEnhancerSizeNull: this.type = set("badgeEnhancerSize", null)
    
    inline def dragging(value: Boolean): this.type = set("dragging", value.asInstanceOf[js.Any])
    
    inline def endEnhancer(value: ComponentType[SizeNumber]): this.type = set("endEnhancer", value.asInstanceOf[js.Any])
    
    inline def kind(value: Kind): this.type = set("kind", value.asInstanceOf[js.Any])
    
    inline def label(value: VdomNode): this.type = set("label", value.rawNode.asInstanceOf[js.Any])
    
    inline def labelEnhancerContent(value: String): this.type = set("labelEnhancerContent", value.asInstanceOf[js.Any])
    
    inline def labelEnhancerPosition(value: LabelEnhancerPosition): this.type = set("labelEnhancerPosition", value.asInstanceOf[js.Any])
    
    inline def labelNull: this.type = set("label", null)
    
    inline def labelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("label", js.Array(value*))
    
    inline def labelVdomElement(value: VdomElement): this.type = set("label", value.rawElement.asInstanceOf[js.Any])
    
    inline def needle(value: NeedleSize): this.type = set("needle", value.asInstanceOf[js.Any])
    
    inline def overrides(value: FixedMarkerOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def size(value: PinHeadSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def startEnhancer(value: ComponentType[SizeNumber]): this.type = set("startEnhancer", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: FixedMarker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: FixedMarkerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
