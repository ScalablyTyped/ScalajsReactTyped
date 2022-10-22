package typingsJapgolly.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebTemplateCollection
  extends StObject
     with ClientObjectCollection[WebTemplate] {
  
  def getByName(name: String): WebTemplate = js.native
  
  def get_item(index: Double): WebTemplate = js.native
  
  def itemAt(index: Double): WebTemplate = js.native
}
