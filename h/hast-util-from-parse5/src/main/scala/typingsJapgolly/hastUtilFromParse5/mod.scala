package typingsJapgolly.hastUtilFromParse5

import org.scalajs.dom.Node
import typingsJapgolly.vfile.mod.VFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("hast-util-from-parse5", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromParse5(ast: Node): typingsJapgolly.hastUtilFromParse5.libMod.Node = ^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.hastUtilFromParse5.libMod.Node]
  inline def fromParse5(ast: Node, options: typingsJapgolly.hastUtilFromParse5.libMod.Options): typingsJapgolly.hastUtilFromParse5.libMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hastUtilFromParse5.libMod.Node]
  inline def fromParse5(ast: Node, options: VFile): typingsJapgolly.hastUtilFromParse5.libMod.Node = (^.asInstanceOf[js.Dynamic].applyDynamic("fromParse5")(ast.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.hastUtilFromParse5.libMod.Node]
  
  type Options = typingsJapgolly.hastUtilFromParse5.libMod.Options
}
