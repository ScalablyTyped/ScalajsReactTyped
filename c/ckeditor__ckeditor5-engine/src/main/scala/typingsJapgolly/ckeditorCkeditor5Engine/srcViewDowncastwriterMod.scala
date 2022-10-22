package typingsJapgolly.ckeditorCkeditor5Engine

import org.scalajs.dom.Document
import org.scalajs.dom.HTMLElement
import typingsJapgolly.ckeditorCkeditor5Engine.anon.Fake
import typingsJapgolly.ckeditorCkeditor5Engine.anon.IsAllowedInsideAttributeElement
import typingsJapgolly.ckeditorCkeditor5Engine.anon.IsAllowedInsideAttributeElementRenderUnsafeAttributes
import typingsJapgolly.ckeditorCkeditor5Engine.anon.RenderUnsafeAttributes
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`14`
import typingsJapgolly.ckeditorCkeditor5Engine.anon.`15`
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.after
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.before
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.end
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.in
import typingsJapgolly.ckeditorCkeditor5Engine.ckeditorCkeditor5EngineStrings.on
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewItemMod.Item
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewSelectionMod.Selectable
import typingsJapgolly.ckeditorCkeditor5Engine.srcViewViewMod.View
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcViewDowncastwriterMod {
  
  @JSImport("@ckeditor/ckeditor5-engine/src/view/downcastwriter", JSImport.Default)
  @js.native
  open class default[D /* <: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default */] protected ()
    extends StObject
       with DowncastWriter[D] {
    def this(document: D) = this()
  }
  
  @js.native
  trait DowncastWriter[D /* <: typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default */] extends StObject {
    
    def addClass(className: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    def addClass(
      className: js.Array[String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def breakAttributes(positionOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def breakAttributes(positionOrRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def breakContainer(position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def clear(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def clearClonedElementsGroup(groupName: String): Unit = js.native
    
    def createAttributeElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Unit, options: RenderUnsafeAttributes): typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    def createAttributeElement(name: String, attributes: Record[String, String], options: RenderUnsafeAttributes): typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default = js.native
    
    def createContainerElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Unit, options: IsAllowedInsideAttributeElement): typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    def createContainerElement(name: String, attributes: Record[String, String], options: IsAllowedInsideAttributeElement): typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    
    def createDocumentFragment(children: js.Iterable[typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def createDocumentFragment(children: typingsJapgolly.ckeditorCkeditor5Engine.srcViewNodeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def createEditableElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Unit, options: `14`): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    def createEditableElement(name: String, attributes: Record[String, String], options: `14`): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEditableelementMod.default = js.native
    
    def createEmptyElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Unit, options: IsAllowedInsideAttributeElement): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    def createEmptyElement(name: String, attributes: Record[String, String], options: IsAllowedInsideAttributeElement): typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default = js.native
    
    def createPositionAfter(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionAt(itemOrPosition: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: end | before | after): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: Item, offset: Double): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    def createPositionAt(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createPositionBefore(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def createRange(start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def createRange(
      start: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      end: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeIn(element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def createRangeOn(item: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    /**
      * Creates a new {@link module:engine/view/rawelement~RawElement}.
      *
      *    writer.createRawElement( 'span', { id: 'foo-1234' }, function( domElement ) {
      *      domElement.innerHTML = '<b>This is the raw content of the raw element.</b>';
      *    } );
      *
      * Raw elements work as data containers ("wrappers", "sandboxes") but their children are not managed or
      * even recognized by the editor. This encapsulation allows integrations to maintain custom DOM structures
      * in the editor content without, for instance, worrying about compatibility with other editor features.
      * Raw elements are a perfect tool for integration with external frameworks and data sources.
      *
      * Unlike {@link #createUIElement UI elements}, raw elements act like "real" editor content (similar to
      * {@link module:engine/view/containerelement~ContainerElement} or {@link module:engine/view/emptyelement~EmptyElement}),
      * and they are considered by the editor selection.
      *
      * You should not use raw elements to render the UI in the editor content. Check out {@link #createUIElement `#createUIElement()`}
      * instead.
      */
    def createRawElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ],
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Unit,
      renderFunction: Unit,
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction2[
          /* this */ DowncastWriter[typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentMod.default], 
          /* domElement */ HTMLElement, 
          /* domConverter */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewDomconverterMod.default, 
          Unit
        ],
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    def createRawElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: Unit,
      options: IsAllowedInsideAttributeElementRenderUnsafeAttributes
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default = js.native
    
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
    
    def createUIElement(name: String): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Null,
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Null,
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `15`
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Null, renderFunction: Unit, options: `15`): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Unit,
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `15`
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Unit, renderFunction: Unit, options: `15`): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Record[String, String]): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(
      name: String,
      attributes: Record[String, String],
      renderFunction: js.ThisFunction1[
          /* this */ typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default, 
          /* domElement */ Document, 
          Unit
        ],
      options: `15`
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    def createUIElement(name: String, attributes: Record[String, String], renderFunction: Unit, options: `15`): typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default = js.native
    
    val document: D = js.native
    
    def insert(
      position: Null,
      nodes: js.Iterable[
          typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(position: Null, nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: js.Iterable[
          typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default | typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default
        ]
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewEmptyelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRawelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewTextMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    def insert(
      position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default,
      nodes: typingsJapgolly.ckeditorCkeditor5Engine.srcViewUielementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def mergeAttributes(position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def mergeContainers(position: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default = js.native
    
    def move(
      sourceRange: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      targetPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
    
    def remove(rangeOrItem: Item): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    def remove(rangeOrItem: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default): typingsJapgolly.ckeditorCkeditor5Engine.srcViewDocumentfragmentMod.default = js.native
    
    def removeAttribute(key: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeClass(className: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def removeCustomProperty(key: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Boolean = js.native
    
    def removeStyle(property: String, element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default): Unit = js.native
    
    def rename(
      newName: String,
      viewElement: typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewContainerelementMod.default = js.native
    
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
    
    def setSelection(selectable: Selectable): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: before | end | after | on | in, options: Fake): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Double, options: Fake): Unit = js.native
    def setSelection(selectable: Selectable, placeOrOffset: Unit, options: Fake): Unit = js.native
    
    def setSelectionFocus(itemOrPosition: Item): Unit = js.native
    def setSelectionFocus(itemOrPosition: typingsJapgolly.ckeditorCkeditor5Engine.srcViewPositionMod.default): Unit = js.native
    def setSelectionFocus(itemOrPosition: View): Unit = js.native
    def setSelectionFocus(itemOrPosition: View, offset: end | before | after): Unit = js.native
    def setSelectionFocus(itemOrPosition: View, offset: Double): Unit = js.native
    
    def setStyle(
      property: String,
      value: String,
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    def setStyle(
      property: Record[String, String],
      element: typingsJapgolly.ckeditorCkeditor5Engine.srcViewElementMod.default
    ): Unit = js.native
    
    def unwrap(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      attribute: typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): Unit = js.native
    
    def wrap(
      range: typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default,
      attribute: typingsJapgolly.ckeditorCkeditor5Engine.srcViewAttributeelementMod.default
    ): typingsJapgolly.ckeditorCkeditor5Engine.srcViewRangeMod.default = js.native
  }
}
