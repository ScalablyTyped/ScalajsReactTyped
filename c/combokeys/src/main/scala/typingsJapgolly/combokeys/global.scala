package typingsJapgolly.combokeys

import org.scalajs.dom.Element
import typingsJapgolly.combokeys.Combokeys.CombokeysStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("combokeys")
  @js.native
  open class combokeys protected ()
    extends StObject
       with typingsJapgolly.combokeys.Combokeys.Combokeys {
    def this(element: Element) = this()
  }
  @JSGlobal("combokeys")
  @js.native
  def combokeys: CombokeysStatic = js.native
  inline def combokeys_=(x: CombokeysStatic): Unit = js.Dynamic.global.updateDynamic("combokeys")(x.asInstanceOf[js.Any])
}
