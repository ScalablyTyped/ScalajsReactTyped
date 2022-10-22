package typingsJapgolly.activexLibreoffice.com_.sun.star.accessibility

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.activexLibreoffice.`type`
import typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
import typingsJapgolly.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Implement this interface for exposing various aspects of a class's content.
  *
  * This interface serves two purposes: On the one hand it gives access to the tree structure in which all accessible objects are organized. Each node in
  * this tree supports this interface. On the other hand it gives access to objects that expose the represented content. That are role, state, name,
  * description, and relations to other objects. Take an OK button of a dialog as an example. Its role is AccessibleRole::BUTTON, its name is "OK", and
  * its description is something like "Accepts all changes made in the dialog".
  * @since OOo 1.1.2
  */
trait XAccessibleContext
  extends StObject
     with XInterface {
  
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  val AccessibleChildCount: Double
  
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  val AccessibleDescription: String
  
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  val AccessibleIndexInParent: Double
  
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  val AccessibleName: String
  
  /**
    * Returns the parent of this object.
    *
    * This function may be called for every node, including the root node, of the accessible tree.
    * @returns The returned reference points to a valid object for all but the root node. If called for the root node an empty reference is returned.
    */
  val AccessibleParent: XAccessible
  
  /**
    * Returns the set of relations defined for this object.
    *
    * The returned set of relations is a copy of this object's relation set: changing the returned object does not change this object's relations.
    *
    * There are two ways to represent an empty list of relations: Return an empty reference or return a valid object that contains an empty list.
    * @returns The returned value is either an empty reference or a reference to a valid object that represents a copy of the objects list of relations.
    */
  val AccessibleRelationSet: XAccessibleRelationSet
  
  /**
    * Returns the role of this object.
    *
    * The role is a generic description of an objects function. The relation between role and name is similar to the relation between class and object.
    * @returns The returned value is a role defined in the enumeration {@link AccessibleRole} .
    * @see AccessibleRole for a list of the available roles.
    */
  val AccessibleRole: Double
  
  /**
    * Returns the set of states that are currently active for this object.
    *
    * The returned state set is a copy: Changing the returned state set will not be reflected by changing the object's set of states. See the documentation
    * of {@link XAccessibleStateSet} for a description of the individual states.
    * @returns A reference to this object's state set or an empty reference if states are not supported.
    * @see XAccessibleStateSet
    */
  val AccessibleStateSet: XAccessibleStateSet
  
  /**
    * Returns the locale of the component.
    *
    * This locale is used for example to determine the language to use for the name and description texts.
    * @returns If this object does not have a locale, the locale of its parent is returned. If it does not have (yet) a parent it throws the exception {@link Il
    * @throws IllegalAccessibleComponentStateException when this object does not (yet) have a parent.
    */
  val Locale: typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
  
  /**
    * Returns the i-th child of this object.
    *
    * The order in which the children are enumerated is implementation dependent.
    * @param i The index may have any value. If it is outside the range from 0 to n-1, with n being the number of children as returned by {@link XAccessibleCo
    * @returns If the object has an i-th child the returned value is a reference to that child. Otherwise an empty reference is returned.
    * @throws com::sun::star::lang::IndexOutOfBoundsException If no child with the given index exists then an {@link com.sun.star.lang.IndexOutOfBoundsExceptio
    */
  def getAccessibleChild(i: Double): XAccessible
  
  /**
    * Return the number of children.
    *
    * Returns the number of accessible children of the object.
    * @returns The returned value is non-negative.
    */
  def getAccessibleChildCount(): Double
  
  /**
    * Returns the object's description.
    *
    * Returns the object's localized description. The description should complement the more generic descriptions given by an object's role and name.
    * @returns The returned string is the object's localized description.
    */
  def getAccessibleDescription(): String
  
  /**
    * Returns the index of this object in its accessible parent.
    *
    * If you call getAccessibeChild on the object's parent with the index returned by this function you get a reference to this object.
    * @returns The returned index is zero based.
    */
  def getAccessibleIndexInParent(): Double
  
  /**
    * Return the object's localized name.
    *
    * See {@link XAccessibleContext.getAccessibleRole()} 's documentation for the relation between an object's name and role. Names should be unique, at
    * least between children of the same parent, although the uniqueness is neither enforced nor used inside the API.
    * @returns The returned string is the object's localized name.
    */
  def getAccessibleName(): String
  
  /**
    * Returns the parent of this object.
    *
    * This function may be called for every node, including the root node, of the accessible tree.
    * @returns The returned reference points to a valid object for all but the root node. If called for the root node an empty reference is returned.
    */
  def getAccessibleParent(): XAccessible
  
  /**
    * Returns the set of relations defined for this object.
    *
    * The returned set of relations is a copy of this object's relation set: changing the returned object does not change this object's relations.
    *
    * There are two ways to represent an empty list of relations: Return an empty reference or return a valid object that contains an empty list.
    * @returns The returned value is either an empty reference or a reference to a valid object that represents a copy of the objects list of relations.
    */
  def getAccessibleRelationSet(): XAccessibleRelationSet
  
  /**
    * Returns the role of this object.
    *
    * The role is a generic description of an objects function. The relation between role and name is similar to the relation between class and object.
    * @returns The returned value is a role defined in the enumeration {@link AccessibleRole} .
    * @see AccessibleRole for a list of the available roles.
    */
  def getAccessibleRole(): Double
  
  /**
    * Returns the set of states that are currently active for this object.
    *
    * The returned state set is a copy: Changing the returned state set will not be reflected by changing the object's set of states. See the documentation
    * of {@link XAccessibleStateSet} for a description of the individual states.
    * @returns A reference to this object's state set or an empty reference if states are not supported.
    * @see XAccessibleStateSet
    */
  def getAccessibleStateSet(): XAccessibleStateSet
  
  /**
    * Returns the locale of the component.
    *
    * This locale is used for example to determine the language to use for the name and description texts.
    * @returns If this object does not have a locale, the locale of its parent is returned. If it does not have (yet) a parent it throws the exception {@link Il
    * @throws IllegalAccessibleComponentStateException when this object does not (yet) have a parent.
    */
  def getLocale(): typingsJapgolly.activexLibreoffice.com_.sun.star.lang.Locale
}
object XAccessibleContext {
  
  inline def apply(
    AccessibleChildCount: Double,
    AccessibleDescription: String,
    AccessibleIndexInParent: Double,
    AccessibleName: String,
    AccessibleParent: XAccessible,
    AccessibleRelationSet: XAccessibleRelationSet,
    AccessibleRole: Double,
    AccessibleStateSet: XAccessibleStateSet,
    Locale: Locale,
    acquire: Callback,
    getAccessibleChild: Double => XAccessible,
    getAccessibleChildCount: CallbackTo[Double],
    getAccessibleDescription: CallbackTo[String],
    getAccessibleIndexInParent: CallbackTo[Double],
    getAccessibleName: CallbackTo[String],
    getAccessibleParent: CallbackTo[XAccessible],
    getAccessibleRelationSet: CallbackTo[XAccessibleRelationSet],
    getAccessibleRole: CallbackTo[Double],
    getAccessibleStateSet: CallbackTo[XAccessibleStateSet],
    getLocale: CallbackTo[Locale],
    queryInterface: `type` => Any,
    release: Callback
  ): XAccessibleContext = {
    val __obj = js.Dynamic.literal(AccessibleChildCount = AccessibleChildCount.asInstanceOf[js.Any], AccessibleDescription = AccessibleDescription.asInstanceOf[js.Any], AccessibleIndexInParent = AccessibleIndexInParent.asInstanceOf[js.Any], AccessibleName = AccessibleName.asInstanceOf[js.Any], AccessibleParent = AccessibleParent.asInstanceOf[js.Any], AccessibleRelationSet = AccessibleRelationSet.asInstanceOf[js.Any], AccessibleRole = AccessibleRole.asInstanceOf[js.Any], AccessibleStateSet = AccessibleStateSet.asInstanceOf[js.Any], Locale = Locale.asInstanceOf[js.Any], acquire = acquire.toJsFn, getAccessibleChild = js.Any.fromFunction1(getAccessibleChild), getAccessibleChildCount = getAccessibleChildCount.toJsFn, getAccessibleDescription = getAccessibleDescription.toJsFn, getAccessibleIndexInParent = getAccessibleIndexInParent.toJsFn, getAccessibleName = getAccessibleName.toJsFn, getAccessibleParent = getAccessibleParent.toJsFn, getAccessibleRelationSet = getAccessibleRelationSet.toJsFn, getAccessibleRole = getAccessibleRole.toJsFn, getAccessibleStateSet = getAccessibleStateSet.toJsFn, getLocale = getLocale.toJsFn, queryInterface = js.Any.fromFunction1(queryInterface), release = release.toJsFn)
    __obj.asInstanceOf[XAccessibleContext]
  }
  
  extension [Self <: XAccessibleContext](x: Self) {
    
    inline def setAccessibleChildCount(value: Double): Self = StObject.set(x, "AccessibleChildCount", value.asInstanceOf[js.Any])
    
    inline def setAccessibleDescription(value: String): Self = StObject.set(x, "AccessibleDescription", value.asInstanceOf[js.Any])
    
    inline def setAccessibleIndexInParent(value: Double): Self = StObject.set(x, "AccessibleIndexInParent", value.asInstanceOf[js.Any])
    
    inline def setAccessibleName(value: String): Self = StObject.set(x, "AccessibleName", value.asInstanceOf[js.Any])
    
    inline def setAccessibleParent(value: XAccessible): Self = StObject.set(x, "AccessibleParent", value.asInstanceOf[js.Any])
    
    inline def setAccessibleRelationSet(value: XAccessibleRelationSet): Self = StObject.set(x, "AccessibleRelationSet", value.asInstanceOf[js.Any])
    
    inline def setAccessibleRole(value: Double): Self = StObject.set(x, "AccessibleRole", value.asInstanceOf[js.Any])
    
    inline def setAccessibleStateSet(value: XAccessibleStateSet): Self = StObject.set(x, "AccessibleStateSet", value.asInstanceOf[js.Any])
    
    inline def setGetAccessibleChild(value: Double => XAccessible): Self = StObject.set(x, "getAccessibleChild", js.Any.fromFunction1(value))
    
    inline def setGetAccessibleChildCount(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleChildCount", value.toJsFn)
    
    inline def setGetAccessibleDescription(value: CallbackTo[String]): Self = StObject.set(x, "getAccessibleDescription", value.toJsFn)
    
    inline def setGetAccessibleIndexInParent(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleIndexInParent", value.toJsFn)
    
    inline def setGetAccessibleName(value: CallbackTo[String]): Self = StObject.set(x, "getAccessibleName", value.toJsFn)
    
    inline def setGetAccessibleParent(value: CallbackTo[XAccessible]): Self = StObject.set(x, "getAccessibleParent", value.toJsFn)
    
    inline def setGetAccessibleRelationSet(value: CallbackTo[XAccessibleRelationSet]): Self = StObject.set(x, "getAccessibleRelationSet", value.toJsFn)
    
    inline def setGetAccessibleRole(value: CallbackTo[Double]): Self = StObject.set(x, "getAccessibleRole", value.toJsFn)
    
    inline def setGetAccessibleStateSet(value: CallbackTo[XAccessibleStateSet]): Self = StObject.set(x, "getAccessibleStateSet", value.toJsFn)
    
    inline def setGetLocale(value: CallbackTo[Locale]): Self = StObject.set(x, "getLocale", value.toJsFn)
    
    inline def setLocale(value: Locale): Self = StObject.set(x, "Locale", value.asInstanceOf[js.Any])
  }
}
