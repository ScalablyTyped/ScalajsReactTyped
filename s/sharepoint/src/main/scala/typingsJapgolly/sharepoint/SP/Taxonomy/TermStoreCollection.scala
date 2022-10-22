package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import typingsJapgolly.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermStoreCollection
  extends StObject
     with ClientObjectCollection[TermStore] {
  
  def getById(id: Guid): TermStore = js.native
  
  def getByName(name: String): TermStore = js.native
  
  def get_item(index: Double): TermStore = js.native
  
  def itemAt(index: Double): TermStore = js.native
}
