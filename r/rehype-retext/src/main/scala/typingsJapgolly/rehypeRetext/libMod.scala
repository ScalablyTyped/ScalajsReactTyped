package typingsJapgolly.rehypeRetext

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.unified.mod.Plugin
import typingsJapgolly.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod extends Shortcut {
  
  /**
    * Plugin to bridge or mutate to retext.
    *
    * If a destination processor is given, runs the destination with the new nlcst
    * tree (bridge-mode).
    * If a parser is given, returns the nlcst tree: further plugins run on that
    * tree (mutate-mode).
    *
    * @param options
    *   Either a processor (`unified().use(retextEnglish)…`) or a parser.
    */
  @JSImport("rehype-retext/lib", JSImport.Default)
  @js.native
  val default: (Plugin[js.Array[typingsJapgolly.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typingsJapgolly.unist.mod.Node[Data]]) = js.native
  
  type HastRoot = Root
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Parser = typingsJapgolly.unified.mod.Parser[Any]
  
  type ParserConstructor = typingsJapgolly.hastUtilToNlcst.libMod.ParserConstructor
  
  type ParserInstance = typingsJapgolly.hastUtilToNlcst.libMod.ParserInstance
  
  type Processor = typingsJapgolly.unified.mod.Processor[Any, Any, Any, Any]
  
  type _To = (Plugin[js.Array[typingsJapgolly.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typingsJapgolly.unist.mod.Node[Data]])
  
  /* This means you don't have to write `default`, but can instead just say `libMod.foo` */
  override def _to: (Plugin[js.Array[typingsJapgolly.unified.mod.Processor[Any, Any, Any, Any]], Root, Root]) & (Plugin[js.Array[Parser], Root, typingsJapgolly.unist.mod.Node[Data]]) = default
}
