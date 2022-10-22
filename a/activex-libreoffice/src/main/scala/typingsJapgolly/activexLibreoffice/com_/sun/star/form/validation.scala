package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.XBindableValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validation {
  
  /**
    * specifies a control model which supports both binding to an external value supplier, and to an external validator.
    *
    * There are two methods how the value which is represented by a control model can interact with other components (well, except the trivial ones
    * accessible by using {@link com.sun.star.beans.XPropertySet} ): binding the value to an external component via {@link
    * com.sun.star.form.binding.XBindableValue}validating the current value by an external component, via {@link XValidatable} and {@link XValidator}
    *
    * The {@link ValidatableBindableControlModel} services describes the interaction of these concepts for control models which support both of them.
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyAccess because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyContainer because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyBag because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.container.XChild because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.util.XCloneable because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.io.XPersistObject because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XMultiPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlDialogElement because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait ValidatableBindableControlModel
    extends StObject
       with ValidatableControlModel
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * specifies the model of a form control which supports live validation of its input.
    *
    * Validatable control models support setting a validator with dynamic validity constraints, and broadcasting changes in their value as well as the
    * validity of their value.
    */
  @js.native
  trait ValidatableControlModel
    extends StObject
       with FormControlModel
       with XValidatableFormComponent
       with XValidityConstraintListener {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /** is the listener interface to be notified of changes of a {@link XValidatableFormComponent} */
  trait XFormComponentValidityListener
    extends StObject
       with XEventListener {
    
    /**
      * called when the validity and/or the value of the form component at which the listener is registered changed.
      * @param Source The member {@link com.sun.star.lang.EventObject.Source} represents the {@link XValidatableFormComponent} whose validity, value, or text ch
      */
    def componentValidityChanged(Source: EventObject): Unit
  }
  object XFormComponentValidityListener {
    
    inline def apply(
      acquire: Callback,
      componentValidityChanged: EventObject => Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XFormComponentValidityListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, componentValidityChanged = js.Any.fromFunction1((t0: EventObject) => componentValidityChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XFormComponentValidityListener]
    }
    
    extension [Self <: XFormComponentValidityListener](x: Self) {
      
      inline def setComponentValidityChanged(value: EventObject => Callback): Self = StObject.set(x, "componentValidityChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    }
  }
  
  /**
    * specifies support for validating a component
    * @see XValidator
    */
  trait XValidatable
    extends StObject
       with XInterface {
    
    /** retrieves the external instance which is currently used to validate the component */
    var Validator: XValidator
    
    /** retrieves the external instance which is currently used to validate the component */
    def getValidator(): XValidator
    
    /**
      * sets an external instance which is able to validate the component
      *
      * Any previously active validator will be revoked - there can be only one!
      * @param Validator the new validator which is to be used by the component. May be `NULL` , in this case only the current validator is revoked.
      * @throws com::sun::star::util::VetoException if changing the validator is not allowed in the current component state
      */
    def setValidator(Validator: XValidator): Unit
  }
  object XValidatable {
    
    inline def apply(
      Validator: XValidator,
      acquire: Callback,
      getValidator: CallbackTo[XValidator],
      queryInterface: `type` => Any,
      release: Callback,
      setValidator: XValidator => Callback
    ): XValidatable = {
      val __obj = js.Dynamic.literal(Validator = Validator.asInstanceOf[js.Any], acquire = acquire.toJsFn, getValidator = getValidator.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValidator = js.Any.fromFunction1((t0: XValidator) => setValidator(t0).runNow()))
      __obj.asInstanceOf[XValidatable]
    }
    
    extension [Self <: XValidatable](x: Self) {
      
      inline def setGetValidator(value: CallbackTo[XValidator]): Self = StObject.set(x, "getValidator", value.toJsFn)
      
      inline def setSetValidator(value: XValidator => Callback): Self = StObject.set(x, "setValidator", js.Any.fromFunction1((t0: XValidator) => value(t0).runNow()))
      
      inline def setValidator(value: XValidator): Self = StObject.set(x, "Validator", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is a convenience interface for accessing several aspects of a form component which supports validation.
    *
    * A validatable form component has two aspects which other parties might be interested in: The pure validity flag: Whatever the user enters in the
    * component, this is either valid (relative to the active validator), or invalid.The current value: Even if the validity flag does not change with the
    * user input (e.g. because the user replaces one invalid value with another invalid value), observers might be interested in the current value, for
    * example to include it in a feedback message to the user.
    *
    * An {@link XValidatableFormComponent} allows to easily access both of these aspects.
    *
    * Note that all of the information provided at this interface can also obtained by other means, but much more inconveniently.
    * @see XValidatable
    * @see XValidator
    */
  trait XValidatableFormComponent
    extends StObject
       with XValidatable {
    
    /**
      * retrieves the current value of the component.
      *
      * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
      *
      * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
      * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
      */
    val CurrentValue: Any
    
    /**
      * registers the given listener.
      *
      * XFormComponentValidityListeners are called whenever **any** of the aspects of the validatable form component (the validity flag, or the value)
      * changed.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def addFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit
    
    /**
      * retrieves the current value of the component.
      *
      * The type of the current value, as well as it's semantics, depend on the service implementing this interface.
      *
      * Again, this is a convenience method. For example, for a {@link com.sun.star.form.component.FormattedField} , calling this method is equivalent to
      * retrieving the {@link com.sun.star.awt.UnoControlFormattedFieldModel.EffectiveValue} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), the value returned here is defined by the service implementing this interface.
      */
    def getCurrentValue(): Any
    
    /**
      * determines whether the current value of the component passed the validity test at the validator.
      *
      * Calling this is equal to calling {@link XValidator.isValid()} with the current value (see {@link getCurrentValue()} ) of the component, where the
      * validator is obtained via {@link XValidatable.getValidator()} .
      *
      * If no validator has been set ( {@link XValidatable.setValidator()} ), this method returns true.
      */
    def isValid(): Boolean
    
    /**
      * registers the given listener.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def removeFormComponentValidityListener(Listener: XFormComponentValidityListener): Unit
  }
  object XValidatableFormComponent {
    
    inline def apply(
      CurrentValue: Any,
      Validator: XValidator,
      acquire: Callback,
      addFormComponentValidityListener: XFormComponentValidityListener => Callback,
      getCurrentValue: CallbackTo[Any],
      getValidator: CallbackTo[XValidator],
      isValid: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      removeFormComponentValidityListener: XFormComponentValidityListener => Callback,
      setValidator: XValidator => Callback
    ): XValidatableFormComponent = {
      val __obj = js.Dynamic.literal(CurrentValue = CurrentValue.asInstanceOf[js.Any], Validator = Validator.asInstanceOf[js.Any], acquire = acquire.toJsFn, addFormComponentValidityListener = js.Any.fromFunction1((t0: XFormComponentValidityListener) => addFormComponentValidityListener(t0).runNow()), getCurrentValue = getCurrentValue.toJsFn, getValidator = getValidator.toJsFn, isValid = isValid.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeFormComponentValidityListener = js.Any.fromFunction1((t0: XFormComponentValidityListener) => removeFormComponentValidityListener(t0).runNow()), setValidator = js.Any.fromFunction1((t0: XValidator) => setValidator(t0).runNow()))
      __obj.asInstanceOf[XValidatableFormComponent]
    }
    
    extension [Self <: XValidatableFormComponent](x: Self) {
      
      inline def setAddFormComponentValidityListener(value: XFormComponentValidityListener => Callback): Self = StObject.set(x, "addFormComponentValidityListener", js.Any.fromFunction1((t0: XFormComponentValidityListener) => value(t0).runNow()))
      
      inline def setCurrentValue(value: Any): Self = StObject.set(x, "CurrentValue", value.asInstanceOf[js.Any])
      
      inline def setGetCurrentValue(value: CallbackTo[Any]): Self = StObject.set(x, "getCurrentValue", value.toJsFn)
      
      inline def setIsValid(value: CallbackTo[Boolean]): Self = StObject.set(x, "isValid", value.toJsFn)
      
      inline def setRemoveFormComponentValidityListener(value: XFormComponentValidityListener => Callback): Self = StObject.set(x, "removeFormComponentValidityListener", js.Any.fromFunction1((t0: XFormComponentValidityListener) => value(t0).runNow()))
    }
  }
  
  /**
    * specifies a component able to validate (the content of) other components
    *
    * Validators support simple validity checks and retrieving justifications for invalidity.
    *
    * Validators may additionally support dynamic validity constraints. In such a case, the validity of a given value may change, without the value changing
    * itself. ;  To be notified about this, interested components should register as {@link XValidityConstraintListener} .
    * @see XValidatable
    */
  trait XValidator
    extends StObject
       with XInterface {
    
    /**
      * registers the given validity listener.
      *
      * Usually, an {@link XValidatable} instance will also add itself as validity listener, as soon as the validator is introduced to it.
      *
      * Implementations which do not support dynamic validity constraints should simply ignore this call.
      * @see XValidityConstraintListener
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def addValidityConstraintListener(Listener: XValidityConstraintListener): Unit
    
    /**
      * retrieves a justification for the invalidity of the given value
      * @param Value the value which has been recognized as being invalid
      * @returns a human-readable string, which explains why the given value is considered invalid.
      */
    def explainInvalid(Value: Any): String
    
    /**
      * determines whether the given value is valid
      * @param Value the value to check for validity
      * @returns `TRUE` if and only if the value is considered valid.
      */
    def isValid(Value: Any): Boolean
    
    /**
      * revokes the given validity listener
      * @see XValidityConstraintListener
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def removeValidityConstraintListener(Listener: XValidityConstraintListener): Unit
  }
  object XValidator {
    
    inline def apply(
      acquire: Callback,
      addValidityConstraintListener: XValidityConstraintListener => Callback,
      explainInvalid: Any => String,
      isValid: Any => Boolean,
      queryInterface: `type` => Any,
      release: Callback,
      removeValidityConstraintListener: XValidityConstraintListener => Callback
    ): XValidator = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, addValidityConstraintListener = js.Any.fromFunction1((t0: XValidityConstraintListener) => addValidityConstraintListener(t0).runNow()), explainInvalid = js.Any.fromFunction1(explainInvalid), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeValidityConstraintListener = js.Any.fromFunction1((t0: XValidityConstraintListener) => removeValidityConstraintListener(t0).runNow()))
      __obj.asInstanceOf[XValidator]
    }
    
    extension [Self <: XValidator](x: Self) {
      
      inline def setAddValidityConstraintListener(value: XValidityConstraintListener => Callback): Self = StObject.set(x, "addValidityConstraintListener", js.Any.fromFunction1((t0: XValidityConstraintListener) => value(t0).runNow()))
      
      inline def setExplainInvalid(value: Any => String): Self = StObject.set(x, "explainInvalid", js.Any.fromFunction1(value))
      
      inline def setIsValid(value: Any => Boolean): Self = StObject.set(x, "isValid", js.Any.fromFunction1(value))
      
      inline def setRemoveValidityConstraintListener(value: XValidityConstraintListener => Callback): Self = StObject.set(x, "removeValidityConstraintListener", js.Any.fromFunction1((t0: XValidityConstraintListener) => value(t0).runNow()))
    }
  }
  
  /** specifies an interface for listening for changes in the validity constraints represented by an {@link XValidator} . */
  trait XValidityConstraintListener
    extends StObject
       with XEventListener {
    
    /**
      * called when the validity constraint represented by an {@link XValidator} , at which the listener is registered, changed.
      * @param Source The event source. The member {@link com.sun.star.lang.EventObject.Source} represents the validator component whose validity constraint changed.
      */
    def validityConstraintChanged(Source: EventObject): Unit
  }
  object XValidityConstraintListener {
    
    inline def apply(
      acquire: Callback,
      disposing: EventObject => Callback,
      queryInterface: `type` => Any,
      release: Callback,
      validityConstraintChanged: EventObject => Callback
    ): XValidityConstraintListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, validityConstraintChanged = js.Any.fromFunction1((t0: EventObject) => validityConstraintChanged(t0).runNow()))
      __obj.asInstanceOf[XValidityConstraintListener]
    }
    
    extension [Self <: XValidityConstraintListener](x: Self) {
      
      inline def setValidityConstraintChanged(value: EventObject => Callback): Self = StObject.set(x, "validityConstraintChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
    }
  }
}
