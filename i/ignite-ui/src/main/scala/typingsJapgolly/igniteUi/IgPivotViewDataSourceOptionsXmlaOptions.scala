package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgPivotViewDataSourceOptionsXmlaOptions
  extends /**
	 * Option for IgPivotViewDataSourceOptionsXmlaOptions
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * The catalog name.
  	 */
  var catalog: js.UndefOr[String] = js.undefined
  /**
  	 * The name of the cube in the data source.
  	 */
  var cube: js.UndefOr[String] = js.undefined
  /**
  	 * Additional properties sent with every discover request.
  	 * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var discoverProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Enables/disables caching of the XMLA result object.
  	 */
  var enableResultCache: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Additional properties sent with every execute request.
  	 * The object is treated as a key/value store where each property name is used as the key and the property value as the value.
  	 */
  var executeProperties: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Optional="true" a javascript object containing information about how the request to the xmla server should be processed
  	 */
  var mdxSettings: js.UndefOr[IgPivotViewDataSourceOptionsXmlaOptionsMdxSettings] = js.undefined
  /**
  	 * The name of the measure group in the data source.
  	 */
  var measureGroup: js.UndefOr[String] = js.undefined
  /**
  	 * An object containing information about how the request to the XMLA server should be processed.
  	 */
  var requestOptions: js.UndefOr[IgPivotViewDataSourceOptionsXmlaOptionsRequestOptions] = js.undefined
  /**
  	 * Optional="false" The URL of the XMLA server.
  	 */
  var serverUrl: js.UndefOr[String] = js.undefined
}

object IgPivotViewDataSourceOptionsXmlaOptions {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for IgPivotViewDataSourceOptionsXmlaOptions
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    catalog: String = null,
    cube: String = null,
    discoverProperties: js.Any = null,
    enableResultCache: js.UndefOr[Boolean] = js.undefined,
    executeProperties: js.Any = null,
    mdxSettings: IgPivotViewDataSourceOptionsXmlaOptionsMdxSettings = null,
    measureGroup: String = null,
    requestOptions: IgPivotViewDataSourceOptionsXmlaOptionsRequestOptions = null,
    serverUrl: String = null
  ): IgPivotViewDataSourceOptionsXmlaOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (catalog != null) __obj.updateDynamic("catalog")(catalog.asInstanceOf[js.Any])
    if (cube != null) __obj.updateDynamic("cube")(cube.asInstanceOf[js.Any])
    if (discoverProperties != null) __obj.updateDynamic("discoverProperties")(discoverProperties.asInstanceOf[js.Any])
    if (!js.isUndefined(enableResultCache)) __obj.updateDynamic("enableResultCache")(enableResultCache.asInstanceOf[js.Any])
    if (executeProperties != null) __obj.updateDynamic("executeProperties")(executeProperties.asInstanceOf[js.Any])
    if (mdxSettings != null) __obj.updateDynamic("mdxSettings")(mdxSettings.asInstanceOf[js.Any])
    if (measureGroup != null) __obj.updateDynamic("measureGroup")(measureGroup.asInstanceOf[js.Any])
    if (requestOptions != null) __obj.updateDynamic("requestOptions")(requestOptions.asInstanceOf[js.Any])
    if (serverUrl != null) __obj.updateDynamic("serverUrl")(serverUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgPivotViewDataSourceOptionsXmlaOptions]
  }
}

