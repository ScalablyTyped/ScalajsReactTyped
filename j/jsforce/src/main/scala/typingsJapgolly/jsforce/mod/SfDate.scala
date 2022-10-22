package typingsJapgolly.jsforce.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsforce", "SfDate")
@js.native
open class SfDate protected ()
  extends typingsJapgolly.jsforce.dateMod.SfDate {
  def this(str: String) = this()
}
/* static members */
object SfDate {
  
  @JSImport("jsforce", "SfDate")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseDate(str: String): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("parseDate")(str.asInstanceOf[js.Any]).asInstanceOf[js.Date]
  
  inline def toDateLiteral(date: String): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
  inline def toDateLiteral(date: js.Date): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
  inline def toDateLiteral(date: Double): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
  
  inline def toDateTimeLiteral(date: String): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
  inline def toDateTimeLiteral(date: js.Date): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
  inline def toDateTimeLiteral(date: Double): typingsJapgolly.jsforce.dateMod.SfDate = ^.asInstanceOf[js.Dynamic].applyDynamic("toDateTimeLiteral")(date.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsforce.dateMod.SfDate]
}
