package typingsJapgolly.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formToggleMod extends Shortcut {
  
  @JSImport("@wordpress/components/form-toggle", JSImport.Default)
  @js.native
  val default: ComponentType[HTMLProps[HTMLInputElement]] = js.native
  
  type _To = ComponentType[HTMLProps[HTMLInputElement]]
  
  /* This means you don't have to write `default`, but can instead just say `formToggleMod.foo` */
  override def _to: ComponentType[HTMLProps[HTMLInputElement]] = default
}
