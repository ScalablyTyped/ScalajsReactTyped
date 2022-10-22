package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victoryCore.esVictoryClipContainerVictoryClipContainerMod.VictoryClipContainerProps
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.BlockProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryClipContainer {
  
  @JSImport("victory-core/es", "VictoryClipContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCore.esMod.VictoryClipContainer] {
    
    inline def `aria-label`(value: String): this.type = set("aria-label", value.asInstanceOf[js.Any])
    
    inline def children(value: Element | js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def circleComponent(value: VdomElement): this.type = set("circleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clipHeight(value: Double): this.type = set("clipHeight", value.asInstanceOf[js.Any])
    
    inline def clipId(value: Double | String): this.type = set("clipId", value.asInstanceOf[js.Any])
    
    inline def clipPadding(value: BlockProps): this.type = set("clipPadding", value.asInstanceOf[js.Any])
    
    inline def clipPathComponent(value: VdomElement): this.type = set("clipPathComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def clipWidth(value: Double): this.type = set("clipWidth", value.asInstanceOf[js.Any])
    
    inline def events(value: DOMAttributes[Any]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def origin(value: OriginType): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    inline def radius(value: Double): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def rectComponent(value: VdomElement): this.type = set("rectComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def translateX(value: Double): this.type = set("translateX", value.asInstanceOf[js.Any])
    
    inline def translateY(value: Double): this.type = set("translateY", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryClipContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryClipContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
