package typingsJapgolly.reactGooglePicker

import japgolly.scalajs.react.Callback
import typingsJapgolly.gapi.GoogleApiOAuth2TokenObject
import typingsJapgolly.googlePicker.google.picker.ResponseObject
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.PropsWithChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-google-picker", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PropsWithChildren[GooglePickerProps], js.Object, Any]
  
  type GooglePicker = japgolly.scalajs.react.facade.React.Component[PropsWithChildren[GooglePickerProps] & js.Object, js.Object]
  
  trait GooglePickerProps extends StObject {
    
    var authImmediate: js.UndefOr[Boolean] = js.undefined
    
    var clientId: String
    
    var createPicker: js.UndefOr[
        js.Function2[
          /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof self.google */ /* google */ Any, 
          /* oauthToken */ String, 
          Unit
        ]
      ] = js.undefined
    
    var developerKey: String
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var mimeTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    var multiselect: js.UndefOr[Boolean] = js.undefined
    
    var navHidden: js.UndefOr[Boolean] = js.undefined
    
    var onAuthFailed: js.UndefOr[js.Function1[/* response */ GoogleApiOAuth2TokenObject, Unit]] = js.undefined
    
    var onAuthenticate: js.UndefOr[js.Function1[/* oauthToken */ String, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* result */ ResponseObject, Unit]] = js.undefined
    
    var origin: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[String] = js.undefined
    
    var scope: js.UndefOr[js.Array[String]] = js.undefined
    
    var viewId: js.UndefOr[
        /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.picker.ViewId * / any */ String
      ] = js.undefined
  }
  object GooglePickerProps {
    
    inline def apply(clientId: String, developerKey: String): GooglePickerProps = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], developerKey = developerKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[GooglePickerProps]
    }
    
    extension [Self <: GooglePickerProps](x: Self) {
      
      inline def setAuthImmediate(value: Boolean): Self = StObject.set(x, "authImmediate", value.asInstanceOf[js.Any])
      
      inline def setAuthImmediateUndefined: Self = StObject.set(x, "authImmediate", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setCreatePicker(
        value: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof self.google */ /* google */ Any, /* oauthToken */ String) => Callback
      ): Self = StObject.set(x, "createPicker", js.Any.fromFunction2((t0: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof self.google */ /* google */ Any, t1: /* oauthToken */ String) => (value(t0, t1)).runNow()))
      
      inline def setCreatePickerUndefined: Self = StObject.set(x, "createPicker", js.undefined)
      
      inline def setDeveloperKey(value: String): Self = StObject.set(x, "developerKey", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setMimeTypes(value: js.Array[String]): Self = StObject.set(x, "mimeTypes", value.asInstanceOf[js.Any])
      
      inline def setMimeTypesUndefined: Self = StObject.set(x, "mimeTypes", js.undefined)
      
      inline def setMimeTypesVarargs(value: String*): Self = StObject.set(x, "mimeTypes", js.Array(value*))
      
      inline def setMultiselect(value: Boolean): Self = StObject.set(x, "multiselect", value.asInstanceOf[js.Any])
      
      inline def setMultiselectUndefined: Self = StObject.set(x, "multiselect", js.undefined)
      
      inline def setNavHidden(value: Boolean): Self = StObject.set(x, "navHidden", value.asInstanceOf[js.Any])
      
      inline def setNavHiddenUndefined: Self = StObject.set(x, "navHidden", js.undefined)
      
      inline def setOnAuthFailed(value: /* response */ GoogleApiOAuth2TokenObject => Callback): Self = StObject.set(x, "onAuthFailed", js.Any.fromFunction1((t0: /* response */ GoogleApiOAuth2TokenObject) => value(t0).runNow()))
      
      inline def setOnAuthFailedUndefined: Self = StObject.set(x, "onAuthFailed", js.undefined)
      
      inline def setOnAuthenticate(value: /* oauthToken */ String => Callback): Self = StObject.set(x, "onAuthenticate", js.Any.fromFunction1((t0: /* oauthToken */ String) => value(t0).runNow()))
      
      inline def setOnAuthenticateUndefined: Self = StObject.set(x, "onAuthenticate", js.undefined)
      
      inline def setOnChange(value: /* result */ ResponseObject => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* result */ ResponseObject) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setScope(value: js.Array[String]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: String*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setViewId(
        value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.picker.ViewId * / any */ String
      ): Self = StObject.set(x, "viewId", value.asInstanceOf[js.Any])
      
      inline def setViewIdUndefined: Self = StObject.set(x, "viewId", js.undefined)
    }
  }
}
