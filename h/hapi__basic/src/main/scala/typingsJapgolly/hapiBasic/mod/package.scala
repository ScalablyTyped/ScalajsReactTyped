package typingsJapgolly.hapiBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Validate = js.Function4[
    /* request */ typingsJapgolly.hapiHapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typingsJapgolly.hapiHapi.mod.ResponseToolkit, 
    js.Promise[
      typingsJapgolly.hapiBasic.mod.ValidateResponse | typingsJapgolly.hapiBasic.mod.ValidateCustomResponse
    ]
  ]
}
