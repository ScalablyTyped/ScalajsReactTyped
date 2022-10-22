package typingsJapgolly.yjs

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Document
import org.scalajs.dom.Node
import typingsJapgolly.std.Iterable
import typingsJapgolly.std.IteratorResult
import typingsJapgolly.std.Map
import typingsJapgolly.yjs.distSrcStructsItemMod.Item
import typingsJapgolly.yjs.distSrcTypesAbstractTypeMod.AbstractType
import typingsJapgolly.yjs.distSrcTypesYxmlelementMod.YXmlElement
import typingsJapgolly.yjs.distSrcTypesYxmleventMod.YXmlEvent
import typingsJapgolly.yjs.distSrcTypesYxmlhookMod.YXmlHook
import typingsJapgolly.yjs.distSrcTypesYxmltextMod.YXmlText
import typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV1
import typingsJapgolly.yjs.distSrcUtilsUpdateDecoderMod.UpdateDecoderV2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesYxmlfragmentMod {
  
  @JSImport("yjs/dist/src/types/YXmlFragment", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("yjs/dist/src/types/YXmlFragment", "YXmlFragment")
  @js.native
  open class YXmlFragment () extends AbstractType[YXmlEvent] {
    
    /**
      * @type {Array<any>|null}
      */
    var _prelimContent: js.Array[Any] | Null = js.native
    
    /**
      * Create a subtree of childNodes.
      *
      * @example
      * const walker = elem.createTreeWalker(dom => dom.nodeName === 'div')
      * for (let node in walker) {
      *   // `node` is a div node
      *   nop(node)
      * }
      *
      * @param {function(AbstractType<any>):boolean} filter Function that is called on each child element and
      *                          returns a Boolean indicating whether the child
      *                          is to be included in the subtree.
      * @return {YXmlTreeWalker} A subtree and a position within it.
      *
      * @public
      */
    def createTreeWalker(filter: js.Function1[/* arg0 */ AbstractType[Any], Boolean]): YXmlTreeWalker = js.native
    
    /**
      * Deletes elements starting from an index.
      *
      * @param {number} index Index at which to start deleting elements
      * @param {number} [length=1] The number of elements to remove. Defaults to 1.
      */
    def delete(index: Double): Unit = js.native
    def delete(index: Double, length: Double): Unit = js.native
    
    /**
      * @type {YXmlElement|YXmlText|null}
      */
    def firstChild: YXmlElement | YXmlText | Null = js.native
    
    /**
      * Executes a provided function on once on overy child element.
      *
      * @param {function(YXmlElement|YXmlText,number, typeof this):void} f A function to execute on every element of this YArray.
      */
    def forEach(f: js.Function3[/* arg0 */ YXmlElement | YXmlText, /* arg1 */ Double, /* arg2 */ this.type, Unit]): Unit = js.native
    
    /**
      * Returns the i-th element from a YArray.
      *
      * @param {number} index The index of the element to return from the YArray
      * @return {YXmlElement|YXmlText}
      */
    def get(index: Double): YXmlElement | YXmlText = js.native
    
    /**
      * Inserts new content at an index.
      *
      * @example
      *  // Insert character 'a' at position 0
      *  xml.insert(0, [new Y.XmlText('text')])
      *
      * @param {number} index The index to insert content at
      * @param {Array<YXmlElement|YXmlText>} content The array of content
      */
    def insert(index: Double, content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    
    /**
      * Inserts new content at an index.
      *
      * @example
      *  // Insert character 'a' at position 0
      *  xml.insert(0, [new Y.XmlText('text')])
      *
      * @param {null|Item|YXmlElement|YXmlText} ref The index to insert content at
      * @param {Array<YXmlElement|YXmlText>} content The array of content
      */
    def insertAfter(ref: Null, content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    def insertAfter(ref: Item, content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    def insertAfter(ref: YXmlElement, content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    def insertAfter(ref: YXmlText, content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    
    def length: Double = js.native
    
    /**
      * Appends content to this YArray.
      *
      * @param {Array<YXmlElement|YXmlText>} content Array of content to append.
      */
    def push(content: js.Array[YXmlElement | YXmlText]): Unit = js.native
    
    /**
      * Returns the first YXmlElement that matches the query.
      * Similar to DOM's {@link querySelector}.
      *
      * Query support:
      *   - tagname
      * TODO:
      *   - id
      *   - attribute
      *
      * @param {CSS_Selector} query The query on the children.
      * @return {YXmlElement|YXmlText|YXmlHook|null} The first element that matches the query or null.
      *
      * @public
      */
    def querySelector(query: CSSSelector): YXmlElement | YXmlText | YXmlHook | Null = js.native
    
    /**
      * Returns all YXmlElements that match the query.
      * Similar to Dom's {@link querySelectorAll}.
      *
      * @todo Does not yet support all queries. Currently only query by tagName.
      *
      * @param {CSS_Selector} query The query on the children
      * @return {Array<YXmlElement|YXmlText|YXmlHook|null>} The elements that match this query.
      *
      * @public
      */
    def querySelectorAll(query: CSSSelector): js.Array[YXmlElement | YXmlText | YXmlHook | Null] = js.native
    
    /**
      * Transforms this YArray to a JavaScript Array.
      *
      * @param {number} [start]
      * @param {number} [end]
      * @return {Array<YXmlElement|YXmlText>}
      */
    def slice(): js.Array[YXmlElement | YXmlText] = js.native
    def slice(start: Double): js.Array[YXmlElement | YXmlText] = js.native
    def slice(start: Double, end: Double): js.Array[YXmlElement | YXmlText] = js.native
    def slice(start: Unit, end: Double): js.Array[YXmlElement | YXmlText] = js.native
    
    /**
      * Transforms this YArray to a JavaScript Array.
      *
      * @return {Array<YXmlElement|YXmlText|YXmlHook>}
      */
    def toArray(): js.Array[YXmlElement | YXmlText | YXmlHook] = js.native
    
    /**
      * Creates a Dom Element that mirrors this YXmlElement.
      *
      * @param {Document} [_document=document] The document object (you must define
      *                                        this when calling this method in
      *                                        nodejs)
      * @param {Object<string, any>} [hooks={}] Optional property to customize how hooks
      *                                             are presented in the DOM
      * @param {any} [binding] You should not set this property. This is
      *                               used if DomBinding wants to create a
      *                               association to the created DOM type.
      * @return {Node} The {@link https://developer.mozilla.org/en-US/docs/Web/API/Element|Dom Element}
      *
      * @public
      */
    def toDOM(): Node = js.native
    def toDOM(_document: Document): Node = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any]): Node = js.native
    def toDOM(_document: Document, hooks: StringDictionary[Any], binding: Any): Node = js.native
    def toDOM(_document: Document, hooks: Unit, binding: Any): Node = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any]): Node = js.native
    def toDOM(_document: Unit, hooks: StringDictionary[Any], binding: Any): Node = js.native
    def toDOM(_document: Unit, hooks: Unit, binding: Any): Node = js.native
    
    /**
      * Preppends content to this YArray.
      *
      * @param {Array<YXmlElement|YXmlText>} content Array of content to preppend.
      */
    def unshift(content: js.Array[YXmlElement | YXmlText]): Unit = js.native
  }
  
  @JSImport("yjs/dist/src/types/YXmlFragment", "YXmlTreeWalker")
  @js.native
  open class YXmlTreeWalker protected ()
    extends StObject
       with Iterable[YXmlElement | YXmlText | YXmlHook] {
    def this(root: YXmlElement) = this()
    /**
      * @param {YXmlFragment | YXmlElement} root
      * @param {function(AbstractType<any>):boolean} [f]
      */
    def this(root: YXmlFragment) = this()
    def this(root: YXmlElement, f: js.Function1[/* arg0 */ AbstractType[Any], Boolean]) = this()
    def this(root: YXmlFragment, f: js.Function1[/* arg0 */ AbstractType[Any], Boolean]) = this()
    
    /**
      * @type {Item}
      */
    var _currentNode: Item = js.native
    
    def _filter(arg0: AbstractType[Any]): Boolean = js.native
    
    var _firstCall: Boolean = js.native
    
    var _root: YXmlFragment | YXmlElement = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_YXmlTreeWalker: js.Function0[this.type] = js.native
    
    /**
      * Get the next node.
      *
      * @return {IteratorResult<YXmlElement|YXmlText|YXmlHook>} The next node.
      *
      * @public
      */
    def next(): IteratorResult[YXmlElement | YXmlText | YXmlHook, Any] = js.native
  }
  
  inline def readYXmlFragment(decoder: UpdateDecoderV1): YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlFragment]
  inline def readYXmlFragment(decoder: UpdateDecoderV2): YXmlFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("readYXmlFragment")(decoder.asInstanceOf[js.Any]).asInstanceOf[YXmlFragment]
  
  type CSSSelector = String
  
  type domFilter = js.Function2[/* nodeName */ String, /* attributes */ Map[Any, Any], Boolean]
}
