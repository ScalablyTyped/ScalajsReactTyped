package typingsJapgolly.reduxForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactDragEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.SelectHTMLAttributes
import typingsJapgolly.react.mod.TextareaHTMLAttributes
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.reduxForm.reduxFormStrings.input
import typingsJapgolly.reduxForm.reduxFormStrings.select
import typingsJapgolly.reduxForm.reduxFormStrings.textarea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldMod {
  
  @JSImport("redux-form/lib/Field", JSImport.Default)
  @js.native
  open class default[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected () extends Field[P] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
  }
  
  @JSImport("redux-form/lib/Field", "Field")
  @js.native
  open class Field[P /* <: GenericFieldHTMLAttributes | BaseFieldProps[js.Object] */] protected ()
    extends Component[P, js.Object, Any] {
    def this(props: P) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: P, context: Any) = this()
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): japgolly.scalajs.react.facade.React.Component[WrappedFieldProps & P & js.Object, js.Object] = js.native
    
    var name: String = js.native
    
    var pristine: Boolean = js.native
    
    var value: Any = js.native
  }
  
  /* Inlined parent std.Partial<redux-form.redux-form/lib/Field.CommonFieldProps> */
  trait BaseFieldProps[P] extends StObject {
    
    var component: js.UndefOr[(ComponentType[WrappedFieldProps & P]) | input | select | textarea] = js.undefined
    
    var format: js.UndefOr[Formatter | Null] = js.undefined
    
    var forwardRef: js.UndefOr[Boolean] = js.undefined
    
    var immutableProps: js.UndefOr[js.Array[String]] = js.undefined
    
    var name: String
    
    var normalize: js.UndefOr[Normalizer] = js.undefined
    
    var onBlur: js.UndefOr[EventWithDataHandler[ReactFocusEventFrom[Any & Element]]] = js.undefined
    
    var onChange: js.UndefOr[EventWithDataHandler[ReactEventFrom[Any & Element]]] = js.undefined
    
    var onDragStart: js.UndefOr[EventHandler[ReactDragEventFrom[Any & Element]]] = js.undefined
    
    var onDrop: js.UndefOr[EventHandler[ReactDragEventFrom[Any & Element]]] = js.undefined
    
    var onFocus: js.UndefOr[EventHandler[ReactFocusEventFrom[Any & Element]]] = js.undefined
    
    var parse: js.UndefOr[Parser] = js.undefined
    
    var props: js.UndefOr[P] = js.undefined
    
    var validate: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
    
    var warn: js.UndefOr[Validator | js.Array[Validator]] = js.undefined
  }
  object BaseFieldProps {
    
    inline def apply[P](name: String): BaseFieldProps[P] = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseFieldProps[P]]
    }
    
    extension [Self <: BaseFieldProps[?], P](x: Self & BaseFieldProps[P]) {
      
      inline def setComponent(value: (ComponentType[WrappedFieldProps & P]) | input | select | textarea): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFormat(value: (/* value */ Any, /* name */ String) => Any): Self = StObject.set(x, "format", js.Any.fromFunction2(value))
      
      inline def setFormatNull: Self = StObject.set(x, "format", null)
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setForwardRef(value: Boolean): Self = StObject.set(x, "forwardRef", value.asInstanceOf[js.Any])
      
      inline def setForwardRefUndefined: Self = StObject.set(x, "forwardRef", js.undefined)
      
      inline def setImmutableProps(value: js.Array[String]): Self = StObject.set(x, "immutableProps", value.asInstanceOf[js.Any])
      
      inline def setImmutablePropsUndefined: Self = StObject.set(x, "immutableProps", js.undefined)
      
      inline def setImmutablePropsVarargs(value: String*): Self = StObject.set(x, "immutableProps", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNormalize(
        value: (/* value */ Any, /* previousValue */ js.UndefOr[Any], /* allValues */ js.UndefOr[Any], /* previousAllValues */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "normalize", js.Any.fromFunction4(value))
      
      inline def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
      
      inline def setOnBlur(
        value: (/* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[ReactEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnDragStart(value: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnDrop(value: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      inline def setOnFocus(value: (ReactFocusEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: ReactFocusEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setParse(value: (/* value */ Any, /* name */ String) => Any): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setValidate(value: Validator | js.Array[Validator]): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateFunction4(
        value: (/* value */ Any, /* allValues */ js.UndefOr[Any], /* props */ js.UndefOr[Any], /* name */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "validate", js.Any.fromFunction4(value))
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValidateVarargs(value: Validator*): Self = StObject.set(x, "validate", js.Array(value*))
      
      inline def setWarn(value: Validator | js.Array[Validator]): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
      
      inline def setWarnFunction4(
        value: (/* value */ Any, /* allValues */ js.UndefOr[Any], /* props */ js.UndefOr[Any], /* name */ js.UndefOr[Any]) => Any
      ): Self = StObject.set(x, "warn", js.Any.fromFunction4(value))
      
      inline def setWarnUndefined: Self = StObject.set(x, "warn", js.undefined)
      
      inline def setWarnVarargs(value: Validator*): Self = StObject.set(x, "warn", js.Array(value*))
    }
  }
  
  trait CommonFieldInputProps extends StObject {
    
    var name: String
    
    var onDragStart: EventHandler[ReactDragEventFrom[Any & Element]]
    
    var onDrop: EventHandler[ReactDragEventFrom[Any & Element]]
    
    var onFocus: EventHandler[ReactFocusEventFrom[Any & Element]]
  }
  object CommonFieldInputProps {
    
    inline def apply(
      name: String,
      onDragStart: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onDrop: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onFocus: (ReactFocusEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback
    ): CommonFieldInputProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDragStart(t0, t1)).runNow()), onDrop = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDrop(t0, t1)).runNow()), onFocus = js.Any.fromFunction2((t0: ReactFocusEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onFocus(t0, t1)).runNow()))
      __obj.asInstanceOf[CommonFieldInputProps]
    }
    
    extension [Self <: CommonFieldInputProps](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOnDragStart(value: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onDragStart", js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnDrop(value: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onDrop", js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
      
      inline def setOnFocus(value: (ReactFocusEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction2((t0: ReactFocusEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait CommonFieldProps
    extends StObject
       with CommonFieldInputProps {
    
    var onBlur: EventWithDataHandler[ReactFocusEventFrom[Any & Element]]
    
    var onChange: EventWithDataHandler[ReactEventFrom[Any & Element]]
  }
  object CommonFieldProps {
    
    inline def apply(
      name: String,
      onBlur: (/* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback,
      onChange: (/* event */ js.UndefOr[ReactEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback,
      onDragStart: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onDrop: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onFocus: (ReactFocusEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback
    ): CommonFieldProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (onBlur(t0, t1, t2, t3)).runNow()), onChange = js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (onChange(t0, t1, t2, t3)).runNow()), onDragStart = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDragStart(t0, t1)).runNow()), onDrop = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDrop(t0, t1)).runNow()), onFocus = js.Any.fromFunction2((t0: ReactFocusEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onFocus(t0, t1)).runNow()))
      __obj.asInstanceOf[CommonFieldProps]
    }
    
    extension [Self <: CommonFieldProps](x: Self) {
      
      inline def setOnBlur(
        value: (/* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback
      ): Self = StObject.set(x, "onBlur", js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactFocusEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setOnChange(
        value: (/* event */ js.UndefOr[ReactEventFrom[Any & Element]], /* newValue */ js.UndefOr[Any], /* previousValue */ js.UndefOr[Any], /* name */ js.UndefOr[String]) => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction4((t0: /* event */ js.UndefOr[ReactEventFrom[Any & Element]], t1: /* newValue */ js.UndefOr[Any], t2: /* previousValue */ js.UndefOr[Any], t3: /* name */ js.UndefOr[String]) => (value(t0, t1, t2, t3)).runNow()))
    }
  }
  
  type EventHandler[Event] = js.Function2[/* event */ Event, /* name */ js.UndefOr[String], Unit]
  
  @js.native
  trait EventOrValueHandler[Event] extends EventHandler[Event] {
    
    def apply(value: Any): Unit = js.native
  }
  
  type EventWithDataHandler[Event] = js.Function4[
    /* event */ js.UndefOr[Event], 
    /* newValue */ js.UndefOr[Any], 
    /* previousValue */ js.UndefOr[Any], 
    /* name */ js.UndefOr[String], 
    Unit
  ]
  
  type Formatter = js.Function2[/* value */ Any, /* name */ String, Any]
  
  @js.native
  trait GenericField[P]
    extends Component[BaseFieldProps[P] & P, js.Object, Any] {
    
    var dirty: Boolean = js.native
    
    def getRenderedComponent(): japgolly.scalajs.react.facade.React.Component[WrappedFieldProps & P & js.Object, js.Object] = js.native
    
    var name: String = js.native
    
    var pristine: Boolean = js.native
    
    var value: Any = js.native
  }
  
  type GenericFieldHTMLAttributes = InputHTMLAttributes[HTMLInputElement] | SelectHTMLAttributes[HTMLSelectElement] | TextareaHTMLAttributes[HTMLTextAreaElement]
  
  type Normalizer = js.Function4[
    /* value */ Any, 
    /* previousValue */ js.UndefOr[Any], 
    /* allValues */ js.UndefOr[Any], 
    /* previousAllValues */ js.UndefOr[Any], 
    Any
  ]
  
  type Parser = js.Function2[/* value */ Any, /* name */ String, Any]
  
  type Validator = js.Function4[
    /* value */ Any, 
    /* allValues */ js.UndefOr[Any], 
    /* props */ js.UndefOr[Any], 
    /* name */ js.UndefOr[Any], 
    Any
  ]
  
  trait WrappedFieldInputProps
    extends StObject
       with CommonFieldInputProps {
    
    var checked: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: EventOrValueHandler[ReactFocusEventFrom[Any & Element]]
    
    var onChange: EventOrValueHandler[ReactEventFrom[Any & Element]]
    
    var value: Any
  }
  object WrappedFieldInputProps {
    
    inline def apply(
      name: String,
      onBlur: EventOrValueHandler[ReactFocusEventFrom[Any & Element]],
      onChange: EventOrValueHandler[ReactEventFrom[Any & Element]],
      onDragStart: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onDrop: (ReactDragEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      onFocus: (ReactFocusEventFrom[Any & Element], /* name */ js.UndefOr[String]) => Callback,
      value: Any
    ): WrappedFieldInputProps = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = onBlur.asInstanceOf[js.Any], onChange = onChange.asInstanceOf[js.Any], onDragStart = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDragStart(t0, t1)).runNow()), onDrop = js.Any.fromFunction2((t0: ReactDragEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onDrop(t0, t1)).runNow()), onFocus = js.Any.fromFunction2((t0: ReactFocusEventFrom[Any & Element], t1: /* name */ js.UndefOr[String]) => (onFocus(t0, t1)).runNow()), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldInputProps]
    }
    
    extension [Self <: WrappedFieldInputProps](x: Self) {
      
      inline def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      inline def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      inline def setOnBlur(value: EventOrValueHandler[ReactFocusEventFrom[Any & Element]]): Self = StObject.set(x, "onBlur", value.asInstanceOf[js.Any])
      
      inline def setOnChange(value: EventOrValueHandler[ReactEventFrom[Any & Element]]): Self = StObject.set(x, "onChange", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait WrappedFieldMetaProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var asyncValidating: Boolean
    
    var autofilled: Boolean
    
    var dirty: Boolean
    
    var dispatch: Dispatch[Any]
    
    var error: js.UndefOr[Any] = js.undefined
    
    var form: String
    
    var initial: Any
    
    var invalid: Boolean
    
    var pristine: Boolean
    
    var submitFailed: Boolean
    
    var submitting: Boolean
    
    var touched: Boolean
    
    var valid: Boolean
    
    var visited: Boolean
    
    var warning: js.UndefOr[Any] = js.undefined
  }
  object WrappedFieldMetaProps {
    
    inline def apply(
      asyncValidating: Boolean,
      autofilled: Boolean,
      dirty: Boolean,
      dispatch: Any => Any,
      form: String,
      initial: Any,
      invalid: Boolean,
      pristine: Boolean,
      submitFailed: Boolean,
      submitting: Boolean,
      touched: Boolean,
      valid: Boolean,
      visited: Boolean
    ): WrappedFieldMetaProps = {
      val __obj = js.Dynamic.literal(asyncValidating = asyncValidating.asInstanceOf[js.Any], autofilled = autofilled.asInstanceOf[js.Any], dirty = dirty.asInstanceOf[js.Any], dispatch = js.Any.fromFunction1(dispatch), form = form.asInstanceOf[js.Any], initial = initial.asInstanceOf[js.Any], invalid = invalid.asInstanceOf[js.Any], pristine = pristine.asInstanceOf[js.Any], submitFailed = submitFailed.asInstanceOf[js.Any], submitting = submitting.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], visited = visited.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldMetaProps]
    }
    
    extension [Self <: WrappedFieldMetaProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setAsyncValidating(value: Boolean): Self = StObject.set(x, "asyncValidating", value.asInstanceOf[js.Any])
      
      inline def setAutofilled(value: Boolean): Self = StObject.set(x, "autofilled", value.asInstanceOf[js.Any])
      
      inline def setDirty(value: Boolean): Self = StObject.set(x, "dirty", value.asInstanceOf[js.Any])
      
      inline def setDispatch(value: Any => Any): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setInitial(value: Any): Self = StObject.set(x, "initial", value.asInstanceOf[js.Any])
      
      inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setPristine(value: Boolean): Self = StObject.set(x, "pristine", value.asInstanceOf[js.Any])
      
      inline def setSubmitFailed(value: Boolean): Self = StObject.set(x, "submitFailed", value.asInstanceOf[js.Any])
      
      inline def setSubmitting(value: Boolean): Self = StObject.set(x, "submitting", value.asInstanceOf[js.Any])
      
      inline def setTouched(value: Boolean): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setVisited(value: Boolean): Self = StObject.set(x, "visited", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Any): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  trait WrappedFieldProps extends StObject {
    
    var input: WrappedFieldInputProps
    
    var meta: WrappedFieldMetaProps
  }
  object WrappedFieldProps {
    
    inline def apply(input: WrappedFieldInputProps, meta: WrappedFieldMetaProps): WrappedFieldProps = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrappedFieldProps]
    }
    
    extension [Self <: WrappedFieldProps](x: Self) {
      
      inline def setInput(value: WrappedFieldInputProps): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: WrappedFieldMetaProps): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
}
