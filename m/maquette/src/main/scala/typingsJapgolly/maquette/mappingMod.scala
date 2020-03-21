package typingsJapgolly.maquette

import typingsJapgolly.maquette.interfacesMod.Mapping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("maquette/dist/mapping", JSImport.Namespace)
@js.native
object mappingMod extends js.Object {
  var createMapping: js.Function3[
    /* getSourceKey */ js.Function1[/* source */ js.Any, String | Double], 
    /* createResult */ js.Function2[/* source */ js.Any, /* index */ Double, js.Any], 
    /* updateResult */ js.Function3[/* source */ js.Any, /* target */ js.Any, /* index */ Double, Unit], 
    Mapping[js.Any, js.Any]
  ] = js.native
}

