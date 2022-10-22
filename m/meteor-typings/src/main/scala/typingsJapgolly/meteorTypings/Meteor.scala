package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.meteorTypings.Blaze.TemplateInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Meteor {
  
  /** Connection **/
  trait Connection extends StObject {
    
    var clientAddress: String
    
    var close: js.Function
    
    var httpHeaders: js.Object
    
    var id: String
    
    var onClose: js.Function
  }
  object Connection {
    
    inline def apply(
      clientAddress: String,
      close: js.Function,
      httpHeaders: js.Object,
      id: String,
      onClose: js.Function
    ): Connection = {
      val __obj = js.Dynamic.literal(clientAddress = clientAddress.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], onClose = onClose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Connection]
    }
    
    extension [Self <: Connection](x: Self) {
      
      inline def setClientAddress(value: String): Self = StObject.set(x, "clientAddress", value.asInstanceOf[js.Any])
      
      inline def setClose(value: js.Function): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setHttpHeaders(value: js.Object): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOnClose(value: js.Function): Self = StObject.set(x, "onClose", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var details: js.UndefOr[String] = js.undefined
    
    var error: String | Double
    
    var reason: js.UndefOr[String] = js.undefined
  }
  object Error {
    
    inline def apply(error: String | Double): Error = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setError(value: String | Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    }
  }
  
  @js.native
  trait ErrorStatic
    extends StObject
       with Instantiable1[(/* error */ Double) | (/* error */ String), Error]
       with Instantiable2[(/* error */ Double) | (/* error */ String), /* reason */ String, Error]
       with Instantiable3[
          (/* error */ Double) | (/* error */ String), 
          (/* reason */ String) | (/* reason */ Unit), 
          /* details */ String, 
          Error
        ]
  
  /** Login **/
  /** Event **/
  trait Event extends StObject {
    
    var currentTarget: HTMLElement
    
    def isDefaultPrevented(): Boolean
    
    def isImmediatePropagationStopped(): Boolean
    
    def isPropagationStopped(): Boolean
    
    def preventDefault(): Unit
    
    def stopImmediatePropagation(): Unit
    
    def stopPropagation(): Unit
    
    var target: HTMLElement
    
    var `type`: String
    
    var which: Double
  }
  object Event {
    
    inline def apply(
      currentTarget: HTMLElement,
      isDefaultPrevented: CallbackTo[Boolean],
      isImmediatePropagationStopped: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      preventDefault: Callback,
      stopImmediatePropagation: Callback,
      stopPropagation: Callback,
      target: HTMLElement,
      `type`: String,
      which: Double
    ): Event = {
      val __obj = js.Dynamic.literal(currentTarget = currentTarget.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isImmediatePropagationStopped = isImmediatePropagationStopped.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, preventDefault = preventDefault.toJsFn, stopImmediatePropagation = stopImmediatePropagation.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setCurrentTarget(value: HTMLElement): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultPrevented(value: CallbackTo[Boolean]): Self = StObject.set(x, "isDefaultPrevented", value.toJsFn)
      
      inline def setIsImmediatePropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isImmediatePropagationStopped", value.toJsFn)
      
      inline def setIsPropagationStopped(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPropagationStopped", value.toJsFn)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setStopImmediatePropagation(value: Callback): Self = StObject.set(x, "stopImmediatePropagation", value.toJsFn)
      
      inline def setStopPropagation(value: Callback): Self = StObject.set(x, "stopPropagation", value.toJsFn)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventHandlerFunction
    extends js.Function {
    
    def apply(): Unit = js.native
    def apply(event: Unit, templateInstance: TemplateInstance): Unit = js.native
    def apply(event: Event): Unit = js.native
    def apply(event: Event, templateInstance: TemplateInstance): Unit = js.native
  }
  
  type EventMap = StringDictionary[EventHandlerFunction]
  
  trait LiveQueryHandle extends StObject {
    
    def stop(): Unit
  }
  object LiveQueryHandle {
    
    inline def apply(stop: Callback): LiveQueryHandle = {
      val __obj = js.Dynamic.literal(stop = stop.toJsFn)
      __obj.asInstanceOf[LiveQueryHandle]
    }
    
    extension [Self <: LiveQueryHandle](x: Self) {
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait LocalStorage extends StObject {
    
    var _data: Any
    
    def getItem(key: Any): Any
    
    def removeItem(key: Any): Unit
    
    def setItem(key: Any, value: Any): Any
  }
  object LocalStorage {
    
    inline def apply(_data: Any, getItem: Any => Any, removeItem: Any => Callback, setItem: (Any, Any) => Any): LocalStorage = {
      val __obj = js.Dynamic.literal(_data = _data.asInstanceOf[js.Any], getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1((t0: Any) => removeItem(t0).runNow()), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[LocalStorage]
    }
    
    extension [Self <: LocalStorage](x: Self) {
      
      inline def setGetItem(value: Any => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: Any => Callback): Self = StObject.set(x, "removeItem", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSetItem(value: (Any, Any) => Any): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
      
      inline def set_data(value: Any): Self = StObject.set(x, "_data", value.asInstanceOf[js.Any])
    }
  }
  
  /** Login **/
  trait LoginWithExternalServiceOptions extends StObject {
    
    var forceApprovalPrompt: js.UndefOr[Boolean] = js.undefined
    
    var loginHint: js.UndefOr[String] = js.undefined
    
    var loginStyle: js.UndefOr[String] = js.undefined
    
    var loginUrlParameters: js.UndefOr[js.Object] = js.undefined
    
    var redirectUrl: js.UndefOr[String] = js.undefined
    
    var requestOfflineToken: js.UndefOr[Boolean] = js.undefined
    
    var requestPermissions: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LoginWithExternalServiceOptions {
    
    inline def apply(): LoginWithExternalServiceOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoginWithExternalServiceOptions]
    }
    
    extension [Self <: LoginWithExternalServiceOptions](x: Self) {
      
      inline def setForceApprovalPrompt(value: Boolean): Self = StObject.set(x, "forceApprovalPrompt", value.asInstanceOf[js.Any])
      
      inline def setForceApprovalPromptUndefined: Self = StObject.set(x, "forceApprovalPrompt", js.undefined)
      
      inline def setLoginHint(value: String): Self = StObject.set(x, "loginHint", value.asInstanceOf[js.Any])
      
      inline def setLoginHintUndefined: Self = StObject.set(x, "loginHint", js.undefined)
      
      inline def setLoginStyle(value: String): Self = StObject.set(x, "loginStyle", value.asInstanceOf[js.Any])
      
      inline def setLoginStyleUndefined: Self = StObject.set(x, "loginStyle", js.undefined)
      
      inline def setLoginUrlParameters(value: js.Object): Self = StObject.set(x, "loginUrlParameters", value.asInstanceOf[js.Any])
      
      inline def setLoginUrlParametersUndefined: Self = StObject.set(x, "loginUrlParameters", js.undefined)
      
      inline def setRedirectUrl(value: String): Self = StObject.set(x, "redirectUrl", value.asInstanceOf[js.Any])
      
      inline def setRedirectUrlUndefined: Self = StObject.set(x, "redirectUrl", js.undefined)
      
      inline def setRequestOfflineToken(value: Boolean): Self = StObject.set(x, "requestOfflineToken", value.asInstanceOf[js.Any])
      
      inline def setRequestOfflineTokenUndefined: Self = StObject.set(x, "requestOfflineToken", js.undefined)
      
      inline def setRequestPermissions(value: js.Array[String]): Self = StObject.set(x, "requestPermissions", value.asInstanceOf[js.Any])
      
      inline def setRequestPermissionsUndefined: Self = StObject.set(x, "requestPermissions", js.undefined)
      
      inline def setRequestPermissionsVarargs(value: String*): Self = StObject.set(x, "requestPermissions", js.Array(value*))
    }
  }
  
  /** Global props **/
  /** Settings **/
  trait Settings
    extends StObject
       with /* id */ StringDictionary[Any] {
    
    var public: StringDictionary[Any]
  }
  object Settings {
    
    inline def apply(public: StringDictionary[Any]): Settings = {
      val __obj = js.Dynamic.literal(public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[Settings]
    }
    
    extension [Self <: Settings](x: Self) {
      
      inline def setPublic(value: StringDictionary[Any]): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  /** utils **/
  /** Pub/Sub **/
  trait SubscriptionHandle extends StObject {
    
    def ready(): Boolean
    
    def stop(): Unit
  }
  object SubscriptionHandle {
    
    inline def apply(ready: CallbackTo[Boolean], stop: Callback): SubscriptionHandle = {
      val __obj = js.Dynamic.literal(ready = ready.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[SubscriptionHandle]
    }
    
    extension [Self <: SubscriptionHandle](x: Self) {
      
      inline def setReady(value: CallbackTo[Boolean]): Self = StObject.set(x, "ready", value.toJsFn)
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
  
  trait User extends StObject {
    
    var _id: js.UndefOr[String] = js.undefined
    
    var createdAt: js.UndefOr[Double] = js.undefined
    
    var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
    
    var profile: js.UndefOr[Any] = js.undefined
    
    var services: js.UndefOr[Any] = js.undefined
    
    var username: js.UndefOr[String] = js.undefined
  }
  object User {
    
    inline def apply(): User = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setCreatedAt(value: Double): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
      
      inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
      
      inline def setEmails(value: js.Array[UserEmail]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
      
      inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
      
      inline def setEmailsVarargs(value: UserEmail*): Self = StObject.set(x, "emails", js.Array(value*))
      
      inline def setProfile(value: Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
      
      inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
      
      inline def setServices(value: Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
      
      inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
    }
  }
  
  /** Settings **/
  /** User **/
  trait UserEmail extends StObject {
    
    var address: String
    
    var verified: Boolean
  }
  object UserEmail {
    
    inline def apply(address: String, verified: Boolean): UserEmail = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], verified = verified.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserEmail]
    }
    
    extension [Self <: UserEmail](x: Self) {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setVerified(value: Boolean): Self = StObject.set(x, "verified", value.asInstanceOf[js.Any])
    }
  }
}
