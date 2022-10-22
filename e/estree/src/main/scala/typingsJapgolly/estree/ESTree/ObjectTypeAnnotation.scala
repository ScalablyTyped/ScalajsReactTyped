package typingsJapgolly.estree.ESTree

import typingsJapgolly.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectTypeAnnotation
  extends StObject
     with Node {
  
  var callProperties: js.Array[ObjectTypeCallProperty] = js.native
  
  var indexers: js.Array[ObjectTypeIndexer] = js.native
  
  var properties: js.Array[ObjectTypeProperty] = js.native
}
