package typingsJapgolly.nlcstSearch

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.nlcstSearch.nlcstSearchStrings.children
import typingsJapgolly.unist.mod.Data
import typingsJapgolly.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nlcst-search", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesList, handler: Handler, options: SearchOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler, options: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def search(tree: Node, phrases: PhrasesMap, handler: Handler, options: SearchOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(tree.asInstanceOf[js.Any], phrases.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type AllowApostrophes = Boolean
  
  type Content = typingsJapgolly.nlcst.mod.Content
  
  type Handler = js.Function4[
    /* nodes */ js.Array[Content], 
    /* index */ Double, 
    /* parent */ Parent, 
    /* pattern */ String, 
    Unit
  ]
  
  type Node = Root | Content
  
  type NormalizeOptions = typingsJapgolly.nlcstNormalize.mod.NormalizeOptions
  
  /* Inlined std.Extract<nlcst-search.nlcst-search.Node, nlcst-search.nlcst-search.UnistParent> */
  type Parent = children
  
  type PhrasesList = js.Array[String]
  
  type PhrasesMap = StringDictionary[Any]
  
  type Root = typingsJapgolly.nlcst.mod.Root
  
  trait SearchOptions
    extends StObject
       with typingsJapgolly.nlcstNormalize.mod.NormalizeOptions {
    
    var allowLiterals: js.UndefOr[Boolean] = js.undefined
  }
  object SearchOptions {
    
    inline def apply(): SearchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchOptions]
    }
    
    extension [Self <: SearchOptions](x: Self) {
      
      inline def setAllowLiterals(value: Boolean): Self = StObject.set(x, "allowLiterals", value.asInstanceOf[js.Any])
      
      inline def setAllowLiteralsUndefined: Self = StObject.set(x, "allowLiterals", js.undefined)
    }
  }
  
  type UnistParent = typingsJapgolly.unist.mod.Parent[
    typingsJapgolly.unist.mod.Node[Data], 
    NodeData[typingsJapgolly.unist.mod.Node[Data]]
  ]
  
  type Word = typingsJapgolly.nlcst.mod.Word
}
