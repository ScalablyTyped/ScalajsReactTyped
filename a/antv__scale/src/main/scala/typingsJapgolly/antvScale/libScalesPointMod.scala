package typingsJapgolly.antvScale

import typingsJapgolly.antvScale.libScalesBandMod.Band
import typingsJapgolly.antvScale.libTypesMod.BandOptions
import typingsJapgolly.antvScale.libTypesMod.PointOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libScalesPointMod {
  
  @JSImport("@antv/scale/lib/scales/point", "Point")
  @js.native
  open class Point () extends Band[PointOptions & BandOptions] {
    def this(options: PointOptions) = this()
    
    def update(options: PointOptions): Unit = js.native
  }
}
