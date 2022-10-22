package typingsJapgolly.qlikEngineapi.EngineAPI

import typingsJapgolly.qlikEngineapi.qlikEngineapiStrings.bookmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BookmarkListDef
  */
trait IBookmarkListDef extends StObject {
  
  /**
    * Data typ JSON
    */
  var qData: Any
  
  /**
    * Type of the list
    */
  var qType: bookmark
}
object IBookmarkListDef {
  
  inline def apply(qData: Any): IBookmarkListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = "bookmark")
    __obj.asInstanceOf[IBookmarkListDef]
  }
  
  extension [Self <: IBookmarkListDef](x: Self) {
    
    inline def setQData(value: Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    inline def setQType(value: bookmark): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
