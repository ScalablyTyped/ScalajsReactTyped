package typingsJapgolly.alt

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.alt.AltJS.Alt
import typingsJapgolly.alt.AltJS.AltConfig
import typingsJapgolly.alt.AltJS.AltFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("alt", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Alt {
    def this(config: AltConfig) = this()
  }
  @JSImport("alt", JSImport.Namespace)
  @js.native
  val ^ : js.Object & AltFactory = js.native
  
  type _To = js.Object & AltFactory
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & AltFactory = ^
}
