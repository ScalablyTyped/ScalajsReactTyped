package typingsJapgolly.nivoBullet.distTypesTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.SVGRectElement
import typingsJapgolly.nivoBullet.nivoBulletStrings.horizontal
import typingsJapgolly.nivoBullet.nivoBulletStrings.vertical
import typingsJapgolly.nivoColors.distTypesInheritedColorMod.InheritedColorConfig
import typingsJapgolly.nivoScales.distTypesTypesMod.ScaleLinear
import typingsJapgolly.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps, 'layout' | 'reverse'> & @nivo/core.@nivo/core.Dimensions & @nivo/bullet.@nivo/bullet/dist/types/types.Point & {  animatedProps :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  measuresY :number,   transform :string}> * / any | undefined,   borderColor :@nivo/colors.@nivo/colors.InheritedColorConfig<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum>,   borderWidth :number,   scale :@nivo/scales.@nivo/scales.ScaleLinear<number>,   data :std.Array<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum>,   component :@nivo/bullet.@nivo/bullet/dist/types/types.CommonBulletProps['rangeComponent'],   onMouseEnter :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum, std.SVGRectElement>,   onMouseLeave :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum, std.SVGRectElement>,   onClick :@nivo/bullet.@nivo/bullet/dist/types/types.MouseEventWithDatum<@nivo/bullet.@nivo/bullet/dist/types/types.ComputedRangeDatum, std.SVGRectElement>} */
trait BulletRectsProps extends StObject {
  
  var animatedProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  measuresY :number,   transform :string}> */ Any
  ] = js.undefined
  
  var borderColor: InheritedColorConfig[ComputedRangeDatum]
  
  var borderWidth: Double
  
  var component: ComponentType[BulletRectsItemProps]
  
  var data: js.Array[ComputedRangeDatum]
  
  var height: Double
  
  var layout: horizontal | vertical
  
  var onClick: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var onMouseEnter: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var onMouseLeave: MouseEventWithDatum[ComputedRangeDatum, SVGRectElement]
  
  var reverse: Boolean
  
  var scale: ScaleLinear[Double]
  
  var width: Double
  
  var x: Double
  
  var y: Double
}
object BulletRectsProps {
  
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
  ): BulletRectsProps = {
    val __obj = js.Dynamic.literal(borderColor = borderColor.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], onClick = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onClick(t0, t1)).runNow()), onMouseEnter = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseEnter(t0, t1)).runNow()), onMouseLeave = js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (onMouseLeave(t0, t1)).runNow()), reverse = reverse.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulletRectsProps]
  }
  
  extension [Self <: BulletRectsProps](x: Self) {
    
    inline def setAnimatedProps(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SpringValues<{  measuresY :number,   transform :string}> */ Any
    ): Self = StObject.set(x, "animatedProps", value.asInstanceOf[js.Any])
    
    inline def setAnimatedPropsUndefined: Self = StObject.set(x, "animatedProps", js.undefined)
    
    inline def setBorderColor(value: InheritedColorConfig[ComputedRangeDatum]): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setComponent(value: ComponentType[BulletRectsItemProps]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setData(value: js.Array[ComputedRangeDatum]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataVarargs(value: ComputedRangeDatum*): Self = StObject.set(x, "data", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: horizontal | vertical): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseEnter(value: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setOnMouseLeave(value: (ComputedRangeDatum, /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => Callback): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction2((t0: ComputedRangeDatum, t1: /* event */ ReactMouseEventFrom[SVGRectElement & Element]) => (value(t0, t1)).runNow()))
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setScale(value: ScaleLinear[Double]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
