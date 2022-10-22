package typingsJapgolly.reactTwitterAuth

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.`same-origin`
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.include
import typingsJapgolly.reactTwitterAuth.reactTwitterAuthStrings.omit
import typingsJapgolly.std.HeadersInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-twitter-auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-twitter-auth", JSImport.Default)
  @js.native
  def default: FunctionComponent[TwitterLoginProps] = js.native
  inline def default_=(x: FunctionComponent[TwitterLoginProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait TwitterLoginProps extends StObject {
    
    var children: js.UndefOr[Node] = js.undefined
    
    var credentials: js.UndefOr[omit | `same-origin` | include] = js.undefined
    
    var customHeaders: js.UndefOr[HeadersInit] = js.undefined
    
    var dialogHeight: js.UndefOr[Double] = js.undefined
    
    var dialogWidth: js.UndefOr[Double] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var forceLogin: js.UndefOr[Boolean] = js.undefined
    
    var loginUrl: String
    
    def onFailure(msg: String): Unit
    
    def onSuccess(response: String): Unit
    
    var requestTokenUrl: String
    
    var showIcon: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tag: js.UndefOr[ElementType] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object TwitterLoginProps {
    
    inline def apply(
      loginUrl: String,
      onFailure: String => Callback,
      onSuccess: String => Callback,
      requestTokenUrl: String
    ): TwitterLoginProps = {
      val __obj = js.Dynamic.literal(loginUrl = loginUrl.asInstanceOf[js.Any], onFailure = js.Any.fromFunction1((t0: String) => onFailure(t0).runNow()), onSuccess = js.Any.fromFunction1((t0: String) => onSuccess(t0).runNow()), requestTokenUrl = requestTokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwitterLoginProps]
    }
    
    extension [Self <: TwitterLoginProps](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setCredentials(value: omit | `same-origin` | include): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setCustomHeaders(value: HeadersInit): Self = StObject.set(x, "customHeaders", value.asInstanceOf[js.Any])
      
      inline def setCustomHeadersUndefined: Self = StObject.set(x, "customHeaders", js.undefined)
      
      inline def setCustomHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "customHeaders", js.Array(value*))
      
      inline def setDialogHeight(value: Double): Self = StObject.set(x, "dialogHeight", value.asInstanceOf[js.Any])
      
      inline def setDialogHeightUndefined: Self = StObject.set(x, "dialogHeight", js.undefined)
      
      inline def setDialogWidth(value: Double): Self = StObject.set(x, "dialogWidth", value.asInstanceOf[js.Any])
      
      inline def setDialogWidthUndefined: Self = StObject.set(x, "dialogWidth", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setForceLogin(value: Boolean): Self = StObject.set(x, "forceLogin", value.asInstanceOf[js.Any])
      
      inline def setForceLoginUndefined: Self = StObject.set(x, "forceLogin", js.undefined)
      
      inline def setLoginUrl(value: String): Self = StObject.set(x, "loginUrl", value.asInstanceOf[js.Any])
      
      inline def setOnFailure(value: String => Callback): Self = StObject.set(x, "onFailure", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setOnSuccess(value: String => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRequestTokenUrl(value: String): Self = StObject.set(x, "requestTokenUrl", value.asInstanceOf[js.Any])
      
      inline def setShowIcon(value: Boolean): Self = StObject.set(x, "showIcon", value.asInstanceOf[js.Any])
      
      inline def setShowIconUndefined: Self = StObject.set(x, "showIcon", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTag(value: ElementType): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
