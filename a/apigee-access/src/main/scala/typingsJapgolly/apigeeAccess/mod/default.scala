package typingsJapgolly.apigeeAccess.mod

import typingsJapgolly.apigeeAccess.apigeeAccessStrings.apigee
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.environment
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.organization
import typingsJapgolly.apigeeAccess.apigeeAccessStrings.standalone
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.CacheOptions
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.QuotaService
import typingsJapgolly.apigeeAccess.mod.ApigeeAccess.SecureVault
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apigee-access", JSImport.Default)
@js.native
object default extends js.Object {
  def deleteVariable(request: js.Any, name: String): Unit = js.native
  def getCache(name: String): js.Any = js.native
  def getCache(name: String, options: CacheOptions): js.Any = js.native
  def getMode(): apigee | standalone = js.native
  def getQuota(): QuotaService = js.native
  def getQuota(options: js.Any): QuotaService = js.native
  def getVariable(request: js.Any, name: String): String | Double | Boolean = js.native
  def getVault(name: String): SecureVault = js.native
  @JSName("getVault")
  def getVault_environment(name: String, scope: environment): SecureVault = js.native
  @JSName("getVault")
  def getVault_organization(name: String, scope: organization): SecureVault = js.native
  def setIntVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setIntVariable(request: js.Any, name: String, value: Double): Unit = js.native
  def setVariable(request: js.Any, name: String, value: String): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Boolean): Unit = js.native
  def setVariable(request: js.Any, name: String, value: Double): Unit = js.native
}

