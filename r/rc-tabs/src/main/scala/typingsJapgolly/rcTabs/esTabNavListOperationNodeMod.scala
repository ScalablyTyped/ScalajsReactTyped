package typingsJapgolly.rcTabs

import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLElement
import typingsJapgolly.rcTabs.esInterfaceMod.EditableConfig
import typingsJapgolly.rcTabs.esInterfaceMod.Tab
import typingsJapgolly.rcTabs.esInterfaceMod.TabsLocale
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTabNavListOperationNodeMod extends Shortcut {
  
  @JSImport("rc-tabs/es/TabNavList/OperationNode", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]]] = js.native
  
  @js.native
  trait OperationNodeProps extends StObject {
    
    var activeKey: String = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var editable: js.UndefOr[EditableConfig] = js.native
    
    var getPopupContainer: js.UndefOr[js.Function1[/* node */ HTMLElement, HTMLElement]] = js.native
    
    var id: String = js.native
    
    var locale: js.UndefOr[TabsLocale] = js.native
    
    var mobile: Boolean = js.native
    
    var moreIcon: js.UndefOr[Node] = js.native
    
    var moreTransitionName: js.UndefOr[String] = js.native
    
    def onTabClick(key: String, e: ReactKeyboardEventFrom[Element]): Unit = js.native
    def onTabClick(key: String, e: ReactMouseEventFrom[Element]): Unit = js.native
    
    var popupClassName: js.UndefOr[String] = js.native
    
    var prefixCls: String = js.native
    
    var removeAriaLabel: js.UndefOr[String] = js.native
    
    var rtl: Boolean = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tabBarGutter: js.UndefOr[Double] = js.native
    
    var tabMoving: js.UndefOr[Boolean] = js.native
    
    var tabs: js.Array[Tab] = js.native
  }
  
  type _To = MemoExoticComponent[ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]]]
  
  /* This means you don't have to write `default`, but can instead just say `esTabNavListOperationNodeMod.foo` */
  override def _to: MemoExoticComponent[ForwardRefExoticComponent[OperationNodeProps & RefAttributes[HTMLDivElement]]] = default
}
