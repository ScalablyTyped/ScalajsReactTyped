package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormCollection
  extends StObject
     with ClientObjectCollection[Form] {
  
  def getById(id: Guid): Form = js.native
  
  def getByPageType(formType: PageType): Form = js.native
  
  def get_item(index: Double): Form = js.native
  
  def itemAt(index: Double): Form = js.native
}
