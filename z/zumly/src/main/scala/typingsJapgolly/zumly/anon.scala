package typingsJapgolly.zumly

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.zumly.zumlyStrings.blur
import typingsJapgolly.zumly.zumlyStrings.height
import typingsJapgolly.zumly.zumlyStrings.saturate
import typingsJapgolly.zumly.zumlyStrings.sepia
import typingsJapgolly.zumly.zumlyStrings.width
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cover extends StObject {
    
    // How new injected view is adapted. String. Default 'width'
    var cover: height | width
    
    // Transition duration. Default '1s'
    var duration: String
    
    // Transition ease. Default 'ease-in-out'
    var ease: String
    
    // Effects for background views
    var effects: js.Array[blur | sepia | saturate]
  }
  object Cover {
    
    inline def apply(cover: height | width, duration: String, ease: String, effects: js.Array[blur | sepia | saturate]): Cover = {
      val __obj = js.Dynamic.literal(cover = cover.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], ease = ease.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cover]
    }
    
    extension [Self <: Cover](x: Self) {
      
      inline def setCover(value: height | width): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEase(value: String): Self = StObject.set(x, "ease", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: js.Array[blur | sepia | saturate]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: (blur | sepia | saturate)*): Self = StObject.set(x, "effects", js.Array(value*))
    }
  }
  
  trait Render extends StObject {
    
    def render(): js.Promise[String]
  }
  object Render {
    
    inline def apply(render: CallbackTo[js.Promise[String]]): Render = {
      val __obj = js.Dynamic.literal(render = render.toJsFn)
      __obj.asInstanceOf[Render]
    }
    
    extension [Self <: Render](x: Self) {
      
      inline def setRender(value: CallbackTo[js.Promise[String]]): Self = StObject.set(x, "render", value.toJsFn)
    }
  }
}
