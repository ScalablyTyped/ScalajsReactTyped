package typingsJapgolly.ol

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ol.sizeMod.Size
import typingsJapgolly.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileRangeMod {
  
  @JSImport("ol/TileRange", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ol/TileRange", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TileRange {
    def this(minX: Double, maxX: Double, minY: Double, maxY: Double) = this()
    
    /* CompleteClass */
    override def contains(tileCoord: TileCoord): Boolean = js.native
    
    /* CompleteClass */
    override def containsTileRange(tileRange: TileRange): Boolean = js.native
    
    /* CompleteClass */
    override def containsXY(x: Double, y: Double): Boolean = js.native
    
    /* CompleteClass */
    override def equals(tileRange: TileRange): Boolean = js.native
    
    /* CompleteClass */
    override def extend(tileRange: TileRange): Unit = js.native
    
    /* CompleteClass */
    override def getHeight(): Double = js.native
    
    /* CompleteClass */
    override def getSize(): Size = js.native
    
    /* CompleteClass */
    override def getWidth(): Double = js.native
    
    /* CompleteClass */
    override def intersects(tileRange: TileRange): Boolean = js.native
  }
  
  inline def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  inline def createOrUpdate(minX: Double, maxX: Double, minY: Double, maxY: Double, tileRange: TileRange): TileRange = (^.asInstanceOf[js.Dynamic].applyDynamic("createOrUpdate")(minX.asInstanceOf[js.Any], maxX.asInstanceOf[js.Any], minY.asInstanceOf[js.Any], maxY.asInstanceOf[js.Any], tileRange.asInstanceOf[js.Any])).asInstanceOf[TileRange]
  
  trait TileRange extends StObject {
    
    def contains(tileCoord: TileCoord): Boolean
    
    def containsTileRange(tileRange: TileRange): Boolean
    
    def containsXY(x: Double, y: Double): Boolean
    
    def equals(tileRange: TileRange): Boolean
    
    def extend(tileRange: TileRange): Unit
    
    def getHeight(): Double
    
    def getSize(): Size
    
    def getWidth(): Double
    
    def intersects(tileRange: TileRange): Boolean
  }
  object TileRange {
    
    inline def apply(
      contains: TileCoord => Boolean,
      containsTileRange: TileRange => Boolean,
      containsXY: (Double, Double) => Boolean,
      equals_ : TileRange => Boolean,
      extend: TileRange => Callback,
      getHeight: CallbackTo[Double],
      getSize: CallbackTo[Size],
      getWidth: CallbackTo[Double],
      intersects: TileRange => Boolean
    ): TileRange = {
      val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), containsTileRange = js.Any.fromFunction1(containsTileRange), containsXY = js.Any.fromFunction2(containsXY), extend = js.Any.fromFunction1((t0: TileRange) => extend(t0).runNow()), getHeight = getHeight.toJsFn, getSize = getSize.toJsFn, getWidth = getWidth.toJsFn, intersects = js.Any.fromFunction1(intersects))
      __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
      __obj.asInstanceOf[TileRange]
    }
    
    extension [Self <: TileRange](x: Self) {
      
      inline def setContains(value: TileCoord => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
      
      inline def setContainsTileRange(value: TileRange => Boolean): Self = StObject.set(x, "containsTileRange", js.Any.fromFunction1(value))
      
      inline def setContainsXY(value: (Double, Double) => Boolean): Self = StObject.set(x, "containsXY", js.Any.fromFunction2(value))
      
      inline def setEquals_(value: TileRange => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
      
      inline def setExtend(value: TileRange => Callback): Self = StObject.set(x, "extend", js.Any.fromFunction1((t0: TileRange) => value(t0).runNow()))
      
      inline def setGetHeight(value: CallbackTo[Double]): Self = StObject.set(x, "getHeight", value.toJsFn)
      
      inline def setGetSize(value: CallbackTo[Size]): Self = StObject.set(x, "getSize", value.toJsFn)
      
      inline def setGetWidth(value: CallbackTo[Double]): Self = StObject.set(x, "getWidth", value.toJsFn)
      
      inline def setIntersects(value: TileRange => Boolean): Self = StObject.set(x, "intersects", js.Any.fromFunction1(value))
    }
  }
}
