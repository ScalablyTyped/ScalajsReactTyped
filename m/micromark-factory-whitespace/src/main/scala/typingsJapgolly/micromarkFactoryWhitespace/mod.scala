package typingsJapgolly.micromarkFactoryWhitespace

import typingsJapgolly.micromarkUtilTypes.mod.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-whitespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryWhitespace(effects: Effects, ok: State): js.Function1[/* code */ Code, Unit | typingsJapgolly.micromarkUtilTypes.mod.State] = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryWhitespace")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* code */ Code, Unit | typingsJapgolly.micromarkUtilTypes.mod.State]]
  
  type Effects = typingsJapgolly.micromarkUtilTypes.mod.Effects
  
  type State = typingsJapgolly.micromarkUtilTypes.mod.State
}
