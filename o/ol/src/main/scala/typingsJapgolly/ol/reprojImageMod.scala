package typingsJapgolly.ol

import typingsJapgolly.ol.extentMod.Extent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reprojImageMod {
  
  @JSImport("ol/reproj/Image", JSImport.Default)
  @js.native
  open class default protected () extends ReprojImage {
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType
    ) = this()
    def this(
      sourceProj: typingsJapgolly.ol.projProjectionMod.default,
      targetProj: typingsJapgolly.ol.projProjectionMod.default,
      targetExtent: Extent,
      targetResolution: Double,
      pixelRatio: Double,
      getImageFunction: FunctionType,
      opt_contextOptions: Any
    ) = this()
  }
  
  type FunctionType = js.Function3[
    /* p0 */ Extent, 
    /* p1 */ Double, 
    /* p2 */ Double, 
    typingsJapgolly.ol.imageBaseMod.default
  ]
  
  @js.native
  trait ReprojImage
    extends typingsJapgolly.ol.imageBaseMod.default {
    
    def getProjection(): typingsJapgolly.ol.projProjectionMod.default = js.native
  }
}
