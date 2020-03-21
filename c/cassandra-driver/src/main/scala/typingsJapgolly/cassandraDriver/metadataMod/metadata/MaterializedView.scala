package typingsJapgolly.cassandraDriver.metadataMod.metadata

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.AnonDictoption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaterializedView extends DataCollection {
  var includeAllColumns: Boolean
  var tableName: String
  var whereClause: String
}

object MaterializedView {
  @scala.inline
  def apply(
    bloomFilterFalsePositiveChance: Double,
    caching: String,
    clusteringKeys: js.Array[ColumnInfo],
    clusteringOrder: js.Array[String],
    columns: js.Array[ColumnInfo],
    columnsByName: StringDictionary[ColumnInfo],
    comment: String,
    compactionClass: String,
    compactionOptions: StringDictionary[js.Any],
    compression: AnonDictoption,
    defaultTtl: Double,
    extensions: StringDictionary[js.Any],
    gcGraceSeconds: Double,
    includeAllColumns: Boolean,
    localReadRepairChance: Double,
    name: String,
    partitionKeys: js.Array[ColumnInfo],
    populateCacheOnFlush: Boolean,
    readRepairChance: Double,
    speculativeRetry: String,
    tableName: String,
    whereClause: String,
    crcCheckChange: Int | Double = null,
    maxIndexInterval: Int | Double = null,
    minIndexInterval: Int | Double = null
  ): MaterializedView = {
    val __obj = js.Dynamic.literal(bloomFilterFalsePositiveChance = bloomFilterFalsePositiveChance.asInstanceOf[js.Any], caching = caching.asInstanceOf[js.Any], clusteringKeys = clusteringKeys.asInstanceOf[js.Any], clusteringOrder = clusteringOrder.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], columnsByName = columnsByName.asInstanceOf[js.Any], comment = comment.asInstanceOf[js.Any], compactionClass = compactionClass.asInstanceOf[js.Any], compactionOptions = compactionOptions.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], defaultTtl = defaultTtl.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gcGraceSeconds = gcGraceSeconds.asInstanceOf[js.Any], includeAllColumns = includeAllColumns.asInstanceOf[js.Any], localReadRepairChance = localReadRepairChance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partitionKeys = partitionKeys.asInstanceOf[js.Any], populateCacheOnFlush = populateCacheOnFlush.asInstanceOf[js.Any], readRepairChance = readRepairChance.asInstanceOf[js.Any], speculativeRetry = speculativeRetry.asInstanceOf[js.Any], tableName = tableName.asInstanceOf[js.Any], whereClause = whereClause.asInstanceOf[js.Any])
    if (crcCheckChange != null) __obj.updateDynamic("crcCheckChange")(crcCheckChange.asInstanceOf[js.Any])
    if (maxIndexInterval != null) __obj.updateDynamic("maxIndexInterval")(maxIndexInterval.asInstanceOf[js.Any])
    if (minIndexInterval != null) __obj.updateDynamic("minIndexInterval")(minIndexInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaterializedView]
  }
}

