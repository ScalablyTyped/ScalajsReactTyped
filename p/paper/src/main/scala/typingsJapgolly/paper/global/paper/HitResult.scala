package typingsJapgolly.paper.global.paper

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
  * A HitResult object contains information about the results of a hit
  * test. It is returned by {@link Item#hitTest} and
  * {@link Project#hitTest}.
  */
@JSGlobal("paper.HitResult")
@js.native
open class HitResult ()
  extends StObject
     with typingsJapgolly.paper.paper.HitResult {
  
  /** 
    * If the HitResult has a type of 'pixel', this property refers to the color
    * of the pixel on the {@link Raster} that was hit.
    */
  /* CompleteClass */
  var color: typingsJapgolly.paper.paper.Color | Null = js.native
  
  /** 
    * The item that was hit.
    */
  /* CompleteClass */
  var item: typingsJapgolly.paper.paper.Item = js.native
  
  /** 
    * If the HitResult has a type of 'curve' or 'stroke', this property gives
    * more information about the exact position that was hit on the path.
    */
  /* CompleteClass */
  var location: typingsJapgolly.paper.paper.CurveLocation = js.native
  
  /** 
    * If the HitResult has a {@link HitResult#type} of `'bounds'`, this
    * property describes which corner of the bounding rectangle was hit.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /** 
    * Describes the actual coordinates of the segment, handle or bounding box
    * corner that was hit.
    */
  /* CompleteClass */
  var point: typingsJapgolly.paper.paper.Point = js.native
  
  /** 
    * If the HitResult has a type of 'stroke', 'segment', 'handle-in' or
    * 'handle-out', this property refers to the segment that was hit or that
    * is closest to the hitResult.location on the curve.
    */
  /* CompleteClass */
  var segment: typingsJapgolly.paper.paper.Segment = js.native
  
  /** 
    * Describes the type of the hit result. For example, if you hit a segment
    * point, the type would be `'segment'`.
    */
  /* CompleteClass */
  var `type`: String = js.native
}
