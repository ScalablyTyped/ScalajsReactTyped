package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangedItemCollection
  extends StObject
     with ClientObjectCollection[ChangedItem] {
  
  def get_item(index: Double): ChangedItem = js.native
  
  def itemAt(index: Double): ChangedItem = js.native
}
