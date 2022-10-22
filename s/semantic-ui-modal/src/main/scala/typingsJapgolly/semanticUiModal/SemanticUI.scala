package typingsJapgolly.semanticUiModal

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiDimmer.SemanticUI.DimmerSettings
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.ClassNameSettings
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.ClassNameSettings.Param
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings
import typingsJapgolly.semanticUiModal.SemanticUI.Modal.SelectorSettings
import typingsJapgolly.semanticUiModal.semanticUiModalBooleans.`false`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`attach events`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`cache sizes`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`can fit`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide all`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`hide others`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`is active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`set active`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.`show dimmer`
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.destroy
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.hide
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.refresh
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.setting
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.show
import typingsJapgolly.semanticUiModal.semanticUiModalStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Modal extends StObject {
    
    def apply(): JQuery = js.native
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Caches current modal size
      */
    def apply(behavior: `cache sizes`): JQuery = js.native
    /**
      * Returns whether the modal can fit on the page
      */
    def apply(behavior: `can fit`): Boolean = js.native
    /**
      * Hides all visible modals in the same dimmer
      */
    def apply(behavior: `hide all`): JQuery = js.native
    /**
      * Hides associated page dimmer
      */
    def apply(behavior: `hide dimmer`): JQuery = js.native
    /**
      * Hides all modals not selected modal in a dimmer
      */
    def apply(behavior: `hide others`): JQuery = js.native
    /**
      * Returns whether the modal is active
      */
    def apply(behavior: `is active`): Boolean = js.native
    /**
      * Sets modal to active
      */
    def apply(behavior: `set active`): JQuery = js.native
    /**
      * Shows associated page dimmer
      */
    def apply(behavior: `show dimmer`): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Hides the modal
      */
    def apply(behavior: hide): JQuery = js.native
    /**
      * Refreshes centering of modal on page
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, value: ModalSettings): JQuery = js.native
    /**
      * Shows the modal
      */
    def apply(behavior: show): JQuery = js.native
    /**
      * Toggles the modal
      */
    def apply(behavior: toggle): JQuery = js.native
    def apply(settings: ModalSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-modal.SemanticUI.ModalSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-modal.SemanticUI.ModalSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-modal.SemanticUI.ModalSettings._Impl[K] */ js.Any = js.native
    
    var settings: ModalSettings = js.native
  }
  object Modal {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'scrolling'
          */
        var scrolling: String
      }
      object Impl {
        
        inline def apply(active: String, scrolling: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], scrolling = scrolling.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiModal.anon.PickImplactivePartialPick
        - typingsJapgolly.semanticUiModal.anon.PickImplscrollingPartialP
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplscrollingPartialP(scrolling: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplscrollingPartialP = {
          val __obj = js.Dynamic.literal(scrolling = scrolling.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplscrollingPartialP]
        }
      }
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-modal.SemanticUI.Modal.ErrorSettings.Param */
    trait ErrorSettings extends StObject {
      
      var method: String & js.UndefOr[String]
    }
    object ErrorSettings {
      
      inline def apply(method: String & js.UndefOr[String]): ErrorSettings = {
        val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
        __obj.asInstanceOf[ErrorSettings]
      }
      
      extension [Self <: ErrorSettings](x: Self) {
        
        inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      }
      
      trait Impl extends StObject {
        
        /**
          * @default 'The method you called is not defined.'
          */
        var method: String
      }
      object Impl {
        
        inline def apply(method: String): Impl = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
      
      /* Inlined std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl, keyof semantic-ui-modal.SemanticUI.Modal.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var method: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiModal.SemanticUI.Modal.ErrorSettings.Param](x: Self) {
          
          inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.actions .positive, .actions .approve, .actions .ok'
          */
        var approve: String
        
        /**
          * @default '.close, .actions .button'
          */
        var close: String
        
        /**
          * @default '.actions .negative, .actions .deny, .actions .cancel'
          */
        var deny: String
      }
      object Impl {
        
        inline def apply(approve: String, close: String, deny: String): Impl = {
          val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any], close = close.asInstanceOf[js.Any], deny = deny.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setApprove(value: String): Self = StObject.set(x, "approve", value.asInstanceOf[js.Any])
          
          inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
          
          inline def setDeny(value: String): Self = StObject.set(x, "deny", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiModal.anon.PickImplclosePartialPickI
        - typingsJapgolly.semanticUiModal.anon.PickImplapprovePartialPic
        - typingsJapgolly.semanticUiModal.anon.PickImpldenyPartialPickIm
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplapprovePartialPic(approve: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplapprovePartialPic = {
          val __obj = js.Dynamic.literal(approve = approve.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplapprovePartialPic]
        }
        
        inline def PickImplclosePartialPickI(close: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplclosePartialPickI = {
          val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplclosePartialPickI]
        }
        
        inline def PickImpldenyPartialPickIm(deny: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImpldenyPartialPickIm = {
          val __obj = js.Dynamic.literal(deny = deny.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpldenyPartialPickIm]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiModal.SemanticUI.Modal.SelectorSettings.Param
  }
  
  object ModalSettings {
    
    trait Impl extends StObject {
      
      /**
        * If set to true will not close other visible modals when opening a new one
        *
        * @default false
        */
      var allowMultiple: Boolean
      
      /**
        * When true, the first form input inside the modal will receive focus when shown. Set this to false to prevent this behavior.
        *
        * @default true
        */
      var autofocus: Boolean
      
      var className: ClassNameSettings
      
      /**
        * Setting to false will not allow you to close the modal by clicking on the dimmer
        *
        * @default true
        */
      var closable: Boolean
      
      /**
        * Selector or jquery object specifying the area to dim
        *
        * @default 'body'
        */
      var context: String | JQuery
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // region Modal Settings
      /**
        * If set to false will prevent the modal from being moved to inside the dimmer
        *
        * @default true
        */
      var detachable: Boolean
      
      /**
        * You can specify custom settings to extend UI dimmer
        *
        * @see {@link http://semantic-ui.com/modules/dimmer.html}
        */
      var dimmerSettings: DimmerSettings
      
      /**
        * Duration of animation
        *
        * @default 400
        */
      var duration: Double
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether to automatically bind keyboard shortcuts
        *
        * @default true
        */
      var keyboardShortcuts: Boolean
      
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
        * Whether any change in modal DOM should automatically refresh cached positions
        *
        * @default false
        */
      var observeChanges: Boolean
      
      /**
        * A vertical offset to allow for content outside of modal, for example a close button, to be centered.
        *
        * @default 0
        */
      var offset: Double
      
      /**
        * Is called after a positive, approve or ok button is pressed. If the function returns false, the modal will not hide.
        */
      def onApprove($element: JQuery): `false` | Unit
      
      /**
        * Is called after a negative, deny or cancel button is pressed. If the function returns false the modal will not hide.
        */
      def onDeny($element: JQuery): `false` | Unit
      
      /**
        * Is called after a modal has finished hiding animation.
        */
      def onHidden(): Unit
      
      /**
        * Is called after a modal starts to hide. If the function returns false, the modal will not hide.
        */
      def onHide($element: JQuery): `false` | Unit
      
      // endregion
      // region Callbacks
      /**
        * Is called when a modal starts to show.
        */
      def onShow(): Unit
      
      /**
        * Is called after a modal has finished showing animating.
        */
      def onVisible(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      /**
        * Whether additional animations should queue
        *
        * @default false
        */
      var queue: Boolean
      
      // endregion
      // region DOM Settings
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Named transition to use when animating menu in and out, full list can be found in ui transitions docs.
        *
        * @default 'scale'
        * @see {@link http://semantic-ui.com/modules/transition.html}
        */
      var transition: String
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        allowMultiple: Boolean,
        autofocus: Boolean,
        className: ClassNameSettings,
        closable: Boolean,
        context: String | JQuery,
        debug: Boolean,
        detachable: Boolean,
        dimmerSettings: DimmerSettings,
        duration: Double,
        error: ErrorSettings,
        keyboardShortcuts: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        offset: Double,
        onApprove: JQuery => `false` | Unit,
        onDeny: JQuery => `false` | Unit,
        onHidden: Callback,
        onHide: JQuery => `false` | Unit,
        onShow: Callback,
        onVisible: Callback,
        performance: Boolean,
        queue: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        transition: String,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any], autofocus = autofocus.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], detachable = detachable.asInstanceOf[js.Any], dimmerSettings = dimmerSettings.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], onApprove = js.Any.fromFunction1(onApprove), onDeny = js.Any.fromFunction1(onDeny), onHidden = onHidden.toJsFn, onHide = js.Any.fromFunction1(onHide), onShow = onShow.toJsFn, onVisible = onVisible.toJsFn, performance = performance.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAllowMultiple(value: Boolean): Self = StObject.set(x, "allowMultiple", value.asInstanceOf[js.Any])
        
        inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
        
        inline def setContext(value: String | JQuery): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDetachable(value: Boolean): Self = StObject.set(x, "detachable", value.asInstanceOf[js.Any])
        
        inline def setDimmerSettings(value: DimmerSettings): Self = StObject.set(x, "dimmerSettings", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
        
        inline def setOnApprove(value: JQuery => `false` | Unit): Self = StObject.set(x, "onApprove", js.Any.fromFunction1(value))
        
        inline def setOnDeny(value: JQuery => `false` | Unit): Self = StObject.set(x, "onDeny", js.Any.fromFunction1(value))
        
        inline def setOnHidden(value: Callback): Self = StObject.set(x, "onHidden", value.toJsFn)
        
        inline def setOnHide(value: JQuery => `false` | Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction1(value))
        
        inline def setOnShow(value: Callback): Self = StObject.set(x, "onShow", value.toJsFn)
        
        inline def setOnVisible(value: Callback): Self = StObject.set(x, "onVisible", value.toJsFn)
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setQueue(value: Boolean): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiModal.anon.PickImpldetachablePartial
      - typingsJapgolly.semanticUiModal.anon.PickImplautofocusPartialP
      - typingsJapgolly.semanticUiModal.anon.PickImplobserveChangesPar
      - typingsJapgolly.semanticUiModal.anon.PickImplallowMultiplePart
      - typingsJapgolly.semanticUiModal.anon.PickImplkeyboardShortcuts
      - typingsJapgolly.semanticUiModal.anon.PickImploffsetPartialPick
      - typingsJapgolly.semanticUiModal.anon.PickImplcontextPartialPic
      - typingsJapgolly.semanticUiModal.anon.PickImplclosablePartialPi
      - typingsJapgolly.semanticUiModal.anon.PickImpldimmerSettingsPar
      - typingsJapgolly.semanticUiModal.anon.PickImpltransitionPartial
      - typingsJapgolly.semanticUiModal.anon.PickImpldurationPartialPi
      - typingsJapgolly.semanticUiModal.anon.PickImplqueuePartialPickI
      - typingsJapgolly.semanticUiModal.anon.PickImplonShowPartialPick
      - typingsJapgolly.semanticUiModal.anon.PickImplonVisiblePartialP
      - typingsJapgolly.semanticUiModal.anon.PickImplonHidePartialPick
      - typingsJapgolly.semanticUiModal.anon.PickImplonHiddenPartialPi
      - typingsJapgolly.semanticUiModal.anon.PickImplonApprovePartialP
      - typingsJapgolly.semanticUiModal.anon.PickImplonDenyPartialPick
      - typingsJapgolly.semanticUiModal.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiModal.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiModal.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiModal.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiModal.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiModal.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiModal.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiModal.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiModal.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplallowMultiplePart(allowMultiple: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplallowMultiplePart = {
        val __obj = js.Dynamic.literal(allowMultiple = allowMultiple.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplallowMultiplePart]
      }
      
      inline def PickImplautofocusPartialP(autofocus: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplautofocusPartialP = {
        val __obj = js.Dynamic.literal(autofocus = autofocus.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplautofocusPartialP]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiModal.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplclosablePartialPi(closable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplclosablePartialPi = {
        val __obj = js.Dynamic.literal(closable = closable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplclosablePartialPi]
      }
      
      inline def PickImplcontextPartialPic(context: (String | JQuery) & (js.UndefOr[String | JQuery])): typingsJapgolly.semanticUiModal.anon.PickImplcontextPartialPic = {
        val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplcontextPartialPic]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldetachablePartial(detachable: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImpldetachablePartial = {
        val __obj = js.Dynamic.literal(detachable = detachable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpldetachablePartial]
      }
      
      inline def PickImpldimmerSettingsPar(dimmerSettings: DimmerSettings & js.UndefOr[DimmerSettings]): typingsJapgolly.semanticUiModal.anon.PickImpldimmerSettingsPar = {
        val __obj = js.Dynamic.literal(dimmerSettings = dimmerSettings.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpldimmerSettingsPar]
      }
      
      inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiModal.anon.PickImpldurationPartialPi = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpldurationPartialPi]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiModal.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplkeyboardShortcuts(keyboardShortcuts: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplkeyboardShortcuts = {
        val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplkeyboardShortcuts]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplobserveChangesPar(observeChanges: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplobserveChangesPar = {
        val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplobserveChangesPar]
      }
      
      inline def PickImploffsetPartialPick(offset: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiModal.anon.PickImploffsetPartialPick = {
        val __obj = js.Dynamic.literal(offset = offset.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImploffsetPartialPick]
      }
      
      inline def PickImplonApprovePartialP(
        onApprove: (js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonApprovePartialP = {
        val __obj = js.Dynamic.literal(onApprove = onApprove.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonApprovePartialP]
      }
      
      inline def PickImplonDenyPartialPick(
        onDeny: (js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonDenyPartialPick = {
        val __obj = js.Dynamic.literal(onDeny = onDeny.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonDenyPartialPick]
      }
      
      inline def PickImplonHiddenPartialPi(
        onHidden: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonHiddenPartialPi = {
        val __obj = js.Dynamic.literal(onHidden = onHidden.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonHiddenPartialPi]
      }
      
      inline def PickImplonHidePartialPick(
        onHide: (js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]) & (js.UndefOr[js.ThisFunction1[/* this */ JQuery, /* $element */ JQuery, `false` | Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonHidePartialPick = {
        val __obj = js.Dynamic.literal(onHide = onHide.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonHidePartialPick]
      }
      
      inline def PickImplonShowPartialPick(
        onShow: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonShowPartialPick = {
        val __obj = js.Dynamic.literal(onShow = onShow.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonShowPartialPick]
      }
      
      inline def PickImplonVisiblePartialP(
        onVisible: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiModal.anon.PickImplonVisiblePartialP = {
        val __obj = js.Dynamic.literal(onVisible = onVisible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplonVisiblePartialP]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplperformancePartia]
      }
      
      inline def PickImplqueuePartialPickI(queue: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplqueuePartialPickI = {
        val __obj = js.Dynamic.literal(queue = queue.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplqueuePartialPickI]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiModal.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiModal.anon.PickImpltransitionPartial = {
        val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImpltransitionPartial]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiModal.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiModal.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/modal.html#/settings}
    */
  type ModalSettings = typingsJapgolly.semanticUiModal.SemanticUI.ModalSettings.Param
}
