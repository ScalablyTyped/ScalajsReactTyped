package typingsJapgolly.remarkParse

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.mdast.mod.Root
import typingsJapgolly.remarkParse.libMod.Options
import typingsJapgolly.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("remark-parse", JSImport.Default)
  @js.native
  val default: Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root] = js.native
  
  type _To = Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[js.UndefOr[Options | Unit]], String, Root] = default
}
