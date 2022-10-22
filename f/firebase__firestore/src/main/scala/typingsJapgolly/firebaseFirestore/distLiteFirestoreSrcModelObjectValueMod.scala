package typingsJapgolly.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseFirestore.anon.`18`
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelFieldMaskMod.FieldMask
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcModelPathMod.FieldPath
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.MapValue
import typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcModelObjectValueMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/object_value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/object_value", "ObjectValue")
  @js.native
  open class ObjectValue protected () extends StObject {
    def this(value: `18`) = this()
    
    /**
      * Modifies `fieldsMap` by adding, replacing or deleting the specified
      * entries.
      */
    /* private */ var applyChanges: Any = js.native
    
    /**
      * Removes the field at the specified path. If there is no field at the
      * specified path, nothing is changed.
      *
      * @param path - The field path to remove.
      */
    def delete(path: FieldPath): Unit = js.native
    
    /**
      * Returns the value at the given path or null.
      *
      * @param path - the path to search
      * @returns The value at the path or null if the path is not set.
      */
    def field(path: FieldPath): Value | Null = js.native
    
    /**
      * Returns the map that contains the leaf element of `path`. If the parent
      * entry does not yet exist, or if it is not a map, a new map will be created.
      */
    /* private */ var getFieldsMap: Any = js.native
    
    def isEqual(other: ObjectValue): Boolean = js.native
    
    /**
      * Sets the field to the provided value.
      *
      * @param path - The field path to set.
      * @param value - The value to set.
      */
    def set(path: FieldPath, value: Value): Unit = js.native
    
    /**
      * Sets the provided fields to the provided values.
      *
      * @param data - A map of fields to values (or null for deletes).
      */
    def setAll(data: Map[FieldPath, Value | Null]): Unit = js.native
    
    val value: `18` = js.native
  }
  /* static members */
  object ObjectValue {
    
    @JSImport("@firebase/firestore/dist/lite/firestore/src/model/object_value", "ObjectValue")
    @js.native
    val ^ : js.Any = js.native
    
    inline def empty(): ObjectValue = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[ObjectValue]
  }
  
  inline def extractFieldMask(value: MapValue): FieldMask = ^.asInstanceOf[js.Dynamic].applyDynamic("extractFieldMask")(value.asInstanceOf[js.Any]).asInstanceOf[FieldMask]
  
  type JsonObject[T] = StringDictionary[T]
}
