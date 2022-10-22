package typingsJapgolly.ansiFragments

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildFragmentsIfragmentMod {
  
  trait IFragment extends StObject {
    
    def build(): String
  }
  object IFragment {
    
    inline def apply(build: CallbackTo[String]): IFragment = {
      val __obj = js.Dynamic.literal(build = build.toJsFn)
      __obj.asInstanceOf[IFragment]
    }
    
    extension [Self <: IFragment](x: Self) {
      
      inline def setBuild(value: CallbackTo[String]): Self = StObject.set(x, "build", value.toJsFn)
    }
  }
}
