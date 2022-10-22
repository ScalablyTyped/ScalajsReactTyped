package typingsJapgolly.activexLibreoffice.com_.sun.star.embed

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.LibreOffice.SeqEquiv
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.beans.StringPair
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import typingsJapgolly.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This interface allows to get access to relationship data.
  *
  * The relationship data is organized as a set of entries. Each of entry is represented by a set of tags, where each tag has unique for this entry name
  * and a string value. An entry must contain at least one tag named "ID", the value of this tag must be unique for the whole set of entries, this tag is
  * used as a unique identifier of an entry.
  */
trait XRelationshipAccess
  extends StObject
     with XInterface {
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  val AllRelationships: SafeArray[SafeArray[StringPair]]
  
  /**
    * allows to clear the set of entries.
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def clearRelationships(): Unit
  
  /**
    * retrieves the sequence containing all the entries controlled by the object.
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getAllRelationships(): SafeArray[SafeArray[StringPair]]
  
  /**
    * retrieves the sequence containing all the tags from the entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @returns sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link com.sun.sta
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipByID(sID: String): SafeArray[StringPair]
  
  /**
    * retrieves the sequence containing all the entries which "Type" tag takes the specified value.
    * @param sType specified value of "Type" tag, the parameter can contain an empty string, in this case all the entries that have empty "Type" tag or no suc
    * @returns sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.Fir
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getRelationshipsByType(sType: String): SafeArray[SafeArray[StringPair]]
  
  /**
    * retrieves the value of "Target" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Target" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTargetByID(sID: String): String
  
  /**
    * retrieves the value of "Type" tag from the entry with specified "ID" tag.
    *
    * If the entry has no "Type" tag an empty string is returned.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def getTypeByID(sID: String): String
  
  /**
    * allows to detect whether there is an entry with specified value of "ID" tag.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::io::IOException in case there is a problem reading the relations info
    */
  def hasByID(sID: String): Boolean
  
  /**
    * allows to insert an entry.
    * @param sID the value of "ID" tag
    * @param aEntry a sequence, each element of the sequence represents tag, {@link com.sun.star.beans.StringPair.First} represents the tag name and {@link co
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    * @throws com::sun::star::container::ElementExistException in case an element with the specified "ID" tag exists already, and no replacement is allowed
    */
  def insertRelationshipByID(sID: String, aEntry: SeqEquiv[StringPair], bReplace: Boolean): Unit
  
  /**
    * allows to insert a set of entries
    * @param aEntries sequence of entries, each entry is represented by sequence, each element of the sequence represents tag, {@link com.sun.star.beans.Strin
    * @param bReplace specifies whether the replacement of existing entry is allowed
    * @throws com::sun::star::container::ElementExistException in case an element with the provided "ID" tag exists already, and no replacement is allowed
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def insertRelationships(aEntries: SeqEquiv[SeqEquiv[StringPair]], bReplace: Boolean): Unit
  
  /**
    * allows to remove an entry.
    * @param sID the value of "ID" tag
    * @throws com::sun::star::container::NoSuchElementException in case there is no entry with specified tag
    * @throws com::sun::star::io::IOException in case there is a problem reading/writing the relations info
    */
  def removeRelationshipByID(sID: String): Unit
}
object XRelationshipAccess {
  
  inline def apply(
    AllRelationships: SafeArray[SafeArray[StringPair]],
    acquire: Callback,
    clearRelationships: Callback,
    getAllRelationships: CallbackTo[SafeArray[SafeArray[StringPair]]],
    getRelationshipByID: String => SafeArray[StringPair],
    getRelationshipsByType: String => SafeArray[SafeArray[StringPair]],
    getTargetByID: String => String,
    getTypeByID: String => String,
    hasByID: String => Boolean,
    insertRelationshipByID: (String, SeqEquiv[StringPair], Boolean) => Callback,
    insertRelationships: (SeqEquiv[SeqEquiv[StringPair]], Boolean) => Callback,
    queryInterface: `type` => Any,
    release: Callback,
    removeRelationshipByID: String => Callback
  ): XRelationshipAccess = {
    val __obj = js.Dynamic.literal(AllRelationships = AllRelationships.asInstanceOf[js.Any], acquire = acquire.toJsFn, clearRelationships = clearRelationships.toJsFn, getAllRelationships = getAllRelationships.toJsFn, getRelationshipByID = js.Any.fromFunction1(getRelationshipByID), getRelationshipsByType = js.Any.fromFunction1(getRelationshipsByType), getTargetByID = js.Any.fromFunction1(getTargetByID), getTypeByID = js.Any.fromFunction1(getTypeByID), hasByID = js.Any.fromFunction1(hasByID), insertRelationshipByID = js.Any.fromFunction3((t0: String, t1: SeqEquiv[StringPair], t2: Boolean) => (insertRelationshipByID(t0, t1, t2)).runNow()), insertRelationships = js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[StringPair]], t1: Boolean) => (insertRelationships(t0, t1)).runNow()), queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn, removeRelationshipByID = js.Any.fromFunction1((t0: String) => removeRelationshipByID(t0).runNow()))
    __obj.asInstanceOf[XRelationshipAccess]
  }
  
  extension [Self <: XRelationshipAccess](x: Self) {
    
    inline def setAllRelationships(value: SafeArray[SafeArray[StringPair]]): Self = StObject.set(x, "AllRelationships", value.asInstanceOf[js.Any])
    
    inline def setClearRelationships(value: Callback): Self = StObject.set(x, "clearRelationships", value.toJsFn)
    
    inline def setGetAllRelationships(value: CallbackTo[SafeArray[SafeArray[StringPair]]]): Self = StObject.set(x, "getAllRelationships", value.toJsFn)
    
    inline def setGetRelationshipByID(value: String => SafeArray[StringPair]): Self = StObject.set(x, "getRelationshipByID", js.Any.fromFunction1(value))
    
    inline def setGetRelationshipsByType(value: String => SafeArray[SafeArray[StringPair]]): Self = StObject.set(x, "getRelationshipsByType", js.Any.fromFunction1(value))
    
    inline def setGetTargetByID(value: String => String): Self = StObject.set(x, "getTargetByID", js.Any.fromFunction1(value))
    
    inline def setGetTypeByID(value: String => String): Self = StObject.set(x, "getTypeByID", js.Any.fromFunction1(value))
    
    inline def setHasByID(value: String => Boolean): Self = StObject.set(x, "hasByID", js.Any.fromFunction1(value))
    
    inline def setInsertRelationshipByID(value: (String, SeqEquiv[StringPair], Boolean) => Callback): Self = StObject.set(x, "insertRelationshipByID", js.Any.fromFunction3((t0: String, t1: SeqEquiv[StringPair], t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setInsertRelationships(value: (SeqEquiv[SeqEquiv[StringPair]], Boolean) => Callback): Self = StObject.set(x, "insertRelationships", js.Any.fromFunction2((t0: SeqEquiv[SeqEquiv[StringPair]], t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setRemoveRelationshipByID(value: String => Callback): Self = StObject.set(x, "removeRelationshipByID", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
