package typingsJapgolly.handsontable.mod.Handsontable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable6
import org.scalajs.dom.raw.HTMLTableCellElement
import typingsJapgolly.handsontable.mod.Handsontable._editors.Autocomplete
import typingsJapgolly.handsontable.mod.Handsontable._editors.Base
import typingsJapgolly.handsontable.mod.Handsontable._editors.Checkbox
import typingsJapgolly.handsontable.mod.Handsontable._editors.Date
import typingsJapgolly.handsontable.mod.Handsontable._editors.Dropdown
import typingsJapgolly.handsontable.mod.Handsontable._editors.Mobile
import typingsJapgolly.handsontable.mod.Handsontable._editors.Numeric
import typingsJapgolly.handsontable.mod.Handsontable._editors.Password
import typingsJapgolly.handsontable.mod.Handsontable._editors.Select
import typingsJapgolly.handsontable.mod.Handsontable._editors.Text
import typingsJapgolly.handsontable.mod._Handsontable.Core
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editors extends js.Object {
  var AutocompleteEditor: Instantiable0[Autocomplete]
  var BaseEditor: Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ]
  var CheckboxEditor: Instantiable0[Checkbox]
  var DateEditor: Instantiable0[Date]
  var DropdownEditor: Instantiable0[Dropdown]
  var HandsontableEditor: Instantiable0[typingsJapgolly.handsontable.mod.Handsontable._editors.Handsontable]
  var MobileEditor: Instantiable0[Mobile]
  var NumericEditor: Instantiable0[Numeric]
  var PasswordEditor: Instantiable0[Password]
  var SelectEditor: Instantiable0[Select]
  var TextEditor: Instantiable0[Text]
  var TimeEditor: Instantiable0[Text]
  def getEditor(editorName: String): Instantiable6[
    /* hotInstance */ Core, 
    /* row */ Double, 
    /* col */ Double, 
    /* prop */ String | Double, 
    /* TD */ HTMLTableCellElement, 
    /* cellProperties */ CellProperties, 
    Base
  ]
  def registerEditor(
    editorName: String,
    editorClass: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]
  ): Unit
}

object Editors {
  @scala.inline
  def apply(
    AutocompleteEditor: Instantiable0[Autocomplete],
    BaseEditor: Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ],
    CheckboxEditor: Instantiable0[Checkbox],
    DateEditor: Instantiable0[Date],
    DropdownEditor: Instantiable0[Dropdown],
    HandsontableEditor: Instantiable0[typingsJapgolly.handsontable.mod.Handsontable._editors.Handsontable],
    MobileEditor: Instantiable0[Mobile],
    NumericEditor: Instantiable0[Numeric],
    PasswordEditor: Instantiable0[Password],
    SelectEditor: Instantiable0[Select],
    TextEditor: Instantiable0[Text],
    TimeEditor: Instantiable0[Text],
    getEditor: String => CallbackTo[
      Instantiable6[
        /* hotInstance */ Core, 
        /* row */ Double, 
        /* col */ Double, 
        /* prop */ String | Double, 
        /* TD */ HTMLTableCellElement, 
        /* cellProperties */ CellProperties, 
        Base
      ]
    ],
    registerEditor: (String, Instantiable6[
      /* hotInstance */ Core, 
      /* row */ Double, 
      /* col */ Double, 
      /* prop */ String | Double, 
      /* TD */ HTMLTableCellElement, 
      /* cellProperties */ CellProperties, 
      Base
    ]) => Callback
  ): Editors = {
    val __obj = js.Dynamic.literal(AutocompleteEditor = AutocompleteEditor.asInstanceOf[js.Any], BaseEditor = BaseEditor.asInstanceOf[js.Any], CheckboxEditor = CheckboxEditor.asInstanceOf[js.Any], DateEditor = DateEditor.asInstanceOf[js.Any], DropdownEditor = DropdownEditor.asInstanceOf[js.Any], HandsontableEditor = HandsontableEditor.asInstanceOf[js.Any], MobileEditor = MobileEditor.asInstanceOf[js.Any], NumericEditor = NumericEditor.asInstanceOf[js.Any], PasswordEditor = PasswordEditor.asInstanceOf[js.Any], SelectEditor = SelectEditor.asInstanceOf[js.Any], TextEditor = TextEditor.asInstanceOf[js.Any], TimeEditor = TimeEditor.asInstanceOf[js.Any])
    __obj.updateDynamic("getEditor")(js.Any.fromFunction1((t0: java.lang.String) => getEditor(t0).runNow()))
    __obj.updateDynamic("registerEditor")(js.Any.fromFunction2((t0: java.lang.String, t1: org.scalablytyped.runtime.Instantiable6[
  /* hotInstance */ typingsJapgolly.handsontable.mod._Handsontable.Core, 
  /* row */ scala.Double, 
  /* col */ scala.Double, 
  /* prop */ java.lang.String | scala.Double, 
  /* TD */ org.scalajs.dom.raw.HTMLTableCellElement, 
  /* cellProperties */ typingsJapgolly.handsontable.mod.Handsontable.CellProperties, 
  typingsJapgolly.handsontable.mod.Handsontable._editors.Base]) => registerEditor(t0, t1).runNow()))
    __obj.asInstanceOf[Editors]
  }
}

