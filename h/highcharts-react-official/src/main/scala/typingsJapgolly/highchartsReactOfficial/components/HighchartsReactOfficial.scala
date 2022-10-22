package typingsJapgolly.highchartsReactOfficial.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.highchartsReactOfficial.mod.HighchartsReact.Props
import typingsJapgolly.highchartsReactOfficial.mod.HighchartsReact.RefObject
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object HighchartsReactOfficial {
  
  @JSImport("highcharts-react-official", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: HighchartsReactOfficial.type): Default[RefObject] = new Default[RefObject](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[Props] & RefAttributes[RefObject]): Default[RefObject] = new Default[RefObject](js.Array(this.component, p.asInstanceOf[js.Any]))
}
