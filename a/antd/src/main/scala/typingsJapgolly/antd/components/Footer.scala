package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libLayoutLayoutMod.BasicProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Footer {
  
  @JSImport("antd/lib/layout/layout", "Footer")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Footer.type): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicProps & RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
