package typingsJapgolly.phaser.spine

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathConstraint
  extends StObject
     with Updatable {
  
  var active: Boolean
  
  def addAfterPosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit
  
  def addBeforePosition(p: Double, temp: js.Array[Double], i: Double, out: js.Array[Double], o: Double): Unit
  
  def addCurvePosition(
    p: Double,
    x1: Double,
    y1: Double,
    cx1: Double,
    cy1: Double,
    cx2: Double,
    cy2: Double,
    x2: Double,
    y2: Double,
    out: js.Array[Double],
    o: Double,
    tangents: Boolean
  ): Unit
  
  @JSName("apply")
  def apply(): Unit
  
  var bones: js.Array[Bone]
  
  def computeWorldPositions(
    path: PathAttachment,
    spacesCount: Double,
    tangents: Boolean,
    percentPosition: Boolean,
    percentSpacing: Boolean
  ): js.Array[Double]
  
  var curves: js.Array[Double]
  
  var data: PathConstraintData
  
  var lengths: js.Array[Double]
  
  var position: Double
  
  var positions: js.Array[Double]
  
  var rotateMix: Double
  
  var segments: js.Array[Double]
  
  var spaces: js.Array[Double]
  
  var spacing: Double
  
  var target: Slot
  
  var translateMix: Double
  
  var world: js.Array[Double]
}
object PathConstraint {
  
  inline def apply(
    active: Boolean,
    addAfterPosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Callback,
    addBeforePosition: (Double, js.Array[Double], Double, js.Array[Double], Double) => Callback,
    addCurvePosition: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Callback,
    apply: Callback,
    bones: js.Array[Bone],
    computeWorldPositions: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double],
    curves: js.Array[Double],
    data: PathConstraintData,
    isActive: CallbackTo[Boolean],
    lengths: js.Array[Double],
    position: Double,
    positions: js.Array[Double],
    rotateMix: Double,
    segments: js.Array[Double],
    spaces: js.Array[Double],
    spacing: Double,
    target: Slot,
    translateMix: Double,
    update: Callback,
    world: js.Array[Double]
  ): PathConstraint = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], addAfterPosition = js.Any.fromFunction5((t0: Double, t1: js.Array[Double], t2: Double, t3: js.Array[Double], t4: Double) => (addAfterPosition(t0, t1, t2, t3, t4)).runNow()), addBeforePosition = js.Any.fromFunction5((t0: Double, t1: js.Array[Double], t2: Double, t3: js.Array[Double], t4: Double) => (addBeforePosition(t0, t1, t2, t3, t4)).runNow()), addCurvePosition = js.Any.fromFunction12((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: js.Array[Double], t10: Double, t11: Boolean) => (addCurvePosition(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)).runNow()), apply = apply.toJsFn, bones = bones.asInstanceOf[js.Any], computeWorldPositions = js.Any.fromFunction5(computeWorldPositions), curves = curves.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isActive = isActive.toJsFn, lengths = lengths.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], rotateMix = rotateMix.asInstanceOf[js.Any], segments = segments.asInstanceOf[js.Any], spaces = spaces.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], translateMix = translateMix.asInstanceOf[js.Any], update = update.toJsFn, world = world.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathConstraint]
  }
  
  extension [Self <: PathConstraint](x: Self) {
    
    inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    
    inline def setAddAfterPosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Callback): Self = StObject.set(x, "addAfterPosition", js.Any.fromFunction5((t0: Double, t1: js.Array[Double], t2: Double, t3: js.Array[Double], t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAddBeforePosition(value: (Double, js.Array[Double], Double, js.Array[Double], Double) => Callback): Self = StObject.set(x, "addBeforePosition", js.Any.fromFunction5((t0: Double, t1: js.Array[Double], t2: Double, t3: js.Array[Double], t4: Double) => (value(t0, t1, t2, t3, t4)).runNow()))
    
    inline def setAddCurvePosition(
      value: (Double, Double, Double, Double, Double, Double, Double, Double, Double, js.Array[Double], Double, Boolean) => Callback
    ): Self = StObject.set(x, "addCurvePosition", js.Any.fromFunction12((t0: Double, t1: Double, t2: Double, t3: Double, t4: Double, t5: Double, t6: Double, t7: Double, t8: Double, t9: js.Array[Double], t10: Double, t11: Boolean) => (value(t0, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11)).runNow()))
    
    inline def setApply(value: Callback): Self = StObject.set(x, "apply", value.toJsFn)
    
    inline def setBones(value: js.Array[Bone]): Self = StObject.set(x, "bones", value.asInstanceOf[js.Any])
    
    inline def setBonesVarargs(value: Bone*): Self = StObject.set(x, "bones", js.Array(value*))
    
    inline def setComputeWorldPositions(value: (PathAttachment, Double, Boolean, Boolean, Boolean) => js.Array[Double]): Self = StObject.set(x, "computeWorldPositions", js.Any.fromFunction5(value))
    
    inline def setCurves(value: js.Array[Double]): Self = StObject.set(x, "curves", value.asInstanceOf[js.Any])
    
    inline def setCurvesVarargs(value: Double*): Self = StObject.set(x, "curves", js.Array(value*))
    
    inline def setData(value: PathConstraintData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setLengths(value: js.Array[Double]): Self = StObject.set(x, "lengths", value.asInstanceOf[js.Any])
    
    inline def setLengthsVarargs(value: Double*): Self = StObject.set(x, "lengths", js.Array(value*))
    
    inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositions(value: js.Array[Double]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    inline def setPositionsVarargs(value: Double*): Self = StObject.set(x, "positions", js.Array(value*))
    
    inline def setRotateMix(value: Double): Self = StObject.set(x, "rotateMix", value.asInstanceOf[js.Any])
    
    inline def setSegments(value: js.Array[Double]): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsVarargs(value: Double*): Self = StObject.set(x, "segments", js.Array(value*))
    
    inline def setSpaces(value: js.Array[Double]): Self = StObject.set(x, "spaces", value.asInstanceOf[js.Any])
    
    inline def setSpacesVarargs(value: Double*): Self = StObject.set(x, "spaces", js.Array(value*))
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Slot): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTranslateMix(value: Double): Self = StObject.set(x, "translateMix", value.asInstanceOf[js.Any])
    
    inline def setWorld(value: js.Array[Double]): Self = StObject.set(x, "world", value.asInstanceOf[js.Any])
    
    inline def setWorldVarargs(value: Double*): Self = StObject.set(x, "world", js.Array(value*))
  }
}
