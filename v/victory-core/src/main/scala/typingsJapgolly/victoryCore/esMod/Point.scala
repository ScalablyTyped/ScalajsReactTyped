package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.PathComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesPointMod.PointProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Point {
  
  inline def apply(props: PointProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Point")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Point.defaultProps")
  @js.native
  def defaultProps: PathComponent = js.native
  inline def defaultProps_=(x: PathComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "Point.propTypes")
  @js.native
  def propTypes: typingsJapgolly.victoryCore.anon.Data = js.native
  inline def propTypes_=(x: typingsJapgolly.victoryCore.anon.Data): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
