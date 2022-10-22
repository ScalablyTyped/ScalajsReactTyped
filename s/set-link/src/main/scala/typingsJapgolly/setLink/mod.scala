package typingsJapgolly.setLink

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.setLink.anon.Attach
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("set-link", JSImport.Namespace)
  @js.native
  val ^ : (RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]) & Attach = js.native
  
  type _To = (RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]) & Attach
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: (RequestHandler[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
    Any, 
    Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
    Record[String, Any]
  ]) & Attach = ^
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Response extends StObject {
      
      def setLink(link: String, rel: String): Unit
    }
    object Response {
      
      inline def apply(setLink: (String, String) => Callback): Response = {
        val __obj = js.Dynamic.literal(setLink = js.Any.fromFunction2((t0: String, t1: String) => (setLink(t0, t1)).runNow()))
        __obj.asInstanceOf[Response]
      }
      
      extension [Self <: Response](x: Self) {
        
        inline def setSetLink(value: (String, String) => Callback): Self = StObject.set(x, "setLink", js.Any.fromFunction2((t0: String, t1: String) => (value(t0, t1)).runNow()))
      }
    }
  }
}
