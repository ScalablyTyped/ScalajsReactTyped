package typingsJapgolly.absoluteUrl

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("absolute-url", JSImport.Namespace)
  @js.native
  val ^ : AbsoluteUrl = js.native
  
  @js.native
  trait AbsoluteUrl extends StObject {
    
    def apply(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    def attach(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ]
    ): Unit = js.native
  }
  
  type _To = AbsoluteUrl
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: AbsoluteUrl = ^
  
  /* augmented module */
  object expressServeStaticCoreAugmentingMod {
    
    trait Request extends StObject {
      
      def absoluteUrl(): String
    }
    object Request {
      
      inline def apply(absoluteUrl: CallbackTo[String]): Request = {
        val __obj = js.Dynamic.literal(absoluteUrl = absoluteUrl.toJsFn)
        __obj.asInstanceOf[Request]
      }
      
      extension [Self <: Request](x: Self) {
        
        inline def setAbsoluteUrl(value: CallbackTo[String]): Self = StObject.set(x, "absoluteUrl", value.toJsFn)
      }
    }
  }
}
