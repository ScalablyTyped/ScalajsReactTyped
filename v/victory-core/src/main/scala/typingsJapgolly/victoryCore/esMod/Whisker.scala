package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.DisableInlineStyles
import typingsJapgolly.victoryCore.anon.Role
import typingsJapgolly.victoryCore.esVictoryPrimitivesWhiskerMod.WhiskerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Whisker {
  
  inline def apply(props: WhiskerProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Whisker")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Whisker.defaultProps")
  @js.native
  def defaultProps: Role = js.native
  inline def defaultProps_=(x: Role): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "Whisker.propTypes")
  @js.native
  def propTypes: DisableInlineStyles = js.native
  inline def propTypes_=(x: DisableInlineStyles): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
