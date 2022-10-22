package typingsJapgolly.tsJest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyCompilerCompilerUtilsMod {
  
  @JSImport("ts-jest/dist/legacy/compiler/compiler-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ts-jest/dist/legacy/compiler/compiler-utils", "SOURCE_MAPPING_PREFIX")
  @js.native
  val SOURCE_MAPPING_PREFIX: /* "sourceMappingURL=" */ String = js.native
  
  inline def updateOutput(outputText: String, normalizedFileName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("updateOutput")(outputText.asInstanceOf[js.Any], normalizedFileName.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def updateOutput(outputText: String, normalizedFileName: String, sourceMap: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("updateOutput")(outputText.asInstanceOf[js.Any], normalizedFileName.asInstanceOf[js.Any], sourceMap.asInstanceOf[js.Any])).asInstanceOf[String]
}
