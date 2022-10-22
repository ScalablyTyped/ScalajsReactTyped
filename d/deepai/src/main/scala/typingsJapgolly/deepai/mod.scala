package typingsJapgolly.deepai

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.deepai.anon.Id
import typingsJapgolly.deepai.anon.Image
import typingsJapgolly.deepai.anon.Image1
import typingsJapgolly.deepai.anon.Text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("deepai", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def callStandardApi[T /* <: Models */](
    modelName: T,
    inputs_object: /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelInputs[T] */ js.Any
  ): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelOutputs[T] */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("callStandardApi")(modelName.asInstanceOf[js.Any], inputs_object.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: deepai.deepai.ModelOutputs[T] */ js.Any
  ]]
  
  inline def setApiKey(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setApiKey")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait ModelInputs extends StObject {
    
    var colorizer: Image
    
    var deepdream: Image
    
    var `image-similarity`: Image1
    
    var `nsfw-detector`: Image
    
    var `sentiment-analysis`: Text
    
    var summarization: Text
    
    var `text-generator`: Text
    
    var `text-tagging`: Text
    
    var text2img: Text
    
    var toonify: Image
    
    var `torch-srgan`: Image
    
    var waifu2x: Image
  }
  object ModelInputs {
    
    inline def apply(
      colorizer: Image,
      deepdream: Image,
      `image-similarity`: Image1,
      `nsfw-detector`: Image,
      `sentiment-analysis`: Text,
      summarization: Text,
      `text-generator`: Text,
      `text-tagging`: Text,
      text2img: Text,
      toonify: Image,
      `torch-srgan`: Image,
      waifu2x: Image
    ): ModelInputs = {
      val __obj = js.Dynamic.literal(colorizer = colorizer.asInstanceOf[js.Any], deepdream = deepdream.asInstanceOf[js.Any], summarization = summarization.asInstanceOf[js.Any], text2img = text2img.asInstanceOf[js.Any], toonify = toonify.asInstanceOf[js.Any], waifu2x = waifu2x.asInstanceOf[js.Any])
      __obj.updateDynamic("image-similarity")(`image-similarity`.asInstanceOf[js.Any])
      __obj.updateDynamic("nsfw-detector")(`nsfw-detector`.asInstanceOf[js.Any])
      __obj.updateDynamic("sentiment-analysis")(`sentiment-analysis`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-generator")(`text-generator`.asInstanceOf[js.Any])
      __obj.updateDynamic("text-tagging")(`text-tagging`.asInstanceOf[js.Any])
      __obj.updateDynamic("torch-srgan")(`torch-srgan`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelInputs]
    }
    
    extension [Self <: ModelInputs](x: Self) {
      
      inline def setColorizer(value: Image): Self = StObject.set(x, "colorizer", value.asInstanceOf[js.Any])
      
      inline def setDeepdream(value: Image): Self = StObject.set(x, "deepdream", value.asInstanceOf[js.Any])
      
      inline def `setImage-similarity`(value: Image1): Self = StObject.set(x, "image-similarity", value.asInstanceOf[js.Any])
      
      inline def `setNsfw-detector`(value: Image): Self = StObject.set(x, "nsfw-detector", value.asInstanceOf[js.Any])
      
      inline def `setSentiment-analysis`(value: Text): Self = StObject.set(x, "sentiment-analysis", value.asInstanceOf[js.Any])
      
      inline def setSummarization(value: Text): Self = StObject.set(x, "summarization", value.asInstanceOf[js.Any])
      
      inline def `setText-generator`(value: Text): Self = StObject.set(x, "text-generator", value.asInstanceOf[js.Any])
      
      inline def `setText-tagging`(value: Text): Self = StObject.set(x, "text-tagging", value.asInstanceOf[js.Any])
      
      inline def setText2img(value: Text): Self = StObject.set(x, "text2img", value.asInstanceOf[js.Any])
      
      inline def setToonify(value: Image): Self = StObject.set(x, "toonify", value.asInstanceOf[js.Any])
      
      inline def `setTorch-srgan`(value: Image): Self = StObject.set(x, "torch-srgan", value.asInstanceOf[js.Any])
      
      inline def setWaifu2x(value: Image): Self = StObject.set(x, "waifu2x", value.asInstanceOf[js.Any])
    }
  }
  
  trait ModelOutputs
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var `torch-srgan`: Id
  }
  object ModelOutputs {
    
    inline def apply(`torch-srgan`: Id): ModelOutputs = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("torch-srgan")(`torch-srgan`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModelOutputs]
    }
    
    extension [Self <: ModelOutputs](x: Self) {
      
      inline def `setTorch-srgan`(value: Id): Self = StObject.set(x, "torch-srgan", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.deepai.deepaiStrings.colorizer
    - typingsJapgolly.deepai.deepaiStrings.text2img
    - typingsJapgolly.deepai.deepaiStrings.`text-generator`
    - typingsJapgolly.deepai.deepaiStrings.`torch-srgan`
    - typingsJapgolly.deepai.deepaiStrings.waifu2x
    - typingsJapgolly.deepai.deepaiStrings.`nsfw-detector`
    - typingsJapgolly.deepai.deepaiStrings.toonify
    - typingsJapgolly.deepai.deepaiStrings.`image-similarity`
    - typingsJapgolly.deepai.deepaiStrings.deepdream
    - typingsJapgolly.deepai.deepaiStrings.summarization
    - typingsJapgolly.deepai.deepaiStrings.`sentiment-analysis`
    - typingsJapgolly.deepai.deepaiStrings.`text-tagging`
  */
  trait Models extends StObject
  object Models {
    
    inline def colorizer: typingsJapgolly.deepai.deepaiStrings.colorizer = "colorizer".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.colorizer]
    
    inline def deepdream: typingsJapgolly.deepai.deepaiStrings.deepdream = "deepdream".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.deepdream]
    
    inline def `image-similarity`: typingsJapgolly.deepai.deepaiStrings.`image-similarity` = "image-similarity".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`image-similarity`]
    
    inline def `nsfw-detector`: typingsJapgolly.deepai.deepaiStrings.`nsfw-detector` = "nsfw-detector".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`nsfw-detector`]
    
    inline def `sentiment-analysis`: typingsJapgolly.deepai.deepaiStrings.`sentiment-analysis` = "sentiment-analysis".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`sentiment-analysis`]
    
    inline def summarization: typingsJapgolly.deepai.deepaiStrings.summarization = "summarization".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.summarization]
    
    inline def `text-generator`: typingsJapgolly.deepai.deepaiStrings.`text-generator` = "text-generator".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`text-generator`]
    
    inline def `text-tagging`: typingsJapgolly.deepai.deepaiStrings.`text-tagging` = "text-tagging".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`text-tagging`]
    
    inline def text2img: typingsJapgolly.deepai.deepaiStrings.text2img = "text2img".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.text2img]
    
    inline def toonify: typingsJapgolly.deepai.deepaiStrings.toonify = "toonify".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.toonify]
    
    inline def `torch-srgan`: typingsJapgolly.deepai.deepaiStrings.`torch-srgan` = "torch-srgan".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.`torch-srgan`]
    
    inline def waifu2x: typingsJapgolly.deepai.deepaiStrings.waifu2x = "waifu2x".asInstanceOf[typingsJapgolly.deepai.deepaiStrings.waifu2x]
  }
}
