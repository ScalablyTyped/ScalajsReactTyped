package typingsJapgolly.knexDbManager.mod

import typingsJapgolly.knex.mod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DbanagerFactoryConfig extends js.Object {
  var dbManager: DbManagerConfig
  var knex: Config | String
}

object DbanagerFactoryConfig {
  @scala.inline
  def apply(dbManager: DbManagerConfig, knex: Config | String): DbanagerFactoryConfig = {
    val __obj = js.Dynamic.literal(dbManager = dbManager.asInstanceOf[js.Any], knex = knex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DbanagerFactoryConfig]
  }
}

