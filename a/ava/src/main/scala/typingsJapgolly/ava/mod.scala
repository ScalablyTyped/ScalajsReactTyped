package typingsJapgolly.ava

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.ava.typesTestFnMod.TestFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /** Call to declare a test, or chain to declare hooks or test modifiers */
  @JSImport("ava", JSImport.Default)
  @js.native
  val default: TestFn[Any] = js.native
  
  type _To = TestFn[Any]
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: TestFn[Any] = default
}
