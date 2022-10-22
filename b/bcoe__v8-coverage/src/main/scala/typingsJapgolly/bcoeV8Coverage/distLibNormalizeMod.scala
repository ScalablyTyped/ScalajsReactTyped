package typingsJapgolly.bcoeV8Coverage

import typingsJapgolly.bcoeV8Coverage.distLibRangeTreeMod.RangeTree
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.FunctionCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.ProcessCov
import typingsJapgolly.bcoeV8Coverage.distLibTypesMod.ScriptCov
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibNormalizeMod {
  
  @JSImport("@bcoe/v8-coverage/dist/lib/normalize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deepNormalizeProcessCov(processCov: ProcessCov): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepNormalizeProcessCov")(processCov.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def deepNormalizeScriptCov(scriptCov: ScriptCov): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("deepNormalizeScriptCov")(scriptCov.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def normalizeFunctionCov(funcCov: FunctionCov): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeFunctionCov")(funcCov.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def normalizeProcessCov(processCov: ProcessCov): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeProcessCov")(processCov.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def normalizeRangeTree(tree: RangeTree): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeRangeTree")(tree.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def normalizeScriptCov(scriptCov: ScriptCov): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeScriptCov")(scriptCov.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
