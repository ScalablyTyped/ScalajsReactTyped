package typingsJapgolly.uuid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interfacesMod {
  type InputBuffer = typingsJapgolly.std.ArrayLike[scala.Double]
  type OutputBuffer = typingsJapgolly.std.ArrayLike[scala.Double]
  type v1 = typingsJapgolly.uuid.interfacesMod.v1Buffer with typingsJapgolly.uuid.interfacesMod.v1String
  type v1Buffer = js.Function3[
    /* options */ js.UndefOr[typingsJapgolly.uuid.interfacesMod.V1Options | scala.Null], 
    /* buffer */ typingsJapgolly.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsJapgolly.uuid.interfacesMod.OutputBuffer
  ]
  type v1String = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.uuid.interfacesMod.V1Options], 
    java.lang.String
  ]
  type v3 = typingsJapgolly.uuid.interfacesMod.v3Buffer with typingsJapgolly.uuid.interfacesMod.v3String with typingsJapgolly.uuid.interfacesMod.v3Static
  type v3Buffer = js.Function4[
    /* name */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typingsJapgolly.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsJapgolly.uuid.interfacesMod.OutputBuffer
  ]
  type v3String = js.Function2[
    /* name */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
  type v4 = typingsJapgolly.uuid.interfacesMod.v4Buffer with typingsJapgolly.uuid.interfacesMod.v4String
  type v4Buffer = js.Function3[
    /* options */ js.UndefOr[typingsJapgolly.uuid.interfacesMod.V4Options | scala.Null], 
    /* buffer */ typingsJapgolly.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsJapgolly.uuid.interfacesMod.OutputBuffer
  ]
  type v4String = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.uuid.interfacesMod.V4Options], 
    java.lang.String
  ]
  type v5 = typingsJapgolly.uuid.interfacesMod.v5Buffer with typingsJapgolly.uuid.interfacesMod.v5String with typingsJapgolly.uuid.interfacesMod.v5Static
  type v5Buffer = js.Function4[
    /* name */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* buffer */ typingsJapgolly.uuid.interfacesMod.OutputBuffer, 
    /* offset */ js.UndefOr[scala.Double], 
    typingsJapgolly.uuid.interfacesMod.OutputBuffer
  ]
  type v5String = js.Function2[
    /* name */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    /* namespace */ java.lang.String | typingsJapgolly.uuid.interfacesMod.InputBuffer, 
    java.lang.String
  ]
}
