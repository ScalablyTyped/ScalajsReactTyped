package typingsJapgolly.reduxPersist

import typingsJapgolly.reduxPersist.createMigrateMod.MigrationConfig
import typingsJapgolly.reduxPersist.typesMod.MigrationManifest
import typingsJapgolly.reduxPersist.typesMod.PersistMigrate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/lib/createMigrate", JSImport.Namespace)
@js.native
object libCreateMigrateMod extends js.Object {
  def default(migrations: MigrationManifest): PersistMigrate = js.native
  def default(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}

