package typingsJapgolly.reactBootstrapTable.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomEditor[TRow /* <: js.Object */, K /* <: String */] extends js.Object {
  /**
  	 * Additional parameters to pass to the getElement function inside the props argument.
  	 */
  var customEditorParameters: js.UndefOr[js.Object] = js.undefined
  /**
  	 * Required. Function to use to create the custom cell editor. Takes two parameters:
  	 *   `onUpdate`: callback function to call to update the value inside the cell.
  	 *   `props`:
  	 */
  def getElement(
    onUpdate: js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ],
    props: CustomEditorProps[TRow, K]
  ): Element
}

object CustomEditor {
  @scala.inline
  def apply[TRow /* <: js.Object */, K /* <: String */](
    getElement: (js.Function1[
      /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
      Unit
    ], CustomEditorProps[TRow, K]) => CallbackTo[Element],
    customEditorParameters: js.Object = null
  ): CustomEditor[TRow, K] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getElement")(js.Any.fromFunction2((t0: js.Function1[
  /* import warning: importer.ImportType#apply Failed type conversion: TRow[K] */ /* updatedCell */ js.Any, 
  scala.Unit], t1: typingsJapgolly.reactBootstrapTable.mod.CustomEditorProps[TRow, K]) => getElement(t0, t1).runNow()))
    if (customEditorParameters != null) __obj.updateDynamic("customEditorParameters")(customEditorParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomEditor[TRow, K]]
  }
}

