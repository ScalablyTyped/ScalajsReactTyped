package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SortCollection
  extends StObject
     with ClientObjectCollection[Sort] {
  
  def add(strProperty: String, sortDirection: SortDirection): Unit = js.native
  
  def clear(): Unit = js.native
  
  def get_childItemType(): Instantiable0[Sort] = js.native
  
  def get_item(index: Double): Sort = js.native
  
  def itemAt(index: Double): Sort = js.native
}
