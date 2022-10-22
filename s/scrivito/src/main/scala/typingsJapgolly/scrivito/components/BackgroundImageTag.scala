package typingsJapgolly.scrivito.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.scrivito.mod.BackgroundImageBackgroundProp
import typingsJapgolly.scrivito.mod.BackgroundImageTagProps
import typingsJapgolly.scrivito.mod.CSSPropsWithoutBackground
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BackgroundImageTag {
  
  inline def apply(style: CSSPropsWithoutBackground & BackgroundImageBackgroundProp): Builder = {
    val __props = js.Dynamic.literal(style = style.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[BackgroundImageTagProps]))
  }
  
  @JSImport("scrivito", "BackgroundImageTag")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.scrivito.mod.BackgroundImageTag] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def tag(value: String): this.type = set("tag", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: BackgroundImageTagProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
