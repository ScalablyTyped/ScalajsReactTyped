package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.angularDevkitArchitect.srcInternalMod.Builder
import typingsJapgolly.angularDevkitBuildAngular.srcBuildersAppShellSchemaMod.Schema
import typingsJapgolly.angularDevkitCore.srcJsonUtilsMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersAppShellMod extends Shortcut {
  
  @JSImport("@angular-devkit/build-angular/src/builders/app-shell", JSImport.Default)
  @js.native
  val default: Builder[Schema & JsonObject] = js.native
  
  type _To = Builder[Schema & JsonObject]
  
  /* This means you don't have to write `default`, but can instead just say `srcBuildersAppShellMod.foo` */
  override def _to: Builder[Schema & JsonObject] = default
}
