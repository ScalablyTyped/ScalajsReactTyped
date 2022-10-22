package typingsJapgolly.jqueryEditableSelect

import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.default
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.fade
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.fast
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.focus
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.manual
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.slide
import typingsJapgolly.jqueryEditableSelect.jqueryEditableSelectStrings.slow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object JQueryEditableSelect {
  
  trait EditableSelectOptions extends StObject {
    
    /**
      * Where to append the dropdown list in the DOM.
      */
    var appendTo: js.UndefOr[String | JQuery] = js.undefined
    
    /**
      * Duration of the easings (in milliseconds).
      */
    var duration: js.UndefOr[Double | fast | slow] = js.undefined
    
    /**
      * Easing used for showing and hiding the dropdown list.
      */
    var effects: js.UndefOr[default | slide | fade] = js.undefined
    
    /**
      * Filter (or not) items in list while typing.
      */
    var filter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * How dropdown list is triggered.
      */
    var trigger: js.UndefOr[focus | manual] = js.undefined
  }
  object EditableSelectOptions {
    
    inline def apply(): EditableSelectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableSelectOptions]
    }
    
    extension [Self <: EditableSelectOptions](x: Self) {
      
      inline def setAppendTo(value: String | JQuery): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setDuration(value: Double | fast | slow): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEffects(value: default | slide | fade): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsUndefined: Self = StObject.set(x, "effects", js.undefined)
      
      inline def setFilter(value: Boolean): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setTrigger(value: focus | manual): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    }
  }
}
