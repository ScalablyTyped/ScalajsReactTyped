package typingsJapgolly.awsRegions.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsRegions.mod.LookupOptionsCode
  - typingsJapgolly.awsRegions.mod.LookupOptionsName
*/
trait LookupOptions extends js.Object

object LookupOptions {
  @scala.inline
  def LookupOptionsCode(code: String): LookupOptions = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupOptions]
  }
  @scala.inline
  def LookupOptionsName(name: String): LookupOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[LookupOptions]
  }
}

