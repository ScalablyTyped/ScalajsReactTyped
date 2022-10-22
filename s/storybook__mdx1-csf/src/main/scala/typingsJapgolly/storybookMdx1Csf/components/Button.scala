package typingsJapgolly.storybookMdx1Csf.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.storybookMdx1Csf.distTsStoriesButtonMod.ButtonProps
import typingsJapgolly.storybookMdx1Csf.storybookMdx1CsfStrings.large
import typingsJapgolly.storybookMdx1Csf.storybookMdx1CsfStrings.medium
import typingsJapgolly.storybookMdx1Csf.storybookMdx1CsfStrings.small
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  inline def apply(label: String): Builder = {
    val __props = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[ButtonProps]))
  }
  
  @JSImport("@storybook/mdx1-csf/dist/ts/stories/Button", "Button")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def backgroundColor(value: String): this.type = set("backgroundColor", value.asInstanceOf[js.Any])
    
    inline def onClick(value: Callback): this.type = set("onClick", value.toJsFn)
    
    inline def primary(value: Boolean): this.type = set("primary", value.asInstanceOf[js.Any])
    
    inline def size(value: small | medium | large): this.type = set("size", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: ButtonProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
