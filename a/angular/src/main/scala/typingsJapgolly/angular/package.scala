package typingsJapgolly

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object angular {
  type JQLiteCssProperties = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | typingsJapgolly.angular.cssPropertySetter]
  type JQueryStatic = js.Function1[
    /* element */ java.lang.String | org.scalajs.dom.raw.Element | typingsJapgolly.std.Document_ | typingsJapgolly.std.Window_ | typingsJapgolly.angular.JQuery | typingsJapgolly.std.ArrayLike[org.scalajs.dom.raw.Element] | js.Function0[scala.Unit], 
    typingsJapgolly.angular.JQLite
  ]
  /**
    * The interface used to specify the properties parameter in css()
    */
  // tslint:disable-next-line:class-name
  type cssPropertySetter = js.Function2[
    /* index */ scala.Double, 
    /* value */ js.UndefOr[java.lang.String], 
    java.lang.String | scala.Double
  ]
}
