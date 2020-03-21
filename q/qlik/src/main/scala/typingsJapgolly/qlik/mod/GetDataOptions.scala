package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.N
import typingsJapgolly.qlik.qlikStrings.P
import typingsJapgolly.qlik.qlikStrings.R
import typingsJapgolly.qlik.qlikStrings.V
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDataOptions extends js.Object {
  var frequencyMode: V | P | R | N
  var rows: Double
}

object GetDataOptions {
  @scala.inline
  def apply(frequencyMode: V | P | R | N, rows: Double): GetDataOptions = {
    val __obj = js.Dynamic.literal(frequencyMode = frequencyMode.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDataOptions]
  }
}

