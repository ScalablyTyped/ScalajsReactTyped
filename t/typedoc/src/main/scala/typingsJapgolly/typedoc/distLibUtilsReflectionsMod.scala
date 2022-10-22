package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.anon.Owner
import typingsJapgolly.typedoc.distLibModelsMod.ProjectReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsReflectionsMod {
  
  @JSImport("typedoc/dist/lib/utils/reflections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def discoverAllReferenceTypes(project: ProjectReflection, forExportValidation: Boolean): js.Array[Owner] = (^.asInstanceOf[js.Dynamic].applyDynamic("discoverAllReferenceTypes")(project.asInstanceOf[js.Any], forExportValidation.asInstanceOf[js.Any])).asInstanceOf[js.Array[Owner]]
}
