package typingsJapgolly.semanticUiNag

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.AnimationSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.AnimationSettings.Param
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ClassNameSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.ErrorSettings
import typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings
import typingsJapgolly.semanticUiNag.semanticUiNagBooleans.`false`
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.clear
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.cookie
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.destroy
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.hide
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.localstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.sessionstorage
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.setting
import typingsJapgolly.semanticUiNag.semanticUiNagStrings.show
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Nag extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Clears cookie so nag shows again
      */
    def apply(behavior: clear): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    def apply(behavior: hide): JQuery = js.native
    def apply(behavior: setting, value: NagSettings): JQuery = js.native
    def apply(behavior: show): JQuery = js.native
    def apply(settings: NagSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-nag.SemanticUI.NagSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-nag.SemanticUI.NagSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-nag.SemanticUI.NagSettings._Impl[K] */ js.Any = js.native
    
    var settings: NagSettings = js.native
  }
  object Nag {
    
    object AnimationSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'slide'
          */
        var hide: String
        
        /**
          * @default 'slide'
          */
        var show: String
      }
      object Impl {
        
        inline def apply(hide: String, show: String): Impl = {
          val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any], show = show.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setHide(value: String): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
          
          inline def setShow(value: String): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiNag.anon.PickImplshowPartialPickIm
        - typingsJapgolly.semanticUiNag.anon.PickImplhidePartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplhidePartialPickIm(hide: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplhidePartialPickIm = {
          val __obj = js.Dynamic.literal(hide = hide.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplhidePartialPickIm]
        }
        
        inline def PickImplshowPartialPickIm(show: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplshowPartialPickIm = {
          val __obj = js.Dynamic.literal(show = show.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplshowPartialPickIm]
        }
      }
    }
    type AnimationSettings = Param
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'bottom'
          */
        var bottom: String
        
        /**
          * @default 'fixed'
          */
        var fixed: String
      }
      object Impl {
        
        inline def apply(bottom: String, fixed: String): Impl = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
          
          inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiNag.anon.PickImplbottomPartialPick
        - typingsJapgolly.semanticUiNag.anon.PickImplfixedPartialPickI
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplbottomPartialPick(bottom: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplbottomPartialPick = {
          val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplbottomPartialPick]
        }
        
        inline def PickImplfixedPartialPickI(fixed: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplfixedPartialPickI = {
          val __obj = js.Dynamic.literal(fixed = fixed.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplfixedPartialPickI]
        }
      }
    }
    type ClassNameSettings = typingsJapgolly.semanticUiNag.SemanticUI.Nag.ClassNameSettings.Param
    
    object ErrorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String
        
        /**
          * @default '$.cookie is not included. A storage solution is required.'
          */
        var noCookieStorage: String
        
        /**
          * @default 'Neither $.cookie or store is defined. A storage solution is required for storing state'
          */
        var noStorage: String
      }
      object Impl {
        
        inline def apply(method: String, noCookieStorage: String, noStorage: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], noCookieStorage = noCookieStorage.asInstanceOf[js.Any], noStorage = noStorage.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
          
          inline def setNoCookieStorage(value: String): Self = StObject.set(x, "noCookieStorage", value.asInstanceOf[js.Any])
          
          inline def setNoStorage(value: String): Self = StObject.set(x, "noStorage", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiNag.anon.PickImplnoCookieStoragePa
        - typingsJapgolly.semanticUiNag.anon.PickImplnoStoragePartialP
        - typingsJapgolly.semanticUiNag.anon.PickImplmethodPartialPick
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplmethodPartialPick(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplmethodPartialPick = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplmethodPartialPick]
        }
        
        inline def PickImplnoCookieStoragePa(noCookieStorage: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplnoCookieStoragePa = {
          val __obj = js.Dynamic.literal(noCookieStorage = noCookieStorage.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplnoCookieStoragePa]
        }
        
        inline def PickImplnoStoragePartialP(noStorage: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplnoStoragePartialP = {
          val __obj = js.Dynamic.literal(noStorage = noStorage.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplnoStoragePartialP]
        }
      }
    }
    type ErrorSettings = typingsJapgolly.semanticUiNag.SemanticUI.Nag.ErrorSettings.Param
    
    /* Inlined semantic-ui-nag.SemanticUI.Nag.SelectorSettings.Param */
    trait SelectorSettings extends StObject {
      
      var close: String & js.UndefOr[String]
    }
    object SelectorSettings {
      
      inline def apply(close: String & js.UndefOr[String]): SelectorSettings = {
        val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
        __obj.asInstanceOf[SelectorSettings]
      }
      
      trait Impl extends StObject {
        
        /**
          * @default '.close.icon'
          */
        var close: String
      }
      object Impl {
        
        inline def apply(close: String): Impl = {
          val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, 'close'> & std.Partial<std.Pick<semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl, keyof semantic-ui-nag.SemanticUI.Nag.SelectorSettings._Impl>> */
      trait Param extends StObject {
        
        var close: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(close: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param = {
          val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiNag.SemanticUI.Nag.SelectorSettings.Param](x: Self) {
          
          inline def setClose(value: String & js.UndefOr[String]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
        }
      }
      
      extension [Self <: SelectorSettings](x: Self) {
        
        inline def setClose(value: String & js.UndefOr[String]): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object NagSettings {
    
    trait Impl extends StObject {
      
      var animation: AnimationSettings
      
      // endregion
      // region DOM Settings
      var className: ClassNameSettings
      
      /**
        * @default false
        */
      var context: `false` | String | JQuery
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * @default false
        */
      var detachable: Boolean
      
      /**
        * set to zero to require manually dismissal, otherwise hides on its own
        *
        * @default 0
        */
      var displayTime: Double
      
      /**
        * @default false
        */
      var domain: `false` | String
      
      /**
        * @default 'easeOutQuad'
        */
      var easing: String
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * @default 30
        */
      var expires: Double
      
      /**
        * @default 'nag'
        */
      var key: Any
      
      // endregion
      // region Debug Settings
      /**
        * Name used in log statements
        */
      var name: String
      
      // endregion
      // region Component Settings
      // region DOM Settings
      /**
        * Event namespace. Makes sure module teardown does not effect other events attached to an element.
        */
      var namespace: String
      
      // endregion
      // region Callbacks
      def onHide(): Unit
      
      /**
        * @default '/'
        */
      var path: String
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // region Behavior
      /**
        * allows cookie to be overridden
        *
        * @default false
        */
      var persist: Boolean
      
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * @default 500
        */
      var speed: Double
      
      /**
        * type of storage to use
        *
        * @default 'cookie'
        */
      var storageMethod: cookie | localstorage | sessionstorage
      
      /**
        * @default 'dismiss'
        */
      var value: Any
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        animation: AnimationSettings,
        className: ClassNameSettings,
        context: `false` | String | JQuery,
        debug: Boolean,
        detachable: Boolean,
        displayTime: Double,
        domain: `false` | String,
        easing: String,
        error: ErrorSettings,
        expires: Double,
        key: Any,
        name: String,
        namespace: String,
        onHide: Callback,
        path: String,
        performance: Boolean,
        persist: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        speed: Double,
        storageMethod: cookie | localstorage | sessionstorage,
        value: Any,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], displayTime = displayTime.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onHide = onHide.toJsFn, path = path.asInstanceOf[js.Any], performance = performance.asInstanceOf[js.Any], persist = persist.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], storageMethod = storageMethod.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAnimation(value: AnimationSettings): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setContext(value: `false` | String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
        
        inline def setDisplayTime(value: Double): Self = StObject.set(x, "displayTime", value.asInstanceOf[js.Any])
        
        inline def setDomain(value: `false` | String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
        
        inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
        
        inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setPersist(value: Boolean): Self = StObject.set(x, "persist", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
        
        inline def setStorageMethod(value: cookie | localstorage | sessionstorage): Self = StObject.set(x, "storageMethod", value.asInstanceOf[js.Any])
        
        inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiNag.anon.PickImplpersistPartialPic
      - typingsJapgolly.semanticUiNag.anon.PickImpldisplayTimePartia
      - typingsJapgolly.semanticUiNag.anon.PickImplanimationPartialP
      - typingsJapgolly.semanticUiNag.anon.PickImplcontextPartialPic
      - typingsJapgolly.semanticUiNag.anon.PickImpldetachablePartial
      - typingsJapgolly.semanticUiNag.anon.PickImplexpiresPartialPic
      - typingsJapgolly.semanticUiNag.anon.PickImpldomainPartialPick
      - typingsJapgolly.semanticUiNag.anon.PickImplpathPartialPickIm
      - typingsJapgolly.semanticUiNag.anon.PickImplstorageMethodPart
      - typingsJapgolly.semanticUiNag.anon.PickImplkeyPartialPickImp
      - typingsJapgolly.semanticUiNag.anon.PickImplvaluePartialPickI
      - typingsJapgolly.semanticUiNag.anon.PickImplspeedPartialPickI
      - typingsJapgolly.semanticUiNag.anon.PickImpleasingPartialPick
      - typingsJapgolly.semanticUiNag.anon.PickImplonHidePartialPick
      - typingsJapgolly.semanticUiNag.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiNag.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiNag.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiNag.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiNag.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiNag.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiNag.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiNag.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiNag.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplanimationPartialP(animation: AnimationSettings & js.UndefOr[AnimationSettings]): typingsJapgolly.semanticUiNag.anon.PickImplanimationPartialP = {
        val __obj = js.Dynamic.literal(animation = animation.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplanimationPartialP]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiNag.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcontextPartialPic(context: (`false` | String | JQuery) & (js.UndefOr[`false` | String | JQuery])): typingsJapgolly.semanticUiNag.anon.PickImplcontextPartialPic = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplcontextPartialPic]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldetachablePartial(detachable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImpldetachablePartial = {
        val __obj = js.Dynamic.literal(detachable = detachable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImpldetachablePartial]
      }
      
      inline def PickImpldisplayTimePartia(displayTime: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiNag.anon.PickImpldisplayTimePartia = {
        val __obj = js.Dynamic.literal(displayTime = displayTime.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImpldisplayTimePartia]
      }
      
      inline def PickImpldomainPartialPick(domain: (`false` | String) & (js.UndefOr[`false` | String])): typingsJapgolly.semanticUiNag.anon.PickImpldomainPartialPick = {
        val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImpldomainPartialPick]
      }
      
      inline def PickImpleasingPartialPick(easing: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImpleasingPartialPick = {
        val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImpleasingPartialPick]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiNag.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplexpiresPartialPic(expires: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiNag.anon.PickImplexpiresPartialPic = {
        val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplexpiresPartialPic]
      }
      
      inline def PickImplkeyPartialPickImp(key: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiNag.anon.PickImplkeyPartialPickImp = {
        val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplkeyPartialPickImp]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonHidePartialPick(
        onHide: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiNag.anon.PickImplonHidePartialPick = {
        val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplonHidePartialPick]
      }
      
      inline def PickImplpathPartialPickIm(path: String & js.UndefOr[String]): typingsJapgolly.semanticUiNag.anon.PickImplpathPartialPickIm = {
        val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplpathPartialPickIm]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplperformancePartia]
      }
      
      inline def PickImplpersistPartialPic(persist: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImplpersistPartialPic = {
        val __obj = js.Dynamic.literal(persist = persist.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplpersistPartialPic]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiNag.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplspeedPartialPickI(speed: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiNag.anon.PickImplspeedPartialPickI = {
        val __obj = js.Dynamic.literal(speed = speed.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplspeedPartialPickI]
      }
      
      inline def PickImplstorageMethodPart(
        storageMethod: (cookie | localstorage | sessionstorage) & (js.UndefOr[cookie | localstorage | sessionstorage])
      ): typingsJapgolly.semanticUiNag.anon.PickImplstorageMethodPart = {
        val __obj = js.Dynamic.literal(storageMethod = storageMethod.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplstorageMethodPart]
      }
      
      inline def PickImplvaluePartialPickI(value: Any & js.UndefOr[Any]): typingsJapgolly.semanticUiNag.anon.PickImplvaluePartialPickI = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplvaluePartialPickI]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiNag.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiNag.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/nag.html}
    */
  type NagSettings = typingsJapgolly.semanticUiNag.SemanticUI.NagSettings.Param
}
