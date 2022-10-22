package typingsJapgolly.webix.mod

import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateData extends StObject {
  
  def clearValidation(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(mode: Any): Boolean = js.native
}
object ValidateData {
  
  inline def apply: ValidateData = ^.asInstanceOf[js.Dynamic].selectDynamic("ValidateData").asInstanceOf[ValidateData]
}
