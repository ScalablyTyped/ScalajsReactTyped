package typingsJapgolly.antd.components

import typingsJapgolly.antd.libBadgeRibbonMod.RibbonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Ribbon {
  
  @JSImport("antd/lib/badge/Ribbon", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Ribbon.type): SharedBuilder_RibbonProps1895949547 = new SharedBuilder_RibbonProps1895949547(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RibbonProps): SharedBuilder_RibbonProps1895949547 = new SharedBuilder_RibbonProps1895949547(js.Array(this.component, p.asInstanceOf[js.Any]))
}
