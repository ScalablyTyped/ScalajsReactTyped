package typingsJapgolly.reactDates

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FC
import typingsJapgolly.reactDates.mod.SingleDatePickerInputShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsSingleDatePickerInputMod extends Shortcut {
  
  @JSImport("react-dates/lib/components/SingleDatePickerInput", JSImport.Default)
  @js.native
  val default: FC[SingleDatePickerInputShape] = js.native
  
  type _To = FC[SingleDatePickerInputShape]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsSingleDatePickerInputMod.foo` */
  override def _to: FC[SingleDatePickerInputShape] = default
}
