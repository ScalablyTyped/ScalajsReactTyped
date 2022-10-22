package typingsJapgolly.wixStyleReact

import typingsJapgolly.wixStyleReact.anon.ExcludePastTimes
import typingsJapgolly.wixStyleReact.anon.IdValue
import typingsJapgolly.wixStyleReact.anon.InputValueLocale
import typingsJapgolly.wixStyleReact.anon.Locale
import typingsJapgolly.wixStyleReact.anon.Step
import typingsJapgolly.wixStyleReact.anon.TimeSlot
import typingsJapgolly.wixStyleReact.anon.TimeSlots
import typingsJapgolly.wixStyleReact.anon.TimeStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTimeInputTimeInputUtilsMod {
  
  @JSImport("wix-style-react/dist/types/TimeInput/TimeInputUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getAutoFilledValue(hasInputValueSuggestedOptionLocale: Locale): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAutoFilledValue")(hasInputValueSuggestedOptionLocale.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getClosestTimeSlot(hasValueTimeSlots: TimeSlots): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClosestTimeSlot")(hasValueTimeSlots.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCustomTimeSlot(hasValueTimeSlotTimeStyleLocale: TimeSlot): js.UndefOr[IdValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCustomTimeSlot")(hasValueTimeSlotTimeStyleLocale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[IdValue]]
  
  inline def getErrorMessageByLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getErrorMessageByLocale")().asInstanceOf[String]
  
  inline def getFormattedDate(hasValueTimeStyleLocale: TimeStyle): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFormattedDate")(hasValueTimeStyleLocale.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getSuggestedOption(hasInputValueTimeSlotsLocale: InputValueLocale): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getSuggestedOption")(hasInputValueTimeSlotsLocale.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getTimeFilter(hasExcludePastTimesFilterTime: ExcludePastTimes): js.Function1[/* time */ Any, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeFilter")(hasExcludePastTimesFilterTime.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* time */ Any, Boolean]]
  
  inline def getTimeSlot(hasValueTimeStyleLocale: TimeStyle): IdValue = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeSlot")(hasValueTimeStyleLocale.asInstanceOf[js.Any]).asInstanceOf[IdValue]
  
  inline def getTimeSlots(hasValueTimeStyleLocaleStep: Step): js.Array[IdValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("getTimeSlots")(hasValueTimeStyleLocaleStep.asInstanceOf[js.Any]).asInstanceOf[js.Array[IdValue]]
  
  inline def isInputInvalid(inputValue: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInputInvalid")(inputValue.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def removeIrrelevantCharacters(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("removeIrrelevantCharacters")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
}
