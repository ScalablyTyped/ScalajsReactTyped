package typingsJapgolly.blazy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("Blazy")
  @js.native
  open class Blazy protected ()
    extends StObject
       with BlazyInstance {
    def this(options: BlazyOptions) = this()
  }
  @JSGlobal("Blazy")
  @js.native
  def Blazy: typingsJapgolly.blazy.Blazy = js.native
  inline def Blazy_=(x: typingsJapgolly.blazy.Blazy): Unit = js.Dynamic.global.updateDynamic("Blazy")(x.asInstanceOf[js.Any])
}
