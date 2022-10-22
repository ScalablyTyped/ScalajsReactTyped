package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.AriaLabel_
import typingsJapgolly.victoryCore.anon.CircleComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesBackgroundMod.BackgroundProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Background {
  
  inline def apply(props: BackgroundProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Background")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Background.defaultProps")
  @js.native
  def defaultProps: CircleComponent = js.native
  inline def defaultProps_=(x: CircleComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "Background.propTypes")
  @js.native
  def propTypes: AriaLabel_ = js.native
  inline def propTypes_=(x: AriaLabel_): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
