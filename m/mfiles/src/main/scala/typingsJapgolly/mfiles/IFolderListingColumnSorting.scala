package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderListingColumnSorting extends StObject {
  
  def Clone(): IFolderListingColumnSorting
  
  var ID: Double
  
  var Index: Double
  
  var SortAscending: Boolean
}
object IFolderListingColumnSorting {
  
  inline def apply(Clone: CallbackTo[IFolderListingColumnSorting], ID: Double, Index: Double, SortAscending: Boolean): IFolderListingColumnSorting = {
    val __obj = js.Dynamic.literal(Clone = Clone.toJsFn, ID = ID.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderListingColumnSorting]
  }
  
  extension [Self <: IFolderListingColumnSorting](x: Self) {
    
    inline def setClone(value: CallbackTo[IFolderListingColumnSorting]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setID(value: Double): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setSortAscending(value: Boolean): Self = StObject.set(x, "SortAscending", value.asInstanceOf[js.Any])
  }
}
