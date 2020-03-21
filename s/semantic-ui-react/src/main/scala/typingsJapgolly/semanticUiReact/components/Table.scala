package typingsJapgolly.semanticUiReact.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.semanticUiReact.genericMod.SemanticCOLORS
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandCollection
import typingsJapgolly.semanticUiReact.genericMod.SemanticShorthandItem
import typingsJapgolly.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsJapgolly.semanticUiReact.genericMod.SemanticWIDTHS
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.bottom
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.center
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.internally
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.large
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.left
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.right
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.small
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.top
import typingsJapgolly.semanticUiReact.semanticUiReactStrings.very
import typingsJapgolly.semanticUiReact.tableRowMod.TableRowProps
import typingsJapgolly.semanticUiReact.tableTableMod.TableProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    attached: Boolean | top | bottom = null,
    basic: Boolean | very = null,
    celled: Boolean | internally = null,
    className: String = null,
    collapsing: js.UndefOr[Boolean] = js.undefined,
    color: SemanticCOLORS = null,
    columns: SemanticWIDTHS = null,
    compact: Boolean | very = null,
    definition: js.UndefOr[Boolean] = js.undefined,
    fixed: js.UndefOr[Boolean] = js.undefined,
    footerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRow: SemanticShorthandItem[TableRowProps] = null,
    headerRows: SemanticShorthandCollection[TableRowProps] = null,
    inverted: js.UndefOr[Boolean] = js.undefined,
    padded: Boolean | very = null,
    renderBodyRow: (/* data */ js.Any, /* index */ Double) => CallbackTo[js.Any] = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    singleLine: js.UndefOr[Boolean] = js.undefined,
    size: small | large = null,
    sortable: js.UndefOr[Boolean] = js.undefined,
    stackable: js.UndefOr[Boolean] = js.undefined,
    striped: js.UndefOr[Boolean] = js.undefined,
    structured: js.UndefOr[Boolean] = js.undefined,
    tableData: js.Array[_] = null,
    textAlign: center | left | right = null,
    unstackable: js.UndefOr[Boolean] = js.undefined,
    verticalAlign: SemanticVERTICALALIGNMENTS = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TableProps, 
    MountedWithRawType[TableProps, js.Object, RawMounted[TableProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (attached != null) __obj.updateDynamic("attached")(attached.asInstanceOf[js.Any])
    if (basic != null) __obj.updateDynamic("basic")(basic.asInstanceOf[js.Any])
    if (celled != null) __obj.updateDynamic("celled")(celled.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsing)) __obj.updateDynamic("collapsing")(collapsing.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(definition)) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(fixed)) __obj.updateDynamic("fixed")(fixed.asInstanceOf[js.Any])
    if (footerRow != null) __obj.updateDynamic("footerRow")(footerRow.asInstanceOf[js.Any])
    if (headerRow != null) __obj.updateDynamic("headerRow")(headerRow.asInstanceOf[js.Any])
    if (headerRows != null) __obj.updateDynamic("headerRows")(headerRows.asInstanceOf[js.Any])
    if (!js.isUndefined(inverted)) __obj.updateDynamic("inverted")(inverted.asInstanceOf[js.Any])
    if (padded != null) __obj.updateDynamic("padded")(padded.asInstanceOf[js.Any])
    if (renderBodyRow != null) __obj.updateDynamic("renderBodyRow")(js.Any.fromFunction2((t0: /* data */ js.Any, t1: /* index */ scala.Double) => renderBodyRow(t0, t1).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(singleLine)) __obj.updateDynamic("singleLine")(singleLine.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (!js.isUndefined(sortable)) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (!js.isUndefined(stackable)) __obj.updateDynamic("stackable")(stackable.asInstanceOf[js.Any])
    if (!js.isUndefined(striped)) __obj.updateDynamic("striped")(striped.asInstanceOf[js.Any])
    if (!js.isUndefined(structured)) __obj.updateDynamic("structured")(structured.asInstanceOf[js.Any])
    if (tableData != null) __obj.updateDynamic("tableData")(tableData.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(unstackable)) __obj.updateDynamic("unstackable")(unstackable.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.semanticUiReact.tableTableMod.TableProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.semanticUiReact.tableTableMod.TableProps])(children: _*)
  }
  @JSImport("semantic-ui-react/dist/commonjs/collections/Table", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

