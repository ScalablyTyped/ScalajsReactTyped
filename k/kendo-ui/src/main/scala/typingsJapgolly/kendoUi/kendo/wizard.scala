package typingsJapgolly.kendoUi.kendo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.kendoUi.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wizard {
  
  trait Step
    extends StObject
       with Class {
    
    def buttons(): js.Array[Any]
    
    def load(): Unit
    
    var options: WizardStepOptions
    
    def resetButtons(): Unit
  }
  object Step {
    
    inline def apply(
      buttons: CallbackTo[js.Array[Any]],
      load: Callback,
      options: WizardStepOptions,
      resetButtons: Callback
    ): Step = {
      val __obj = js.Dynamic.literal(buttons = buttons.toJsFn, load = load.toJsFn, options = options.asInstanceOf[js.Any], resetButtons = resetButtons.toJsFn)
      __obj.asInstanceOf[Step]
    }
    
    extension [Self <: Step](x: Self) {
      
      inline def setButtons(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "buttons", value.toJsFn)
      
      inline def setLoad(value: Callback): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setOptions(value: WizardStepOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setResetButtons(value: Callback): Self = StObject.set(x, "resetButtons", value.toJsFn)
    }
  }
  
  trait WizardStepOptions extends StObject {
    
    var actionBar: js.UndefOr[Boolean] = js.undefined
    
    var buttons: js.UndefOr[js.Array[Any]] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var contentId: js.UndefOr[String] = js.undefined
    
    var contentUrl: js.UndefOr[String] = js.undefined
    
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    var form: js.UndefOr[Any] = js.undefined
    
    var formTag: js.UndefOr[String] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var markupContainer: js.UndefOr[JQuery] = js.undefined
    
    var messages: js.UndefOr[Any] = js.undefined
    
    var pager: js.UndefOr[Boolean] = js.undefined
    
    var selected: js.UndefOr[Boolean] = js.undefined
    
    var totalSteps: Double
    
    var wizardId: js.UndefOr[String] = js.undefined
  }
  object WizardStepOptions {
    
    inline def apply(totalSteps: Double): WizardStepOptions = {
      val __obj = js.Dynamic.literal(totalSteps = totalSteps.asInstanceOf[js.Any])
      __obj.asInstanceOf[WizardStepOptions]
    }
    
    extension [Self <: WizardStepOptions](x: Self) {
      
      inline def setActionBar(value: Boolean): Self = StObject.set(x, "actionBar", value.asInstanceOf[js.Any])
      
      inline def setActionBarUndefined: Self = StObject.set(x, "actionBar", js.undefined)
      
      inline def setButtons(value: js.Array[Any]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: Any*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentId(value: String): Self = StObject.set(x, "contentId", value.asInstanceOf[js.Any])
      
      inline def setContentIdUndefined: Self = StObject.set(x, "contentId", js.undefined)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setContentUrl(value: String): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
      
      inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setForm(value: Any): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormTag(value: String): Self = StObject.set(x, "formTag", value.asInstanceOf[js.Any])
      
      inline def setFormTagUndefined: Self = StObject.set(x, "formTag", js.undefined)
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setMarkupContainer(value: JQuery): Self = StObject.set(x, "markupContainer", value.asInstanceOf[js.Any])
      
      inline def setMarkupContainerUndefined: Self = StObject.set(x, "markupContainer", js.undefined)
      
      inline def setMessages(value: Any): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setPager(value: Boolean): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      inline def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setTotalSteps(value: Double): Self = StObject.set(x, "totalSteps", value.asInstanceOf[js.Any])
      
      inline def setWizardId(value: String): Self = StObject.set(x, "wizardId", value.asInstanceOf[js.Any])
      
      inline def setWizardIdUndefined: Self = StObject.set(x, "wizardId", js.undefined)
    }
  }
}
