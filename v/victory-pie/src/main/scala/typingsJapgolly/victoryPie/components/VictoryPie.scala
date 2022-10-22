package typingsJapgolly.victoryPie.components

import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.victoryPie.esMod.SliceProps
import typingsJapgolly.victoryPie.esMod.VictoryPieProps
import typingsJapgolly.victoryPie.esMod.VictorySliceLabelPlacementType
import typingsJapgolly.victoryPie.esMod.VictorySliceLabelPositionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object VictoryPie {
  
  @JSImport("victory-pie/es", "VictoryPie")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.victoryPie.esMod.VictoryPie] {
    
    inline def categories(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CategoryPropType */ Any
    ): this.type = set("categories", value.asInstanceOf[js.Any])
    
    inline def colorScale(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ColorScalePropType */ Any
    ): this.type = set("colorScale", value.asInstanceOf[js.Any])
    
    inline def cornerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SliceNumberOrCallback<SliceProps, 'cornerRadius'> */ Any
    ): this.type = set("cornerRadius", value.asInstanceOf[js.Any])
    
    inline def data(value: js.Array[Any]): this.type = set("data", value.asInstanceOf[js.Any])
    
    inline def dataComponent(value: VdomElement): this.type = set("dataComponent", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataVarargs(value: Any*): this.type = set("data", js.Array(value*))
    
    inline def endAngle(value: Double): this.type = set("endAngle", value.asInstanceOf[js.Any])
    
    inline def eventKey(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StringOrNumberOrCallback */ Any
    ): this.type = set("eventKey", value.asInstanceOf[js.Any])
    
    inline def events(
      value: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictorySliceTTargetType, StringOrNumberOrCallback | Array<string> | Array<number>> */ Any
        ]
    ): this.type = set("events", value.asInstanceOf[js.Any])
    
    inline def eventsVarargs(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify EventPropTypeInterface<VictorySliceTTargetType, StringOrNumberOrCallback | Array<string> | Array<number>> */ Any)*
    ): this.type = set("events", js.Array(value*))
    
    inline def innerRadius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("innerRadius", value.asInstanceOf[js.Any])
    
    inline def labelPlacement(
      value: VictorySliceLabelPlacementType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPlacementType])
    ): this.type = set("labelPlacement", value.asInstanceOf[js.Any])
    
    inline def labelPlacementFunction1(value: /* props */ SliceProps => VictorySliceLabelPlacementType): this.type = set("labelPlacement", js.Any.fromFunction1(value))
    
    inline def labelPosition(
      value: VictorySliceLabelPositionType | (js.Function1[/* props */ SliceProps, VictorySliceLabelPositionType])
    ): this.type = set("labelPosition", value.asInstanceOf[js.Any])
    
    inline def labelPositionFunction1(value: /* props */ SliceProps => VictorySliceLabelPositionType): this.type = set("labelPosition", js.Any.fromFunction1(value))
    
    inline def labelRadius(value: Double | (js.Function1[/* props */ SliceProps, Double])): this.type = set("labelRadius", value.asInstanceOf[js.Any])
    
    inline def labelRadiusFunction1(value: /* props */ SliceProps => Double): this.type = set("labelRadius", js.Any.fromFunction1(value))
    
    inline def origin(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OriginType */ Any
    ): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def padAngle(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("padAngle", value.asInstanceOf[js.Any])
    
    inline def radius(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NumberOrCallback */ Any
    ): this.type = set("radius", value.asInstanceOf[js.Any])
    
    inline def startAngle(value: Double): this.type = set("startAngle", value.asInstanceOf[js.Any])
    
    inline def style(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VictoryStyleInterface */ Any
    ): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def x(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
    ): this.type = set("x", value.asInstanceOf[js.Any])
    
    inline def y(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DataGetterPropType */ Any
    ): this.type = set("y", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: VictoryPie.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: VictoryPieProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
