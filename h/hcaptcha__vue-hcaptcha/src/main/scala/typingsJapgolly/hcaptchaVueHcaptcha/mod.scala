package typingsJapgolly.hcaptchaVueHcaptcha

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@hcaptcha/vue-hcaptcha", JSImport.Default)
  @js.native
  val default: HCaptcha = js.native
  
  @JSImport("@hcaptcha/vue-hcaptcha", "h")
  @js.native
  val h: HCaptcha = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify VueConstructor * / any */ trait HCaptcha extends StObject {
    
    var data: Any
    
    var methods: HCaptchaMethods
    
    var props: HCaptchaProps
  }
  object HCaptcha {
    
    inline def apply(data: Any, methods: HCaptchaMethods, props: HCaptchaProps): HCaptcha = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptcha]
    }
    
    extension [Self <: HCaptcha](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethods(value: HCaptchaMethods): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      inline def setProps(value: HCaptchaProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  trait HCaptchaMethods extends StObject {
    
    def execute(): Unit
    
    def onError(e: js.Error): Unit
    
    def onExpired(): Unit
    
    def onVerify(response: String): Unit
    
    def onloadScript(): Unit
    
    def reset(): Unit
  }
  object HCaptchaMethods {
    
    inline def apply(
      execute: Callback,
      onError: js.Error => Callback,
      onExpired: Callback,
      onVerify: String => Callback,
      onloadScript: Callback,
      reset: Callback
    ): HCaptchaMethods = {
      val __obj = js.Dynamic.literal(execute = execute.toJsFn, onError = js.Any.fromFunction1((t0: js.Error) => onError(t0).runNow()), onExpired = onExpired.toJsFn, onVerify = js.Any.fromFunction1((t0: String) => onVerify(t0).runNow()), onloadScript = onloadScript.toJsFn, reset = reset.toJsFn)
      __obj.asInstanceOf[HCaptchaMethods]
    }
    
    extension [Self <: HCaptchaMethods](x: Self) {
      
      inline def setExecute(value: Callback): Self = StObject.set(x, "execute", value.toJsFn)
      
      inline def setOnError(value: js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
      
      inline def setOnExpired(value: Callback): Self = StObject.set(x, "onExpired", value.toJsFn)
      
      inline def setOnVerify(value: String => Callback): Self = StObject.set(x, "onVerify", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnloadScript(value: Callback): Self = StObject.set(x, "onloadScript", value.toJsFn)
      
      inline def setReset(value: Callback): Self = StObject.set(x, "reset", value.toJsFn)
    }
  }
  
  trait HCaptchaProps extends StObject {
    
    var sitekey: String
    
    var size: js.UndefOr[String] = js.undefined
    
    var tabindex: js.UndefOr[String] = js.undefined
    
    var theme: js.UndefOr[String] = js.undefined
  }
  object HCaptchaProps {
    
    inline def apply(sitekey: String): HCaptchaProps = {
      val __obj = js.Dynamic.literal(sitekey = sitekey.asInstanceOf[js.Any])
      __obj.asInstanceOf[HCaptchaProps]
    }
    
    extension [Self <: HCaptchaProps](x: Self) {
      
      inline def setSitekey(value: String): Self = StObject.set(x, "sitekey", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTabindex(value: String): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
      
      inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
      
      inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  type _To = HCaptcha
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: HCaptcha = default
}
