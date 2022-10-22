package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HippyReactConfig extends StObject {
  
  /**
    * Hippy app name, it's will register to `__GLOBAL__.appRegister` object,
    * waiting the native load instance event for start the app.
    */
  var appName: String
  
  /**
    * enable global bubbles
    */
  var bubbles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The callback after rendering.
    */
  var callback: js.UndefOr[js.Function0[js.UndefOr[Unit | Null]]] = js.undefined
  
  /**
    * Entry component of Hippy app.
    */
  var entryPage: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])
  
  /**
    * Disable trace output
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}
object HippyReactConfig {
  
  inline def apply(appName: String, entryPage: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): HippyReactConfig = {
    val __obj = js.Dynamic.literal(appName = appName.asInstanceOf[js.Any], entryPage = entryPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[HippyReactConfig]
  }
  
  extension [Self <: HippyReactConfig](x: Self) {
    
    inline def setAppName(value: String): Self = StObject.set(x, "appName", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    inline def setCallback(value: CallbackTo[js.UndefOr[Unit | Null]]): Self = StObject.set(x, "callback", value.toJsFn)
    
    inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
    
    inline def setEntryPage(value: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): Self = StObject.set(x, "entryPage", value.asInstanceOf[js.Any])
    
    inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    inline def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
  }
}
