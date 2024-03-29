package typingsJapgolly.sharepoint.SP.Taxonomy

import typingsJapgolly.sharepoint.SP.ClientObjectCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelCollection
  extends StObject
     with ClientObjectCollection[Label] {
  
  def getByValue(name: String): Label = js.native
  
  def get_item(index: Double): Label = js.native
  
  def itemAt(index: Double): Label = js.native
}
