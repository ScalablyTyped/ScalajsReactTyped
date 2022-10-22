package typingsJapgolly.angularCommon.anon

import typingsJapgolly.angularCommon.angularCommonStrings.ngForOf
import typingsJapgolly.angularCommon.angularCommonStrings.ngForTemplate
import typingsJapgolly.angularCommon.angularCommonStrings.ngForTrackBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NgForOf extends StObject {
  
  var ngForOf: typingsJapgolly.angularCommon.angularCommonStrings.ngForOf
  
  var ngForTemplate: typingsJapgolly.angularCommon.angularCommonStrings.ngForTemplate
  
  var ngForTrackBy: typingsJapgolly.angularCommon.angularCommonStrings.ngForTrackBy
}
object NgForOf {
  
  inline def apply(): NgForOf = {
    val __obj = js.Dynamic.literal(ngForOf = "ngForOf", ngForTemplate = "ngForTemplate", ngForTrackBy = "ngForTrackBy")
    __obj.asInstanceOf[NgForOf]
  }
  
  extension [Self <: NgForOf](x: Self) {
    
    inline def setNgForOf(value: ngForOf): Self = StObject.set(x, "ngForOf", value.asInstanceOf[js.Any])
    
    inline def setNgForTemplate(value: ngForTemplate): Self = StObject.set(x, "ngForTemplate", value.asInstanceOf[js.Any])
    
    inline def setNgForTrackBy(value: ngForTrackBy): Self = StObject.set(x, "ngForTrackBy", value.asInstanceOf[js.Any])
  }
}
