package typingsJapgolly.ckeditor4.CKEDITOR

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait pluginDefinition extends StObject {
  
  var afterInit: js.UndefOr[js.Function1[/* editor */ editor, Any]] = js.undefined
  
  var beforeInit: js.UndefOr[js.Function1[/* editor */ editor, Any]] = js.undefined
  
  var hidpi: js.UndefOr[Boolean] = js.undefined
  
  var icons: js.UndefOr[String] = js.undefined
  
  var init: js.UndefOr[js.Function1[/* editor */ editor, Unit]] = js.undefined
  
  var isSupportedEnvironment: js.UndefOr[js.Function1[/* editor */ editor, Boolean]] = js.undefined
  
  var lang: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var onLoad: js.UndefOr[js.Function0[Any]] = js.undefined
  
  var requires: js.UndefOr[String | js.Array[String]] = js.undefined
}
object pluginDefinition {
  
  inline def apply(): pluginDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[pluginDefinition]
  }
  
  extension [Self <: pluginDefinition](x: Self) {
    
    inline def setAfterInit(value: /* editor */ editor => Any): Self = StObject.set(x, "afterInit", js.Any.fromFunction1(value))
    
    inline def setAfterInitUndefined: Self = StObject.set(x, "afterInit", js.undefined)
    
    inline def setBeforeInit(value: /* editor */ editor => Any): Self = StObject.set(x, "beforeInit", js.Any.fromFunction1(value))
    
    inline def setBeforeInitUndefined: Self = StObject.set(x, "beforeInit", js.undefined)
    
    inline def setHidpi(value: Boolean): Self = StObject.set(x, "hidpi", value.asInstanceOf[js.Any])
    
    inline def setHidpiUndefined: Self = StObject.set(x, "hidpi", js.undefined)
    
    inline def setIcons(value: String): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
    
    inline def setInit(value: /* editor */ editor => Callback): Self = StObject.set(x, "init", js.Any.fromFunction1((t0: /* editor */ editor) => value(t0).runNow()))
    
    inline def setInitUndefined: Self = StObject.set(x, "init", js.undefined)
    
    inline def setIsSupportedEnvironment(value: /* editor */ editor => Boolean): Self = StObject.set(x, "isSupportedEnvironment", js.Any.fromFunction1(value))
    
    inline def setIsSupportedEnvironmentUndefined: Self = StObject.set(x, "isSupportedEnvironment", js.undefined)
    
    inline def setLang(value: String | js.Array[String]): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
    
    inline def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
    
    inline def setLangVarargs(value: String*): Self = StObject.set(x, "lang", js.Array(value*))
    
    inline def setOnLoad(value: CallbackTo[Any]): Self = StObject.set(x, "onLoad", value.toJsFn)
    
    inline def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
    
    inline def setRequires(value: String | js.Array[String]): Self = StObject.set(x, "requires", value.asInstanceOf[js.Any])
    
    inline def setRequiresUndefined: Self = StObject.set(x, "requires", js.undefined)
    
    inline def setRequiresVarargs(value: String*): Self = StObject.set(x, "requires", js.Array(value*))
  }
}
