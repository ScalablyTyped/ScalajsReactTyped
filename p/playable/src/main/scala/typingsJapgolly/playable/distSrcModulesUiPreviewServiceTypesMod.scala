package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesUiPreviewServiceTypesMod {
  
  trait IFramePositionInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object IFramePositionInSprite {
    
    inline def apply(horz: Double, vert: Double): IFramePositionInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramePositionInSprite]
    }
    
    extension [Self <: IFramePositionInSprite](x: Self) {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFrameSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object IFrameSize {
    
    inline def apply(height: Double, width: Double): IFrameSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrameSize]
    }
    
    extension [Self <: IFrameSize](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait IFramesData extends StObject {
    
    var framesCount: Double
    
    var qualities: js.Array[IFramesQuality]
  }
  object IFramesData {
    
    inline def apply(framesCount: Double, qualities: js.Array[IFramesQuality]): IFramesData = {
      val __obj = js.Dynamic.literal(framesCount = framesCount.asInstanceOf[js.Any], qualities = qualities.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramesData]
    }
    
    extension [Self <: IFramesData](x: Self) {
      
      inline def setFramesCount(value: Double): Self = StObject.set(x, "framesCount", value.asInstanceOf[js.Any])
      
      inline def setQualities(value: js.Array[IFramesQuality]): Self = StObject.set(x, "qualities", value.asInstanceOf[js.Any])
      
      inline def setQualitiesVarargs(value: IFramesQuality*): Self = StObject.set(x, "qualities", js.Array(value*))
    }
  }
  
  trait IFramesQuality extends StObject {
    
    var frameSize: IFrameSize
    
    var framesInSprite: IMaxFramesInSprite
    
    var spriteUrlMask: String
  }
  object IFramesQuality {
    
    inline def apply(frameSize: IFrameSize, framesInSprite: IMaxFramesInSprite, spriteUrlMask: String): IFramesQuality = {
      val __obj = js.Dynamic.literal(frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrlMask = spriteUrlMask.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFramesQuality]
    }
    
    extension [Self <: IFramesQuality](x: Self) {
      
      inline def setFrameSize(value: IFrameSize): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFramesInSprite(value: IMaxFramesInSprite): Self = StObject.set(x, "framesInSprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUrlMask(value: String): Self = StObject.set(x, "spriteUrlMask", value.asInstanceOf[js.Any])
    }
  }
  
  trait IMaxFramesInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object IMaxFramesInSprite {
    
    inline def apply(horz: Double, vert: Double): IMaxFramesInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[IMaxFramesInSprite]
    }
    
    extension [Self <: IMaxFramesInSprite](x: Self) {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
  
  trait INormalizedFramesQuality extends StObject {
    
    var framePositionInSprite: IFramePositionInSprite
    
    var frameSize: IFrameSize
    
    var framesInSprite: ITotalFramesInSprite
    
    var spriteUrl: String
  }
  object INormalizedFramesQuality {
    
    inline def apply(
      framePositionInSprite: IFramePositionInSprite,
      frameSize: IFrameSize,
      framesInSprite: ITotalFramesInSprite,
      spriteUrl: String
    ): INormalizedFramesQuality = {
      val __obj = js.Dynamic.literal(framePositionInSprite = framePositionInSprite.asInstanceOf[js.Any], frameSize = frameSize.asInstanceOf[js.Any], framesInSprite = framesInSprite.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[INormalizedFramesQuality]
    }
    
    extension [Self <: INormalizedFramesQuality](x: Self) {
      
      inline def setFramePositionInSprite(value: IFramePositionInSprite): Self = StObject.set(x, "framePositionInSprite", value.asInstanceOf[js.Any])
      
      inline def setFrameSize(value: IFrameSize): Self = StObject.set(x, "frameSize", value.asInstanceOf[js.Any])
      
      inline def setFramesInSprite(value: ITotalFramesInSprite): Self = StObject.set(x, "framesInSprite", value.asInstanceOf[js.Any])
      
      inline def setSpriteUrl(value: String): Self = StObject.set(x, "spriteUrl", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPreviewAPI extends StObject {
    
    var setFramesMap: js.UndefOr[js.Function1[/* map */ IFramesData, Unit]] = js.undefined
  }
  object IPreviewAPI {
    
    inline def apply(): IPreviewAPI = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPreviewAPI]
    }
    
    extension [Self <: IPreviewAPI](x: Self) {
      
      inline def setSetFramesMap(value: /* map */ IFramesData => Callback): Self = StObject.set(x, "setFramesMap", js.Any.fromFunction1((t0: /* map */ IFramesData) => value(t0).runNow()))
      
      inline def setSetFramesMapUndefined: Self = StObject.set(x, "setFramesMap", js.undefined)
    }
  }
  
  trait IPreviewService extends StObject {
    
    def destroy(): Unit
    
    def getAt(second: Double): js.Array[INormalizedFramesQuality]
    
    def setFramesMap(map: IFramesData): Unit
  }
  object IPreviewService {
    
    inline def apply(
      destroy: Callback,
      getAt: Double => js.Array[INormalizedFramesQuality],
      setFramesMap: IFramesData => Callback
    ): IPreviewService = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, getAt = js.Any.fromFunction1(getAt), setFramesMap = js.Any.fromFunction1((t0: IFramesData) => setFramesMap(t0).runNow()))
      __obj.asInstanceOf[IPreviewService]
    }
    
    extension [Self <: IPreviewService](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setGetAt(value: Double => js.Array[INormalizedFramesQuality]): Self = StObject.set(x, "getAt", js.Any.fromFunction1(value))
      
      inline def setSetFramesMap(value: IFramesData => Callback): Self = StObject.set(x, "setFramesMap", js.Any.fromFunction1((t0: IFramesData) => value(t0).runNow()))
    }
  }
  
  trait ITotalFramesInSprite extends StObject {
    
    var horz: Double
    
    var vert: Double
  }
  object ITotalFramesInSprite {
    
    inline def apply(horz: Double, vert: Double): ITotalFramesInSprite = {
      val __obj = js.Dynamic.literal(horz = horz.asInstanceOf[js.Any], vert = vert.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITotalFramesInSprite]
    }
    
    extension [Self <: ITotalFramesInSprite](x: Self) {
      
      inline def setHorz(value: Double): Self = StObject.set(x, "horz", value.asInstanceOf[js.Any])
      
      inline def setVert(value: Double): Self = StObject.set(x, "vert", value.asInstanceOf[js.Any])
    }
  }
}
