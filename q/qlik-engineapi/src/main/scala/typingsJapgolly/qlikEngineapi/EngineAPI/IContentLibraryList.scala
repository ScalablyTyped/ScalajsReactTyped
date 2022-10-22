package typingsJapgolly.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContentLibraryList...
  */
trait IContentLibraryList extends StObject {
  
  /**
    * Information about the content library.
    */
  var qItems: IContentLibraryListItem
}
object IContentLibraryList {
  
  inline def apply(qItems: IContentLibraryListItem): IContentLibraryList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLibraryList]
  }
  
  extension [Self <: IContentLibraryList](x: Self) {
    
    inline def setQItems(value: IContentLibraryListItem): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
  }
}
