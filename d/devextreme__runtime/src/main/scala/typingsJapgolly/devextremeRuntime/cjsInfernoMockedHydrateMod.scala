package typingsJapgolly.devextremeRuntime

import org.scalajs.dom.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cjsInfernoMockedHydrateMod {
  
  @JSImport("@devextreme/runtime/cjs/inferno/mocked/hydrate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hydrate(input: Any, parentDOM: Element): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def hydrate(input: Any, parentDOM: Element, callback: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hydrate")(input.asInstanceOf[js.Any], parentDOM.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
