package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.Active
import typingsJapgolly.victoryCore.anon.PathComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesArcMod.ArcProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Arc {
  
  inline def apply(props: ArcProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Arc")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Arc.defaultProps")
  @js.native
  def defaultProps: PathComponent = js.native
  inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "Arc.propTypes")
  @js.native
  def propTypes: Active = js.native
  inline def propTypes_=(x: Active): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
