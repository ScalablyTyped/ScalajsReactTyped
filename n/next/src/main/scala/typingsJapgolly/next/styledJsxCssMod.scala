package typingsJapgolly.next

import typingsJapgolly.next.anon.ClassName
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.std.TemplateStringsArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object styledJsxCssMod {
  
  inline def apply(chunks: TemplateStringsArray, args: Any*): Element = ^.asInstanceOf[js.Dynamic].apply(scala.List(chunks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
  
  @JSImport("styled-jsx/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def global(chunks: TemplateStringsArray, args: Any*): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("global")(scala.List(chunks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Element]
  
  inline def resolve(chunks: TemplateStringsArray, args: Any*): ClassName = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(scala.List(chunks.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ClassName]
}
