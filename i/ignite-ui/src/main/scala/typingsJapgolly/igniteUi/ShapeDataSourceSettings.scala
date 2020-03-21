package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShapeDataSourceSettings
  extends /**
	 * Option for ShapeDataSourceSettings
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Callback function to call when data binding is complete.
  	 */
  var callback: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Object on which to invoke the callback function.
  	 */
  var callee: js.UndefOr[js.Any] = js.undefined
  /**
  	 * The Uri of the .dbf portion of the Shapefile.
  	 */
  var databaseSource: js.UndefOr[String] = js.undefined
  /**
  	 * The unique identifier.
  	 */
  var id: js.UndefOr[String] = js.undefined
  /**
  	 * Callback function to call when the import process has been completed
  	 * paramType="object" the ShapeDataSource instance
  	 */
  var importCompleted: js.UndefOr[js.Function] = js.undefined
  /**
  	 * The Uri of the .shp portion of the Shapefile.
  	 */
  var shapefileSource: js.UndefOr[String] = js.undefined
  /**
  	 * Callback function to call to allow the bounds of the shape data source to be transformed.
  	 * paramType="object" the bounds of the shape datasource to be transformed in place. The object will look like { top: value, left: value, width: value, height: value }
  	 */
  var transformBounds: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Callback function to call to allow points in the shape records to be transformed.
  	 * paramType="object" the point to be transformed in place. The object will look like { x: value, y: value2 }
  	 */
  var transformPoint: js.UndefOr[js.Function] = js.undefined
  /**
  	 * Callback function to call to allow shape records to be transformed.
  	 * paramType="object" the shape record to be transformed.
  	 */
  var transformRecord: js.UndefOr[js.Function] = js.undefined
}

object ShapeDataSourceSettings {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for ShapeDataSourceSettings
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    callback: js.Function = null,
    callee: js.Any = null,
    databaseSource: String = null,
    id: String = null,
    importCompleted: js.Function = null,
    shapefileSource: String = null,
    transformBounds: js.Function = null,
    transformPoint: js.Function = null,
    transformRecord: js.Function = null
  ): ShapeDataSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (callee != null) __obj.updateDynamic("callee")(callee.asInstanceOf[js.Any])
    if (databaseSource != null) __obj.updateDynamic("databaseSource")(databaseSource.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (importCompleted != null) __obj.updateDynamic("importCompleted")(importCompleted.asInstanceOf[js.Any])
    if (shapefileSource != null) __obj.updateDynamic("shapefileSource")(shapefileSource.asInstanceOf[js.Any])
    if (transformBounds != null) __obj.updateDynamic("transformBounds")(transformBounds.asInstanceOf[js.Any])
    if (transformPoint != null) __obj.updateDynamic("transformPoint")(transformPoint.asInstanceOf[js.Any])
    if (transformRecord != null) __obj.updateDynamic("transformRecord")(transformRecord.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeDataSourceSettings]
  }
}

