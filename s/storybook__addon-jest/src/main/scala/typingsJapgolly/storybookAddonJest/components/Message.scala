package typingsJapgolly.storybookAddonJest.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.storybookAddonJest.distTs3Dot9ComponentsMessageMod.MessageProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Message {
  
  inline def apply(msg: String): Default[js.Object] = {
    val __props = js.Dynamic.literal(msg = msg.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[MessageProps]))
  }
  
  @JSImport("@storybook/addon-jest/dist/ts3.9/components/Message", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: MessageProps): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
