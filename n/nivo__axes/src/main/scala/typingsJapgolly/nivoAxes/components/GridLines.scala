package typingsJapgolly.nivoAxes.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.nivoAxes.anon.Lines
import typingsJapgolly.nivoAxes.distTypesTypesMod.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridLines {
  
  inline def apply(lines: js.Array[Line]): Default[js.Object] = {
    val __props = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any])
    new Default[js.Object](js.Array(this.component, __props.asInstanceOf[/* hasLines */ Lines]))
  }
  
  @JSImport("@nivo/axes", "GridLines")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: /* hasLines */ Lines): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
}
