package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldLinkCollection
  extends StObject
     with ClientObjectCollection[FieldLink] {
  
  def add(parameters: FieldLinkCreationInformation): FieldLink = js.native
  
  def getById(id: Guid): FieldLink = js.native
  
  def get_item(index: Double): FieldLink = js.native
  
  def itemAt(index: Double): FieldLink = js.native
  
  def reorder(internalNames: js.Array[String]): Unit = js.native
}
