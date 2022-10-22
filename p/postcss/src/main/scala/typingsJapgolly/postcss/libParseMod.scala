package typingsJapgolly.postcss

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.postcss.mod.Parser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libParseMod extends Shortcut {
  
  @JSImport("postcss/lib/parse", JSImport.Default)
  @js.native
  val default: Parser[
    typingsJapgolly.postcss.libRootMod.default | typingsJapgolly.postcss.libDocumentMod.default
  ] = js.native
  
  type _To = Parser[
    typingsJapgolly.postcss.libRootMod.default | typingsJapgolly.postcss.libDocumentMod.default
  ]
  
  /* This means you don't have to write `default`, but can instead just say `libParseMod.foo` */
  override def _to: Parser[
    typingsJapgolly.postcss.libRootMod.default | typingsJapgolly.postcss.libDocumentMod.default
  ] = default
}
