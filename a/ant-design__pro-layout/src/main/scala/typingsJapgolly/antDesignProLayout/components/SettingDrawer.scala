package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Color
import typingsJapgolly.antDesignProLayout.anon.MergerSettingsTypeProSett
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.esComponentsSettingDrawerMod.SettingDrawerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SettingDrawer {
  
  @JSImport("@ant-design/pro-layout", "SettingDrawer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def collapse(value: Boolean): this.type = set("collapse", value.asInstanceOf[js.Any])
    
    inline def colorList(value: `false` | js.Array[Color]): this.type = set("colorList", value.asInstanceOf[js.Any])
    
    inline def colorListVarargs(value: Color*): this.type = set("colorList", js.Array(value*))
    
    inline def defaultSettings(value: MergerSettingsTypeProSett): this.type = set("defaultSettings", value.asInstanceOf[js.Any])
    
    inline def disableUrlParams(value: Boolean): this.type = set("disableUrlParams", value.asInstanceOf[js.Any])
    
    inline def enableDarkTheme(value: Boolean): this.type = set("enableDarkTheme", value.asInstanceOf[js.Any])
    
    inline def getContainer(value: Any): this.type = set("getContainer", value.asInstanceOf[js.Any])
    
    inline def hideCopyButton(value: Boolean): this.type = set("hideCopyButton", value.asInstanceOf[js.Any])
    
    inline def hideHintAlert(value: Boolean): this.type = set("hideHintAlert", value.asInstanceOf[js.Any])
    
    inline def onCollapseChange(value: /* collapse */ Boolean => Callback): this.type = set("onCollapseChange", js.Any.fromFunction1((t0: /* collapse */ Boolean) => value(t0).runNow()))
    
    inline def onSettingChange(value: /* settings */ MergerSettingsTypeProSett => Callback): this.type = set("onSettingChange", js.Any.fromFunction1((t0: /* settings */ MergerSettingsTypeProSett) => value(t0).runNow()))
    
    inline def pathname(value: String): this.type = set("pathname", value.asInstanceOf[js.Any])
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
    
    inline def settings(value: MergerSettingsTypeProSett): this.type = set("settings", value.asInstanceOf[js.Any])
    
    inline def themeOnly(value: Boolean): this.type = set("themeOnly", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: SettingDrawer.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: SettingDrawerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
