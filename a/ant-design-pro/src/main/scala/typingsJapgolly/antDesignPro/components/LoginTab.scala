package typingsJapgolly.antDesignPro.components

import typingsJapgolly.antDesignPro.anon.AddTab
import typingsJapgolly.antDesignPro.libLoginLoginTabMod.LoginTabProps
import typingsJapgolly.antDesignPro.libLoginLoginTabMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LoginTab {
  
  inline def apply(tabUtil: AddTab): SharedBuilder_LoginTabProps162144260[default] = {
    val __props = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
    new SharedBuilder_LoginTabProps162144260[default](js.Array(this.component, __props.asInstanceOf[LoginTabProps]))
  }
  
  @JSImport("ant-design-pro/lib/Login/LoginTab", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: LoginTabProps): SharedBuilder_LoginTabProps162144260[default] = new SharedBuilder_LoginTabProps162144260[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
