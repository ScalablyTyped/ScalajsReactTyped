package typingsJapgolly.reactCircularProgressbar.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactCircularProgressbar.anon.Background
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarProps
import typingsJapgolly.reactCircularProgressbar.distTypesMod.CircularProgressbarStyles
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CircularProgressbar {
  
  inline def apply(
    background: Boolean,
    backgroundPadding: Double,
    circleRatio: Double,
    className: String,
    classes: Background,
    counterClockwise: Boolean,
    maxValue: Double,
    minValue: Double,
    strokeWidth: Double,
    styles: CircularProgressbarStyles,
    text: String,
    value: Double
  ): Default[typingsJapgolly.reactCircularProgressbar.mod.CircularProgressbar] = {
    val __props = js.Dynamic.literal(background = background.asInstanceOf[js.Any], backgroundPadding = backgroundPadding.asInstanceOf[js.Any], circleRatio = circleRatio.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], classes = classes.asInstanceOf[js.Any], counterClockwise = counterClockwise.asInstanceOf[js.Any], maxValue = maxValue.asInstanceOf[js.Any], minValue = minValue.asInstanceOf[js.Any], strokeWidth = strokeWidth.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Default[typingsJapgolly.reactCircularProgressbar.mod.CircularProgressbar](js.Array(this.component, __props.asInstanceOf[CircularProgressbarProps]))
  }
  
  @JSImport("react-circular-progressbar", "CircularProgressbar")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: CircularProgressbarProps): Default[typingsJapgolly.reactCircularProgressbar.mod.CircularProgressbar] = new Default[typingsJapgolly.reactCircularProgressbar.mod.CircularProgressbar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
