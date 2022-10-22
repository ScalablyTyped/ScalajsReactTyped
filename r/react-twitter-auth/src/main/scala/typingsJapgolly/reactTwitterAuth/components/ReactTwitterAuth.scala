package typingsJapgolly.reactTwitterAuth.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactTwitterAuth.mod.TwitterLoginProps
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsJapgolly.std.HeadersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactTwitterAuth {
  
  inline def apply(
    loginUrl: String,
    onFailure: String => Callback,
    onSuccess: String => Callback,
    requestTokenUrl: String
  ): Builder = {
    val __props = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1((t0: String) => onFailure(t0).runNow()), onSuccess = js.Any.fromFunction1((t0: String) => onSuccess(t0).runNow()), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[TwitterLoginProps]))
  }
  
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def credentials(value: omit | `same-origin` | include): this.type = set("credentials", value.asInstanceOf[js.Any])
    
    inline def customHeaders(value: HeadersInit): this.type = set("customHeaders", value.asInstanceOf[js.Any])
    
    inline def customHeadersVarargs(value: (js.Tuple2[String, String])*): this.type = set("customHeaders", js.Array(value*))
    
    inline def dialogHeight(value: Double): this.type = set("dialogHeight", value.asInstanceOf[js.Any])
    
    inline def dialogWidth(value: Double): this.type = set("dialogWidth", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forceLogin(value: Boolean): this.type = set("forceLogin", value.asInstanceOf[js.Any])
    
    inline def showIcon(value: Boolean): this.type = set("showIcon", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def tag(value: ElementType): this.type = set("tag", value.asInstanceOf[js.Any])
    
    inline def text(value: String): this.type = set("text", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: TwitterLoginProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
