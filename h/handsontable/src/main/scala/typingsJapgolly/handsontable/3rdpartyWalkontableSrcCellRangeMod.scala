package typingsJapgolly.handsontable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `3rdpartyWalkontableSrcCellRangeMod` {
  
  @JSImport("handsontable/3rdparty/walkontable/src/cell/range", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CellRange {
    def this(highlight: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default) = this()
    def this(
      highlight: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
    def this(
      highlight: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: Unit,
      to: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
    def this(
      highlight: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      from: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      to: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default
    ) = this()
  }
  
  @js.native
  trait CellRange extends StObject {
    
    def expand(cellCoords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    
    def expandByRange(expandingRange: CellRange): Boolean = js.native
    
    def flipDirectionHorizontally(): Unit = js.native
    
    def flipDirectionVertically(): Unit = js.native
    
    def forAll(callback: js.Function2[/* row */ Double, /* column */ Double, Boolean]): Unit = js.native
    
    var from: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getAll(): js.Array[Any] = js.native
    
    def getBordersSharedWith(range: CellRange): js.Array[Any] = js.native
    
    def getBottomEndCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomLeftCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomRightCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getBottomStartCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getDirection(): String = js.native
    
    def getHeight(): Double = js.native
    
    def getHorizontalDirection(): String = js.native
    
    def getInner(): js.Array[Any] = js.native
    
    def getOppositeCorner(coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    def getOppositeCorner(
      coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      expandedRange: CellRange
    ): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomEndCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomLeftCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomRightCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterBottomStartCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterHeight(): Double = js.native
    
    def getOuterTopEndCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopLeftCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopRightCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterTopStartCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getOuterWidth(): Double = js.native
    
    def getTopEndCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopLeftCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopRightCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getTopStartCorner(): typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def getVerticalDirection(): String = js.native
    
    def getWidth(): Double = js.native
    
    var highlight: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def includes(cellCoords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    
    def includesRange(cellRange: CellRange): Boolean = js.native
    
    def isCorner(coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): Boolean = js.native
    def isCorner(
      coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default,
      expandedRange: CellRange
    ): Boolean = js.native
    
    def isEqual(cellRange: CellRange): Boolean = js.native
    
    def isNorthWestOf(cellRange: CellRange): Boolean = js.native
    
    def isOverlappingHorizontally(cellRange: CellRange): Boolean = js.native
    
    def isOverlappingVertically(cellRange: CellRange): Boolean = js.native
    
    def isSingle(): Boolean = js.native
    
    def isSouthEastOf(cellRange: CellRange): Boolean = js.native
    
    def isValid(wot: Any): Boolean = js.native
    
    def overlaps(cellRange: CellRange): Boolean = js.native
    
    def setDirection(direction: String): Unit = js.native
    
    def setFrom(coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setHighlight(coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    def setTo(coords: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default): CellRange = js.native
    
    var to: typingsJapgolly.handsontable.`3rdpartyWalkontableSrcCellCoordsMod`.default = js.native
    
    def toObject(): Any = js.native
  }
}
