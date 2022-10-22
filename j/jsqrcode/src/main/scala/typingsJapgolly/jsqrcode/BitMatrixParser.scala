package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BitMatrixParser extends StObject {
  
  var bitMatrix: BitMatrix
  
  def copyBit(i: Double, j: Double, versionBits: Double): Double
  
  var parsedFormatInfo: FormatInformation
  
  var parsedVersion: Version
  
  def readCodewords(): js.Array[Double]
  
  def readFormatInformation(): FormatInformation
  
  def readVersion(): Version
}
object BitMatrixParser {
  
  inline def apply(
    bitMatrix: BitMatrix,
    copyBit: (Double, Double, Double) => Double,
    parsedFormatInfo: FormatInformation,
    parsedVersion: Version,
    readCodewords: CallbackTo[js.Array[Double]],
    readFormatInformation: CallbackTo[FormatInformation],
    readVersion: CallbackTo[Version]
  ): BitMatrixParser = {
    val __obj = js.Dynamic.literal(bitMatrix = bitMatrix.asInstanceOf[js.Any], copyBit = js.Any.fromFunction3(copyBit), parsedFormatInfo = parsedFormatInfo.asInstanceOf[js.Any], parsedVersion = parsedVersion.asInstanceOf[js.Any], readCodewords = readCodewords.toJsFn, readFormatInformation = readFormatInformation.toJsFn, readVersion = readVersion.toJsFn)
    __obj.asInstanceOf[BitMatrixParser]
  }
  
  extension [Self <: BitMatrixParser](x: Self) {
    
    inline def setBitMatrix(value: BitMatrix): Self = StObject.set(x, "bitMatrix", value.asInstanceOf[js.Any])
    
    inline def setCopyBit(value: (Double, Double, Double) => Double): Self = StObject.set(x, "copyBit", js.Any.fromFunction3(value))
    
    inline def setParsedFormatInfo(value: FormatInformation): Self = StObject.set(x, "parsedFormatInfo", value.asInstanceOf[js.Any])
    
    inline def setParsedVersion(value: Version): Self = StObject.set(x, "parsedVersion", value.asInstanceOf[js.Any])
    
    inline def setReadCodewords(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "readCodewords", value.toJsFn)
    
    inline def setReadFormatInformation(value: CallbackTo[FormatInformation]): Self = StObject.set(x, "readFormatInformation", value.toJsFn)
    
    inline def setReadVersion(value: CallbackTo[Version]): Self = StObject.set(x, "readVersion", value.toJsFn)
  }
}
