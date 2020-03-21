package typingsJapgolly.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object requestObjectsMod {
  type NumberRequest = scala.Double | js.Array[scala.Double] | typingsJapgolly.vexdb.requestObjectsMod.NumberRequestValidatorFunction
  type NumberRequestValidatorFunction = js.Function2[
    /* itemValue */ scala.Double, 
    /* item */ typingsJapgolly.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
  type StringRequest = java.lang.String | js.Array[java.lang.String] | js.RegExp | typingsJapgolly.vexdb.requestObjectsMod.StringRequestValidatorFunction
  type StringRequestValidatorFunction = js.Function2[
    /* itemValue */ java.lang.String, 
    /* item */ typingsJapgolly.vexdb.responseObjectsMod.ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]
}
