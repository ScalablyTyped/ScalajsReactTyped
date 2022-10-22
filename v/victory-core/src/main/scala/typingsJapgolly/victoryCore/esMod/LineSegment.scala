package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.LineComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesLineSegmentMod.LineSegmentProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineSegment {
  
  inline def apply(props: LineSegmentProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "LineSegment")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "LineSegment.defaultProps")
  @js.native
  def defaultProps: LineComponent = js.native
  inline def defaultProps_=(x: LineComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "LineSegment.propTypes")
  @js.native
  def propTypes: typingsJapgolly.victoryCore.anon.ClipPath = js.native
  inline def propTypes_=(x: typingsJapgolly.victoryCore.anon.ClipPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
