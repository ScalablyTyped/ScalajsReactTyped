package typingsJapgolly.reactBootstrap.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-bootstrap", "Dropdown")
@js.native
open class Dropdown ()
  extends typingsJapgolly.reactBootstrap.libMod.Dropdown
object Dropdown {
  
  @JSImport("react-bootstrap", "Dropdown")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Dropdown.Menu")
  @js.native
  open class Menu ()
    extends typingsJapgolly.reactBootstrap.libDropdownMenuMod.^
  /* static member */
  @JSImport("react-bootstrap", "Dropdown.Menu")
  @js.native
  def Menu: Instantiable0[typingsJapgolly.reactBootstrap.libDropdownMenuMod.^] = js.native
  inline def Menu_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libDropdownMenuMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Menu")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("react-bootstrap", "Dropdown.Toggle")
  @js.native
  open class Toggle ()
    extends typingsJapgolly.reactBootstrap.libDropdownToggleMod.^
  /* static member */
  @JSImport("react-bootstrap", "Dropdown.Toggle")
  @js.native
  def Toggle: Instantiable0[typingsJapgolly.reactBootstrap.libDropdownToggleMod.^] = js.native
  inline def Toggle_=(x: Instantiable0[typingsJapgolly.reactBootstrap.libDropdownToggleMod.^]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Toggle")(x.asInstanceOf[js.Any])
}
