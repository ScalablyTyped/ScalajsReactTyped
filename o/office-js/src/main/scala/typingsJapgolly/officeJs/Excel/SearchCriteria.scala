package typingsJapgolly.officeJs.Excel

import typingsJapgolly.officeJs.officeJsStrings.Backwards
import typingsJapgolly.officeJs.officeJsStrings.Forward
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the search criteria to be used.
  *
  * @remarks
  * [Api set: ExcelApi 1.9]
  */
trait SearchCriteria extends StObject {
  
  /**
    * Specifies if the match needs to be complete or partial.
    A complete match matches the entire contents of the cell. A partial match matches a substring within the content of the cell (e.g., `cat` partially matches `caterpillar` and `scatter`).
    Default is `false` (partial).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var completeMatch: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies if the match is case-sensitive. Default is `false` (case-insensitive).
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var matchCase: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the search direction. Default is forward. See `Excel.SearchDirection`.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var searchDirection: js.UndefOr[SearchDirection | Forward | Backwards] = js.undefined
}
object SearchCriteria {
  
  inline def apply(): SearchCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchCriteria]
  }
  
  extension [Self <: SearchCriteria](x: Self) {
    
    inline def setCompleteMatch(value: Boolean): Self = StObject.set(x, "completeMatch", value.asInstanceOf[js.Any])
    
    inline def setCompleteMatchUndefined: Self = StObject.set(x, "completeMatch", js.undefined)
    
    inline def setMatchCase(value: Boolean): Self = StObject.set(x, "matchCase", value.asInstanceOf[js.Any])
    
    inline def setMatchCaseUndefined: Self = StObject.set(x, "matchCase", js.undefined)
    
    inline def setSearchDirection(value: SearchDirection | Forward | Backwards): Self = StObject.set(x, "searchDirection", value.asInstanceOf[js.Any])
    
    inline def setSearchDirectionUndefined: Self = StObject.set(x, "searchDirection", js.undefined)
  }
}
