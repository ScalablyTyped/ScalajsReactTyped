package typingsJapgolly.victoryBrushLine.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.DOMAttributes
import typingsJapgolly.victoryBrushLine.esVictoryBrushLineMod.VictoryBrushLineProps
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.x
import typingsJapgolly.victoryBrushLine.victoryBrushLineStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryBrushLine {
  
  @JSImport("victory-brush-line/es", "VictoryBrushLine")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryBrushLine.esMod.VictoryBrushLine] {
    
    inline def allowDrag(value: Boolean): this.type = set("allowDrag", value.asInstanceOf[js.Any])
    
    inline def allowDraw(value: Boolean): this.type = set("allowDraw", value.asInstanceOf[js.Any])
    
    inline def allowResize(value: Boolean): this.type = set("allowResize", value.asInstanceOf[js.Any])
    
    inline def brushAreaComponent(value: VdomElement): this.type = set("brushAreaComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def brushAreaStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
    ): this.type = set("brushAreaStyle", value.asInstanceOf[js.Any])
    
    inline def brushAreaWidth(value: Double): this.type = set("brushAreaWidth", value.asInstanceOf[js.Any])
    
    inline def brushComponent(value: VdomElement): this.type = set("brushComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def brushDomain(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ Any
    ): this.type = set("brushDomain", value.asInstanceOf[js.Any])
    
    inline def brushStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
    ): this.type = set("brushStyle", value.asInstanceOf[js.Any])
    
    inline def brushWidth(value: Double): this.type = set("brushWidth", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dimension(value: x | y): this.type = set("dimension", value.asInstanceOf[js.Any])
    
    inline def disable(value: Boolean): this.type = set("disable", value.asInstanceOf[js.Any])
    
    inline def events(value: DOMAttributes[Any]): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def groupComponent(value: VdomElement): this.type = set("groupComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def handleComponent(value: VdomElement): this.type = set("handleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def handleStyle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
    ): this.type = set("handleStyle", value.asInstanceOf[js.Any])
    
    inline def handleWidth(value: Double): this.type = set("handleWidth", value.asInstanceOf[js.Any])
    
    inline def id(value: String | Double): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def lineComponent(value: VdomElement): this.type = set("lineComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBrushDomainChange(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, /* props */ js.UndefOr[VictoryBrushLineProps]) => Callback
    ): this.type = set("onBrushDomainChange", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DomainTuple */ /* domain */ Any, t1: /* props */ js.UndefOr[VictoryBrushLineProps]) => (value(t0, t1)).runNow()))
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleObject */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryBrushLine.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryBrushLineProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
