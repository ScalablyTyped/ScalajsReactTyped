package typingsJapgolly.agilite.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Agilite extends js.Object {
  var ApiKeys: typingsJapgolly.agilite.mod.ApiKeys
  var BPM: typingsJapgolly.agilite.mod.BPM
  var Connectors: typingsJapgolly.agilite.mod.Connectors
  var DataMappings: typingsJapgolly.agilite.mod.DataMappings
  var Files: typingsJapgolly.agilite.mod.Files
  var Keywords: typingsJapgolly.agilite.mod.Keywords
  var Numbering: typingsJapgolly.agilite.mod.Numbering
  var Roles: typingsJapgolly.agilite.mod.Roles
  var Templates: typingsJapgolly.agilite.mod.Templates
  var TierStructures: typingsJapgolly.agilite.mod.TierStructures
  var Utils: typingsJapgolly.agilite.mod.Utils
  var appName: typingsJapgolly.agilite.mod.appName
  var config: AgiliteConfig
  var reqType: typingsJapgolly.agilite.mod.reqType
  def executeCRUDRequest(appName: String, reqType: String, data: js.Any, headers: js.Any): js.Any
  def getConfig(): AgiliteConfig
}

object Agilite {
  @scala.inline
  def apply(
    ApiKeys: ApiKeys,
    BPM: BPM,
    Connectors: Connectors,
    DataMappings: DataMappings,
    Files: Files,
    Keywords: Keywords,
    Numbering: Numbering,
    Roles: Roles,
    Templates: Templates,
    TierStructures: TierStructures,
    Utils: Utils,
    appName: appName,
    config: AgiliteConfig,
    executeCRUDRequest: (String, String, js.Any, js.Any) => CallbackTo[js.Any],
    getConfig: CallbackTo[AgiliteConfig],
    reqType: reqType
  ): Agilite = {
    val __obj = js.Dynamic.literal(ApiKeys = ApiKeys.asInstanceOf[js.Any], BPM = BPM.asInstanceOf[js.Any], Connectors = Connectors.asInstanceOf[js.Any], DataMappings = DataMappings.asInstanceOf[js.Any], Files = Files.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Numbering = Numbering.asInstanceOf[js.Any], Roles = Roles.asInstanceOf[js.Any], Templates = Templates.asInstanceOf[js.Any], TierStructures = TierStructures.asInstanceOf[js.Any], Utils = Utils.asInstanceOf[js.Any], appName = appName.asInstanceOf[js.Any], config = config.asInstanceOf[js.Any], reqType = reqType.asInstanceOf[js.Any])
    __obj.updateDynamic("executeCRUDRequest")(js.Any.fromFunction4((t0: java.lang.String, t1: java.lang.String, t2: js.Any, t3: js.Any) => executeCRUDRequest(t0, t1, t2, t3).runNow()))
    __obj.updateDynamic("getConfig")(getConfig.toJsFn)
    __obj.asInstanceOf[Agilite]
  }
}

