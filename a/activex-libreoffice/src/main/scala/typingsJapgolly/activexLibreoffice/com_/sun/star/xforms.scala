package typingsJapgolly.activexLibreoffice.com_.sun.star

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumeration
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameAccess
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNameContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XNamed
import typingsJapgolly.activexLibreoffice.com_.sun.star.container.XSet
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.ListEntrySource
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.ValueBinding
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.binding.XListEntryListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.submission.XSubmissionVetoListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.validation.XValidator
import typingsJapgolly.activexLibreoffice.com_.sun.star.form.validation.XValidityConstraintListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.Time
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.VetoException
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.XModifyListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XDocument
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.XNode
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.events.PhaseType
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.events.XEvent
import typingsJapgolly.activexLibreoffice.com_.sun.star.xml.dom.events.XEventTarget
import typingsJapgolly.activexLibreoffice.com_.sun.star.xsd.XDataType
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xforms {
  
  /** represent a binding to one or more nodes in the DOM tree of an {@link XModel} . */
  trait Binding
    extends StObject
       with ValueBinding
       with ListEntrySource
       with XValidator {
    
    /**
      * among other properties, there is this one
      *
      * It is unclear to me whether this is an implementation detail or a supported interface.
      *
      * The value supports the service {@link com.sun.star.xml.NamespaceContainer}
      * @see com.sun.star.xml.NamespaceContainer
      */
    var BindingNamespaces: XNameContainer
  }
  object Binding {
    
    inline def apply(
      AllListEntries: SafeArray[String],
      BindingNamespaces: XNameContainer,
      ListEntryCount: Double,
      PropertySetInfo: XPropertySetInfo,
      ReadOnly: Boolean,
      Relevant: Boolean,
      SupportedValueTypes: SafeArray[`type`],
      acquire: Callback,
      addEventListener: XEventListener => Callback,
      addListEntryListener: XListEntryListener => Callback,
      addModifyListener: XModifyListener => Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addValidityConstraintListener: XValidityConstraintListener => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      dispose: Callback,
      explainInvalid: Any => String,
      getAllListEntries: CallbackTo[SafeArray[String]],
      getListEntry: Double => String,
      getListEntryCount: CallbackTo[Double],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      getSupportedValueTypes: CallbackTo[SafeArray[`type`]],
      getValue: `type` => Any,
      isValid: Any => Boolean,
      queryInterface: `type` => Any,
      release: Callback,
      removeEventListener: XEventListener => Callback,
      removeListEntryListener: XListEntryListener => Callback,
      removeModifyListener: XModifyListener => Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeValidityConstraintListener: XValidityConstraintListener => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setPropertyValue: (String, Any) => Callback,
      setValue: Any => Callback,
      supportsType: `type` => Boolean
    ): Binding = {
      val __obj = js.Dynamic.literal(AllListEntries = AllListEntries.asInstanceOf[js.Any], BindingNamespaces = BindingNamespaces.asInstanceOf[js.Any], ListEntryCount = ListEntryCount.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], ReadOnly = ReadOnly.asInstanceOf[js.Any], Relevant = Relevant.asInstanceOf[js.Any], SupportedValueTypes = SupportedValueTypes.asInstanceOf[js.Any], acquire = acquire.toJsFn, addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => addListEntryListener(t0).runNow()), addModifyListener = js.Any.fromFunction1((t0: XModifyListener) => addModifyListener(t0).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addValidityConstraintListener = js.Any.fromFunction1((t0: XValidityConstraintListener) => addValidityConstraintListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), dispose = dispose.toJsFn, explainInvalid = js.Any.fromFunction1(explainInvalid), getAllListEntries = getAllListEntries.toJsFn, getListEntry = js.Any.fromFunction1(getListEntry), getListEntryCount = getListEntryCount.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSupportedValueTypes = getSupportedValueTypes.toJsFn, getValue = js.Any.fromFunction1(getValue), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removeListEntryListener = js.Any.fromFunction1((t0: XListEntryListener) => removeListEntryListener(t0).runNow()), removeModifyListener = js.Any.fromFunction1((t0: XModifyListener) => removeModifyListener(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeValidityConstraintListener = js.Any.fromFunction1((t0: XValidityConstraintListener) => removeValidityConstraintListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), setValue = js.Any.fromFunction1((t0: Any) => setValue(t0).runNow()), supportsType = js.Any.fromFunction1(supportsType))
      __obj.asInstanceOf[Binding]
    }
    
    extension [Self <: Binding](x: Self) {
      
      inline def setBindingNamespaces(value: XNameContainer): Self = StObject.set(x, "BindingNamespaces", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * thrown if the user triggers an {@link XForms} submission with invalid instance data
    *
    * The com::sun::star::uno::Exception::Source member refers to the submission which was invoked.
    */
  type InvalidDataOnSubmitException = VetoException
  
  /** @since LibreOffice 4.1 */
  type Model = XModel2
  
  /**
    * specifies a repository of XSD data types
    *
    * The elements of the repository are instances supporting the {@link com.sun.star.xsd.XDataType} interface.
    */
  trait XDataTypeRepository
    extends StObject
       with XEnumerationAccess
       with XNameAccess {
    
    /**
      * creates a clone of the given data type, and inserts it into the repository
      * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
      * @throws com::sun::star::container::ElementExistException if the new name is already used in the repository
      */
    def cloneDataType(sourceName: String, newName: String): XDataType
    
    /**
      * retrieves the basic type for the given type class
      * @see com.sun.star.xsd.DataTypeClass
      * @throws com::sun::star::container::NoSuchElementException if in the repository, there is no data type with the given class
      */
    def getBasicDataType(dataTypeClass: Double): XDataType
    
    def getDataType(typeName: String): XDataType
    
    /**
      * removes a data type given by name from the repository
      * @see com.sun.star.xsd.XDataType
      * @throws com::sun::star::container::NoSuchElementException if the given name does not refer to a type in the repository
      * @throws com::sun::star::util::VetoException if the specified data type is a built-in (basic) data type, and cannot be removed
      */
    def revokeDataType(typeName: String): Unit
  }
  object XDataTypeRepository {
    
    inline def apply(
      ElementNames: SafeArray[String],
      ElementType: `type`,
      acquire: Callback,
      cloneDataType: (String, String) => XDataType,
      createEnumeration: CallbackTo[XEnumeration],
      getBasicDataType: Double => XDataType,
      getByName: String => Any,
      getDataType: String => XDataType,
      getElementNames: CallbackTo[SafeArray[String]],
      getElementType: CallbackTo[`type`],
      hasByName: String => Boolean,
      hasElements: CallbackTo[Boolean],
      queryInterface: `type` => Any,
      release: Callback,
      revokeDataType: String => Callback
    ): XDataTypeRepository = {
      val __obj = js.Dynamic.literal(ElementNames = ElementNames.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], acquire = acquire.toJsFn, cloneDataType = js.Any.fromFunction2(cloneDataType), createEnumeration = createEnumeration.toJsFn, getBasicDataType = js.Any.fromFunction1(getBasicDataType), getByName = js.Any.fromFunction1(getByName), getDataType = js.Any.fromFunction1(getDataType), getElementNames = getElementNames.toJsFn, getElementType = getElementType.toJsFn, hasByName = js.Any.fromFunction1(hasByName), hasElements = hasElements.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, revokeDataType = js.Any.fromFunction1((t0: String) => revokeDataType(t0).runNow()))
      __obj.asInstanceOf[XDataTypeRepository]
    }
    
    extension [Self <: XDataTypeRepository](x: Self) {
      
      inline def setCloneDataType(value: (String, String) => XDataType): Self = StObject.set(x, "cloneDataType", js.Any.fromFunction2(value))
      
      inline def setGetBasicDataType(value: Double => XDataType): Self = StObject.set(x, "getBasicDataType", js.Any.fromFunction1(value))
      
      inline def setGetDataType(value: String => XDataType): Self = StObject.set(x, "getDataType", js.Any.fromFunction1(value))
      
      inline def setRevokeDataType(value: String => Callback): Self = StObject.set(x, "revokeDataType", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    }
  }
  
  /** @since LibreOffice 4.1 */
  type XForms = XNameContainer
  
  trait XFormsEvent
    extends StObject
       with XEvent {
    
    def initXFormsEvent(typeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit
  }
  object XFormsEvent {
    
    inline def apply(
      Bubbles: Boolean,
      Cancelable: Boolean,
      CurrentTarget: XEventTarget,
      EventPhase: PhaseType,
      Target: XEventTarget,
      TimeStamp: Time,
      Type: String,
      acquire: Callback,
      getBubbles: CallbackTo[Boolean],
      getCancelable: CallbackTo[Boolean],
      getCurrentTarget: CallbackTo[XEventTarget],
      getEventPhase: CallbackTo[PhaseType],
      getTarget: CallbackTo[XEventTarget],
      getTimeStamp: CallbackTo[Time],
      getType: CallbackTo[String],
      initEvent: (String, Boolean, Boolean) => Callback,
      initXFormsEvent: (String, Boolean, Boolean) => Callback,
      preventDefault: Callback,
      queryInterface: `type` => Any,
      release: Callback,
      stopPropagation: Callback
    ): XFormsEvent = {
      val __obj = js.Dynamic.literal(Bubbles = Bubbles.asInstanceOf[js.Any], Cancelable = Cancelable.asInstanceOf[js.Any], CurrentTarget = CurrentTarget.asInstanceOf[js.Any], EventPhase = EventPhase.asInstanceOf[js.Any], Target = Target.asInstanceOf[js.Any], TimeStamp = TimeStamp.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], acquire = acquire.toJsFn, getBubbles = getBubbles.toJsFn, getCancelable = getCancelable.toJsFn, getCurrentTarget = getCurrentTarget.toJsFn, getEventPhase = getEventPhase.toJsFn, getTarget = getTarget.toJsFn, getTimeStamp = getTimeStamp.toJsFn, getType = getType.toJsFn, initEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initEvent(t0, t1, t2)).runNow()), initXFormsEvent = js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (initXFormsEvent(t0, t1, t2)).runNow()), preventDefault = preventDefault.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, stopPropagation = stopPropagation.toJsFn)
      __obj.asInstanceOf[XFormsEvent]
    }
    
    extension [Self <: XFormsEvent](x: Self) {
      
      inline def setInitXFormsEvent(value: (String, Boolean, Boolean) => Callback): Self = StObject.set(x, "initXFormsEvent", js.Any.fromFunction3((t0: String, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    }
  }
  
  /** provides access to the {@link XForms} models contained in the component */
  trait XFormsSupplier
    extends StObject
       with XInterface {
    
    /**
      * access {@link XForms} model container.
      * @returns a container for the {@link XForms} models contained in the component
      */
    val XForms: XNameContainer
    
    /**
      * access {@link XForms} model container.
      * @returns a container for the {@link XForms} models contained in the component
      */
    def getXForms(): XNameContainer
  }
  object XFormsSupplier {
    
    inline def apply(
      XForms: XNameContainer,
      acquire: Callback,
      getXForms: CallbackTo[XNameContainer],
      queryInterface: `type` => Any,
      release: Callback
    ): XFormsSupplier = {
      val __obj = js.Dynamic.literal(XForms = XForms.asInstanceOf[js.Any], acquire = acquire.toJsFn, getXForms = getXForms.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
      __obj.asInstanceOf[XFormsSupplier]
    }
    
    extension [Self <: XFormsSupplier](x: Self) {
      
      inline def setGetXForms(value: CallbackTo[XNameContainer]): Self = StObject.set(x, "getXForms", value.toJsFn)
      
      inline def setXForms(value: XNameContainer): Self = StObject.set(x, "XForms", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * provide several helper methods for the UI
    *
    * **This interfaces is for UI use only, and will likely be unsupported in future versions.**
    */
  trait XFormsUIHelper1 extends StObject {
    
    def cloneBindingAsGhost(binding: XPropertySet): XPropertySet
    
    def createAttribute(xParent: XNode, sName: String): XNode
    
    def createElement(xParent: XNode, sName: String): XNode
    
    def getBindingForNode(xNode: XNode, bCreate: Boolean): XPropertySet
    
    def getBindingName(xBinding: XPropertySet, bDetail: Boolean): String
    
    def getDefaultBindingExpressionForNode(xNode: XNode): String
    
    def getDefaultServiceNameForNode(xNode: XNode): String
    
    def getNodeDisplayName(xNode: XNode, bDetail: Boolean): String
    
    def getNodeName(xNode: XNode): String
    
    def getResultForExpression(xBinding: XPropertySet, bIsBindingExpression: Boolean, sExpression: String): String
    
    def getSubmissionName(xSubm: XPropertySet, bDetail: Boolean): String
    
    def isValidPrefixName(sName: String): Boolean
    
    def isValidXMLName(sName: String): Boolean
    
    def newInstance(sName: String, sURL: String, bURLOnce: Boolean): XDocument
    
    def newModel(xModel: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): XModel
    
    def removeBindingForNode(xNode: XNode): Unit
    
    def removeBindingIfUseless(xBinding: XPropertySet): Unit
    
    def removeInstance(sName: String): Unit
    
    def removeModel(xModel: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, sName: String): Unit
    
    def renameInstance(sFrom: String, sTo: String, sURL: String, bURLOnce: Boolean): Unit
    
    def renameModel(xModel: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, sFrom: String, sTo: String): Unit
    
    def renameNode(xNode: XNode, sName: String): XNode
    
    def setNodeValue(xNode: XNode, sValue: String): Unit
  }
  object XFormsUIHelper1 {
    
    inline def apply(
      cloneBindingAsGhost: XPropertySet => XPropertySet,
      createAttribute: (XNode, String) => XNode,
      createElement: (XNode, String) => XNode,
      getBindingForNode: (XNode, Boolean) => XPropertySet,
      getBindingName: (XPropertySet, Boolean) => String,
      getDefaultBindingExpressionForNode: XNode => String,
      getDefaultServiceNameForNode: XNode => String,
      getNodeDisplayName: (XNode, Boolean) => String,
      getNodeName: XNode => String,
      getResultForExpression: (XPropertySet, Boolean, String) => String,
      getSubmissionName: (XPropertySet, Boolean) => String,
      isValidPrefixName: String => Boolean,
      isValidXMLName: String => Boolean,
      newInstance: (String, String, Boolean) => XDocument,
      newModel: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel,
      removeBindingForNode: XNode => Callback,
      removeBindingIfUseless: XPropertySet => Callback,
      removeInstance: String => Callback,
      removeModel: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String) => Callback,
      renameInstance: (String, String, String, Boolean) => Callback,
      renameModel: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Callback,
      renameNode: (XNode, String) => XNode,
      setNodeValue: (XNode, String) => Callback
    ): XFormsUIHelper1 = {
      val __obj = js.Dynamic.literal(cloneBindingAsGhost = js.Any.fromFunction1(cloneBindingAsGhost), createAttribute = js.Any.fromFunction2(createAttribute), createElement = js.Any.fromFunction2(createElement), getBindingForNode = js.Any.fromFunction2(getBindingForNode), getBindingName = js.Any.fromFunction2(getBindingName), getDefaultBindingExpressionForNode = js.Any.fromFunction1(getDefaultBindingExpressionForNode), getDefaultServiceNameForNode = js.Any.fromFunction1(getDefaultServiceNameForNode), getNodeDisplayName = js.Any.fromFunction2(getNodeDisplayName), getNodeName = js.Any.fromFunction1(getNodeName), getResultForExpression = js.Any.fromFunction3(getResultForExpression), getSubmissionName = js.Any.fromFunction2(getSubmissionName), isValidPrefixName = js.Any.fromFunction1(isValidPrefixName), isValidXMLName = js.Any.fromFunction1(isValidXMLName), newInstance = js.Any.fromFunction3(newInstance), newModel = js.Any.fromFunction2(newModel), removeBindingForNode = js.Any.fromFunction1((t0: XNode) => removeBindingForNode(t0).runNow()), removeBindingIfUseless = js.Any.fromFunction1((t0: XPropertySet) => removeBindingIfUseless(t0).runNow()), removeInstance = js.Any.fromFunction1((t0: String) => removeInstance(t0).runNow()), removeModel = js.Any.fromFunction2((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, t1: String) => (removeModel(t0, t1)).runNow()), renameInstance = js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (renameInstance(t0, t1, t2, t3)).runNow()), renameModel = js.Any.fromFunction3((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, t1: String, t2: String) => (renameModel(t0, t1, t2)).runNow()), renameNode = js.Any.fromFunction2(renameNode), setNodeValue = js.Any.fromFunction2((t0: XNode, t1: String) => (setNodeValue(t0, t1)).runNow()))
      __obj.asInstanceOf[XFormsUIHelper1]
    }
    
    extension [Self <: XFormsUIHelper1](x: Self) {
      
      inline def setCloneBindingAsGhost(value: XPropertySet => XPropertySet): Self = StObject.set(x, "cloneBindingAsGhost", js.Any.fromFunction1(value))
      
      inline def setCreateAttribute(value: (XNode, String) => XNode): Self = StObject.set(x, "createAttribute", js.Any.fromFunction2(value))
      
      inline def setCreateElement(value: (XNode, String) => XNode): Self = StObject.set(x, "createElement", js.Any.fromFunction2(value))
      
      inline def setGetBindingForNode(value: (XNode, Boolean) => XPropertySet): Self = StObject.set(x, "getBindingForNode", js.Any.fromFunction2(value))
      
      inline def setGetBindingName(value: (XPropertySet, Boolean) => String): Self = StObject.set(x, "getBindingName", js.Any.fromFunction2(value))
      
      inline def setGetDefaultBindingExpressionForNode(value: XNode => String): Self = StObject.set(x, "getDefaultBindingExpressionForNode", js.Any.fromFunction1(value))
      
      inline def setGetDefaultServiceNameForNode(value: XNode => String): Self = StObject.set(x, "getDefaultServiceNameForNode", js.Any.fromFunction1(value))
      
      inline def setGetNodeDisplayName(value: (XNode, Boolean) => String): Self = StObject.set(x, "getNodeDisplayName", js.Any.fromFunction2(value))
      
      inline def setGetNodeName(value: XNode => String): Self = StObject.set(x, "getNodeName", js.Any.fromFunction1(value))
      
      inline def setGetResultForExpression(value: (XPropertySet, Boolean, String) => String): Self = StObject.set(x, "getResultForExpression", js.Any.fromFunction3(value))
      
      inline def setGetSubmissionName(value: (XPropertySet, Boolean) => String): Self = StObject.set(x, "getSubmissionName", js.Any.fromFunction2(value))
      
      inline def setIsValidPrefixName(value: String => Boolean): Self = StObject.set(x, "isValidPrefixName", js.Any.fromFunction1(value))
      
      inline def setIsValidXMLName(value: String => Boolean): Self = StObject.set(x, "isValidXMLName", js.Any.fromFunction1(value))
      
      inline def setNewInstance(value: (String, String, Boolean) => XDocument): Self = StObject.set(x, "newInstance", js.Any.fromFunction3(value))
      
      inline def setNewModel(value: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String) => XModel): Self = StObject.set(x, "newModel", js.Any.fromFunction2(value))
      
      inline def setRemoveBindingForNode(value: XNode => Callback): Self = StObject.set(x, "removeBindingForNode", js.Any.fromFunction1((t0: XNode) => value(t0).runNow()))
      
      inline def setRemoveBindingIfUseless(value: XPropertySet => Callback): Self = StObject.set(x, "removeBindingIfUseless", js.Any.fromFunction1((t0: XPropertySet) => value(t0).runNow()))
      
      inline def setRemoveInstance(value: String => Callback): Self = StObject.set(x, "removeInstance", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRemoveModel(value: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String) => Callback): Self = StObject.set(x, "removeModel", js.Any.fromFunction2((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setRenameInstance(value: (String, String, String, Boolean) => Callback): Self = StObject.set(x, "renameInstance", js.Any.fromFunction4((t0: String, t1: String, t2: String, t3: Boolean) => (value(t0, t1, t2, t3)).runNow()))
      
      inline def setRenameModel(value: (typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, String, String) => Callback): Self = StObject.set(x, "renameModel", js.Any.fromFunction3((t0: typingsJapgolly.activexLibreoffice.com_.sun.star.frame.XModel, t1: String, t2: String) => (value(t0, t1, t2)).runNow()))
      
      inline def setRenameNode(value: (XNode, String) => XNode): Self = StObject.set(x, "renameNode", js.Any.fromFunction2(value))
      
      inline def setSetNodeValue(value: (XNode, String) => Callback): Self = StObject.set(x, "setNodeValue", js.Any.fromFunction2((t0: XNode, t1: String) => (value(t0, t1)).runNow()))
    }
  }
  
  /** represent an {@link XForms} model */
  trait XModel extends StObject {
    
    /** get a container containing all bindings; also supports XNameAccess */
    val Bindings: XSet
    
    /** provides management access to the XSD data types associated with the model */
    val DataTypeRepository: XDataTypeRepository
    
    /** get the default instance for this model */
    val DefaultInstance: XDocument
    
    /** get the {@link XForms} model ID */
    var ID: String
    
    /**
      * gets container containing all instances;
      *
      * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
      */
    val Instances: XSet
    
    /** get container containing all submissions; also supports XNameAccess */
    val Submissions: XSet
    
    /**
      * clone an arbitrary binding element for this model; still needs
      *
      * The returned binding still needs to be inserted into the bindings container.
      * @see getBindings
      */
    def cloneBinding(binding: XPropertySet): XPropertySet
    
    /**
      * clone an arbitrary submission element for this model
      *
      * The returned submission element still needs to be inserted into the submission container.
      * @see getSubmissions
      */
    def cloneSubmission(submission: XPropertySet): XSubmission
    
    /**
      * create a binding element for this model
      *
      * The returned binding still needs to be inserted into the bindings container.
      * @see getBindings
      */
    def createBinding(): XPropertySet
    
    /**
      * create a submission element for this model
      *
      * The returned submission element still needs to be inserted into the submission container.
      * @see getSubmissions
      */
    def createSubmission(): XSubmission
    
    /**
      * get a binding with a certain ID
      *
      * This is a convenience method: the same result can also be obtained through {@link getBindings()}
      */
    def getBinding(id: String): XPropertySet
    
    /** get a container containing all bindings; also supports XNameAccess */
    def getBindings(): XSet
    
    /** provides management access to the XSD data types associated with the model */
    def getDataTypeRepository(): XDataTypeRepository
    
    /** get the default instance for this model */
    def getDefaultInstance(): XDocument
    
    /** get the {@link XForms} model ID */
    def getID(): String
    
    /** retrieves the instance with the given id */
    def getInstanceDocument(id: String): XDocument
    
    /**
      * gets container containing all instances;
      *
      * The elements of the set are arrays of {@link com.sun.star.beans.PropertyValues} , containing the ID, the URL, and the instance itself.
      */
    def getInstances(): XSet
    
    /**
      * get a submission with a certain ID.
      *
      * This is a convenience method: the same result can also be obtained through {@link getSubmissions()} .
      */
    def getSubmission(id: String): XSubmission
    
    /** get container containing all submissions; also supports XNameAccess */
    def getSubmissions(): XSet
    
    /** initialize the model */
    def initialize(): Unit
    
    /** rebuild the model */
    def rebuild(): Unit
    
    /** re-evaluate all calculate attributes */
    def recalculate(): Unit
    
    /** refresh the model */
    def refresh(): Unit
    
    /** re-evaluate all validity attributes */
    def revalidate(): Unit
    
    /** set the {@link XForms} model ID */
    def setID(id: String): Unit
    
    /**
      * submit form through given submission id
      *
      * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id ).submit()` .
      * @param id the ID of the submission to execute
      * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
      * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
      */
    def submit(id: String): Unit
    
    /**
      * submit form through given submission id
      *
      * This is a convenience method. Calling it is equivalent to calling `getSubmission()( id, handler ).submit()` .
      * @param id the ID of the submission to execute
      * @param aHandler This handler allows additional user interaction, which may be necessary before the submission can be performed.
      * @throws com::sun::star::util::VetoException when the current model state does not allow a submission. Usually, this indicates that consistency criteria f
      * @throws com::sun::star::lang::WrappedTargetException when another error occurred during the submission. The {@link com.sun.star.lang.WrappedTargetExcepti
      */
    def submitWithInteraction(id: String, aHandler: XInteractionHandler): Unit
  }
  object XModel {
    
    inline def apply(
      Bindings: XSet,
      DataTypeRepository: XDataTypeRepository,
      DefaultInstance: XDocument,
      ID: String,
      Instances: XSet,
      Submissions: XSet,
      cloneBinding: XPropertySet => XPropertySet,
      cloneSubmission: XPropertySet => XSubmission,
      createBinding: CallbackTo[XPropertySet],
      createSubmission: CallbackTo[XSubmission],
      getBinding: String => XPropertySet,
      getBindings: CallbackTo[XSet],
      getDataTypeRepository: CallbackTo[XDataTypeRepository],
      getDefaultInstance: CallbackTo[XDocument],
      getID: CallbackTo[String],
      getInstanceDocument: String => XDocument,
      getInstances: CallbackTo[XSet],
      getSubmission: String => XSubmission,
      getSubmissions: CallbackTo[XSet],
      initialize: Callback,
      rebuild: Callback,
      recalculate: Callback,
      refresh: Callback,
      revalidate: Callback,
      setID: String => Callback,
      submit: String => Callback,
      submitWithInteraction: (String, XInteractionHandler) => Callback
    ): XModel = {
      val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = createBinding.toJsFn, createSubmission = createSubmission.toJsFn, getBinding = js.Any.fromFunction1(getBinding), getBindings = getBindings.toJsFn, getDataTypeRepository = getDataTypeRepository.toJsFn, getDefaultInstance = getDefaultInstance.toJsFn, getID = getID.toJsFn, getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = getInstances.toJsFn, getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = getSubmissions.toJsFn, initialize = initialize.toJsFn, rebuild = rebuild.toJsFn, recalculate = recalculate.toJsFn, refresh = refresh.toJsFn, revalidate = revalidate.toJsFn, setID = js.Any.fromFunction1((t0: String) => setID(t0).runNow()), submit = js.Any.fromFunction1((t0: String) => submit(t0).runNow()), submitWithInteraction = js.Any.fromFunction2((t0: String, t1: XInteractionHandler) => (submitWithInteraction(t0, t1)).runNow()))
      __obj.asInstanceOf[XModel]
    }
    
    extension [Self <: XModel](x: Self) {
      
      inline def setBindings(value: XSet): Self = StObject.set(x, "Bindings", value.asInstanceOf[js.Any])
      
      inline def setCloneBinding(value: XPropertySet => XPropertySet): Self = StObject.set(x, "cloneBinding", js.Any.fromFunction1(value))
      
      inline def setCloneSubmission(value: XPropertySet => XSubmission): Self = StObject.set(x, "cloneSubmission", js.Any.fromFunction1(value))
      
      inline def setCreateBinding(value: CallbackTo[XPropertySet]): Self = StObject.set(x, "createBinding", value.toJsFn)
      
      inline def setCreateSubmission(value: CallbackTo[XSubmission]): Self = StObject.set(x, "createSubmission", value.toJsFn)
      
      inline def setDataTypeRepository(value: XDataTypeRepository): Self = StObject.set(x, "DataTypeRepository", value.asInstanceOf[js.Any])
      
      inline def setDefaultInstance(value: XDocument): Self = StObject.set(x, "DefaultInstance", value.asInstanceOf[js.Any])
      
      inline def setGetBinding(value: String => XPropertySet): Self = StObject.set(x, "getBinding", js.Any.fromFunction1(value))
      
      inline def setGetBindings(value: CallbackTo[XSet]): Self = StObject.set(x, "getBindings", value.toJsFn)
      
      inline def setGetDataTypeRepository(value: CallbackTo[XDataTypeRepository]): Self = StObject.set(x, "getDataTypeRepository", value.toJsFn)
      
      inline def setGetDefaultInstance(value: CallbackTo[XDocument]): Self = StObject.set(x, "getDefaultInstance", value.toJsFn)
      
      inline def setGetID(value: CallbackTo[String]): Self = StObject.set(x, "getID", value.toJsFn)
      
      inline def setGetInstanceDocument(value: String => XDocument): Self = StObject.set(x, "getInstanceDocument", js.Any.fromFunction1(value))
      
      inline def setGetInstances(value: CallbackTo[XSet]): Self = StObject.set(x, "getInstances", value.toJsFn)
      
      inline def setGetSubmission(value: String => XSubmission): Self = StObject.set(x, "getSubmission", js.Any.fromFunction1(value))
      
      inline def setGetSubmissions(value: CallbackTo[XSet]): Self = StObject.set(x, "getSubmissions", value.toJsFn)
      
      inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
      
      inline def setInitialize(value: Callback): Self = StObject.set(x, "initialize", value.toJsFn)
      
      inline def setInstances(value: XSet): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
      
      inline def setRebuild(value: Callback): Self = StObject.set(x, "rebuild", value.toJsFn)
      
      inline def setRecalculate(value: Callback): Self = StObject.set(x, "recalculate", value.toJsFn)
      
      inline def setRefresh(value: Callback): Self = StObject.set(x, "refresh", value.toJsFn)
      
      inline def setRevalidate(value: Callback): Self = StObject.set(x, "revalidate", value.toJsFn)
      
      inline def setSetID(value: String => Callback): Self = StObject.set(x, "setID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSubmissions(value: XSet): Self = StObject.set(x, "Submissions", value.asInstanceOf[js.Any])
      
      inline def setSubmit(value: String => Callback): Self = StObject.set(x, "submit", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setSubmitWithInteraction(value: (String, XInteractionHandler) => Callback): Self = StObject.set(x, "submitWithInteraction", js.Any.fromFunction2((t0: String, t1: XInteractionHandler) => (value(t0, t1)).runNow()))
    }
  }
  
  /** @since LibreOffice 4.1 */
  trait XModel2
    extends StObject
       with XModel
       with XPropertySet
  object XModel2 {
    
    inline def apply(
      Bindings: XSet,
      DataTypeRepository: XDataTypeRepository,
      DefaultInstance: XDocument,
      ID: String,
      Instances: XSet,
      PropertySetInfo: XPropertySetInfo,
      Submissions: XSet,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      cloneBinding: XPropertySet => XPropertySet,
      cloneSubmission: XPropertySet => XSubmission,
      createBinding: CallbackTo[XPropertySet],
      createSubmission: CallbackTo[XSubmission],
      getBinding: String => XPropertySet,
      getBindings: CallbackTo[XSet],
      getDataTypeRepository: CallbackTo[XDataTypeRepository],
      getDefaultInstance: CallbackTo[XDocument],
      getID: CallbackTo[String],
      getInstanceDocument: String => XDocument,
      getInstances: CallbackTo[XSet],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      getSubmission: String => XSubmission,
      getSubmissions: CallbackTo[XSet],
      initialize: Callback,
      queryInterface: `type` => Any,
      rebuild: Callback,
      recalculate: Callback,
      refresh: Callback,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      revalidate: Callback,
      setID: String => Callback,
      setPropertyValue: (String, Any) => Callback,
      submit: String => Callback,
      submitWithInteraction: (String, XInteractionHandler) => Callback
    ): XModel2 = {
      val __obj = js.Dynamic.literal(Bindings = Bindings.asInstanceOf[js.Any], DataTypeRepository = DataTypeRepository.asInstanceOf[js.Any], DefaultInstance = DefaultInstance.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Instances = Instances.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], Submissions = Submissions.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), cloneBinding = js.Any.fromFunction1(cloneBinding), cloneSubmission = js.Any.fromFunction1(cloneSubmission), createBinding = createBinding.toJsFn, createSubmission = createSubmission.toJsFn, getBinding = js.Any.fromFunction1(getBinding), getBindings = getBindings.toJsFn, getDataTypeRepository = getDataTypeRepository.toJsFn, getDefaultInstance = getDefaultInstance.toJsFn, getID = getID.toJsFn, getInstanceDocument = js.Any.fromFunction1(getInstanceDocument), getInstances = getInstances.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), getSubmission = js.Any.fromFunction1(getSubmission), getSubmissions = getSubmissions.toJsFn, initialize = initialize.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), rebuild = rebuild.toJsFn, recalculate = recalculate.toJsFn, refresh = refresh.toJsFn, release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), revalidate = revalidate.toJsFn, setID = js.Any.fromFunction1((t0: String) => setID(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), submit = js.Any.fromFunction1((t0: String) => submit(t0).runNow()), submitWithInteraction = js.Any.fromFunction2((t0: String, t1: XInteractionHandler) => (submitWithInteraction(t0, t1)).runNow()))
      __obj.asInstanceOf[XModel2]
    }
  }
  
  /** specifies a submission object, associated with an {@link XModel} */
  trait XSubmission
    extends StObject
       with XPropertySet
       with XNamed
       with typingsJapgolly.activexLibreoffice.com_.sun.star.form.submission.XSubmission
  object XSubmission {
    
    inline def apply(
      Name: String,
      PropertySetInfo: XPropertySetInfo,
      acquire: Callback,
      addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      addSubmissionVetoListener: XSubmissionVetoListener => Callback,
      addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      getName: CallbackTo[String],
      getPropertySetInfo: CallbackTo[XPropertySetInfo],
      getPropertyValue: String => Any,
      queryInterface: `type` => Any,
      release: Callback,
      removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
      removeSubmissionVetoListener: XSubmissionVetoListener => Callback,
      removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
      setName: String => Callback,
      setPropertyValue: (String, Any) => Callback,
      submit: Callback,
      submitWithInteraction: XInteractionHandler => Callback
    ): XSubmission = {
      val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], acquire = acquire.toJsFn, addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addSubmissionVetoListener = js.Any.fromFunction1((t0: XSubmissionVetoListener) => addSubmissionVetoListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), getName = getName.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removeSubmissionVetoListener = js.Any.fromFunction1((t0: XSubmissionVetoListener) => removeSubmissionVetoListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setName = js.Any.fromFunction1((t0: String) => setName(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), submit = submit.toJsFn, submitWithInteraction = js.Any.fromFunction1((t0: XInteractionHandler) => submitWithInteraction(t0).runNow()))
      __obj.asInstanceOf[XSubmission]
    }
  }
}
