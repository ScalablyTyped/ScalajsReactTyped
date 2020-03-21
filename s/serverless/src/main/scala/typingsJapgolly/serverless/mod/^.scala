package typingsJapgolly.serverless.mod

import typingsJapgolly.serverless.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("serverless", JSImport.Namespace)
@js.native
class ^ () extends Serverless {
  def this(config: js.Object) = this()
  /* CompleteClass */
  override var cli: AnonLog = js.native
  /* CompleteClass */
  override var config: Config = js.native
  /* CompleteClass */
  override var pluginManager: typingsJapgolly.serverless.pluginManagerMod.^ = js.native
  /* CompleteClass */
  override var serverlessDirPath: String = js.native
  /* CompleteClass */
  override var service: typingsJapgolly.serverless.serviceMod.^ = js.native
  /* CompleteClass */
  override var utils: typingsJapgolly.serverless.utilsMod.^ = js.native
  /* CompleteClass */
  override var version: String = js.native
  /* CompleteClass */
  override var yamlParser: typingsJapgolly.serverless.yamlParserMod.^ = js.native
  /* CompleteClass */
  override def getProvider(name: String): typingsJapgolly.serverless.awsProviderMod.^ = js.native
  /* CompleteClass */
  override def getVersion(): String = js.native
  /* CompleteClass */
  override def init(): js.Promise[_] = js.native
  /* CompleteClass */
  override def run(): js.Promise[_] = js.native
  /* CompleteClass */
  override def setProvider(name: String, provider: typingsJapgolly.serverless.awsProviderMod.^): Null = js.native
}

