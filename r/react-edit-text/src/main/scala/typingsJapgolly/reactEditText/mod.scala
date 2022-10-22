package typingsJapgolly.reactEditText

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.DetailedHTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-edit-text", "EditText")
  @js.native
  open class EditText protected ()
    extends Component[EditTextProps, js.Object, Any] {
    def this(props: EditTextProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextProps, context: Any) = this()
  }
  
  @JSImport("react-edit-text", "EditTextarea")
  @js.native
  open class EditTextarea protected ()
    extends Component[EditTextareaProps, js.Object, Any] {
    def this(props: EditTextareaProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EditTextareaProps, context: Any) = this()
  }
  
  trait EditTextProps
    extends StObject
       with SharedProps {
    
    /**
      * Sets the content for the edit button. This can be any valid element,
      * default: <EditIcon />
      */
    var editButtonContent: js.UndefOr[Node] = js.undefined
    
    /**
      * Sets the props passed to the edit button. This can be any valid DOM attribute,
      * default: {}
      */
    var editButtonProps: js.UndefOr[DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]] = js.undefined
    
    /**
      * Sets the element display to inline when set to true,
      * default: false
      */
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Displays an edit button that can be pressed to enable edit mode,
      * default: false
      */
    var showEditButton: js.UndefOr[Boolean] = js.undefined
    
    /**
      * type attribute set for input element,
      * default: 'text'
      */
    var `type`: js.UndefOr[inputTextType] = js.undefined
  }
  object EditTextProps {
    
    inline def apply(): EditTextProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextProps]
    }
    
    extension [Self <: EditTextProps](x: Self) {
      
      inline def setEditButtonContent(value: VdomNode): Self = StObject.set(x, "editButtonContent", value.rawNode.asInstanceOf[js.Any])
      
      inline def setEditButtonContentNull: Self = StObject.set(x, "editButtonContent", null)
      
      inline def setEditButtonContentUndefined: Self = StObject.set(x, "editButtonContent", js.undefined)
      
      inline def setEditButtonContentVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "editButtonContent", js.Array(value*))
      
      inline def setEditButtonContentVdomElement(value: VdomElement): Self = StObject.set(x, "editButtonContent", value.rawElement.asInstanceOf[js.Any])
      
      inline def setEditButtonProps(value: DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]): Self = StObject.set(x, "editButtonProps", value.asInstanceOf[js.Any])
      
      inline def setEditButtonPropsUndefined: Self = StObject.set(x, "editButtonProps", js.undefined)
      
      inline def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      inline def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      inline def setShowEditButton(value: Boolean): Self = StObject.set(x, "showEditButton", value.asInstanceOf[js.Any])
      
      inline def setShowEditButtonUndefined: Self = StObject.set(x, "showEditButton", js.undefined)
      
      inline def setType(value: inputTextType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditTextareaProps
    extends StObject
       with SharedProps {
    
    /**
      * the number of visible rows,
      * default: 3
      */
    var rows: js.UndefOr[Double] = js.undefined
  }
  object EditTextareaProps {
    
    inline def apply(): EditTextareaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditTextareaProps]
    }
    
    extension [Self <: EditTextareaProps](x: Self) {
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    }
  }
  
  trait SharedProps extends StObject {
    
    /**
      * class attribute set for display element
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * defaultValue sets the defaultValue for input element and initial text of display element
      */
    var defaultValue: js.UndefOr[String] = js.undefined
    
    /**
      * formatDisplayText is used to pass in a function which takes in a value and returns a formatted value
      * which is used to format the text shown in the display element
      * default: (val) => val
      */
    var formatDisplayText: js.UndefOr[js.Function1[/* value */ String, String]] = js.undefined
    
    /**
      * id attribute set for both input and display element
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * class attribute set for input element
      */
    var inputClassName: js.UndefOr[String] = js.undefined
    
    /**
      * name attribute set for input element
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * onBlur is a callback function triggered when the focus is blurred
      * and edit mode is toggled off
      */
    var onBlur: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onChange is called when the input value changes and
      * returns a string which corresponds to the new input value
      */
    var onChange: js.UndefOr[
        js.Function1[
          /* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * onEditMode is a callback function triggered when the display
      * component is clicked and edit mode is toggled on
      */
    var onEditMode: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /**
      * onSave is called when the input blur event is triggered or enter key is pressed
      * returns an object: {name, value, previousValue} which correspond to the input name, value, and previous value before changes were made
      */
    var onSave: js.UndefOr[js.Function1[/* hasNameValuePreviousValue */ onSaveProps, Unit]] = js.undefined
    
    /**
      * placeholder is shown in the display element when value is empty
      */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /**
      * Displays only the view element when set to true,
      * default: false
      */
    var readonly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Sets the css styling for both input and div elements
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * value sets the input value and text of display element
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SharedProps {
    
    inline def apply(): SharedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedProps]
    }
    
    extension [Self <: SharedProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setFormatDisplayText(value: /* value */ String => String): Self = StObject.set(x, "formatDisplayText", js.Any.fromFunction1(value))
      
      inline def setFormatDisplayTextUndefined: Self = StObject.set(x, "formatDisplayText", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
      
      inline def setInputClassNameUndefined: Self = StObject.set(x, "inputClassName", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnBlur(value: Callback): Self = StObject.set(x, "onBlur", value.toJsFn)
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: /* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* event */ ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEditMode(value: Callback): Self = StObject.set(x, "onEditMode", value.toJsFn)
      
      inline def setOnEditModeUndefined: Self = StObject.set(x, "onEditMode", js.undefined)
      
      inline def setOnSave(value: /* hasNameValuePreviousValue */ onSaveProps => Callback): Self = StObject.set(x, "onSave", js.Any.fromFunction1((t0: /* hasNameValuePreviousValue */ onSaveProps) => value(t0).runNow()))
      
      inline def setOnSaveUndefined: Self = StObject.set(x, "onSave", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactEditText.reactEditTextStrings.date
    - typingsJapgolly.reactEditText.reactEditTextStrings.`datetime-local`
    - typingsJapgolly.reactEditText.reactEditTextStrings.email
    - typingsJapgolly.reactEditText.reactEditTextStrings.month
    - typingsJapgolly.reactEditText.reactEditTextStrings.number
    - typingsJapgolly.reactEditText.reactEditTextStrings.password
    - typingsJapgolly.reactEditText.reactEditTextStrings.search
    - typingsJapgolly.reactEditText.reactEditTextStrings.tel
    - typingsJapgolly.reactEditText.reactEditTextStrings.text
    - typingsJapgolly.reactEditText.reactEditTextStrings.url
    - typingsJapgolly.reactEditText.reactEditTextStrings.week
  */
  trait inputTextType extends StObject
  object inputTextType {
    
    inline def date: typingsJapgolly.reactEditText.reactEditTextStrings.date = "date".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.date]
    
    inline def `datetime-local`: typingsJapgolly.reactEditText.reactEditTextStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.`datetime-local`]
    
    inline def email: typingsJapgolly.reactEditText.reactEditTextStrings.email = "email".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.email]
    
    inline def month: typingsJapgolly.reactEditText.reactEditTextStrings.month = "month".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.month]
    
    inline def number: typingsJapgolly.reactEditText.reactEditTextStrings.number = "number".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.number]
    
    inline def password: typingsJapgolly.reactEditText.reactEditTextStrings.password = "password".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.password]
    
    inline def search: typingsJapgolly.reactEditText.reactEditTextStrings.search = "search".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.search]
    
    inline def tel: typingsJapgolly.reactEditText.reactEditTextStrings.tel = "tel".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.tel]
    
    inline def text: typingsJapgolly.reactEditText.reactEditTextStrings.text = "text".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.text]
    
    inline def url: typingsJapgolly.reactEditText.reactEditTextStrings.url = "url".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.url]
    
    inline def week: typingsJapgolly.reactEditText.reactEditTextStrings.week = "week".asInstanceOf[typingsJapgolly.reactEditText.reactEditTextStrings.week]
  }
  
  trait onSaveProps extends StObject {
    
    var name: String
    
    var previousValue: String
    
    var value: String
  }
  object onSaveProps {
    
    inline def apply(name: String, previousValue: String, value: String): onSaveProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[onSaveProps]
    }
    
    extension [Self <: onSaveProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreviousValue(value: String): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
