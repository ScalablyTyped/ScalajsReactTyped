package typingsJapgolly.stylus.anon

import org.scalablytyped.runtime.Instantiable4
import typingsJapgolly.stylus.mod.Stylus.Nodes.HSLA
import typingsJapgolly.stylus.mod.Stylus.Nodes.RGBA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHSLA
  extends StObject
     with Instantiable4[/* h */ Double, /* s */ Double, /* l */ Double, /* a */ Double, HSLA] {
  
  /**
    * Return a `HSLA` from the given `hsla`.
    */
  def fromRGBA(rgba: RGBA): HSLA = js.native
}
