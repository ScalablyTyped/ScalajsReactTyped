package typingsJapgolly.sharepoint.SP.Utilities

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Set extends StObject {
  
  /** Adds an item to the set */
  def Add(item: Any): Any
  
  /** Adds all items from array to the set, and returns the set */
  def AddArray(array: js.Array[Any]): Set
  
  /** Clears all the items from set */
  def Clear(): Set
  
  /** Returns a copy of this set */
  def Clone(): Set
  
  /** Returns true if item exists in this set */
  def Contains(item: Any): Boolean
  
  /** Returns a set that contains all the items that are in this set but not in the otherSet */
  def Difference(otherSet: Set): Set
  
  /** Returns first item in the set */
  def First(): Any
  
  /** Returns the underlying collection of items as dictionary.
    Items are the keys, and values are always 1.
    So the return value may be either { [item: string]: number } or { [item: number]: number } */
  def GetCollection(): Any
  
  /** Returns a new set, that contains only items that exist both in this set and the otherSet */
  def Intersection(otherSet: Set): Set
  
  /** Returns true if the set is empty */
  def IsEmpty(): Boolean
  
  /** Removes the specified item from the set and returns the removed item */
  def Remove(item: Any): Any
  
  /** Returns a set that contains all the items that exist only in one of the sets (this and other), but not in both */
  def SymmetricDifference(otherSet: Set): Set
  
  /** Returns all items from the set as an array */
  def ToArray(): js.Array[Any]
  
  /** Returns a new set, that contains items from this set and otherSet */
  def Union(otherSet: Set): Set
  
  /** Adds all items from otherSet to this set, and returns this set */
  def UnionWith(otherSet: Set): Set
}
object Set {
  
  inline def apply(
    Add: Any => Any,
    AddArray: js.Array[Any] => Set,
    Clear: CallbackTo[Set],
    Clone: CallbackTo[Set],
    Contains: Any => Boolean,
    Difference: Set => Set,
    First: CallbackTo[Any],
    GetCollection: CallbackTo[Any],
    Intersection: Set => Set,
    IsEmpty: CallbackTo[Boolean],
    Remove: Any => Any,
    SymmetricDifference: Set => Set,
    ToArray: CallbackTo[js.Array[Any]],
    Union: Set => Set,
    UnionWith: Set => Set
  ): Set = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), AddArray = js.Any.fromFunction1(AddArray), Clear = Clear.toJsFn, Clone = Clone.toJsFn, Contains = js.Any.fromFunction1(Contains), Difference = js.Any.fromFunction1(Difference), First = First.toJsFn, GetCollection = GetCollection.toJsFn, Intersection = js.Any.fromFunction1(Intersection), IsEmpty = IsEmpty.toJsFn, Remove = js.Any.fromFunction1(Remove), SymmetricDifference = js.Any.fromFunction1(SymmetricDifference), ToArray = ToArray.toJsFn, Union = js.Any.fromFunction1(Union), UnionWith = js.Any.fromFunction1(UnionWith))
    __obj.asInstanceOf[Set]
  }
  
  extension [Self <: Set](x: Self) {
    
    inline def setAdd(value: Any => Any): Self = StObject.set(x, "Add", js.Any.fromFunction1(value))
    
    inline def setAddArray(value: js.Array[Any] => Set): Self = StObject.set(x, "AddArray", js.Any.fromFunction1(value))
    
    inline def setClear(value: CallbackTo[Set]): Self = StObject.set(x, "Clear", value.toJsFn)
    
    inline def setClone(value: CallbackTo[Set]): Self = StObject.set(x, "Clone", value.toJsFn)
    
    inline def setContains(value: Any => Boolean): Self = StObject.set(x, "Contains", js.Any.fromFunction1(value))
    
    inline def setDifference(value: Set => Set): Self = StObject.set(x, "Difference", js.Any.fromFunction1(value))
    
    inline def setFirst(value: CallbackTo[Any]): Self = StObject.set(x, "First", value.toJsFn)
    
    inline def setGetCollection(value: CallbackTo[Any]): Self = StObject.set(x, "GetCollection", value.toJsFn)
    
    inline def setIntersection(value: Set => Set): Self = StObject.set(x, "Intersection", js.Any.fromFunction1(value))
    
    inline def setIsEmpty(value: CallbackTo[Boolean]): Self = StObject.set(x, "IsEmpty", value.toJsFn)
    
    inline def setRemove(value: Any => Any): Self = StObject.set(x, "Remove", js.Any.fromFunction1(value))
    
    inline def setSymmetricDifference(value: Set => Set): Self = StObject.set(x, "SymmetricDifference", js.Any.fromFunction1(value))
    
    inline def setToArray(value: CallbackTo[js.Array[Any]]): Self = StObject.set(x, "ToArray", value.toJsFn)
    
    inline def setUnion(value: Set => Set): Self = StObject.set(x, "Union", js.Any.fromFunction1(value))
    
    inline def setUnionWith(value: Set => Set): Self = StObject.set(x, "UnionWith", js.Any.fromFunction1(value))
  }
}
