package typingsJapgolly.wonderJs.mod

import typingsJapgolly.wonderJs.cloneMod.CloneAttributeAsCustomTypeConfigData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015", "cloneAttributeAsCustomType")
@js.native
object cloneAttributeAsCustomType extends js.Object {
  def apply(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ]
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
  def apply(
    cloneFunc: js.Function4[
      /* source */ js.Any, 
      /* target */ js.Any, 
      /* memberName */ String, 
      /* cloneData */ js.Any, 
      Unit
    ],
    configData: CloneAttributeAsCustomTypeConfigData
  ): js.Function2[/* target */ js.Any, /* memberName */ String | js.Symbol, Unit] = js.native
}

