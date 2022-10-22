package typingsJapgolly.babelJest

import typingsJapgolly.babelCore.mod.TransformOptions
import typingsJapgolly.jestTransform.mod.SyncTransformer
import typingsJapgolly.jestTransform.mod.TransformerCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("babel-jest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createTransformer(): SyncTransformer[TransformOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")().asInstanceOf[SyncTransformer[TransformOptions]]
    inline def createTransformer(transformerConfig: TransformOptions): SyncTransformer[TransformOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("createTransformer")(transformerConfig.asInstanceOf[js.Any]).asInstanceOf[SyncTransformer[TransformOptions]]
    @JSImport("babel-jest", "default.createTransformer")
    @js.native
    def createTransformer_Fdefault: TransformerCreator[SyncTransformer[TransformOptions], TransformOptions] = js.native
    
    inline def createTransformer_Fdefault_=(x: TransformerCreator[SyncTransformer[TransformOptions], TransformOptions]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("createTransformer")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babel-jest", "createTransformer")
  @js.native
  val createTransformer: TransformerCreator[SyncTransformer[TransformOptions], TransformOptions] = js.native
}
