package typingsJapgolly.unsplashJs

import typingsJapgolly.std.Record
import typingsJapgolly.unsplashJs.anon.Collections
import typingsJapgolly.unsplashJs.anon.CollectionsUndefined
import typingsJapgolly.unsplashJs.anon.Topics
import typingsJapgolly.unsplashJs.anon.TopicsUndefined
import typingsJapgolly.unsplashJs.distTypesRequestMod.OrderBy
import typingsJapgolly.unsplashJs.distTypesRequestMod.PaginationParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHelpersQueryMod {
  
  @JSImport("unsplash-js/dist/helpers/query", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCollections(): Collections | CollectionsUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollections")().asInstanceOf[Collections | CollectionsUndefined]
  inline def getCollections(collectionIds: js.Array[String]): Collections | CollectionsUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getCollections")(collectionIds.asInstanceOf[js.Any]).asInstanceOf[Collections | CollectionsUndefined]
  
  inline def getFeedParams(hasPagePerPageOrderBy: PaginationParams): Record[String, Double | OrderBy] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFeedParams")(hasPagePerPageOrderBy.asInstanceOf[js.Any]).asInstanceOf[Record[String, Double | OrderBy]]
  
  inline def getTopics(): Topics | TopicsUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopics")().asInstanceOf[Topics | TopicsUndefined]
  inline def getTopics(topicIds: js.Array[String]): Topics | TopicsUndefined = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopics")(topicIds.asInstanceOf[js.Any]).asInstanceOf[Topics | TopicsUndefined]
}
