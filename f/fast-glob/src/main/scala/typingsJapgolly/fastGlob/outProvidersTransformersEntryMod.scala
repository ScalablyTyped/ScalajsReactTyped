package typingsJapgolly.fastGlob

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastGlob.outTypesMod.EntryTransformerFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersTransformersEntryMod {
  
  @JSImport("fast-glob/out/providers/transformers/entry", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EntryTransformer {
    def this(_settings: typingsJapgolly.fastGlob.outSettingsMod.default) = this()
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* private */ /* CompleteClass */
    var _transform: Any = js.native
    
    /* CompleteClass */
    override def getTransformer(): EntryTransformerFunction = js.native
  }
  
  trait EntryTransformer extends StObject {
    
    /* private */ val _settings: Any
    
    /* private */ var _transform: Any
    
    def getTransformer(): EntryTransformerFunction
  }
  object EntryTransformer {
    
    inline def apply(_settings: Any, _transform: Any, getTransformer: CallbackTo[EntryTransformerFunction]): EntryTransformer = {
      val __obj = js.Dynamic.literal(_settings = _settings.asInstanceOf[js.Any], _transform = _transform.asInstanceOf[js.Any], getTransformer = getTransformer.toJsFn)
      __obj.asInstanceOf[EntryTransformer]
    }
    
    extension [Self <: EntryTransformer](x: Self) {
      
      inline def setGetTransformer(value: CallbackTo[EntryTransformerFunction]): Self = StObject.set(x, "getTransformer", value.toJsFn)
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
      
      inline def set_transform(value: Any): Self = StObject.set(x, "_transform", value.asInstanceOf[js.Any])
    }
  }
}
