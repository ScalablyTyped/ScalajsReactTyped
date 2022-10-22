package typingsJapgolly.angularDevkitBuildAngular.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config[T] extends StObject {
  
  var config: js.UndefOr[
    js.ThisFunction2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.PartialConfig */ /* configuration */ Any, 
      /* loaderArguments */ CustomOptions[T], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any
    ]
  ] = js.undefined
  
  var customOptions: js.UndefOr[
    js.ThisFunction2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
      /* loaderOptions */ Record[String, Any], 
      /* loaderArguments */ Map, 
      js.Promise[Custom[T]]
    ]
  ] = js.undefined
  
  var result: js.UndefOr[
    js.ThisFunction2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.BabelFileResult */ /* result */ Any, 
      /* context */ Configuration[T], 
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.BabelFileResult */ Any
    ]
  ] = js.undefined
}
object Config {
  
  inline def apply[T](): Config[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Config[T]]
  }
  
  extension [Self <: Config[?], T](x: Self & Config[T]) {
    
    inline def setConfig(
      value: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.PartialConfig */ /* configuration */ Any, 
          /* loaderArguments */ CustomOptions[T], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.TransformOptions */ Any
        ]
    ): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setCustomOptions(
      value: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
          /* loaderOptions */ Record[String, Any], 
          /* loaderArguments */ Map, 
          js.Promise[Custom[T]]
        ]
    ): Self = StObject.set(x, "customOptions", value.asInstanceOf[js.Any])
    
    inline def setCustomOptionsUndefined: Self = StObject.set(x, "customOptions", js.undefined)
    
    inline def setResult(
      value: js.ThisFunction2[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_webpack.loader.LoaderContext */ /* this */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.BabelFileResult */ /* result */ Any, 
          /* context */ Configuration[T], 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_core.BabelFileResult */ Any
        ]
    ): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
  }
}
