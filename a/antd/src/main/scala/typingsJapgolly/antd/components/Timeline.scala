package typingsJapgolly.antd.components

import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.antdStrings.alternate
import typingsJapgolly.antd.antdStrings.left
import typingsJapgolly.antd.antdStrings.right
import typingsJapgolly.antd.libTimelineTimelineItemMod.TimelineItemProps
import typingsJapgolly.antd.libTimelineTimelineMod.TimelineProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Timeline {
  
  object Item {
    
    @JSImport("antd", "Timeline.Item")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Item.type): SharedBuilder_TimelineItemProps_1840960613 = new SharedBuilder_TimelineItemProps_1840960613(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: TimelineItemProps): SharedBuilder_TimelineItemProps_1840960613 = new SharedBuilder_TimelineItemProps_1840960613(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Timeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def mode(value: left | alternate | right): this.type = set("mode", value.asInstanceOf[js.Any])
    
    inline def pending(value: VdomNode): this.type = set("pending", value.rawNode.asInstanceOf[js.Any])
    
    inline def pendingDot(value: VdomNode): this.type = set("pendingDot", value.rawNode.asInstanceOf[js.Any])
    
    inline def pendingDotNull: this.type = set("pendingDot", null)
    
    inline def pendingDotVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("pendingDot", js.Array(value*))
    
    inline def pendingDotVdomElement(value: VdomElement): this.type = set("pendingDot", value.rawElement.asInstanceOf[js.Any])
    
    inline def pendingNull: this.type = set("pending", null)
    
    inline def pendingVarargs(
      value: (japgolly.scalajs.react.facade.Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*
    ): this.type = set("pending", js.Array(value*))
    
    inline def pendingVdomElement(value: VdomElement): this.type = set("pending", value.rawElement.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def reverse(value: Boolean): this.type = set("reverse", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Timeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
