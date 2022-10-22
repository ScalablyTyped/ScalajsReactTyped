package typingsJapgolly.wixUiCore.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.wixUiCore.distEsSrcComponentsSliderThumbMod.ThumbProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Thumb {
  
  inline def apply(
    onMouseEnter: Any,
    onMouseLeave: Any,
    shape: String,
    thumbPosition: CSSProperties,
    thumbSize: CSSProperties
  ): Default[typingsJapgolly.wixUiCore.distEsSrcComponentsSliderThumbMod.Thumb] = {
    val __props = js.Dynamic.literal(onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseLeave = onMouseLeave.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], thumbPosition = thumbPosition.asInstanceOf[js.Any], thumbSize = thumbSize.asInstanceOf[js.Any])
    new Default[typingsJapgolly.wixUiCore.distEsSrcComponentsSliderThumbMod.Thumb](js.Array(this.component, __props.asInstanceOf[ThumbProps]))
  }
  
  @JSImport("wix-ui-core/dist/es/src/components/slider/Thumb", "Thumb")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ThumbProps): Default[typingsJapgolly.wixUiCore.distEsSrcComponentsSliderThumbMod.Thumb] = new Default[typingsJapgolly.wixUiCore.distEsSrcComponentsSliderThumbMod.Thumb](js.Array(this.component, p.asInstanceOf[js.Any]))
}
