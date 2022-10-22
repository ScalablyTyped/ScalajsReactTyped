package typingsJapgolly.jestCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("jest-cli", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def run(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: js.Array[String]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: js.Array[String], project: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def run(maybeArgv: Unit, project: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("run")(maybeArgv.asInstanceOf[js.Any], project.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
