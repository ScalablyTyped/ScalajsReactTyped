package typingsJapgolly.reactNativeFirebase.mod.RNFirebase.firestore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`null`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`object`
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.array
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.asc_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.boolean
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.cache
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.date
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.default
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.desc_
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.documentid
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.fieldvalue
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.geopoint
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.number
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.reference
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.server
import typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Types {
  
  trait GetOptions extends StObject {
    
    var source: default | server | cache
  }
  object GetOptions {
    
    inline def apply(source: default | server | cache): GetOptions = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOptions]
    }
    
    extension [Self <: GetOptions](x: Self) {
      
      inline def setSource(value: default | server | cache): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeDocumentChange extends StObject {
    
    var document: NativeDocumentSnapshot
    
    var newIndex: Double
    
    var oldIndex: Double
    
    var `type`: String
  }
  object NativeDocumentChange {
    
    inline def apply(document: NativeDocumentSnapshot, newIndex: Double, oldIndex: Double, `type`: String): NativeDocumentChange = {
      val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentChange]
    }
    
    extension [Self <: NativeDocumentChange](x: Self) {
      
      inline def setDocument(value: NativeDocumentSnapshot): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
      
      inline def setNewIndex(value: Double): Self = StObject.set(x, "newIndex", value.asInstanceOf[js.Any])
      
      inline def setOldIndex(value: Double): Self = StObject.set(x, "oldIndex", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeDocumentSnapshot extends StObject {
    
    var data: StringDictionary[TypeMap]
    
    var metadata: SnapshotMetadata
    
    var path: String
  }
  object NativeDocumentSnapshot {
    
    inline def apply(data: StringDictionary[TypeMap], metadata: SnapshotMetadata, path: String): NativeDocumentSnapshot = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeDocumentSnapshot]
    }
    
    extension [Self <: NativeDocumentSnapshot](x: Self) {
      
      inline def setData(value: StringDictionary[TypeMap]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: SnapshotMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.asc_
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ASC
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.desc_
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DESC
  */
  trait QueryDirection extends StObject
  object QueryDirection {
    
    inline def ASC: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ASC = "ASC".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.ASC]
    
    inline def DESC: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DESC = "DESC".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.DESC]
    
    inline def asc: asc_ = "asc".asInstanceOf[asc_]
    
    inline def desc: desc_ = "desc".asInstanceOf[desc_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign
    - typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`
  */
  trait QueryOperator extends StObject
  object QueryOperator {
    
    inline def Equalssign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign = "=".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Equalssign]
    
    inline def EqualssignEqualssign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign = "==".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.EqualssignEqualssign]
    
    inline def Greaterthansign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign = ">".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Greaterthansign]
    
    inline def GreaterthansignEqualssign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign = ">=".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.GreaterthansignEqualssign]
    
    inline def Lessthansign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign = "<".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.Lessthansign]
    
    inline def LessthansignEqualssign: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign = "<=".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.LessthansignEqualssign]
    
    inline def `array-contains`: typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains` = "array-contains".asInstanceOf[typingsJapgolly.reactNativeFirebase.reactNativeFirebaseStrings.`array-contains`]
  }
  
  trait SetOptions extends StObject {
    
    var merge: js.UndefOr[Boolean] = js.undefined
  }
  object SetOptions {
    
    inline def apply(): SetOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SetOptions]
    }
    
    extension [Self <: SetOptions](x: Self) {
      
      inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
      
      inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    }
  }
  
  trait SnapshotMetadata extends StObject {
    
    var fromCache: Boolean
    
    var hasPendingWrites: Boolean
  }
  object SnapshotMetadata {
    
    inline def apply(fromCache: Boolean, hasPendingWrites: Boolean): SnapshotMetadata = {
      val __obj = js.Dynamic.literal(fromCache = fromCache.asInstanceOf[js.Any], hasPendingWrites = hasPendingWrites.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnapshotMetadata]
    }
    
    extension [Self <: SnapshotMetadata](x: Self) {
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setHasPendingWrites(value: Boolean): Self = StObject.set(x, "hasPendingWrites", value.asInstanceOf[js.Any])
    }
  }
  
  trait TypeMap extends StObject {
    
    var `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
    
    var value: Any
  }
  object TypeMap {
    
    inline def apply(
      `type`: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string,
      value: Any
    ): TypeMap = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeMap]
    }
    
    extension [Self <: TypeMap](x: Self) {
      
      inline def setType(
        value: array | boolean | date | documentid | fieldvalue | geopoint | `null` | number | `object` | reference | string
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** The key in update() function for DocumentReference and WriteBatch. */
  type UpdateKey = String | FieldPath
}
