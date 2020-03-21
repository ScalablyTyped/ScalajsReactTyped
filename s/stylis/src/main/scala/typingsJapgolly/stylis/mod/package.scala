package typingsJapgolly.stylis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Plugin = js.ThisFunction9[
    /* this */ typingsJapgolly.stylis.mod.Stylis, 
    /* context */ typingsJapgolly.stylis.mod.Context, 
    /* content */ java.lang.String, 
    /* selector */ typingsJapgolly.stylis.mod.Selectors, 
    /* parent */ typingsJapgolly.stylis.mod.Selectors, 
    /* line */ scala.Double, 
    /* column */ scala.Double, 
    /* length */ scala.Double, 
    /* at */ scala.Double, 
    /* depth */ scala.Double, 
    js.Any
  ]
  type Selectors = js.Array[java.lang.String]
}
