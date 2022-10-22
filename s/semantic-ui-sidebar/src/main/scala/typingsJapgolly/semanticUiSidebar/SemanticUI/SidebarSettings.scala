package typingsJapgolly.semanticUiSidebar.SemanticUI

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiSidebar.JQuery
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.ClassNameSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.DefaultTransitionSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.ErrorSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.RegExpSettings
import typingsJapgolly.semanticUiSidebar.SemanticUI.Sidebar.SelectorSettings
import typingsJapgolly.semanticUiSidebar.semanticUiSidebarStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SidebarSettings {
  
  trait Impl extends StObject {
    
    // endregion
    // region DOM Settings
    var className: ClassNameSettings
    
    /**
      * Whether sidebar can be closed by clicking on page
      *
      * @default true
      */
    var closable: Boolean
    
    // region Behavior
    /**
      * Context which sidebar will appear inside
      *
      * @default 'body'
      */
    var context: String | JQuery
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    /**
      * Default transitions for each direction and screen size, used with transition: auto
      */
    var defaultTransition: DefaultTransitionSettings
    
    /**
      * When sidebar is initialized without the proper HTML, using this option will defer creation of DOM to use requestAnimationFrame.
      *
      * @default false
      */
    var delaySetup: Boolean
    
    /**
      * Whether to dim page contents when sidebar is visible
      *
      * @default true
      */
    var dimPage: Boolean
    
    /**
      * Duration of sidebar animation when using legacy Javascript animation
      *
      * @default 500
      */
    var duration: Double
    
    /**
      * Easing to use when using legacy Javascript animation
      *
      * @default 'easeInOutQuint'
      */
    var easing: String
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    /**
      * Whether multiple sidebars can be open at once
      *
      * @default false
      */
    var exclusive: Boolean
    
    /**
      * Named transition to use when animating when detecting mobile device. Defaults to 'auto' which selects transition from defaultTransition based on direction.
      *
      * @default 'auto'
      */
    var mobileTransition: String
    
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
    
    /**
      * Is called when a sidebar begins to hide or show
      */
    def onChange(): Unit
    
    /**
      * Is called after a sidebar has finished animating out.
      */
    def onHidden(): Unit
    
    /**
      * Is called before a sidebar begins to animate out.
      */
    def onHide(): Unit
    
    /**
      * Is called when a sidebar has finished animating in.
      */
    def onShow(): Unit
    
    // endregion
    // region Callbacks
    /**
      * Is called when a sidebar begins animating in.
      */
    def onVisible(): Unit
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    var regExp: RegExpSettings
    
    /**
      * Whether to return to original scroll position when sidebar is hidden, automatically occurs with transition: scale
      *
      * @default false
      */
    var returnScroll: Boolean
    
    /**
      * Whether to lock page scroll when sidebar is visible
      *
      * @default false
      */
    var scrollLock: Boolean
    
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region Animation
    /**
      * Named transition to use when animating sidebar. Defaults to 'auto' which selects transition from defaultTransition based on direction.
      *
      * @default 'auto'
      */
    var transition: String
    
    /**
      * Whether Javascript animations should be used. Defaults to false. Setting to auto will use legacy animations only for browsers that do not support CSS transforms
      *
      * @default false
      */
    var useLegacy: auto | Boolean
    
    /**
      * Debug output includes all internal behaviors
      */
    var verbose: Boolean
  }
  object Impl {
    
    inline def apply(
      className: ClassNameSettings,
      closable: Boolean,
      context: String | JQuery,
      debug: Boolean,
      defaultTransition: DefaultTransitionSettings,
      delaySetup: Boolean,
      dimPage: Boolean,
      duration: Double,
      easing: String,
      error: ErrorSettings,
      exclusive: Boolean,
      mobileTransition: String,
      name: String,
      namespace: String,
      onChange: Callback,
      onHidden: Callback,
      onHide: Callback,
      onShow: Callback,
      onVisible: Callback,
      performance: Boolean,
      regExp: RegExpSettings,
      returnScroll: Boolean,
      scrollLock: Boolean,
      selector: SelectorSettings,
      silent: Boolean,
      transition: String,
      useLegacy: auto | Boolean,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaultTransition = defaultTransition.asInstanceOf[js.Any], delaySetup = delaySetup.asInstanceOf[js.Any], dimPage = dimPage.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], mobileTransition = mobileTransition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = onChange.toJsFn, onHidden = onHidden.toJsFn, onHide = onHide.toJsFn, onShow = onShow.toJsFn, onVisible = onVisible.toJsFn, performance = performance.asInstanceOf[js.Any], regExp = regExp.asInstanceOf[js.Any], returnScroll = returnScroll.asInstanceOf[js.Any], scrollLock = scrollLock.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], useLegacy = useLegacy.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDefaultTransition(value: DefaultTransitionSettings): Self = StObject.set(x, "defaultTransition", value.asInstanceOf[js.Any])
      
      inline def setDelaySetup(value: Boolean): Self = StObject.set(x, "delaySetup", value.asInstanceOf[js.Any])
      
      inline def setDimPage(value: Boolean): Self = StObject.set(x, "dimPage", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setMobileTransition(value: String): Self = StObject.set(x, "mobileTransition", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
      
      inline def setOnHidden(value: Callback): Self = StObject.set(x, "onHidden", value.toJsFn)
      
      inline def setOnHide(value: Callback): Self = StObject.set(x, "onHide", value.toJsFn)
      
      inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
      
      inline def setOnVisible(value: Callback): Self = StObject.set(x, "onVisible", value.toJsFn)
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setRegExp(value: RegExpSettings): Self = StObject.set(x, "regExp", value.asInstanceOf[js.Any])
      
      inline def setReturnScroll(value: Boolean): Self = StObject.set(x, "returnScroll", value.asInstanceOf[js.Any])
      
      inline def setScrollLock(value: Boolean): Self = StObject.set(x, "scrollLock", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setUseLegacy(value: auto | Boolean): Self = StObject.set(x, "useLegacy", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiSidebar.anon.PickImplcontextPartialPic
    - typingsJapgolly.semanticUiSidebar.anon.PickImplexclusivePartialP
    - typingsJapgolly.semanticUiSidebar.anon.PickImplclosablePartialPi
    - typingsJapgolly.semanticUiSidebar.anon.PickImpldimPagePartialPic
    - typingsJapgolly.semanticUiSidebar.anon.PickImplscrollLockPartial
    - typingsJapgolly.semanticUiSidebar.anon.PickImplreturnScrollParti
    - typingsJapgolly.semanticUiSidebar.anon.PickImpldelaySetupPartial
    - typingsJapgolly.semanticUiSidebar.anon.PickImpltransitionPartial
    - typingsJapgolly.semanticUiSidebar.anon.PickImplmobileTransitionP
    - typingsJapgolly.semanticUiSidebar.anon.PickImpldefaultTransition
    - typingsJapgolly.semanticUiSidebar.anon.PickImpluseLegacyPartialP
    - typingsJapgolly.semanticUiSidebar.anon.PickImpldurationPartialPi
    - typingsJapgolly.semanticUiSidebar.anon.PickImpleasingPartialPick
    - typingsJapgolly.semanticUiSidebar.anon.PickImplonVisiblePartialP
    - typingsJapgolly.semanticUiSidebar.anon.PickImplonShowPartialPick
    - typingsJapgolly.semanticUiSidebar.anon.PickImplonChangePartialPi
    - typingsJapgolly.semanticUiSidebar.anon.PickImplonHidePartialPick
    - typingsJapgolly.semanticUiSidebar.anon.PickImplonHiddenPartialPi
    - typingsJapgolly.semanticUiSidebar.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiSidebar.anon.PickImplregExpPartialPick
    - typingsJapgolly.semanticUiSidebar.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiSidebar.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiSidebar.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiSidebar.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiSidebar.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiSidebar.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiSidebar.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiSidebar.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiSidebar.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImplclosablePartialPi(closable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplclosablePartialPi = {
      val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplclosablePartialPi]
    }
    
    inline def PickImplcontextPartialPic(context: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiSidebar.anon.PickImplcontextPartialPic = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplcontextPartialPic]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldefaultTransition(defaultTransition: DefaultTransitionSettings & js.UndefOr[DefaultTransitionSettings]): typingsJapgolly.semanticUiSidebar.anon.PickImpldefaultTransition = {
      val __obj = js.Dynamic.literal(defaultTransition = defaultTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpldefaultTransition]
    }
    
    inline def PickImpldelaySetupPartial(delaySetup: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImpldelaySetupPartial = {
      val __obj = js.Dynamic.literal(delaySetup = delaySetup.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpldelaySetupPartial]
    }
    
    inline def PickImpldimPagePartialPic(dimPage: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImpldimPagePartialPic = {
      val __obj = js.Dynamic.literal(dimPage = dimPage.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpldimPagePartialPic]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiSidebar.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImpleasingPartialPick(easing: String & js.UndefOr[String]): typingsJapgolly.semanticUiSidebar.anon.PickImpleasingPartialPick = {
      val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpleasingPartialPick]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiSidebar.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplexclusivePartialP(exclusive: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplexclusivePartialP = {
      val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplexclusivePartialP]
    }
    
    inline def PickImplmobileTransitionP(mobileTransition: String & js.UndefOr[String]): typingsJapgolly.semanticUiSidebar.anon.PickImplmobileTransitionP = {
      val __obj = js.Dynamic.literal(mobileTransition = mobileTransition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplmobileTransitionP]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiSidebar.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiSidebar.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonChangePartialPi(
      onChange: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSidebar.anon.PickImplonChangePartialPi = {
      val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplonChangePartialPi]
    }
    
    inline def PickImplonHiddenPartialPi(
      onHidden: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSidebar.anon.PickImplonHiddenPartialPi = {
      val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplonHiddenPartialPi]
    }
    
    inline def PickImplonHidePartialPick(
      onHide: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSidebar.anon.PickImplonHidePartialPick = {
      val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplonHidePartialPick]
    }
    
    inline def PickImplonShowPartialPick(
      onShow: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSidebar.anon.PickImplonShowPartialPick = {
      val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplonShowPartialPick]
    }
    
    inline def PickImplonVisiblePartialP(
      onVisible: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiSidebar.anon.PickImplonVisiblePartialP = {
      val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplonVisiblePartialP]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplperformancePartia]
    }
    
    inline def PickImplregExpPartialPick(regExp: RegExpSettings & js.UndefOr[RegExpSettings]): typingsJapgolly.semanticUiSidebar.anon.PickImplregExpPartialPick = {
      val __obj = js.Dynamic.literal(regExp = regExp.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplregExpPartialPick]
    }
    
    inline def PickImplreturnScrollParti(returnScroll: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplreturnScrollParti = {
      val __obj = js.Dynamic.literal(returnScroll = returnScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplreturnScrollParti]
    }
    
    inline def PickImplscrollLockPartial(scrollLock: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplscrollLockPartial = {
      val __obj = js.Dynamic.literal(scrollLock = scrollLock.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplscrollLockPartial]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiSidebar.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiSidebar.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpltransitionPartial]
    }
    
    inline def PickImpluseLegacyPartialP(useLegacy: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiSidebar.anon.PickImpluseLegacyPartialP = {
      val __obj = js.Dynamic.literal(useLegacy = useLegacy.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImpluseLegacyPartialP]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiSidebar.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiSidebar.anon.PickImplverbosePartialPic]
    }
  }
}
