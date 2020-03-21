package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEditorProps[TRow /* <: js.Object */, K /* <: String */]
  extends EditableAttrs
     with /**
	 * Contents of the customEditorParameters object.
	 */
/* parameterName */ StringDictionary[js.Any] {
  /**
  	 * Default value for the editor cell.
  	 */
  var defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any
  /**
  	 * The row data for the cell being edited.
  	 */
  var row: TRow
}

object CustomEditorProps {
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: String */](
    defaultValue: /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ js.Any,
    row: TRow,
    StringDictionary: /**
  	 * Contents of the customEditorParameters object.
  	 */
  /* parameterName */ StringDictionary[js.Any] = null,
    onBlur: js.UndefOr[Callback] = js.undefined,
    onKeyDown: js.UndefOr[Callback] = js.undefined,
    placeholder: String = null,
    ref: /* ref */ js.Any => CallbackTo[js.Any] = null
  ): CustomEditorProps[TRow, K] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    onBlur.foreach(p => __obj.updateDynamic("onBlur")(p.toJsFn))
    onKeyDown.foreach(p => __obj.updateDynamic("onKeyDown")(p.toJsFn))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(js.Any.fromFunction1((t0: /* ref */ js.Any) => ref(t0).runNow()))
    __obj.asInstanceOf[CustomEditorProps[TRow, K]]
  }
}

