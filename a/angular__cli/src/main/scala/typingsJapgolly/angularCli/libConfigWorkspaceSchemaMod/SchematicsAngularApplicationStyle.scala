package typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SchematicsAngularApplicationStyle extends StObject
@JSImport("@angular/cli/lib/config/workspace-schema", "SchematicsAngularApplicationStyle")
@js.native
object SchematicsAngularApplicationStyle extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[SchematicsAngularApplicationStyle & String] = js.native
  
  @js.native
  sealed trait Css
    extends StObject
       with SchematicsAngularApplicationStyle
  /* "css" */ val Css: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularApplicationStyle.Css & String = js.native
  
  @js.native
  sealed trait Less
    extends StObject
       with SchematicsAngularApplicationStyle
  /* "less" */ val Less: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularApplicationStyle.Less & String = js.native
  
  @js.native
  sealed trait Sass
    extends StObject
       with SchematicsAngularApplicationStyle
  /* "sass" */ val Sass: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularApplicationStyle.Sass & String = js.native
  
  @js.native
  sealed trait Scss
    extends StObject
       with SchematicsAngularApplicationStyle
  /* "scss" */ val Scss: typingsJapgolly.angularCli.libConfigWorkspaceSchemaMod.SchematicsAngularApplicationStyle.Scss & String = js.native
}
