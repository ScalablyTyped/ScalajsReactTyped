package typingsJapgolly.antd.components

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libRadioInterfaceMod.RadioGroupProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Group {
  
  object Type {
    
    @JSImport("antd/lib/radio", "Group.type")
    @js.native
    val component: js.Object = js.native
    
    implicit def make(companion: Type.type): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
    
    def withProps(p: RadioGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("antd/lib/radio", "Group")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Group.type): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: RadioGroupProps & RefAttributes[HTMLDivElement]): SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement] = new SharedBuilder_RadioGroupPropsRefAttributes967951287[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
