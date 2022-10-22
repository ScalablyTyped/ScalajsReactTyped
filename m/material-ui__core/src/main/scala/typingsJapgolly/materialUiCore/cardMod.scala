package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.cardCardMod.CardProps
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("@material-ui/core/Card", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: CardProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
