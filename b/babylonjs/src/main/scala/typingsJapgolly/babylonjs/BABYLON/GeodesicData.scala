package typingsJapgolly.babylonjs.BABYLON

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeodesicData
  extends StObject
     with PolyhedronData {
  
  /**
    * @internal
    */
  var adjacentFaces: js.Array[js.Array[Double]]
  
  /**
    * @internal
    */
  def innerToData(face: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @internal
    */
  def mapABOBtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @internal
    */
  def mapBAOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @internal
    */
  def mapOBOAtoDATA(faceNb: Double, primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @internal
    */
  def orderData(primTri: PrimaryIsoTriangle): Unit
  
  /**
    * @internal
    */
  var poleNodes: Double
  
  /**
    * @internal
    */
  def setOrder(m: Double, faces: js.Array[Double]): js.Array[Double]
  
  /**
    * @internal
    */
  var sharedNodes: Double
  
  /**
    * @internal
    */
  def toGoldbergPolyhedronData(): PolyhedronData
}
object GeodesicData {
  
  inline def apply(
    adjacentFaces: js.Array[js.Array[Double]],
    category: String,
    edgematch: js.Array[js.Array[Double | String]],
    face: js.Array[js.Array[Double]],
    innerToData: (Double, PrimaryIsoTriangle) => Callback,
    mapABOBtoDATA: (Double, PrimaryIsoTriangle) => Callback,
    mapBAOAtoDATA: (Double, PrimaryIsoTriangle) => Callback,
    mapOBOAtoDATA: (Double, PrimaryIsoTriangle) => Callback,
    name: String,
    orderData: PrimaryIsoTriangle => Callback,
    poleNodes: Double,
    setOrder: (Double, js.Array[Double]) => js.Array[Double],
    sharedNodes: Double,
    toGoldbergPolyhedronData: CallbackTo[PolyhedronData],
    vertex: js.Array[js.Array[Double]]
  ): GeodesicData = {
    val __obj = js.Dynamic.literal(adjacentFaces = adjacentFaces.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], edgematch = edgematch.asInstanceOf[js.Any], face = face.asInstanceOf[js.Any], innerToData = js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (innerToData(t0, t1)).runNow()), mapABOBtoDATA = js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (mapABOBtoDATA(t0, t1)).runNow()), mapBAOAtoDATA = js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (mapBAOAtoDATA(t0, t1)).runNow()), mapOBOAtoDATA = js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (mapOBOAtoDATA(t0, t1)).runNow()), name = name.asInstanceOf[js.Any], orderData = js.Any.fromFunction1((t0: PrimaryIsoTriangle) => orderData(t0).runNow()), poleNodes = poleNodes.asInstanceOf[js.Any], setOrder = js.Any.fromFunction2(setOrder), sharedNodes = sharedNodes.asInstanceOf[js.Any], toGoldbergPolyhedronData = toGoldbergPolyhedronData.toJsFn, vertex = vertex.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeodesicData]
  }
  
  extension [Self <: GeodesicData](x: Self) {
    
    inline def setAdjacentFaces(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "adjacentFaces", value.asInstanceOf[js.Any])
    
    inline def setAdjacentFacesVarargs(value: js.Array[Double]*): Self = StObject.set(x, "adjacentFaces", js.Array(value*))
    
    inline def setInnerToData(value: (Double, PrimaryIsoTriangle) => Callback): Self = StObject.set(x, "innerToData", js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (value(t0, t1)).runNow()))
    
    inline def setMapABOBtoDATA(value: (Double, PrimaryIsoTriangle) => Callback): Self = StObject.set(x, "mapABOBtoDATA", js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (value(t0, t1)).runNow()))
    
    inline def setMapBAOAtoDATA(value: (Double, PrimaryIsoTriangle) => Callback): Self = StObject.set(x, "mapBAOAtoDATA", js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (value(t0, t1)).runNow()))
    
    inline def setMapOBOAtoDATA(value: (Double, PrimaryIsoTriangle) => Callback): Self = StObject.set(x, "mapOBOAtoDATA", js.Any.fromFunction2((t0: Double, t1: PrimaryIsoTriangle) => (value(t0, t1)).runNow()))
    
    inline def setOrderData(value: PrimaryIsoTriangle => Callback): Self = StObject.set(x, "orderData", js.Any.fromFunction1((t0: PrimaryIsoTriangle) => value(t0).runNow()))
    
    inline def setPoleNodes(value: Double): Self = StObject.set(x, "poleNodes", value.asInstanceOf[js.Any])
    
    inline def setSetOrder(value: (Double, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "setOrder", js.Any.fromFunction2(value))
    
    inline def setSharedNodes(value: Double): Self = StObject.set(x, "sharedNodes", value.asInstanceOf[js.Any])
    
    inline def setToGoldbergPolyhedronData(value: CallbackTo[PolyhedronData]): Self = StObject.set(x, "toGoldbergPolyhedronData", value.toJsFn)
  }
}
