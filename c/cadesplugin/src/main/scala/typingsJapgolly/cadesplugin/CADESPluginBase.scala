package typingsJapgolly.cadesplugin

import typingsJapgolly.cadesplugin.CADESCommon.ValuesOf
import typingsJapgolly.cadesplugin.CADES_Plugin.EncodingType
import typingsJapgolly.cadesplugin.CADES_Plugin.LogLevel
import typingsJapgolly.cadesplugin.CADES_Plugin.SignedXmlUrls
import typingsJapgolly.cadesplugin.CAPICOM.CAPICOM_ATTRIBUTE
import typingsJapgolly.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_FIND_TYPE
import typingsJapgolly.cadesplugin.CAPICOM.CAPICOM_CERTIFICATE_INCLUDE_OPTION
import typingsJapgolly.cadesplugin.CAPICOM.CAPICOM_PROPID
import typingsJapgolly.cadesplugin.CAPICOM.CertIntoTypePlugin
import typingsJapgolly.cadesplugin.CAPICOM.EKUPlugin
import typingsJapgolly.cadesplugin.CAPICOM.KeyUsagePlugin
import typingsJapgolly.cadesplugin.CAPICOM.OIDPlugin
import typingsJapgolly.cadesplugin.CAPICOM.StoreLocationPlugin
import typingsJapgolly.cadesplugin.CAPICOM.StoreNamePlugin
import typingsJapgolly.cadesplugin.CAPICOM.StoreOpenModePlugin
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOMInstallResponseRestrictionFlags
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_ATTRIBUTE
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_CADES_TYPE
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_CONTENT_ENCODING_TYPE
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_DISPLAY_DATA
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_ENCRYPTION_ALGORITHM
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_HASH_ALGORITHM
import typingsJapgolly.cadesplugin.CAdESCOM.CADESCOM_XML_SIGNATURE_TYPE
import typingsJapgolly.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginBase
  extends StObject
     with Promise[scala.Nothing]
     with StoreLocationPlugin
     with typingsJapgolly.cadesplugin.CAdESCOM.StoreLocationPlugin
     with StoreNamePlugin
     with StoreOpenModePlugin
     with CAPICOM_CERTIFICATE_FIND_TYPE
     with LogLevel
     with CADESCOM_XML_SIGNATURE_TYPE
     with SignedXmlUrls
     with CADESCOM_CADES_TYPE
     with EncodingType
     with CAPICOM_CERTIFICATE_INCLUDE_OPTION
     with CertIntoTypePlugin
     with KeyUsagePlugin
     with CAPICOM_PROPID
     with OIDPlugin
     with EKUPlugin
     with CAPICOM_ATTRIBUTE
     with CADESCOM_ATTRIBUTE
     with CADESCOM_CONTENT_ENCODING_TYPE
     with CADESCOM_DISPLAY_DATA
     with CADESCOM_ENCRYPTION_ALGORITHM
     with CADESCOM_HASH_ALGORITHM
     with CADESCOMInstallResponseRestrictionFlags {
  
  val JSModuleVersion: String = js.native
  
  def async_spawn[T](generatorFun: js.Function1[/* repeated */ Any, js.Iterator[T]]): T = js.native
  
  val current_log_level: Double = js.native
  
  def getLastError(exception: js.Error): String = js.native
  
  def is_capilite_enabled(): Boolean = js.native
  
  def set(obj: CADESPluginBase): Unit = js.native
  
  def set_log_level(level: ValuesOf[LogLevel]): Unit = js.native
}
