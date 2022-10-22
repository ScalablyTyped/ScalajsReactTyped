package typingsJapgolly.detox

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.detox.mod.global.Detox.CircusTestEventListenerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runnersJestAssignReporterMod extends Shortcut {
  
  @JSImport("detox/runners/jest/assignReporter", JSImport.Namespace)
  @js.native
  val ^ : CircusTestEventListenerBase = js.native
  
  type _To = CircusTestEventListenerBase
  
  /* This means you don't have to write `^`, but can instead just say `runnersJestAssignReporterMod.foo` */
  override def _to: CircusTestEventListenerBase = ^
}
