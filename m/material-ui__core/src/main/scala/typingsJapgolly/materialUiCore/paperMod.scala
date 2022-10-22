package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.paperPaperMod.PaperProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paperMod {
  
  @JSImport("@material-ui/core/Paper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: PaperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
