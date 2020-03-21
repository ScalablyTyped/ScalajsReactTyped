package typingsJapgolly.jsonFormData.mod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Formatting options for modifying the final generated FormData object.
  *
  * ## Defaults
  *
  *     const defaultOpts = {
  *       initialFormData: new FormData(),
  *       showLeafArrayIndexes: true,
  *       includeNullValues: false,
  *       mapping: value => {
  *         if (typeof value === 'boolean') {
  *           return +value ? '1' : '0';
  *         }
  *
  *         return value;
  *       }
  *     }
  */
trait FormatOptions extends js.Object {
  /**
    * Include null values in output (default: `false`).
    *
    * ## Examples
    *
    *     const json = { foo: 1, bar: null };
    *     const withoutNullValues = asFormData(json, { includeNullValues: false });
    *     // => FormData {
    *     //   foo: '1'
    *     // }
    *     const withNullValues = asFormData(json, { includeNullValues: true });
    *     // => FormData {
    *     //   foo: '1'
    *     //   bar: 'null'
    *     // }
    *
    */
  var includeNullValues: js.UndefOr[Boolean] = js.undefined
  /**
    * Existing form data which values will be appended to  (default: `new FormData()`).
    * This can be used to support environments that do not have a global FormData object.
    */
  var initialFormData: js.UndefOr[InitialFormData] = js.undefined
  /**
    * Modify outmost leaf values before calling formData.append. Default behaviour
    * is to output boolean values as '1'/'0' (true/false) and all other values
    * without modification.
    *
    * ## Examples
    *
    *     const json = { foo: true, bar: false };
    *     const data = asFormData(json);
    *     // => FormData {
    *     //   foo: '1',
    *     //   bar: '0',
    *     // }
    *     const mapping = value => `foo_${value}`;
    *     const custom = asFormData(json, { mapping });
    *     // => FormData {
    *     //   foo: 'foo_true',
    *     //   bar: 'foo_false'
    *     // }
    *
    */
  var mapping: js.UndefOr[js.Function1[/* value */ ValidJSONValue, String | Blob]] = js.undefined
  /**
    * Include index values in arrays (default: `true`).
    *
    * ## Examples
    *
    *     const json = { ids: [1, 2, 3] };
    *     const withArrayIndices = asFormData(json, { showLeafArrayIndex: true });
    *     // => FormData {
    *     //   ids[0]: '1',
    *     //   ids[1]: '2',
    *     //   ids[2]: '3',
    *     // }
    *     const withoutArrayIndices = asFormData(json, { showLeafArrayIndex: false });
    *     // => FormData {
    *     //   ids[]: '1',
    *     //   ids[]: '2',
    *     //   ids[]: '3',
    *     // }
    *
    */
  var showLeafArrayIndexes: js.UndefOr[Boolean] = js.undefined
}

object FormatOptions {
  @scala.inline
  def apply(
    includeNullValues: js.UndefOr[Boolean] = js.undefined,
    initialFormData: InitialFormData = null,
    mapping: /* value */ ValidJSONValue => CallbackTo[String | Blob] = null,
    showLeafArrayIndexes: js.UndefOr[Boolean] = js.undefined
  ): FormatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNullValues)) __obj.updateDynamic("includeNullValues")(includeNullValues.asInstanceOf[js.Any])
    if (initialFormData != null) __obj.updateDynamic("initialFormData")(initialFormData.asInstanceOf[js.Any])
    if (mapping != null) __obj.updateDynamic("mapping")(js.Any.fromFunction1((t0: /* value */ typingsJapgolly.jsonFormData.mod.ValidJSONValue) => mapping(t0).runNow()))
    if (!js.isUndefined(showLeafArrayIndexes)) __obj.updateDynamic("showLeafArrayIndexes")(showLeafArrayIndexes.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatOptions]
  }
}

