package typingsJapgolly.antd

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.antd.libGridColMod.ColProps
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libColMod extends Shortcut {
  
  @JSImport("antd/lib/col", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]] = js.native
  
  type _To = ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `libColMod.foo` */
  override def _to: ForwardRefExoticComponent[ColProps & RefAttributes[HTMLDivElement]] = default
}
