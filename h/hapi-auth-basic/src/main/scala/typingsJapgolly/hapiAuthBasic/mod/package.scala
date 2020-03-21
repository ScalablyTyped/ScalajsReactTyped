package typingsJapgolly.hapiAuthBasic

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Validate = js.Function4[
    /* request */ typingsJapgolly.hapi.mod.Request, 
    /* username */ java.lang.String, 
    /* password */ java.lang.String, 
    /* h */ typingsJapgolly.hapi.mod.ResponseToolkit, 
    js.Promise[
      typingsJapgolly.hapiAuthBasic.mod.ValidateResponse | typingsJapgolly.hapiAuthBasic.mod.ValidateCustomResponse
    ]
  ]
}
