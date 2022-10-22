package typingsJapgolly.wordpressBlocks

import typingsJapgolly.std.Record
import typingsJapgolly.wordpressBlocks.mod.Block
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiValidationMod {
  
  @JSImport("@wordpress/blocks/api/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: String, attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isValidBlockContent[T /* <: Record[String, Any] */](blockTypeOrName: Block[T], attributes: T, originalBlockContent: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValidBlockContent")(blockTypeOrName.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any], originalBlockContent.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
