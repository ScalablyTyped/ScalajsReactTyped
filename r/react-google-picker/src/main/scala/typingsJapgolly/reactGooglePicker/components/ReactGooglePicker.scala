package typingsJapgolly.reactGooglePicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.gapi.GoogleApiOAuth2TokenObject
import typingsJapgolly.googlePicker.google.picker.ResponseObject
import typingsJapgolly.react.mod.PropsWithChildren
import typingsJapgolly.reactGooglePicker.mod.GooglePickerProps
import typingsJapgolly.reactGooglePicker.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactGooglePicker {
  
  inline def apply(clientId: String, developerKey: String): Builder = {
    val __props = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], developerKey = developerKey.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[PropsWithChildren[GooglePickerProps]]))
  }
  
  @JSImport("react-google-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def authImmediate(value: Boolean): this.type = set("authImmediate", value.asInstanceOf[js.Any])
    
    inline def createPicker(
      value: (/* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof self.google */ /* google */ Any, /* oauthToken */ String) => Callback
    ): this.type = set("createPicker", js.Any.fromFunction2((t0: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof self.google */ /* google */ Any, t1: /* oauthToken */ String) => (value(t0, t1)).runNow()))
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def mimeTypes(value: js.Array[String]): this.type = set("mimeTypes", value.asInstanceOf[js.Any])
    
    inline def mimeTypesVarargs(value: String*): this.type = set("mimeTypes", js.Array(value*))
    
    inline def multiselect(value: Boolean): this.type = set("multiselect", value.asInstanceOf[js.Any])
    
    inline def navHidden(value: Boolean): this.type = set("navHidden", value.asInstanceOf[js.Any])
    
    inline def onAuthFailed(value: /* response */ GoogleApiOAuth2TokenObject => Callback): this.type = set("onAuthFailed", js.Any.fromFunction1((t0: /* response */ GoogleApiOAuth2TokenObject) => value(t0).runNow()))
    
    inline def onAuthenticate(value: /* oauthToken */ String => Callback): this.type = set("onAuthenticate", js.Any.fromFunction1((t0: /* oauthToken */ String) => value(t0).runNow()))
    
    inline def onChange(value: /* result */ ResponseObject => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* result */ ResponseObject) => value(t0).runNow()))
    
    inline def origin(value: String): this.type = set("origin", value.asInstanceOf[js.Any])
    
    inline def query(value: String): this.type = set("query", value.asInstanceOf[js.Any])
    
    inline def scope(value: js.Array[String]): this.type = set("scope", value.asInstanceOf[js.Any])
    
    inline def scopeVarargs(value: String*): this.type = set("scope", js.Array(value*))
    
    inline def viewId(
      value: /* keyof / * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof google.picker.ViewId * / any */ String
    ): this.type = set("viewId", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: PropsWithChildren[GooglePickerProps]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
