package typingsJapgolly.semanticUiAccordion

import japgolly.scalajs.react.Callback
import typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings
import typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ClassNameSettings.Param
import typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings
import typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.`close others`
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.close
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.destroy
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.open
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.refresh
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.setting
import typingsJapgolly.semanticUiAccordion.semanticUiAccordionStrings.toggle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Accordion extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Closes accordion content that are not active
      */
    def apply(behavior: `close others`): JQuery = js.native
    /**
      * Closes accordion content at index
      */
    def apply(behavior: close, index: Double): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Opens accordion content at index
      */
    def apply(behavior: open, index: Double): JQuery = js.native
    /**
      * Refreshes all cached selectors and data
      */
    def apply(behavior: refresh): JQuery = js.native
    def apply(behavior: setting, value: AccordionSettings): JQuery = js.native
    /**
      * Toggles accordion content at index
      */
    def apply(behavior: toggle, index: Double): JQuery = js.native
    def apply(settings: AccordionSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-accordion.SemanticUI.AccordionSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-accordion.SemanticUI.AccordionSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-accordion.SemanticUI.AccordionSettings._Impl[K] */ js.Any = js.native
    
    var settings: AccordionSettings = js.native
  }
  object Accordion {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'active'
          */
        var active: String
        
        /**
          * @default 'animating'
          */
        var animating: String
      }
      object Impl {
        
        inline def apply(active: String, animating: String): Impl = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], animating = animating.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setActive(value: String): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
          
          inline def setAnimating(value: String): Self = StObject.set(x, "animating", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiAccordion.anon.PickImplactivePartialPick
        - typingsJapgolly.semanticUiAccordion.anon.PickImplanimatingPartialP
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplactivePartialPick(active: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplactivePartialPick = {
          val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplactivePartialPick]
        }
        
        inline def PickImplanimatingPartialP(animating: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplanimatingPartialP = {
          val __obj = js.Dynamic.literal(animating = animating.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplanimatingPartialP]
        }
      }
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings.Param */
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
      
      /* Inlined std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl, keyof semantic-ui-accordion.SemanticUI.Accordion.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var method: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.ErrorSettings.Param](x: Self) {
          
          inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default '.accordion'
          */
        var accordion: String
        
        /**
          * @default '.content'
          */
        var content: String
        
        /**
          * @default '.title'
          */
        var title: String
        
        /**
          * @default '.title'
          */
        var trigger: String
      }
      object Impl {
        
        inline def apply(accordion: String, content: String, title: String, trigger: String): Impl = {
          val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setAccordion(value: String): Self = StObject.set(x, "accordion", value.asInstanceOf[js.Any])
          
          inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
          
          inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
          
          inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiAccordion.anon.PickImplaccordionPartialP
        - typingsJapgolly.semanticUiAccordion.anon.PickImpltitlePartialPickI
        - typingsJapgolly.semanticUiAccordion.anon.PickImpltriggerPartialPic
        - typingsJapgolly.semanticUiAccordion.anon.PickImplcontentPartialPic
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplaccordionPartialP(accordion: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplaccordionPartialP = {
          val __obj = js.Dynamic.literal(accordion = accordion.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplaccordionPartialP]
        }
        
        inline def PickImplcontentPartialPic(content: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplcontentPartialPic = {
          val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplcontentPartialPic]
        }
        
        inline def PickImpltitlePartialPickI(title: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImpltitlePartialPickI = {
          val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImpltitlePartialPickI]
        }
        
        inline def PickImpltriggerPartialPic(trigger: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImpltriggerPartialPic = {
          val __obj = js.Dynamic.literal(trigger = trigger.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImpltriggerPartialPic]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiAccordion.SemanticUI.Accordion.SelectorSettings.Param
  }
  
  object AccordionSettings {
    
    trait Impl extends StObject {
      
      /**
        * Whether child content opacity should be animated (may cause performance issues with many child elements)
        *
        * @default true
        */
      var animateChildren: Boolean
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings
      
      /**
        * Close open nested accordion content when an element closes
        *
        * @default true
        */
      var closeNested: Boolean
      
      /**
        * Allow active sections to collapse
        *
        * @default true
        */
      var collapsible: Boolean
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      /**
        * Duration in ms of opening animation
        *
        * @default 500
        */
      var duration: Double
      
      /**
        * Easing of opening animation. EaseInOutQuint is included with accordion, for additional options you must include easing equations.
        *
        * @default 'easeInOutQuint'
        * @see {@link http://gsgd.co.uk/sandbox/jquery/easing/}
        */
      var easing: String
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      // region Behavior
      /**
        * Only allow one section open at a time
        *
        * @default true
        */
      var exclusive: Boolean
      
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
        * whether accordion should automatically refresh on DOM insertion
        *
        * @default true
        */
      var observeChanges: Boolean
      
      /**
        * Event on title that will cause accordion to open
        *
        * @default 'click'
        */
      var on: String
      
      /**
        * Callback on element open or close
        */
      def onChange(): Unit
      
      /**
        * Callback after element is closed
        */
      def onClose(): Unit
      
      /**
        * Callback before element closes
        */
      def onClosing(): Unit
      
      /**
        * Callback after element is open
        */
      def onOpen(): Unit
      
      // endregion
      // region Callbacks
      /**
        * Callback before element opens
        */
      def onOpening(): Unit
      
      /**
        * Show console.table output with performance metrics
        */
      var performance: Boolean
      
      // endregion
      // region DOM Settings
      /**
        * Selectors used to find parts of a module
        */
      var selector: SelectorSettings
      
      /**
        * Silences all console output including error messages, regardless of other debug settings.
        */
      var silent: Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        animateChildren: Boolean,
        className: ClassNameSettings,
        closeNested: Boolean,
        collapsible: Boolean,
        debug: Boolean,
        duration: Double,
        easing: String,
        error: ErrorSettings,
        exclusive: Boolean,
        name: String,
        namespace: String,
        observeChanges: Boolean,
        on: String,
        onChange: Callback,
        onClose: Callback,
        onClosing: Callback,
        onOpen: Callback,
        onOpening: Callback,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], closeNested = closeNested.asInstanceOf[js.Any], collapsible = collapsible.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], easing = easing.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], exclusive = exclusive.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], observeChanges = observeChanges.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onChange = onChange.toJsFn, onClose = onClose.toJsFn, onClosing = onClosing.toJsFn, onOpen = onOpen.toJsFn, onOpening = onOpening.toJsFn, performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setAnimateChildren(value: Boolean): Self = StObject.set(x, "animateChildren", value.asInstanceOf[js.Any])
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setCloseNested(value: Boolean): Self = StObject.set(x, "closeNested", value.asInstanceOf[js.Any])
        
        inline def setCollapsible(value: Boolean): Self = StObject.set(x, "collapsible", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
        
        inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setObserveChanges(value: Boolean): Self = StObject.set(x, "observeChanges", value.asInstanceOf[js.Any])
        
        inline def setOn(value: String): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
        
        inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
        
        inline def setOnClosing(value: Callback): Self = StObject.set(x, "onClosing", value.toJsFn)
        
        inline def setOnOpen(value: Callback): Self = StObject.set(x, "onOpen", value.toJsFn)
        
        inline def setOnOpening(value: Callback): Self = StObject.set(x, "onOpening", value.toJsFn)
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiAccordion.anon.PickImplexclusivePartialP
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonPartialPickImpl
      - typingsJapgolly.semanticUiAccordion.anon.PickImplanimateChildrenPa
      - typingsJapgolly.semanticUiAccordion.anon.PickImplcloseNestedPartia
      - typingsJapgolly.semanticUiAccordion.anon.PickImplcollapsiblePartia
      - typingsJapgolly.semanticUiAccordion.anon.PickImpldurationPartialPi
      - typingsJapgolly.semanticUiAccordion.anon.PickImpleasingPartialPick
      - typingsJapgolly.semanticUiAccordion.anon.PickImplobserveChangesPar
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonOpeningPartialP
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonOpenPartialPick
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonClosingPartialP
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonClosePartialPic
      - typingsJapgolly.semanticUiAccordion.anon.PickImplonChangePartialPi
      - typingsJapgolly.semanticUiAccordion.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiAccordion.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiAccordion.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiAccordion.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiAccordion.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiAccordion.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiAccordion.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiAccordion.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiAccordion.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplanimateChildrenPa(animateChildren: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplanimateChildrenPa = {
        val __obj = js.Dynamic.literal(animateChildren = animateChildren.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplanimateChildrenPa]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiAccordion.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImplcloseNestedPartia(closeNested: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplcloseNestedPartia = {
        val __obj = js.Dynamic.literal(closeNested = closeNested.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplcloseNestedPartia]
      }
      
      inline def PickImplcollapsiblePartia(collapsible: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplcollapsiblePartia = {
        val __obj = js.Dynamic.literal(collapsible = collapsible.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplcollapsiblePartia]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiAccordion.anon.PickImpldurationPartialPi = {
        val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImpldurationPartialPi]
      }
      
      inline def PickImpleasingPartialPick(easing: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImpleasingPartialPick = {
        val __obj = js.Dynamic.literal(easing = easing.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImpleasingPartialPick]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiAccordion.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplexclusivePartialP(exclusive: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplexclusivePartialP = {
        val __obj = js.Dynamic.literal(exclusive = exclusive.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplexclusivePartialP]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplobserveChangesPar(observeChanges: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplobserveChangesPar = {
        val __obj = js.Dynamic.literal(observeChanges = observeChanges.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplobserveChangesPar]
      }
      
      inline def PickImplonChangePartialPi(
        onChange: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiAccordion.anon.PickImplonChangePartialPi = {
        val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonChangePartialPi]
      }
      
      inline def PickImplonClosePartialPic(
        onClose: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiAccordion.anon.PickImplonClosePartialPic = {
        val __obj = js.Dynamic.literal(onClose = onClose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonClosePartialPic]
      }
      
      inline def PickImplonClosingPartialP(
        onClosing: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiAccordion.anon.PickImplonClosingPartialP = {
        val __obj = js.Dynamic.literal(onClosing = onClosing.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonClosingPartialP]
      }
      
      inline def PickImplonOpenPartialPick(
        onOpen: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiAccordion.anon.PickImplonOpenPartialPick = {
        val __obj = js.Dynamic.literal(onOpen = onOpen.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonOpenPartialPick]
      }
      
      inline def PickImplonOpeningPartialP(
        onOpening: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
      ): typingsJapgolly.semanticUiAccordion.anon.PickImplonOpeningPartialP = {
        val __obj = js.Dynamic.literal(onOpening = onOpening.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonOpeningPartialP]
      }
      
      inline def PickImplonPartialPickImpl(on: String & js.UndefOr[String]): typingsJapgolly.semanticUiAccordion.anon.PickImplonPartialPickImpl = {
        val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplonPartialPickImpl]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiAccordion.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiAccordion.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiAccordion.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/accordion.html#/settings}
    */
  type AccordionSettings = typingsJapgolly.semanticUiAccordion.SemanticUI.AccordionSettings.Param
}
