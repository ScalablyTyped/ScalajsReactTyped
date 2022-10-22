package typingsJapgolly.victoryCore.esMod

import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.react.mod.ValidationMap
import typingsJapgolly.victoryCore.anon.Fill
import typingsJapgolly.victoryCore.anon.PartialVictoryLabelProps
import typingsJapgolly.victoryCore.anon.WeakValidationMapVictoryL
import typingsJapgolly.victoryCore.esVictoryLabelVictoryLabelMod.VictoryLabelProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  role :string,   defaultStyles :{  fill :string,   fontSize :number,   fontFamily :string,   stroke :string}} & react.react.FC<victory-core.victory-core/es/victory-label/victory-label.VictoryLabelProps> */
object VictoryLabel {
  
  inline def apply(props: VictoryLabelProps): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  inline def apply(props: VictoryLabelProps, context: Any): Element | Null = (^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Element | Null]
  
  @JSImport("victory-core/es", "VictoryLabel")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("victory-core/es", "VictoryLabel.contextTypes")
  @js.native
  def contextTypes: js.UndefOr[ValidationMap[Any]] = js.native
  inline def contextTypes_=(x: js.UndefOr[ValidationMap[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryLabel.defaultProps")
  @js.native
  def defaultProps: js.UndefOr[PartialVictoryLabelProps] = js.native
  inline def defaultProps_=(x: js.UndefOr[PartialVictoryLabelProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryLabel.defaultStyles")
  @js.native
  def defaultStyles: Fill = js.native
  inline def defaultStyles_=(x: Fill): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultStyles")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryLabel.displayName")
  @js.native
  def displayName: js.UndefOr[String] = js.native
  inline def displayName_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryLabel.propTypes")
  @js.native
  def propTypes: js.UndefOr[WeakValidationMapVictoryL] = js.native
  inline def propTypes_=(x: js.UndefOr[WeakValidationMapVictoryL]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  
  @JSImport("victory-core/es", "VictoryLabel.role")
  @js.native
  def role: String = js.native
  inline def role_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("role")(x.asInstanceOf[js.Any])
}
