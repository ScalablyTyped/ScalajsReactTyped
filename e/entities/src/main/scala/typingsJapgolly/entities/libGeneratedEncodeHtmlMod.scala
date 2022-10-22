package typingsJapgolly.entities

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.entities.anon.O
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGeneratedEncodeHtmlMod extends Shortcut {
  
  @JSImport("entities/lib/generated/encode-html", JSImport.Default)
  @js.native
  val default: Map[Double, EncodeTrieNode] = js.native
  
  type EncodeTrieNode = String | O
  
  type _To = Map[Double, EncodeTrieNode]
  
  /* This means you don't have to write `default`, but can instead just say `libGeneratedEncodeHtmlMod.foo` */
  override def _to: Map[Double, EncodeTrieNode] = default
}
