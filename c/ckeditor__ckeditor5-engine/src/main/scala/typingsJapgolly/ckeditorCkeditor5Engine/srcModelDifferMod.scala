package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.IncludeChangesInGraveyard
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.attribute
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.insert
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.remove
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.Marker
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelDifferMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Differ {
    def this(markerCollection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default) = this()
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemAttribute")
  @js.native
  open class DiffItemAttribute ()
    extends StObject
       with DiffItem {
    
    var attributeKey: String = js.native
    
    var attributeNewValue: String = js.native
    
    var attributeOldValue: String = js.native
    
    var range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    var `type`: attribute = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemInsert")
  @js.native
  open class DiffItemInsert ()
    extends StObject
       with DiffItem {
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    var `type`: insert = js.native
  }
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/differ", "DiffItemRemove")
  @js.native
  open class DiffItemRemove ()
    extends StObject
       with DiffItem {
    
    var length: Double = js.native
    
    var name: String = js.native
    
    var position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    var `type`: remove = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelDifferMod.DiffItemInsert
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelDifferMod.DiffItemRemove
    - typingsJapgolly.ckeditorCkeditor5Engine.srcModelDifferMod.DiffItemAttribute
  */
  trait DiffItem extends StObject
  
  @js.native
  trait Differ extends StObject {
    
    def bufferMarkerChange(markerName: String, oldRange: Null, newRange: Null, affectsData: Boolean): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: Null,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      affectsData: Boolean
    ): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: Null,
      affectsData: Boolean
    ): Unit = js.native
    def bufferMarkerChange(
      markerName: String,
      oldRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      newRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      affectsData: Boolean
    ): Unit = js.native
    
    def bufferOperation(operation: Operation): Unit = js.native
    
    def getChangedMarkers(): js.Array[Marker] = js.native
    
    def getChanges(): js.Array[DiffItem] = js.native
    def getChanges(options: IncludeChangesInGraveyard): js.Array[DiffItem] = js.native
    
    def getMarkersToAdd(): js.Array[Marker] = js.native
    
    def getMarkersToRemove(): js.Array[Marker] = js.native
    
    def hasDataChanges(): Boolean = js.native
    
    val isEmpty: Boolean = js.native
    
    def refreshItem(item: Item): Unit = js.native
    
    def reset(): Unit = js.native
  }
}
