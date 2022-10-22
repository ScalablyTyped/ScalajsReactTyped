package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Range
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Fake
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.Selectable
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewUpcastwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/upcastwriter", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with UpcastWriter {
    def this(document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default) = this()
  }
  
  @js.native
  trait UpcastWriter extends StObject {
    
    def addClass(className: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def addClass(
      className: js.Array[String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def appendChild(
      items: js.Iterable[Item],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Double = js.native
    def appendChild(items: Item, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Double = js.native
    
    def clone(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def clone(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default, deep: Boolean): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    def createDocumentFragment(): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def createElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(name: String, attrs: js.Array[js.Tuple2[String, String]]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: js.Array[js.Tuple2[String, String]],
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: js.Array[js.Tuple2[String, String]],
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Unit,
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Unit,
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(name: String, attrs: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Record[String, String],
      children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    def createElement(
      name: String,
      attrs: Record[String, String],
      children: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default = js.native
    
    def createPositionAfter(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createRange(start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Range = js.native
    def createRange(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): Range = js.native
    
    def createRangeIn(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Range = js.native
    
    def createRangeOn(item: Item): Range = js.native
    
    def createSelection(): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: before | end | after | on | in, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Double, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Unit, placeOrOffset: Unit, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Double, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    def createSelection(selectable: Selectable, placeOrOffset: Unit, options: Fake): typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.default = js.native
    
    def createText(data: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default = js.native
    
    val document: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default = js.native
    
    def insertChild(
      index: Double,
      items: js.Iterable[Item],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
    ): Double = js.native
    def insertChild(
      index: Double,
      items: js.Iterable[Item],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Double = js.native
    def insertChild(
      index: Double,
      items: Item,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default
    ): Double = js.native
    def insertChild(
      index: Double,
      items: Item,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Double = js.native
    
    def remove(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def removeAttribute(key: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeChildren(
      index: Double,
      howMany: Double,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): js.Array[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default] = js.native
    
    def removeClass(className: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def removeClass(
      className: js.Array[String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def removeCustomProperty(key: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Boolean = js.native
    
    def removeStyle(property: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def removeStyle(
      property: js.Array[String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def rename(newName: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default | Null = js.native
    
    def replace(
      oldElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default,
      newElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Boolean = js.native
    
    def setAttribute(
      key: String,
      value: String,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def setCustomProperty(
      key: String,
      value: Any,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def setStyle(
      property: String,
      value: String,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    def setStyle(
      property: Record[String, String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def unwrapElement(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
  }
}
