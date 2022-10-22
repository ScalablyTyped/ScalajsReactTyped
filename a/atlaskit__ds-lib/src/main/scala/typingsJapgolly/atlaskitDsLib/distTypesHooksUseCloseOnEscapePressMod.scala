package typingsJapgolly.atlaskitDsLib

import japgolly.scalajs.react.Callback
import org.scalajs.dom.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesHooksUseCloseOnEscapePressMod {
  
  @JSImport("@atlaskit/ds-lib/dist/types/hooks/use-close-on-escape-press", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOnCloseIsDisabled: UseCloseOnEscapePressOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOnCloseIsDisabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait UseCloseOnEscapePressOpts extends StObject {
    
    var isDisabled: js.UndefOr[Boolean] = js.undefined
    
    def onClose(e: KeyboardEvent): Unit
  }
  object UseCloseOnEscapePressOpts {
    
    inline def apply(onClose: KeyboardEvent => Callback): UseCloseOnEscapePressOpts = {
      val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction1((t0: KeyboardEvent) => onClose(t0).runNow()))
      __obj.asInstanceOf[UseCloseOnEscapePressOpts]
    }
    
    extension [Self <: UseCloseOnEscapePressOpts](x: Self) {
      
      inline def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDisabledUndefined: Self = StObject.set(x, "isDisabled", js.undefined)
      
      inline def setOnClose(value: KeyboardEvent => Callback): Self = StObject.set(x, "onClose", js.Any.fromFunction1((t0: KeyboardEvent) => value(t0).runNow()))
    }
  }
}
