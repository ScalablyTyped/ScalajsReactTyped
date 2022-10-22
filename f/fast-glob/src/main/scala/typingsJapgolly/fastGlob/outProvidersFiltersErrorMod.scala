package typingsJapgolly.fastGlob

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.fastGlob.outTypesMod.ErrorFilterFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outProvidersFiltersErrorMod {
  
  @JSImport("fast-glob/out/providers/filters/error", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with ErrorFilter {
    def this(_settings: typingsJapgolly.fastGlob.outSettingsMod.default) = this()
    
    /* private */ /* CompleteClass */
    var _isNonFatalError: Any = js.native
    
    /* private */ /* CompleteClass */
    override val _settings: Any = js.native
    
    /* CompleteClass */
    override def getFilter(): ErrorFilterFunction = js.native
  }
  
  trait ErrorFilter extends StObject {
    
    /* private */ var _isNonFatalError: Any
    
    /* private */ val _settings: Any
    
    def getFilter(): ErrorFilterFunction
  }
  object ErrorFilter {
    
    inline def apply(_isNonFatalError: Any, _settings: Any, getFilter: CallbackTo[ErrorFilterFunction]): ErrorFilter = {
      val __obj = js.Dynamic.literal(_isNonFatalError = _isNonFatalError.asInstanceOf[js.Any], _settings = _settings.asInstanceOf[js.Any], getFilter = getFilter.toJsFn)
      __obj.asInstanceOf[ErrorFilter]
    }
    
    extension [Self <: ErrorFilter](x: Self) {
      
      inline def setGetFilter(value: CallbackTo[ErrorFilterFunction]): Self = StObject.set(x, "getFilter", value.toJsFn)
      
      inline def set_isNonFatalError(value: Any): Self = StObject.set(x, "_isNonFatalError", value.asInstanceOf[js.Any])
      
      inline def set_settings(value: Any): Self = StObject.set(x, "_settings", value.asInstanceOf[js.Any])
    }
  }
}
