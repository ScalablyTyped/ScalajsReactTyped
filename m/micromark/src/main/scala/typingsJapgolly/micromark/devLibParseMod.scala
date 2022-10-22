package typingsJapgolly.micromark

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object devLibParseMod {
  
  @JSImport("micromark/dev/lib/parse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): ParseContext = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[ParseContext]
  inline def parse(options: typingsJapgolly.micromarkUtilTypes.mod.ParseOptions): ParseContext = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(options.asInstanceOf[js.Any]).asInstanceOf[ParseContext]
  
  type Create = typingsJapgolly.micromarkUtilTypes.mod.Create
  
  type FullNormalizedExtension = typingsJapgolly.micromarkUtilTypes.mod.FullNormalizedExtension
  
  type InitialConstruct = typingsJapgolly.micromarkUtilTypes.mod.InitialConstruct
  
  type ParseContext = typingsJapgolly.micromarkUtilTypes.mod.ParseContext
  
  type ParseOptions = typingsJapgolly.micromarkUtilTypes.mod.ParseOptions
}
