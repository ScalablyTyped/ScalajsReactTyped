package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesFacesRatingBarMod.FacesRatingBarProps
import typingsJapgolly.wixStyleReact.distTypesFacesRatingBarMod.facesRatingBarValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FacesRatingBar {
  
  inline def apply(value: facesRatingBarValues): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[FacesRatingBarProps]))
  }
  
  @JSImport("wix-style-react", "FacesRatingBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.FacesRatingBar] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def descriptionValues(value: js.Tuple5[String, String, js.UndefOr[String], js.UndefOr[String], js.UndefOr[String]]): this.type = set("descriptionValues", value.asInstanceOf[js.Any])
    
    inline def maxValue(value: typingsJapgolly.wixStyleReact.distTypesFacesRatingBarMod.maxValue): this.type = set("maxValue", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* rating */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* rating */ Double) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: FacesRatingBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
