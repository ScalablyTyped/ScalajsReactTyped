package typingsJapgolly.slateReact

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.MemoExoticComponent
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.slateReact.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsTextMod extends Shortcut {
  
  @JSImport("slate-react/dist/components/text", JSImport.Default)
  @js.native
  val default: MemoExoticComponent[js.Function1[/* props */ Parent, Element]] = js.native
  
  type _To = MemoExoticComponent[js.Function1[/* props */ Parent, Element]]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsTextMod.foo` */
  override def _to: MemoExoticComponent[js.Function1[/* props */ Parent, Element]] = default
}
