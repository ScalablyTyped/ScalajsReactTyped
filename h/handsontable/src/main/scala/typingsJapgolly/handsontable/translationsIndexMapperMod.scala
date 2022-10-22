package typingsJapgolly.handsontable

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.handsontable.handsontableInts.`-1`
import typingsJapgolly.handsontable.handsontableInts.`1`
import typingsJapgolly.handsontable.handsontableStrings.hiding
import typingsJapgolly.handsontable.handsontableStrings.insert
import typingsJapgolly.handsontable.handsontableStrings.remove
import typingsJapgolly.handsontable.handsontableStrings.replace
import typingsJapgolly.handsontable.translationsMapsIndexMapMod.IndexMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object translationsIndexMapperMod {
  
  @JSImport("handsontable/translations/indexMapper", "IndexMapper")
  @js.native
  open class IndexMapper () extends StObject {
    
    def createAndRegisterIndexMap(indexName: String, mapType: MapTypes): IndexMap[Double] = js.native
    def createAndRegisterIndexMap(indexName: String, mapType: MapTypes, initValueOrFn: Any): IndexMap[Double] = js.native
    
    @JSName("createChangesObserver")
    def createChangesObserver_hiding(indexMapType: hiding): ChangesObserver = js.native
    
    def fitToLength(length: Double): Unit = js.native
    
    def getFirstNotHiddenIndex(fromVisualIndex: Double, incrementBy: Double): Double | Null = js.native
    def getFirstNotHiddenIndex(fromVisualIndex: Double, incrementBy: Double, searchAlsoOtherWayAround: Boolean): Double | Null = js.native
    def getFirstNotHiddenIndex(
      fromVisualIndex: Double,
      incrementBy: Double,
      searchAlsoOtherWayAround: Boolean,
      indexForNextSearch: Double
    ): Double | Null = js.native
    def getFirstNotHiddenIndex(
      fromVisualIndex: Double,
      incrementBy: Double,
      searchAlsoOtherWayAround: Unit,
      indexForNextSearch: Double
    ): Double | Null = js.native
    
    def getIndexesSequence(): js.Array[Double] = js.native
    
    def getNearestNotHiddenIndex(fromVisualIndex: Double, searchDirection: `1` | `-1`): Double | Null = js.native
    def getNearestNotHiddenIndex(fromVisualIndex: Double, searchDirection: `1` | `-1`, searchAlsoOtherWayAround: Boolean): Double | Null = js.native
    
    def getNotHiddenIndexes(): js.Array[Double] = js.native
    def getNotHiddenIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getNotHiddenIndexesLength(): Double = js.native
    
    def getNotTrimmedIndexes(): js.Array[Double] = js.native
    def getNotTrimmedIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getNotTrimmedIndexesLength(): Double = js.native
    
    def getNumberOfIndexes(): Double = js.native
    
    def getPhysicalFromRenderableIndex(renderableIndex: Double): Double = js.native
    
    def getPhysicalFromVisualIndex(visualIndex: Double): Double = js.native
    
    def getRenderableFromVisualIndex(visualIndex: Double): Double = js.native
    
    def getRenderableIndexes(): js.Array[Double] = js.native
    def getRenderableIndexes(readFromCache: Boolean): js.Array[Double] = js.native
    
    def getRenderableIndexesLength(): Double = js.native
    
    def getVisualFromPhysicalIndex(physicalIndex: Double): Double = js.native
    
    def getVisualFromRenderableIndex(renderableIndex: Double): Double = js.native
    
    def initToLength(): Unit = js.native
    def initToLength(length: Double): Unit = js.native
    
    def isHidden(physicalIndex: Double): Boolean = js.native
    
    def isTrimmed(physicalIndex: Double): Boolean = js.native
    
    def moveIndexes(movedIndexes: js.Array[Double], finalIndex: Double): Unit = js.native
    def moveIndexes(movedIndexes: Double, finalIndex: Double): Unit = js.native
    
    def registerMap(uniqueName: String, indexMap: IndexMap[Double]): IndexMap[Double] = js.native
    
    def resumeOperations(): Unit = js.native
    
    def setIndexesSequence(indexes: js.Array[Double]): Unit = js.native
    
    def suspendOperations(): Unit = js.native
    
    def unregisterAll(): Unit = js.native
    
    def unregisterMap(name: String): Unit = js.native
  }
  
  trait ChangesEventData extends StObject {
    
    var index: Double
    
    var newValue: Any
    
    var oldValue: Any
    
    var op: replace | insert | remove
  }
  object ChangesEventData {
    
    inline def apply(index: Double, newValue: Any, oldValue: Any, op: replace | insert | remove): ChangesEventData = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], op = op.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangesEventData]
    }
    
    extension [Self <: ChangesEventData](x: Self) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOp(value: replace | insert | remove): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChangesObserver extends StObject {
    
    def subscribe(callback: js.Function1[/* changes */ js.Array[ChangesEventData], Unit]): ChangesObserver
    
    def unsubscribe(): ChangesObserver
  }
  object ChangesObserver {
    
    inline def apply(
      subscribe: js.Function1[/* changes */ js.Array[ChangesEventData], Unit] => ChangesObserver,
      unsubscribe: CallbackTo[ChangesObserver]
    ): ChangesObserver = {
      val __obj = js.Dynamic.literal(subscribe = js.Any.fromFunction1(subscribe), unsubscribe = unsubscribe.toJsFn)
      __obj.asInstanceOf[ChangesObserver]
    }
    
    extension [Self <: ChangesObserver](x: Self) {
      
      inline def setSubscribe(value: js.Function1[/* changes */ js.Array[ChangesEventData], Unit] => ChangesObserver): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setUnsubscribe(value: CallbackTo[ChangesObserver]): Self = StObject.set(x, "unsubscribe", value.toJsFn)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.handsontable.handsontableStrings.hidden
    - typingsJapgolly.handsontable.handsontableStrings.index
    - typingsJapgolly.handsontable.handsontableStrings.linkedPhysicalIndexToValue
    - typingsJapgolly.handsontable.handsontableStrings.physicalIndexToValue
    - typingsJapgolly.handsontable.handsontableStrings.trimming
  */
  trait MapTypes extends StObject
  object MapTypes {
    
    inline def hidden: typingsJapgolly.handsontable.handsontableStrings.hidden = "hidden".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.hidden]
    
    inline def index: typingsJapgolly.handsontable.handsontableStrings.index = "index".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.index]
    
    inline def linkedPhysicalIndexToValue: typingsJapgolly.handsontable.handsontableStrings.linkedPhysicalIndexToValue = "linkedPhysicalIndexToValue".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.linkedPhysicalIndexToValue]
    
    inline def physicalIndexToValue: typingsJapgolly.handsontable.handsontableStrings.physicalIndexToValue = "physicalIndexToValue".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.physicalIndexToValue]
    
    inline def trimming: typingsJapgolly.handsontable.handsontableStrings.trimming = "trimming".asInstanceOf[typingsJapgolly.handsontable.handsontableStrings.trimming]
  }
}
