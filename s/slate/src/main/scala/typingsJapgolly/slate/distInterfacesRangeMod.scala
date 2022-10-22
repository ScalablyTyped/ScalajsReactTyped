package typingsJapgolly.slate

import typingsJapgolly.slate.distInterfacesCustomTypesMod.ExtendedType
import typingsJapgolly.slate.distInterfacesOperationMod.Operation
import typingsJapgolly.slate.distInterfacesPathMod.Path
import typingsJapgolly.slate.distInterfacesPointMod.Point
import typingsJapgolly.slate.distInterfacesPointMod.PointEntry
import typingsJapgolly.slate.distInterfacesTypesMod.RangeDirection
import typingsJapgolly.std.Generator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distInterfacesRangeMod {
  
  @JSImport("slate/dist/interfaces/range", "Range")
  @js.native
  val Range: RangeInterface = js.native
  type Range = ExtendedType[typingsJapgolly.slate.slateStrings.Range, BaseRange]
  
  trait BaseRange extends StObject {
    
    var anchor: Point
    
    var focus: Point
  }
  object BaseRange {
    
    inline def apply(anchor: Point, focus: Point): BaseRange = {
      val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseRange]
    }
    
    extension [Self <: BaseRange](x: Self) {
      
      inline def setAnchor(value: Point): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
      
      inline def setFocus(value: Point): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeEdgesOptions extends StObject {
    
    var reverse: js.UndefOr[Boolean] = js.undefined
  }
  object RangeEdgesOptions {
    
    inline def apply(): RangeEdgesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeEdgesOptions]
    }
    
    extension [Self <: RangeEdgesOptions](x: Self) {
      
      inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
      
      inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    }
  }
  
  @js.native
  trait RangeInterface extends StObject {
    
    def edges(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): js.Tuple2[Point, Point] = js.native
    def edges(range: typingsJapgolly.slate.distInterfacesRangeMod.Range, options: RangeEdgesOptions): js.Tuple2[Point, Point] = js.native
    
    def end(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Point = js.native
    
    def equals(
      range: typingsJapgolly.slate.distInterfacesRangeMod.Range,
      another: typingsJapgolly.slate.distInterfacesRangeMod.Range
    ): Boolean = js.native
    
    def includes(
      range: typingsJapgolly.slate.distInterfacesRangeMod.Range,
      target: Point | typingsJapgolly.slate.distInterfacesRangeMod.Range
    ): Boolean = js.native
    def includes(range: typingsJapgolly.slate.distInterfacesRangeMod.Range, target: Path): Boolean = js.native
    
    def intersection(
      range: typingsJapgolly.slate.distInterfacesRangeMod.Range,
      another: typingsJapgolly.slate.distInterfacesRangeMod.Range
    ): typingsJapgolly.slate.distInterfacesRangeMod.Range | Null = js.native
    
    def isBackward(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    def isCollapsed(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    def isExpanded(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    def isForward(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Boolean = js.native
    
    def isRange(value: Any): /* is slate.slate/dist/interfaces/range.Range */ Boolean = js.native
    
    def points(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Generator[PointEntry, Unit, Unit] = js.native
    
    def start(range: typingsJapgolly.slate.distInterfacesRangeMod.Range): Point = js.native
    
    def transform(range: typingsJapgolly.slate.distInterfacesRangeMod.Range, op: Operation): typingsJapgolly.slate.distInterfacesRangeMod.Range | Null = js.native
    def transform(
      range: typingsJapgolly.slate.distInterfacesRangeMod.Range,
      op: Operation,
      options: RangeTransformOptions
    ): typingsJapgolly.slate.distInterfacesRangeMod.Range | Null = js.native
  }
  
  trait RangeTransformOptions extends StObject {
    
    var affinity: js.UndefOr[RangeDirection | Null] = js.undefined
  }
  object RangeTransformOptions {
    
    inline def apply(): RangeTransformOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeTransformOptions]
    }
    
    extension [Self <: RangeTransformOptions](x: Self) {
      
      inline def setAffinity(value: RangeDirection): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
      
      inline def setAffinityNull: Self = StObject.set(x, "affinity", null)
      
      inline def setAffinityUndefined: Self = StObject.set(x, "affinity", js.undefined)
    }
  }
}
