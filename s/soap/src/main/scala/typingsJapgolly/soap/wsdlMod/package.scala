package typingsJapgolly.soap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object wsdlMod {
  type WSDLCallback = js.Function2[
    /* error */ js.Any, 
    /* result */ js.UndefOr[typingsJapgolly.soap.wsdlMod.WSDL], 
    js.Any
  ]
}
