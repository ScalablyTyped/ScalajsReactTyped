package typingsJapgolly.mfiles.global.MFiles

import typingsJapgolly.mfiles.IMonthlyDOWTrigger
import typingsJapgolly.mfiles.MFiles.MFTriggerMonth
import typingsJapgolly.mfiles.MFiles.MFTriggerWeekDay
import typingsJapgolly.mfiles.MFiles.MFTriggerWeekOfMonth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("MFiles.MonthlyDOWTrigger")
@js.native
open class MonthlyDOWTrigger ()
  extends StObject
     with IMonthlyDOWTrigger {
  
  /* CompleteClass */
  var DaysOfTheWeek: MFTriggerWeekDay = js.native
  
  /* CompleteClass */
  var Months: MFTriggerMonth = js.native
  
  /* CompleteClass */
  var WhichWeek: MFTriggerWeekOfMonth = js.native
}
