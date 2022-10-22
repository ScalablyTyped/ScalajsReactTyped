package typingsJapgolly.ckeditorCkeditor5Engine

import typingsJapgolly.ckeditorCkeditor5Engine.anon.Backward
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Position
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Range
import typingsJapgolly.ckeditorCkeditor5Engine.anon.UsingOperation
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelMarkercollectionMod.Marker
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelModelMod.Model
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.PositionStickiness
import typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.Selectable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcModelWriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/model/writer", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with Writer
  
  @js.native
  trait Writer extends StObject {
    
    def addMarker(name: String): Marker = js.native
    def addMarker(name: String, options: Range): Marker = js.native
    
    def append(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
    ): Unit = js.native
    def append(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Unit = js.native
    def append(item: Item, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): Unit = js.native
    def append(item: Item, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Unit = js.native
    
    def appendElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
    ): Unit = js.native
    def appendElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Unit = js.native
    def appendElement(name: String, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): Unit = js.native
    def appendElement(name: String, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Unit = js.native
    
    def appendText(
      text: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default
    ): Unit = js.native
    def appendText(
      text: String,
      attributes: Record[String, String | Double | Boolean],
      parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Unit = js.native
    def appendText(text: String, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): Unit = js.native
    def appendText(text: String, parent: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Unit = js.native
    
    val batch: typingsJapgolly.ckeditorCkeditor5Engine.srcModelBatchMod.default = js.native
    
    def clearAttributes(itemOrRange: Item): Unit = js.native
    def clearAttributes(itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Unit = js.native
    
    def cloneElement(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    def cloneElement(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default, deep: Boolean): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    
    def createDocumentFragment(): typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default = js.native
    
    def createElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    def createElement(name: String, attributes: Record[String, String | Double | Boolean]): typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default = js.native
    
    def createPositionAfter(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      offset: end | before | after
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
    def createPositionAt(
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      offset: Double
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default = js.native
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
    
    def createRangeOn(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default = js.native
    
    def createSelection(selectable: Selectable): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): typingsJapgolly.ckeditorCkeditor5Engine.srcModelSelectionMod.default = js.native
    
    def createText(data: String): typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default = js.native
    def createText(data: String, attributes: Record[String, String | Double | Boolean]): typingsJapgolly.ckeditorCkeditor5Engine.srcModelTextMod.default = js.native
    
    def insert(item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: Item
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: typingsJapgolly.ckeditorCkeditor5Engine.srcModelDocumentfragmentMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    def insert(item: Item): Unit = js.native
    def insert(item: Item, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insert(item: Item, itemOrPosition: Null, offset: Double): Unit = js.native
    def insert(item: Item, itemOrPosition: Item): Unit = js.native
    def insert(item: Item, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insert(item: Item, itemOrPosition: Item, offset: Double): Unit = js.native
    def insert(item: Item, itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    def insert(
      item: Item,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insert(
      item: Item,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    
    def insertElement(name: String): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertElement(name: String, attributes: Unit, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, attributes: Record[String, String | Double | Boolean]): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, attributes: Record[String, String | Double | Boolean], itemOrPosition: Item): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    def insertElement(name: String, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertElement(name: String, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertElement(name: String, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertElement(name: String, itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    def insertElement(
      name: String,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertElement(
      name: String,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    
    def insertText(data: String): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertText(data: String, attributes: Unit, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Unit,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, attributes: Record[String, String | Double | Boolean]): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Null,
      offset: Double
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Unit,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, attributes: Record[String, String | Double | Boolean], itemOrPosition: Item): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      attributes: Record[String, String | Double | Boolean],
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    def insertText(data: String, itemOrPosition: Null, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Null, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: Unit, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Unit, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: Item): Unit = js.native
    def insertText(data: String, itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def insertText(data: String, itemOrPosition: Item, offset: Double): Unit = js.native
    def insertText(data: String, itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    def insertText(
      data: String,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def insertText(
      data: String,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    
    def merge(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    
    val model: Model = js.native
    
    def move(range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, itemOrPosition: Item): Unit = js.native
    def move(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      itemOrPosition: Item,
      offset: end | before | after
    ): Unit = js.native
    def move(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      itemOrPosition: Item,
      offset: Double
    ): Unit = js.native
    def move(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default
    ): Unit = js.native
    def move(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: end | before | after
    ): Unit = js.native
    def move(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      offset: Double
    ): Unit = js.native
    
    def overrideSelectionGravity(): String = js.native
    
    def remove(itemOrRange: Item): Unit = js.native
    def remove(itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Unit = js.native
    
    def removeAttribute(key: String, itemOrRange: Item): Unit = js.native
    def removeAttribute(key: String, itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default): Unit = js.native
    
    def removeMarker(markerOrName: String): Unit = js.native
    def removeMarker(markerOrName: Marker): Unit = js.native
    
    def removeSelectionAttribute(keyOrIterableOfKeys: String): Unit = js.native
    def removeSelectionAttribute(keyOrIterableOfKeys: js.Array[String]): Unit = js.native
    
    def rename(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default, newName: String): Unit = js.native
    
    def restoreSelectionGravity(uid: String): Unit = js.native
    
    def setAttribute(key: String, value: String, itemOrRange: Item): Unit = js.native
    def setAttribute(
      key: String,
      value: String,
      itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    ): Unit = js.native
    def setAttribute(key: String, value: Boolean, itemOrRange: Item): Unit = js.native
    def setAttribute(
      key: String,
      value: Boolean,
      itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    ): Unit = js.native
    def setAttribute(key: String, value: Double, itemOrRange: Item): Unit = js.native
    def setAttribute(
      key: String,
      value: Double,
      itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    ): Unit = js.native
    def setAttribute(key: String, value: Record[String, String | Double | Boolean], itemOrRange: Item): Unit = js.native
    def setAttribute(
      key: String,
      value: Record[String, String | Double | Boolean],
      itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    ): Unit = js.native
    
    def setAttributes(
      attributes: Record[String, String | Double | Boolean | (Record[String, String | Double | Boolean])],
      itemOrRange: Item
    ): Unit = js.native
    def setAttributes(
      attributes: Record[String, String | Double | Boolean | (Record[String, String | Double | Boolean])],
      itemOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default
    ): Unit = js.native
    
    def setSelection(selectable: Selectable): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Backward): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double, options: Backward): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Unit, options: Backward): Unit = js.native
    
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: String): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: Boolean): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: String, value: Double): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: js.Array[js.Tuple2[String, String | Double | Boolean]]): Unit = js.native
    def setSelectionAttribute(keyOrObjectOrIterable: Record[String, String | Double | Boolean]): Unit = js.native
    
    def setSelectionFocus(itemOrPosition: Item): Unit = js.native
    def setSelectionFocus(itemOrPosition: Item, offset: end | before | after): Unit = js.native
    def setSelectionFocus(itemOrPosition: Item, offset: Double): Unit = js.native
    def setSelectionFocus(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Unit = js.native
    
    def split(position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default): Position = js.native
    def split(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcModelPositionMod.default,
      limitElement: typingsJapgolly.ckeditorCkeditor5Engine.srcModelNodeMod.default
    ): Position = js.native
    
    def unwrap(element: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default): Unit = js.native
    
    def updateMarker(markerOrName: String): Unit = js.native
    def updateMarker(markerOrName: String, options: UsingOperation): Unit = js.native
    def updateMarker(markerOrName: Marker): Unit = js.native
    def updateMarker(markerOrName: Marker, options: UsingOperation): Unit = js.native
    
    def wrap(range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default, elementOrString: String): Unit = js.native
    def wrap(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcModelRangeMod.default,
      elementOrString: typingsJapgolly.ckeditorCkeditor5Engine.srcModelElementMod.default
    ): Unit = js.native
  }
}
