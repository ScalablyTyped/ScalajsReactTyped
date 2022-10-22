package typingsJapgolly.antvGLite

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.DOMRect
import typingsJapgolly.antvGLite.anon.PartialDataURLOptions
import typingsJapgolly.antvGLite.distTypesMod.CanvasLike
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesContextServiceMod {
  
  trait ContextService[Context] extends StObject {
    
    def applyCursorStyle(cursor: String): Unit
    
    def destroy(): Unit
    
    def getBoundingClientRect(): js.UndefOr[DOMRect]
    
    def getContext(): Context | Null
    
    def getDPR(): Double
    
    def getDomElement(): CanvasLike | Null
    
    def init(): js.Promise[Unit]
    
    def resize(width: Double, height: Double): Unit
    
    def toDataURL(options: PartialDataURLOptions): js.Promise[String]
  }
  object ContextService {
    
    @JSImport("@antv/g-lite/dist/services/ContextService", "ContextService")
    @js.native
    val ^ : DefinedToken = js.native
    
    extension [Self <: ContextService[?], Context](x: Self & ContextService[Context]) {
      
      inline def setApplyCursorStyle(value: String => Callback): Self = StObject.set(x, "applyCursorStyle", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetBoundingClientRect(value: CallbackTo[js.UndefOr[DOMRect]]): Self = StObject.set(x, "getBoundingClientRect", value.toJsFn)
      
      inline def setGetContext(value: CallbackTo[Context | Null]): Self = StObject.set(x, "getContext", value.toJsFn)
      
      inline def setGetDPR(value: CallbackTo[Double]): Self = StObject.set(x, "getDPR", value.toJsFn)
      
      inline def setGetDomElement(value: CallbackTo[CanvasLike | Null]): Self = StObject.set(x, "getDomElement", value.toJsFn)
      
      inline def setInit(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "init", value.toJsFn)
      
      inline def setResize(value: (Double, Double) => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction2((t0: Double, t1: Double) => (value(t0, t1)).runNow()))
      
      inline def setToDataURL(value: PartialDataURLOptions => js.Promise[String]): Self = StObject.set(x, "toDataURL", js.Any.fromFunction1(value))
    }
  }
  
  trait DataURLOptions extends StObject {
    
    /**
      * The image quality between 0 and 1 for image/jpeg and image/webp.
      */
    var encoderOptions: Double
    
    /**
      * The default type is image/png.
      */
    var `type`: DataURLType
  }
  object DataURLOptions {
    
    inline def apply(encoderOptions: Double, `type`: DataURLType): DataURLOptions = {
      val __obj = js.Dynamic.literal(encoderOptions = encoderOptions.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataURLOptions]
    }
    
    extension [Self <: DataURLOptions](x: Self) {
      
      inline def setEncoderOptions(value: Double): Self = StObject.set(x, "encoderOptions", value.asInstanceOf[js.Any])
      
      inline def setType(value: DataURLType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashpng
    - typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashjpeg
    - typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashwebp
    - typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashbmp
  */
  trait DataURLType extends StObject
  object DataURLType {
    
    inline def imageSlashbmp: typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashbmp = "image/bmp".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashbmp]
    
    inline def imageSlashjpeg: typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashjpeg = "image/jpeg".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashjpeg]
    
    inline def imageSlashpng: typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashpng = "image/png".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashpng]
    
    inline def imageSlashwebp: typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashwebp = "image/webp".asInstanceOf[typingsJapgolly.antvGLite.antvGLiteStrings.imageSlashwebp]
  }
}
