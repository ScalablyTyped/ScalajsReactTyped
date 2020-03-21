package typingsJapgolly.qtip2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QTip2 {
  type EventApiFunc = js.Function2[
    /* event */ typingsJapgolly.std.Event_, 
    /* api */ typingsJapgolly.qtip2.QTip2.Api, 
    scala.Unit
  ]
  type Target = typingsJapgolly.qtip2.JQuery | js.Array[scala.Double] | java.lang.String
  type Text = java.lang.String | typingsJapgolly.qtip2.JQuery | typingsJapgolly.qtip2.QTip2.EventApiFunc | scala.Boolean | typingsJapgolly.jquery.JQueryGenericPromise[js.Any]
  /**
  	 * Content property
  	 */
  type Title = java.lang.String | typingsJapgolly.qtip2.JQuery | typingsJapgolly.qtip2.QTip2.EventApiFunc | scala.Boolean | typingsJapgolly.jquery.JQueryGenericPromise[js.Any]
}
