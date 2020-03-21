package typingsJapgolly.serverless.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.serverless.AnonLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serverless extends js.Object {
  var cli: AnonLog
  var config: Config
  var pluginManager: typingsJapgolly.serverless.pluginManagerMod.^
  var serverlessDirPath: String
  var service: typingsJapgolly.serverless.serviceMod.^
  var utils: typingsJapgolly.serverless.utilsMod.^
  var version: String
  var yamlParser: typingsJapgolly.serverless.yamlParserMod.^
  def getProvider(name: String): typingsJapgolly.serverless.awsProviderMod.^
  def getVersion(): String
  def init(): js.Promise[_]
  def run(): js.Promise[_]
  def setProvider(name: String, provider: typingsJapgolly.serverless.awsProviderMod.^): Null
}

object Serverless {
  @scala.inline
  def apply(
    cli: AnonLog,
    config: Config,
    getProvider: String => CallbackTo[typingsJapgolly.serverless.awsProviderMod.^],
    getVersion: CallbackTo[String],
    init: CallbackTo[js.Promise[js.Any]],
    pluginManager: typingsJapgolly.serverless.pluginManagerMod.^,
    run: CallbackTo[js.Promise[js.Any]],
    serverlessDirPath: String,
    service: typingsJapgolly.serverless.serviceMod.^,
    setProvider: (String, typingsJapgolly.serverless.awsProviderMod.^) => CallbackTo[Null],
    utils: typingsJapgolly.serverless.utilsMod.^,
    version: String,
    yamlParser: typingsJapgolly.serverless.yamlParserMod.^
  ): Serverless = {
    val __obj = js.Dynamic.literal(cli = cli.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], pluginManager = pluginManager.asInstanceOf[js.Any], serverlessDirPath = serverlessDirPath.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any], utils = utils.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], yamlParser = yamlParser.asInstanceOf[js.Any])
    __obj.updateDynamic("getProvider")(js.Any.fromFunction1((t0: java.lang.String) => getProvider(t0).runNow()))
    __obj.updateDynamic("getVersion")(getVersion.toJsFn)
    __obj.updateDynamic("init")(init.toJsFn)
    __obj.updateDynamic("run")(run.toJsFn)
    __obj.updateDynamic("setProvider")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.serverless.awsProviderMod.^) => setProvider(t0, t1).runNow()))
    __obj.asInstanceOf[Serverless]
  }
}

