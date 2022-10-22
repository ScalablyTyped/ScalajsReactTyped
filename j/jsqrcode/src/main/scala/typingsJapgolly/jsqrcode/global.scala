package typingsJapgolly.jsqrcode

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.ImageData
import typingsJapgolly.jsqrcode.jsqrcodeInts.`0`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`0x5412`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`10`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`11`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`12`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`13`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`14`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`16`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`1`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`2`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`3`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`4`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`8`
import typingsJapgolly.jsqrcode.jsqrcodeInts.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("AlignmentPattern")
  @js.native
  open class AlignmentPattern protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.AlignmentPattern {
    def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
    
    /* CompleteClass */
    override val Count: Double = js.native
    
    /* CompleteClass */
    override val EstimatedModuleSize: Double = js.native
    
    /* CompleteClass */
    override val X: Double = js.native
    
    /* CompleteClass */
    override val Y: Double = js.native
    
    /* CompleteClass */
    override def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var count: Double = js.native
    
    /* private */ /* CompleteClass */
    var estimatedModuleSize: Double = js.native
    
    /* CompleteClass */
    override def incrementCount(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var x: Double = js.native
    
    /* private */ /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("AlignmentPatternFinder")
  @js.native
  open class AlignmentPatternFinder protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.AlignmentPatternFinder {
    def this(
      image: js.typedarray.Uint8Array,
      startX: Double,
      startY: Double,
      width: Double,
      height: Double,
      moduleSize: Double,
      resultPointCallback: ResultPointCallback
    ) = this()
    
    /* private */ /* CompleteClass */
    override def centerFromEnd(stateCount: Double, end: Double): Double = js.native
    
    /* CompleteClass */
    var crossCheckStateCount: js.Tuple3[Double, Double, Double] = js.native
    
    /* CompleteClass */
    override def find(): typingsJapgolly.jsqrcode.AlignmentPattern = js.native
    
    /* private */ /* CompleteClass */
    override def foundPatternCross(stateCount: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    override def handlePossibleCenter(stateCount: Double, i: Double, j: Double): typingsJapgolly.jsqrcode.AlignmentPattern = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var image: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var moduleSize: Double = js.native
    
    /* CompleteClass */
    var possibleCenters: js.Array[typingsJapgolly.jsqrcode.AlignmentPattern] = js.native
    
    /* CompleteClass */
    var resultPointCallback: ResultPointCallback = js.native
    
    /* CompleteClass */
    var startX: Double = js.native
    
    /* CompleteClass */
    var startY: Double = js.native
    
    /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("BITS_SET_IN_HALF_BYTE")
  @js.native
  val BITS_SET_IN_HALF_BYTE: js.Tuple16[`0`, `1`, `1`, `2`, `1`, `2`, `2`, `3`, `1`, `2`, `2`, `3`, `2`, `3`, `3`, `4`] = js.native
  
  @JSGlobal("BitMatrix")
  @js.native
  open class BitMatrix protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.BitMatrix {
    def this(width: Double) = this()
    def this(width: Double, height: Double) = this()
    
    /* CompleteClass */
    override val Dimension: Double = js.native
    
    /* CompleteClass */
    override val Height: Double = js.native
    
    /* CompleteClass */
    override val Width: Double = js.native
    
    /* CompleteClass */
    var bits: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def flip(x: Double, y: Double): Unit = js.native
    
    /* CompleteClass */
    override def get_Renamed(x: Double, y: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var rowSize: Double = js.native
    
    /* CompleteClass */
    override def setRegion(left: Double, top: Double, width: Double, height: Double): Unit = js.native
    
    /* CompleteClass */
    override def set_Renamed(x: Double, y: Double): Unit = js.native
    
    /* private */ /* CompleteClass */
    var width: Double = js.native
  }
  
  @JSGlobal("BitMatrixParser")
  @js.native
  open class BitMatrixParser protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.BitMatrixParser {
    def this(bitMatrix: typingsJapgolly.jsqrcode.BitMatrix) = this()
    
    /* CompleteClass */
    var bitMatrix: typingsJapgolly.jsqrcode.BitMatrix = js.native
    
    /* CompleteClass */
    override def copyBit(i: Double, j: Double, versionBits: Double): Double = js.native
    
    /* CompleteClass */
    var parsedFormatInfo: typingsJapgolly.jsqrcode.FormatInformation = js.native
    
    /* CompleteClass */
    var parsedVersion: typingsJapgolly.jsqrcode.Version = js.native
    
    /* CompleteClass */
    override def readCodewords(): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def readFormatInformation(): typingsJapgolly.jsqrcode.FormatInformation = js.native
    
    /* CompleteClass */
    override def readVersion(): typingsJapgolly.jsqrcode.Version = js.native
  }
  
  @JSGlobal("CENTER_QUORUM")
  @js.native
  val CENTER_QUORUM: Double = js.native
  
  @JSGlobal("DataBlock")
  @js.native
  open class DataBlock protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataBlock {
    def this(numDataCodewords: Double, codewords: js.Array[Double]) = this()
    
    /* CompleteClass */
    override val Codewords: js.Array[Double] = js.native
    
    /* CompleteClass */
    override val NumDataCodewords: Double = js.native
    
    /* private */ /* CompleteClass */
    var codewords: js.Array[Double] = js.native
    
    /* private */ /* CompleteClass */
    var numDataCodewords: Double = js.native
  }
  object DataBlock {
    
    @JSGlobal("DataBlock")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDataBlocks(
      rawCodewords: js.Array[Double],
      version: typingsJapgolly.jsqrcode.Version,
      ecLevel: typingsJapgolly.jsqrcode.ErrorCorrectionLevel
    ): js.Array[typingsJapgolly.jsqrcode.DataBlock] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataBlocks")(rawCodewords.asInstanceOf[js.Any], version.asInstanceOf[js.Any], ecLevel.asInstanceOf[js.Any])).asInstanceOf[js.Array[typingsJapgolly.jsqrcode.DataBlock]]
  }
  
  /* note: abstract class */ @JSGlobal("DataMask")
  @js.native
  open class DataMask ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  object DataMask {
    
    @JSGlobal("DataMask")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("DataMask.DATA_MASKS")
    @js.native
    def DATA_MASKS: js.Array[typingsJapgolly.jsqrcode.DataMask] = js.native
    inline def DATA_MASKS_=(x: js.Array[typingsJapgolly.jsqrcode.DataMask]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_MASKS")(x.asInstanceOf[js.Any])
    
    /* static member */
    inline def forReference(reference: Double): typingsJapgolly.jsqrcode.DataMask = ^.asInstanceOf[js.Dynamic].applyDynamic("forReference")(reference.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.DataMask]
  }
  
  @JSGlobal("DataMask000")
  @js.native
  open class DataMask000 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask000 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask001")
  @js.native
  open class DataMask001 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask001 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask010")
  @js.native
  open class DataMask010 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask010 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask011")
  @js.native
  open class DataMask011 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask011 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask100")
  @js.native
  open class DataMask100 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask100 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask101")
  @js.native
  open class DataMask101 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask101 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask110")
  @js.native
  open class DataMask110 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask110 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  @JSGlobal("DataMask111")
  @js.native
  open class DataMask111 ()
    extends StObject
       with typingsJapgolly.jsqrcode.DataMask111 {
    
    /* CompleteClass */
    override def isMasked(i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    override def unmaskBitMatrix(bits: js.Array[Double], dimension: Double): Unit = js.native
  }
  
  object Decoder {
    
    @JSGlobal("Decoder")
    @js.native
    val ^ : js.Any = js.native
    
    inline def correctErrors(codewordBytes: js.Array[Double], numDataCodewords: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("correctErrors")(codewordBytes.asInstanceOf[js.Any], numDataCodewords.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def decode(bits: typingsJapgolly.jsqrcode.BitMatrix): typingsJapgolly.jsqrcode.QRCodeDataBlockReader = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.QRCodeDataBlockReader]
    
    @JSGlobal("Decoder.rsDecoder")
    @js.native
    def rsDecoder: typingsJapgolly.jsqrcode.ReedSolomonDecoder = js.native
    inline def rsDecoder_=(x: typingsJapgolly.jsqrcode.ReedSolomonDecoder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rsDecoder")(x.asInstanceOf[js.Any])
  }
  
  @JSGlobal("Detector")
  @js.native
  open class Detector protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.Detector {
    def this(image: js.typedarray.Uint8Array) = this()
    
    /* CompleteClass */
    override def calculateModuleSize(
      topLeft: typingsJapgolly.jsqrcode.AlignmentPattern,
      topRight: typingsJapgolly.jsqrcode.AlignmentPattern,
      bottomLeft: typingsJapgolly.jsqrcode.AlignmentPattern
    ): Double = js.native
    
    /* CompleteClass */
    override def calculateModuleSizeOneWay(
      pattern: typingsJapgolly.jsqrcode.AlignmentPattern,
      otherPattern: typingsJapgolly.jsqrcode.AlignmentPattern
    ): Double = js.native
    
    /* CompleteClass */
    override def computeDimension(
      topLeft: typingsJapgolly.jsqrcode.AlignmentPattern,
      topRight: typingsJapgolly.jsqrcode.AlignmentPattern,
      bottomLeft: typingsJapgolly.jsqrcode.AlignmentPattern,
      moduleSize: Double
    ): Double = js.native
    
    /* CompleteClass */
    override def createTransform(
      topLeft: typingsJapgolly.jsqrcode.AlignmentPattern,
      topRight: typingsJapgolly.jsqrcode.AlignmentPattern,
      bottomLeft: typingsJapgolly.jsqrcode.AlignmentPattern,
      alignmentPattern: typingsJapgolly.jsqrcode.AlignmentPattern,
      dimension: Double
    ): typingsJapgolly.jsqrcode.PerspectiveTransform = js.native
    
    /* CompleteClass */
    override def detect(): typingsJapgolly.jsqrcode.DetectorResult = js.native
    
    /* CompleteClass */
    override def distance(
      pattern1: typingsJapgolly.jsqrcode.AlignmentPattern,
      pattern2: typingsJapgolly.jsqrcode.AlignmentPattern
    ): Double = js.native
    
    /* CompleteClass */
    override def findAlignmentInRegion(
      overallEstModuleSize: Double,
      estAlignmentX: Double,
      estAlignmentY: Double,
      allowanceFactor: Double
    ): typingsJapgolly.jsqrcode.AlignmentPattern = js.native
    
    /* CompleteClass */
    var image: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    override def processFinderPatternInfo(info: typingsJapgolly.jsqrcode.FinderPatternInfo): typingsJapgolly.jsqrcode.DetectorResult = js.native
    
    /* CompleteClass */
    var resultPointCallback: ResultPointCallback = js.native
    
    /* CompleteClass */
    override def sampleGrid(
      image: js.typedarray.Uint8Array,
      transform: typingsJapgolly.jsqrcode.PerspectiveTransform,
      dimension: Double
    ): typingsJapgolly.jsqrcode.BitMatrix = js.native
    
    /* CompleteClass */
    override def sizeOfBlackWhiteBlackRun(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
    
    /* CompleteClass */
    override def sizeOfBlackWhiteBlackRunBothWays(fromX: Double, fromY: Double, toX: Double, toY: Double): Double = js.native
  }
  
  @JSGlobal("DetectorResult")
  @js.native
  open class DetectorResult protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.DetectorResult {
    def this(
      bits: typingsJapgolly.jsqrcode.BitMatrix,
      points: js.Tuple3[
            typingsJapgolly.jsqrcode.DetectorResult, 
            typingsJapgolly.jsqrcode.DetectorResult, 
            typingsJapgolly.jsqrcode.DetectorResult
          ]
    ) = this()
    def this(
      bits: typingsJapgolly.jsqrcode.BitMatrix,
      points: js.Tuple4[
            typingsJapgolly.jsqrcode.DetectorResult, 
            typingsJapgolly.jsqrcode.DetectorResult, 
            typingsJapgolly.jsqrcode.DetectorResult, 
            typingsJapgolly.jsqrcode.DetectorResult
          ]
    ) = this()
    
    /* CompleteClass */
    var bits: typingsJapgolly.jsqrcode.BitMatrix = js.native
    
    /* CompleteClass */
    var points: (js.Tuple3[
        typingsJapgolly.jsqrcode.DetectorResult, 
        typingsJapgolly.jsqrcode.DetectorResult, 
        typingsJapgolly.jsqrcode.DetectorResult
      ]) | (js.Tuple4[
        typingsJapgolly.jsqrcode.DetectorResult, 
        typingsJapgolly.jsqrcode.DetectorResult, 
        typingsJapgolly.jsqrcode.DetectorResult, 
        typingsJapgolly.jsqrcode.DetectorResult
      ]) = js.native
  }
  
  @JSGlobal("ECB")
  @js.native
  open class ECB protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.ECB {
    def this(count: Double, dataCodewords: Double) = this()
    
    /* CompleteClass */
    override val Count: Double = js.native
    
    /* CompleteClass */
    override val DataCodewords: Double = js.native
    
    /* private */ /* CompleteClass */
    var count: Double = js.native
    
    /* private */ /* CompleteClass */
    var dataCodewords: Double = js.native
  }
  
  @JSGlobal("ECBlocks")
  @js.native
  open class ECBlocks protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.ECBlocks {
    def this(ecCodewordsPerBlock: Double, ecBlocks1: typingsJapgolly.jsqrcode.ECB) = this()
    def this(
      ecCodewordsPerBlock: Double,
      ecBlocks1: typingsJapgolly.jsqrcode.ECB,
      ecBlocks2: typingsJapgolly.jsqrcode.ECB
    ) = this()
    
    /* CompleteClass */
    override val ECCodewordsPerBlock: Double = js.native
    
    /* CompleteClass */
    override val NumBlocks: Double = js.native
    
    /* CompleteClass */
    override val TotalECCodewords: Double = js.native
    
    /* private */ /* CompleteClass */
    var ecBlocks: js.Array[typingsJapgolly.jsqrcode.ECB] | (js.Tuple2[typingsJapgolly.jsqrcode.ECB, typingsJapgolly.jsqrcode.ECB]) = js.native
    
    /* private */ /* CompleteClass */
    var ecCodewordsPerBlock: Double = js.native
    
    /* CompleteClass */
    override def getECBlocks(): js.Array[typingsJapgolly.jsqrcode.ECB] | (js.Tuple2[typingsJapgolly.jsqrcode.ECB, typingsJapgolly.jsqrcode.ECB]) = js.native
  }
  
  @JSGlobal("ErrorCorrectionLevel")
  @js.native
  open class ErrorCorrectionLevel protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.ErrorCorrectionLevel {
    def this(ordinal: Double, bits: Double, name: String) = this()
    
    /* CompleteClass */
    override val Bits: Double = js.native
    
    /* CompleteClass */
    override val Name: String = js.native
    
    /* private */ /* CompleteClass */
    var bits: Double = js.native
    
    /* private */ /* CompleteClass */
    var name: String = js.native
    
    /* private */ /* CompleteClass */
    var ordinal_Renamed_Field: Double = js.native
  }
  object ErrorCorrectionLevel {
    
    @JSGlobal("ErrorCorrectionLevel")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def forBits(bits: Double): typingsJapgolly.jsqrcode.ErrorCorrectionLevel = ^.asInstanceOf[js.Dynamic].applyDynamic("forBits")(bits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.ErrorCorrectionLevel]
  }
  
  @JSGlobal("FORMAT_INFO_DECODE_LOOKUP")
  @js.native
  val FORMAT_INFO_DECODE_LOOKUP: js.Array[Any] = js.native
  
  @JSGlobal("FORMAT_INFO_MASK_QR")
  @js.native
  val FORMAT_INFO_MASK_QR: `0x5412` = js.native
  
  @JSGlobal("FOR_BITS")
  @js.native
  val FOR_BITS: js.Array[typingsJapgolly.jsqrcode.ErrorCorrectionLevel] = js.native
  
  @JSGlobal("FinderPattern")
  @js.native
  open class FinderPattern protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.FinderPattern {
    def this(posX: Double, posY: Double, estimatedModuleSize: Double) = this()
    
    /* CompleteClass */
    override val Count: Double = js.native
    
    /* CompleteClass */
    override val EstimatedModuleSize: Double = js.native
    
    /* CompleteClass */
    override val X: Double = js.native
    
    /* CompleteClass */
    override val Y: Double = js.native
    
    /* CompleteClass */
    override def aboutEquals(moduleSize: Double, i: Double, j: Double): Boolean = js.native
    
    /* private */ /* CompleteClass */
    var count: Double = js.native
    
    /* private */ /* CompleteClass */
    var estimatedModuleSize: Double = js.native
    
    /* CompleteClass */
    override def incrementCount(): Unit = js.native
    
    /* private */ /* CompleteClass */
    var x: Double = js.native
    
    /* private */ /* CompleteClass */
    var y: Double = js.native
  }
  
  @JSGlobal("FinderPatternFinder")
  @js.native
  open class FinderPatternFinder ()
    extends StObject
       with typingsJapgolly.jsqrcode.FinderPatternFinder {
    
    /* CompleteClass */
    override val CrossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    /* CompleteClass */
    override def centerFromEnd(stateCount: js.Tuple5[Double, Double, Double, Double, Double], end: Double): Double = js.native
    
    /* CompleteClass */
    override def crossCheckHorizontal(startJ: Double, centerI: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var crossCheckStateCount: js.Tuple5[Double, Double, Double, Double, Double] = js.native
    
    /* CompleteClass */
    override def crossCheckVertical(startI: Double, centerJ: Double, maxCount: Double, originalStateCountTotal: Double): Double = js.native
    
    /* CompleteClass */
    override def findFinderPattern(image: js.typedarray.Uint8Array): typingsJapgolly.jsqrcode.FinderPatternInfo = js.native
    
    /* CompleteClass */
    override def findRowSkip(): Double = js.native
    
    /* CompleteClass */
    override def foundPatternCross(stateCount: js.Tuple5[Double, Double, Double, Double, Double]): Boolean = js.native
    
    /* CompleteClass */
    override def handlePossibleCenter(stateCount: js.Tuple5[Double, Double, Double, Double, Double], i: Double, j: Double): Boolean = js.native
    
    /* CompleteClass */
    var hasSkipped: Boolean = js.native
    
    /* CompleteClass */
    override def haveMultiplyConfirmedCenters(): Boolean = js.native
    
    /* CompleteClass */
    var image: js.typedarray.Uint8Array = js.native
    
    /* CompleteClass */
    var possibleCenters: js.Array[typingsJapgolly.jsqrcode.FinderPattern] = js.native
    
    /* CompleteClass */
    var resultPointCallback: ResultPointCallback = js.native
    
    /* CompleteClass */
    override def selectBestPatterns(): Double = js.native
  }
  
  @JSGlobal("FinderPatternInfo")
  @js.native
  open class FinderPatternInfo protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.FinderPatternInfo {
    def this(patternCenters: js.Tuple3[
            typingsJapgolly.jsqrcode.AlignmentPattern, 
            typingsJapgolly.jsqrcode.AlignmentPattern, 
            typingsJapgolly.jsqrcode.AlignmentPattern
          ]) = this()
    
    /* CompleteClass */
    override val BottomLeft: typingsJapgolly.jsqrcode.AlignmentPattern = js.native
    
    /* CompleteClass */
    override val TopLeft: typingsJapgolly.jsqrcode.AlignmentPattern = js.native
    
    /* CompleteClass */
    override val TopRight: typingsJapgolly.jsqrcode.AlignmentPattern = js.native
  }
  
  @JSGlobal("FormatInformation")
  @js.native
  open class FormatInformation ()
    extends StObject
       with typingsJapgolly.jsqrcode.FormatInformation {
    
    /* CompleteClass */
    override val DataMask: Double = js.native
    
    /* CompleteClass */
    override def Equals(other: typingsJapgolly.jsqrcode.FormatInformation): Boolean = js.native
    
    /* CompleteClass */
    override val ErrorCorrectionLevel: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
    
    /* CompleteClass */
    override def GetHashCode(): Double = js.native
    
    /* private */ /* CompleteClass */
    var dataMask: Double = js.native
    
    /* private */ /* CompleteClass */
    var errorCorrectionLevel: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
  }
  object FormatInformation {
    
    @JSGlobal("FormatInformation")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def decodeFormatInformation(maskedFormatInfo: Double): typingsJapgolly.jsqrcode.FormatInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeFormatInformation")(maskedFormatInfo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.FormatInformation]
    
    /* static member */
    inline def doDecodeFormatInformation(maskedFormatInfo: Double): typingsJapgolly.jsqrcode.FormatInformation = ^.asInstanceOf[js.Dynamic].applyDynamic("doDecodeFormatInformation")(maskedFormatInfo.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.FormatInformation]
    
    /* static member */
    inline def numBitsDiffering(a: Double, b: js.Tuple2[Double, Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("numBitsDiffering")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("GF256")
  @js.native
  open class GF256 protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.GF256 {
    def this(primitive: Double) = this()
    
    /* CompleteClass */
    override val One: typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* CompleteClass */
    override val Zero: typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* CompleteClass */
    override def buildMonomial(degree: Double, coefficient: Double): typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* CompleteClass */
    override def exp(a: Double): Double = js.native
    
    /* CompleteClass */
    var expTable: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def inverse(a: Double): Double = js.native
    
    /* CompleteClass */
    override def log(a: Double): Double = js.native
    
    /* CompleteClass */
    var logTable: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def multiply(a: Double, b: Double): Double = js.native
    
    /* private */ /* CompleteClass */
    var one: typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* private */ /* CompleteClass */
    var zero: typingsJapgolly.jsqrcode.GF256Poly = js.native
  }
  object GF256 {
    
    @JSGlobal("GF256")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("GF256.DATA_MATRIX_FIELD")
    @js.native
    val DATA_MATRIX_FIELD: typingsJapgolly.jsqrcode.GF256 = js.native
    
    /* static member */
    @JSGlobal("GF256.QR_CODE_FIELD")
    @js.native
    val QR_CODE_FIELD: typingsJapgolly.jsqrcode.GF256 = js.native
    
    /* static member */
    inline def addOrSubtract(a: Double, b: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("addOrSubtract")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
  
  @JSGlobal("GF256Poly")
  @js.native
  open class GF256Poly protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.GF256Poly {
    def this(field: typingsJapgolly.jsqrcode.GF256, coefficients: js.Array[Double]) = this()
    
    /* CompleteClass */
    override val Coefficients: js.Array[Double] = js.native
    
    /* CompleteClass */
    override val Degree: Double = js.native
    
    /* CompleteClass */
    override val Zero: Boolean = js.native
    
    /* CompleteClass */
    override def addOrSubtract(other: typingsJapgolly.jsqrcode.GF256Poly): typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* private */ /* CompleteClass */
    var coefficients: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def divide(other: typingsJapgolly.jsqrcode.GF256Poly): js.Tuple2[typingsJapgolly.jsqrcode.GF256Poly, typingsJapgolly.jsqrcode.GF256Poly] = js.native
    
    /* CompleteClass */
    override def evaluateAt(a: Double): Double = js.native
    
    /* CompleteClass */
    var field: typingsJapgolly.jsqrcode.GF256 = js.native
    
    /* CompleteClass */
    override def getCoefficient(degree: Double): Double = js.native
    
    /* CompleteClass */
    override def multiply1(other: typingsJapgolly.jsqrcode.GF256Poly): typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* CompleteClass */
    override def multiply2(scalar: Double): typingsJapgolly.jsqrcode.GF256Poly = js.native
    
    /* CompleteClass */
    override def multiplyByMonomial(degree: Double, coefficient: Double): typingsJapgolly.jsqrcode.GF256Poly = js.native
  }
  
  object GridSampler {
    
    @JSGlobal("GridSampler")
    @js.native
    val ^ : js.Any = js.native
    
    inline def checkAndNudgePoints(image: js.typedarray.Uint8Array, points: js.Array[Double]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkAndNudgePoints")(image.asInstanceOf[js.Any], points.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def sampleGrid3(
      image: js.typedarray.Uint8Array,
      dimension: Double,
      transform: typingsJapgolly.jsqrcode.PerspectiveTransform
    ): typingsJapgolly.jsqrcode.BitMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleGrid3")(image.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any], transform.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsqrcode.BitMatrix]
    
    inline def sampleGridx(
      image: js.typedarray.Uint8Array,
      dimension: Double,
      p1ToX: Double,
      p1ToY: Double,
      p2ToX: Double,
      p2ToY: Double,
      p3ToX: Double,
      p3ToY: Double,
      p4ToX: Double,
      p4ToY: Double,
      p1FromX: Double,
      p1FromY: Double,
      p2FromX: Double,
      p2FromY: Double,
      p3FromX: Double,
      p3FromY: Double,
      p4FromX: Double,
      p4FromY: Double
    ): typingsJapgolly.jsqrcode.BitMatrix = (^.asInstanceOf[js.Dynamic].applyDynamic("sampleGridx")(image.asInstanceOf[js.Any], dimension.asInstanceOf[js.Any], p1ToX.asInstanceOf[js.Any], p1ToY.asInstanceOf[js.Any], p2ToX.asInstanceOf[js.Any], p2ToY.asInstanceOf[js.Any], p3ToX.asInstanceOf[js.Any], p3ToY.asInstanceOf[js.Any], p4ToX.asInstanceOf[js.Any], p4ToY.asInstanceOf[js.Any], p1FromX.asInstanceOf[js.Any], p1FromY.asInstanceOf[js.Any], p2FromX.asInstanceOf[js.Any], p2FromY.asInstanceOf[js.Any], p3FromX.asInstanceOf[js.Any], p3FromY.asInstanceOf[js.Any], p4FromX.asInstanceOf[js.Any], p4FromY.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsqrcode.BitMatrix]
  }
  
  @JSGlobal("H")
  @js.native
  val H: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("INTEGER_MATH_SHIFT")
  @js.native
  val INTEGER_MATH_SHIFT: Double = js.native
  
  @JSGlobal("L")
  @js.native
  val L: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("M")
  @js.native
  val M: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("MAX_MODULES")
  @js.native
  val MAX_MODULES: Double = js.native
  
  @JSGlobal("MIN_SKIP")
  @js.native
  val MIN_SKIP: Double = js.native
  
  @JSGlobal("PerspectiveTransform")
  @js.native
  open class PerspectiveTransform protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.PerspectiveTransform {
    def this(
      a11: Double,
      a21: Double,
      a31: Double,
      a12: Double,
      a22: Double,
      a32: Double,
      a13: Double,
      a23: Double,
      a33: Double
    ) = this()
    
    /* CompleteClass */
    var a11: Double = js.native
    
    /* CompleteClass */
    var a12: Double = js.native
    
    /* CompleteClass */
    var a13: Double = js.native
    
    /* CompleteClass */
    var a21: Double = js.native
    
    /* CompleteClass */
    var a22: Double = js.native
    
    /* CompleteClass */
    var a23: Double = js.native
    
    /* CompleteClass */
    var a31: Double = js.native
    
    /* CompleteClass */
    var a32: Double = js.native
    
    /* CompleteClass */
    var a33: Double = js.native
    
    /* CompleteClass */
    override def buildAdjoint(): typingsJapgolly.jsqrcode.PerspectiveTransform = js.native
    
    /* CompleteClass */
    override def times(other: typingsJapgolly.jsqrcode.PerspectiveTransform): typingsJapgolly.jsqrcode.PerspectiveTransform = js.native
    
    /* CompleteClass */
    override def transformPoints1(points: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    override def transformPoints2(xValues: js.Array[Double], yValues: js.Array[Double]): Unit = js.native
  }
  object PerspectiveTransform {
    
    @JSGlobal("PerspectiveTransform")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def quadrilateralToQuadrilateral(
      x0: Double,
      y0: Double,
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x0p: Double,
      y0p: Double,
      x1p: Double,
      y1p: Double,
      x2p: Double,
      y2p: Double,
      x3p: Double,
      y3p: Double
    ): typingsJapgolly.jsqrcode.PerspectiveTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("quadrilateralToQuadrilateral")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x0p.asInstanceOf[js.Any], y0p.asInstanceOf[js.Any], x1p.asInstanceOf[js.Any], y1p.asInstanceOf[js.Any], x2p.asInstanceOf[js.Any], y2p.asInstanceOf[js.Any], x3p.asInstanceOf[js.Any], y3p.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsqrcode.PerspectiveTransform]
    
    /* static member */
    inline def quadrilateralToSquare(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typingsJapgolly.jsqrcode.PerspectiveTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("quadrilateralToSquare")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsqrcode.PerspectiveTransform]
    
    /* static member */
    inline def squareToQuadrilateral(x0: Double, y0: Double, x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): typingsJapgolly.jsqrcode.PerspectiveTransform = (^.asInstanceOf[js.Dynamic].applyDynamic("squareToQuadrilateral")(x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.jsqrcode.PerspectiveTransform]
  }
  
  @JSGlobal("Q")
  @js.native
  val Q: typingsJapgolly.jsqrcode.ErrorCorrectionLevel = js.native
  
  @JSGlobal("QRCodeDataBlockReader")
  @js.native
  open class QRCodeDataBlockReader protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.QRCodeDataBlockReader {
    def this(blocks: js.Array[Double], version: Double, numErrorCorrectionCode: Double) = this()
    
    /* CompleteClass */
    override val DataByte: js.Array[String | js.Array[Double]] = js.native
    
    /* CompleteClass */
    override def NextMode(): Double = js.native
    
    /* CompleteClass */
    var bitPointer: Double = js.native
    
    /* CompleteClass */
    var blockPointer: Double = js.native
    
    /* CompleteClass */
    var blocks: js.Array[Double] = js.native
    
    /* CompleteClass */
    var dataLength: Double = js.native
    
    /* CompleteClass */
    var dataLengthMode: Double = js.native
    
    /* CompleteClass */
    override def get8bitByteArray(dataLength: Double): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def getDataLength(modeIndicator: Double): Double = js.native
    
    /* CompleteClass */
    override def getFigureString(dataLength: Double): String = js.native
    
    /* CompleteClass */
    override def getKanjiString(dataLength: Double): String = js.native
    
    /* CompleteClass */
    override def getNextBits(numBits: Double): Double = js.native
    
    /* CompleteClass */
    override def getRomanAndFigureString(dataLength: Double): String = js.native
    
    /* CompleteClass */
    var numErrorCorrectionCode: Double = js.native
    
    /* CompleteClass */
    override def parseECIValue(): Double = js.native
  }
  
  @JSGlobal("ReedSolomonDecoder")
  @js.native
  open class ReedSolomonDecoder protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.ReedSolomonDecoder {
    def this(field: typingsJapgolly.jsqrcode.GF256) = this()
    
    /* CompleteClass */
    override def decode(received: typingsJapgolly.jsqrcode.GF256, twoS: js.Array[Double]): Unit = js.native
    
    /* CompleteClass */
    var field: typingsJapgolly.jsqrcode.GF256 = js.native
    
    /* CompleteClass */
    override def findErrorLocations(errorLocator: typingsJapgolly.jsqrcode.GF256Poly): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def findErrorMagnitudes(
      errorEvaluator: typingsJapgolly.jsqrcode.GF256Poly,
      errorLocations: js.Array[Double],
      dataMatrix: Boolean
    ): js.Array[Double] = js.native
    
    /* CompleteClass */
    override def runEuclideanAlgorithm(a: typingsJapgolly.jsqrcode.GF256Poly, b: typingsJapgolly.jsqrcode.GF256Poly, R: Double): js.Tuple2[typingsJapgolly.jsqrcode.GF256Poly, typingsJapgolly.jsqrcode.GF256Poly] = js.native
  }
  
  inline def URShift(number: Double, bits: Double): Double = (js.Dynamic.global.applyDynamic("URShift")(number.asInstanceOf[js.Any], bits.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("Version")
  @js.native
  open class Version protected ()
    extends StObject
       with typingsJapgolly.jsqrcode.Version {
    def this(
      versionNumber: Double,
      alignmentPatternCenters: js.Array[Double],
      ecBlocks1: typingsJapgolly.jsqrcode.ECBlocks,
      ecBlocks2: typingsJapgolly.jsqrcode.ECBlocks,
      ecBlocks3: typingsJapgolly.jsqrcode.ECBlocks,
      ecBlocks4: typingsJapgolly.jsqrcode.ECBlocks
    ) = this()
    
    /* CompleteClass */
    override val AlignmentPatternCenters: js.Array[Double] = js.native
    
    /* CompleteClass */
    override val DimensionForVersion: Double = js.native
    
    /* CompleteClass */
    override val TotalCodewords: Double = js.native
    
    /* CompleteClass */
    override val VersionNumber: Double = js.native
    
    /* CompleteClass */
    var alignmentPatternCenters: js.Array[Double] = js.native
    
    /* CompleteClass */
    override def buildFunctionPattern(): typingsJapgolly.jsqrcode.BitMatrix = js.native
    
    /* CompleteClass */
    var ecBlocks: js.Array[typingsJapgolly.jsqrcode.ECBlocks] = js.native
    
    /* CompleteClass */
    override def getECBlocksForLevel(ecLevel: typingsJapgolly.jsqrcode.ErrorCorrectionLevel): typingsJapgolly.jsqrcode.ECBlocks = js.native
    
    /* CompleteClass */
    var versionNumber: Double = js.native
  }
  object Version {
    
    @JSGlobal("Version")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSGlobal("Version.VERSIONS")
    @js.native
    val VERSIONS: js.Array[typingsJapgolly.jsqrcode.Version] = js.native
    
    /* static member */
    @JSGlobal("Version.VERSION_DECODE_INFO")
    @js.native
    val VERSION_DECODE_INFO: js.Array[Any] = js.native
    
    /* static member */
    inline def decodeVersionInformation(versionBits: Double): typingsJapgolly.jsqrcode.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeVersionInformation")(versionBits.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.Version]
    
    /* static member */
    inline def getProvisionalVersionForDimension(dimension: Double): typingsJapgolly.jsqrcode.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("getProvisionalVersionForDimension")(dimension.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.Version]
    
    /* static member */
    inline def getVersionForNumber(versionNumber: Double): typingsJapgolly.jsqrcode.Version = ^.asInstanceOf[js.Dynamic].applyDynamic("getVersionForNumber")(versionNumber.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.jsqrcode.Version]
  }
  
  inline def buildVersions(): js.Array[typingsJapgolly.jsqrcode.Version] = js.Dynamic.global.applyDynamic("buildVersions")().asInstanceOf[js.Array[typingsJapgolly.jsqrcode.Version]]
  
  object qrcode {
    
    @JSGlobal("qrcode")
    @js.native
    val ^ : js.Any = js.native
    
    inline def binarize(th: Double): js.Array[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("binarize")(th.asInstanceOf[js.Any]).asInstanceOf[js.Array[Boolean]]
    
    inline def callback(result: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("callback")(result.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def captureToCanvas(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureToCanvas")().asInstanceOf[Unit]
    
    @JSGlobal("qrcode.debug")
    @js.native
    def debug: Boolean = js.native
    inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
    
    inline def decode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")().asInstanceOf[Unit]
    inline def decode(src: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(src.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def decodeUrl(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_url")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def decodeUtf8(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("decode_utf8")(s.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getMiddleBrightnessPerArea(image: js.Array[Double]): js.Array[js.Array[Double]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMiddleBrightnessPerArea")(image.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Array[Double]]]
    
    inline def getPixel(x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getPixel")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def grayScaleToBitmap(grayScale: js.Array[Double]): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("grayScaleToBitmap")(grayScale.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    
    inline def grayscale(): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscale")().asInstanceOf[js.typedarray.Uint8Array]
    
    @JSGlobal("qrcode.height")
    @js.native
    def height: Double = js.native
    inline def height_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
    
    @JSGlobal("qrcode.imagedata")
    @js.native
    def imagedata: ImageData = js.native
    inline def imagedata_=(x: ImageData): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("imagedata")(x.asInstanceOf[js.Any])
    
    inline def isUrl(s: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(s.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSGlobal("qrcode.maxImgSize")
    @js.native
    def maxImgSize: Double = js.native
    inline def maxImgSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maxImgSize")(x.asInstanceOf[js.Any])
    
    inline def orderBestPatterns(patterns: js.Array[typingsJapgolly.jsqrcode.AlignmentPattern]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("orderBestPatterns")(patterns.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def process(ctx: CanvasRenderingContext2D): String = ^.asInstanceOf[js.Dynamic].applyDynamic("process")(ctx.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSGlobal("qrcode.qrCodeSymbol")
    @js.native
    def qrCodeSymbol: Any = js.native
    inline def qrCodeSymbol_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("qrCodeSymbol")(x.asInstanceOf[js.Any])
    
    inline def setWebcam(videoId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWebcam")(videoId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("qrcode.sizeOfDataLengthInfo")
    @js.native
    val sizeOfDataLengthInfo: js.Tuple3[
        js.Tuple4[`10`, `9`, `8`, `8`], 
        js.Tuple4[`12`, `11`, `16`, `10`], 
        js.Tuple4[`14`, `13`, `16`, `12`]
      ] = js.native
    
    inline def vidError(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vidError")().asInstanceOf[Unit]
    inline def vidError(error: Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("vidError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @JSGlobal("qrcode.width")
    @js.native
    def width: Double = js.native
    inline def width_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
  }
}
