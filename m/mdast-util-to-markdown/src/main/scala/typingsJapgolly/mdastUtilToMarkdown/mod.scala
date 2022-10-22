package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdastUtilToMarkdown.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("mdast-util-to-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toMarkdown(tree: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toMarkdown(tree: Node, options: typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toMarkdown")(tree.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Context = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type Handlers = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handlers
  
  type Join = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Join
  
  type Map = typingsJapgolly.mdastUtilToMarkdown.libUtilIndentLinesMod.Map
  
  type Options = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Options
  
  type SafeOptions = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.SafeOptions
  
  type Unsafe = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Unsafe
}
