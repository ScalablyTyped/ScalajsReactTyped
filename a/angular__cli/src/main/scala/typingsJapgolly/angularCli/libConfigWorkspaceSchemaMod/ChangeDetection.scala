package typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ChangeDetection extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "ChangeDetection")
@js.native
object ChangeDetection extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ChangeDetection & String] = js.native
  
  @js.native
  sealed trait Default
    extends StObject
       with ChangeDetection
  /* "Default" */ val Default: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.ChangeDetection.Default & String = js.native
  
  @js.native
  sealed trait OnPush
    extends StObject
       with ChangeDetection
  /* "OnPush" */ val OnPush: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.ChangeDetection.OnPush & String = js.native
}
