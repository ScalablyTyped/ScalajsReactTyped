package typingsJapgolly.saucelabs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.saucelabs.saucelabsStrings.ABORTED
import typingsJapgolly.saucelabs.saucelabsStrings.CANCELED
import typingsJapgolly.saucelabs.saucelabsStrings.FAILURE
import typingsJapgolly.saucelabs.saucelabsStrings.SKIPPED
import typingsJapgolly.saucelabs.saucelabsStrings.SUCCESS
import typingsJapgolly.saucelabs.saucelabsStrings.UNKNOWN
import typingsJapgolly.saucelabs.saucelabsStrings.WARNING
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestReportView
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var reportId: js.UndefOr[Id] = js.undefined
  
  var status: js.UndefOr[UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED] = js.undefined
}
object TestReportView {
  
  inline def apply(): TestReportView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestReportView]
  }
  
  extension [Self <: TestReportView](x: Self) {
    
    inline def setReportId(value: Id): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
    
    inline def setReportIdUndefined: Self = StObject.set(x, "reportId", js.undefined)
    
    inline def setStatus(value: UNKNOWN | SUCCESS | WARNING | FAILURE | SKIPPED | ABORTED | CANCELED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
