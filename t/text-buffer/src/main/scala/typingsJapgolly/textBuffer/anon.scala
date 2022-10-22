package typingsJapgolly.textBuffer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.textBuffer.mod.global.TextBuffer.Point
import typingsJapgolly.textBuffer.mod.global.TextBuffer.PointCompatible
import typingsJapgolly.textBuffer.mod.global.TextBuffer.PointLike
import typingsJapgolly.textBuffer.mod.global.TextBuffer.RangeCompatible
import typingsJapgolly.textBuffer.mod.global.TextBuffer.RangeLike
import typingsJapgolly.textBuffer.textBufferStrings.backward
import typingsJapgolly.textBuffer.textBufferStrings.closest
import typingsJapgolly.textBuffer.textBufferStrings.forward
import typingsJapgolly.textBuffer.textBufferStrings.inside
import typingsJapgolly.textBuffer.textBufferStrings.never
import typingsJapgolly.textBuffer.textBufferStrings.overlap
import typingsJapgolly.textBuffer.textBufferStrings.skip
import typingsJapgolly.textBuffer.textBufferStrings.surround
import typingsJapgolly.textBuffer.textBufferStrings.touch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var clipDirection: backward | forward | closest
  }
  object `0` {
    
    inline def apply(clipDirection: backward | forward | closest): `0` = {
      val __obj = js.Dynamic.literal(clipDirection = clipDirection.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClipDirection extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
  }
  object ClipDirection {
    
    inline def apply(): ClipDirection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirection]
    }
    
    extension [Self <: ClipDirection](x: Self) {
      
      inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  trait ClipDirectionExclusive extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
  }
  object ClipDirectionExclusive {
    
    inline def apply(): ClipDirectionExclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirectionExclusive]
    }
    
    extension [Self <: ClipDirectionExclusive](x: Self) {
      
      inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  trait ClipDirectionExclusiveInvalidate extends StObject {
    
    var clipDirection: js.UndefOr[backward | forward | closest] = js.undefined
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  }
  object ClipDirectionExclusiveInvalidate {
    
    inline def apply(): ClipDirectionExclusiveInvalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClipDirectionExclusiveInvalidate]
    }
    
    extension [Self <: ClipDirectionExclusiveInvalidate](x: Self) {
      
      inline def setClipDirection(value: backward | forward | closest): Self = StObject.set(x, "clipDirection", value.asInstanceOf[js.Any])
      
      inline def setClipDirectionUndefined: Self = StObject.set(x, "clipDirection", js.undefined)
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    }
  }
  
  trait Exclusive extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
  }
  object Exclusive {
    
    inline def apply(): Exclusive = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Exclusive]
    }
    
    extension [Self <: Exclusive](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  trait ExclusiveInvalidate extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
  }
  object ExclusiveInvalidate {
    
    inline def apply(): ExclusiveInvalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExclusiveInvalidate]
    }
    
    extension [Self <: ExclusiveInvalidate](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
    }
  }
  
  trait Invalidate extends StObject {
    
    var exclusive: js.UndefOr[Boolean] = js.undefined
    
    var invalidate: js.UndefOr[never | surround | overlap | inside | touch] = js.undefined
    
    var reversed: js.UndefOr[Boolean] = js.undefined
  }
  object Invalidate {
    
    inline def apply(): Invalidate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Invalidate]
    }
    
    extension [Self <: Invalidate](x: Self) {
      
      inline def setExclusive(value: Boolean): Self = StObject.set(x, "exclusive", value.asInstanceOf[js.Any])
      
      inline def setExclusiveUndefined: Self = StObject.set(x, "exclusive", js.undefined)
      
      inline def setInvalidate(value: never | surround | overlap | inside | touch): Self = StObject.set(x, "invalidate", value.asInstanceOf[js.Any])
      
      inline def setInvalidateUndefined: Self = StObject.set(x, "invalidate", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
    }
  }
  
  trait MaintainHistory extends StObject {
    
    var maintainHistory: js.UndefOr[Boolean] = js.undefined
    
    var persistent: js.UndefOr[Boolean] = js.undefined
  }
  object MaintainHistory {
    
    inline def apply(): MaintainHistory = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MaintainHistory]
    }
    
    extension [Self <: MaintainHistory](x: Self) {
      
      inline def setMaintainHistory(value: Boolean): Self = StObject.set(x, "maintainHistory", value.asInstanceOf[js.Any])
      
      inline def setMaintainHistoryUndefined: Self = StObject.set(x, "maintainHistory", js.undefined)
      
      inline def setPersistent(value: Boolean): Self = StObject.set(x, "persistent", value.asInstanceOf[js.Any])
      
      inline def setPersistentUndefined: Self = StObject.set(x, "persistent", js.undefined)
    }
  }
  
  trait NewExtent extends StObject {
    
    /** A Point representing the replacement extent. */
    var newExtent: Point
    
    /** A String representing the replacement text. */
    var newText: String
    
    /** A Point representing the replaced extent. */
    var oldExtent: Point
    
    /** A Point representing where the change started. */
    var start: Point
  }
  object NewExtent {
    
    inline def apply(newExtent: Point, newText: String, oldExtent: Point, start: Point): NewExtent = {
      val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewExtent]
    }
    
    extension [Self <: NewExtent](x: Self) {
      
      inline def setNewExtent(value: Point): Self = StObject.set(x, "newExtent", value.asInstanceOf[js.Any])
      
      inline def setNewText(value: String): Self = StObject.set(x, "newText", value.asInstanceOf[js.Any])
      
      inline def setOldExtent(value: Point): Self = StObject.set(x, "oldExtent", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait NormalizeLineEndings extends StObject {
    
    var normalizeLineEndings: js.UndefOr[Boolean] = js.undefined
    
    var undo: js.UndefOr[skip] = js.undefined
  }
  object NormalizeLineEndings {
    
    inline def apply(): NormalizeLineEndings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NormalizeLineEndings]
    }
    
    extension [Self <: NormalizeLineEndings](x: Self) {
      
      inline def setNormalizeLineEndings(value: Boolean): Self = StObject.set(x, "normalizeLineEndings", value.asInstanceOf[js.Any])
      
      inline def setNormalizeLineEndingsUndefined: Self = StObject.set(x, "normalizeLineEndings", js.undefined)
      
      inline def setUndo(value: skip): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
      
      inline def setUndoUndefined: Self = StObject.set(x, "undo", js.undefined)
    }
  }
  
  /* Inlined std.Readonly<text-buffer.text-buffer.<global>.TextBuffer.Point> */
  trait ReadonlyPoint extends StObject {
    
    val column: Double
    
    def compare(other: PointCompatible): Double
    
    def copy(): this.type
    
    def freeze(): this.type
    
    def isEqual(other: PointCompatible): Boolean
    
    def isGreaterThan(other: PointCompatible): Boolean
    
    def isGreaterThanOrEqual(other: PointCompatible): Boolean
    
    def isLessThan(other: PointCompatible): Boolean
    
    def isLessThanOrEqual(other: PointCompatible): Boolean
    
    def negate(): this.type
    
    val row: Double
    
    def serialize(): js.Tuple2[Double, Double]
    
    def toArray(): js.Tuple2[Double, Double]
    
    def translate(other: PointCompatible): this.type
    
    def traverse(other: PointCompatible): this.type
  }
  object ReadonlyPoint {
    
    inline def apply(
      column: Double,
      compare: PointCompatible => Double,
      copy: CallbackTo[ReadonlyPoint],
      freeze: CallbackTo[ReadonlyPoint],
      isEqual: PointCompatible => Boolean,
      isGreaterThan: PointCompatible => Boolean,
      isGreaterThanOrEqual: PointCompatible => Boolean,
      isLessThan: PointCompatible => Boolean,
      isLessThanOrEqual: PointCompatible => Boolean,
      negate: CallbackTo[ReadonlyPoint],
      row: Double,
      serialize: CallbackTo[js.Tuple2[Double, Double]],
      toArray: CallbackTo[js.Tuple2[Double, Double]],
      translate: PointCompatible => ReadonlyPoint,
      traverse: PointCompatible => ReadonlyPoint
    ): ReadonlyPoint = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = copy.toJsFn, freeze = freeze.toJsFn, isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = negate.toJsFn, row = row.asInstanceOf[js.Any], serialize = serialize.toJsFn, toArray = toArray.toJsFn, translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
      __obj.asInstanceOf[ReadonlyPoint]
    }
    
    extension [Self <: ReadonlyPoint](x: Self) {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setCompare(value: PointCompatible => Double): Self = StObject.set(x, "compare", js.Any.fromFunction1(value))
      
      inline def setCopy(value: CallbackTo[ReadonlyPoint]): Self = StObject.set(x, "copy", value.toJsFn)
      
      inline def setFreeze(value: CallbackTo[ReadonlyPoint]): Self = StObject.set(x, "freeze", value.toJsFn)
      
      inline def setIsEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isEqual", js.Any.fromFunction1(value))
      
      inline def setIsGreaterThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThan", js.Any.fromFunction1(value))
      
      inline def setIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isGreaterThanOrEqual", js.Any.fromFunction1(value))
      
      inline def setIsLessThan(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThan", js.Any.fromFunction1(value))
      
      inline def setIsLessThanOrEqual(value: PointCompatible => Boolean): Self = StObject.set(x, "isLessThanOrEqual", js.Any.fromFunction1(value))
      
      inline def setNegate(value: CallbackTo[ReadonlyPoint]): Self = StObject.set(x, "negate", value.toJsFn)
      
      inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "serialize", value.toJsFn)
      
      inline def setToArray(value: CallbackTo[js.Tuple2[Double, Double]]): Self = StObject.set(x, "toArray", value.toJsFn)
      
      inline def setTranslate(value: PointCompatible => ReadonlyPoint): Self = StObject.set(x, "translate", js.Any.fromFunction1(value))
      
      inline def setTraverse(value: PointCompatible => ReadonlyPoint): Self = StObject.set(x, "traverse", js.Any.fromFunction1(value))
    }
  }
  
  /* Inlined std.Readonly<text-buffer.text-buffer.<global>.TextBuffer.Range> */
  @js.native
  trait ReadonlyRange extends StObject {
    
    def compare(otherRange: RangeCompatible): Double = js.native
    
    def containsPoint(point: PointCompatible): Boolean = js.native
    def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
    
    def containsRange(otherRange: RangeCompatible): Boolean = js.native
    def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
    
    def copy(): this.type = js.native
    
    def coversSameRows(otherRange: RangeLike): Boolean = js.native
    
    val end: PointLike = js.native
    
    def freeze(): this.type = js.native
    
    def getRowCount(): Double = js.native
    
    def getRows(): js.Array[Double] = js.native
    
    def intersectsRow(row: Double): Boolean = js.native
    
    def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
    
    def intersectsWith(otherRange: RangeLike): Boolean = js.native
    def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
    
    def isEmpty(): Boolean = js.native
    
    def isEqual(otherRange: RangeCompatible): Boolean = js.native
    
    def isSingleLine(): Boolean = js.native
    
    def negate(): this.type = js.native
    
    def serialize(): js.Array[js.Array[Double]] = js.native
    
    val start: PointLike = js.native
    
    def translate(startDelta: PointCompatible): this.type = js.native
    def translate(startDelta: PointCompatible, endDelta: PointCompatible): this.type = js.native
    
    def traverse(delta: PointCompatible): this.type = js.native
    
    def union(other: RangeLike): this.type = js.native
  }
  
  trait Reversed extends StObject {
    
    var reversed: Boolean
  }
  object Reversed {
    
    inline def apply(reversed: Boolean): Reversed = {
      val __obj = js.Dynamic.literal(reversed = reversed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reversed]
    }
    
    extension [Self <: Reversed](x: Self) {
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
    }
  }
  
  trait ShouldDestroyOnFileDelete extends StObject {
    
    /**
      *  A function that returns a Boolean indicating whether the buffer should
      *  be destroyed if its file is deleted.
      */
    var shouldDestroyOnFileDelete: js.UndefOr[js.Function0[Boolean]] = js.undefined
    
    /** The initial string text of the buffer. */
    var text: js.UndefOr[String] = js.undefined
  }
  object ShouldDestroyOnFileDelete {
    
    inline def apply(): ShouldDestroyOnFileDelete = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ShouldDestroyOnFileDelete]
    }
    
    extension [Self <: ShouldDestroyOnFileDelete](x: Self) {
      
      inline def setShouldDestroyOnFileDelete(value: CallbackTo[Boolean]): Self = StObject.set(x, "shouldDestroyOnFileDelete", value.toJsFn)
      
      inline def setShouldDestroyOnFileDeleteUndefined: Self = StObject.set(x, "shouldDestroyOnFileDelete", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
