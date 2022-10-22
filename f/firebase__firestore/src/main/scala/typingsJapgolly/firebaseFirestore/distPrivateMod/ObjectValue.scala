package typingsJapgolly.firebaseFirestore.distPrivateMod

import japgolly.scalajs.react.Callback
import typingsJapgolly.firebaseFirestore.anon.`52`
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ObjectValue represents a MapValue in the Firestore Proto and offers the
  * ability to add and remove fields (via the ObjectValueBuilder).
  */
trait ObjectValue extends StObject {
  
  /**
    * Modifies `fieldsMap` by adding, replacing or deleting the specified
    * entries.
    */
  /* private */ var applyChanges: Any
  
  /**
    * Removes the field at the specified path. If there is no field at the
    * specified path, nothing is changed.
    *
    * @param path - The field path to remove.
    */
  def delete(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
  ): Unit
  
  /**
    * Returns the value at the given path or null.
    *
    * @param path - the path to search
    * @returns The value at the path or null if the path is not set.
    */
  def field(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any
  ): Value | Null
  
  /**
    * Returns the map that contains the leaf element of `path`. If the parent
    * entry does not yet exist, or if it is not a map, a new map will be created.
    */
  /* private */ var getFieldsMap: Any
  
  def isEqual(other: ObjectValue): Boolean
  
  /**
    * Sets the field to the provided value.
    *
    * @param path - The field path to set.
    * @param value - The value to set.
    */
  def set(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any,
    value: Value
  ): Unit
  
  /**
    * Sets the provided fields to the provided values.
    *
    * @param data - A map of fields to values (or null for deletes).
    */
  def setAll(
    data: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, 
      Value | Null
    ]
  ): Unit
  
  val value: `52`
}
object ObjectValue {
  
  inline def apply(
    applyChanges: Any,
    delete: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any => Callback,
    field: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any => Value | Null,
    getFieldsMap: Any,
    isEqual: ObjectValue => Boolean,
    set: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, Value) => Callback,
    setAll: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, 
      Value | Null
    ] => Callback,
    value: `52`
  ): ObjectValue = {
    val __obj = js.Dynamic.literal(applyChanges = applyChanges.asInstanceOf[js.Any], delete = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any) => delete(t0).runNow()), field = js.Any.fromFunction1(field), getFieldsMap = getFieldsMap.asInstanceOf[js.Any], isEqual = js.Any.fromFunction1(isEqual), set = js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, t1: Value) => (set(t0, t1)).runNow()), setAll = js.Any.fromFunction1((t0: Map[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, 
      Value | Null
    ]) => setAll(t0).runNow()), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectValue]
  }
  
  extension [Self <: ObjectValue](x: Self) {
    
    inline def setApplyChanges(value: Any): Self = StObject.set(x, "applyChanges", value.asInstanceOf[js.Any])
    
    inline def setDelete(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any => Callback
    ): Self = StObject.set(x, "delete", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any) => value(t0).runNow()))
    
    inline def setField(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any => Value | Null
    ): Self = StObject.set(x, "field", js.Any.fromFunction1(value))
    
    inline def setGetFieldsMap(value: Any): Self = StObject.set(x, "getFieldsMap", value.asInstanceOf[js.Any])
    
    inline def setIsEqual(value: ObjectValue => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
    
    inline def setSet(
      value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, Value) => Callback
    ): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, t1: Value) => (value(t0, t1)).runNow()))
    
    inline def setSetAll(
      value: Map[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, 
          Value | Null
        ] => Callback
    ): Self = StObject.set(x, "setAll", js.Any.fromFunction1((t0: Map[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FieldPath */ Any, 
          Value | Null
        ]) => value(t0).runNow()))
    
    inline def setValue(value: `52`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
