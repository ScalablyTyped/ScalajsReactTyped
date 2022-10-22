package typingsJapgolly.morrisJs

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.morrisJs.morris.MorrisStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morrisMod extends Shortcut {
  
  @JSImport("morris", JSImport.Namespace)
  @js.native
  val ^ : MorrisStatic = js.native
  
  type _To = MorrisStatic
  
  /* This means you don't have to write `^`, but can instead just say `morrisMod.foo` */
  override def _to: MorrisStatic = ^
}
