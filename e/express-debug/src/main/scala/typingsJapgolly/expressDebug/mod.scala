package typingsJapgolly.expressDebug

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Application_
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressDebug.anon.Depth
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Node.js middleware for serving a favicon.
    */
  inline def apply(app: Application_): Unit = ^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(app: Application_, settings: Depth): Unit = (^.asInstanceOf[js.Dynamic].apply(app.asInstanceOf[js.Any], settings.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("express-debug", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CustomPanel extends StObject {
    
    @JSName("finalize")
    var finalize_FCustomPanel: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var initialize: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var name: String
    
    var options: js.UndefOr[Any] = js.undefined
    
    var post_render: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Unit
        ]
      ] = js.undefined
    
    var pre_render: js.UndefOr[
        js.Function1[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          Unit
        ]
      ] = js.undefined
    
    def process(locals: Any): Any
    
    var standalone: js.UndefOr[Boolean] = js.undefined
    
    var template: String
  }
  object CustomPanel {
    
    inline def apply(name: String, process: Any => Any, template: String): CustomPanel = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomPanel]
    }
    
    extension [Self <: CustomPanel](x: Self) {
      
      inline def setFinalize_(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Callback
      ): Self = StObject.set(x, "finalize", js.Any.fromFunction1((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => value(t0).runNow()))
      
      inline def setFinalize_Undefined: Self = StObject.set(x, "finalize", js.undefined)
      
      inline def setInitialize(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Callback
      ): Self = StObject.set(x, "initialize", js.Any.fromFunction1((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => value(t0).runNow()))
      
      inline def setInitializeUndefined: Self = StObject.set(x, "initialize", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPost_render(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Callback
      ): Self = StObject.set(x, "post_render", js.Any.fromFunction1((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => value(t0).runNow()))
      
      inline def setPost_renderUndefined: Self = StObject.set(x, "post_render", js.undefined)
      
      inline def setPre_render(
        value: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ] => Callback
      ): Self = StObject.set(x, "pre_render", js.Any.fromFunction1((t0: /* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ]) => value(t0).runNow()))
      
      inline def setPre_renderUndefined: Self = StObject.set(x, "pre_render", js.undefined)
      
      inline def setProcess(value: Any => Any): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
      
      inline def setStandaloneUndefined: Self = StObject.set(x, "standalone", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
}
