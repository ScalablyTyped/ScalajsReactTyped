package typingsJapgolly.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.chartJs.anon.AnimationSpecdoughnutonPr
import typingsJapgolly.chartJs.chartJsBooleans.`false`
import typingsJapgolly.chartJs.chartJsStrings.center
import typingsJapgolly.chartJs.chartJsStrings.doughnut
import typingsJapgolly.chartJs.chartJsStrings.inner
import typingsJapgolly.chartJs.chartJsStrings.x
import typingsJapgolly.chartJs.chartJsStrings.y
import typingsJapgolly.chartJs.typesColorMod.Color
import typingsJapgolly.chartJs.typesGeometricMod.ChartArea
import typingsJapgolly.std.CanvasLineJoin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolarAreaControllerDatasetOptions
  extends StObject
     with DoughnutControllerDatasetOptions {
  
  /**
    * Arc angle to cover. - for polar only
    * @default circumference / (arc count)
    */
  var angle: Double
}
object PolarAreaControllerDatasetOptions {
  
  inline def apply(
    angle: Double,
    animation: `false` | AnimationSpecdoughnutonPr,
    animations: AnimationsSpec[doughnut],
    backgroundColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    borderAlign: ScriptableAndArray[center | inner, ScriptableContext[doughnut]],
    borderColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    borderJoinStyle: ScriptableAndArray[CanvasLineJoin, ScriptableContext[doughnut]],
    borderRadius: ScriptableAndArray[Double | ArcBorderRadius, ScriptableContext[doughnut]],
    borderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    circular: ScriptableAndArray[Boolean, ScriptableContext[doughnut]],
    circumference: Double,
    clip: Double | ChartArea | `false`,
    hidden: Boolean,
    hoverBackgroundColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    hoverBorderColor: ScriptableAndArray[Color, ScriptableContext[doughnut]],
    hoverBorderWidth: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    hoverOffset: ScriptableAndArray[Double, ScriptableContext[doughnut]],
    indexAxis: x | y,
    label: String,
    normalized: Boolean,
    offset: Double,
    order: Double,
    parsing: StringDictionary[String] | `false`,
    rotation: Double,
    spacing: Double,
    stack: String,
    transitions: TransitionsSpec[doughnut],
    weight: Double
  ): PolarAreaControllerDatasetOptions = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], borderAlign = borderAlign.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any], borderJoinStyle = borderJoinStyle.asInstanceOf[js.Any], borderRadius = borderRadius.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], circular = circular.asInstanceOf[js.Any], circumference = circumference.asInstanceOf[js.Any], clip = clip.asInstanceOf[js.Any], hidden = hidden.asInstanceOf[js.Any], hoverBackgroundColor = hoverBackgroundColor.asInstanceOf[js.Any], hoverBorderColor = hoverBorderColor.asInstanceOf[js.Any], hoverBorderWidth = hoverBorderWidth.asInstanceOf[js.Any], hoverOffset = hoverOffset.asInstanceOf[js.Any], indexAxis = indexAxis.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], normalized = normalized.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parsing = parsing.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any], transitions = transitions.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolarAreaControllerDatasetOptions]
  }
  
  extension [Self <: PolarAreaControllerDatasetOptions](x: Self) {
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
  }
}
