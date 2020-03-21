package typingsJapgolly.enhancedResolve

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object commonTypesMod {
  type CommonFileSystemMethod = js.Function2[
    /* name */ java.lang.String, 
    /* callback */ js.Function2[
      /* err */ typingsJapgolly.node.NodeJS.ErrnoException | scala.Null, 
      /* repeated */ js.Any, 
      scala.Unit
    ], 
    scala.Unit
  ]
  type ErrorCallback[T] = js.Function2[/* err */ T | scala.Null, /* repeated */ js.Any, js.Any]
}
