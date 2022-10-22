package typingsJapgolly.reactDates

import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsToLocalizedDateStringMod {
  
  @JSImport("react-dates/esm/utils/toLocalizedDateString", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(date: MomentInput): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any]).asInstanceOf[String | Null]
  inline def default(date: MomentInput, currentFormat: MomentFormatSpecification): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(date.asInstanceOf[js.Any], currentFormat.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
