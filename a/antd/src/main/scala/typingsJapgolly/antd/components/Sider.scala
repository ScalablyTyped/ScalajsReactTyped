package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libLayoutSiderMod.SiderProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Sider {
  
  @JSImport("antd/lib/layout/Sider", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Sider.type): SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SiderProps & RefAttributes[HTMLDivElement]): SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
