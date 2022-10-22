package typingsJapgolly.photoshop.domConstantsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ResampleMethod extends StObject
@JSImport("photoshop/dom/Constants", "ResampleMethod")
@js.native
object ResampleMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ResampleMethod & String] = js.native
  
  /**
    * Choose best option automatically
    */
  @js.native
  sealed trait AUTOMATIC
    extends StObject
       with ResampleMethod
  /* "bicubicAutomatic" */ val AUTOMATIC: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.AUTOMATIC & String = js.native
  
  /**
    * Bicubic interpolation
    */
  @js.native
  sealed trait BICUBIC
    extends StObject
       with ResampleMethod
  /* "bicubic" */ val BICUBIC: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.BICUBIC & String = js.native
  
  /**
    * Apply a sharpening mask
    */
  @js.native
  sealed trait BICUBICSHARPER
    extends StObject
       with ResampleMethod
  /* "bicubicSharper" */ val BICUBICSHARPER: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.BICUBICSHARPER & String = js.native
  
  /**
    * Apply a smoothing mask
    */
  @js.native
  sealed trait BICUBICSMOOTHER
    extends StObject
       with ResampleMethod
  /* "bicubicSmoother" */ val BICUBICSMOOTHER: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.BICUBICSMOOTHER & String = js.native
  
  /**
    * Bilinear interpolate
    */
  @js.native
  sealed trait BILINEAR
    extends StObject
       with ResampleMethod
  /* "bilinear" */ val BILINEAR: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.BILINEAR & String = js.native
  
  /**
    * Using deep learning, predict what the picture will look like larger
    */
  @js.native
  sealed trait DEEPUPSCALE
    extends StObject
       with ResampleMethod
  /* "deepUpscale" */ val DEEPUPSCALE: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.DEEPUPSCALE & String = js.native
  
  /**
    * Determine value based on nearest neighbor
    */
  @js.native
  sealed trait NEARESTNEIGHBOR
    extends StObject
       with ResampleMethod
  /* "nearestNeighbor" */ val NEARESTNEIGHBOR: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.NEARESTNEIGHBOR & String = js.native
  
  /**
    * Duplicates pixels
    */
  @js.native
  sealed trait NONE
    extends StObject
       with ResampleMethod
  /* "none" */ val NONE: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.NONE & String = js.native
  
  /**
    * Attempt to preserve details by using machine learning
    */
  @js.native
  sealed trait PRESERVEDETAILS
    extends StObject
       with ResampleMethod
  /* "preserveDetailsUpscale" */ val PRESERVEDETAILS: typingsJapgolly.photoshop.domConstantsMod.ResampleMethod.PRESERVEDETAILS & String = js.native
}
