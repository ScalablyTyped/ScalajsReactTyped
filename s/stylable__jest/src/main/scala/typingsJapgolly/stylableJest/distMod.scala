package typingsJapgolly.stylableJest

import typingsJapgolly.stylableJest.anon.CanInstrument
import typingsJapgolly.stylableJest.anon.GetCacheKey
import typingsJapgolly.stylableJest.distJestMod.StylableJestConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@stylable/jest/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@stylable/jest/dist", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(): GetCacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[GetCacheKey]
    inline def createTransformer(options: StylableJestConfig): GetCacheKey = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(options.asInstanceOf[js.Any]).asInstanceOf[GetCacheKey]
  }
  
  inline def createTransformer(): CanInstrument = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[CanInstrument]
  inline def createTransformer(options: StylableJestConfig): CanInstrument = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(options.asInstanceOf[js.Any]).asInstanceOf[CanInstrument]
}
