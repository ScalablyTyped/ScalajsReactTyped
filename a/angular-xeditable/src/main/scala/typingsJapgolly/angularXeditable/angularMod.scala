package typingsJapgolly.angularXeditable

import typingsJapgolly.angular.mod.IFormController
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object angularMod {
  
  object xeditable {
    
    @js.native
    trait IEditableFormController
      extends StObject
         with IFormController {
      
      /**
        * Sets focus on form field specified by `name`.<br/>
        * When trying to set the focus on a form field of a new row in the editable table, the `$activate` call needs to be wrapped in a `$timeout` call so that the form is rendered before the `$activate` function is called.
        *
        * @param name name of field
        */
      @JSName("$activate")
      def $activate(name: String): Unit = js.native
      
      /**
        * Triggers `oncancel` event and calls `$hide()`.
        */
      @JSName("$cancel")
      def $cancel(): Unit = js.native
      
      /**
        * Hides form with editable controls without saving.
        */
      @JSName("$hide")
      def $hide(): Unit = js.native
      
      @JSName("$save")
      def $save(): Unit = js.native
      
      /**
        * Shows error message for particular field.
        *
        * @param name name of field
        * @param msg error message
        */
      @JSName("$setError")
      def $setError(name: String, msg: String): Unit = js.native
      
      @JSName("$setWaiting")
      def $setWaiting(value: Boolean): Unit = js.native
      
      /**
        * Shows form with editable controls.
        */
      @JSName("$show")
      def $show(): Unit = js.native
      
      @JSName("$submit")
      def $submit(): Unit = js.native
    }
    
    trait IEditableOptions extends StObject {
      
      /**
        * How input elements get activated. Possible values: `focus|select|none`.
        */
      var activate: String
      
      /*
        * Event, on which the edit mode gets activated.
        * Can be any event.
        */
      var activationEvent: String
      
      /**
        * Default value for `blur` attribute of single editable element.
        * Can be `cancel|submit|ignore`.
        */
      var blurElem: String
      
      /**
        * Default value for `blur` attribute of editable form.
        * Can be `cancel|submit|ignore`.
        */
      var blurForm: String
      
      /**
        * Whether to show buttons for single editalbe element.
        * Possible values `right` (default), `no`.
        */
      var buttons: String
      
      /**
        * Icon Set. Possible values `font-awesome`, `default`.
        */
      var icon_set: String
      
      /**
        * Whether to disable x-editable. Can be overloaded on each element.
        */
      var isDisabled: Boolean
      
      /**
        * Theme. Possible values `bs3`, `bs2`, `default`
        */
      var theme: String
    }
    object IEditableOptions {
      
      inline def apply(
        activate: String,
        activationEvent: String,
        blurElem: String,
        blurForm: String,
        buttons: String,
        icon_set: String,
        isDisabled: Boolean,
        theme: String
      ): IEditableOptions = {
        val __obj = js.Dynamic.literal(activate = activate.asInstanceOf[js.Any], activationEvent = activationEvent.asInstanceOf[js.Any], blurElem = blurElem.asInstanceOf[js.Any], blurForm = blurForm.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], icon_set = icon_set.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
        __obj.asInstanceOf[IEditableOptions]
      }
      
      extension [Self <: IEditableOptions](x: Self) {
        
        inline def setActivate(value: String): Self = StObject.set(x, "activate", value.asInstanceOf[js.Any])
        
        inline def setActivationEvent(value: String): Self = StObject.set(x, "activationEvent", value.asInstanceOf[js.Any])
        
        inline def setBlurElem(value: String): Self = StObject.set(x, "blurElem", value.asInstanceOf[js.Any])
        
        inline def setBlurForm(value: String): Self = StObject.set(x, "blurForm", value.asInstanceOf[js.Any])
        
        inline def setButtons(value: String): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
        
        inline def setIcon_set(value: String): Self = StObject.set(x, "icon_set", value.asInstanceOf[js.Any])
        
        inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
        
        inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      }
    }
  }
}
