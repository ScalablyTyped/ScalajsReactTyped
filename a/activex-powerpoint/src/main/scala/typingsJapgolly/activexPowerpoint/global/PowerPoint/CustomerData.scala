package typingsJapgolly.activexPowerpoint.global.PowerPoint

import typingsJapgolly.activexOffice.Office.CustomXMLPart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.CustomerData")
@js.native
/* private */ open class CustomerData ()
  extends StObject
     with typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData {
  
  /* CompleteClass */
  override def Add(): CustomXMLPart = js.native
  
  /* CompleteClass */
  override val Application: typingsJapgolly.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Count: Double = js.native
  
  /* CompleteClass */
  override def Delete(Id: String): Unit = js.native
  
  /* CompleteClass */
  override def Item(Id: String): CustomXMLPart = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.CustomerData_typekey")
  var PowerPointDotCustomerData_typekey: typingsJapgolly.activexPowerpoint.PowerPoint.CustomerData = js.native
}
