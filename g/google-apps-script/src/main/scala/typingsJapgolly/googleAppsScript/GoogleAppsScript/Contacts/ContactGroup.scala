package typingsJapgolly.googleAppsScript.GoogleAppsScript.Contacts

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A ContactGroup is is a group of contacts.
  */
trait ContactGroup extends StObject {
  
  def addContact(contact: Contact): ContactGroup
  
  def deleteGroup(): Unit
  
  def getContacts(): js.Array[Contact]
  
  /** @deprecated DO NOT USE */ def getGroupName(): String
  
  def getId(): String
  
  def getName(): String
  
  def isSystemGroup(): Boolean
  
  def removeContact(contact: Contact): ContactGroup
  
  /** @deprecated DO NOT USE */ def setGroupName(name: String): Unit
  
  def setName(name: String): ContactGroup
}
object ContactGroup {
  
  inline def apply(
    addContact: Contact => ContactGroup,
    deleteGroup: Callback,
    getContacts: CallbackTo[js.Array[Contact]],
    getGroupName: CallbackTo[String],
    getId: CallbackTo[String],
    getName: CallbackTo[String],
    isSystemGroup: CallbackTo[Boolean],
    removeContact: Contact => ContactGroup,
    setGroupName: String => Callback,
    setName: String => ContactGroup
  ): ContactGroup = {
    val __obj = js.Dynamic.literal(addContact = js.Any.fromFunction1(addContact), deleteGroup = deleteGroup.toJsFn, getContacts = getContacts.toJsFn, getGroupName = getGroupName.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, isSystemGroup = isSystemGroup.toJsFn, removeContact = js.Any.fromFunction1(removeContact), setGroupName = js.Any.fromFunction1((t0: String) => setGroupName(t0).runNow()), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[ContactGroup]
  }
  
  extension [Self <: ContactGroup](x: Self) {
    
    inline def setAddContact(value: Contact => ContactGroup): Self = StObject.set(x, "addContact", js.Any.fromFunction1(value))
    
    inline def setDeleteGroup(value: Callback): Self = StObject.set(x, "deleteGroup", value.toJsFn)
    
    inline def setGetContacts(value: CallbackTo[js.Array[Contact]]): Self = StObject.set(x, "getContacts", value.toJsFn)
    
    inline def setGetGroupName(value: CallbackTo[String]): Self = StObject.set(x, "getGroupName", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[String]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setIsSystemGroup(value: CallbackTo[Boolean]): Self = StObject.set(x, "isSystemGroup", value.toJsFn)
    
    inline def setRemoveContact(value: Contact => ContactGroup): Self = StObject.set(x, "removeContact", js.Any.fromFunction1(value))
    
    inline def setSetGroupName(value: String => Callback): Self = StObject.set(x, "setGroupName", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setSetName(value: String => ContactGroup): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
