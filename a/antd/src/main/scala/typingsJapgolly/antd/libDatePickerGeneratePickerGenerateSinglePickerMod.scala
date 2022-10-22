package typingsJapgolly.antd

import typingsJapgolly.antd.anon.DatePicker
import typingsJapgolly.rcPicker.esGenerateMod.GenerateConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDatePickerGeneratePickerGenerateSinglePickerMod {
  
  @JSImport("antd/lib/date-picker/generatePicker/generateSinglePicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[DateType](generateConfig: GenerateConfig[DateType]): DatePicker[DateType] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(generateConfig.asInstanceOf[js.Any]).asInstanceOf[DatePicker[DateType]]
}
