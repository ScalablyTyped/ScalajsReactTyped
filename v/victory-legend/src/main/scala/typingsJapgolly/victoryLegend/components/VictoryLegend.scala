package typingsJapgolly.victoryLegend.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.std.Omit
import typingsJapgolly.victoryLegend.anon.Labels
import typingsJapgolly.victoryLegend.anon.Left
import typingsJapgolly.victoryLegend.anon.Title
import typingsJapgolly.victoryLegend.esMod.VictoryLegendOrientationType
import typingsJapgolly.victoryLegend.esMod.VictoryLegendProps
import typingsJapgolly.victoryLegend.victoryLegendStrings.left
import typingsJapgolly.victoryLegend.victoryLegendStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryLegend {
  
  @JSImport("victory-legend/es", "VictoryLegend")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryLegend.esMod.VictoryLegend] {
    
    inline def borderComponent(value: VdomElement): this.type = set("borderComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def borderPadding(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PaddingProps */ Any
    ): this.type = set("borderPadding", value.asInstanceOf[js.Any])
    
    inline def centerTitle(value: Boolean): this.type = set("centerTitle", value.asInstanceOf[js.Any])
    
    inline def colorScale(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
    ): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Labels]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataComponent(value: VdomElement): this.type = set("dataComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Labels*): this.type = set("data", js.Array(value*))
    
    inline def eventKey(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any) | js.Array[String]
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def eventKeyVarargs(value: String*): this.type = set("eventKey", js.Array(value*))
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLegendTTargetType, StringOrNumberOrCallback> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictoryLegendTTargetType, StringOrNumberOrCallback> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def gutter(value: Double | Left): this.type = set("gutter", value.asInstanceOf[js.Any])
    
    inline def itemsPerRow(value: Double): this.type = set("itemsPerRow", value.asInstanceOf[js.Any])
    
    inline def orientation(value: VictoryLegendOrientationType): this.type = set("orientation", value.asInstanceOf[js.Any])
    
    inline def rowGutter(
      value: Double | (Omit[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BlockProps */ Any, 
          left | right
        ])
    ): this.type = set("rowGutter", value.asInstanceOf[js.Any])
    
    inline def style(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any) & Title
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def symbolSpacer(value: Double): this.type = set("symbolSpacer", value.asInstanceOf[js.Any])
    
    inline def title(value: String | js.Array[String]): this.type = set("title", value.asInstanceOf[js.Any])
    
    inline def titleComponent(value: VdomElement): this.type = set("titleComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def titleOrientation(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrientationTypes */ Any
    ): this.type = set("titleOrientation", value.asInstanceOf[js.Any])
    
    inline def titleVarargs(value: String*): this.type = set("title", js.Array(value*))
    
    inline def x(value: Double): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(value: Double): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryLegend.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryLegendProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
