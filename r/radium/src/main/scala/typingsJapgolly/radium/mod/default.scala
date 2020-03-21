package typingsJapgolly.radium.mod

import typingsJapgolly.radium.mod.Radium.RadiumConfig
import typingsJapgolly.radium.mod.Radium.RadiumTestMode
import typingsJapgolly.radium.mod.Radium.StyleProps
import typingsJapgolly.radium.mod.Radium.StyleRootProps
import typingsJapgolly.radium.mod.Radium.StyleRules
import typingsJapgolly.radium.radiumStrings.Colonactive
import typingsJapgolly.radium.radiumStrings.Colonfocus
import typingsJapgolly.radium.radiumStrings.Colonhover
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("radium", JSImport.Default)
@js.native
object default extends js.Object {
  @js.native
  class Style ()
    extends Component[StyleProps, js.Object, js.Any]
  
  @js.native
  class StyleRoot ()
    extends Component[StyleRootProps, js.Object, js.Any]
  
  var TestMode: RadiumTestMode = js.native
  def apply(config: RadiumConfig): js.Function1[/* component */ js.UndefOr[js.Any], _] = js.native
  // @Radium decorator
  def apply[TElement /* <: js.Function */](component: TElement): TElement = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: String, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_active(state: js.Any, elementKey: Unit, value: Colonactive): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: String, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_focus(state: js.Any, elementKey: Unit, value: Colonfocus): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: String, value: Colonhover): Boolean = js.native
  @JSName("getState")
  def getState_hover(state: js.Any, elementKey: Unit, value: Colonhover): Boolean = js.native
  def keyframes(keyframes: StyleRules): js.Object = js.native
  def keyframes(keyframes: StyleRules, name: String): js.Object = js.native
}

