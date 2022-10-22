package typingsJapgolly.cadesplugin.CAPICOM

import typingsJapgolly.cadesplugin.CADESCommon.ValuesOf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends StObject {
  
  val Certificates: typingsJapgolly.cadesplugin.CAPICOM.Certificates = js.native
  
  def Close(): Unit = js.native
  
  def Delete(): Boolean = js.native
  
  def Import(encodedStore: String): Unit = js.native
  
  val Location: ValuesOf[CAPICOM_STORE_LOCATION] = js.native
  
  val Name: String = js.native
  
  def Open(): Unit = js.native
  def Open(location: Unit, name: Unit, openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]): Unit = js.native
  def Open(location: Unit, name: ValuesOf[CAPICOM_STORE_NAME]): Unit = js.native
  def Open(location: Unit, name: ValuesOf[CAPICOM_STORE_NAME], openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]): Unit = js.native
  def Open(location: ValuesOf[CAPICOM_STORE_LOCATION]): Unit = js.native
  def Open(
    location: ValuesOf[CAPICOM_STORE_LOCATION],
    name: Unit,
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
  def Open(location: ValuesOf[CAPICOM_STORE_LOCATION], name: ValuesOf[CAPICOM_STORE_NAME]): Unit = js.native
  def Open(
    location: ValuesOf[CAPICOM_STORE_LOCATION],
    name: ValuesOf[CAPICOM_STORE_NAME],
    openMode: ValuesOf[CAPICOM_STORE_OPEN_MODE]
  ): Unit = js.native
}
