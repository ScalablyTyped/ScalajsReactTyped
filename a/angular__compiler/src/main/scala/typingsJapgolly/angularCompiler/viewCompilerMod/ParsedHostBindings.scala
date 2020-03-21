package typingsJapgolly.angularCompiler.viewCompilerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.angularCompiler.AnonClassAttr
import typingsJapgolly.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedHostBindings extends js.Object {
  var attributes: StringDictionary[Expression]
  var listeners: StringDictionary[String]
  var properties: StringDictionary[String]
  var specialAttributes: AnonClassAttr
}

object ParsedHostBindings {
  @scala.inline
  def apply(
    attributes: StringDictionary[Expression],
    listeners: StringDictionary[String],
    properties: StringDictionary[String],
    specialAttributes: AnonClassAttr
  ): ParsedHostBindings = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], specialAttributes = specialAttributes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParsedHostBindings]
  }
}

