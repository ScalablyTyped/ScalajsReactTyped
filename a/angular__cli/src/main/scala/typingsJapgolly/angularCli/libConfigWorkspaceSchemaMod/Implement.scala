package typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Implement extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "Implement")
@js.native
object Implement extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Implement & String] = js.native
  
  @js.native
  sealed trait CanActivate
    extends StObject
       with Implement
  /* "CanActivate" */ val CanActivate: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.Implement.CanActivate & String = js.native
  
  @js.native
  sealed trait CanActivateChild
    extends StObject
       with Implement
  /* "CanActivateChild" */ val CanActivateChild: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.Implement.CanActivateChild & String = js.native
  
  @js.native
  sealed trait CanDeactivate
    extends StObject
       with Implement
  /* "CanDeactivate" */ val CanDeactivate: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.Implement.CanDeactivate & String = js.native
  
  @js.native
  sealed trait CanLoad
    extends StObject
       with Implement
  /* "CanLoad" */ val CanLoad: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.Implement.CanLoad & String = js.native
}
