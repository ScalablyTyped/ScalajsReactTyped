package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesStarsRatingBarMod.StarsRatingBarProps
import typingsJapgolly.wixStyleReact.distTypesStarsRatingBarMod.starRatingBarSize
import typingsJapgolly.wixStyleReact.distTypesStarsRatingBarMod.starRatingBarValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object StarsRatingBar {
  
  inline def apply(value: starRatingBarValue): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StarsRatingBarProps]))
  }
  
  @JSImport("wix-style-react", "StarsRatingBar")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.StarsRatingBar] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def descriptionValues(value: js.Tuple5[String, String, String, String, String]): this.type = set("descriptionValues", value.asInstanceOf[js.Any])
    
    inline def onChange(value: /* rate */ Double => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* rate */ Double) => value(t0).runNow()))
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def size(value: starRatingBarSize): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StarsRatingBarProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
