package typingsJapgolly.hastUtilToNlcst

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.hast.mod.Content
import typingsJapgolly.hast.mod.Element
import typingsJapgolly.hast.mod.ElementContent
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.hastUtilToNlcst.hastUtilToNlcstStrings.children
import typingsJapgolly.nlcst.mod.Paragraph
import typingsJapgolly.nlcst.mod.SentenceContent
import typingsJapgolly.nlcst.mod.Source
import typingsJapgolly.nlcst.mod.WhiteSpace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("hast-util-to-nlcst/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toNlcst(tree: HastNode, file: VFile, Parser: ParserConstructor): NlcstRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[NlcstRoot]
  inline def toNlcst(tree: HastNode, file: VFile, Parser: ParserInstance): NlcstRoot = (^.asInstanceOf[js.Dynamic].applyDynamic("toNlcst")(tree.asInstanceOf[js.Any], file.asInstanceOf[js.Any], Parser.asInstanceOf[js.Any])).asInstanceOf[NlcstRoot]
  
  type HastContent = Content
  
  type HastElement = Element
  
  type HastElementContent = ElementContent
  
  type HastNode = HastRoot | HastContent
  
  /* Inlined std.Extract<hast-util-to-nlcst.hast-util-to-nlcst/lib.HastNode, unist.unist.Parent<unist.unist.Node<unist.unist.Data>, unist.unist.NodeData<unist.unist.Node<unist.unist.Data>>>> */
  type HastParent = children
  
  type HastRoot = Root
  
  type NlcstContent = typingsJapgolly.nlcst.mod.Content
  
  type NlcstNode = NlcstRoot | NlcstContent
  
  type NlcstParagraph = Paragraph
  
  type NlcstRoot = typingsJapgolly.nlcst.mod.Root
  
  type NlcstSentenceContent = SentenceContent
  
  type NlcstSource = Source
  
  type NlcstWhiteSpace = WhiteSpace
  
  type ParserConstructor = Instantiable0[ParserInstance]
  
  trait ParserInstance extends StObject {
    
    def parse(nodes: js.Array[NlcstContent]): NlcstRoot
    
    def tokenize(value: String): js.Array[NlcstSentenceContent]
    
    def tokenizeParagraph(nodes: js.Array[NlcstSentenceContent]): NlcstParagraph
    
    def tokenizeSource(value: String): NlcstSource
    
    def tokenizeWhiteSpace(value: String): NlcstWhiteSpace
  }
  object ParserInstance {
    
    inline def apply(
      parse: js.Array[NlcstContent] => NlcstRoot,
      tokenize: String => js.Array[NlcstSentenceContent],
      tokenizeParagraph: js.Array[NlcstSentenceContent] => NlcstParagraph,
      tokenizeSource: String => NlcstSource,
      tokenizeWhiteSpace: String => NlcstWhiteSpace
    ): ParserInstance = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse), tokenize = js.Any.fromFunction1(tokenize), tokenizeParagraph = js.Any.fromFunction1(tokenizeParagraph), tokenizeSource = js.Any.fromFunction1(tokenizeSource), tokenizeWhiteSpace = js.Any.fromFunction1(tokenizeWhiteSpace))
      __obj.asInstanceOf[ParserInstance]
    }
    
    extension [Self <: ParserInstance](x: Self) {
      
      inline def setParse(value: js.Array[NlcstContent] => NlcstRoot): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setTokenize(value: String => js.Array[NlcstSentenceContent]): Self = StObject.set(x, "tokenize", js.Any.fromFunction1(value))
      
      inline def setTokenizeParagraph(value: js.Array[NlcstSentenceContent] => NlcstParagraph): Self = StObject.set(x, "tokenizeParagraph", js.Any.fromFunction1(value))
      
      inline def setTokenizeSource(value: String => NlcstSource): Self = StObject.set(x, "tokenizeSource", js.Any.fromFunction1(value))
      
      inline def setTokenizeWhiteSpace(value: String => NlcstWhiteSpace): Self = StObject.set(x, "tokenizeWhiteSpace", js.Any.fromFunction1(value))
    }
  }
  
  type Point = typingsJapgolly.unist.mod.Point
  
  type VFile = typingsJapgolly.vfile.mod.VFile
}
