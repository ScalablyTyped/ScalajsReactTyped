package typingsJapgolly.steamClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SendMessage = js.Function3[
    /* header */ typingsJapgolly.steamClient.AnonMsg, 
    /* body */ typingsJapgolly.node.Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | typingsJapgolly.steamClient.steamClientBooleans.`false`
    ], 
    scala.Unit
  ]
}
