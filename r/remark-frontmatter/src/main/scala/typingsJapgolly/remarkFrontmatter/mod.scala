package typingsJapgolly.remarkFrontmatter

import typingsJapgolly.unified.mod.Transformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("remark-frontmatter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: Unit): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  inline def default(options: typingsJapgolly.micromarkExtensionFrontmatter.mattersMod.Options): Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[Unit | (Transformer[typingsJapgolly.mdast.mod.Root, typingsJapgolly.mdast.mod.Root])]
  
  type Options = typingsJapgolly.micromarkExtensionFrontmatter.mod.Options
  
  type Root = typingsJapgolly.mdast.mod.Root
}
