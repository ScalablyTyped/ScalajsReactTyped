package typingsJapgolly.jsoneditor.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.ace.AceAjax.Ace
import typingsJapgolly.ajv.mod.Ajv
import typingsJapgolly.jsoneditor.AnonField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSONEditorOptions extends js.Object {
  var ace: js.UndefOr[Ace] = js.undefined
  var ajv: js.UndefOr[Ajv] = js.undefined
  var autocomplete: js.UndefOr[AutoCompleteOptions] = js.undefined
  /**
    * @default true
    */
  var colorPicker: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var enableSort: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var enableTransform: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var escapeUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var history: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 2
    */
  var indentation: js.UndefOr[Double] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var languages: js.UndefOr[StringDictionary[StringDictionary[String]]] = js.undefined
  /**
    * @default true
    */
  var mainMenuBar: js.UndefOr[Boolean] = js.undefined
  /**
    * @default 100
    */
  var maxVisibleChilds: js.UndefOr[Double] = js.undefined
  var modalAnchor: js.UndefOr[HTMLElement] = js.undefined
  /**
    * @default 'tree'
    */
  var mode: js.UndefOr[JSONEditorMode] = js.undefined
  var modes: js.UndefOr[js.Array[JSONEditorMode]] = js.undefined
  /**
    * @default undefined
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var navigationBar: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var onChangeJSON: js.UndefOr[js.Function1[/* json */ js.Any, Unit]] = js.undefined
  var onChangeText: js.UndefOr[js.Function1[/* jsonString */ String, Unit]] = js.undefined
  var onColorPicker: js.UndefOr[
    js.Function3[
      /* parent */ HTMLElement, 
      /* color */ String, 
      /* onChange */ js.Function1[/* color */ Color, Unit], 
      Unit
    ]
  ] = js.undefined
  var onEditable: js.UndefOr[js.Function1[/* node */ Node, Boolean | AnonField]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
  var onEvent: js.UndefOr[js.Function2[/* node */ Node, /* event */ String, Unit]] = js.undefined
  var onModeChange: js.UndefOr[js.Function2[/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode, Unit]] = js.undefined
  var onNodeName: js.UndefOr[js.Function1[/* nodeName */ NodeName, js.UndefOr[String]]] = js.undefined
  var onSelectionChange: js.UndefOr[js.Function2[/* start */ SerializableNode, /* end */ SerializableNode, Unit]] = js.undefined
  var onTextSelectionChange: js.UndefOr[
    js.Function3[/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String, Unit]
  ] = js.undefined
  var onValidate: js.UndefOr[
    js.Function1[
      /* json */ js.Any, 
      js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]
    ]
  ] = js.undefined
  var schema: js.UndefOr[js.Object] = js.undefined
  var schemaRefs: js.UndefOr[js.Object] = js.undefined
  /**
    * @default true
    */
  var search: js.UndefOr[Boolean] = js.undefined
  /**
    * @default false
    */
  var sortObjectKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * @default true
    */
  var statusBar: js.UndefOr[Boolean] = js.undefined
  var templates: js.UndefOr[js.Array[Template]] = js.undefined
  var theme: js.UndefOr[String] = js.undefined
  /**
    * @default true
    */
  var timestampTag: js.UndefOr[Boolean] = js.undefined
}

object JSONEditorOptions {
  @scala.inline
  def apply(
    ace: Ace = null,
    ajv: Ajv = null,
    autocomplete: AutoCompleteOptions = null,
    colorPicker: js.UndefOr[Boolean] = js.undefined,
    enableSort: js.UndefOr[Boolean] = js.undefined,
    enableTransform: js.UndefOr[Boolean] = js.undefined,
    escapeUnicode: js.UndefOr[Boolean] = js.undefined,
    history: js.UndefOr[Boolean] = js.undefined,
    indentation: Int | Double = null,
    language: String = null,
    languages: StringDictionary[StringDictionary[String]] = null,
    mainMenuBar: js.UndefOr[Boolean] = js.undefined,
    maxVisibleChilds: Int | Double = null,
    modalAnchor: HTMLElement = null,
    mode: JSONEditorMode = null,
    modes: js.Array[JSONEditorMode] = null,
    name: String = null,
    navigationBar: js.UndefOr[Boolean] = js.undefined,
    onChange: js.UndefOr[Callback] = js.undefined,
    onChangeJSON: /* json */ js.Any => Callback = null,
    onChangeText: /* jsonString */ String => Callback = null,
    onColorPicker: (/* parent */ HTMLElement, /* color */ String, /* onChange */ js.Function1[/* color */ Color, Unit]) => Callback = null,
    onEditable: /* node */ Node => CallbackTo[Boolean | AnonField] = null,
    onError: /* error */ js.Error => Callback = null,
    onEvent: (/* node */ Node, /* event */ String) => Callback = null,
    onModeChange: (/* newMode */ JSONEditorMode, /* oldMode */ JSONEditorMode) => Callback = null,
    onNodeName: /* nodeName */ NodeName => CallbackTo[js.UndefOr[String]] = null,
    onSelectionChange: (/* start */ SerializableNode, /* end */ SerializableNode) => Callback = null,
    onTextSelectionChange: (/* start */ SelectionPosition, /* end */ SelectionPosition, /* text */ String) => Callback = null,
    onValidate: /* json */ js.Any => CallbackTo[js.Array[ValidationError] | js.Promise[js.Array[ValidationError]]] = null,
    schema: js.Object = null,
    schemaRefs: js.Object = null,
    search: js.UndefOr[Boolean] = js.undefined,
    sortObjectKeys: js.UndefOr[Boolean] = js.undefined,
    statusBar: js.UndefOr[Boolean] = js.undefined,
    templates: js.Array[Template] = null,
    theme: String = null,
    timestampTag: js.UndefOr[Boolean] = js.undefined
  ): JSONEditorOptions = {
    val __obj = js.Dynamic.literal()
    if (ace != null) __obj.updateDynamic("ace")(ace.asInstanceOf[js.Any])
    if (ajv != null) __obj.updateDynamic("ajv")(ajv.asInstanceOf[js.Any])
    if (autocomplete != null) __obj.updateDynamic("autocomplete")(autocomplete.asInstanceOf[js.Any])
    if (!js.isUndefined(colorPicker)) __obj.updateDynamic("colorPicker")(colorPicker.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSort)) __obj.updateDynamic("enableSort")(enableSort.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTransform)) __obj.updateDynamic("enableTransform")(enableTransform.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeUnicode)) __obj.updateDynamic("escapeUnicode")(escapeUnicode.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (indentation != null) __obj.updateDynamic("indentation")(indentation.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (languages != null) __obj.updateDynamic("languages")(languages.asInstanceOf[js.Any])
    if (!js.isUndefined(mainMenuBar)) __obj.updateDynamic("mainMenuBar")(mainMenuBar.asInstanceOf[js.Any])
    if (maxVisibleChilds != null) __obj.updateDynamic("maxVisibleChilds")(maxVisibleChilds.asInstanceOf[js.Any])
    if (modalAnchor != null) __obj.updateDynamic("modalAnchor")(modalAnchor.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (modes != null) __obj.updateDynamic("modes")(modes.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigationBar)) __obj.updateDynamic("navigationBar")(navigationBar.asInstanceOf[js.Any])
    onChange.foreach(p => __obj.updateDynamic("onChange")(p.toJsFn))
    if (onChangeJSON != null) __obj.updateDynamic("onChangeJSON")(js.Any.fromFunction1((t0: /* json */ js.Any) => onChangeJSON(t0).runNow()))
    if (onChangeText != null) __obj.updateDynamic("onChangeText")(js.Any.fromFunction1((t0: /* jsonString */ java.lang.String) => onChangeText(t0).runNow()))
    if (onColorPicker != null) __obj.updateDynamic("onColorPicker")(js.Any.fromFunction3((t0: /* parent */ org.scalajs.dom.raw.HTMLElement, t1: /* color */ java.lang.String, t2: /* onChange */ js.Function1[/* color */ typingsJapgolly.jsoneditor.mod.Color, scala.Unit]) => onColorPicker(t0, t1, t2).runNow()))
    if (onEditable != null) __obj.updateDynamic("onEditable")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.jsoneditor.mod.Node) => onEditable(t0).runNow()))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: /* error */ js.Error) => onError(t0).runNow()))
    if (onEvent != null) __obj.updateDynamic("onEvent")(js.Any.fromFunction2((t0: /* node */ typingsJapgolly.jsoneditor.mod.Node, t1: /* event */ java.lang.String) => onEvent(t0, t1).runNow()))
    if (onModeChange != null) __obj.updateDynamic("onModeChange")(js.Any.fromFunction2((t0: /* newMode */ typingsJapgolly.jsoneditor.mod.JSONEditorMode, t1: /* oldMode */ typingsJapgolly.jsoneditor.mod.JSONEditorMode) => onModeChange(t0, t1).runNow()))
    if (onNodeName != null) __obj.updateDynamic("onNodeName")(js.Any.fromFunction1((t0: /* nodeName */ typingsJapgolly.jsoneditor.mod.NodeName) => onNodeName(t0).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2((t0: /* start */ typingsJapgolly.jsoneditor.mod.SerializableNode, t1: /* end */ typingsJapgolly.jsoneditor.mod.SerializableNode) => onSelectionChange(t0, t1).runNow()))
    if (onTextSelectionChange != null) __obj.updateDynamic("onTextSelectionChange")(js.Any.fromFunction3((t0: /* start */ typingsJapgolly.jsoneditor.mod.SelectionPosition, t1: /* end */ typingsJapgolly.jsoneditor.mod.SelectionPosition, t2: /* text */ java.lang.String) => onTextSelectionChange(t0, t1, t2).runNow()))
    if (onValidate != null) __obj.updateDynamic("onValidate")(js.Any.fromFunction1((t0: /* json */ js.Any) => onValidate(t0).runNow()))
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaRefs != null) __obj.updateDynamic("schemaRefs")(schemaRefs.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    if (!js.isUndefined(sortObjectKeys)) __obj.updateDynamic("sortObjectKeys")(sortObjectKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(statusBar)) __obj.updateDynamic("statusBar")(statusBar.asInstanceOf[js.Any])
    if (templates != null) __obj.updateDynamic("templates")(templates.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampTag)) __obj.updateDynamic("timestampTag")(timestampTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSONEditorOptions]
  }
}

