package typingsJapgolly.semanticUiForm.SemanticUI

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.HTMLElement
import typingsJapgolly.jquery.JQuery.TriggeredEvent
import typingsJapgolly.semanticUiForm.JQuery
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ClassNameSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.ErrorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.Field
import typingsJapgolly.semanticUiForm.SemanticUI.Form.MetadataSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.PromptSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.SelectorSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TemplatesSettings
import typingsJapgolly.semanticUiForm.SemanticUI.Form.TextSettings
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.blur
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.change
import typingsJapgolly.semanticUiForm.semanticUiFormStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FormSettings {
  
  trait Impl extends StObject {
    
    /**
      * Class names used to attach style to state
      */
    var className: ClassNameSettings
    
    /**
      * Debug output to console
      */
    var debug: Boolean
    
    var defaults: StringDictionary[Field]
    
    /**
      * Delay from last typed letter to validate a field when using on: change or when revalidating a field.
      *
      * @default true
      */
    var delay: Boolean
    
    /**
      * Animation speed for inline prompt
      *
      * @default 150
      */
    var duration: Double
    
    // endregion
    // region Debug Settings
    var error: ErrorSettings
    
    var fields: StringDictionary[String | js.Array[String] | Field]
    
    /**
      * Adds inline error on field validation error
      *
      * @default false
      */
    var `inline`: Boolean
    
    // region Form Settings
    /**
      * Adds keyboard shortcuts for enter and escape keys to submit form and blur fields respectively
      *
      * @default true
      */
    var keyboardShortcuts: Boolean
    
    /**
      * HTML5 metadata attributes
      */
    var metadata: MetadataSettings
    
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
      * Event used to trigger validation. Can be either submit, blur or change.
      *
      * @default 'submit'
      */
    var on: submit | blur | change
    
    /**
      * Callback if any form field is invalid
      */
    def onFailure(formErrors: js.Array[String], fields: Any): Unit
    
    /**
      * Callback on each invalid field
      */
    def onInvalid(): Unit
    
    /**
      * Callback if a form is all valid
      */
    def onSuccess(event: TriggeredEvent[HTMLElement, Any, Any, Any], fields: Any): Unit
    
    // endregion
    // region Callbacks
    /**
      * Callback on each valid field
      */
    def onValid(): Unit
    
    /**
      * Show console.table output with performance metrics
      */
    var performance: Boolean
    
    var prompt: PromptSettings
    
    /**
      * If set to true will revalidate fields with errors on input change
      *
      * @default true
      */
    var revalidate: Boolean
    
    // endregion
    // region Rules
    var rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]
    
    // endregion
    // region DOM Settings
    /**
      * Selectors used to match functionality to DOM
      */
    var selector: SelectorSettings
    
    /**
      * Silences all console output including error messages, regardless of other debug settings.
      */
    var silent: Boolean
    
    // endregion
    // region Templates
    var templates: TemplatesSettings
    
    // endregion
    // region Form Prompts
    var text: TextSettings
    
    /**
      * Named transition to use when animating validation errors. Fade and slide down are available without including ui transitions
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
      className: ClassNameSettings,
      debug: Boolean,
      defaults: StringDictionary[Field],
      delay: Boolean,
      duration: Double,
      error: ErrorSettings,
      fields: StringDictionary[String | js.Array[String] | Field],
      `inline`: Boolean,
      keyboardShortcuts: Boolean,
      metadata: MetadataSettings,
      name: String,
      namespace: String,
      on: submit | blur | change,
      onFailure: (js.Array[String], Any) => Callback,
      onInvalid: Callback,
      onSuccess: (TriggeredEvent[HTMLElement, Any, Any, Any], Any) => Callback,
      onValid: Callback,
      performance: Boolean,
      prompt: PromptSettings,
      revalidate: Boolean,
      rules: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]],
      selector: SelectorSettings,
      silent: Boolean,
      templates: TemplatesSettings,
      text: TextSettings,
      transition: String,
      verbose: Boolean
    ): Impl = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], on = on.asInstanceOf[js.Any], onFailure = js.Any.fromFunction2((t0: js.Array[String], t1: Any) => (onFailure(t0, t1)).runNow()), onInvalid = onInvalid.toJsFn, onSuccess = js.Any.fromFunction2((t0: TriggeredEvent[HTMLElement, Any, Any, Any], t1: Any) => (onSuccess(t0, t1)).runNow()), onValid = onValid.toJsFn, performance = performance.asInstanceOf[js.Any], prompt = prompt.asInstanceOf[js.Any], revalidate = revalidate.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], silent = silent.asInstanceOf[js.Any], templates = templates.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], transition = transition.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Impl]
    }
    
    extension [Self <: Impl](x: Self) {
      
      inline def setClassName(value: ClassNameSettings): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDefaults(value: StringDictionary[Field]): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Boolean): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setError(value: ErrorSettings): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFields(value: StringDictionary[String | js.Array[String] | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setKeyboardShortcuts(value: Boolean): Self = StObject.set(x, "keyboardShortcuts", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: MetadataSettings): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setOn(value: submit | blur | change): Self = StObject.set(x, "on", value.asInstanceOf[js.Any])
      
      inline def setOnFailure(value: (js.Array[String], Any) => Callback): Self = StObject.set(x, "onFailure", js.Any.fromFunction2((t0: js.Array[String], t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnInvalid(value: Callback): Self = StObject.set(x, "onInvalid", value.toJsFn)
      
      inline def setOnSuccess(value: (TriggeredEvent[HTMLElement, Any, Any, Any], Any) => Callback): Self = StObject.set(x, "onSuccess", js.Any.fromFunction2((t0: TriggeredEvent[HTMLElement, Any, Any, Any], t1: Any) => (value(t0, t1)).runNow()))
      
      inline def setOnValid(value: Callback): Self = StObject.set(x, "onValid", value.toJsFn)
      
      inline def setPerformance(value: Boolean): Self = StObject.set(x, "performance", value.asInstanceOf[js.Any])
      
      inline def setPrompt(value: PromptSettings): Self = StObject.set(x, "prompt", value.asInstanceOf[js.Any])
      
      inline def setRevalidate(value: Boolean): Self = StObject.set(x, "revalidate", value.asInstanceOf[js.Any])
      
      inline def setRules(value: StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: SelectorSettings): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
      
      inline def setTemplates(value: TemplatesSettings): Self = StObject.set(x, "templates", value.asInstanceOf[js.Any])
      
      inline def setText(value: TextSettings): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTransition(value: String): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.semanticUiForm.anon.PickImplkeyboardShortcuts
    - typingsJapgolly.semanticUiForm.anon.PickImplonPartialPickImpl
    - typingsJapgolly.semanticUiForm.anon.PickImplrevalidatePartial
    - typingsJapgolly.semanticUiForm.anon.PickImpldelayPartialPickI
    - typingsJapgolly.semanticUiForm.anon.PickImplinlinePartialPick
    - typingsJapgolly.semanticUiForm.anon.PickImpltransitionPartial
    - typingsJapgolly.semanticUiForm.anon.PickImpldurationPartialPi
    - typingsJapgolly.semanticUiForm.anon.PickImplfieldsPartialPick
    - typingsJapgolly.semanticUiForm.anon.PickImpltextPartialPickIm
    - typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPick
    - typingsJapgolly.semanticUiForm.anon.PickImplonValidPartialPic
    - typingsJapgolly.semanticUiForm.anon.PickImplonInvalidPartialP
    - typingsJapgolly.semanticUiForm.anon.PickImplonSuccessPartialP
    - typingsJapgolly.semanticUiForm.anon.PickImplonFailurePartialP
    - typingsJapgolly.semanticUiForm.anon.PickImpltemplatesPartialP
    - typingsJapgolly.semanticUiForm.anon.PickImplrulesPartialPickI
    - typingsJapgolly.semanticUiForm.anon.PickImplselectorPartialPi
    - typingsJapgolly.semanticUiForm.anon.PickImplmetadataPartialPi
    - typingsJapgolly.semanticUiForm.anon.PickImplclassNamePartialP
    - typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickI
    - typingsJapgolly.semanticUiForm.anon.PickImplnamespacePartialP
    - typingsJapgolly.semanticUiForm.anon.PickImplnamePartialPickIm
    - typingsJapgolly.semanticUiForm.anon.PickImplsilentPartialPick
    - typingsJapgolly.semanticUiForm.anon.PickImpldebugPartialPickI
    - typingsJapgolly.semanticUiForm.anon.PickImplperformancePartia
    - typingsJapgolly.semanticUiForm.anon.PickImplverbosePartialPic
  */
  trait Param extends StObject
  object Param {
    
    inline def PickImplclassNamePartialP(className: ClassNameSettings & js.UndefOr[ClassNameSettings]): typingsJapgolly.semanticUiForm.anon.PickImplclassNamePartialP = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplclassNamePartialP]
    }
    
    inline def PickImpldebugPartialPickI(debug: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImpldebugPartialPickI = {
      val __obj = js.Dynamic.literal(debug = debug.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldebugPartialPickI]
    }
    
    inline def PickImpldelayPartialPickI(delay: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImpldelayPartialPickI = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldelayPartialPickI]
    }
    
    inline def PickImpldurationPartialPi(duration: Double & js.UndefOr[Double]): typingsJapgolly.semanticUiForm.anon.PickImpldurationPartialPi = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpldurationPartialPi]
    }
    
    inline def PickImplerrorPartialPickI(error: ErrorSettings & js.UndefOr[ErrorSettings]): typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickI = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplerrorPartialPickI]
    }
    
    inline def PickImplfieldsPartialPick(
      fields: (StringDictionary[String | js.Array[String] | Field]) & (js.UndefOr[StringDictionary[String | js.Array[String] | Field]])
    ): typingsJapgolly.semanticUiForm.anon.PickImplfieldsPartialPick = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplfieldsPartialPick]
    }
    
    inline def PickImplinlinePartialPick(`inline`: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplinlinePartialPick = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("inline")(`inline`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplinlinePartialPick]
    }
    
    inline def PickImplkeyboardShortcuts(keyboardShortcuts: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplkeyboardShortcuts = {
      val __obj = js.Dynamic.literal(keyboardShortcuts = keyboardShortcuts.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplkeyboardShortcuts]
    }
    
    inline def PickImplmetadataPartialPi(metadata: MetadataSettings & js.UndefOr[MetadataSettings]): typingsJapgolly.semanticUiForm.anon.PickImplmetadataPartialPi = {
      val __obj = js.Dynamic.literal(metadata = metadata.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplmetadataPartialPi]
    }
    
    inline def PickImplnamePartialPickIm(name: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplnamePartialPickIm = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplnamePartialPickIm]
    }
    
    inline def PickImplnamespacePartialP(namespace: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImplnamespacePartialP = {
      val __obj = js.Dynamic.literal(namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplnamespacePartialP]
    }
    
    inline def PickImplonFailurePartialP(
      onFailure: (js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ Any, Unit]) & (js.UndefOr[
          js.ThisFunction2[/* this */ JQuery, /* formErrors */ js.Array[String], /* fields */ Any, Unit]
        ])
    ): typingsJapgolly.semanticUiForm.anon.PickImplonFailurePartialP = {
      val __obj = js.Dynamic.literal(onFailure = onFailure.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplonFailurePartialP]
    }
    
    inline def PickImplonInvalidPartialP(
      onInvalid: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiForm.anon.PickImplonInvalidPartialP = {
      val __obj = js.Dynamic.literal(onInvalid = onInvalid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplonInvalidPartialP]
    }
    
    inline def PickImplonPartialPickImpl(on: (submit | blur | change) & (js.UndefOr[submit | blur | change])): typingsJapgolly.semanticUiForm.anon.PickImplonPartialPickImpl = {
      val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplonPartialPickImpl]
    }
    
    inline def PickImplonSuccessPartialP(
      onSuccess: (js.ThisFunction2[
          /* this */ JQuery, 
          /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
          /* fields */ Any, 
          Unit
        ]) & (js.UndefOr[
          js.ThisFunction2[
            /* this */ JQuery, 
            /* event */ TriggeredEvent[HTMLElement, Any, Any, Any], 
            /* fields */ Any, 
            Unit
          ]
        ])
    ): typingsJapgolly.semanticUiForm.anon.PickImplonSuccessPartialP = {
      val __obj = js.Dynamic.literal(onSuccess = onSuccess.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplonSuccessPartialP]
    }
    
    inline def PickImplonValidPartialPic(
      onValid: (js.ThisFunction0[/* this */ JQuery, Unit]) & (js.UndefOr[js.ThisFunction0[/* this */ JQuery, Unit]])
    ): typingsJapgolly.semanticUiForm.anon.PickImplonValidPartialPic = {
      val __obj = js.Dynamic.literal(onValid = onValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplonValidPartialPic]
    }
    
    inline def PickImplperformancePartia(performance: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplperformancePartia = {
      val __obj = js.Dynamic.literal(performance = performance.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplperformancePartia]
    }
    
    inline def PickImplpromptPartialPick(prompt: PromptSettings & js.UndefOr[PromptSettings]): typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPick = {
      val __obj = js.Dynamic.literal(prompt = prompt.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplpromptPartialPick]
    }
    
    inline def PickImplrevalidatePartial(revalidate: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplrevalidatePartial = {
      val __obj = js.Dynamic.literal(revalidate = revalidate.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplrevalidatePartial]
    }
    
    inline def PickImplrulesPartialPickI(
      rules: (StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]) & (js.UndefOr[
          StringDictionary[js.ThisFunction1[/* this */ HTMLElement, /* repeated */ Any, Boolean]]
        ])
    ): typingsJapgolly.semanticUiForm.anon.PickImplrulesPartialPickI = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplrulesPartialPickI]
    }
    
    inline def PickImplselectorPartialPi(selector: SelectorSettings & js.UndefOr[SelectorSettings]): typingsJapgolly.semanticUiForm.anon.PickImplselectorPartialPi = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplselectorPartialPi]
    }
    
    inline def PickImplsilentPartialPick(silent: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplsilentPartialPick = {
      val __obj = js.Dynamic.literal(silent = silent.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplsilentPartialPick]
    }
    
    inline def PickImpltemplatesPartialP(templates: TemplatesSettings & js.UndefOr[TemplatesSettings]): typingsJapgolly.semanticUiForm.anon.PickImpltemplatesPartialP = {
      val __obj = js.Dynamic.literal(templates = templates.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpltemplatesPartialP]
    }
    
    inline def PickImpltextPartialPickIm(text: TextSettings & js.UndefOr[TextSettings]): typingsJapgolly.semanticUiForm.anon.PickImpltextPartialPickIm = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpltextPartialPickIm]
    }
    
    inline def PickImpltransitionPartial(transition: String & js.UndefOr[String]): typingsJapgolly.semanticUiForm.anon.PickImpltransitionPartial = {
      val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImpltransitionPartial]
    }
    
    inline def PickImplverbosePartialPic(verbose: Boolean & js.UndefOr[Boolean]): typingsJapgolly.semanticUiForm.anon.PickImplverbosePartialPic = {
      val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.semanticUiForm.anon.PickImplverbosePartialPic]
    }
  }
}
