package typingsJapgolly.antd.components

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.Window
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antd.anon.AutoComplete
import typingsJapgolly.antd.anon.Ghost
import typingsJapgolly.antd.anon.RequiredMark
import typingsJapgolly.antd.anon.ShowSizeChanger
import typingsJapgolly.antd.anon.Size
import typingsJapgolly.antd.libConfigProviderContextMod.CSPConfig
import typingsJapgolly.antd.libConfigProviderContextMod.DirectionType
import typingsJapgolly.antd.libConfigProviderMod.ConfigProviderProps
import typingsJapgolly.antd.libConfigProviderSizeContextMod.SizeType
import typingsJapgolly.antd.libLocaleProviderMod.Locale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConfigProvider {
  
  @JSImport("antd", "ConfigProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoInsertSpaceInButton(value: Boolean): this.type = set("autoInsertSpaceInButton", value.asInstanceOf[js.Any])
    
    inline def componentDisabled(value: Boolean): this.type = set("componentDisabled", value.asInstanceOf[js.Any])
    
    inline def componentSize(value: SizeType): this.type = set("componentSize", value.asInstanceOf[js.Any])
    
    inline def csp(value: CSPConfig): this.type = set("csp", value.asInstanceOf[js.Any])
    
    inline def direction(value: DirectionType): this.type = set("direction", value.asInstanceOf[js.Any])
    
    inline def dropdownMatchSelectWidth(value: Boolean): this.type = set("dropdownMatchSelectWidth", value.asInstanceOf[js.Any])
    
    inline def form(value: RequiredMark): this.type = set("form", value.asInstanceOf[js.Any])
    
    inline def getPopupContainer(value: /* triggerNode */ js.UndefOr[HTMLElement] => HTMLElement): this.type = set("getPopupContainer", js.Any.fromFunction1(value))
    
    inline def getTargetContainer(value: CallbackTo[HTMLElement | Window]): this.type = set("getTargetContainer", value.toJsFn)
    
    inline def iconPrefixCls(value: String): this.type = set("iconPrefixCls", value.asInstanceOf[js.Any])
    
    inline def input(value: AutoComplete): this.type = set("input", value.asInstanceOf[js.Any])
    
    inline def locale(value: Locale): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def pageHeader(value: Ghost): this.type = set("pageHeader", value.asInstanceOf[js.Any])
    
    inline def pagination(value: ShowSizeChanger): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def renderEmpty(value: /* componentName */ js.UndefOr[String] => japgolly.scalajs.react.facade.React.Node): this.type = set("renderEmpty", js.Any.fromFunction1(value))
    
    inline def space(value: Size): this.type = set("space", value.asInstanceOf[js.Any])
    
    inline def virtual(value: Boolean): this.type = set("virtual", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ConfigProvider.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ConfigProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
