package typingsJapgolly.mdastUtilFromMarkdown

import typingsJapgolly.mdastUtilFromMarkdown.anon.Enter
import typingsJapgolly.mdastUtilFromMarkdown.anon.FnCall
import typingsJapgolly.mdastUtilFromMarkdown.anon.OmitCompileContextsliceSeBuffer
import typingsJapgolly.mdastUtilFromMarkdown.anon.PartialCompileDataFields
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerHexadecimal
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.characterReferenceMarkerNumeric
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.children
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.collapsed
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.fragment
import typingsJapgolly.mdastUtilFromMarkdown.mdastUtilFromMarkdownStrings.full
import typingsJapgolly.micromarkUtilTypes.anon.PickTokenstartend
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-from-markdown/lib", "fromMarkdown")
  @js.native
  val fromMarkdown: (js.Function3[/* value */ Value, /* encoding */ Encoding, /* options */ js.UndefOr[Options], Root]) & (js.Function2[/* value */ Value, /* options */ js.UndefOr[Options], Root]) = js.native
  
  type Blockquote = typingsJapgolly.mdast.mod.Blockquote
  
  type Break = typingsJapgolly.mdast.mod.Break
  
  type Code = typingsJapgolly.mdast.mod.Code
  
  @js.native
  trait CompileContext extends StObject {
    
    /**
      * Capture some of the output data.
      */
    def buffer(): Unit = js.native
    
    /**
      * Configuration.
      */
    var config: NormalizedExtension = js.native
    
    def enter(node: typingsJapgolly.mdast.mod.Content, token: Token): typingsJapgolly.mdast.mod.Content = js.native
    def enter(node: typingsJapgolly.mdast.mod.Content, token: Token, onError: OnEnterError): typingsJapgolly.mdast.mod.Content = js.native
    /**
      * Enter a token.
      */
    def enter(node: typingsJapgolly.mdast.mod.Root, token: Token): typingsJapgolly.mdast.mod.Root = js.native
    def enter(node: typingsJapgolly.mdast.mod.Root, token: Token, onError: OnEnterError): typingsJapgolly.mdast.mod.Root = js.native
    
    /**
      * Exit a token.
      */
    def exit(token: Token): Node = js.native
    def exit(token: Token, onError: OnExitError): Node = js.native
    
    /**
      * Get data from the key-value store.
      */
    def getData[K /* <: String */](key: K): /* import warning: importer.ImportType#apply Failed type conversion: mdast-util-from-markdown.mdast-util-from-markdown/lib.CompileData[K] */ js.Any = js.native
    
    /**
      * Stop capturing and access the output data.
      */
    def resume(): String = js.native
    
    /**
      * Set data into the key-value store.
      */
    def setData(key: String): Unit = js.native
    def setData(key: String, value: Any): Unit = js.native
    
    /**
      * Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend): String = js.native
    /**
      * Get the string value of a token.
      */
    def sliceSerialize(token: PickTokenstartend, expandTabs: Boolean): String = js.native
    /**
      * Get the string value of a token.
      */
    @JSName("sliceSerialize")
    var sliceSerialize_Original: FnCall = js.native
    
    var stack: js.Array[Node | Fragment] = js.native
    
    var tokenStack: js.Array[js.Tuple2[Token, js.UndefOr[OnEnterError]]] = js.native
  }
  
  type CompileData = (Record[String, Any]) & PartialCompileDataFields
  
  trait CompileDataFields extends StObject {
    
    var atHardBreak: js.UndefOr[Boolean] = js.undefined
    
    var characterReferenceType: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric
    
    var expectingFirstListItemValue: js.UndefOr[Boolean] = js.undefined
    
    var flowCodeInside: js.UndefOr[Boolean] = js.undefined
    
    var inReference: js.UndefOr[Boolean] = js.undefined
    
    var referenceType: collapsed | full
    
    var setextHeadingSlurpLineEnding: js.UndefOr[Boolean] = js.undefined
  }
  object CompileDataFields {
    
    inline def apply(
      characterReferenceType: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric,
      referenceType: collapsed | full
    ): CompileDataFields = {
      val __obj = js.Dynamic.literal(characterReferenceType = characterReferenceType.asInstanceOf[js.Any], referenceType = referenceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompileDataFields]
    }
    
    extension [Self <: CompileDataFields](x: Self) {
      
      inline def setAtHardBreak(value: Boolean): Self = StObject.set(x, "atHardBreak", value.asInstanceOf[js.Any])
      
      inline def setAtHardBreakUndefined: Self = StObject.set(x, "atHardBreak", js.undefined)
      
      inline def setCharacterReferenceType(value: characterReferenceMarkerHexadecimal | characterReferenceMarkerNumeric): Self = StObject.set(x, "characterReferenceType", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValue(value: Boolean): Self = StObject.set(x, "expectingFirstListItemValue", value.asInstanceOf[js.Any])
      
      inline def setExpectingFirstListItemValueUndefined: Self = StObject.set(x, "expectingFirstListItemValue", js.undefined)
      
      inline def setFlowCodeInside(value: Boolean): Self = StObject.set(x, "flowCodeInside", value.asInstanceOf[js.Any])
      
      inline def setFlowCodeInsideUndefined: Self = StObject.set(x, "flowCodeInside", js.undefined)
      
      inline def setInReference(value: Boolean): Self = StObject.set(x, "inReference", value.asInstanceOf[js.Any])
      
      inline def setInReferenceUndefined: Self = StObject.set(x, "inReference", js.undefined)
      
      inline def setReferenceType(value: collapsed | full): Self = StObject.set(x, "referenceType", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEnding(value: Boolean): Self = StObject.set(x, "setextHeadingSlurpLineEnding", value.asInstanceOf[js.Any])
      
      inline def setSetextHeadingSlurpLineEndingUndefined: Self = StObject.set(x, "setextHeadingSlurpLineEnding", js.undefined)
    }
  }
  
  type Content = typingsJapgolly.mdast.mod.Content
  
  type Definition = typingsJapgolly.mdast.mod.Definition
  
  type Emphasis = typingsJapgolly.mdast.mod.Emphasis
  
  type Encoding = typingsJapgolly.micromarkUtilTypes.mod.Encoding
  
  type Event = typingsJapgolly.micromarkUtilTypes.mod.Event
  
  type Extension = Partial[NormalizedExtension]
  
  trait Fragment
    extends StObject
       with typingsJapgolly.unist.mod.Parent[
          typingsJapgolly.unist.mod.Node[Data], 
          NodeData[typingsJapgolly.unist.mod.Node[Data]]
        ] {
    
    @JSName("children")
    var children_Fragment: js.Array[PhrasingContent]
    
    @JSName("type")
    var type_Fragment: fragment
  }
  object Fragment {
    
    inline def apply(children: js.Array[PhrasingContent]): Fragment = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fragment")
      __obj.asInstanceOf[Fragment]
    }
    
    extension [Self <: Fragment](x: Self) {
      
      inline def setChildren(value: js.Array[PhrasingContent]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: PhrasingContent*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setType(value: fragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FromMarkdownOptions extends StObject {
    
    var mdastExtensions: js.UndefOr[js.Array[Extension | js.Array[Extension]]] = js.undefined
  }
  object FromMarkdownOptions {
    
    inline def apply(): FromMarkdownOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FromMarkdownOptions]
    }
    
    extension [Self <: FromMarkdownOptions](x: Self) {
      
      inline def setMdastExtensions(value: js.Array[Extension | js.Array[Extension]]): Self = StObject.set(x, "mdastExtensions", value.asInstanceOf[js.Any])
      
      inline def setMdastExtensionsUndefined: Self = StObject.set(x, "mdastExtensions", js.undefined)
      
      inline def setMdastExtensionsVarargs(value: (Extension | js.Array[Extension])*): Self = StObject.set(x, "mdastExtensions", js.Array(value*))
    }
  }
  
  type HTML = typingsJapgolly.mdast.mod.HTML
  
  type Handle = js.ThisFunction1[/* this */ CompileContext, /* token */ Token, Unit]
  
  type Handles = Record[String, Handle]
  
  type Heading = typingsJapgolly.mdast.mod.Heading
  
  type Image = typingsJapgolly.mdast.mod.Image
  
  type ImageReference = typingsJapgolly.mdast.mod.ImageReference
  
  type InlineCode = typingsJapgolly.mdast.mod.InlineCode
  
  type Link = typingsJapgolly.mdast.mod.Link
  
  type LinkReference = typingsJapgolly.mdast.mod.LinkReference
  
  type List = typingsJapgolly.mdast.mod.List
  
  type ListItem = typingsJapgolly.mdast.mod.ListItem
  
  type Node = Root | Content
  
  type NormalizedExtension = (Record[String, (Record[String, Any]) | js.Array[Any]]) & Enter
  
  type OnEnterError = js.ThisFunction2[
    /* this */ OmitCompileContextsliceSeBuffer, 
    /* left */ js.UndefOr[Token], 
    /* right */ Token, 
    Unit
  ]
  
  type OnExitError = js.ThisFunction2[/* this */ OmitCompileContextsliceSeBuffer, /* left */ Token, /* right */ Token, Unit]
  
  trait Options
    extends StObject
       with typingsJapgolly.micromarkUtilTypes.mod.ParseOptions
       with FromMarkdownOptions
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
  }
  
  type Paragraph = typingsJapgolly.mdast.mod.Paragraph
  
  /* Inlined std.Extract<mdast-util-from-markdown.mdast-util-from-markdown/lib.Node, mdast-util-from-markdown.mdast-util-from-markdown/lib.UnistParent> */
  type Parent = children
  
  type ParseOptions = typingsJapgolly.micromarkUtilTypes.mod.ParseOptions
  
  type PhrasingContent = typingsJapgolly.mdast.mod.PhrasingContent
  
  type Point = typingsJapgolly.unist.mod.Point
  
  type Root = typingsJapgolly.mdast.mod.Root
  
  type Strong = typingsJapgolly.mdast.mod.Strong
  
  type Text = typingsJapgolly.mdast.mod.Text
  
  type ThematicBreak = typingsJapgolly.mdast.mod.ThematicBreak
  
  type Token = typingsJapgolly.micromarkUtilTypes.mod.Token
  
  type TokenizeContext = typingsJapgolly.micromarkUtilTypes.mod.TokenizeContext
  
  type Transform = js.Function1[/* tree */ Root, Root | Unit]
  
  type UnistParent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Value = typingsJapgolly.micromarkUtilTypes.mod.Value
}
