package typingsJapgolly.downshift.mod

import typingsJapgolly.downshift.anon.BlurButton
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("downshift", JSImport.Default)
@js.native
open class default[Item] ()
  extends Component[DownshiftProps[Item], js.Object, Any]
/* static members */
object default {
  
  @JSImport("downshift", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("downshift", "default.stateChangeTypes")
  @js.native
  def stateChangeTypes: BlurButton = js.native
  inline def stateChangeTypes_=(x: BlurButton): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stateChangeTypes")(x.asInstanceOf[js.Any])
}
