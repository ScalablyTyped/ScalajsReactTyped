package typingsJapgolly.formatjsEcma402Abstract

import typingsJapgolly.formatjsEcma402Abstract.anon.FormattedString
import typingsJapgolly.formatjsEcma402Abstract.anon.PickNumberFormatDigitInte
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatNumericToStringMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/FormatNumericToString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericToString(intlObject: PickNumberFormatDigitInte, x: Double): FormattedString = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToString")(intlObject.asInstanceOf[js.Any], x.asInstanceOf[js.Any])).asInstanceOf[FormattedString]
}
