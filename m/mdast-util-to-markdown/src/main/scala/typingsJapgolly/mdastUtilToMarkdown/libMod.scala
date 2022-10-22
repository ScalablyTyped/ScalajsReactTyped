package typingsJapgolly.mdastUtilToMarkdown

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMod {
  
  @JSImport("mdast-util-to-markdown/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Join = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Join
  
  type Node = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Node
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
  
  type Unsafe = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Unsafe
}
