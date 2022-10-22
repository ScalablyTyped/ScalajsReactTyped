package typingsJapgolly.cookieconsent

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.cookieconsent.anon.Allow
import typingsJapgolly.cookieconsent.anon.Button
import typingsJapgolly.cookieconsent.anon.Close
import typingsJapgolly.cookieconsent.anon.Code
import typingsJapgolly.cookieconsent.anon.CodeString
import typingsJapgolly.cookieconsent.anon.CountryCode
import typingsJapgolly.cookieconsent.anon.Domain
import typingsJapgolly.cookieconsent.anon.ServiceDefinitions
import typingsJapgolly.cookieconsent.cookieconsentStrings.`bottom-left`
import typingsJapgolly.cookieconsent.cookieconsentStrings.`bottom-right`
import typingsJapgolly.cookieconsent.cookieconsentStrings.`opt-in`
import typingsJapgolly.cookieconsent.cookieconsentStrings.`opt-out`
import typingsJapgolly.cookieconsent.cookieconsentStrings.`top-left`
import typingsJapgolly.cookieconsent.cookieconsentStrings.`top-right`
import typingsJapgolly.cookieconsent.cookieconsentStrings.block
import typingsJapgolly.cookieconsent.cookieconsentStrings.bottom
import typingsJapgolly.cookieconsent.cookieconsentStrings.classic
import typingsJapgolly.cookieconsent.cookieconsentStrings.edgeless
import typingsJapgolly.cookieconsent.cookieconsentStrings.info
import typingsJapgolly.cookieconsent.cookieconsentStrings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait ComplianceTypes extends StObject {
    
    var info: String
    
    var `opt-in`: String
    
    var `opt-out`: String
  }
  object ComplianceTypes {
    
    inline def apply(info: String, `opt-in`: String, `opt-out`: String): ComplianceTypes = {
      val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any])
      __obj.updateDynamic("opt-in")(`opt-in`.asInstanceOf[js.Any])
      __obj.updateDynamic("opt-out")(`opt-out`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComplianceTypes]
    }
    
    extension [Self <: ComplianceTypes](x: Self) {
      
      inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def `setOpt-in`(value: String): Self = StObject.set(x, "opt-in", value.asInstanceOf[js.Any])
      
      inline def `setOpt-out`(value: String): Self = StObject.set(x, "opt-out", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Consent extends StObject {
    
    def getCountryCode(
      options: Options,
      success: js.Function1[/* resp */ Code, Unit],
      error: js.Function1[/* err */ js.Error, Unit]
    ): Unit = js.native
    
    var hasInitialised: Boolean = js.native
    
    var hasTransition: Boolean = js.native
    
    def initialise(options: Options): Unit = js.native
    def initialise(options: Options, success: js.Function1[/* cb */ Popup, Unit]): Unit = js.native
    def initialise(
      options: Options,
      success: js.Function1[/* cb */ Popup, Unit],
      error: js.Function1[/* cb */ Popup, Unit]
    ): Unit = js.native
    def initialise(options: Options, success: Unit, error: js.Function1[/* cb */ Popup, Unit]): Unit = js.native
  }
  
  trait Country extends StObject {
    
    var explicitAction: Boolean
    
    var hasLaw: Boolean
    
    var revokable: Boolean
  }
  object Country {
    
    inline def apply(explicitAction: Boolean, hasLaw: Boolean, revokable: Boolean): Country = {
      val __obj = js.Dynamic.literal(explicitAction = explicitAction.asInstanceOf[js.Any], hasLaw = hasLaw.asInstanceOf[js.Any], revokable = revokable.asInstanceOf[js.Any])
      __obj.asInstanceOf[Country]
    }
    
    extension [Self <: Country](x: Self) {
      
      inline def setExplicitAction(value: Boolean): Self = StObject.set(x, "explicitAction", value.asInstanceOf[js.Any])
      
      inline def setHasLaw(value: Boolean): Self = StObject.set(x, "hasLaw", value.asInstanceOf[js.Any])
      
      inline def setRevokable(value: Boolean): Self = StObject.set(x, "revokable", value.asInstanceOf[js.Any])
    }
  }
  
  trait LayoutTypes
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var basic: js.UndefOr[String] = js.undefined
  }
  object LayoutTypes {
    
    inline def apply(): LayoutTypes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutTypes]
    }
    
    extension [Self <: LayoutTypes](x: Self) {
      
      inline def setBasic(value: String): Self = StObject.set(x, "basic", value.asInstanceOf[js.Any])
      
      inline def setBasicUndefined: Self = StObject.set(x, "basic", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    var animateRevokable: js.UndefOr[Boolean] = js.undefined
    
    var autoAttach: js.UndefOr[Boolean] = js.undefined
    
    var autoOpen: js.UndefOr[Boolean] = js.undefined
    
    var blacklistPage: js.UndefOr[js.Array[String]] = js.undefined
    
    var compliance: js.UndefOr[ComplianceTypes] = js.undefined
    
    var container: js.UndefOr[HTMLElement] = js.undefined
    
    var content: js.UndefOr[Allow] = js.undefined
    
    var cookie: js.UndefOr[Domain] = js.undefined
    
    var dismissOnScroll: js.UndefOr[Boolean] = js.undefined
    
    var dismissOnTimeout: js.UndefOr[Boolean] = js.undefined
    
    var dismissOnWindowClick: js.UndefOr[Boolean] = js.undefined
    
    var elements: js.UndefOr[Close] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var ignoreClicksFrom: js.UndefOr[js.Array[String]] = js.undefined
    
    var law: js.UndefOr[CountryCode] = js.undefined
    
    var layout: js.UndefOr[LayoutTypes] = js.undefined
    
    var layouts: js.UndefOr[LayoutTypes] = js.undefined
    
    var location: js.UndefOr[ServiceDefinitions] = js.undefined
    
    var onInitialise: js.UndefOr[js.Function1[/* status */ Status, Unit]] = js.undefined
    
    var onNoCookieLaw: js.UndefOr[js.Function2[/* countryCode */ String, /* country */ Country, Unit]] = js.undefined
    
    var onPopupClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPopupOpen: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onRevokeChoice: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onStatusChange: js.UndefOr[js.Function2[/* status */ Status, /* chosenBefore */ Boolean, Unit]] = js.undefined
    
    var overrideHTML: js.UndefOr[String] = js.undefined
    
    var palette: js.UndefOr[Button] = js.undefined
    
    var position: js.UndefOr[top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`] = js.undefined
    
    var revokable: js.UndefOr[Boolean] = js.undefined
    
    var revokeBtn: js.UndefOr[String] = js.undefined
    
    var showLink: js.UndefOr[Boolean] = js.undefined
    
    var static: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[block | edgeless | classic] = js.undefined
    
    var `type`: js.UndefOr[info | `opt-in` | `opt-out`] = js.undefined
    
    var whitelistPage: js.UndefOr[js.Array[String]] = js.undefined
    
    var window: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimateRevokable(value: Boolean): Self = StObject.set(x, "animateRevokable", value.asInstanceOf[js.Any])
      
      inline def setAnimateRevokableUndefined: Self = StObject.set(x, "animateRevokable", js.undefined)
      
      inline def setAutoAttach(value: Boolean): Self = StObject.set(x, "autoAttach", value.asInstanceOf[js.Any])
      
      inline def setAutoAttachUndefined: Self = StObject.set(x, "autoAttach", js.undefined)
      
      inline def setAutoOpen(value: Boolean): Self = StObject.set(x, "autoOpen", value.asInstanceOf[js.Any])
      
      inline def setAutoOpenUndefined: Self = StObject.set(x, "autoOpen", js.undefined)
      
      inline def setBlacklistPage(value: js.Array[String]): Self = StObject.set(x, "blacklistPage", value.asInstanceOf[js.Any])
      
      inline def setBlacklistPageUndefined: Self = StObject.set(x, "blacklistPage", js.undefined)
      
      inline def setBlacklistPageVarargs(value: String*): Self = StObject.set(x, "blacklistPage", js.Array(value*))
      
      inline def setCompliance(value: ComplianceTypes): Self = StObject.set(x, "compliance", value.asInstanceOf[js.Any])
      
      inline def setComplianceUndefined: Self = StObject.set(x, "compliance", js.undefined)
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setContent(value: Allow): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setCookie(value: Domain): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      inline def setCookieUndefined: Self = StObject.set(x, "cookie", js.undefined)
      
      inline def setDismissOnScroll(value: Boolean): Self = StObject.set(x, "dismissOnScroll", value.asInstanceOf[js.Any])
      
      inline def setDismissOnScrollUndefined: Self = StObject.set(x, "dismissOnScroll", js.undefined)
      
      inline def setDismissOnTimeout(value: Boolean): Self = StObject.set(x, "dismissOnTimeout", value.asInstanceOf[js.Any])
      
      inline def setDismissOnTimeoutUndefined: Self = StObject.set(x, "dismissOnTimeout", js.undefined)
      
      inline def setDismissOnWindowClick(value: Boolean): Self = StObject.set(x, "dismissOnWindowClick", value.asInstanceOf[js.Any])
      
      inline def setDismissOnWindowClickUndefined: Self = StObject.set(x, "dismissOnWindowClick", js.undefined)
      
      inline def setElements(value: Close): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setIgnoreClicksFrom(value: js.Array[String]): Self = StObject.set(x, "ignoreClicksFrom", value.asInstanceOf[js.Any])
      
      inline def setIgnoreClicksFromUndefined: Self = StObject.set(x, "ignoreClicksFrom", js.undefined)
      
      inline def setIgnoreClicksFromVarargs(value: String*): Self = StObject.set(x, "ignoreClicksFrom", js.Array(value*))
      
      inline def setLaw(value: CountryCode): Self = StObject.set(x, "law", value.asInstanceOf[js.Any])
      
      inline def setLawUndefined: Self = StObject.set(x, "law", js.undefined)
      
      inline def setLayout(value: LayoutTypes): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
      
      inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
      
      inline def setLayouts(value: LayoutTypes): Self = StObject.set(x, "layouts", value.asInstanceOf[js.Any])
      
      inline def setLayoutsUndefined: Self = StObject.set(x, "layouts", js.undefined)
      
      inline def setLocation(value: ServiceDefinitions): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setOnInitialise(value: /* status */ Status => Callback): Self = StObject.set(x, "onInitialise", js.Any.fromFunction1((t0: /* status */ Status) => value(t0).runNow()))
      
      inline def setOnInitialiseUndefined: Self = StObject.set(x, "onInitialise", js.undefined)
      
      inline def setOnNoCookieLaw(value: (/* countryCode */ String, /* country */ Country) => Callback): Self = StObject.set(x, "onNoCookieLaw", js.Any.fromFunction2((t0: /* countryCode */ String, t1: /* country */ Country) => (value(t0, t1)).runNow()))
      
      inline def setOnNoCookieLawUndefined: Self = StObject.set(x, "onNoCookieLaw", js.undefined)
      
      inline def setOnPopupClose(value: Callback): Self = StObject.set(x, "onPopupClose", value.toJsFn)
      
      inline def setOnPopupCloseUndefined: Self = StObject.set(x, "onPopupClose", js.undefined)
      
      inline def setOnPopupOpen(value: Callback): Self = StObject.set(x, "onPopupOpen", value.toJsFn)
      
      inline def setOnPopupOpenUndefined: Self = StObject.set(x, "onPopupOpen", js.undefined)
      
      inline def setOnRevokeChoice(value: Callback): Self = StObject.set(x, "onRevokeChoice", value.toJsFn)
      
      inline def setOnRevokeChoiceUndefined: Self = StObject.set(x, "onRevokeChoice", js.undefined)
      
      inline def setOnStatusChange(value: (/* status */ Status, /* chosenBefore */ Boolean) => Callback): Self = StObject.set(x, "onStatusChange", js.Any.fromFunction2((t0: /* status */ Status, t1: /* chosenBefore */ Boolean) => (value(t0, t1)).runNow()))
      
      inline def setOnStatusChangeUndefined: Self = StObject.set(x, "onStatusChange", js.undefined)
      
      inline def setOverrideHTML(value: String): Self = StObject.set(x, "overrideHTML", value.asInstanceOf[js.Any])
      
      inline def setOverrideHTMLUndefined: Self = StObject.set(x, "overrideHTML", js.undefined)
      
      inline def setPalette(value: Button): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      inline def setPaletteUndefined: Self = StObject.set(x, "palette", js.undefined)
      
      inline def setPosition(value: top | bottom | `top-left` | `top-right` | `bottom-left` | `bottom-right`): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRevokable(value: Boolean): Self = StObject.set(x, "revokable", value.asInstanceOf[js.Any])
      
      inline def setRevokableUndefined: Self = StObject.set(x, "revokable", js.undefined)
      
      inline def setRevokeBtn(value: String): Self = StObject.set(x, "revokeBtn", value.asInstanceOf[js.Any])
      
      inline def setRevokeBtnUndefined: Self = StObject.set(x, "revokeBtn", js.undefined)
      
      inline def setShowLink(value: Boolean): Self = StObject.set(x, "showLink", value.asInstanceOf[js.Any])
      
      inline def setShowLinkUndefined: Self = StObject.set(x, "showLink", js.undefined)
      
      inline def setStatic(value: Boolean): Self = StObject.set(x, "static", value.asInstanceOf[js.Any])
      
      inline def setStaticUndefined: Self = StObject.set(x, "static", js.undefined)
      
      inline def setTheme(value: block | edgeless | classic): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setType(value: info | `opt-in` | `opt-out`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWhitelistPage(value: js.Array[String]): Self = StObject.set(x, "whitelistPage", value.asInstanceOf[js.Any])
      
      inline def setWhitelistPageUndefined: Self = StObject.set(x, "whitelistPage", js.undefined)
      
      inline def setWhitelistPageVarargs(value: String*): Self = StObject.set(x, "whitelistPage", js.Array(value*))
      
      inline def setWindow(value: String): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  trait Popup extends StObject {
    
    def autoOpen(options: Options): Unit
    
    def clearStatus(): Unit
    
    def close(showRevoke: Boolean): Unit
    
    def destroy(): Unit
    
    def fadeIn(): Unit
    
    def fadeOut(): Unit
    
    def getStatus(): Status
    
    def hasAnswered(options: Options): Unit
    
    def hasConsented(): Unit
    
    def initialise(options: Options): Unit
    
    def isOpen(): Boolean
    
    def open(): Unit
    
    def revokeChoice(preventOpen: Boolean): Unit
    
    def setStatus(status: Status): Unit
    
    def toggleRevokeButton(show: Boolean): Unit
  }
  object Popup {
    
    inline def apply(
      autoOpen: Options => Callback,
      clearStatus: Callback,
      close: Boolean => Callback,
      destroy: Callback,
      fadeIn: Callback,
      fadeOut: Callback,
      getStatus: CallbackTo[Status],
      hasAnswered: Options => Callback,
      hasConsented: Callback,
      initialise: Options => Callback,
      isOpen: CallbackTo[Boolean],
      open: Callback,
      revokeChoice: Boolean => Callback,
      setStatus: Status => Callback,
      toggleRevokeButton: Boolean => Callback
    ): Popup = {
      val __obj = js.Dynamic.literal(autoOpen = js.Any.fromFunction1((t0: Options) => autoOpen(t0).runNow()), clearStatus = clearStatus.toJsFn, close = js.Any.fromFunction1((t0: Boolean) => close(t0).runNow()), destroy = destroy.toJsFn, fadeIn = fadeIn.toJsFn, fadeOut = fadeOut.toJsFn, getStatus = getStatus.toJsFn, hasAnswered = js.Any.fromFunction1((t0: Options) => hasAnswered(t0).runNow()), hasConsented = hasConsented.toJsFn, initialise = js.Any.fromFunction1((t0: Options) => initialise(t0).runNow()), isOpen = isOpen.toJsFn, open = open.toJsFn, revokeChoice = js.Any.fromFunction1((t0: Boolean) => revokeChoice(t0).runNow()), setStatus = js.Any.fromFunction1((t0: Status) => setStatus(t0).runNow()), toggleRevokeButton = js.Any.fromFunction1((t0: Boolean) => toggleRevokeButton(t0).runNow()))
      __obj.asInstanceOf[Popup]
    }
    
    extension [Self <: Popup](x: Self) {
      
      inline def setAutoOpen(value: Options => Callback): Self = StObject.set(x, "autoOpen", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
      
      inline def setClearStatus(value: Callback): Self = StObject.set(x, "clearStatus", value.toJsFn)
      
      inline def setClose(value: Boolean => Callback): Self = StObject.set(x, "close", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setFadeIn(value: Callback): Self = StObject.set(x, "fadeIn", value.toJsFn)
      
      inline def setFadeOut(value: Callback): Self = StObject.set(x, "fadeOut", value.toJsFn)
      
      inline def setGetStatus(value: CallbackTo[Status]): Self = StObject.set(x, "getStatus", value.toJsFn)
      
      inline def setHasAnswered(value: Options => Callback): Self = StObject.set(x, "hasAnswered", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
      
      inline def setHasConsented(value: Callback): Self = StObject.set(x, "hasConsented", value.toJsFn)
      
      inline def setInitialise(value: Options => Callback): Self = StObject.set(x, "initialise", js.Any.fromFunction1((t0: Options) => value(t0).runNow()))
      
      inline def setIsOpen(value: CallbackTo[Boolean]): Self = StObject.set(x, "isOpen", value.toJsFn)
      
      inline def setOpen(value: Callback): Self = StObject.set(x, "open", value.toJsFn)
      
      inline def setRevokeChoice(value: Boolean => Callback): Self = StObject.set(x, "revokeChoice", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setSetStatus(value: Status => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: Status) => value(t0).runNow()))
      
      inline def setToggleRevokeButton(value: Boolean => Callback): Self = StObject.set(x, "toggleRevokeButton", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
    }
  }
  
  type Service = ServiceOptions | String | js.Function0[ServiceOptions]
  
  type ServiceDefinition = js.Function1[/* options */ ServiceOptions, typingsJapgolly.cookieconsent.anon.Callback]
  
  trait ServiceOptions
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var interpolateUrl: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var name: String
  }
  object ServiceOptions {
    
    inline def apply(name: String): ServiceOptions = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceOptions]
    }
    
    extension [Self <: ServiceOptions](x: Self) {
      
      inline def setInterpolateUrl(value: StringDictionary[String]): Self = StObject.set(x, "interpolateUrl", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUrlUndefined: Self = StObject.set(x, "interpolateUrl", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  type ServiceResponse = CodeString | js.Error
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cookieconsent.cookieconsentStrings.deny
    - typingsJapgolly.cookieconsent.cookieconsentStrings.allow
    - typingsJapgolly.cookieconsent.cookieconsentStrings.dismiss
  */
  trait Status extends StObject
  object Status {
    
    inline def allow: typingsJapgolly.cookieconsent.cookieconsentStrings.allow = "allow".asInstanceOf[typingsJapgolly.cookieconsent.cookieconsentStrings.allow]
    
    inline def deny: typingsJapgolly.cookieconsent.cookieconsentStrings.deny = "deny".asInstanceOf[typingsJapgolly.cookieconsent.cookieconsentStrings.deny]
    
    inline def dismiss: typingsJapgolly.cookieconsent.cookieconsentStrings.dismiss = "dismiss".asInstanceOf[typingsJapgolly.cookieconsent.cookieconsentStrings.dismiss]
  }
}
