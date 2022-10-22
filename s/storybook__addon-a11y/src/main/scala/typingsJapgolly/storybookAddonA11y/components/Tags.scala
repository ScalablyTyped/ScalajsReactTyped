package typingsJapgolly.storybookAddonA11y.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.axeCore.mod.TagValue
import typingsJapgolly.storybookAddonA11y.distTs3Dot9ComponentsReportTagsMod.TagsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tags {
  
  inline def apply(tags: js.Array[TagValue]): Default[js.Object] = {
    val __props = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[TagsProps]))
  }
  
  @JSImport("@storybook/addon-a11y/dist/ts3.9/components/Report/Tags", "Tags")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: TagsProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
