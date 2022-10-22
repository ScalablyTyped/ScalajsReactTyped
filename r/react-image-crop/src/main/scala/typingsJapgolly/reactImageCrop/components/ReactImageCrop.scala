package typingsJapgolly.reactImageCrop.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.reactImageCrop.mod.Crop
import typingsJapgolly.reactImageCrop.mod.PercentCrop
import typingsJapgolly.reactImageCrop.mod.ReactCropProps
import typingsJapgolly.reactImageCrop.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactImageCrop {
  
  inline def apply(onChange: (Crop, PercentCrop) => Callback, src: String): SharedBuilder_ReactCropProps_546455056[^] = {
    val __props = js.Dynamic.literal(onChange = js.Any.fromFunction2((t0: Crop, t1: PercentCrop) => (onChange(t0, t1)).runNow()), src = src.asInstanceOf[js.Any])
    new SharedBuilder_ReactCropProps_546455056[^](js.Array(this.component, __props.asInstanceOf[ReactCropProps]))
  }
  
  @JSImport("react-image-crop", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ReactCropProps): SharedBuilder_ReactCropProps_546455056[^] = new SharedBuilder_ReactCropProps_546455056[^](js.Array(this.component, p.asInstanceOf[js.Any]))
}
