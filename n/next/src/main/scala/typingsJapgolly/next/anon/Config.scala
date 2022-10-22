package typingsJapgolly.next.anon

import typingsJapgolly.next.typesMod.GetStaticPaths
import typingsJapgolly.next.typesMod.GetStaticPathsContext
import typingsJapgolly.next.typesMod.GetStaticPathsResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  var config: typingsJapgolly.next.distBuildUtilsMod.AppConfig
  
  var generateStaticParams: js.UndefOr[Any] = js.undefined
  
  var getStaticPaths: js.UndefOr[
    GetStaticPaths[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
    ]
  ] = js.undefined
  
  var isLayout: js.UndefOr[Boolean] = js.undefined
  
  var segmentPath: String
}
object Config {
  
  inline def apply(config: typingsJapgolly.next.distBuildUtilsMod.AppConfig, segmentPath: String): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], segmentPath = segmentPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setConfig(value: typingsJapgolly.next.distBuildUtilsMod.AppConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setGenerateStaticParams(value: Any): Self = StObject.set(x, "generateStaticParams", value.asInstanceOf[js.Any])
    
    inline def setGenerateStaticParamsUndefined: Self = StObject.set(x, "generateStaticParams", js.undefined)
    
    inline def setGetStaticPaths(
      value: /* context */ GetStaticPathsContext => (js.Promise[
          GetStaticPathsResult[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
          ]
        ]) | (GetStaticPathsResult[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ParsedUrlQuery */ Any
        ])
    ): Self = StObject.set(x, "getStaticPaths", js.Any.fromFunction1(value))
    
    inline def setGetStaticPathsUndefined: Self = StObject.set(x, "getStaticPaths", js.undefined)
    
    inline def setIsLayout(value: Boolean): Self = StObject.set(x, "isLayout", value.asInstanceOf[js.Any])
    
    inline def setIsLayoutUndefined: Self = StObject.set(x, "isLayout", js.undefined)
    
    inline def setSegmentPath(value: String): Self = StObject.set(x, "segmentPath", value.asInstanceOf[js.Any])
  }
}
