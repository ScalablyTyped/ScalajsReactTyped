package typingsJapgolly.reduxPersist.createMigrateMod

import typingsJapgolly.reduxPersist.typesMod.MigrationManifest
import typingsJapgolly.reduxPersist.typesMod.PersistMigrate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-persist/es/createMigrate", JSImport.Default)
@js.native
object default extends js.Object {
  def apply(migrations: MigrationManifest): PersistMigrate = js.native
  def apply(migrations: MigrationManifest, config: MigrationConfig): PersistMigrate = js.native
}

