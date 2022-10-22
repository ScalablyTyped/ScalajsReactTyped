package typingsJapgolly.htmlReactParser

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.domelementtype.mod.ElementType.Script
import typingsJapgolly.domelementtype.mod.ElementType.Style
import typingsJapgolly.domelementtype.mod.ElementType.Tag
import typingsJapgolly.domhandler.libNodeMod.ChildNode
import typingsJapgolly.domhandler.mod.DomHandlerOptions
import typingsJapgolly.htmlReactParser.anon.Dictkey
import typingsJapgolly.htmlReactParser.htmlReactParserBooleans.`false`
import typingsJapgolly.htmlReactParser.libAttributesToPropsMod.Attributes
import typingsJapgolly.htmlReactParser.libAttributesToPropsMod.Props
import typingsJapgolly.htmlparser2.libParserMod.ParserOptions
import typingsJapgolly.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("html-react-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(html: String): ReturnType[
    js.Function2[
      /* nodes */ js.Array[DOMNode], 
      /* options */ js.UndefOr[HTMLReactParserOptions], 
      String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any]).asInstanceOf[ReturnType[
    js.Function2[
      /* nodes */ js.Array[DOMNode], 
      /* options */ js.UndefOr[HTMLReactParserOptions], 
      String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]
    ]
  ]]
  inline def default(html: String, options: HTMLReactParserOptions): ReturnType[
    js.Function2[
      /* nodes */ js.Array[DOMNode], 
      /* options */ js.UndefOr[HTMLReactParserOptions], 
      String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ReturnType[
    js.Function2[
      /* nodes */ js.Array[DOMNode], 
      /* options */ js.UndefOr[HTMLReactParserOptions], 
      String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]
    ]
  ]]
  
  @JSImport("html-react-parser", "Comment")
  @js.native
  open class Comment protected ()
    extends typingsJapgolly.domhandler.mod.Comment {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
  }
  
  @JSImport("html-react-parser", "Element")
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
  
  /* note: abstract class */ @JSImport("html-react-parser", "Node")
  @js.native
  open class Node ()
    extends typingsJapgolly.domhandler.mod.Node
  
  @JSImport("html-react-parser", "ProcessingInstruction")
  @js.native
  open class ProcessingInstruction protected ()
    extends typingsJapgolly.domhandler.mod.ProcessingInstruction {
    def this(name: String, data: String) = this()
  }
  
  @JSImport("html-react-parser", "Text")
  @js.native
  open class Text protected ()
    extends typingsJapgolly.domhandler.mod.Text {
    /**
      * @param data The content of the data node
      */
    def this(data: String) = this()
  }
  
  inline def attributesToProps(attributes: Attributes): Props = ^.asInstanceOf[js.Dynamic].applyDynamic("attributesToProps")(attributes.asInstanceOf[js.Any]).asInstanceOf[Props]
  
  inline def domToReact(nodes: js.Array[DOMNode]): String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("domToReact")(nodes.asInstanceOf[js.Any]).asInstanceOf[String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]]
  inline def domToReact(nodes: js.Array[DOMNode], options: HTMLReactParserOptions): String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("domToReact")(nodes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String | typingsJapgolly.react.mod.global.JSX.Element | js.Array[typingsJapgolly.react.mod.global.JSX.Element]]
  
  inline def htmlToDOM(html: String): js.Array[
    typingsJapgolly.domhandler.mod.Comment | typingsJapgolly.domhandler.mod.Element | typingsJapgolly.domhandler.mod.ProcessingInstruction | typingsJapgolly.domhandler.mod.Text
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("htmlToDOM")(html.asInstanceOf[js.Any]).asInstanceOf[js.Array[
    typingsJapgolly.domhandler.mod.Comment | typingsJapgolly.domhandler.mod.Element | typingsJapgolly.domhandler.mod.ProcessingInstruction | typingsJapgolly.domhandler.mod.Text
  ]]
  inline def htmlToDOM(html: String, options: DomHandlerOptions): js.Array[
    typingsJapgolly.domhandler.mod.Comment | typingsJapgolly.domhandler.mod.Element | typingsJapgolly.domhandler.mod.ProcessingInstruction | typingsJapgolly.domhandler.mod.Text
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("htmlToDOM")(html.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[
    typingsJapgolly.domhandler.mod.Comment | typingsJapgolly.domhandler.mod.Element | typingsJapgolly.domhandler.mod.ProcessingInstruction | typingsJapgolly.domhandler.mod.Text
  ]]
  
  type DOMNode = typingsJapgolly.domhandler.mod.Comment | typingsJapgolly.domhandler.mod.Element | typingsJapgolly.domhandler.mod.Node | typingsJapgolly.domhandler.mod.ProcessingInstruction | typingsJapgolly.domhandler.mod.Text
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.domhandler.mod.DomHandlerOptions because var conflicts: xmlMode. Inlined withStartIndices, withEndIndices */ trait HTMLParser2Options
    extends StObject
       with ParserOptions {
    
    /**
      * Add an `endIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `endIndex` is an integer
      * indicating the position of the end of the node in the document.
      *
      * @default false
      */
    var withEndIndices: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Add a `startIndex` property to nodes.
      * When the parser is used in a non-streaming fashion, `startIndex` is an integer
      * indicating the position of the start of the node in the document.
      *
      * @default false
      */
    var withStartIndices: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLParser2Options {
    
    inline def apply(): HTMLParser2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLParser2Options]
    }
    
    extension [Self <: HTMLParser2Options](x: Self) {
      
      inline def setWithEndIndices(value: Boolean): Self = StObject.set(x, "withEndIndices", value.asInstanceOf[js.Any])
      
      inline def setWithEndIndicesUndefined: Self = StObject.set(x, "withEndIndices", js.undefined)
      
      inline def setWithStartIndices(value: Boolean): Self = StObject.set(x, "withStartIndices", value.asInstanceOf[js.Any])
      
      inline def setWithStartIndicesUndefined: Self = StObject.set(x, "withStartIndices", js.undefined)
    }
  }
  
  trait HTMLReactParserOptions extends StObject {
    
    var htmlparser2: js.UndefOr[HTMLParser2Options] = js.undefined
    
    var library: js.UndefOr[Dictkey] = js.undefined
    
    var replace: js.UndefOr[
        js.Function1[
          /* domNode */ DOMNode, 
          js.UndefOr[typingsJapgolly.react.mod.global.JSX.Element | js.Object | Unit | Null | `false`]
        ]
      ] = js.undefined
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object HTMLReactParserOptions {
    
    inline def apply(): HTMLReactParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTMLReactParserOptions]
    }
    
    extension [Self <: HTMLReactParserOptions](x: Self) {
      
      inline def setHtmlparser2(value: HTMLParser2Options): Self = StObject.set(x, "htmlparser2", value.asInstanceOf[js.Any])
      
      inline def setHtmlparser2Undefined: Self = StObject.set(x, "htmlparser2", js.undefined)
      
      inline def setLibrary(value: Dictkey): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
      
      inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
      
      inline def setReplace(
        value: /* domNode */ DOMNode => js.UndefOr[typingsJapgolly.react.mod.global.JSX.Element | js.Object | Unit | Null | `false`]
      ): Self = StObject.set(x, "replace", js.Any.fromFunction1(value))
      
      inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
      
      inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
      
      inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    }
  }
}
