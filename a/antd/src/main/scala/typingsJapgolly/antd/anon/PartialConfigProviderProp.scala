package typingsJapgolly.antd.anon

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.antd.libConfigProviderContextMod.CSPConfig
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<antd.antd/lib/config-provider.ConfigProviderProps> */
trait PartialConfigProviderProp extends StObject {
  
  var autoInsertSpaceInButton: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[Node] = js.undefined
  
  var componentDisabled: js.UndefOr[Boolean] = js.undefined
  
  var componentSize: js.UndefOr[SizeType] = js.undefined
  
  var csp: js.UndefOr[CSPConfig] = js.undefined
  
  var direction: js.UndefOr[DirectionType] = js.undefined
  
  var dropdownMatchSelectWidth: js.UndefOr[Boolean] = js.undefined
  
  var form: js.UndefOr[RequiredMark] = js.undefined
  
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ js.UndefOr[HTMLElement], HTMLElement]] = js.undefined
  
  var getTargetContainer: js.UndefOr[js.Function0[HTMLElement | Window]] = js.undefined
  
  var iconPrefixCls: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[AutoComplete] = js.undefined
  
  var locale: js.UndefOr[typingsJapgolly.antd.libLocaleProviderMod.Locale] = js.undefined
  
  var pageHeader: js.UndefOr[Ghost] = js.undefined
  
  var pagination: js.UndefOr[ShowSizeChanger] = js.undefined
  
  var prefixCls: js.UndefOr[String] = js.undefined
  
  var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
  
  var space: js.UndefOr[Size] = js.undefined
  
  var virtual: js.UndefOr[Boolean] = js.undefined
}
object PartialConfigProviderProp {
  
  inline def apply(): PartialConfigProviderProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfigProviderProp]
  }
  
  extension [Self <: PartialConfigProviderProp](x: Self) {
    
    inline def setAutoInsertSpaceInButton(value: Boolean): Self = StObject.set(x, "autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    inline def setAutoInsertSpaceInButtonUndefined: Self = StObject.set(x, "autoInsertSpaceInButton", js.undefined)
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setComponentDisabled(value: Boolean): Self = StObject.set(x, "componentDisabled", value.asInstanceOf[js.Any])
    
    inline def setComponentDisabledUndefined: Self = StObject.set(x, "componentDisabled", js.undefined)
    
    inline def setComponentSize(value: SizeType): Self = StObject.set(x, "componentSize", value.asInstanceOf[js.Any])
    
    inline def setComponentSizeUndefined: Self = StObject.set(x, "componentSize", js.undefined)
    
    inline def setCsp(value: CSPConfig): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
    
    inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
    
    inline def setDropdownMatchSelectWidth(value: Boolean): Self = StObject.set(x, "dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    inline def setDropdownMatchSelectWidthUndefined: Self = StObject.set(x, "dropdownMatchSelectWidth", js.undefined)
    
    inline def setForm(value: RequiredMark): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
    
    inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
    
    inline def setGetPopupContainer(value: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement): Self = StObject.set(x, "getPopupContainer", js.Any.fromFunction1(value))
    
    inline def setGetPopupContainerUndefined: Self = StObject.set(x, "getPopupContainer", js.undefined)
    
    inline def setGetTargetContainer(value: CallbackTo[HTMLElement | Window]): Self = StObject.set(x, "getTargetContainer", value.toJsFn)
    
    inline def setGetTargetContainerUndefined: Self = StObject.set(x, "getTargetContainer", js.undefined)
    
    inline def setIconPrefixCls(value: String): Self = StObject.set(x, "iconPrefixCls", value.asInstanceOf[js.Any])
    
    inline def setIconPrefixClsUndefined: Self = StObject.set(x, "iconPrefixCls", js.undefined)
    
    inline def setInput(value: AutoComplete): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLocale(value: typingsJapgolly.antd.libLocaleProviderMod.Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setPageHeader(value: Ghost): Self = StObject.set(x, "pageHeader", value.asInstanceOf[js.Any])
    
    inline def setPageHeaderUndefined: Self = StObject.set(x, "pageHeader", js.undefined)
    
    inline def setPagination(value: ShowSizeChanger): Self = StObject.set(x, "pagination", value.asInstanceOf[js.Any])
    
    inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    
    inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    
    inline def setRenderEmpty(value: /* componentName */ js.UndefOr[String] => Node): Self = StObject.set(x, "renderEmpty", js.Any.fromFunction1(value))
    
    inline def setRenderEmptyUndefined: Self = StObject.set(x, "renderEmpty", js.undefined)
    
    inline def setSpace(value: Size): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
    
    inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    
    inline def setVirtual(value: Boolean): Self = StObject.set(x, "virtual", value.asInstanceOf[js.Any])
    
    inline def setVirtualUndefined: Self = StObject.set(x, "virtual", js.undefined)
  }
}
