package typingsJapgolly.ngreact

import japgolly.scalajs.react.raw.React.ComponentClassP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ngreact", JSImport.Namespace)
@js.native
object mod extends js.Object {
  type ReactDirective = js.Function4[
    /* reactComponentName */ String | (ComponentClassP[js.Any with js.Object]), 
    /* propNames */ js.UndefOr[js.Array[String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IDirective */ js.Any
  ]
}

