package typingsJapgolly.mathjs.mod

import typingsJapgolly.mathjs.mathjsBooleans.`true`
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectNode
  extends StObject
     with MathNode {
  
  var isObjectNode: `true` = js.native
  
  var properties: Record[String, MathNode] = js.native
  
  @JSName("type")
  var type_ObjectNode: typingsJapgolly.mathjs.mathjsStrings.ObjectNode = js.native
}
