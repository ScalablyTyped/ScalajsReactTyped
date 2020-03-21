package typingsJapgolly.nodePgMigrate.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.down
import typingsJapgolly.nodePgMigrate.nodePgMigrateStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunnerOptionConfig extends js.Object {
  var checkOrder: js.UndefOr[Boolean] = js.undefined
  var count: Double
  var createMigrationsSchema: js.UndefOr[Boolean] = js.undefined
  var createSchema: js.UndefOr[Boolean] = js.undefined
  var decamelize: js.UndefOr[Boolean] = js.undefined
  var dir: String
  var direction: up | down
  var dryRun: js.UndefOr[Boolean] = js.undefined
  var fake: js.UndefOr[Boolean] = js.undefined
  var file: js.UndefOr[String] = js.undefined
  var ignorePattern: String
  var log: js.UndefOr[js.Function1[/* msg */ String, Unit]] = js.undefined
  var migrationsSchema: js.UndefOr[String] = js.undefined
  var migrationsTable: String
  var noLock: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[String | js.Array[String]] = js.undefined
  var singleTransaction: js.UndefOr[Boolean] = js.undefined
  var timestamp: js.UndefOr[Boolean] = js.undefined
}

object RunnerOptionConfig {
  @scala.inline
  def apply(
    count: Double,
    dir: String,
    direction: up | down,
    ignorePattern: String,
    migrationsTable: String,
    checkOrder: js.UndefOr[Boolean] = js.undefined,
    createMigrationsSchema: js.UndefOr[Boolean] = js.undefined,
    createSchema: js.UndefOr[Boolean] = js.undefined,
    decamelize: js.UndefOr[Boolean] = js.undefined,
    dryRun: js.UndefOr[Boolean] = js.undefined,
    fake: js.UndefOr[Boolean] = js.undefined,
    file: String = null,
    log: /* msg */ String => Callback = null,
    migrationsSchema: String = null,
    noLock: js.UndefOr[Boolean] = js.undefined,
    schema: String | js.Array[String] = null,
    singleTransaction: js.UndefOr[Boolean] = js.undefined,
    timestamp: js.UndefOr[Boolean] = js.undefined
  ): RunnerOptionConfig = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], ignorePattern = ignorePattern.asInstanceOf[js.Any], migrationsTable = migrationsTable.asInstanceOf[js.Any])
    if (!js.isUndefined(checkOrder)) __obj.updateDynamic("checkOrder")(checkOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(createMigrationsSchema)) __obj.updateDynamic("createMigrationsSchema")(createMigrationsSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(createSchema)) __obj.updateDynamic("createSchema")(createSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(decamelize)) __obj.updateDynamic("decamelize")(decamelize.asInstanceOf[js.Any])
    if (!js.isUndefined(dryRun)) __obj.updateDynamic("dryRun")(dryRun.asInstanceOf[js.Any])
    if (!js.isUndefined(fake)) __obj.updateDynamic("fake")(fake.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1((t0: /* msg */ java.lang.String) => log(t0).runNow()))
    if (migrationsSchema != null) __obj.updateDynamic("migrationsSchema")(migrationsSchema.asInstanceOf[js.Any])
    if (!js.isUndefined(noLock)) __obj.updateDynamic("noLock")(noLock.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (!js.isUndefined(singleTransaction)) __obj.updateDynamic("singleTransaction")(singleTransaction.asInstanceOf[js.Any])
    if (!js.isUndefined(timestamp)) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunnerOptionConfig]
  }
}

