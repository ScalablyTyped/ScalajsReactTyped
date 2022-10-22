package typingsJapgolly.tailwindcss.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.tailwindcss.typesConfigMod.ExtractorFn
import typingsJapgolly.tailwindcss.typesConfigMod.FilePath
import typingsJapgolly.tailwindcss.typesConfigMod.RawFile
import typingsJapgolly.tailwindcss.typesConfigMod.TransformerFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extract extends StObject {
  
  var extract: js.UndefOr[ExtractorFn | StringDictionary[ExtractorFn]] = js.undefined
  
  var files: js.Array[FilePath | RawFile]
  
  var transform: js.UndefOr[TransformerFn | StringDictionary[TransformerFn]] = js.undefined
}
object Extract {
  
  inline def apply(files: js.Array[FilePath | RawFile]): Extract = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extract]
  }
  
  extension [Self <: Extract](x: Self) {
    
    inline def setExtract(value: ExtractorFn | StringDictionary[ExtractorFn]): Self = StObject.set(x, "extract", value.asInstanceOf[js.Any])
    
    inline def setExtractFunction1(value: /* content */ String => js.Array[String]): Self = StObject.set(x, "extract", js.Any.fromFunction1(value))
    
    inline def setExtractUndefined: Self = StObject.set(x, "extract", js.undefined)
    
    inline def setFiles(value: js.Array[FilePath | RawFile]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesVarargs(value: (FilePath | RawFile)*): Self = StObject.set(x, "files", js.Array(value*))
    
    inline def setTransform(value: TransformerFn | StringDictionary[TransformerFn]): Self = StObject.set(x, "transform", value.asInstanceOf[js.Any])
    
    inline def setTransformFunction1(value: /* content */ String => String): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    inline def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
  }
}
