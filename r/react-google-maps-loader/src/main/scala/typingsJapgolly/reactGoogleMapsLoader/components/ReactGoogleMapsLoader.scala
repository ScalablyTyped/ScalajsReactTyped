package typingsJapgolly.reactGoogleMapsLoader.components

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.GoogleMaps
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Params
import typingsJapgolly.reactGoogleMapsLoader.mod.ReactGoogleMapsLoader.Props
import typingsJapgolly.reactGoogleMapsLoader.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGoogleMapsLoader {
  
  inline def apply(params: Params, render: (GoogleMaps, js.UndefOr[String]) => Node): Default[default] = {
    val __props = js.Dynamic.literal(params = params.asInstanceOf[js.Any], render = js.Any.fromFunction2(render))
    new Default[default](js.Array(this.component, __props.asInstanceOf[Props]))
  }
  
  @JSImport("react-google-maps-loader", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: Props): Default[default] = new Default[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
