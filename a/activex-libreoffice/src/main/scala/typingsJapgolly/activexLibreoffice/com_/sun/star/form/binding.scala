package typingsJapgolly.activexLibreoffice.com_.sun.star.form

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseCheckBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseComboBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseDateField
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseFormattedField
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseListBox
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseNumericField
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseRadioButton
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseTextField
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.component.DatabaseTimeField
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.EventObject
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.Exception
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object binding {
  
  /** specifies the model of a form control which supports binding to an external value supplier. */
  @js.native
  trait BindableControlModel
    extends StObject
       with FormControlModel
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * is a specialization of the {@link com.sun.star.form.DataAwareControlModel} which additionally supports binding to external value suppliers.
    *
    * Control models usually have some kind of value property, which reflects the very current content of the controls associated with this model. For
    * instance, for an {@link com.sun.star.form.component.TextField} , this would be the {@link com.sun.star.awt.UnoControlEditModel.Text} property of the
    * base service. Similarly, a {@link com.sun.star.form.component.CheckBox} has a property {@link com.sun.star.awt.UnoControlCheckBoxModel.State} , which
    * reflects the current check state.
    *
    * Usual com::sun::star::form::DataAwareControlModels can be bound to a column of a {@link com.sun.star.form.component.DataForm} , and exchange their
    * content with such a column. ;  In particular, when the {@link com.sun.star.form.component.DataForm} is moved to a different record, then the bound
    * control model is updated with the value of it's column in this particular row. ;  On the other hand, when any change in the control model (e.g.
    * resulting from a user entering data in a control associated with the control model) is committed ( {@link com.sun.star.form.XBoundComponent.commit()}
    * ), then the actual data of the control model is written into the associated {@link com.sun.star.form.component.DataForm} column.
    *
    * {@link BindableDataAwareControlModel} 's additionally support an alternative value binding, which forces them to exchange their value with another
    * foreign instance. In some sense, they are an abstraction of the data aware control models, which only support a specialized, hard-coded value binding
    * (namely the binding to a {@link com.sun.star.form.component.DataForm} column).
    *
    * For this, they provide the {@link XBindableValue} interface which allows to set an external component to exchange the value with.
    *
    * The following rules apply when a data aware control model is bound to an external value binding: **Priority**;  External value bindings overrule any
    * active SQL-column binding. If an external component is bound to a control model which currently has an active SQL binding, this SQL binding is
    * suspended, until the external binding is revoked.**Activation**;  An external value binding becomes effective as soon as it is set. This is a
    * difference to SQL bindings, which only are effective when the parent form of the control model is loaded ( {@link com.sun.star.form.XLoadable}
    * ).**Immediacy**;  When a {@link BindableDataAwareControlModel} is bound to an external value, then every change in the control model's value is
    * **immediately** reflected in the external binding. This is a difference to SQL bindings of most {@link com.sun.star.form.DataAwareControlModel} 's,
    * where changes in the control model's value are only propagated to the bound column upon explicit request via {@link
    * com.sun.star.form.XBoundComponent.commit()} . ;  Note that this restriction is inherited from the {@link BindableControlModel} .**Cloning**;
    * com::sun::star::form::FormControlModels support cloning themselves via the {@link com.sun.star.util.XCloneable} interface which they inherit from the
    * {@link com.sun.star.awt.UnoControlModel} service. ;  When a {@link BindableDataAwareControlModel} is cloned while it has an active external value
    * binding, then the clone is also bound to the same binding instance. ;  Note that this restriction is inherited from the {@link BindableControlModel} .
    *
    * When a {@link BindableDataAwareControlModel} is being bound to an external value, using {@link XBindableValue.setValueBinding()} , then the control
    * model (its value property, respectively) and the external value are initially synchronized by setting the external value ( {@link
    * XValueBinding.getValue()} ) at the control model.
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
  trait BindableDataAwareControlModel
    extends StObject
       with DataAwareControlModel
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a check box which is data-aware and thus can be bound to a database field, and additionally supports binding to arbitrary
    * external values.
    *
    * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseCheckBox} must support exchanging
    * boolean values. The following mapping between external values and control states apply: `TRUE` will be mapped to the box being checked, and vice
    * versa`FALSE` will be mapped to it being unchecked, and vice versa`NULL` will be mapped to it being in undetermined state, if the box currently
    * supports this, or being unchecked else. The undetermined of the check box will always be mapped to `NULL` when writing the external value.
    *
    * If the value binding associated with a {@link BindableDatabaseCheckBox} supports exchanging string values, **and** the {@link
    * com.sun.star.form.component.CheckBox.RefValue} is **not** empty, then the radio button will exchange its value as string: A string equal to the
    * reference value will be mapped to the button being checked, and vice versaA string not equal to the reference value will be mapped to the button being
    * unchecked, and vice versa`NULL` will be mapped to it being in undetermined state
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlCheckBoxModel.State
    * @see com.sun.star.awt.UnoControlCheckBoxModel.TriState
    * @see com.sun.star.form.component.CheckBox.RefValue
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseCheckBox
    extends StObject
       with DatabaseCheckBox
       with XBindableValue {
    
    /**
      * specifies a value which is to be associated with the control when it's **not** checked.
      *
      * {@link com.sun.star.form.component.CheckBox.RefValue} is transferred to possible external value bindings as soon as the check box is checked. With the
      * member {@link SecondaryRefValue} , clients of the check box can also associate a value with the **not checked** state of the control.
      */
    var SecondaryRefValue: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a model of a combo box (a list box combined with a text input field) which is data-aware and thus can be bound to a database
    * field, and additionally supports binding to arbitrary external values.
    *
    * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's text with the binding as **string** , thus
    * only bindings supporting string exchange will be accepted in com::sun::star::form::binding::XValueBinding::setValueBinding().
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlComboBoxModel.Text
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseComboBox
    extends StObject
       with DatabaseComboBox
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a date input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
    * arbitrary external values.
    *
    * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's content with the binding as {@link
    * com.sun.star.util.Date} .
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlDateFieldModel.Date
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseDateField
    extends StObject
       with DatabaseDateField
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a formatted input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
    * arbitrary external values.
    *
    * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseFormattedField} must support
    * exchanging values of type **double** .
    * @see com.sun.star.form.binding.XValueBinding.supportsType
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseFormattedField
    extends StObject
       with DatabaseFormattedField
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a list box model which is data-aware and thus can be bound to a database field, and additionally supports binding to arbitrary
    * external values.
    *
    * There are six possible ways that a {@link BindableDatabaseListBox} exchanges values with an external binding. If a new binding is set at a {@link
    * BindableDatabaseListBox} , the types from the following list are tried in descending order: The first type supported by the binding is used for data
    * exchange.  1. **sequences of anys** : The elements in the sequence will represent the values the selected entries of the list box (taken from
    * ValueList or read from BoundColumn). In other words, the SelectedValues property. 2. **any value** : The value will represent the value of the
    * selected entry (taken from ValueList or read from BoundColumn). If more than one entry is selected, `NULL` will be transferred. In other words, the
    * SelectedValue property. 3. **sequences of long integers** : When used, the integers in the sequence will represent the indexes of the selected entries
    * of the list box. 4. **long integer value** : When used, the value will represent the index of the selected entry. If no entry is selected, -1 will be
    * transferred. If more than one entry is selected, `NULL` will be transferred. 5. **sequences of strings** : When used, the strings in the sequence
    * present the texts of the selected entries of the list box. 6. **string values** : When used. the value will represent the text of the selected entry.
    * If no entry is selected, an empty string will be transferred. If more than one entry is selected, `NULL` will be transferred.
    * @see com.sun.star.form.binding.XValueBinding.supportsType
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseListBox
    extends StObject
       with DatabaseListBox
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a numeric input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
    * arbitrary external values.
    *
    * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseNumericField} must support
    * exchanging values of type **double** .
    * @see com.sun.star.form.binding.XValueBinding.supportsType
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseNumericField
    extends StObject
       with DatabaseNumericField
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a radio button which is data-aware and thus can be bound to a database field, and additionally supports binding to arbitrary
    * external values.
    *
    * The {@link com.sun.star.form.binding.XValueBinding} instance which can be associated with a {@link BindableDatabaseRadioButton} must support
    * exchanging boolean values. The following mapping between external values and control states apply: `TRUE` will be mapped to the button being checked,
    * and vice versa`FALSE` will be mapped to it being unchecked, and vice versa`NULL` will be mapped to it being in undetermined state
    *
    * If the value binding associated with a {@link BindableDatabaseRadioButton} supports exchanging string values, **and** the {@link
    * com.sun.star.form.component.RadioButton.RefValue} is **not** empty, then the radio button will exchange its value as string: A string equal to the
    * reference value will be mapped to the button being checked, and vice versaA string not equal to the reference value will be mapped to the button being
    * unchecked, and vice versa`NULL` will be mapped to it being in undetermined state
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlRadioButtonModel.State
    * @see com.sun.star.form.component.RadioButton.RefValue
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseRadioButton
    extends StObject
       with DatabaseRadioButton
       with XBindableValue {
    
    /**
      * specifies a value which is to be associated with the control when it's **not** selected.
      *
      * {@link com.sun.star.form.component.RadioButton.RefValue} is transferred to possible external value bindings as soon as the radio button is selected.
      * With the member {@link SecondaryRefValue} , clients of the radio button can also associate a value with the **not selected** state of the control.
      */
    var SecondaryRefValue: String = js.native
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a text input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
    * arbitrary external values.
    *
    * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's text with the binding as **string** , thus
    * only bindings supporting string exchange will be accepted in com::sun::star::form::binding::XValueBinding::setValueBinding().
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlEditModel.Text
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseTextField
    extends StObject
       with DatabaseTextField
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * This service specifies a date input field which is data-aware and thus can be bound to a database field, and additionally supports binding to
    * arbitrary external values.
    *
    * If an {@link com.sun.star.form.binding.ValueBinding} instance is set at the field, it will exchange it's content with the binding as {@link
    * com.sun.star.util.Time} .
    * @see com.sun.star.form.binding.XValueBinding.supportsType
    * @see com.sun.star.awt.UnoControlTimeFieldModel.Time
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
  - typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XUpdateBroadcaster because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyState because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XFastPropertySet because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.awt.UnoControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XReset because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XLoadListener because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.XBoundComponent because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.FormControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableControlModel because var conflicts: ClassId, DefaultControl, Height, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined 
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.DataAwareControlModel because Already inherited
  - typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.BindableDataAwareControlModel because var conflicts: BoundField, ClassId, DataField, DefaultControl, Height, InputRequired, LabelControl, Name, Parent, PositionX, PositionY, PropertyValues, Step, TabIndex, Tag, Width. Inlined  */ @js.native
  trait BindableDatabaseTimeField
    extends StObject
       with DatabaseTimeField
       with XBindableValue {
    
    /**
      * @returns the {@link XPropertySetInfo} interface, which describes all properties of the object which supplies this interface.
      * @returns NULL if the implementation cannot or will not provide information about the properties; otherwise the interface {@link XPropertySetInfo} is returned.
      */
    /* InferMemberOverrides */
    override def getPropertySetInfo(): XPropertySetInfo = js.native
  }
  
  /**
    * this service specifies a {@link BindableControlModel} which reflects an integer value, out of a range of permitted integer values.
    *
    * BindableIntegerValueRanges have a value property, a minimum, and a maximum, all of type integer.
    */
  type BindableIntegerValueRange = BindableControlModel
  
  /** thrown to indicate that the types of an {@link XValueBinding} and an {@link XBindableValue} are incompatible */
  type IncompatibleTypesException = Exception
  
  /** thrown when an {@link XValueBinding} cannot perform a requested operation due to an invalid state. */
  type InvalidBindingStateException = Exception
  
  /**
    * specifies the event which is notified when a change in a string entry list occurred
    * @see XListEntrySource
    * @see XListEntryListener
    */
  trait ListEntryEvent
    extends StObject
       with EventObject {
    
    /** denotes the number of changed entries, in case a change of an entry **range** is being notified. */
    var Count: Double
    
    /**
      * denotes the changed entries
      *
      * The concrete semantics of the value depends on the concrete event being notified.
      */
    var Entries: SafeArray[String]
    
    /**
      * denotes the position where a change occurred.
      *
      * The concrete semantics of the value depends on the concrete event being notified.
      */
    var Position: Double
  }
  object ListEntryEvent {
    
    inline def apply(Count: Double, Entries: SafeArray[String], Position: Double, Source: XInterface): ListEntryEvent = {
      val __obj = js.Dynamic.literal(Count = Count.asInstanceOf[js.Any], Entries = Entries.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListEntryEvent]
    }
    
    extension [Self <: ListEntryEvent](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
      
      inline def setEntries(value: SafeArray[String]): Self = StObject.set(x, "Entries", value.asInstanceOf[js.Any])
      
      inline def setPosition(value: Double): Self = StObject.set(x, "Position", value.asInstanceOf[js.Any])
    }
  }
  
  /** defines a component which provides a list of string entries */
  trait ListEntrySource
    extends StObject
       with XListEntrySource
       with XComponent
  object ListEntrySource {
    
    inline def apply(
      AllListEntries: SafeArray[String],
      ListEntryCount: Double,
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addListEntryListener: XListEntryListener => Callback,
      dispose: Callback,
      getAllListEntries: CallbackTo[SafeArray[String]],
      getListEntry: Double => String,
      getListEntryCount: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeListEntryListener: XListEntryListener => Callback
    ): ListEntrySource = {
      val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => addListEntryListener(t0).runNow()), dispose = dispose.toJsFn, getAllListEntries = getAllListEntries.toJsFn, getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = getListEntryCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => removeListEntryListener(t0).runNow()))
      __obj.asInstanceOf[ListEntrySource]
    }
  }
  
  /**
    * defines a component which allows access to a single value
    *
    * Read/Write access to the value represented by this component is supported, as well as (optionally) active broadcasting of value changes
    */
  trait ValueBinding
    extends StObject
       with XPropertySet
       with XValueBinding
       with XModifyBroadcaster
       with XComponent {
    
    /**
      * determines whether the value is currently readonly
      *
      * For instance, you could imagine a {@link ValueBinding} which represents a cell in a spreadsheet document, and whose value is readonly as long as the
      * spreadsheet is locked.
      *
      * As long as this property is `TRUE` , the value binding should throw a {@link InvalidBindingStateException} when its {@link XValueBinding.setValue()}
      * method is invoked.
      */
    var ReadOnly: Boolean
    
    /**
      * determines the relevance of the value represented by the binding
      *
      * In a more complex scenario, where different form controls are bound to different values, which all are part of a larger data structure, some of the
      * items in this data structure may not be relevant currently. This is indicated by the {@link Relevant} property being `FALSE` .
      *
      * XBindableValues which are bound to this binding may or may not react in certain ways on the (ir)relevance of their bound value.
      *
      * One possible reaction could be that user interface elements which are associated with the {@link XBindableValue} are disabled as long as {@link
      * Relevant} is `FALSE` .
      */
    var Relevant: Boolean
  }
  object ValueBinding {
    
    inline def apply(
      PropertySetInfo: XPropertySetInfo,
      ReadOnly: Boolean,
      Relevant: Boolean,
      SupportedValueTypes: SafeArray[`type`],
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addModifyListener: XModifyListener => Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      dispose: Callback,
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      getSupportedValueTypes: CallbackTo[SafeArray[`type`]],
      getValue: `type` => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeModifyListener: XModifyListener => Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback,
      setValue: Any => Callback,
      supportsType: `type` => Boolean
    ): ValueBinding = {
      val __obj = js.Dynamic.literal(PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Relevant = Relevant.asInstanceOf[js.Any], SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = getSupportedValueTypes.toJsFn, getValue = js.Any.fromFunction1(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()), supportsType = js.Any.fromFunction1(supportsType))
      __obj.asInstanceOf[ValueBinding]
    }
    
    extension [Self <: ValueBinding](x: Self) {
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "ReadOnly", value.asInstanceOf[js.Any])
      
      inline def setRelevant(value: Boolean): Self = StObject.set(x, "Relevant", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * specifies support for being bound to an external value
    * @see XValueBinding
    */
  trait XBindableValue
    extends StObject
       with XInterface {
    
    /** retrieves the external instance which currently controls the value of the component */
    var ValueBinding: XValueBinding
    
    /** retrieves the external instance which currently controls the value of the component */
    def getValueBinding(): XValueBinding
    
    /**
      * sets an external instance which controls the value of the component
      *
      * Any previously active binding will be revoked. There can be only one!
      * @param aBinding the new binding which is to be used by the component. May be `NULL` , in this case only the current binding is revoked.
      * @throws IncompatibleTypesException if the new binding (provided it's not `NULL` ) supports only types which are incompatible with the types of the bindab
      */
    def setValueBinding(aBinding: XValueBinding): Unit
  }
  object XBindableValue {
    
    inline def apply(
      ValueBinding: XValueBinding,
      acquire: Callback,
      getValueBinding: CallbackTo[XValueBinding],
      queryInterface: `type` => Any,
      release: Callback,
      setValueBinding: XValueBinding => Callback
    ): XBindableValue = {
      val __obj = js.Dynamic.literal(ValueBinding = ValueBinding.asInstanceOf[js.Any], acquire = acquire.toJsFn, getValueBinding = getValueBinding.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValueBinding = js.Any.fromFunction1((t0: XValueBinding) => setValueBinding(t0).runNow()))
      __obj.asInstanceOf[XBindableValue]
    }
    
    extension [Self <: XBindableValue](x: Self) {
      
      inline def setGetValueBinding(value: CallbackTo[XValueBinding]): Self = StObject.set(x, "getValueBinding", value.toJsFn)
      
      inline def setSetValueBinding(value: XValueBinding => Callback): Self = StObject.set(x, "setValueBinding", js.Any.fromFunction1((t0: XValueBinding) => value(t0).runNow()))
      
      inline def setValueBinding(value: XValueBinding): Self = StObject.set(x, "ValueBinding", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies a listener for changes in a string entry list */
  trait XListEntryListener
    extends StObject
       with XEventListener {
    
    /**
      * notifies the listener that all entries of the list have changed.
      *
      * The listener should retrieve the complete new list by calling the {@link XListEntrySource.getAllListEntries()} method of the event source (which is
      * denoted by {@link com.sun.star.lang.EventObject.Source} ).
      */
    def allEntriesChanged(Source: EventObject): Unit
    
    /**
      * notifies the listener that a single entry in the list has change
      * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the changed entry, the first (and o
      */
    def entryChanged(Source: ListEntryEvent): Unit
    
    /**
      * notifies the listener that a range of entries has been inserted into the list
      * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first inserted entry, the {@lin
      */
    def entryRangeInserted(Source: ListEntryEvent): Unit
    
    /**
      * notifies the listener that a range of entries has been removed from the list
      * @param Source is the event describing the change. The {@link ListEntryEvent.Position} member denotes the position of the first removed entry, the {@link
      */
    def entryRangeRemoved(Source: ListEntryEvent): Unit
  }
  object XListEntryListener {
    
    inline def apply(
      acquire: Callback,
      allEntriesChanged: EventObject => Callback,
      disposing: EventObject => Callback,
      entryChanged: ListEntryEvent => Callback,
      entryRangeInserted: ListEntryEvent => Callback,
      entryRangeRemoved: ListEntryEvent => Callback,
      queryInterface: `type` => Any,
      release: Callback
    ): XListEntryListener = {
      val __obj = js.Dynamic.literal(acquire = acquire.toJsFn, allEntriesChanged = js.Any.fromFunction1((t0: EventObject) => allEntriesChanged(t0).runNow()), disposing = js.Any.fromFunction1((t0: EventObject) => disposing(t0).runNow()), entryChanged = js.Any.fromFunction1((t0: ListEntryEvent) => entryChanged(t0).runNow()), entryRangeInserted = js.Any.fromFunction1((t0: ListEntryEvent) => entryRangeInserted(t0).runNow()), entryRangeRemoved = js.Any.fromFunction1((t0: ListEntryEvent) => entryRangeRemoved(t0).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XListEntryListener]
    }
    
    extension [Self <: XListEntryListener](x: Self) {
      
      inline def setAllEntriesChanged(value: EventObject => Callback): Self = StObject.set(x, "allEntriesChanged", js.Any.fromFunction1((t0: EventObject) => value(t0).runNow()))
      
      inline def setEntryChanged(value: ListEntryEvent => Callback): Self = StObject.set(x, "entryChanged", js.Any.fromFunction1((t0: ListEntryEvent) => value(t0).runNow()))
      
      inline def setEntryRangeInserted(value: ListEntryEvent => Callback): Self = StObject.set(x, "entryRangeInserted", js.Any.fromFunction1((t0: ListEntryEvent) => value(t0).runNow()))
      
      inline def setEntryRangeRemoved(value: ListEntryEvent => Callback): Self = StObject.set(x, "entryRangeRemoved", js.Any.fromFunction1((t0: ListEntryEvent) => value(t0).runNow()))
    }
  }
  
  /** specifies support for indirect manipulation of a string list */
  trait XListEntrySink
    extends StObject
       with XInterface {
    
    /** retrieves the current source for the list entries of the component. */
    var ListEntrySource: XListEntrySource
    
    /** retrieves the current source for the list entries of the component. */
    def getListEntrySource(): XListEntrySource
    
    /**
      * sets the new source for the list entries of the component
      *
      * The list represented by this component will be cleared, and initially filled with the entries from the new list source.
      * @param Source the new source for the list entries. May be `NULL` , in this case, the current source is revoked.
      */
    def setListEntrySource(Source: XListEntrySource): Unit
  }
  object XListEntrySink {
    
    inline def apply(
      ListEntrySource: XListEntrySource,
      acquire: Callback,
      getListEntrySource: CallbackTo[XListEntrySource],
      queryInterface: `type` => Any,
      release: Callback,
      setListEntrySource: XListEntrySource => Callback
    ): XListEntrySink = {
      val __obj = js.Dynamic.literal(ListEntrySource = ListEntrySource.asInstanceOf[js.Any], acquire = acquire.toJsFn, getListEntrySource = getListEntrySource.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setListEntrySource = js.Any.fromFunction1((t0: XListEntrySource) => setListEntrySource(t0).runNow()))
      __obj.asInstanceOf[XListEntrySink]
    }
    
    extension [Self <: XListEntrySink](x: Self) {
      
      inline def setGetListEntrySource(value: CallbackTo[XListEntrySource]): Self = StObject.set(x, "getListEntrySource", value.toJsFn)
      
      inline def setListEntrySource(value: XListEntrySource): Self = StObject.set(x, "ListEntrySource", value.asInstanceOf[js.Any])
      
      inline def setSetListEntrySource(value: XListEntrySource => Callback): Self = StObject.set(x, "setListEntrySource", js.Any.fromFunction1((t0: XListEntrySource) => value(t0).runNow()))
    }
  }
  
  /**
    * specifies a source of string list entries
    *
    * The interface supports foreign components which actively retrieve list entries, as well as components which want to passively being notified of
    * changes in the list.
    * @see XListEntrySink
    */
  trait XListEntrySource
    extends StObject
       with XInterface {
    
    /** provides access to the entirety of all list entries */
    val AllListEntries: SafeArray[String]
    
    /** retrieves the number of entries in the list */
    val ListEntryCount: Double
    
    /**
      * adds a listener which will be notified about changes in the list reflected by the component.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def addListEntryListener(Listener: XListEntryListener): Unit
    
    /** provides access to the entirety of all list entries */
    def getAllListEntries(): SafeArray[String]
    
    /**
      * provides access to a single list entry
      * @see getListEntryCount
      * @throws com::sun::star::lang::IndexOutOfBoundsException if the given position does not denote a valid index in the list
      */
    def getListEntry(Position: Double): String
    
    /** retrieves the number of entries in the list */
    def getListEntryCount(): Double
    
    /**
      * revokes the given listener from the list of components which will be notified about changes in the entry list.
      * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
      */
    def removeListEntryListener(Listener: XListEntryListener): Unit
  }
  object XListEntrySource {
    
    inline def apply(
      AllListEntries: SafeArray[String],
      ListEntryCount: Double,
      acquire: Callback,
      addListEntryListener: XListEntryListener => Callback,
      getAllListEntries: CallbackTo[SafeArray[String]],
      getListEntry: Double => String,
      getListEntryCount: CallbackTo[Double],
      queryInterface: `type` => Any,
      release: Callback,
      removeListEntryListener: XListEntryListener => Callback
    ): XListEntrySource = {
      val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], acquire = acquire.toJsFn, addListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => addListEntryListener(t0).runNow()), getAllListEntries = getAllListEntries.toJsFn, getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = getListEntryCount.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => removeListEntryListener(t0).runNow()))
      __obj.asInstanceOf[XListEntrySource]
    }
    
    extension [Self <: XListEntrySource](x: Self) {
      
      inline def setAddListEntryListener(value: XListEntryListener => Callback): Self = StObject.set(x, "addListEntryListener", js.Any.fromFunction1((t0: XListEntryListener) => value(t0).runNow()))
      
      inline def setAllListEntries(value: SafeArray[String]): Self = StObject.set(x, "AllListEntries", value.asInstanceOf[js.Any])
      
      inline def setGetAllListEntries(value: CallbackTo[SafeArray[String]]): Self = StObject.set(x, "getAllListEntries", value.toJsFn)
      
      inline def setGetListEntry(value: Double => String): Self = StObject.set(x, "getListEntry", js.Any.fromFunction1(value))
      
      inline def setGetListEntryCount(value: CallbackTo[Double]): Self = StObject.set(x, "getListEntryCount", value.toJsFn)
      
      inline def setListEntryCount(value: Double): Self = StObject.set(x, "ListEntryCount", value.asInstanceOf[js.Any])
      
      inline def setRemoveListEntryListener(value: XListEntryListener => Callback): Self = StObject.set(x, "removeListEntryListener", js.Any.fromFunction1((t0: XListEntryListener) => value(t0).runNow()))
    }
  }
  
  /** specifies a binding to a value which can be read and written. */
  trait XValueBinding
    extends StObject
       with XInterface {
    
    /**
      * determines the types which are supported by this binding for value exchange
      * @see supportsType
      */
    val SupportedValueTypes: SafeArray[`type`]
    
    /**
      * determines the types which are supported by this binding for value exchange
      * @see supportsType
      */
    def getSupportedValueTypes(): SafeArray[`type`]
    
    /**
      * retrieves the current value
      * @see getSupportedValueTypes
      * @see supportsType
      * @throws IncompatibleTypesException if the requested value type is not supported by the binding
      */
    def getValue(aType: `type`): Any
    
    /**
      * sets the current value
      * @see getSupportedValueTypes
      * @see supportsType
      * @see ValueBinding
      * @throws IncompatibleTypesException if the given value type is not supported by the binding
      * @throws InvalidBindingStateException if the value currently cannot be changed, since the binding is not fully operational. Possible reasons for this incl
      * @throws com::sun::star::lang::NoSupportException if the binding in general does not support write access to its binding
      */
    def setValue(aValue: Any): Unit
    
    /**
      * determines whether a given type is supported by this binding for value exchange
      *
      * Calling this method is equal to calling {@link getSupportedValueTypes()} , and looking up the given type in the resulting type sequence.
      * @see getSupportedValueTypes
      */
    def supportsType(aType: `type`): Boolean
  }
  object XValueBinding {
    
    inline def apply(
      SupportedValueTypes: SafeArray[`type`],
      acquire: Callback,
      getSupportedValueTypes: CallbackTo[SafeArray[`type`]],
      getValue: `type` => Any,
      queryInterface: `type` => Any,
      release: Callback,
      setValue: Any => Callback,
      supportsType: `type` => Boolean
    ): XValueBinding = {
      val __obj = js.Dynamic.literal(SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, getSupportedValueTypes = getSupportedValueTypes.toJsFn, getValue = js.Any.fromFunction1(getValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()), supportsType = js.Any.fromFunction1(supportsType))
      __obj.asInstanceOf[XValueBinding]
    }
    
    extension [Self <: XValueBinding](x: Self) {
      
      inline def setGetSupportedValueTypes(value: CallbackTo[SafeArray[`type`]]): Self = StObject.set(x, "getSupportedValueTypes", value.toJsFn)
      
      inline def setGetValue(value: `type` => Any): Self = StObject.set(x, "getValue", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: Any => Callback): Self = StObject.set(x, "setValue", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setSupportedValueTypes(value: SafeArray[`type`]): Self = StObject.set(x, "SupportedValueTypes", value.asInstanceOf[js.Any])
      
      inline def setSupportsType(value: `type` => Boolean): Self = StObject.set(x, "supportsType", js.Any.fromFunction1(value))
    }
  }
}
