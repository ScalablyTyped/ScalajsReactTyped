package typingsJapgolly.baseui.components

import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.badgeTypesMod.BadgeOverrides
import typingsJapgolly.baseui.badgeTypesMod.BadgeProps
import typingsJapgolly.baseui.badgeTypesMod.Color
import typingsJapgolly.baseui.badgeTypesMod.Hierarchy
import typingsJapgolly.baseui.badgeTypesMod.Placement
import typingsJapgolly.baseui.badgeTypesMod.Shape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Badge {
  
  @JSImport("baseui/badge", "Badge")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def color(value: Color): this.type = set("color", value.asInstanceOf[js.Any])
    
    inline def content(value: VdomNode): this.type = set("content", value.rawNode.asInstanceOf[js.Any])
    
    inline def contentNull: this.type = set("content", null)
    
    inline def contentVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("content", js.Array(value*))
    
    inline def contentVdomElement(value: VdomElement): this.type = set("content", value.rawElement.asInstanceOf[js.Any])
    
    inline def hidden(value: Boolean): this.type = set("hidden", value.asInstanceOf[js.Any])
    
    inline def hierarchy(value: Hierarchy): this.type = set("hierarchy", value.asInstanceOf[js.Any])
    
    inline def horizontalOffset(value: String): this.type = set("horizontalOffset", value.asInstanceOf[js.Any])
    
    inline def overrides(value: BadgeOverrides): this.type = set("overrides", value.asInstanceOf[js.Any])
    
    inline def placement(value: Placement): this.type = set("placement", value.asInstanceOf[js.Any])
    
    inline def shape(value: Shape): this.type = set("shape", value.asInstanceOf[js.Any])
    
    inline def verticalOffset(value: String): this.type = set("verticalOffset", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Badge.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BadgeProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
