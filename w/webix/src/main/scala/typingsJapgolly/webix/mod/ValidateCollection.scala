package typingsJapgolly.webix.mod

import typingsJapgolly.webix.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateCollection extends StObject {
  
  def clearValidation(): Unit = js.native
  
  def validate(): Boolean = js.native
  def validate(id: String): Boolean = js.native
}
object ValidateCollection {
  
  inline def apply: ValidateCollection = ^.asInstanceOf[js.Dynamic].selectDynamic("ValidateCollection").asInstanceOf[ValidateCollection]
}
