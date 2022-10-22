package typingsJapgolly.angularDevkitBuildAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcBuildersKarmaFindTestsMod {
  
  @JSImport("@angular-devkit/build-angular/src/builders/karma/find-tests", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findTests(patterns: js.Array[String], workspaceRoot: String, projectSourceRoot: String): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("findTests")(patterns.asInstanceOf[js.Any], workspaceRoot.asInstanceOf[js.Any], projectSourceRoot.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
}
