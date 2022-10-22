package typingsJapgolly.wordpressBlocks

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.wordpressBlocks.mod.BlockIcon
import typingsJapgolly.wordpressBlocks.mod.BlockIconNormalized
import typingsJapgolly.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiUtilsMod {
  
  @JSImport("@wordpress/blocks/api/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isUnmodifiedDefaultBlock(block: BlockInstance[StringDictionary[Any]]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUnmodifiedDefaultBlock")(block.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isValidIcon(icon: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValidIcon")(icon.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def normalizeIconObject(): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")().asInstanceOf[BlockIconNormalized]
  inline def normalizeIconObject(icon: BlockIcon): BlockIconNormalized = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeIconObject")(icon.asInstanceOf[js.Any]).asInstanceOf[BlockIconNormalized]
}
