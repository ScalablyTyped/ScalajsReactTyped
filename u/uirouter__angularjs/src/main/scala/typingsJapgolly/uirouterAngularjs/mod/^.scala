package typingsJapgolly.uirouterAngularjs.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.uirouterCore.commonCommonMod.Mapper
import typingsJapgolly.uirouterCore.resolveInterfaceMod.ResolvePolicy
import typingsJapgolly.uirouterCore.transitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultResolvePolicy: ResolvePolicy = js.native
  var defaultTransOpts: TransitionOptions = js.native
  var mapObj: js.Function3[
    /* collection */ StringDictionary[js.Any], 
    /* callback */ Mapper[js.Any, js.Any], 
    /* target */ js.UndefOr[
      /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof collection */ js.Any
    ], 
    StringDictionary[js.Any]
  ] = js.native
}

