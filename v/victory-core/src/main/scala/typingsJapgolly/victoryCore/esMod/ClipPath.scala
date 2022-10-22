package typingsJapgolly.victoryCore.esMod

import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.victoryCore.anon.Children
import typingsJapgolly.victoryCore.esVictoryPrimitivesClipPathMod.ClipPathProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ClipPath {
  
  inline def apply(props: ClipPathProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "ClipPath")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "ClipPath.propTypes")
  @js.native
  def propTypes: Children = js.native
  inline def propTypes_=(x: Children): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
