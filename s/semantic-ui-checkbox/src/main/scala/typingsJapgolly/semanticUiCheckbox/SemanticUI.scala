package typingsJapgolly.semanticUiCheckbox

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ClassNameSettings.Param
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings
import typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxBooleans.`false`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`attach events`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`can change`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`can uncheck`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is checked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is radio`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`is unchecked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set checked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set determinate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set disabled`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set enabled`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set indeterminate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`set unchecked`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow check`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow determinate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow indeterminate`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.`should allow uncheck`
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.auto
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.check
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.destroy
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.determinate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.enable
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.indeterminate
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.setting
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.toggle
import typingsJapgolly.semanticUiCheckbox.semanticUiCheckboxStrings.uncheck
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SemanticUI {
  
  @js.native
  trait Checkbox extends StObject {
    
    def apply(): JQuery = js.native
    /**
      * Attach checkbox events to another element
      */
    def apply(behavior: `attach events`, selector: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: String, event: String): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery): JQuery = js.native
    def apply(behavior: `attach events`, selector: JQuery, event: String): JQuery = js.native
    /**
      * Returns whether element is able to be changed
      */
    def apply(behavior: `can change`): Boolean = js.native
    /**
      * Returns whether element is able to be unchecked
      */
    def apply(behavior: `can uncheck`): Boolean = js.native
    /**
      * Returns whether element is currently checked
      */
    def apply(behavior: `is checked`): Boolean = js.native
    /**
      * Returns whether element is radio selection
      */
    def apply(behavior: `is radio`): Boolean = js.native
    /**
      * Returns whether element is not checked
      */
    def apply(behavior: `is unchecked`): Boolean = js.native
    /**
      * Set a checkbox state to checked without callbacks
      */
    def apply(behavior: `set checked`): JQuery = js.native
    /**
      * Set as determinate checkbox without callbacks
      */
    def apply(behavior: `set determinate`): JQuery = js.native
    /**
      * Disable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set disabled`): JQuery = js.native
    /**
      * Enable interaction with a checkbox without callbacks
      */
    def apply(behavior: `set enabled`): JQuery = js.native
    /**
      * Set as indeterminate checkbox without callbacks
      */
    def apply(behavior: `set indeterminate`): JQuery = js.native
    /**
      * Set a checkbox state to unchecked without callbacks
      */
    def apply(behavior: `set unchecked`): JQuery = js.native
    /**
      * Returns whether element can be checked (checking if already checked or `beforeChecked` would cancel)
      */
    def apply(behavior: `should allow check`): Boolean = js.native
    /**
      * Returns whether element can be determinate (checking if already determinate or `beforeDeterminate` would cancel)
      */
    def apply(behavior: `should allow determinate`): Boolean = js.native
    /**
      * Returns whether element can be indeterminate (checking if already indeterminate or `beforeIndeterminate` would cancel)
      */
    def apply(behavior: `should allow indeterminate`): Boolean = js.native
    /**
      * Returns whether element can be unchecked (checking if already unchecked or `beforeUnchecked` would cancel)
      */
    def apply(behavior: `should allow uncheck`): Boolean = js.native
    /**
      * Set a checkbox state to checked
      */
    def apply(behavior: check): JQuery = js.native
    def apply(behavior: destroy): JQuery = js.native
    /**
      * Set as determinate checkbox
      */
    def apply(behavior: determinate): JQuery = js.native
    /**
      * Enable interaction with a checkbox
      */
    def apply(behavior: enable): JQuery = js.native
    /**
      * Set as indeterminate checkbox
      */
    def apply(behavior: indeterminate): JQuery = js.native
    def apply(behavior: setting, value: CheckboxSettings): JQuery = js.native
    /**
      * Switches a checkbox from current state
      */
    def apply(behavior: toggle): JQuery = js.native
    /**
      * Set a checkbox state to unchecked
      */
    def apply(behavior: uncheck): JQuery = js.native
    def apply(settings: CheckboxSettings): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](
      behavior: setting,
      name: K,
      value: /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any
    ): JQuery = js.native
    def apply[K /* <: /* keyof semantic-ui-checkbox.SemanticUI.CheckboxSettings */ String */](behavior: setting, name: K, value: Unit): /* import warning: importer.ImportType#apply Failed type conversion: semantic-ui-checkbox.SemanticUI.CheckboxSettings._Impl[K] */ js.Any = js.native
    
    var settings: CheckboxSettings = js.native
  }
  object Checkbox {
    
    object ClassNameSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'checked'
          */
        var checked: String
        
        /**
          * @default 'disabled'
          */
        var disabled: String
        
        /**
          * @default 'radio'
          */
        var radio: String
        
        /**
          * @default 'read-only'
          */
        var readOnly: String
      }
      object Impl {
        
        inline def apply(checked: String, disabled: String, radio: String, readOnly: String): Impl = {
          val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setChecked(value: String): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
          
          inline def setDisabled(value: String): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
          
          inline def setRadio(value: String): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
          
          inline def setReadOnly(value: String): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiCheckbox.anon.PickImplcheckedPartialPic
        - typingsJapgolly.semanticUiCheckbox.anon.PickImpldisabledPartialPi
        - typingsJapgolly.semanticUiCheckbox.anon.PickImplradioPartialPickI
        - typingsJapgolly.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplcheckedPartialPic(checked: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplcheckedPartialPic = {
          val __obj = js.Dynamic.literal(checked = checked.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplcheckedPartialPic]
        }
        
        inline def PickImpldisabledPartialPi(disabled: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImpldisabledPartialPi = {
          val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImpldisabledPartialPi]
        }
        
        inline def PickImplradioPartialPickI(radio: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplradioPartialPickI = {
          val __obj = js.Dynamic.literal(radio = radio.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplradioPartialPickI]
        }
        
        inline def PickImplreadOnlyPartialPi(readOnly: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi = {
          val __obj = js.Dynamic.literal(readOnly = readOnly.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplreadOnlyPartialPi]
        }
      }
    }
    type ClassNameSettings = Param
    
    /* Inlined semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings.Param */
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
      
      /* Inlined std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, 'method'> & std.Partial<std.Pick<semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl, keyof semantic-ui-checkbox.SemanticUI.Checkbox.ErrorSettings._Impl>> */
      trait Param extends StObject {
        
        var method: String & js.UndefOr[String]
      }
      object Param {
        
        inline def apply(method: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param = {
          val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param]
        }
        
        extension [Self <: typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.ErrorSettings.Param](x: Self) {
          
          inline def setMethod(value: String & js.UndefOr[String]): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object SelectorSettings {
      
      trait Impl extends StObject {
        
        /**
          * @default 'input[type=checkbox], input[type=radio]'
          */
        var input: String
        
        /**
          * @default 'label'
          */
        var label: String
      }
      object Impl {
        
        inline def apply(input: String, label: String): Impl = {
          val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[Impl]
        }
        
        extension [Self <: Impl](x: Self) {
          
          inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
          
          inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
        }
      }
      
      /* Rewritten from type alias, can be one of: 
        - typingsJapgolly.semanticUiCheckbox.anon.PickImplinputPartialPickI
        - typingsJapgolly.semanticUiCheckbox.anon.PickImpllabelPartialPickI
      */
      trait Param extends StObject
      object Param {
        
        inline def PickImplinputPartialPickI(input: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplinputPartialPickI = {
          val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplinputPartialPickI]
        }
        
        inline def PickImpllabelPartialPickI(label: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImpllabelPartialPickI = {
          val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
          __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImpllabelPartialPickI]
        }
      }
    }
    type SelectorSettings = typingsJapgolly.semanticUiCheckbox.SemanticUI.Checkbox.SelectorSettings.Param
  }
  
  object CheckboxSettings {
    
    trait Impl extends StObject {
      
      /**
        * Callback before a checkbox is checked. Can cancel change by returning false
        */
      def beforeChecked(): Unit | `false`
      
      /**
        * Callback before a checkbox is set to determinate. Can cancel change by returning false
        */
      def beforeDeterminate(): Unit | `false`
      
      /**
        * Callback before a checkbox is set to undeterminate. Can cancel change by returning false
        */
      def beforeIndeterminate(): Unit | `false`
      
      /**
        * Callback before a checkbox is unchecked. Can cancel change by returning false
        */
      def beforeUnchecked(): Unit | `false`
      
      /**
        * Class names used to determine element state
        */
      var className: ClassNameSettings
      
      /**
        * Debug output to console
        */
      var debug: Boolean
      
      // endregion
      // region Debug Settings
      var error: ErrorSettings
      
      /**
        * Whether callbacks for checked status should be fired on init as well as change
        *
        * @default false
        */
      var fireOnInit: Boolean
      
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
      /**
        * Callback after a checkbox is either checked or unchecked.
        */
      def onChange(): Unit
      
      /**
        * Callback after a checkbox is checked.
        */
      def onChecked(): Unit
      
      /**
        * Callback after a checkbox is set to determinate.
        */
      def onDeterminate(): Unit
      
      /**
        * Callback after a checkbox is disabled.
        */
      def onDisable(): Unit
      
      /**
        * Callback after a checkbox is disabled.
        *
        * @deprecated
        */
      def onDisabled(): Unit
      
      /**
        * Callback after a checkbox is enabled.
        */
      def onEnable(): Unit
      
      /**
        * Callback after a checkbox is enabled.
        *
        * @deprecated
        */
      def onEnabled(): Unit
      
      /**
        * Callback after a checkbox is set to undeterminate.
        */
      def onIndeterminate(): Unit
      
      /**
        * Callback after a checkbox is unchecked.
        */
      def onUnchecked(): Unit
      
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
      
      // region Behavior
      /**
        * Setting to true/false will determine whether an input will allow no selection. Auto will set disallow this behavior only for radio boxes
        *
        * @default 'auto'
        */
      var uncheckable: auto | Boolean
      
      /**
        * Debug output includes all internal behaviors
        */
      var verbose: Boolean
    }
    object Impl {
      
      inline def apply(
        beforeChecked: CallbackTo[Unit | `false`],
        beforeDeterminate: CallbackTo[Unit | `false`],
        beforeIndeterminate: CallbackTo[Unit | `false`],
        beforeUnchecked: CallbackTo[Unit | `false`],
        className: ClassNameSettings,
        debug: Boolean,
        error: ErrorSettings,
        fireOnInit: Boolean,
        name: String,
        namespace: String,
        onChange: Callback,
        onChecked: Callback,
        onDeterminate: Callback,
        onDisable: Callback,
        onDisabled: Callback,
        onEnable: Callback,
        onEnabled: Callback,
        onIndeterminate: Callback,
        onUnchecked: Callback,
        performance: Boolean,
        selector: SelectorSettings,
        silent: Boolean,
        uncheckable: auto | Boolean,
        verbose: Boolean
      ): Impl = {
        val __obj = js.Dynamic.literal(beforeChecked = beforeChecked.toJsFn, beforeDeterminate = beforeDeterminate.toJsFn, beforeIndeterminate = beforeIndeterminate.toJsFn, beforeUnchecked = beforeUnchecked.toJsFn, className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fireOnInit = fireOnInit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], onChange = onChange.toJsFn, onChecked = onChecked.toJsFn, onDeterminate = onDeterminate.toJsFn, onDisable = onDisable.toJsFn, onDisabled = onDisabled.toJsFn, onEnable = onEnable.toJsFn, onEnabled = onEnabled.toJsFn, onIndeterminate = onIndeterminate.toJsFn, onUnchecked = onUnchecked.toJsFn, performance = performance.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], uncheckable = uncheckable.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[Impl]
      }
      
      extension [Self <: Impl](x: Self) {
        
        inline def setBeforeChecked(value: CallbackTo[Unit | `false`]): Self = StObject.set(x, "beforeChecked", value.toJsFn)
        
        inline def setBeforeDeterminate(value: CallbackTo[Unit | `false`]): Self = StObject.set(x, "beforeDeterminate", value.toJsFn)
        
        inline def setBeforeIndeterminate(value: CallbackTo[Unit | `false`]): Self = StObject.set(x, "beforeIndeterminate", value.toJsFn)
        
        inline def setBeforeUnchecked(value: CallbackTo[Unit | `false`]): Self = StObject.set(x, "beforeUnchecked", value.toJsFn)
        
        inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
        
        inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
        
        inline def setFireOnInit(value: Boolean): Self = StObject.set(x, "fireOnInit", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
        
        inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
        
        inline def setOnChange(value: Callback): Self = StObject.set(x, "onChange", value.toJsFn)
        
        inline def setOnChecked(value: Callback): Self = StObject.set(x, "onChecked", value.toJsFn)
        
        inline def setOnDeterminate(value: Callback): Self = StObject.set(x, "onDeterminate", value.toJsFn)
        
        inline def setOnDisable(value: Callback): Self = StObject.set(x, "onDisable", value.toJsFn)
        
        inline def setOnDisabled(value: Callback): Self = StObject.set(x, "onDisabled", value.toJsFn)
        
        inline def setOnEnable(value: Callback): Self = StObject.set(x, "onEnable", value.toJsFn)
        
        inline def setOnEnabled(value: Callback): Self = StObject.set(x, "onEnabled", value.toJsFn)
        
        inline def setOnIndeterminate(value: Callback): Self = StObject.set(x, "onIndeterminate", value.toJsFn)
        
        inline def setOnUnchecked(value: Callback): Self = StObject.set(x, "onUnchecked", value.toJsFn)
        
        inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
        
        inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
        
        inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
        
        inline def setUncheckable(value: auto | Boolean): Self = StObject.set(x, "uncheckable", value.asInstanceOf[js.Any])
        
        inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.semanticUiCheckbox.anon.PickImpluncheckablePartia
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplfireOnInitPartial
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonChangePartialPi
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonCheckedPartialP
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonIndeterminatePa
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonDeterminatePart
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonUncheckedPartia
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeCheckedPart
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeIndetermina
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeDeterminate
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnablePartialPi
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisablePartialP
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnabledPartialP
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisabledPartial
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplselectorPartialPi
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplclassNamePartialP
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplerrorPartialPickI
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplnamespacePartialP
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplnamePartialPickIm
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplsilentPartialPick
      - typingsJapgolly.semanticUiCheckbox.anon.PickImpldebugPartialPickI
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplperformancePartia
      - typingsJapgolly.semanticUiCheckbox.anon.PickImplverbosePartialPic
    */
    trait Param extends StObject
    object Param {
      
      inline def PickImplbeforeCheckedPart(
        beforeChecked: (js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeCheckedPart = {
        val __obj = js.Dynamic.literal(beforeChecked = beforeChecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeCheckedPart]
      }
      
      inline def PickImplbeforeDeterminate(
        beforeDeterminate: (js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeDeterminate = {
        val __obj = js.Dynamic.literal(beforeDeterminate = beforeDeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeDeterminate]
      }
      
      inline def PickImplbeforeIndetermina(
        beforeIndeterminate: (js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeIndetermina = {
        val __obj = js.Dynamic.literal(beforeIndeterminate = beforeIndeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeIndetermina]
      }
      
      inline def PickImplbeforeUncheckedPa(
        beforeUnchecked: (js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit | `false`]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa = {
        val __obj = js.Dynamic.literal(beforeUnchecked = beforeUnchecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplbeforeUncheckedPa]
      }
      
      inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiCheckbox.anon.PickImplclassNamePartialP = {
        val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplclassNamePartialP]
      }
      
      inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiCheckbox.anon.PickImpldebugPartialPickI = {
        val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImpldebugPartialPickI]
      }
      
      inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiCheckbox.anon.PickImplerrorPartialPickI = {
        val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplerrorPartialPickI]
      }
      
      inline def PickImplfireOnInitPartial(fireOnInit: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiCheckbox.anon.PickImplfireOnInitPartial = {
        val __obj = js.Dynamic.literal(fireOnInit = fireOnInit.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplfireOnInitPartial]
      }
      
      inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplnamePartialPickIm = {
        val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplnamePartialPickIm]
      }
      
      inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiCheckbox.anon.PickImplnamespacePartialP = {
        val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplnamespacePartialP]
      }
      
      inline def PickImplonChangePartialPi(
        onChange: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonChangePartialPi = {
        val __obj = js.Dynamic.literal(onChange = onChange.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonChangePartialPi]
      }
      
      inline def PickImplonCheckedPartialP(
        onChecked: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonCheckedPartialP = {
        val __obj = js.Dynamic.literal(onChecked = onChecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonCheckedPartialP]
      }
      
      inline def PickImplonDeterminatePart(
        onDeterminate: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonDeterminatePart = {
        val __obj = js.Dynamic.literal(onDeterminate = onDeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonDeterminatePart]
      }
      
      inline def PickImplonDisablePartialP(
        onDisable: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisablePartialP = {
        val __obj = js.Dynamic.literal(onDisable = onDisable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisablePartialP]
      }
      
      inline def PickImplonDisabledPartial(
        onDisabled: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisabledPartial = {
        val __obj = js.Dynamic.literal(onDisabled = onDisabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonDisabledPartial]
      }
      
      inline def PickImplonEnablePartialPi(
        onEnable: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnablePartialPi = {
        val __obj = js.Dynamic.literal(onEnable = onEnable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnablePartialPi]
      }
      
      inline def PickImplonEnabledPartialP(
        onEnabled: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnabledPartialP = {
        val __obj = js.Dynamic.literal(onEnabled = onEnabled.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonEnabledPartialP]
      }
      
      inline def PickImplonIndeterminatePa(
        onIndeterminate: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonIndeterminatePa = {
        val __obj = js.Dynamic.literal(onIndeterminate = onIndeterminate.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonIndeterminatePa]
      }
      
      inline def PickImplonUncheckedPartia(
        onUnchecked: (js.ThisFunction0[/* this */ HTMLInputElement, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ HTMLInputElement, Unit]])
      ): typingsJapgolly.semanticUiCheckbox.anon.PickImplonUncheckedPartia = {
        val __obj = js.Dynamic.literal(onUnchecked = onUnchecked.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplonUncheckedPartia]
      }
      
      inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiCheckbox.anon.PickImplperformancePartia = {
        val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplperformancePartia]
      }
      
      inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiCheckbox.anon.PickImplselectorPartialPi = {
        val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplselectorPartialPi]
      }
      
      inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiCheckbox.anon.PickImplsilentPartialPick = {
        val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplsilentPartialPick]
      }
      
      inline def PickImpluncheckablePartia(uncheckable: (auto | Boolean) & (js.UndefOr[auto | Boolean])): typingsJapgolly.semanticUiCheckbox.anon.PickImpluncheckablePartia = {
        val __obj = js.Dynamic.literal(uncheckable = uncheckable.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImpluncheckablePartia]
      }
      
      inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiCheckbox.anon.PickImplverbosePartialPic = {
        val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
        __obj.asInstanceOf[typingsJapgolly.semanticUiCheckbox.anon.PickImplverbosePartialPic]
      }
    }
  }
  /**
    * @see {@link http://semantic-ui.com/modules/checkbox.html#/settings}
    */
  type CheckboxSettings = typingsJapgolly.semanticUiCheckbox.SemanticUI.CheckboxSettings.Param
}
