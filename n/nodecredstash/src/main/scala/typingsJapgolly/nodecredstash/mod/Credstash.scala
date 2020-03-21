package typingsJapgolly.nodecredstash.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsSdk.documentClientMod.DocumentClient.DeleteItemOutput
import typingsJapgolly.awsSdk.documentClientMod.DocumentClient.PutItemOutput
import typingsJapgolly.awsSdk.dynamodbMod.AttributeMap
import typingsJapgolly.awsSdk.kmsMod.DecryptResponse
import typingsJapgolly.nodecredstash.AnonContext
import typingsJapgolly.nodecredstash.AnonKey
import typingsJapgolly.nodecredstash.AnonName
import typingsJapgolly.nodecredstash.AnonNameVersion
import typingsJapgolly.nodecredstash.AnonSecret
import typingsJapgolly.nodecredstash.AnonStartsWith
import typingsJapgolly.nodecredstash.AnonVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Credstash extends js.Object {
  def createDdbTable(): js.Promise[Unit] = js.native
  def decryptStash(stash: AnonKey): js.Promise[DecryptResponse] = js.native
  def decryptStash(stash: AnonKey, context: CredstashContext): js.Promise[DecryptResponse] = js.native
  def deleteSecret(options: AnonNameVersion): js.Promise[DeleteItemOutput] = js.native
  def deleteSecrets(options: AnonName): js.Promise[js.Array[DeleteItemOutput]] = js.native
  def getAllSecrets(options: AnonStartsWith): js.Promise[StringDictionary[String]] = js.native
  def getAllVersions(options: AnonContext): js.Promise[js.Array[AnonSecret]] = js.native
  def getHighestVersion(options: AnonName): js.Promise[AttributeMap] = js.native
  def getSecret(options: AnonVersion): js.Promise[String] = js.native
  def incrementVersion(options: AnonName): js.Promise[String] = js.native
  def listSecrets(): js.Promise[js.Array[String]] = js.native
  def putSecret(options: PutSecretOptions): js.Promise[PutItemOutput] = js.native
}

