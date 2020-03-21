package typingsJapgolly.angularMaterial.mod.angularAugmentingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object material {
  type IColorExpression = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type IIcon = js.Function1[
    /* id */ java.lang.String, 
    typingsJapgolly.angular.mod.IPromise[org.scalajs.dom.raw.Element]
  ]
  type IMedia = js.Function1[/* media */ java.lang.String, scala.Boolean]
  type IStickyService = js.Function3[
    /* scope */ typingsJapgolly.angular.mod.IScope, 
    /* element */ typingsJapgolly.angular.JQuery, 
    /* elementClone */ js.UndefOr[typingsJapgolly.angular.JQuery], 
    scala.Unit
  ]
  type ResolveObject = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.angular.mod.Injectable[js.Function1[/* repeated */ js.Any, js.Thenable[js.Any]]]
  ]
}
