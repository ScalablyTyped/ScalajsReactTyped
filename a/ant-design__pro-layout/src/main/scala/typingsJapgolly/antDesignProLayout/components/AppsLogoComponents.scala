package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignProLayout.anon.Desc
import typingsJapgolly.antDesignProLayout.anon.PrefixCls
import typingsJapgolly.antDesignProLayout.esComponentsAppsLogoComponentsTypesMod.AppsLogoComponentsAppList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AppsLogoComponents {
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents", "AppsLogoComponents")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def appList(value: AppsLogoComponentsAppList): this.type = set("appList", value.asInstanceOf[js.Any])
    
    inline def appListVarargs(value: Desc*): this.type = set("appList", js.Array(value*))
    
    inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: AppsLogoComponents.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PrefixCls): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
