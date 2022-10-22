package typingsJapgolly.formatjsEcma402Abstract

import typingsJapgolly.formatjsEcma402Abstract.anon.GetInternalSlots
import typingsJapgolly.formatjsEcma402Abstract.typesNumberMod.NumberFormatPart
import typingsJapgolly.std.Intl.NumberFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object numberFormatFormatNumericToPartsMod {
  
  @JSImport("@formatjs/ecma402-abstract/NumberFormat/FormatNumericToParts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def FormatNumericToParts(nf: NumberFormat, x: Double, implDetails: GetInternalSlots): js.Array[NumberFormatPart] = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatNumericToParts")(nf.asInstanceOf[js.Any], x.asInstanceOf[js.Any], implDetails.asInstanceOf[js.Any])).asInstanceOf[js.Array[NumberFormatPart]]
}
