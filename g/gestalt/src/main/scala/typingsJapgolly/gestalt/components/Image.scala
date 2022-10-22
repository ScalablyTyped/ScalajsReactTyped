package typingsJapgolly.gestalt.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gestalt.gestaltStrings.`lazy`
import typingsJapgolly.gestalt.gestaltStrings.`use-credentials`
import typingsJapgolly.gestalt.gestaltStrings.anonymous
import typingsJapgolly.gestalt.gestaltStrings.async
import typingsJapgolly.gestalt.gestaltStrings.auto
import typingsJapgolly.gestalt.gestaltStrings.contain
import typingsJapgolly.gestalt.gestaltStrings.cover
import typingsJapgolly.gestalt.gestaltStrings.eager
import typingsJapgolly.gestalt.gestaltStrings.high
import typingsJapgolly.gestalt.gestaltStrings.img
import typingsJapgolly.gestalt.gestaltStrings.low
import typingsJapgolly.gestalt.gestaltStrings.none
import typingsJapgolly.gestalt.gestaltStrings.presentation
import typingsJapgolly.gestalt.gestaltStrings.sync
import typingsJapgolly.gestalt.mod.ImageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Image {
  
  inline def apply(alt: String, color: String, naturalHeight: Double, naturalWidth: Double, src: String): Builder = {
    val __props = js.Dynamic.literal(alt = alt.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], naturalHeight = naturalHeight.asInstanceOf[js.Any], naturalWidth = naturalWidth.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ImageProps]))
  }
  
  @JSImport("gestalt", "Image")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def crossOrigin(value: anonymous | `use-credentials`): this.type = set("crossOrigin", value.asInstanceOf[js.Any])
    
    inline def decoding(value: sync | async | auto): this.type = set("decoding", value.asInstanceOf[js.Any])
    
    inline def elementTiming(value: String): this.type = set("elementTiming", value.asInstanceOf[js.Any])
    
    inline def fit(value: cover | contain | none): this.type = set("fit", value.asInstanceOf[js.Any])
    
    inline def importance(value: high | low | auto): this.type = set("importance", value.asInstanceOf[js.Any])
    
    inline def loading(value: eager | `lazy` | auto): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onError(value: Callback): this.type = set("onError", value.toJsFn)
    
    inline def onLoad(value: Callback): this.type = set("onLoad", value.toJsFn)
    
    inline def role(value: img | presentation): this.type = set("role", value.asInstanceOf[js.Any])
    
    inline def sizes(value: String): this.type = set("sizes", value.asInstanceOf[js.Any])
    
    inline def srcSet(value: String): this.type = set("srcSet", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ImageProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
