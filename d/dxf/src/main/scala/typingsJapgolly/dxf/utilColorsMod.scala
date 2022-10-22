package typingsJapgolly.dxf

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.dxf.commonMod.ColorNumbers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilColorsMod extends Shortcut {
  
  @JSImport("dxf/util/colors", JSImport.Default)
  @js.native
  val default: ColorNumbers = js.native
  
  type _To = ColorNumbers
  
  /* This means you don't have to write `default`, but can instead just say `utilColorsMod.foo` */
  override def _to: ColorNumbers = default
}
