package typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectType extends StObject
@JSImport("@schematics/angular/utility/workspace-models", "ProjectType")
@js.native
object ProjectType extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProjectType & String] = js.native
  
  @js.native
  sealed trait Application
    extends StObject
       with ProjectType
  /* "application" */ val Application: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.ProjectType.Application & String = js.native
  
  @js.native
  sealed trait Library
    extends StObject
       with ProjectType
  /* "library" */ val Library: typingsJapgolly.schematicsAngular.utilityWorkspaceModelsMod.ProjectType.Library & String = js.native
}
