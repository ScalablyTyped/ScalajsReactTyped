package typingsJapgolly.openseadragon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BROWSERS extends StObject
@JSImport("openseadragon", "BROWSERS")
@js.native
object BROWSERS extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BROWSERS & Double] = js.native
  
  @js.native
  sealed trait CHROME
    extends StObject
       with BROWSERS
  /* 4 */ val CHROME: typingsJapgolly.openseadragon.mod.BROWSERS.CHROME & Double = js.native
  
  @js.native
  sealed trait CHROMEEDGE
    extends StObject
       with BROWSERS
  /* 7 */ val CHROMEEDGE: typingsJapgolly.openseadragon.mod.BROWSERS.CHROMEEDGE & Double = js.native
  
  @js.native
  sealed trait EDGE
    extends StObject
       with BROWSERS
  /* 6 */ val EDGE: typingsJapgolly.openseadragon.mod.BROWSERS.EDGE & Double = js.native
  
  @js.native
  sealed trait FIREFOX
    extends StObject
       with BROWSERS
  /* 2 */ val FIREFOX: typingsJapgolly.openseadragon.mod.BROWSERS.FIREFOX & Double = js.native
  
  @js.native
  sealed trait IE
    extends StObject
       with BROWSERS
  /* 1 */ val IE: typingsJapgolly.openseadragon.mod.BROWSERS.IE & Double = js.native
  
  @js.native
  sealed trait OPERA
    extends StObject
       with BROWSERS
  /* 5 */ val OPERA: typingsJapgolly.openseadragon.mod.BROWSERS.OPERA & Double = js.native
  
  @js.native
  sealed trait SAFARI
    extends StObject
       with BROWSERS
  /* 3 */ val SAFARI: typingsJapgolly.openseadragon.mod.BROWSERS.SAFARI & Double = js.native
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with BROWSERS
  /* 0 */ val UNKNOWN: typingsJapgolly.openseadragon.mod.BROWSERS.UNKNOWN & Double = js.native
}
