package typingsJapgolly.jimpCore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.jimpCore.anon.X
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEtcMod {
  
  trait Bitmap extends StObject {
    
    var data: Buffer
    
    var height: Double
    
    var width: Double
  }
  object Bitmap {
    
    inline def apply(data: Buffer, height: Double, width: Double): Bitmap = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bitmap]
    }
    
    extension [Self <: Bitmap](x: Self) {
      
      inline def setData(value: Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait BlendMode extends StObject {
    
    var mode: String
    
    var opacityDest: Double
    
    var opacitySource: Double
  }
  object BlendMode {
    
    inline def apply(mode: String, opacityDest: Double, opacitySource: Double): BlendMode = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], opacityDest = opacityDest.asInstanceOf[js.Any], opacitySource = opacitySource.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlendMode]
    }
    
    extension [Self <: BlendMode](x: Self) {
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOpacityDest(value: Double): Self = StObject.set(x, "opacityDest", value.asInstanceOf[js.Any])
      
      inline def setOpacitySource(value: Double): Self = StObject.set(x, "opacitySource", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jimpCore.jimpCoreStrings.background
    - typingsJapgolly.jimpCore.jimpCoreStrings.scan
    - typingsJapgolly.jimpCore.jimpCoreStrings.crop
  */
  trait ChangeName extends StObject
  object ChangeName {
    
    inline def background: typingsJapgolly.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.background]
    
    inline def crop: typingsJapgolly.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.crop]
    
    inline def scan: typingsJapgolly.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.scan]
  }
  
  type DecoderFn = js.Function1[/* data */ Buffer, Bitmap]
  
  type EncoderFn[ImageType /* <: Image */] = js.Function1[/* image */ ImageType, Buffer]
  
  type GenericCallback[T, U, TThis] = js.ThisFunction2[/* this */ TThis, /* err */ js.Error | Null, /* value */ T, U]
  
  trait Image extends StObject {
    
    var bitmap: Bitmap
  }
  object Image {
    
    inline def apply(bitmap: Bitmap): Image = {
      val __obj = js.Dynamic.literal(bitmap = bitmap.asInstanceOf[js.Any])
      __obj.asInstanceOf[Image]
    }
    
    extension [Self <: Image](x: Self) {
      
      inline def setBitmap(value: Bitmap): Self = StObject.set(x, "bitmap", value.asInstanceOf[js.Any])
    }
  }
  
  type ImageCallback[jimp] = js.ThisFunction3[/* this */ jimp, /* err */ js.Error | Null, /* value */ jimp, /* coords */ X, Any]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.jimpCore.jimpCoreStrings.any
    - typingsJapgolly.jimpCore.jimpCoreStrings.initialized
    - typingsJapgolly.jimpCore.jimpCoreStrings.`before-change`
    - typingsJapgolly.jimpCore.jimpCoreStrings.changed
    - typingsJapgolly.jimpCore.jimpCoreStrings.`before-clone`
    - typingsJapgolly.jimpCore.jimpCoreStrings.cloned
    - typingsJapgolly.jimpCore.jimpCoreStrings.background
    - typingsJapgolly.jimpCore.jimpCoreStrings.scan
    - typingsJapgolly.jimpCore.jimpCoreStrings.crop
  */
  trait ListenableName extends StObject
  object ListenableName {
    
    inline def any: typingsJapgolly.jimpCore.jimpCoreStrings.any = "any".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.any]
    
    inline def background: typingsJapgolly.jimpCore.jimpCoreStrings.background = "background".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.background]
    
    inline def `before-change`: typingsJapgolly.jimpCore.jimpCoreStrings.`before-change` = "before-change".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.`before-change`]
    
    inline def `before-clone`: typingsJapgolly.jimpCore.jimpCoreStrings.`before-clone` = "before-clone".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.`before-clone`]
    
    inline def changed: typingsJapgolly.jimpCore.jimpCoreStrings.changed = "changed".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.changed]
    
    inline def cloned: typingsJapgolly.jimpCore.jimpCoreStrings.cloned = "cloned".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.cloned]
    
    inline def crop: typingsJapgolly.jimpCore.jimpCoreStrings.crop = "crop".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.crop]
    
    inline def initialized: typingsJapgolly.jimpCore.jimpCoreStrings.initialized = "initialized".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.initialized]
    
    inline def scan: typingsJapgolly.jimpCore.jimpCoreStrings.scan = "scan".asInstanceOf[typingsJapgolly.jimpCore.jimpCoreStrings.scan]
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends 'any' ? any : T extends @jimp/core.@jimp/core/types/etc.ChangeName ? {  eventName :'before-change' | 'changed',   methodName :T, [key: string] : any} : {  eventName :T,   methodName :T extends 'initialized' ? 'constructor' : T extends 'before-change' | 'changed' ? @jimp/core.@jimp/core/types/etc.ChangeName : T extends 'before-clone' | 'cloned' ? 'clone' : any}
    }}}
    */
  @js.native
  trait ListenerData[T /* <: ListenableName */] extends StObject
  
  trait RGB extends StObject {
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGB {
    
    inline def apply(b: Double, g: Double, r: Double): RGB = {
      val __obj = js.Dynamic.literal(b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGB]
    }
    
    extension [Self <: RGB](x: Self) {
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait RGBA extends StObject {
    
    var a: Double
    
    var b: Double
    
    var g: Double
    
    var r: Double
  }
  object RGBA {
    
    inline def apply(a: Double, b: Double, g: Double, r: Double): RGBA = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any], r = r.asInstanceOf[js.Any])
      __obj.asInstanceOf[RGBA]
    }
    
    extension [Self <: RGBA](x: Self) {
      
      inline def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      inline def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
      
      inline def setG(value: Double): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      inline def setR(value: Double): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    }
  }
  
  trait URLOptions extends StObject {
    
    var compression: js.UndefOr[Boolean] = js.undefined
    
    var headers: StringDictionary[Any]
    
    var url: String
  }
  object URLOptions {
    
    inline def apply(headers: StringDictionary[Any], url: String): URLOptions = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[URLOptions]
    }
    
    extension [Self <: URLOptions](x: Self) {
      
      inline def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setHeaders(value: StringDictionary[Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
