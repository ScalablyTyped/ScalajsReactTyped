package typingsJapgolly.reactEditext

import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-editext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: EdiTextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactEditext.reactEditextStrings.after
    - typingsJapgolly.reactEditext.reactEditextStrings.before
  */
  trait ButtonsAlignment extends StObject
  object ButtonsAlignment {
    
    inline def after: typingsJapgolly.reactEditext.reactEditextStrings.after = "after".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.after]
    
    inline def before: typingsJapgolly.reactEditext.reactEditextStrings.before = "before".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.before]
  }
  
  @js.native
  trait EdiTextProps extends StObject {
    
    /**
      * Decides whether buttons will be located _BEFORE_ or _AFTER_
      * the input element.
      * @default "after"
      */
    var buttonsAlign: js.UndefOr[ButtonsAlignment] = js.native
    
    /**
      * control function that will be called when user clicks on the edit button.
      * return false to prevent editing or return true to allow editing.
      */
    var canEdit: js.UndefOr[Boolean | js.Function0[Boolean]] = js.native
    
    /**
      * Custom class name for CANCEL button. */
    var cancelButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for CANCEL button. Any valid element and node are allowed. */
    var cancelButtonContent: js.UndefOr[Any] = js.native
    
    /**
      * Set it to `true` if you want to cancel the form when `Escape`
      * is pressed.
      * @default false
      */
    var cancelOnEscape: js.UndefOr[Boolean] = js.native
    
    /**
      * Set it to `true` if you want to cancel the form when the input
      * is unfocused.
      * @default false
      */
    var cancelOnUnfocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Class name for the root container of the EdiText.
      */
    var className: js.UndefOr[String] = js.native
    
    /**
      * Props to be passed to div element that is container for all elements.
      * You can use this if you want to style or select the whole container.
      */
    var containerProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
    
    /**
      * Custom class name for EDIT button.
      * */
    var editButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for EDIT button. Any valid element and node are allowed. */
    var editButtonContent: js.UndefOr[Any] = js.native
    
    /**
      * Props to be passed to edit button.
      * You can set `styles`, `className or disabled state.
      */
    var editButtonProps: js.UndefOr[DetailedHTMLProps[ButtonHTMLAttributes[HTMLButtonElement], HTMLButtonElement]] = js.native
    
    /**
      * Custom class name for the container in edit mode.
      * Will be set to viewContainerClassName if you set it and omit this.
      */
    var editContainerClassName: js.UndefOr[String] = js.native
    
    /**
      * Set it to `true` if you want clicking on the view to activate the editor.
      * @default false
      */
    var editOnViewClick: js.UndefOr[Boolean] = js.native
    
    /**
      * Set it to `true` if you want the view state to be edit mode
      * @default false
      */
    var editing: js.UndefOr[Boolean] = js.native
    
    /**
      * Set it to `true` if you don't want to see default icons
      * on action buttons.See Examples page for more details.
      * @default "false"
      */
    var hideIcons: js.UndefOr[Boolean] = js.native
    
    /**
      * A simple hint message appears at the bottom of input element.
      * Any valid element is allowed.
      */
    var hint: js.UndefOr[Node] = js.native
    
    /**
      * Props to be passed to input element.
      * Any kind of valid DOM attributes are welcome
      */
    var inputProps: js.UndefOr[InputProps] = js.native
    
    /**
      * Custom class name for the top-level main container.
      * @deprecated please use `containerProps` instead of this
      */
    var mainContainerClassName: js.UndefOr[String] = js.native
    
    /**
      * will be called when user clicked cancel button
      * @param value the current value of input when cancelled.
      * @param inputProps inputProps that passed to the element.
      */
    var onCancel: js.UndefOr[js.Function2[/* value */ Any, /* inputProps */ js.UndefOr[InputProps], Any]] = js.native
    
    /**
      * Will be called when the editing mode is active.
      *
      * @param value the value of the input at the time when editing started.
      * @param inputProps inputProps that passed to the element.
      */
    var onEditingStart: js.UndefOr[js.Function2[/* value */ Any, /* inputProps */ js.UndefOr[InputProps], Any]] = js.native
    
    /**
      * will be called when user clicked save button.
      * @param value the current value of input
      * @param inputProps inputProps that passed to the element.
      */
    def onSave(value: Any): Any = js.native
    def onSave(value: Any, inputProps: InputProps): Any = js.native
    
    /**
      * will be called when validation fails.
      * takes one param <value> which is the current value of input
      */
    var onValidationFail: js.UndefOr[js.Function1[/* repeated */ String, Any]] = js.native
    
    /**
      * Custom render method for the content in the view mode.
      * Use this prop to customize the displayed value in view mode.
      * The return value from this function will be rendered in view mode.
      * You can return string or JSX. Both are allowed.
      */
    var renderValue: js.UndefOr[js.Function1[/* value */ Any, Any]] = js.native
    
    /**
      * Custom class name for SAVE button.
      * */
    var saveButtonClassName: js.UndefOr[String] = js.native
    
    /**
      * Content for SAVE button. Any valid element and node are allowed. */
    var saveButtonContent: js.UndefOr[Any] = js.native
    
    /**
      * Set it to `true` if you want to display action buttons **only**
      * when the text hovered by the user.
      * @default false
      */
    var showButtonsOnHover: js.UndefOr[Boolean] = js.native
    
    /**
      * Activates the edit mode when the `Enter` key is pressed if the view
      * container is focused.
      *
      * NOTE: This requires the element to be in focus.
      */
    var startEditingOnEnter: js.UndefOr[Boolean] = js.native
    
    /**
      * Activates the edit mode when the view container is in focus.
      */
    var startEditingOnFocus: js.UndefOr[Boolean] = js.native
    
    /**
      * Set it to `true` if you want to submit the form when `Enter`
      * is pressed.
      * @default false
      */
    var submitOnEnter: js.UndefOr[Boolean] = js.native
    
    /**
      * Set it to `true` if you want to save the form when the input
      * is unfocused.
      * @default false
      */
    var submitOnUnfocus: js.UndefOr[Boolean] = js.native
    
    /**
      * An helper shortcut in case you want to pass the same tabIndex to both
      * `viewProps` and `inputProps`.
      *
      * NOTE: This will be overriden if you pass the tabIndex in `viewProps`
      * or `inputProps`.
      */
    var tabIndex: js.UndefOr[Double] = js.native
    
    /**
      * Input type. Possible options are:
      * `text`, `number`, `email`, `textarea`, `date`,
      * `datetime-local`, `time`, `month`, `url`, `week`, `tel`
      * @default "text"
      */
    var `type`: js.UndefOr[EdiTextType] = js.native
    
    /** Pass your own validation function.
      * takes one param -> `value`.
      * It must return `true` or `false`
      */
    var validation: js.UndefOr[js.Function1[/* repeated */ String, Boolean | js.Promise[Boolean]]] = js.native
    
    /**
      * If validation fails this message will appear
      */
    var validationMessage: js.UndefOr[Any] = js.native
    
    /**
      * Value of the content [in view mode] and input [in edit mode]
      */
    var value: String = js.native
    
    /**
      * Custom class name for the container in view mode.
      */
    var viewContainerClassName: js.UndefOr[String] = js.native
    
    /**
      * Props to be passed to div element that shows the text.
      * You can specify your own `styles` or `className`
      */
    var viewProps: js.UndefOr[DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]] = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactEditext.reactEditextStrings.text
    - typingsJapgolly.reactEditext.reactEditextStrings.textarea
    - typingsJapgolly.reactEditext.reactEditextStrings.email
    - typingsJapgolly.reactEditext.reactEditextStrings.number
    - typingsJapgolly.reactEditext.reactEditextStrings.date
    - typingsJapgolly.reactEditext.reactEditextStrings.`datetime-local`
    - typingsJapgolly.reactEditext.reactEditextStrings.time
    - typingsJapgolly.reactEditext.reactEditextStrings.month
    - typingsJapgolly.reactEditext.reactEditextStrings.url
    - typingsJapgolly.reactEditext.reactEditextStrings.week
    - typingsJapgolly.reactEditext.reactEditextStrings.tel
  */
  trait EdiTextType extends StObject
  object EdiTextType {
    
    inline def date: typingsJapgolly.reactEditext.reactEditextStrings.date = "date".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.date]
    
    inline def `datetime-local`: typingsJapgolly.reactEditext.reactEditextStrings.`datetime-local` = "datetime-local".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.`datetime-local`]
    
    inline def email: typingsJapgolly.reactEditext.reactEditextStrings.email = "email".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.email]
    
    inline def month: typingsJapgolly.reactEditext.reactEditextStrings.month = "month".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.month]
    
    inline def number: typingsJapgolly.reactEditext.reactEditextStrings.number = "number".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.number]
    
    inline def tel: typingsJapgolly.reactEditext.reactEditextStrings.tel = "tel".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.tel]
    
    inline def text: typingsJapgolly.reactEditext.reactEditextStrings.text = "text".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.text]
    
    inline def textarea: typingsJapgolly.reactEditext.reactEditextStrings.textarea = "textarea".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.textarea]
    
    inline def time: typingsJapgolly.reactEditext.reactEditextStrings.time = "time".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.time]
    
    inline def url: typingsJapgolly.reactEditext.reactEditextStrings.url = "url".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.url]
    
    inline def week: typingsJapgolly.reactEditext.reactEditextStrings.week = "week".asInstanceOf[typingsJapgolly.reactEditext.reactEditextStrings.week]
  }
  
  type InputProps = DetailedHTMLProps[
    InputHTMLAttributes[HTMLInputElement] | TextareaHTMLAttributes[HTMLTextAreaElement], 
    HTMLInputElement | HTMLTextAreaElement
  ]
}
