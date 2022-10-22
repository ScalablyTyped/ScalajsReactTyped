package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import typingsJapgolly.sharepoint.SP.Guid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TermSetCollection
  extends StObject
     with ClientObjectCollection[TermSet] {
  
  def getById(id: Guid): TermSet = js.native
  
  def getByName(name: String): TermSet = js.native
  
  def get_item(index: Double): TermSet = js.native
  
  def itemAt(index: Double): TermSet = js.native
}
