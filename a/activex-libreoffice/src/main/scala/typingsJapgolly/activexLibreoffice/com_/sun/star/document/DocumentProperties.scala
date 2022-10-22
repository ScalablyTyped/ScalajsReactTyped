package typingsJapgolly.activexLibreoffice.com_.sun.star.document

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.NamedValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.PropertyValue
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.XPropertyContainer
import typingsJapgolly.activexLibreoffice.com_.sun.star.embed.XStorage
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.util.DateTime
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides document-specific information such as the author, creation date, and user-defined fields.
  *
  * This service replaces the deprecated DocumentInfo and StandaloneDocumentInfo services.
  * @see XDocumentProperties
  * @see XDocumentPropertiesSupplier
  * @since OOo 3.0
  */
trait DocumentProperties
  extends StObject
     with XDocumentProperties {
  
  /** constructs default-initialized instance */
  def create(): Unit
}
object DocumentProperties {
  
  inline def apply(
    Author: String,
    AutoloadSecs: Double,
    AutoloadURL: String,
    CreationDate: DateTime,
    DefaultTarget: String,
    Description: String,
    DocumentStatistics: SafeArray[NamedValue],
    EditingCycles: Double,
    EditingDuration: Double,
    Generator: String,
    Keywords: SafeArray[String],
    Language: Locale,
    ModificationDate: DateTime,
    ModifiedBy: String,
    PrintDate: DateTime,
    PrintedBy: String,
    Subject: String,
    TemplateDate: DateTime,
    TemplateName: String,
    TemplateURL: String,
    Title: String,
    UserDefinedProperties: XPropertyContainer,
    create: Callback,
    getUserDefinedProperties: CallbackTo[XPropertyContainer],
    loadFromMedium: (String, SeqEquiv[PropertyValue]) => Callback,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    resetUserData: String => Callback,
    storeToMedium: (String, SeqEquiv[PropertyValue]) => Callback,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback
  ): DocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], AutoloadSecs = AutoloadSecs.asInstanceOf[js.Any], AutoloadURL = AutoloadURL.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DefaultTarget = DefaultTarget.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentStatistics = DocumentStatistics.asInstanceOf[js.Any], EditingCycles = EditingCycles.asInstanceOf[js.Any], EditingDuration = EditingDuration.asInstanceOf[js.Any], Generator = Generator.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], ModificationDate = ModificationDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], PrintDate = PrintDate.asInstanceOf[js.Any], PrintedBy = PrintedBy.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateDate = TemplateDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UserDefinedProperties = UserDefinedProperties.asInstanceOf[js.Any], create = create.toJsFn, getUserDefinedProperties = getUserDefinedProperties.toJsFn, loadFromMedium = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (loadFromMedium(t0, t1)).runNow()), loadFromStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (loadFromStorage(t0, t1)).runNow()), resetUserData = js.Any.fromFunction1((t0: String) => resetUserData(t0).runNow()), storeToMedium = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeToMedium(t0, t1)).runNow()), storeToStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (storeToStorage(t0, t1)).runNow()))
    __obj.asInstanceOf[DocumentProperties]
  }
  
  extension [Self <: DocumentProperties](x: Self) {
    
    inline def setCreate(value: Callback): Self = StObject.set(x, "create", value.toJsFn)
  }
}
