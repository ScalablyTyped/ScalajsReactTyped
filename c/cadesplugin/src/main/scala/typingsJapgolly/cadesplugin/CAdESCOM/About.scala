package typingsJapgolly.cadesplugin.CAdESCOM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait About extends StObject {
  
  val BuildVersion: Double = js.native
  
  def CSPName(): String = js.native
  def CSPName(ProviderType: Double): String = js.native
  
  def CSPVersion(): typingsJapgolly.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: String): typingsJapgolly.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: String, ProviderType: Double): typingsJapgolly.cadesplugin.CAdESCOM.Version = js.native
  def CSPVersion(ProviderName: Unit, ProviderType: Double): typingsJapgolly.cadesplugin.CAdESCOM.Version = js.native
  
  val MajorVersion: Double = js.native
  
  val MinorVersion: Double = js.native
  
  val PluginVersion: typingsJapgolly.cadesplugin.CAdESCOM.Version = js.native
  
  def ProviderVersion(): String = js.native
  def ProviderVersion(ProviderName: String): String = js.native
  def ProviderVersion(ProviderName: String, ProviderType: Double): String = js.native
  def ProviderVersion(ProviderName: Unit, ProviderType: Double): String = js.native
  
  val Version: String = js.native
}
