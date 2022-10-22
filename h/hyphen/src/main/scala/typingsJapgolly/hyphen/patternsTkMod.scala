package typingsJapgolly.hyphen

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.hyphen.mod.PatternsDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patternsTkMod extends Shortcut {
  
  @JSImport("hyphen/patterns/tk", JSImport.Namespace)
  @js.native
  val ^ : PatternsDefinition = js.native
  
  type _To = PatternsDefinition
  
  /* This means you don't have to write `^`, but can instead just say `patternsTkMod.foo` */
  override def _to: PatternsDefinition = ^
}
