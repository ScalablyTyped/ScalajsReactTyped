package typingsJapgolly.cheerio

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cheerio.cheerioStrings._empty
import typingsJapgolly.cheerio.libEsmLoadMod.CheerioAPI
import typingsJapgolly.cheerio.libEsmOptionsMod.CheerioOptions
import typingsJapgolly.cheerio.libEsmOptionsMod.InternalOptions
import typingsJapgolly.cheerio.libEsmStaticMod.WritableArrayLike
import typingsJapgolly.cheerio.libEsmTypesMod.BasicAcceptedElems
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

object libEsmMod {
  
  @JSImport("cheerio/lib/esm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * The default cheerio instance.
    *
    * @deprecated Use the function returned by `load` instead.
    */
  @JSImport("cheerio/lib/esm", JSImport.Default)
  @js.native
  val default: CheerioAPI = js.native
  
  /* note: abstract class */ @JSImport("cheerio/lib/esm", "Cheerio")
  @js.native
  open class Cheerio[T] protected ()
    extends typingsJapgolly.cheerio.libEsmCheerioMod.Cheerio[T] {
    def this(elements: Unit, root: Null, options: InternalOptions) = this()
    def this(
      elements: Unit,
      root: typingsJapgolly.cheerio.libEsmCheerioMod.Cheerio[typingsJapgolly.domhandler.mod.Document],
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
      root: typingsJapgolly.cheerio.libEsmCheerioMod.Cheerio[typingsJapgolly.domhandler.mod.Document],
      options: InternalOptions
    ) = this()
  }
  
  @JSImport("cheerio/lib/esm", "Document")
  @js.native
  open class Document protected ()
    extends typingsJapgolly.domhandler.mod.Document {
    /**
      * @param children Children of the node. Only certain node types can have children.
      */
    def this(children: js.Array[ChildNode]) = this()
  }
  
  @JSImport("cheerio/lib/esm", "Element")
  @js.native
  open class Element protected ()
    extends typingsJapgolly.domhandler.mod.Element {
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
  
  /* note: abstract class */ @JSImport("cheerio/lib/esm", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.domhandler.mod.Node
  
  @JSImport("cheerio/lib/esm", "contains")
  @js.native
  val contains: js.Function2[/* container */ AnyNode, /* contained */ AnyNode, Boolean] = js.native
  
  inline def html(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")().asInstanceOf[String]
  inline def html(dom: Unit, options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def html(dom: BasicAcceptedElems[AnyNode], options: CheerioOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("html")(dom.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def html(options: CheerioOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("html")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
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
  
  inline def merge[T](arr1: WritableArrayLike[T], arr2: ArrayLike[T]): js.UndefOr[ArrayLike[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(arr1.asInstanceOf[js.Any], arr2.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[ArrayLike[T]]]
  
  inline def parseHTML(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")().asInstanceOf[Null]
  inline def parseHTML(data: String): js.Array[AnyNode] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Any, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Boolean, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: String, context: Unit, keepScripts: Boolean): js.Array[AnyNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any], context.asInstanceOf[js.Any], keepScripts.asInstanceOf[js.Any])).asInstanceOf[js.Array[AnyNode]]
  inline def parseHTML(data: _empty): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHTML")(data.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  @JSImport("cheerio/lib/esm", "root")
  @js.native
  val root: js.ThisFunction0[
    /* this */ CheerioAPI, 
    typingsJapgolly.cheerio.libEsmCheerioMod.Cheerio[typingsJapgolly.domhandler.mod.Document]
  ] = js.native
  
  inline def text(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")().asInstanceOf[String]
  inline def text(elements: ArrayLike[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("text")(elements.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def xml(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")().asInstanceOf[String]
  inline def xml(dom: BasicAcceptedElems[AnyNode]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("xml")(dom.asInstanceOf[js.Any]).asInstanceOf[String]
}
