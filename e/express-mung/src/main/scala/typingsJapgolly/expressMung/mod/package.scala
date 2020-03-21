package typingsJapgolly.expressMung

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Transform = js.Function3[
    /* body */ js.Object, 
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    js.Any
  ]
  type TransformAsync = js.Function3[
    /* body */ js.Object, 
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    js.Thenable[js.Any]
  ]
  type TransformChunk = js.Function4[
    /* chunk */ java.lang.String | typingsJapgolly.node.Buffer, 
    /* encoding */ java.lang.String | scala.Null, 
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    java.lang.String | typingsJapgolly.node.Buffer
  ]
  type TransformHeader = js.Function2[
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    js.Any
  ]
  type TransformHeaderAsync = js.Function2[
    /* request */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], 
    /* response */ typingsJapgolly.express.mod.Response_, 
    js.Thenable[js.Any]
  ]
}
