package typingsJapgolly.wixStyleReact.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.wixStyleReact.distTypesHorizontalTimelineMod.HorizontalTimelineAlignLabel
import typingsJapgolly.wixStyleReact.distTypesHorizontalTimelineMod.HorizontalTimelineIcon
import typingsJapgolly.wixStyleReact.distTypesHorizontalTimelineMod.HorizontalTimelineItem
import typingsJapgolly.wixStyleReact.distTypesHorizontalTimelineMod.HorizontalTimelineProps
import typingsJapgolly.wixStyleReact.distTypesHorizontalTimelineMod.HorizontalTimelineSkin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HorizontalTimeline {
  
  object ActiveIcon {
    
    @JSImport("wix-style-react", "HorizontalTimeline.ActiveIcon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: ActiveIcon.type): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HorizontalTimelineIcon): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object BoundaryIcon {
    
    @JSImport("wix-style-react", "HorizontalTimeline.BoundaryIcon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: BoundaryIcon.type): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HorizontalTimelineIcon): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object CompleteIcon {
    
    @JSImport("wix-style-react", "HorizontalTimeline.CompleteIcon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: CompleteIcon.type): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HorizontalTimelineIcon): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DefaultIcon {
    
    @JSImport("wix-style-react", "HorizontalTimeline.DefaultIcon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: DefaultIcon.type): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: HorizontalTimelineIcon): SharedBuilder_HorizontalTimelineIcon_2050922362 = new SharedBuilder_HorizontalTimelineIcon_2050922362(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object DestructiveIcon {
    
    @JSImport("wix-style-react", "HorizontalTimeline.DestructiveIcon")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: DestructiveIcon.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("wix-style-react", "HorizontalTimeline")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.HorizontalTimeline] {
    
    inline def alignLabel(value: HorizontalTimelineAlignLabel): this.type = set("alignLabel", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def items(value: js.Array[HorizontalTimelineItem]): this.type = set("items", value.asInstanceOf[js.Any])
    
    inline def itemsVarargs(value: HorizontalTimelineItem*): this.type = set("items", js.Array(value*))
    
    inline def skin(value: HorizontalTimelineSkin): this.type = set("skin", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: HorizontalTimeline.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: HorizontalTimelineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
