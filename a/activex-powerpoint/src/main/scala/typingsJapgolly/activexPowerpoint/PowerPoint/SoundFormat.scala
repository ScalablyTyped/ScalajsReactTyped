package typingsJapgolly.activexPowerpoint.PowerPoint

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SoundFormat extends StObject {
  
  def Export(FileName: String): PpSoundFormatType
  
  def Import(FileName: String): Unit
  
  def Play(): Unit
  
  /* private */ @JSName("PowerPoint.SoundFormat_typekey")
  var PowerPointDotSoundFormat_typekey: SoundFormat
  
  val SourceFullName: String
  
  val Type: PpSoundFormatType
}
object SoundFormat {
  
  inline def apply(
    Export: String => PpSoundFormatType,
    Import: String => Callback,
    Play: Callback,
    PowerPointDotSoundFormat_typekey: SoundFormat,
    SourceFullName: String,
    Type: PpSoundFormatType
  ): SoundFormat = {
    val __obj = js.Dynamic.literal(Export = js.Any.fromFunction1(Export), Import = js.Any.fromFunction1((t0: String) => Import(t0).runNow()), Play = Play.toJsFn, SourceFullName = SourceFullName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SoundFormat_typekey")(PowerPointDotSoundFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SoundFormat]
  }
  
  extension [Self <: SoundFormat](x: Self) {
    
    inline def setExport(value: String => PpSoundFormatType): Self = StObject.set(x, "Export", js.Any.fromFunction1(value))
    
    inline def setImport(value: String => Callback): Self = StObject.set(x, "Import", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "Play", value.toJsFn)
    
    inline def setPowerPointDotSoundFormat_typekey(value: SoundFormat): Self = StObject.set(x, "PowerPoint.SoundFormat_typekey", value.asInstanceOf[js.Any])
    
    inline def setSourceFullName(value: String): Self = StObject.set(x, "SourceFullName", value.asInstanceOf[js.Any])
    
    inline def setType(value: PpSoundFormatType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
