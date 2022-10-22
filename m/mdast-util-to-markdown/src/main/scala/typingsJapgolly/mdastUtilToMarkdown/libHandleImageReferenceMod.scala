package typingsJapgolly.mdastUtilToMarkdown

import typingsJapgolly.mdast.mod.ImageReference
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Context
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Parent
import typingsJapgolly.mdastUtilToMarkdown.libTypesMod.SafeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHandleImageReferenceMod {
  
  @JSImport("mdast-util-to-markdown/lib/handle/image-reference", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def imageReference(node: ImageReference_, _underscore: Null, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageReference")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageReference(node: ImageReference_, _underscore: Unit, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageReference")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageReference(node: ImageReference_, _underscore: Parent, context: Context, safeOptions: SafeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageReference")(node.asInstanceOf[js.Any], _underscore.asInstanceOf[js.Any], context.asInstanceOf[js.Any], safeOptions.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type Handle = typingsJapgolly.mdastUtilToMarkdown.libTypesMod.Handle
  
  type ImageReference_ = ImageReference
}
