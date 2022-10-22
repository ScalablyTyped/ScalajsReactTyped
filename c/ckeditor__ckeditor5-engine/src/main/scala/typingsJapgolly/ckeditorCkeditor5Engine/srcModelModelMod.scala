package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.Backward
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Direction
import typingsJapgolly.ckeditorCkeditor5Engine.anon.IgnoreMarkers
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelOperationOperationMod.Operation
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.PositionStickiness
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSchemaMod.Schema
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.Selectable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelModelMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/model", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Model
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable * / any */ @js.native
  trait Model extends StObject {
    
    def applyOperation(operation: Operation): Unit = js.native
    
    def change[T](
      callback: js.Function1[/* writer */ typingsJapgolly.ckeditorCkeditor5Engine.srcModelWriterMod.default, T]
    ): T = js.native
    
    def createBatch(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default = js.native
    @JSName("createBatch")
    def createBatch_0(
      `type`: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (type : @ckeditor/ckeditor5-engine.anon.IsLocal | undefined): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/batch.default>[0] */ js.Any
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default = js.native
    
    def createOperationFromJSON(arg: Record[String, Any]): Operation = js.native
    
    def createPositionAfter(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionFromPath(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default, path: js.Array[Double]): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionFromPath(
      root: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default,
      path: js.Array[Double],
      stickiness: PositionStickiness
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createRange(start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def createRange(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createRangeIn(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createRangeOn(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createSelection(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable]): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: before | end | after | on | in, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Double, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: js.Array[Selectable], placeOrOffset: Unit, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Unit, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    
    def deleteContent(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Unit = js.native
    def deleteContent(
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default,
      options: Direction
    ): Unit = js.native
    def deleteContent(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default): Unit = js.native
    def deleteContent(
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default,
      options: Direction
    ): Unit = js.native
    
    def destroy(): Unit = js.native
    
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentMod.default = js.native
    
    def enqueueChange(
      batchOrType: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default,
      callback: js.Function1[
          /* writer */ typingsJapgolly.ckeditorCkeditor5Engine.srcModelWriterMod.default, 
          Unit
        ]
    ): Unit = js.native
    def enqueueChange(
      callback: js.Function1[
          /* writer */ typingsJapgolly.ckeditorCkeditor5Engine.srcModelWriterMod.default, 
          Unit
        ]
    ): Unit = js.native
    @JSName("enqueueChange")
    def enqueueChange_0(
      batchOrType: /* import warning: importer.ImportType#apply Failed type conversion: std.ConstructorParameters<new (type : @ckeditor/ckeditor5-engine.anon.IsLocal | undefined): @ckeditor/ckeditor5-engine.@ckeditor/ckeditor5-engine/src/model/batch.default>[0] */ js.Any,
      callback: js.Function1[
          /* writer */ typingsJapgolly.ckeditorCkeditor5Engine.srcModelWriterMod.default, 
          Unit
        ]
    ): Unit = js.native
    
    def getSelectedContent(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    def getSelectedContent(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    def hasContent(rangeOrElement: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Boolean = js.native
    def hasContent(
      rangeOrElement: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default,
      options: IgnoreMarkers
    ): Boolean = js.native
    def hasContent(rangeOrElement: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Boolean = js.native
    def hasContent(
      rangeOrElement: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      options: IgnoreMarkers
    ): Boolean = js.native
    
    def insertContent(content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Unit,
      placeOrOffset: before | end | after | on | in
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Unit,
      placeOrOffset: Double
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable,
      placeOrOffset: before | end | after | on | in
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(
      content: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      selectable: Selectable,
      placeOrOffset: Double
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Unit, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Unit, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    def insertContent(content: Item, selectable: Selectable, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    val markers: typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.default = js.native
    
    def modifySelection(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default): Unit = js.native
    def modifySelection(
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentselectionMod.default,
      options: typingsJapgolly.ckeditorCkeditor5Engine.anon.Unit
    ): Unit = js.native
    def modifySelection(selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default): Unit = js.native
    def modifySelection(
      selection: typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default,
      options: typingsJapgolly.ckeditorCkeditor5Engine.anon.Unit
    ): Unit = js.native
    
    val schema: Schema = js.native
  }
}
