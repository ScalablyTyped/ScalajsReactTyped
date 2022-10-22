package typingsJapgolly.antDesignProLayout.components

import typingsJapgolly.antDesignProLayout.anon.AppList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SimpleContent {
  
  inline def apply(baseClassName: String): SharedBuilder_AppList2146500007 = {
    val __props = js.Dynamic.literal(baseClassName = baseClassName.asInstanceOf[js.Any])
    new SharedBuilder_AppList2146500007(js.Array(this.component, __props.asInstanceOf[AppList]))
  }
  
  @JSImport("@ant-design/pro-layout/es/components/AppsLogoComponents/SimpleContent", "SimpleContent")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: AppList): SharedBuilder_AppList2146500007 = new SharedBuilder_AppList2146500007(js.Array(this.component, p.asInstanceOf[js.Any]))
}
