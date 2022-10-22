package typingsJapgolly.reactDates

import typingsJapgolly.moment.mod.Moment
import typingsJapgolly.moment.mod.MomentFormatSpecification
import typingsJapgolly.moment.mod.MomentInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUtilsToMomentObjectMod {
  
  @JSImport("react-dates/esm/utils/toMomentObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dateString: MomentInput): Moment | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dateString.asInstanceOf[js.Any]).asInstanceOf[Moment | Null]
  inline def default(dateString: MomentInput, customFormat: MomentFormatSpecification): Moment | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dateString.asInstanceOf[js.Any], customFormat.asInstanceOf[js.Any])).asInstanceOf[Moment | Null]
}
