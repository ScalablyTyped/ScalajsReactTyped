package typingsJapgolly.antDesignPro.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antDesignPro.anon.AddTab
import typingsJapgolly.antDesignPro.libLoginLoginItemMod.LoginItemProps
import typingsJapgolly.antDesignPro.libLoginLoginTabMod.LoginTabProps
import typingsJapgolly.antDesignPro.libLoginMod.LoginProps
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Login {
  
  object Captcha {
    
    inline def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
      `type`: String,
      updateActive: Any => Callback
    ): SharedBuilder_LoginItemProps916194528 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1((t0: Any) => updateActive(t0).runNow()))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps916194528(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
    
    @JSImport("ant-design-pro", "Login.Captcha")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps916194528 = new SharedBuilder_LoginItemProps916194528(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Mobile {
    
    inline def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
      `type`: String,
      updateActive: Any => Callback
    ): SharedBuilder_LoginItemProps916194528 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1((t0: Any) => updateActive(t0).runNow()))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps916194528(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
    
    @JSImport("ant-design-pro", "Login.Mobile")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps916194528 = new SharedBuilder_LoginItemProps916194528(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Password {
    
    inline def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
      `type`: String,
      updateActive: Any => Callback
    ): SharedBuilder_LoginItemProps916194528 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1((t0: Any) => updateActive(t0).runNow()))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps916194528(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
    
    @JSImport("ant-design-pro", "Login.Password")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps916194528 = new SharedBuilder_LoginItemProps916194528(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object Tab {
    
    inline def apply(tabUtil: AddTab): SharedBuilder_LoginTabProps162144260[typingsJapgolly.antDesignPro.mod.Login.Tab] = {
      val __props = js.Dynamic.literal(tabUtil = tabUtil.asInstanceOf[js.Any])
      new SharedBuilder_LoginTabProps162144260[typingsJapgolly.antDesignPro.mod.Login.Tab](js.Array(this.component, __props.asInstanceOf[LoginTabProps]))
    }
    
    @JSImport("ant-design-pro", "Login.Tab")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginTabProps): SharedBuilder_LoginTabProps162144260[typingsJapgolly.antDesignPro.mod.Login.Tab] = new SharedBuilder_LoginTabProps162144260[typingsJapgolly.antDesignPro.mod.Login.Tab](js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  object UserName {
    
    inline def apply(
      form: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify WrappedFormUtils */ Any,
      `type`: String,
      updateActive: Any => Callback
    ): SharedBuilder_LoginItemProps916194528 = {
      val __props = js.Dynamic.literal(form = form.asInstanceOf[js.Any], updateActive = js.Any.fromFunction1((t0: Any) => updateActive(t0).runNow()))
      __props.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      new SharedBuilder_LoginItemProps916194528(js.Array(this.component, __props.asInstanceOf[LoginItemProps]))
    }
    
    @JSImport("ant-design-pro", "Login.UserName")
    @js.native
    val component: js.Object = js.native
    
    def withProps(p: LoginItemProps): SharedBuilder_LoginItemProps916194528 = new SharedBuilder_LoginItemProps916194528(js.Array(this.component, p.asInstanceOf[js.Any]))
  }
  
  @JSImport("ant-design-pro", "Login")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.antDesignPro.mod.Login] {
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultActiveKey(value: String): this.type = set("defaultActiveKey", value.asInstanceOf[js.Any])
    
    inline def onSubmit(value: (/* error */ Any, /* values */ Any) => Callback): this.type = set("onSubmit", js.Any.fromFunction2((t0: /* error */ Any, t1: /* values */ Any) => (value(t0, t1)).runNow()))
    
    inline def onTabChange(value: /* key */ String => Callback): this.type = set("onTabChange", js.Any.fromFunction1((t0: /* key */ String) => value(t0).runNow()))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Login.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: LoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
