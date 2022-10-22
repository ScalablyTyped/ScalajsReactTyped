package typingsJapgolly.typeformEmbed

import japgolly.scalajs.react.Callback
import typingsJapgolly.typeformEmbed.anon.Height
import typingsJapgolly.typeformEmbed.anon.Ref
import typingsJapgolly.typeformEmbed.anon.ResponseId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBaseActionableOptionsMod {
  
  trait ActionableOptions extends StObject {
    
    /**
      * Callback function that will be executed once the Iframe close button is clicked.
      */
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function when button on ending screen is clicked.
      */
    var onEndingButtonClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function that will be executed once the typeform's active screen height changes.
      * @param {Object} event - Event payload.
      * @param {string} event.ref - New question ref.
      * @param {number} event.height - New question height.
      */
    var onHeightChanged: js.UndefOr[js.Function1[/* event */ Height, Unit]] = js.undefined
    
    /**
      * Callback function that will be executed once the typeform's active screen changes.
      * @param {Object} event - Event payload.
      * @param {string} event.ref - New question ref.
      */
    var onQuestionChanged: js.UndefOr[js.Function1[/* event */ Ref, Unit]] = js.undefined
    
    /**
      * Callback function that will be executed once the typeform is ready.
      */
    var onReady: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * Callback function that will be executed right after the typeform is successfully submitted.
      * @param {Object} payload - Event payload.
      * @param {string} payload.responseId - Response ID string.
      * @param {string} response_id - DEPRECATED.
      */
    var onSubmit: js.UndefOr[js.Function1[/* payload */ ResponseId, Unit]] = js.undefined
  }
  object ActionableOptions {
    
    inline def apply(): ActionableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionableOptions]
    }
    
    extension [Self <: ActionableOptions](x: Self) {
      
      inline def setOnClose(value: Callback): Self = StObject.set(x, "onClose", value.toJsFn)
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnEndingButtonClick(value: Callback): Self = StObject.set(x, "onEndingButtonClick", value.toJsFn)
      
      inline def setOnEndingButtonClickUndefined: Self = StObject.set(x, "onEndingButtonClick", js.undefined)
      
      inline def setOnHeightChanged(value: /* event */ Height => Callback): Self = StObject.set(x, "onHeightChanged", js.Any.fromFunction1((t0: /* event */ Height) => value(t0).runNow()))
      
      inline def setOnHeightChangedUndefined: Self = StObject.set(x, "onHeightChanged", js.undefined)
      
      inline def setOnQuestionChanged(value: /* event */ Ref => Callback): Self = StObject.set(x, "onQuestionChanged", js.Any.fromFunction1((t0: /* event */ Ref) => value(t0).runNow()))
      
      inline def setOnQuestionChangedUndefined: Self = StObject.set(x, "onQuestionChanged", js.undefined)
      
      inline def setOnReady(value: Callback): Self = StObject.set(x, "onReady", value.toJsFn)
      
      inline def setOnReadyUndefined: Self = StObject.set(x, "onReady", js.undefined)
      
      inline def setOnSubmit(value: /* payload */ ResponseId => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: /* payload */ ResponseId) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
    }
  }
}
