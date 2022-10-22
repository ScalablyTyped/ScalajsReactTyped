package typingsJapgolly.nextSeo

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.nextSeo.libTypesMod.BuildTagsParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMetaBuildTagsMod {
  
  @JSImport("next-seo/lib/meta/buildTags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(config: BuildTagsParams): js.Array[Node] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(config.asInstanceOf[js.Any]).asInstanceOf[js.Array[Node]]
}
