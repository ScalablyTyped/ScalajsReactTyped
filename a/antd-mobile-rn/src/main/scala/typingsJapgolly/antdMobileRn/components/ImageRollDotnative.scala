package typingsJapgolly.antdMobileRn.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antdMobileRn.libImagePickerImageRollDotnativeMod.ImageRollProps
import typingsJapgolly.antdMobileRn.libImagePickerImageRollDotnativeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ImageRollDotnative {
  
  inline def apply(onCancel: Callback, onSelected: js.Object => Callback): Default[default] = {
    val __props = js.Dynamic.literal(onCancel = onCancel.toJsFn, onSelected = js.Any.fromFunction1((t0: js.Object) => onSelected(t0).runNow()))
    new Default[default](js.Array(this.component, __props.asInstanceOf[ImageRollProps]))
  }
  
  @JSImport("antd-mobile-rn/lib/image-picker/ImageRoll.native", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: ImageRollProps): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
