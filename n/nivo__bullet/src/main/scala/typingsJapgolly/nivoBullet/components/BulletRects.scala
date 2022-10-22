package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletRects {
  
  inline def apply(
    borderColor: InheritedColorConfig[ComputedRangeDatum],
    borderWidth: Double,
    component: ComponentType[BulletRectsItemProps],
    data: js.Array[ComputedRangeDatum],
    height: Double,
    layout: horizontal | vertical,
    onClick: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    onMouseEnter: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    onMouseLeave: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    reverse: Boolean,
    scale: ScaleLinear[Double],
    width: Double,
    x: Double,
    y: Double
  ): Builder = {
    val __props = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseLeave(t0, t1)).runNow()), reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BulletRectsProps]))
  }
  
  @JSImport("@nivo/bullet/dist/types/BulletRects", "BulletRects")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def animatedProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  measuresY :number,   transform :string}> */ Any
    ): this.type = set("animatedProps", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BulletRectsProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
