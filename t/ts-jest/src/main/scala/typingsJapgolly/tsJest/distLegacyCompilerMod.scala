package typingsJapgolly.tsJest

import typingsJapgolly.tsJest.distLegacyConfigConfigSetMod.ConfigSet
import typingsJapgolly.tsJest.distTypesMod.StringMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLegacyCompilerMod {
  
  @JSImport("ts-jest/dist/legacy/compiler", "TsCompiler")
  @js.native
  open class TsCompiler protected ()
    extends typingsJapgolly.tsJest.distLegacyCompilerTsCompilerMod.TsCompiler {
    def this(configSet: ConfigSet, runtimeCacheFS: StringMap) = this()
  }
  
  @JSImport("ts-jest/dist/legacy/compiler", "TsJestCompiler")
  @js.native
  open class TsJestCompiler protected ()
    extends typingsJapgolly.tsJest.distLegacyCompilerTsJestCompilerMod.TsJestCompiler {
    def this(configSet: ConfigSet, runtimeCacheFS: StringMap) = this()
  }
}
