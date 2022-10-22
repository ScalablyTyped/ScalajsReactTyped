package typingsJapgolly.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Result of transcoding a basis file
  */
trait TranscodeResult extends StObject {
  
  /**
    * Info about the .basis file
    */
  var fileInfo: BasisFileInfo
  
  /**
    * Format to use when loading the file
    */
  var format: Double
}
object TranscodeResult {
  
  inline def apply(fileInfo: BasisFileInfo, format: Double): TranscodeResult = {
    val __obj = js.Dynamic.literal(fileInfo = fileInfo.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any])
    __obj.asInstanceOf[TranscodeResult]
  }
  
  extension [Self <: TranscodeResult](x: Self) {
    
    inline def setFileInfo(value: BasisFileInfo): Self = StObject.set(x, "fileInfo", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
