package typingsJapgolly.tsJest

import typingsJapgolly.tsJest.distLegacyTsJestTransformerMod.TsJestTransformer
import typingsJapgolly.tsJest.distTypesMod.TsJestGlobalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyMod {
  
  object default {
    
    @JSImport("ts-jest/dist/legacy", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(): TsJestTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[TsJestTransformer]
    inline def createTransformer(tsJestConfig: TsJestGlobalOptions): TsJestTransformer = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(tsJestConfig.asInstanceOf[js.Any]).asInstanceOf[TsJestTransformer]
  }
}
