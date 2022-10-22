package typingsJapgolly.rcTabs.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.rcTabs.esTabNavListOperationNodeMod.OperationNodeProps
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OperationNode {
  
  inline def apply(
    activeKey: String,
    id: String,
    mobile: Boolean,
    onTabClick: (String, ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => Callback,
    prefixCls: String,
    rtl: Boolean,
    tabs: js.Array[Tab]
  ): SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement] = {
    val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2((t0: String, t1: ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => (onTabClick(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
    new SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement](js.Array(this.component, __props.asInstanceOf[OperationNodeProps & RefAttributes[HTMLDivElement]]))
  }
  
  object Type {
    
    inline def apply(
      activeKey: String,
      id: String,
      mobile: Boolean,
      onTabClick: (String, ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => Callback,
      prefixCls: String,
      rtl: Boolean,
      tabs: js.Array[Tab]
    ): SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement] = {
      val __props = js.Dynamic.literal(activeKey = activeKey.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any], onTabClick = js.Any.fromFunction2((t0: String, t1: ReactKeyboardEventFrom[Element] | ReactMouseEventFrom[Element]) => (onTabClick(t0, t1)).runNow()), prefixCls = prefixCls.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], tabs = tabs.asInstanceOf[js.Any])
      new SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement](js.Array(this.component, __props.asInstanceOf[OperationNodeProps & RefAttributes[HTMLDivElement]]))
    }
    
    @JSImport("rc-tabs/es/TabNavList/OperationNode", "default.type")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: OperationNodeProps & RefAttributes[HTMLDivElement]): SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement] = new SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OperationNodeProps & RefAttributes[HTMLDivElement]): SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement] = new SharedBuilder_OperationNodePropsRefAttributes_1023956836[HTMLDivElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
