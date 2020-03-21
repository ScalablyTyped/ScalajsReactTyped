package typingsJapgolly.extjs.Ext.grid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPropertyGrid extends IPanel {
  /** [Config Option] (Object) */
  var customEditors: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var customRenderers: js.UndefOr[js.Any] = js.undefined
  /** [Method] Gets the source data object containing the property data
  		* @returns Object The data object.
  		*/
  var getSource: js.UndefOr[js.Function0[_]] = js.undefined
  /** [Config Option] (Boolean) */
  var inferTypes: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Number/String) */
  var nameColumnWidth: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var nameField: js.UndefOr[String] = js.undefined
  /** [Config Option] (Object) */
  var propertyNames: js.UndefOr[js.Any] = js.undefined
  /** [Method] Removes a property from the grid
  		* @param prop String The name of the property to remove.
  		*/
  var removeProperty: js.UndefOr[js.Function1[/* prop */ js.UndefOr[String], Unit]] = js.undefined
  /** [Method] Sets the value of a property
  		* @param prop String The name of the property to set.
  		* @param value Object The value to test.
  		* @param create Boolean true to create the property if it doesn't already exist.
  		*/
  var setProperty: js.UndefOr[
    js.Function3[
      /* prop */ js.UndefOr[String], 
      /* value */ js.UndefOr[js.Any], 
      /* create */ js.UndefOr[Boolean], 
      Unit
    ]
  ] = js.undefined
  /** [Method] Sets the source data object containing the property data
  		* @param source Object The data object.
  		* @param sourceConfig Object A new object. If this argument is not passed the current configuration will be re-used. To reset the config, pass null or an empty object literal.
  		*/
  var setSource: js.UndefOr[
    js.Function2[/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any], Unit]
  ] = js.undefined
  /** [Config Option] (Object) */
  var source: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var sourceConfig: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var valueField: js.UndefOr[String] = js.undefined
}

object IPropertyGrid {
  @scala.inline
  def apply(
    IPanel: IPanel = null,
    customEditors: js.Any = null,
    customRenderers: js.Any = null,
    getSource: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    inferTypes: js.UndefOr[Boolean] = js.undefined,
    nameColumnWidth: js.Any = null,
    nameField: String = null,
    propertyNames: js.Any = null,
    removeProperty: /* prop */ js.UndefOr[String] => Callback = null,
    setProperty: (/* prop */ js.UndefOr[String], /* value */ js.UndefOr[js.Any], /* create */ js.UndefOr[Boolean]) => Callback = null,
    setSource: (/* source */ js.UndefOr[js.Any], /* sourceConfig */ js.UndefOr[js.Any]) => Callback = null,
    source: js.Any = null,
    sourceConfig: js.Any = null,
    valueField: String = null
  ): IPropertyGrid = {
    val __obj = js.Dynamic.literal()
    if (IPanel != null) js.Dynamic.global.Object.assign(__obj, IPanel)
    if (customEditors != null) __obj.updateDynamic("customEditors")(customEditors.asInstanceOf[js.Any])
    if (customRenderers != null) __obj.updateDynamic("customRenderers")(customRenderers.asInstanceOf[js.Any])
    getSource.foreach(p => __obj.updateDynamic("getSource")(p.toJsFn))
    if (!js.isUndefined(inferTypes)) __obj.updateDynamic("inferTypes")(inferTypes.asInstanceOf[js.Any])
    if (nameColumnWidth != null) __obj.updateDynamic("nameColumnWidth")(nameColumnWidth.asInstanceOf[js.Any])
    if (nameField != null) __obj.updateDynamic("nameField")(nameField.asInstanceOf[js.Any])
    if (propertyNames != null) __obj.updateDynamic("propertyNames")(propertyNames.asInstanceOf[js.Any])
    if (removeProperty != null) __obj.updateDynamic("removeProperty")(js.Any.fromFunction1((t0: /* prop */ js.UndefOr[java.lang.String]) => removeProperty(t0).runNow()))
    if (setProperty != null) __obj.updateDynamic("setProperty")(js.Any.fromFunction3((t0: /* prop */ js.UndefOr[java.lang.String], t1: /* value */ js.UndefOr[js.Any], t2: /* create */ js.UndefOr[scala.Boolean]) => setProperty(t0, t1, t2).runNow()))
    if (setSource != null) __obj.updateDynamic("setSource")(js.Any.fromFunction2((t0: /* source */ js.UndefOr[js.Any], t1: /* sourceConfig */ js.UndefOr[js.Any]) => setSource(t0, t1).runNow()))
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceConfig != null) __obj.updateDynamic("sourceConfig")(sourceConfig.asInstanceOf[js.Any])
    if (valueField != null) __obj.updateDynamic("valueField")(valueField.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPropertyGrid]
  }
}

