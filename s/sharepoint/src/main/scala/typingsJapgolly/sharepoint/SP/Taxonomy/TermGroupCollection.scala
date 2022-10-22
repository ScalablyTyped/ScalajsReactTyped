package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import typingsJapgolly.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermGroupCollection
  extends StObject
     with ClientObjectCollection[TermGroup] {
  
  def getById(id: Guid): TermGroup = js.native
  
  def getByName(name: String): TermGroup = js.native
  
  def get_item(index: Double): TermGroup = js.native
  
  def itemAt(index: Double): TermGroup = js.native
}
