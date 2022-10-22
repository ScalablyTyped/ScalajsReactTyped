package typingsJapgolly.activexLibreoffice.com_.sun.star.sdb

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertiesChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySet
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertySetInfoChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XVetoableChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XComponent
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.XEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.Command
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.ContentInfo
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XCommandEnvironment
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XCommandInfoChangeListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XContent
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XContentEventListener
import typingsJapgolly.activexLibreoffice.com_.sun.star.ucb.XContentIdentifier
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * specifies a sub document of a {@link OfficeDatabaseDocument} .
  *
  * Usual instances of a `DocumentDefinition` are forms and reports.
  *
  * Note that the `DocumentDefinition` does not denote the actual document (i.e. an object supporting the {@link com.sun.star.frame.XModel} interface),
  * but only a shortcut to access and load those actual documents.
  */
trait DocumentDefinition
  extends StObject
     with DefinitionContent
     with XPropertySet
     with XSubDocument {
  
  /** Indicates if the document is to be used as template, for example, if a report is to be filled with data. */
  var AsTemplate: Boolean
  
  /** is the name of the document. If the document is part of the container, it is not possible to alter the name. */
  var Name: String
}
object DocumentDefinition {
  
  inline def apply(
    AsTemplate: Boolean,
    ContentType: String,
    HierarchicalName: String,
    Identifier: XContentIdentifier,
    Name: String,
    Parent: XInterface,
    PropertySetInfo: XPropertySetInfo,
    abort: Double => Callback,
    acquire: Callback,
    addCommandInfoChangeListener: XCommandInfoChangeListener => Callback,
    addContentEventListener: XContentEventListener => Callback,
    addEventListener: XEventListener => Callback,
    addPropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    addProperty: (String, Double, Any) => Callback,
    addPropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    addPropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback,
    addVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    close: CallbackTo[Boolean],
    composeHierarchicalName: String => String,
    createCommandIdentifier: CallbackTo[Double],
    createNewContent: ContentInfo => XContent,
    dispose: Callback,
    execute: (Command, Double, XCommandEnvironment) => Any,
    getContentType: CallbackTo[String],
    getHierarchicalName: CallbackTo[String],
    getIdentifier: CallbackTo[XContentIdentifier],
    getParent: CallbackTo[XInterface],
    getPropertySetInfo: CallbackTo[XPropertySetInfo],
    getPropertyValue: String => Any,
    open: CallbackTo[XComponent],
    openDesign: CallbackTo[XComponent],
    queryCreatableContentsInfo: CallbackTo[SafeArray[ContentInfo]],
    queryInterface: `type` => Any,
    release: Callback,
    releaseCommandIdentifier: Double => Callback,
    removeCommandInfoChangeListener: XCommandInfoChangeListener => Callback,
    removeContentEventListener: XContentEventListener => Callback,
    removeEventListener: XEventListener => Callback,
    removePropertiesChangeListener: (SeqEquiv[String], XPropertiesChangeListener) => Callback,
    removeProperty: String => Callback,
    removePropertyChangeListener: (String, XPropertyChangeListener) => Callback,
    removePropertySetInfoChangeListener: XPropertySetInfoChangeListener => Callback,
    removeVetoableChangeListener: (String, XVetoableChangeListener) => Callback,
    setParent: XInterface => Callback,
    setPropertyValue: (String, Any) => Callback,
    store: Callback
  ): DocumentDefinition = {
    val __obj = js.Dynamic.literal(AsTemplate = AsTemplate.asInstanceOf[js.Any], ContentType = ContentType.asInstanceOf[js.Any], HierarchicalName = HierarchicalName.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PropertySetInfo = PropertySetInfo.asInstanceOf[js.Any], abort = js.Any.fromFunction1((t0: Double) => abort(t0).runNow()), acquire = acquire.toJsFn, addCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => addCommandInfoChangeListener(t0).runNow()), addContentEventListener = js.Any.fromFunction1((t0: XContentEventListener) => addContentEventListener(t0).runNow()), addEventListener = js.Any.fromFunction1((t0: XEventListener) => addEventListener(t0).runNow()), addPropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (addPropertiesChangeListener(t0, t1)).runNow()), addProperty = js.Any.fromFunction3((t0: String, t1: Double, t2: Any) => (addProperty(t0, t1, t2)).runNow()), addPropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (addPropertyChangeListener(t0, t1)).runNow()), addPropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => addPropertySetInfoChangeListener(t0).runNow()), addVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (addVetoableChangeListener(t0, t1)).runNow()), close = close.toJsFn, composeHierarchicalName = js.Any.fromFunction1(composeHierarchicalName), createCommandIdentifier = createCommandIdentifier.toJsFn, createNewContent = js.Any.fromFunction1(createNewContent), dispose = dispose.toJsFn, execute = js.Any.fromFunction3(execute), getContentType = getContentType.toJsFn, getHierarchicalName = getHierarchicalName.toJsFn, getIdentifier = getIdentifier.toJsFn, getParent = getParent.toJsFn, getPropertySetInfo = getPropertySetInfo.toJsFn, getPropertyValue = js.Any.fromFunction1(getPropertyValue), open = open.toJsFn, openDesign = openDesign.toJsFn, queryCreatableContentsInfo = queryCreatableContentsInfo.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, releaseCommandIdentifier = js.Any.fromFunction1((t0: Double) => releaseCommandIdentifier(t0).runNow()), removeCommandInfoChangeListener = js.Any.fromFunction1((t0: XCommandInfoChangeListener) => removeCommandInfoChangeListener(t0).runNow()), removeContentEventListener = js.Any.fromFunction1((t0: XContentEventListener) => removeContentEventListener(t0).runNow()), removeEventListener = js.Any.fromFunction1((t0: XEventListener) => removeEventListener(t0).runNow()), removePropertiesChangeListener = js.Any.fromFunction2((t0: SeqEquiv[String], t1: XPropertiesChangeListener) => (removePropertiesChangeListener(t0, t1)).runNow()), removeProperty = js.Any.fromFunction1((t0: String) => removeProperty(t0).runNow()), removePropertyChangeListener = js.Any.fromFunction2((t0: String, t1: XPropertyChangeListener) => (removePropertyChangeListener(t0, t1)).runNow()), removePropertySetInfoChangeListener = js.Any.fromFunction1((t0: XPropertySetInfoChangeListener) => removePropertySetInfoChangeListener(t0).runNow()), removeVetoableChangeListener = js.Any.fromFunction2((t0: String, t1: XVetoableChangeListener) => (removeVetoableChangeListener(t0, t1)).runNow()), setParent = js.Any.fromFunction1((t0: XInterface) => setParent(t0).runNow()), setPropertyValue = js.Any.fromFunction2((t0: String, t1: Any) => (setPropertyValue(t0, t1)).runNow()), store = store.toJsFn)
    __obj.asInstanceOf[DocumentDefinition]
  }
  
  extension [Self <: DocumentDefinition](x: Self) {
    
    inline def setAsTemplate(value: Boolean): Self = StObject.set(x, "AsTemplate", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
