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
  * This interface manages access to document meta-data properties. Such properties may be set from the outside via the setter methods (e.g. when
  * importing arbitrary document formats that support document properties), or imported from an ODF package via the methods {@link loadFromStorage()} and
  * {@link loadFromMedium()} . The properties may also be stored via the methods {@link storeToStorage()} and {@link storeToMedium()} .
  * @see XDocumentPropertiesSupplier for getting access to an instance from a loaded document
  * @see DocumentProperties for a service that implements this interface
  * @since OOo 3.0
  */
trait XDocumentProperties extends StObject {
  
  /** contains the initial author of the document. */
  var Author: String
  
  /**
    * contains the number of seconds after which a specified URL is to be loaded after the document is loaded into a desktop frame.
    *
    * A value of 0 is valid and describes a redirection. A value of 0 together with an empty `string` as {@link AutoloadURL} describes a case where no
    * autoload is specified.
    * @see AutoloadURL
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var AutoloadSecs: Double
  
  /**
    * contains the URL to load automatically at a specified time after the document is loaded into a desktop frame.
    *
    * An empty URL is valid and describes a case where the document shall be reloaded from its original location after some time described by the attribute
    * {@link AutoloadSecs} . An empty `string` together with an {@link AutoloadSecs} value of 0 describes a case where no autoload is specified.
    * @see AutoloadSecs
    */
  var AutoloadURL: String
  
  /** contains the date and time when the document was created. */
  var CreationDate: DateTime
  
  /**
    * contains the name of the default frame into which links should be loaded if no target is specified.
    *
    * This applies to the autoload feature too, but to others as well.
    */
  var DefaultTarget: String
  
  /**
    * contains a multi-line comment describing the document.
    *
    * Line delimiters can be UNIX, Macintosh or DOS style.
    */
  var Description: String
  
  /**
    * contains some statistics about the document.
    *
    * The contained statistics may be specific to the type of the document.
    */
  var DocumentStatistics: SafeArray[NamedValue]
  
  /**
    * describes how often the document was edited and saved.
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingCycles: Double
  
  /**
    * contains the net time of editing the document (in seconds).
    * @throws com::sun::star::lang::IllegalArgumentException if argument is negative
    */
  var EditingDuration: Double
  
  /**
    * identifies which application was used to create or last modify the document.
    *
    * The generating application will set this attribute when it creates a new document or it saves a document. When a document is loaded that itself
    * contains such an attribute it will be preserved until the document is saved again.
    */
  var Generator: String
  
  /** contains a list of keywords for the document. */
  var Keywords: SafeArray[String]
  
  /** contains the default language of the document. */
  var Language: Locale
  
  /**
    * contains the date and time of the last time the document was stored.
    *
    * If the document has never been stored, contains a default value.
    */
  var ModificationDate: DateTime
  
  /** contains the name of the person who most recently stored the document. */
  var ModifiedBy: String
  
  /**
    * contains the date and time when the document was last printed.
    *
    * If the document has never been printed, contains a default value.
    */
  var PrintDate: DateTime
  
  /** contains the name of the person who most recently printed the document. */
  var PrintedBy: String
  
  /** contains the subject of the document. */
  var Subject: String
  
  /** contains the date and time of when the document was created or updated from the template. */
  var TemplateDate: DateTime
  
  /**
    * contains the name of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateName: String
  
  /**
    * contains the URL of the template from which the document was created.
    *
    * The value is an empty `string` if the document was not created from a template or if it was detached from the template.
    */
  var TemplateURL: String
  
  /** contains the title of the document. */
  var Title: String
  
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  val UserDefinedProperties: XPropertyContainer
  
  /**
    * provides access to a container for user-defined properties.
    *
    * The returned object also implements the interface {@link com.sun.star.beans.XPropertySet} .
    * @returns a container that provides access to user-defined properties
    */
  def getUserDefinedProperties(): XPropertyContainer
  
  /**
    * loads document properties from an ODF package or an OLE container.
    * @param URL the URL of the source document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromMedium(URL: String, Medium: SeqEquiv[PropertyValue]): Unit
  
  /**
    * loads document properties from an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::io::WrongFormatException if parsing the XML document fails
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when trying to open a stream in the given storage
    */
  def loadFromStorage(Storage: XStorage, Medium: SeqEquiv[PropertyValue]): Unit
  
  /**
    * resets all attributes that could identify the user.
    *
    * Clears the document properties, such that it appears the document has just been created. This is a convenience method which resets several attributes
    * at once, as follows: {@link Author} is set to the given parameter.{@link CreationDate} is set to the current date and time.{@link ModifiedBy} is
    * cleared.{@link ModificationDate} is cleared.{@link PrintedBy} is cleared.{@link PrintDate} is cleared.{@link EditingDuration} is cleared.{@link
    * EditingCycles} is set to 1.
    * @param Author the new value of the {@link Author} attribute.
    */
  def resetUserData(Author: String): Unit
  
  /**
    * stores document properties to an ODF package or an OLE container.
    * @param URL the URL of the target document The URL could be part of the Medium parameter, but because often no other parameters except the URL are needed
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the target
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToMedium(URL: String, Medium: SeqEquiv[PropertyValue]): Unit
  
  /**
    * stores document properties to an ODF package.
    *
    * This method is used for accessing an ODF package that is owned by someone else, e.g., a document. Note that the implementation may choose to store the
    * meta-data in either OOo or ODF format, depending on the MediaType property of the given Storage argument.
    * @param Storage the {@link com.sun.star.embed.Storage} representing the ODF package
    * @param Medium the {@link com.sun.star.document.MediaDescriptor} representing the source This is unfortunately necessary in order to properly resolve rel
    * @throws com::sun::star::lang::IllegalArgumentException if argument is `NULL`
    * @throws com::sun::star::lang::WrappedTargetException if thrown when trying to open a stream in the given storage
    * @throws com::sun::star::io::IOException if thrown when writing to the storage
    */
  def storeToStorage(Storage: XStorage, Medium: SeqEquiv[PropertyValue]): Unit
}
object XDocumentProperties {
  
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
    getUserDefinedProperties: CallbackTo[XPropertyContainer],
    loadFromMedium: (String, SeqEquiv[PropertyValue]) => Callback,
    loadFromStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback,
    resetUserData: String => Callback,
    storeToMedium: (String, SeqEquiv[PropertyValue]) => Callback,
    storeToStorage: (XStorage, SeqEquiv[PropertyValue]) => Callback
  ): XDocumentProperties = {
    val __obj = js.Dynamic.literal(Author = Author.asInstanceOf[js.Any], AutoloadSecs = AutoloadSecs.asInstanceOf[js.Any], AutoloadURL = AutoloadURL.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DefaultTarget = DefaultTarget.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], DocumentStatistics = DocumentStatistics.asInstanceOf[js.Any], EditingCycles = EditingCycles.asInstanceOf[js.Any], EditingDuration = EditingDuration.asInstanceOf[js.Any], Generator = Generator.asInstanceOf[js.Any], Keywords = Keywords.asInstanceOf[js.Any], Language = Language.asInstanceOf[js.Any], ModificationDate = ModificationDate.asInstanceOf[js.Any], ModifiedBy = ModifiedBy.asInstanceOf[js.Any], PrintDate = PrintDate.asInstanceOf[js.Any], PrintedBy = PrintedBy.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any], TemplateDate = TemplateDate.asInstanceOf[js.Any], TemplateName = TemplateName.asInstanceOf[js.Any], TemplateURL = TemplateURL.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], UserDefinedProperties = UserDefinedProperties.asInstanceOf[js.Any], getUserDefinedProperties = getUserDefinedProperties.toJsFn, loadFromMedium = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (loadFromMedium(t0, t1)).runNow()), loadFromStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (loadFromStorage(t0, t1)).runNow()), resetUserData = js.Any.fromFunction1((t0: String) => resetUserData(t0).runNow()), storeToMedium = js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (storeToMedium(t0, t1)).runNow()), storeToStorage = js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (storeToStorage(t0, t1)).runNow()))
    __obj.asInstanceOf[XDocumentProperties]
  }
  
  extension [Self <: XDocumentProperties](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "Author", value.asInstanceOf[js.Any])
    
    inline def setAutoloadSecs(value: Double): Self = StObject.set(x, "AutoloadSecs", value.asInstanceOf[js.Any])
    
    inline def setAutoloadURL(value: String): Self = StObject.set(x, "AutoloadURL", value.asInstanceOf[js.Any])
    
    inline def setCreationDate(value: DateTime): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    inline def setDefaultTarget(value: String): Self = StObject.set(x, "DefaultTarget", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDocumentStatistics(value: SafeArray[NamedValue]): Self = StObject.set(x, "DocumentStatistics", value.asInstanceOf[js.Any])
    
    inline def setEditingCycles(value: Double): Self = StObject.set(x, "EditingCycles", value.asInstanceOf[js.Any])
    
    inline def setEditingDuration(value: Double): Self = StObject.set(x, "EditingDuration", value.asInstanceOf[js.Any])
    
    inline def setGenerator(value: String): Self = StObject.set(x, "Generator", value.asInstanceOf[js.Any])
    
    inline def setGetUserDefinedProperties(value: CallbackTo[XPropertyContainer]): Self = StObject.set(x, "getUserDefinedProperties", value.toJsFn)
    
    inline def setKeywords(value: SafeArray[String]): Self = StObject.set(x, "Keywords", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: Locale): Self = StObject.set(x, "Language", value.asInstanceOf[js.Any])
    
    inline def setLoadFromMedium(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "loadFromMedium", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setLoadFromStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "loadFromStorage", js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setModificationDate(value: DateTime): Self = StObject.set(x, "ModificationDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedBy(value: String): Self = StObject.set(x, "ModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setPrintDate(value: DateTime): Self = StObject.set(x, "PrintDate", value.asInstanceOf[js.Any])
    
    inline def setPrintedBy(value: String): Self = StObject.set(x, "PrintedBy", value.asInstanceOf[js.Any])
    
    inline def setResetUserData(value: String => Callback): Self = StObject.set(x, "resetUserData", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setStoreToMedium(value: (String, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeToMedium", js.Any.fromFunction2((t0: String, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setStoreToStorage(value: (XStorage, SeqEquiv[PropertyValue]) => Callback): Self = StObject.set(x, "storeToStorage", js.Any.fromFunction2((t0: XStorage, t1: SeqEquiv[PropertyValue]) => (value(t0, t1)).runNow()))
    
    inline def setSubject(value: String): Self = StObject.set(x, "Subject", value.asInstanceOf[js.Any])
    
    inline def setTemplateDate(value: DateTime): Self = StObject.set(x, "TemplateDate", value.asInstanceOf[js.Any])
    
    inline def setTemplateName(value: String): Self = StObject.set(x, "TemplateName", value.asInstanceOf[js.Any])
    
    inline def setTemplateURL(value: String): Self = StObject.set(x, "TemplateURL", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
    
    inline def setUserDefinedProperties(value: XPropertyContainer): Self = StObject.set(x, "UserDefinedProperties", value.asInstanceOf[js.Any])
  }
}
