package typingsJapgolly.antdMobile.components

import typingsJapgolly.antdMobile.esComponentsGridGridMod.GridItemProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object GridItem {
  
  @JSImport("antd-mobile/es/components/grid/grid", "GridItem")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: GridItem.type): SharedBuilder_GridItemProps_695251492 = new SharedBuilder_GridItemProps_695251492(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: GridItemProps): SharedBuilder_GridItemProps_695251492 = new SharedBuilder_GridItemProps_695251492(js.Array(this.component, p.asInstanceOf[js.Any]))
}
