package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.victoryCore.anon.ClassName
import typingsJapgolly.victoryCore.anon.RectComponent
import typingsJapgolly.victoryCore.esVictoryPrimitivesBorderMod.BorderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Box {
  
  inline def apply(props: BorderProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("victory-core/es", "Box")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "Box.defaultProps")
  @js.native
  def defaultProps: RectComponent = js.native
  inline def defaultProps_=(x: RectComponent): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "Box.propTypes")
  @js.native
  def propTypes: ClassName = js.native
  inline def propTypes_=(x: ClassName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
}
