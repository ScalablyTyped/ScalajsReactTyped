package typingsJapgolly.trueCasePath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("true-case-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def trueCasePath(filePath: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("trueCasePath")(filePath.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def trueCasePath(filePath: String, basePath: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("trueCasePath")(filePath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def trueCasePathSync(filePath: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trueCasePathSync")(filePath.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trueCasePathSync(filePath: String, basePath: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trueCasePathSync")(filePath.asInstanceOf[js.Any], basePath.asInstanceOf[js.Any])).asInstanceOf[String]
}
