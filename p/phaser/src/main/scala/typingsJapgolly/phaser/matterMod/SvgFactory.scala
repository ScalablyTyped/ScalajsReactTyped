package typingsJapgolly.phaser.matterMod

import org.scalajs.dom.SVGPathElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("matter", "SvgFactory")
@js.native
open class SvgFactory ()
  extends StObject
     with typingsJapgolly.phaser.MatterJS.SvgFactory {
  
  /**
    * Converts an SVG path into an array of vector points.
    * If the input path forms a concave shape, you must decompose the result into convex parts before use.
    * See `Bodies.fromVertices` which provides support for this.
    * Note that this function is not guaranteed to support complex paths (such as those with holes).
    * @method pathToVertices
    * @param {SVGPathElement} path
    * @param {Number} [sampleLength=15]
    * @return {Vector[]} points
    */
  /* CompleteClass */
  override def pathToVertices(path: SVGPathElement, sampleLength: Double): js.Array[typingsJapgolly.phaser.MatterJS.Vector] = js.native
}
