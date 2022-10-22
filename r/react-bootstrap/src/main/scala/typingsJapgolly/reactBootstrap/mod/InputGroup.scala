package typingsJapgolly.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "InputGroup")
@js.native
open class InputGroup ()
  extends typingsJapgolly.reactBootstrap.libMod.InputGroup
object InputGroup {
  
  @JSImport("react-bootstrap", "InputGroup")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "InputGroup.Addon")
  @js.native
  open class Addon ()
    extends typingsJapgolly.reactBootstrap.libInputGroupAddonMod.^
  /* static member */
  @JSImport("react-bootstrap", "InputGroup.Addon")
  @js.native
  def Addon: Instantiable0[typingsJapgolly.reactBootstrap.libInputGroupAddonMod.^] = js.native
  inline def Addon_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libInputGroupAddonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Addon")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "InputGroup.Button")
  @js.native
  open class Button ()
    extends typingsJapgolly.reactBootstrap.libInputGroupButtonMod.^
  /* static member */
  @JSImport("react-bootstrap", "InputGroup.Button")
  @js.native
  def Button: Instantiable0[typingsJapgolly.reactBootstrap.libInputGroupButtonMod.^] = js.native
  inline def Button_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libInputGroupButtonMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Button")(x.asInstanceOf[js.Any])
}
