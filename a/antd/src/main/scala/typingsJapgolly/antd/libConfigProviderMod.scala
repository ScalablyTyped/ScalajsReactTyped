package typingsJapgolly.antd

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.antd.anon.AutoComplete
import typingsJapgolly.antd.anon.GetIconPrefixCls
import typingsJapgolly.antd.anon.Ghost
import typingsJapgolly.antd.anon.PartialConfigProviderProp
import typingsJapgolly.antd.anon.PickConfigProviderPropspr
import typingsJapgolly.antd.anon.RequiredMark
import typingsJapgolly.antd.anon.ShowSizeChanger
import typingsJapgolly.antd.anon.Size
import typingsJapgolly.antd.anon.WeakValidationMapConfigPr
import typingsJapgolly.antd.libConfigProviderContextMod.CSPConfig
import typingsJapgolly.antd.libConfigProviderContextMod.ConfigConsumerProps
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libConfigProviderDefaultRenderEmptyMod.RenderEmptyHandler
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libLocaleProviderMod.Locale
import typingsJapgolly.react.mod.Consumer
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.ValidationMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libConfigProviderMod {
  
  @JSImport("antd/lib/config-provider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined react.react.FC<antd.antd/lib/config-provider.ConfigProviderProps> & {  ConfigContext :react.react.Context<antd.antd/lib/config-provider/context.ConfigConsumerProps>,   SizeContext :react.react.Context<antd.antd/lib/config-provider/SizeContext.SizeType>,   config :(hasPrefixClsIconPrefixClsTheme : std.Pick<antd.antd/lib/config-provider.ConfigProviderProps, 'prefixCls' | 'iconPrefixCls'> & {  theme :antd.antd/lib/config-provider/context.Theme | undefined}): void} */
  object default {
    
    inline def apply(props: ConfigProviderProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    inline def apply(props: ConfigProviderProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
    
    @JSImport("antd/lib/config-provider", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd/lib/config-provider", "default.ConfigContext")
    @js.native
    def ConfigContext: Context[ConfigConsumerProps] = js.native
    inline def ConfigContext_=(x: Context[ConfigConsumerProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ConfigContext")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.SizeContext")
    @js.native
    def SizeContext: Context[SizeType] = js.native
    inline def SizeContext_=(x: Context[SizeType]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SizeContext")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.config")
    @js.native
    def config: js.Function1[/* hasPrefixClsIconPrefixClsTheme */ PickConfigProviderPropspr, Unit] = js.native
    inline def config_=(x: js.Function1[/* hasPrefixClsIconPrefixClsTheme */ PickConfigProviderPropspr, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("config")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.contextTypes")
    @js.native
    def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
    inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.defaultProps")
    @js.native
    def defaultProps: js.UndefOr[PartialConfigProviderProp] = js.native
    inline def defaultProps_=(x: js.UndefOr[PartialConfigProviderProp]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.displayName")
    @js.native
    def displayName: js.UndefOr[String] = js.native
    inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
    
    @JSImport("antd/lib/config-provider", "default.propTypes")
    @js.native
    def propTypes: js.UndefOr[WeakValidationMapConfigPr] = js.native
    inline def propTypes_=(x: js.UndefOr[WeakValidationMapConfigPr]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("antd/lib/config-provider", "ConfigConsumer")
  @js.native
  val ConfigConsumer: Consumer[ConfigConsumerProps] = js.native
  
  @JSImport("antd/lib/config-provider", "ConfigContext")
  @js.native
  val ConfigContext: Context[ConfigConsumerProps] = js.native
  
  @JSImport("antd/lib/config-provider", "configConsumerProps")
  @js.native
  val configConsumerProps: js.Array[String] = js.native
  
  @JSImport("antd/lib/config-provider", "defaultIconPrefixCls")
  @js.native
  val defaultIconPrefixCls: /* "anticon" */ String = js.native
  
  @JSImport("antd/lib/config-provider", "defaultPrefixCls")
  @js.native
  val defaultPrefixCls: /* "ant" */ String = js.native
  
  inline def globalConfig(): GetIconPrefixCls = ^.asInstanceOf[js.Dynamic].applyDynamic("globalConfig")().asInstanceOf[GetIconPrefixCls]
  
  trait ConfigProviderProps extends StObject {
    
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
    
    var locale: js.UndefOr[Locale] = js.undefined
    
    var pageHeader: js.UndefOr[Ghost] = js.undefined
    
    var pagination: js.UndefOr[ShowSizeChanger] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var renderEmpty: js.UndefOr[RenderEmptyHandler] = js.undefined
    
    var space: js.UndefOr[Size] = js.undefined
    
    var virtual: js.UndefOr[Boolean] = js.undefined
  }
  object ConfigProviderProps {
    
    inline def apply(): ConfigProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConfigProviderProps]
    }
    
    extension [Self <: ConfigProviderProps](x: Self) {
      
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
      
      inline def setLocale(value: Locale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
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
}
