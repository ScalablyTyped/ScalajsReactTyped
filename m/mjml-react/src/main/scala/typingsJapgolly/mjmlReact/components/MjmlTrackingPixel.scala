package typingsJapgolly.mjmlReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.mjmlReact.anon.Src
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object MjmlTrackingPixel {
  
  inline def apply(src: String): Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel] = {
    val __props = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
    new Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel](js.Array(this.component, __props.asInstanceOf[Src]))
  }
  
  @JSImport("mjml-react/extensions", "MjmlTrackingPixel")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Src): Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel] = new Default[typingsJapgolly.mjmlReact.extensionsMod.MjmlTrackingPixel](js.Array(this.component, p.asInstanceOf[js.Any]))
}
