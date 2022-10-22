package typingsJapgolly.hastUtilToParse5

import typingsJapgolly.hastUtilToParse5.libMod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-to-parse5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toParse5(tree: Node): org.scalajs.dom.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any]).asInstanceOf[org.scalajs.dom.Node]
  inline def toParse5(tree: Node, space: typingsJapgolly.hastUtilToParse5.libMod.Space): org.scalajs.dom.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("toParse5")(tree.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[org.scalajs.dom.Node]
  
  type Space = typingsJapgolly.hastUtilToParse5.libMod.Space
}
