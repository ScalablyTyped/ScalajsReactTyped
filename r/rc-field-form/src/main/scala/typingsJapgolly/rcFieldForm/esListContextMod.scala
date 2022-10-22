package typingsJapgolly.rcFieldForm

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.rcFieldForm.esInterfaceMod.InternalNamePath
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esListContextMod extends Shortcut {
  
  @JSImport("rc-field-form/es/ListContext", JSImport.Default)
  @js.native
  val default: Context[ListContextProps] = js.native
  
  trait ListContextProps extends StObject {
    
    def getKey(namePath: InternalNamePath): js.Tuple2[Key, InternalNamePath]
  }
  object ListContextProps {
    
    inline def apply(getKey: InternalNamePath => js.Tuple2[Key, InternalNamePath]): ListContextProps = {
      val __obj = js.Dynamic.literal(getKey = js.Any.fromFunction1(getKey))
      __obj.asInstanceOf[ListContextProps]
    }
    
    extension [Self <: ListContextProps](x: Self) {
      
      inline def setGetKey(value: InternalNamePath => js.Tuple2[Key, InternalNamePath]): Self = StObject.set(x, "getKey", js.Any.fromFunction1(value))
    }
  }
  
  type _To = Context[ListContextProps]
  
  /* This means you don't have to write `default`, but can instead just say `esListContextMod.foo` */
  override def _to: Context[ListContextProps] = default
}
