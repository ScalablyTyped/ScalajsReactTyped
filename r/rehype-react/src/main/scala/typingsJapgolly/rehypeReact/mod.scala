package typingsJapgolly.rehypeReact

import japgolly.scalajs.react.facade.React.Element
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hast.mod.Root
import typingsJapgolly.rehypeReact.libMod.Options
import typingsJapgolly.unified.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /**
    * Plugin to compile to React
    *
    * @param options
    *   Configuration.
    */
  // Note: defining all react nodes as result value seems to trip TS up.
  @JSImport("rehype-react", JSImport.Default)
  @js.native
  val default: Plugin[js.Array[Options], Root, Element] = js.native
  
  type _To = Plugin[js.Array[Options], Root, Element]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: Plugin[js.Array[Options], Root, Element] = default
}
