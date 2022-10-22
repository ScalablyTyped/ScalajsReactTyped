package typingsJapgolly.victoryCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.victoryCore.anon.`0`
import typingsJapgolly.victoryCore.esVictoryContainerVictoryContainerMod.VictoryContainerProps
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.OriginType
import typingsJapgolly.victoryCore.esVictoryThemeTypesMod.VictoryThemeDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryContainer {
  
  @JSImport("victory-core/es", "VictoryContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryCore.esMod.VictoryContainer] {
    
    inline def `aria-describedby`(value: String): this.type = set("aria-describedby", value.asInstanceOf[js.Any])
    
    inline def `aria-labelledby`(value: String): this.type = set("aria-labelledby", value.asInstanceOf[js.Any])
    
    inline def children(value: Element | js.Array[Element]): this.type = set("children", value.asInstanceOf[js.Any])
    
    inline def childrenVarargs(value: Element*): this.type = set("children", js.Array(value*))
    
    inline def childrenVdomElement(value: VdomElement): this.type = set("children", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def containerId(value: Double | String): this.type = set("containerId", value.asInstanceOf[js.Any])
    
    inline def containerRef(value: Ref[HTMLElement]): this.type = set("containerRef", value.asInstanceOf[js.Any])
    
    inline def containerRefFunction1(value: HTMLElement | Null => Callback): this.type = set("containerRef", js.Any.fromFunction1((t0: HTMLElement | Null) => value(t0).runNow()))
    
    inline def containerRefNull: this.type = set("containerRef", null)
    
    inline def desc(value: String): this.type = set("desc", value.asInstanceOf[js.Any])
    
    inline def events(value: DOMAttributes[Any]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def origin(value: OriginType): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def ouiaId(value: Double | String): this.type = set("ouiaId", value.asInstanceOf[js.Any])
    
    inline def ouiaSafe(value: Boolean): this.type = set("ouiaSafe", value.asInstanceOf[js.Any])
    
    inline def ouiaType(value: String): this.type = set("ouiaType", value.asInstanceOf[js.Any])
    
    inline def polar(value: Boolean): this.type = set("polar", value.asInstanceOf[js.Any])
    
    inline def portalComponent(value: VdomElement): this.type = set("portalComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def portalZIndex(value: Double): this.type = set("portalZIndex", value.asInstanceOf[js.Any])
    
    inline def preserveAspectRatio(value: String): this.type = set("preserveAspectRatio", value.asInstanceOf[js.Any])
    
    inline def responsive(value: Boolean): this.type = set("responsive", value.asInstanceOf[js.Any])
    
    inline def role(value: String): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def scale(value: `0`): this.type = set("scale", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def theme(value: VictoryThemeDefinition): this.type = set("theme", value.asInstanceOf[js.Any])
    
    inline def title(value: String): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryContainer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
