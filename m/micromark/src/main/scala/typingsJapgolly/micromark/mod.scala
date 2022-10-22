package typingsJapgolly.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark", "micromark")
  @js.native
  val micromark: (js.Function3[
    /* value */ Value, 
    /* encoding */ Encoding, 
    /* options */ js.UndefOr[typingsJapgolly.micromarkUtilTypes.mod.Options], 
    String
  ]) & (js.Function2[
    /* value */ Value, 
    /* options */ js.UndefOr[typingsJapgolly.micromarkUtilTypes.mod.Options], 
    String
  ]) = js.native
  
  type Encoding = typingsJapgolly.micromarkUtilTypes.mod.Encoding
  
  type Options = typingsJapgolly.micromarkUtilTypes.mod.Options
  
  type Value = typingsJapgolly.micromarkUtilTypes.mod.Value
}
