package typingsJapgolly.webcola

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcLinklengthsMod {
  
  @JSImport("webcola/dist/src/linklengths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateDirectedEdgeConstraints[Link](n: Double, links: js.Array[Link], axis: String, la: LinkSepAccessor[Link]): js.Array[IConstraint] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateDirectedEdgeConstraints")(n.asInstanceOf[js.Any], links.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[IConstraint]]
  
  inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def jaccardLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("jaccardLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def stronglyConnectedComponents[Link](numVertices: Double, edges: js.Array[Link], la: LinkAccessor[Link]): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("stronglyConnectedComponents")(numVertices.asInstanceOf[js.Any], edges.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
  
  inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def symmetricDiffLinkLengths[Link](links: js.Array[Link], la: LinkLengthAccessor[Link], w: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("symmetricDiffLinkLengths")(links.asInstanceOf[js.Any], la.asInstanceOf[js.Any], w.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DirectedEdgeConstraints extends StObject {
    
    var axis: String
    
    var gap: Double
  }
  object DirectedEdgeConstraints {
    
    inline def apply(axis: String, gap: Double): DirectedEdgeConstraints = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any])
      __obj.asInstanceOf[DirectedEdgeConstraints]
    }
    
    extension [Self <: DirectedEdgeConstraints](x: Self) {
      
      inline def setAxis(value: String): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    }
  }
  
  trait IConstraint extends StObject {
    
    var gap: Double
    
    var left: Double
    
    var right: Double
  }
  object IConstraint {
    
    inline def apply(gap: Double, left: Double, right: Double): IConstraint = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
      __obj.asInstanceOf[IConstraint]
    }
    
    extension [Self <: IConstraint](x: Self) {
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    }
  }
  
  trait LinkAccessor[Link] extends StObject {
    
    def getSourceIndex(l: Link): Double
    
    def getTargetIndex(l: Link): Double
  }
  object LinkAccessor {
    
    inline def apply[Link](getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkAccessor[Link]]
    }
    
    extension [Self <: LinkAccessor[?], Link](x: Self & LinkAccessor[Link]) {
      
      inline def setGetSourceIndex(value: Link => Double): Self = StObject.set(x, "getSourceIndex", js.Any.fromFunction1(value))
      
      inline def setGetTargetIndex(value: Link => Double): Self = StObject.set(x, "getTargetIndex", js.Any.fromFunction1(value))
    }
  }
  
  trait LinkLengthAccessor[Link]
    extends StObject
       with LinkAccessor[Link] {
    
    def setLength(l: Link, value: Double): Unit
  }
  object LinkLengthAccessor {
    
    inline def apply[Link](
      getSourceIndex: Link => Double,
      getTargetIndex: Link => Double,
      setLength: (Link, Double) => Callback
    ): LinkLengthAccessor[Link] = {
      val __obj = js.Dynamic.literal(getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex), setLength = js.Any.fromFunction2((t0: Link, t1: Double) => (setLength(t0, t1)).runNow()))
      __obj.asInstanceOf[LinkLengthAccessor[Link]]
    }
    
    extension [Self <: LinkLengthAccessor[?], Link](x: Self & LinkLengthAccessor[Link]) {
      
      inline def setSetLength(value: (Link, Double) => Callback): Self = StObject.set(x, "setLength", js.Any.fromFunction2((t0: Link, t1: Double) => (value(t0, t1)).runNow()))
    }
  }
  
  trait LinkSepAccessor[Link]
    extends StObject
       with LinkAccessor[Link] {
    
    def getMinSeparation(l: Link): Double
  }
  object LinkSepAccessor {
    
    inline def apply[Link](getMinSeparation: Link => Double, getSourceIndex: Link => Double, getTargetIndex: Link => Double): LinkSepAccessor[Link] = {
      val __obj = js.Dynamic.literal(getMinSeparation = js.Any.fromFunction1(getMinSeparation), getSourceIndex = js.Any.fromFunction1(getSourceIndex), getTargetIndex = js.Any.fromFunction1(getTargetIndex))
      __obj.asInstanceOf[LinkSepAccessor[Link]]
    }
    
    extension [Self <: LinkSepAccessor[?], Link](x: Self & LinkSepAccessor[Link]) {
      
      inline def setGetMinSeparation(value: Link => Double): Self = StObject.set(x, "getMinSeparation", js.Any.fromFunction1(value))
    }
  }
}
