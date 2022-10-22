package typingsJapgolly.remarkRetext

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.mdast.mod.Root
import typingsJapgolly.unified.mod.Plugin
import typingsJapgolly.unist.mod.Data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod extends Shortcut {
  
  /**
    * Plugin to support retext.
    *
    * *   If a destination processor is given, runs the plugins attached to it with
    *     the new nlcst tree (bridge-mode).
    *     This given processor must have a parser attached (this can be done by
    *     using the plugin `retext-english` or similar) and should use other retext
    *     plugins.
    * *   If a parser is given, runs further plugins attached to the same processor
    *     with the new tree (mutate-mode).
    *     Such parsers are exported by packages like `retext-english` as `Parser`.
    *     You should use other retext plugins after `remark-retext`.
    *
    * @param destination
    *   Either a processor (`unified().use(retextEnglish)…`) or a parser.
    * @param options
    *   Configuration passed to `mdast-util-to-nlcst`.
    */
  @JSImport("remark-retext/lib", JSImport.Default)
  @js.native
  val default: (Plugin[
    (js.Tuple2[Processor, js.UndefOr[Options]]) | js.Array[Processor], 
    MdastRoot, 
    MdastRoot
  ]) & (Plugin[(js.Tuple2[Parser, js.UndefOr[Options]]) | js.Array[Parser], MdastRoot, Node]) = js.native
  
  type MdastRoot = Root
  
  type Node = typingsJapgolly.unist.mod.Node[Data]
  
  type Options = typingsJapgolly.mdastUtilToNlcst.mod.Options
  
  type Parser = typingsJapgolly.unified.mod.Parser[Any]
  
  type ParserConstructor = typingsJapgolly.mdastUtilToNlcst.mod.ParserConstructor
  
  type ParserInstance = typingsJapgolly.mdastUtilToNlcst.mod.ParserInstance
  
  type Processor = typingsJapgolly.unified.mod.Processor[Any, Any, Any, Any]
  
  type _To = (Plugin[
    (js.Tuple2[Processor, js.UndefOr[Options]]) | js.Array[Processor], 
    MdastRoot, 
    MdastRoot
  ]) & (Plugin[(js.Tuple2[Parser, js.UndefOr[Options]]) | js.Array[Parser], MdastRoot, Node])
  
  /* This means you don't have to write `default`, but can instead just say `libMod.foo` */
  override def _to: (Plugin[
    (js.Tuple2[Processor, js.UndefOr[Options]]) | js.Array[Processor], 
    MdastRoot, 
    MdastRoot
  ]) & (Plugin[(js.Tuple2[Parser, js.UndefOr[Options]]) | js.Array[Parser], MdastRoot, Node]) = default
}
