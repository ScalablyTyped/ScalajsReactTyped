package typingsJapgolly.sharepoint.Microsoft.SharePoint.Client.Search.Query

import typingsJapgolly.sharepoint.SP.ClientObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeywordQueryProperties
  extends StObject
     with ClientObject {
  
  def getQueryPropertyValue(name: String, value: QueryPropertyValue): Unit = js.native
  
  def get_item(key: String): Any = js.native
  
  def setQueryPropertyValue(name: String): QueryPropertyValue = js.native
  
  def set_item(key: String, value: Any): Unit = js.native
}
