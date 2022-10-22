package typingsJapgolly.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibPreprocessMod {
  
  @JSImport("micromark/dev/lib/preprocess", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def preprocess(): Preprocessor = ^.asInstanceOf[js.Dynamic].applyDynamic("preprocess")().asInstanceOf[Preprocessor]
  
  type Chunk = typingsJapgolly.micromarkUtilTypes.mod.Chunk
  
  type Code = typingsJapgolly.micromarkUtilTypes.mod.Code
  
  type Encoding = typingsJapgolly.micromarkUtilTypes.mod.Encoding
  
  type Preprocessor = js.Function3[
    /* value */ Value, 
    /* encoding */ js.UndefOr[typingsJapgolly.micromarkUtilTypes.mod.Encoding], 
    /* end */ js.UndefOr[Boolean], 
    js.Array[Chunk]
  ]
  
  type Value = typingsJapgolly.micromarkUtilTypes.mod.Value
}
