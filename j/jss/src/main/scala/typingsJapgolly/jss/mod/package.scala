package typingsJapgolly.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Classes[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsJapgolly.std.Record[Name, java.lang.String]
  type CreateGenerateId_ = js.Function1[
    /* options */ js.UndefOr[typingsJapgolly.jss.mod.CreateGenerateIdOptions], 
    typingsJapgolly.jss.mod.GenerateId
  ]
  // TODO: Type data better, currently typed as any for allowing to override it
  type FnValue[R] = R | (js.Function1[/* data */ js.Any, R])
  type GenerateId = js.Function2[
    /* rule */ typingsJapgolly.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typingsJapgolly.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  type InsertionPoint = java.lang.String | org.scalajs.dom.raw.HTMLElement
  type JssValue = java.lang.String | scala.Double | (js.Array[
    java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typingsJapgolly.jss.jssStrings.Exclamationmarkimportant
  ]) | scala.Null | typingsJapgolly.jss.jssBooleans.`false`
  type Keyframes[Name /* <: java.lang.String */] = typingsJapgolly.std.Record[Name, java.lang.String]
  type NormalCssProperties = typingsJapgolly.csstype.mod.Properties[java.lang.String | scala.Double]
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typingsJapgolly.std.Record[Name, typingsJapgolly.jss.mod.JssStyle | java.lang.String]
}
