package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.victoryCore.anon.Desc
import typingsJapgolly.victoryCore.esVictoryPrimitivesTextMod.TextProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Text {
  
  inline def apply(props: TextProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Text")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Text.propTypes")
  @js.native
  def propTypes: Desc = js.native
  inline def propTypes_=(x: Desc): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
