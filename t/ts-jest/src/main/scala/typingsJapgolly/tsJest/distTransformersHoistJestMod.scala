package typingsJapgolly.tsJest

import typingsJapgolly.tsJest.distTypesMod.TsCompilerInstance
import typingsJapgolly.typescript.mod.SourceFile
import typingsJapgolly.typescript.mod.TransformationContext
import typingsJapgolly.typescript.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformersHoistJestMod {
  
  @JSImport("ts-jest/dist/transformers/hoist-jest", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factory(hasConfigSet: TsCompilerInstance): js.Function1[/* ctx */ TransformationContext, Transformer[SourceFile]] = ^.asInstanceOf[js.Dynamic].applyDynamic("factory")(hasConfigSet.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* ctx */ TransformationContext, Transformer[SourceFile]]]
  
  @JSImport("ts-jest/dist/transformers/hoist-jest", "name")
  @js.native
  val name: /* "hoist-jest" */ String = js.native
  
  @JSImport("ts-jest/dist/transformers/hoist-jest", "version")
  @js.native
  val version: /* 4 */ Double = js.native
}
