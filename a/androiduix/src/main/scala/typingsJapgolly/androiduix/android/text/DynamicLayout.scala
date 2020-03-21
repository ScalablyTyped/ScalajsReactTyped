package typingsJapgolly.androiduix.android.text

import typingsJapgolly.androiduix.android.text.Layout.Alignment
import typingsJapgolly.androiduix.android.text.TextUtils.TruncateAt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.DynamicLayout")
@js.native
class DynamicLayout protected () extends Layout {
  def this(
    base: String,
    display: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean
  ) = this()
  def this(
    base: String,
    display: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt
  ) = this()
  def this(
    base: String,
    display: String,
    paint: TextPaint,
    width: Double,
    align: Alignment,
    textDir: TextDirectionHeuristic,
    spacingmult: Double,
    spacingadd: Double,
    includepad: Boolean,
    ellipsize: TruncateAt,
    ellipsizedWidth: Double
  ) = this()
  var mBase: js.Any = js.native
  var mBlockEndLines: js.Any = js.native
  var mBlockIndices: js.Any = js.native
  var mBottomPadding: js.Any = js.native
  var mDisplay: js.Any = js.native
  var mEllipsize: js.Any = js.native
  var mEllipsizeAt: js.Any = js.native
  var mEllipsizedWidth: js.Any = js.native
  var mIncludePad: js.Any = js.native
  var mIndexFirstChangedBlock: js.Any = js.native
  var mInts: js.Any = js.native
  var mNumberOfBlocks: js.Any = js.native
  var mObjects: js.Any = js.native
  var mTopPadding: js.Any = js.native
  var mWatcher: js.Any = js.native
  /* private */ def addBlockAtOffset(offset: js.Any): js.Any = js.native
  /* private */ def createBlocks(): js.Any = js.native
  def getBlockEndLines(): js.Array[Double] = js.native
  def getBlockIndices(): js.Array[Double] = js.native
  def getIndexFirstChangedBlock(): Double = js.native
  def getNumberOfBlocks(): Double = js.native
  /* private */ def reflow(s: js.Any, where: js.Any, before: js.Any, after: js.Any): js.Any = js.native
  def setBlocksDataForTest(blockEndLines: js.Array[Double], blockIndices: js.Array[Double], numberOfBlocks: Double): Unit = js.native
  def setIndexFirstChangedBlock(i: Double): Unit = js.native
  def updateBlocks(startLine: Double, endLine: Double, newLineCount: Double): Unit = js.native
}

/* static members */
@JSGlobal("android.text.DynamicLayout")
@js.native
object DynamicLayout extends js.Object {
  var BLOCK_MINIMUM_CHARACTER_LENGTH: js.Any = js.native
  var COLUMNS_ELLIPSIZE: js.Any = js.native
  var COLUMNS_NORMAL: js.Any = js.native
  var DESCENT: js.Any = js.native
  var DIR: js.Any = js.native
  var DIR_SHIFT: js.Any = js.native
  var ELLIPSIS_COUNT: js.Any = js.native
  var ELLIPSIS_START: js.Any = js.native
  var ELLIPSIS_UNDEFINED: js.Any = js.native
  var INVALID_BLOCK_INDEX: Double = js.native
  var PRIORITY: js.Any = js.native
  var START: js.Any = js.native
  var START_MASK: js.Any = js.native
  var TAB: js.Any = js.native
  var TAB_MASK: js.Any = js.native
  var TOP: js.Any = js.native
  var sLock: js.Any = js.native
  var sStaticLayout: js.Any = js.native
}

