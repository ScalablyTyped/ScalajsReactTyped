package typingsJapgolly.nivoBullet.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoBullet.distTypesTypesMod.BulletRectsItemProps
import typingsJapgolly.nivoBullet.distTypesTypesMod.ComputedRangeDatum
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BulletRectsItem {
  
  inline def apply(
    animatedProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<BulletRectAnimatedProps> */ Any,
    borderColor: String,
    borderWidth: Double,
    color: String,
    data: ComputedRangeDatum,
    height: Double,
    index: Double,
    onClick: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    onMouseEnter: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    onMouseLeave: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    onMouseMove: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback,
    width: Double,
    x: Double,
    y: Double
  ): Default[js.Object] = {
    val __props = js.Dynamic.literal(animatedProps = animatedProps.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseLeave(t0, t1)).runNow()), onMouseMove = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseMove(t0, t1)).runNow()), width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[BulletRectsItemProps]))
  }
  
  @JSImport("@nivo/bullet/dist/types/BulletRectsItem", "BulletRectsItem")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: BulletRectsItemProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
