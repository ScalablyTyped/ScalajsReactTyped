package typingsJapgolly.configFileTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileUtilMod {
  
  @JSImport("config-file-ts/dist/compileUtil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileConfigIfNecessary(tsFile: String, outDir: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileConfigIfNecessary")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  inline def compileConfigIfNecessary(tsFile: String, outDir: String, strict: Boolean): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compileConfigIfNecessary")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def compileIfNecessary(sources: js.Array[String], outDir: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compileIfNecessary")(sources.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compileIfNecessary(sources: js.Array[String], outDir: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compileIfNecessary")(sources.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def expectFilesExist(files: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("expectFilesExist")(files.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jsOutFile(tsFile: String, outDir: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsOutFile")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def nearestNodeModules(dir: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nearestNodeModules")(dir.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def needsCompile(srcGlobs: js.Array[String], outDir: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("needsCompile")(srcGlobs.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def symLinkForce(existing: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symLinkForce")(existing.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
