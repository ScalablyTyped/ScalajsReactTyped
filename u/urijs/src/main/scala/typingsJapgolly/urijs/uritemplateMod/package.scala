package typingsJapgolly.urijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object uritemplateMod {
  type URITemplateCallback = js.Function1[
    /* keyName */ java.lang.String, 
    typingsJapgolly.urijs.uritemplateMod.URITemplateValue
  ]
  type URITemplateInput = (org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.urijs.uritemplateMod.URITemplateValue | typingsJapgolly.urijs.uritemplateMod.URITemplateCallback
  ]) | typingsJapgolly.urijs.uritemplateMod.URITemplateCallback
  type URITemplateLiteral = java.lang.String
  type URITemplatePart = typingsJapgolly.urijs.uritemplateMod.URITemplateLiteral | typingsJapgolly.urijs.uritemplateMod.URITemplateExpression
  type URITemplateValue = js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  ]
}
