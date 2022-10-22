package typingsJapgolly.reactMessengerCheckbox

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.dark
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.large
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.light
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.medium
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.small
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.standard
import typingsJapgolly.reactMessengerCheckbox.reactMessengerCheckboxStrings.xlarge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * <MessengerCheckbox />
    */
  @JSImport("react-messenger-checkbox", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ReactMessengerProps, js.Object, Any]
  
  /**
    * <MessengerCheckbox />
    */
  type MessengerCheckbox = japgolly.scalajs.react.facade.React.Component[ReactMessengerProps & js.Object, js.Object]
  
  trait ReactMessengerProps extends StObject {
    
    var allowLogin: js.UndefOr[Boolean] = js.undefined
    
    var appId: String
    
    var autoLogAppEvents: js.UndefOr[Boolean] = js.undefined
    
    var centerAlign: js.UndefOr[Boolean] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var onEvent: js.UndefOr[js.Function1[/* event */ Any, Unit]] = js.undefined
    
    var origin: String
    
    var pageId: String
    
    var prechecked: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[small | medium | large | standard | xlarge] = js.undefined
    
    var skin: js.UndefOr[light | dark] = js.undefined
    
    var userRef: String
    
    var version: js.UndefOr[String] = js.undefined
    
    var xfbml: js.UndefOr[Boolean] = js.undefined
  }
  object ReactMessengerProps {
    
    inline def apply(appId: String, origin: String, pageId: String, userRef: String): ReactMessengerProps = {
      val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pageId = pageId.asInstanceOf[js.Any], userRef = userRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReactMessengerProps]
    }
    
    extension [Self <: ReactMessengerProps](x: Self) {
      
      inline def setAllowLogin(value: Boolean): Self = StObject.set(x, "allowLogin", value.asInstanceOf[js.Any])
      
      inline def setAllowLoginUndefined: Self = StObject.set(x, "allowLogin", js.undefined)
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAutoLogAppEvents(value: Boolean): Self = StObject.set(x, "autoLogAppEvents", value.asInstanceOf[js.Any])
      
      inline def setAutoLogAppEventsUndefined: Self = StObject.set(x, "autoLogAppEvents", js.undefined)
      
      inline def setCenterAlign(value: Boolean): Self = StObject.set(x, "centerAlign", value.asInstanceOf[js.Any])
      
      inline def setCenterAlignUndefined: Self = StObject.set(x, "centerAlign", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setOnEvent(value: /* event */ Any => Callback): Self = StObject.set(x, "onEvent", js.Any.fromFunction1((t0: /* event */ Any) => value(t0).runNow()))
      
      inline def setOnEventUndefined: Self = StObject.set(x, "onEvent", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setPageId(value: String): Self = StObject.set(x, "pageId", value.asInstanceOf[js.Any])
      
      inline def setPrechecked(value: Boolean): Self = StObject.set(x, "prechecked", value.asInstanceOf[js.Any])
      
      inline def setPrecheckedUndefined: Self = StObject.set(x, "prechecked", js.undefined)
      
      inline def setSize(value: small | medium | large | standard | xlarge): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: light | dark): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setUserRef(value: String): Self = StObject.set(x, "userRef", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setXfbml(value: Boolean): Self = StObject.set(x, "xfbml", value.asInstanceOf[js.Any])
      
      inline def setXfbmlUndefined: Self = StObject.set(x, "xfbml", js.undefined)
    }
  }
}
