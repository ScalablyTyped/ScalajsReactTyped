package typingsJapgolly.configFileTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("config-file-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileIfNecessary(sources: js.Array[String], outDir: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compileIfNecessary")(sources.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def compileIfNecessary(sources: js.Array[String], outDir: String, strict: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("compileIfNecessary")(sources.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def defaultOutDir(tsFile: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultOutDir")(tsFile.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def defaultOutDir(tsFile: String, programName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultOutDir")(tsFile.asInstanceOf[js.Any], programName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def expectFilesExist(files: js.Array[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("expectFilesExist")(files.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def jsOutFile(tsFile: String, outDir: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("jsOutFile")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def loadTsConfig[T](tsFile: String): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadTsConfig")(tsFile.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  inline def loadTsConfig[T](tsFile: String, outDir: String): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsConfig")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def loadTsConfig[T](tsFile: String, outDir: String, strict: Boolean): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsConfig")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  inline def loadTsConfig[T](tsFile: String, outDir: Unit, strict: Boolean): js.UndefOr[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("loadTsConfig")(tsFile.asInstanceOf[js.Any], outDir.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[T]]
  
  inline def symLinkForce(existing: String, link: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symLinkForce")(existing.asInstanceOf[js.Any], link.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
