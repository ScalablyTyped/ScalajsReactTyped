package typingsJapgolly.cheerio

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cheerio.libEsmLoadMod.CheerioAPI
import typingsJapgolly.cheerio.libEsmOptionsMod.CheerioOptions
import typingsJapgolly.cheerio.libOptionsMod.InternalOptions
import typingsJapgolly.domelementtype.mod.ElementType.Script
import typingsJapgolly.domelementtype.mod.ElementType.Style
import typingsJapgolly.domelementtype.mod.ElementType.Tag
import typingsJapgolly.domhandler.libNodeMod.AnyNode
import typingsJapgolly.domhandler.libNodeMod.ChildNode
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSlimMod {
  
  @JSImport("cheerio/lib/slim", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* note: abstract class */ @JSImport("cheerio/lib/slim", "Cheerio")
  @js.native
  open class Cheerio[T] protected ()
    extends typingsJapgolly.cheerio.libCheerioMod.Cheerio[T] {
    def this(elements: Unit, root: Null, options: InternalOptions) = this()
    def this(
      elements: Unit,
      root: typingsJapgolly.cheerio.libCheerioMod.Cheerio[typingsJapgolly.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
    def this(elements: ArrayLike[T], root: Null, options: InternalOptions) = this()
    /**
      * Instance of cheerio. Methods are specified in the modules. Usage of this
      * constructor is not recommended. Please use `$.load` instead.
      *
      * @private
      * @param elements - The new selection.
      * @param root - Sets the root node.
      * @param options - Options for the instance.
      */
    def this(
      elements: ArrayLike[T],
      root: typingsJapgolly.cheerio.libCheerioMod.Cheerio[typingsJapgolly.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
  }
  
  @JSImport("cheerio/lib/slim", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.cheerio.mod.Document {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("cheerio/lib/slim", "Element")
  @js.native
  open class Element protected ()
    extends typingsJapgolly.cheerio.mod.Element {
    /**
      * @param name Name of the tag, eg. `div`, `span`.
      * @param attribs Object mapping attribute names to attribute values.
      * @param children Children of the node.
      */
    def this(name: String, attribs: StringDictionary[String]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode]) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: js.Array[ChildNode], `type`: Tag) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Script) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Style) = this()
    def this(name: String, attribs: StringDictionary[String], children: Unit, `type`: Tag) = this()
  }
  
  /* note: abstract class */ @JSImport("cheerio/lib/slim", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.cheerio.mod.Node
  
  inline def load(content: String): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: String, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode]): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: js.Array[AnyNode], options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: AnyNode, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer): CheerioAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any]).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: Null, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: Unit, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: CheerioOptions): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
  inline def load(content: Buffer, options: CheerioOptions, isDocument: Boolean): CheerioAPI = (^.asInstanceOf[js.Dynamic].applyDynamic("load")(content.asInstanceOf[js.Any], options.asInstanceOf[js.Any], isDocument.asInstanceOf[js.Any])).asInstanceOf[CheerioAPI]
}
