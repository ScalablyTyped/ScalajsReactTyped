package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.antd.libLayoutLayoutMod.BasicProps
import typingsJapgolly.antd.libLayoutSiderMod.SiderProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Layout {
  
  object Content {
    
    @JSImport("antd", "Layout.Content")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Content.type): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps & RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Footer {
    
    @JSImport("antd", "Layout.Footer")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Footer.type): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps & RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Header {
    
    @JSImport("antd", "Layout.Header")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Header.type): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: BasicProps & RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Sider {
    
    @JSImport("antd", "Layout.Sider")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Sider.type): SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: SiderProps & RefAttributes[HTMLDivElement]): SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement] = new SharedBuilder_SiderPropsRefAttributes_447020899[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd", "Layout")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Layout.type): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: BasicProps & RefAttributes[HTMLElement]): SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement] = new SharedBuilder_BasicPropsRefAttributes1405826332[HTMLElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
